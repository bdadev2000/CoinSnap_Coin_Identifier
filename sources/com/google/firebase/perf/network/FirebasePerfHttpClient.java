package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import b5.e;
import com.mbridge.msdk.foundation.entity.o;
import d5.f;
import d5.h;
import g5.C2303f;
import h5.i;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpUriRequest.getURI().toString());
            d2.e(httpUriRequest.getMethod());
            Long a6 = h.a(httpUriRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            d2.k(iVar.c());
            d2.f(execute.getStatusLine().getStatusCode());
            Long a9 = h.a(execute);
            if (a9 != null) {
                d2.j(a9.longValue());
            }
            String b = h.b(execute);
            if (b != null) {
                d2.i(b);
            }
            d2.c();
            return execute;
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpUriRequest.getURI().toString());
            d2.e(httpUriRequest.getMethod());
            Long a6 = h.a(httpUriRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            d2.k(iVar.c());
            d2.f(execute.getStatusLine().getStatusCode());
            Long a9 = h.a(execute);
            if (a9 != null) {
                d2.j(a9.longValue());
            }
            String b = h.b(execute);
            if (b != null) {
                d2.i(b);
            }
            d2.c();
            return execute;
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpUriRequest.getURI().toString());
            d2.e(httpUriRequest.getMethod());
            Long a6 = h.a(httpUriRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, iVar, d2));
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpUriRequest.getURI().toString());
            d2.e(httpUriRequest.getMethod());
            Long a6 = h.a(httpUriRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, iVar, d2), httpContext);
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d2.e(httpRequest.getRequestLine().getMethod());
            Long a6 = h.a(httpRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            d2.k(iVar.c());
            d2.f(execute.getStatusLine().getStatusCode());
            Long a9 = h.a(execute);
            if (a9 != null) {
                d2.j(a9.longValue());
            }
            String b = h.b(execute);
            if (b != null) {
                d2.i(b);
            }
            d2.c();
            return execute;
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d2.e(httpRequest.getRequestLine().getMethod());
            Long a6 = h.a(httpRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            d2.k(iVar.c());
            d2.f(execute.getStatusLine().getStatusCode());
            Long a9 = h.a(execute);
            if (a9 != null) {
                d2.j(a9.longValue());
            }
            String b = h.b(execute);
            if (b != null) {
                d2.i(b);
            }
            d2.c();
            return execute;
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d2.e(httpRequest.getRequestLine().getMethod());
            Long a6 = h.a(httpRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, iVar, d2));
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        i iVar = new i();
        e d2 = e.d(C2303f.f20472u);
        try {
            d2.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d2.e(httpRequest.getRequestLine().getMethod());
            Long a6 = h.a(httpRequest);
            if (a6 != null) {
                d2.g(a6.longValue());
            }
            iVar.f();
            d2.h(iVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, iVar, d2), httpContext);
        } catch (IOException e4) {
            o.u(iVar, d2, d2);
            throw e4;
        }
    }
}
