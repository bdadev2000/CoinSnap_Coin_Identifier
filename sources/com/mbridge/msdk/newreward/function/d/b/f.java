package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.tracker.network.toolbox.j;
import com.mbridge.msdk.tracker.network.toolbox.k;
import com.mbridge.msdk.tracker.network.toolbox.n;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.v;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {
    private static volatile f a;

    /* renamed from: b, reason: collision with root package name */
    private v f14583b;

    private f() {
    }

    public static f a() {
        if (a == null) {
            synchronized (f.class) {
                if (a == null) {
                    a = new f();
                }
            }
        }
        return a;
    }

    private static ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.newreward.function.d.b.f.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("campaign_response_thread");
                return thread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public final v b() {
        if (this.f14583b == null) {
            v a10 = n.a(new com.mbridge.msdk.tracker.network.toolbox.b(new k()), new com.mbridge.msdk.tracker.network.g(c()), 5, new j());
            this.f14583b = a10;
            a10.a();
        }
        return this.f14583b;
    }

    public final void a(u<JSONObject> uVar) {
        b().a(uVar);
    }
}
