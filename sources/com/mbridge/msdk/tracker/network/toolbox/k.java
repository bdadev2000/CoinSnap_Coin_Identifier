package com.mbridge.msdk.tracker.network.toolbox;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.thrid.okhttp.ConnectionPool;
import com.mbridge.msdk.thrid.okhttp.Dispatcher;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class k extends a {

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f18248a;

    public k() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Dispatcher dispatcher = new Dispatcher(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false)));
        dispatcher.setMaxRequestsPerHost(50);
        dispatcher.setMaxRequests(NotificationCompat.FLAG_LOCAL_ONLY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(30L, timeUnit);
        builder.connectTimeout(30L, timeUnit);
        builder.writeTimeout(30L, timeUnit);
        builder.retryOnConnectionFailure(true);
        builder.connectionPool(new ConnectionPool(32, 5L, TimeUnit.MINUTES));
        builder.dispatcher(dispatcher);
        this.f18248a = builder.build();
    }

    private static RequestBody a(u uVar) {
        byte[] p2;
        if (uVar == null || (p2 = uVar.p()) == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, p2);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public final g a(u<?> uVar, Map<String, String> map) throws IOException {
        q z8 = uVar.z();
        if (this.f18248a != null) {
            int u8 = uVar.u() <= 0 ? 30000 : uVar.u();
            long v6 = uVar.v();
            String a6 = uVar.i() == 0 ? d.a(uVar.k(), uVar) : uVar.k();
            if (z8 != null) {
                z8.a(a6);
                long j7 = u8;
                z8.b(j7);
                z8.c(j7);
                z8.d(j7);
                z8.j(uVar.g());
            }
            if (z8 != null) {
                try {
                    z8.i(uVar.q());
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Protocol.HTTP_1_1);
            arrayList.add(Protocol.HTTP_2);
            OkHttpClient.Builder protocols = this.f18248a.newBuilder().protocols(arrayList);
            long j9 = u8;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder callTimeout = protocols.readTimeout(j9, timeUnit).connectTimeout(j9, timeUnit).writeTimeout(j9, timeUnit).callTimeout(Math.max(v6, 0L), timeUnit);
            if (z8 != null && callTimeout != null) {
                try {
                    callTimeout.eventListener(new OKHTTPEventListener(z8));
                } catch (Exception unused2) {
                }
            }
            Request.Builder builder = new Request.Builder();
            for (Map.Entry<String, String> entry : uVar.c().entrySet()) {
                builder.addHeader(entry.getKey(), entry.getValue());
            }
            builder.addHeader("Connection", "close");
            switch (uVar.i()) {
                case 0:
                    builder.get();
                    break;
                case 1:
                    RequestBody a9 = a(uVar);
                    if (a9 != null) {
                        builder.post(a9);
                        break;
                    } else {
                        throw new IOException("can't create request body for post");
                    }
                case 2:
                    RequestBody a10 = a(uVar);
                    if (a10 != null) {
                        builder.put(a10);
                        break;
                    } else {
                        throw new IOException("can't create request body for put");
                    }
                case 3:
                    builder.delete();
                    break;
                case 4:
                    builder.head();
                    break;
                case 5:
                    builder.method("OPTIONS", null);
                    break;
                case 6:
                    builder.method("TRACE", null);
                    break;
                case 7:
                    RequestBody a11 = a(uVar);
                    if (a11 != null) {
                        builder.patch(a11);
                        break;
                    } else {
                        throw new IOException("can't create request body for patch");
                    }
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            Response execute = callTimeout.build().newCall(builder.url(a6).build()).execute();
            Headers headers = execute.headers();
            ArrayList arrayList2 = new ArrayList();
            int size = headers.size();
            for (int i9 = 0; i9 < size; i9++) {
                String name = headers.name(i9);
                String value = headers.value(i9);
                if (name != null) {
                    arrayList2.add(new com.mbridge.msdk.tracker.network.h(name, value));
                }
            }
            ResponseBody body = execute.body();
            if (body == null) {
                return new g(execute.code(), arrayList2);
            }
            return new g(execute.code(), arrayList2, body.contentLength() > 2147483647L ? -1 : (int) body.contentLength(), body.byteStream());
        }
        throw new IOException("okhttp client is null");
    }
}
