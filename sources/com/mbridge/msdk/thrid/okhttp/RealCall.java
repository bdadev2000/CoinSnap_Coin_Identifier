package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.cache.CacheInterceptor;
import com.mbridge.msdk.thrid.okhttp.internal.connection.ConnectInterceptor;
import com.mbridge.msdk.thrid.okhttp.internal.connection.StreamAllocation;
import com.mbridge.msdk.thrid.okhttp.internal.http.BridgeInterceptor;
import com.mbridge.msdk.thrid.okhttp.internal.http.CallServerInterceptor;
import com.mbridge.msdk.thrid.okhttp.internal.http.RealInterceptorChain;
import com.mbridge.msdk.thrid.okhttp.internal.http.RetryAndFollowUpInterceptor;
import com.mbridge.msdk.thrid.okhttp.internal.platform.Platform;
import com.mbridge.msdk.thrid.okio.AsyncTimeout;
import com.mbridge.msdk.thrid.okio.Timeout;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class RealCall implements Call {
    final OkHttpClient client;
    private EventListener eventListener;
    private boolean executed;
    final boolean forWebSocket;
    final Request originalRequest;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    final AsyncTimeout timeout;

    /* loaded from: classes4.dex */
    public final class AsyncCall extends NamedRunnable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final Callback responseCallback;

        public AsyncCall(Callback callback) {
            super("OkHttp %s", RealCall.this.redactedUrl());
            this.responseCallback = callback;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.NamedRunnable
        public void execute() {
            RealCall.this.timeout.enter();
            boolean z10 = false;
            try {
                try {
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.responseCallback.onResponse(RealCall.this, RealCall.this.getResponseWithInterceptorChain());
                } catch (IOException e10) {
                    e = e10;
                    z10 = true;
                    IOException timeoutExit = RealCall.this.timeoutExit(e);
                    if (z10) {
                        Platform.get().log(4, "Callback failure for " + RealCall.this.toLoggableString(), timeoutExit);
                    } else {
                        RealCall.this.eventListener.callFailed(RealCall.this, timeoutExit);
                        this.responseCallback.onFailure(RealCall.this, timeoutExit);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                    RealCall.this.cancel();
                    if (!z10) {
                        this.responseCallback.onFailure(RealCall.this, new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } finally {
                RealCall.this.client.dispatcher().finished(this);
            }
        }

        public void executeOn(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    RealCall.this.eventListener.callFailed(RealCall.this, interruptedIOException);
                    this.responseCallback.onFailure(RealCall.this, interruptedIOException);
                    RealCall.this.client.dispatcher().finished(this);
                }
            } catch (Throwable th2) {
                RealCall.this.client.dispatcher().finished(this);
                throw th2;
            }
        }

        public RealCall get() {
            return RealCall.this;
        }

        public String host() {
            return RealCall.this.originalRequest.url().host();
        }

        public Request request() {
            return RealCall.this.originalRequest;
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z10;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(okHttpClient, z10);
        AsyncTimeout asyncTimeout = new AsyncTimeout() { // from class: com.mbridge.msdk.thrid.okhttp.RealCall.1
            @Override // com.mbridge.msdk.thrid.okio.AsyncTimeout
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        this.timeout = asyncTimeout;
        asyncTimeout.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    private void captureCallStackTrace() {
        this.retryAndFollowUpInterceptor.setCallStackTrace(Platform.get().getStackTraceForCloseable("response.body().close()"));
    }

    public static RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z10) {
        RealCall realCall = new RealCall(okHttpClient, request, z10);
        realCall.eventListener = okHttpClient.eventListenerFactory().create(realCall);
        return realCall;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public void cancel() {
        this.retryAndFollowUpInterceptor.cancel();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.eventListener.callStart(this);
        this.client.dispatcher().enqueue(new AsyncCall(callback));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public Response execute() throws IOException {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        captureCallStackTrace();
        this.timeout.enter();
        this.eventListener.callStart(this);
        try {
            try {
                this.client.dispatcher().executed(this);
                Response responseWithInterceptorChain = getResponseWithInterceptorChain();
                if (responseWithInterceptorChain != null) {
                    return responseWithInterceptorChain;
                }
                throw new IOException("Canceled");
            } catch (IOException e2) {
                IOException timeoutExit = timeoutExit(e2);
                this.eventListener.callFailed(this, timeoutExit);
                throw timeoutExit;
            }
        } finally {
            this.client.dispatcher().finished(this);
        }
    }

    public Response getResponseWithInterceptorChain() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.client.interceptors());
        arrayList.add(this.retryAndFollowUpInterceptor);
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.internalCache()));
        arrayList.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            arrayList.addAll(this.client.networkInterceptors());
        }
        arrayList.add(new CallServerInterceptor(this.forWebSocket));
        Response proceed = new RealInterceptorChain(arrayList, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
        if (!this.retryAndFollowUpInterceptor.isCanceled()) {
            return proceed;
        }
        Util.closeQuietly(proceed);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public Request request() {
        return this.originalRequest;
    }

    public StreamAllocation streamAllocation() {
        return this.retryAndFollowUpInterceptor.streamAllocation();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    public Timeout timeout() {
        return this.timeout;
    }

    public IOException timeoutExit(IOException iOException) {
        if (!this.timeout.exit()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (isCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = NotificationCompat.CATEGORY_CALL;
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(redactedUrl());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.Call
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RealCall m6clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
