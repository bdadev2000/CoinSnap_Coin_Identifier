package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.ad;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class n {
    private q a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15405b;

    /* renamed from: c, reason: collision with root package name */
    private final o f15406c;

    /* renamed from: d, reason: collision with root package name */
    private final v f15407d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15408e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v f15409f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f15410g;

    /* loaded from: classes4.dex */
    public static final class a implements w.a {
        private final q a;

        /* renamed from: b, reason: collision with root package name */
        private final s f15411b;

        public a(q qVar, s sVar) {
            this.a = qVar;
            this.f15411b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.a
        public final void a(ad adVar) {
            if (y.b(this.a)) {
                try {
                    this.a.a(this.f15411b, 0, adVar.getMessage());
                } catch (Exception e2) {
                    if (com.mbridge.msdk.tracker.a.a) {
                        Log.e("TrackManager", "onErrorResponse error", e2);
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements w.b {
        private final q a;

        /* renamed from: b, reason: collision with root package name */
        private final s f15412b;

        public b(q qVar, s sVar) {
            this.a = qVar;
            this.f15412b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.b
        public final void a(Object obj) {
            if (y.b(this.a)) {
                try {
                    this.a.a(this.f15412b);
                } catch (Exception e2) {
                    if (com.mbridge.msdk.tracker.a.a) {
                        Log.e("TrackManager", "onResponse error", e2);
                    }
                }
            }
        }
    }

    public n(int i10, o oVar, v vVar, int i11) {
        this.f15405b = i10;
        this.f15406c = oVar;
        this.f15407d = vVar;
        this.f15408e = i11;
        this.f15410g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z10) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e2) {
                    if (com.mbridge.msdk.tracker.a.a) {
                        Log.e("TrackManager", "send error", e2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f15409f)) {
                com.mbridge.msdk.tracker.network.v a10 = com.mbridge.msdk.tracker.network.toolbox.n.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f15406c.c()), new com.mbridge.msdk.tracker.network.g(this.f15410g), this.f15405b, null);
                this.f15409f = a10;
                a10.a();
            }
            if (this.f15408e == 1) {
                uVar = new u(this.f15406c.b(), 1, this.f15406c.a());
            } else {
                uVar = new u(this.f15406c.b(), 1);
            }
            uVar.a(map);
            uVar.b(false);
            uVar.c(true);
            uVar.d(true);
            uVar.a(this.f15407d);
            uVar.a(z10 ? u.b.HIGH : u.b.NORMAL);
            uVar.a((w.b) new b(this.a, sVar));
            uVar.a((w.a) new a(this.a, sVar));
            this.f15409f.a(uVar);
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.a) {
                Log.e("TrackManager", "send error", e10);
            }
            if (y.b(this.a)) {
                this.a.a(sVar, 0, e10.getMessage());
            }
        }
    }
}
