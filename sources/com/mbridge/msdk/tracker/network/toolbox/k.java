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

/* loaded from: classes4.dex */
public final class k extends a {
    private final OkHttpClient a;

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
        this.a = builder.build();
    }

    private static RequestBody a(u uVar) {
        byte[] p10;
        if (uVar == null || (p10 = uVar.p()) == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, p10);
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public final g a(u<?> uVar, Map<String, String> map) throws IOException {
        q z10 = uVar.z();
        if (this.a != null) {
            int u = uVar.u() <= 0 ? 30000 : uVar.u();
            long v10 = uVar.v();
            String a = uVar.i() == 0 ? d.a(uVar.k(), uVar) : uVar.k();
            if (z10 != null) {
                z10.a(a);
                long j3 = u;
                z10.b(j3);
                z10.c(j3);
                z10.d(j3);
                z10.j(uVar.g());
            }
            if (z10 != null) {
                try {
                    z10.i(uVar.q());
                } catch (Exception unused) {
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Protocol.HTTP_1_1);
            arrayList.add(Protocol.HTTP_2);
            OkHttpClient.Builder protocols = this.a.newBuilder().protocols(arrayList);
            long j10 = u;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder callTimeout = protocols.readTimeout(j10, timeUnit).connectTimeout(j10, timeUnit).writeTimeout(j10, timeUnit).callTimeout(Math.max(v10, 0L), timeUnit);
            if (z10 != null && callTimeout != null) {
                try {
                    callTimeout.eventListener(new OKHTTPEventListener(z10));
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
                    RequestBody a10 = a(uVar);
                    if (a10 != null) {
                        builder.post(a10);
                        break;
                    } else {
                        throw new IOException("can't create request body for post");
                    }
                case 2:
                    RequestBody a11 = a(uVar);
                    if (a11 != null) {
                        builder.put(a11);
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
                    RequestBody a12 = a(uVar);
                    if (a12 != null) {
                        builder.patch(a12);
                        break;
                    } else {
                        throw new IOException("can't create request body for patch");
                    }
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            Response execute = callTimeout.build().newCall(builder.url(a).build()).execute();
            Headers headers = execute.headers();
            ArrayList arrayList2 = new ArrayList();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String name = headers.name(i10);
                String value = headers.value(i10);
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
