package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class g implements x {
    private final Executor a;

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        private final u a;

        /* renamed from: b, reason: collision with root package name */
        private final w f15431b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f15432c;

        public a(u uVar, w wVar, Runnable runnable) {
            this.a = uVar;
            this.f15431b = wVar;
            this.f15432c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            if (this.a.n()) {
                this.a.c("canceled-at-delivery");
                return;
            }
            w wVar = this.f15431b;
            ad adVar = wVar.f15522c;
            if (adVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.a.a((u) wVar.a);
            } else {
                this.a.b(adVar);
            }
            if (!this.f15431b.f15523d) {
                this.a.c("done");
            }
            Runnable runnable = this.f15432c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public g(final Handler handler) {
        this.a = new Executor() { // from class: com.mbridge.msdk.tracker.network.g.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public final void a(u<?> uVar, ad adVar) {
        this.a.execute(new a(uVar, w.a(adVar), null));
    }

    public g(Executor executor) {
        this.a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public final void a(u<?> uVar, w<?> wVar) {
        uVar.w();
        this.a.execute(new a(uVar, wVar, null));
    }
}
