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

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f17219a;
    private v b;

    private f() {
    }

    public static f a() {
        if (f17219a == null) {
            synchronized (f.class) {
                try {
                    if (f17219a == null) {
                        f17219a = new f();
                    }
                } finally {
                }
            }
        }
        return f17219a;
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
        if (this.b == null) {
            v a6 = n.a(new com.mbridge.msdk.tracker.network.toolbox.b(new k()), new com.mbridge.msdk.tracker.network.g(c()), 5, new j());
            this.b = a6;
            a6.a();
        }
        return this.b;
    }

    public final void a(u<JSONObject> uVar) {
        b().a(uVar);
    }
}
