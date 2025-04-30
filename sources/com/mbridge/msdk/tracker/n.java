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
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private q f18147a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final o f18148c;

    /* renamed from: d, reason: collision with root package name */
    private final v f18149d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18150e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v f18151f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18152g;

    /* loaded from: classes3.dex */
    public static final class a implements w.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f18154a;
        private final s b;

        public a(q qVar, s sVar) {
            this.f18154a = qVar;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.a
        public final void a(ad adVar) {
            if (y.b(this.f18154a)) {
                try {
                    this.f18154a.a(this.b, 0, adVar.getMessage());
                } catch (Exception e4) {
                    if (com.mbridge.msdk.tracker.a.f18098a) {
                        Log.e("TrackManager", "onErrorResponse error", e4);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements w.b {

        /* renamed from: a, reason: collision with root package name */
        private final q f18155a;
        private final s b;

        public b(q qVar, s sVar) {
            this.f18155a = qVar;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.network.w.b
        public final void a(Object obj) {
            if (y.b(this.f18155a)) {
                try {
                    this.f18155a.a(this.b);
                } catch (Exception e4) {
                    if (com.mbridge.msdk.tracker.a.f18098a) {
                        Log.e("TrackManager", "onResponse error", e4);
                    }
                }
            }
        }
    }

    public n(int i9, o oVar, v vVar, int i10) {
        this.b = i9;
        this.f18148c = oVar;
        this.f18149d = vVar;
        this.f18150e = i10;
        this.f18152g = new ThreadPoolExecutor(i9, i9, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.tracker.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.f18147a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z8) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.f18147a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e4) {
                    if (com.mbridge.msdk.tracker.a.f18098a) {
                        Log.e("TrackManager", "send error", e4);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f18151f)) {
                com.mbridge.msdk.tracker.network.v a6 = com.mbridge.msdk.tracker.network.toolbox.n.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f18148c.c()), new com.mbridge.msdk.tracker.network.g(this.f18152g), this.b, null);
                this.f18151f = a6;
                a6.a();
            }
            if (this.f18150e == 1) {
                uVar = new u(this.f18148c.b(), 1, this.f18148c.a());
            } else {
                uVar = new u(this.f18148c.b(), 1);
            }
            uVar.a(map);
            uVar.b(false);
            uVar.c(true);
            uVar.d(true);
            uVar.a(this.f18149d);
            uVar.a(z8 ? u.b.HIGH : u.b.NORMAL);
            uVar.a((w.b) new b(this.f18147a, sVar));
            uVar.a((w.a) new a(this.f18147a, sVar));
            this.f18151f.a(uVar);
        } catch (Exception e9) {
            if (com.mbridge.msdk.tracker.a.f18098a) {
                Log.e("TrackManager", "send error", e9);
            }
            if (y.b(this.f18147a)) {
                this.f18147a.a(sVar, 0, e9.getMessage());
            }
        }
    }
}
