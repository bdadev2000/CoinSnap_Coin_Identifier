package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.Address;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.CertificatePinner;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.HttpUrl;
import com.mbridge.msdk.thrid.okhttp.Interceptor;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.Route;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.connection.RouteException;
import com.mbridge.msdk.thrid.okhttp.internal.connection.StreamAllocation;
import com.mbridge.msdk.thrid.okhttp.internal.http2.ConnectionShutdownException;
import eb.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private final boolean forWebSocket;
    private volatile StreamAllocation streamAllocation;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z10) {
        this.client = okHttpClient;
        this.forWebSocket = z10;
    }

    private Address createAddress(HttpUrl httpUrl) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (httpUrl.isHttps()) {
            sSLSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    private Request followUpRequest(Response response, Route route) throws IOException {
        String header;
        HttpUrl resolve;
        if (response != null) {
            int code = response.code();
            String method = response.request().method();
            RequestBody requestBody = null;
            if (code != 307 && code != 308) {
                if (code != 401) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure() || (response.request().body() instanceof UnrepeatableRequestBody)) {
                                    return null;
                                }
                                if ((response.priorResponse() != null && response.priorResponse().code() == 408) || retryAfter(response, 0) > 0) {
                                    return null;
                                }
                                return response.request();
                            }
                        } else {
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, response);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        if ((response.priorResponse() != null && response.priorResponse().code() == 503) || retryAfter(response, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return response.request();
                    }
                } else {
                    return this.client.authenticator().authenticate(route, response);
                }
            } else if (!method.equals("GET") && !method.equals("HEAD")) {
                return null;
            }
            if (!this.client.followRedirects() || (header = response.header("Location")) == null || (resolve = response.request().url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(response.request().url().scheme()) && !this.client.followSslRedirects()) {
                return null;
            }
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                boolean redirectsWithBody = HttpMethod.redirectsWithBody(method);
                if (HttpMethod.redirectsToGet(method)) {
                    newBuilder.method("GET", null);
                } else {
                    if (redirectsWithBody) {
                        requestBody = response.request().body();
                    }
                    newBuilder.method(method, requestBody);
                }
                if (!redirectsWithBody) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!sameConnection(response, resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    private boolean isRecoverable(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z10) {
                return false;
            }
            return true;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private boolean recover(IOException iOException, StreamAllocation streamAllocation, boolean z10, Request request) {
        streamAllocation.streamFailed(iOException);
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((z10 && requestIsUnrepeatable(iOException, request)) || !isRecoverable(iOException, z10) || !streamAllocation.hasMoreRoutes()) {
            return false;
        }
        return true;
    }

    private boolean requestIsUnrepeatable(IOException iOException, Request request) {
        return (request.body() instanceof UnrepeatableRequestBody) || (iOException instanceof FileNotFoundException);
    }

    private int retryAfter(Response response, int i10) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i10;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean sameConnection(Response response, HttpUrl httpUrl) {
        HttpUrl url = response.request().url();
        if (url.host().equals(httpUrl.host()) && url.port() == httpUrl.port() && url.scheme().equals(httpUrl.scheme())) {
            return true;
        }
        return false;
    }

    public void cancel() {
        this.canceled = true;
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation != null) {
            streamAllocation.cancel();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z10;
        Response proceed;
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener();
        StreamAllocation streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
        this.streamAllocation = streamAllocation;
        int i10 = 0;
        Response response = null;
        while (!this.canceled) {
            try {
                try {
                    proceed = realInterceptorChain.proceed(request, streamAllocation, null, null);
                    if (response != null) {
                        proceed = proceed.newBuilder().priorResponse(response.newBuilder().body(null).build()).build();
                    }
                } catch (RouteException e2) {
                    if (!recover(e2.getLastConnectException(), streamAllocation, false, request)) {
                        throw e2.getFirstConnectException();
                    }
                } catch (IOException e10) {
                    if (!(e10 instanceof ConnectionShutdownException)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!recover(e10, streamAllocation, z10, request)) {
                        throw e10;
                    }
                }
                try {
                    Request followUpRequest = followUpRequest(proceed, streamAllocation.route());
                    if (followUpRequest == null) {
                        streamAllocation.release();
                        return proceed;
                    }
                    Util.closeQuietly(proceed.body());
                    int i11 = i10 + 1;
                    if (i11 <= 20) {
                        if (!(followUpRequest.body() instanceof UnrepeatableRequestBody)) {
                            if (!sameConnection(proceed, followUpRequest.url())) {
                                streamAllocation.release();
                                streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(followUpRequest.url()), call, eventListener, this.callStackTrace);
                                this.streamAllocation = streamAllocation;
                            } else if (streamAllocation.codec() != null) {
                                throw new IllegalStateException("Closing the body of " + proceed + " didn't close its backing stream. Bad interceptor?");
                            }
                            response = proceed;
                            request = followUpRequest;
                            i10 = i11;
                        } else {
                            streamAllocation.release();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", proceed.code());
                        }
                    } else {
                        streamAllocation.release();
                        throw new ProtocolException(j.i("Too many follow-up requests: ", i11));
                    }
                } catch (IOException e11) {
                    streamAllocation.release();
                    throw e11;
                }
            } catch (Throwable th2) {
                streamAllocation.streamFailed(null);
                streamAllocation.release();
                throw th2;
            }
        }
        streamAllocation.release();
        throw new IOException("Canceled");
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public void setCallStackTrace(Object obj) {
        this.callStackTrace = obj;
    }

    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }
}
