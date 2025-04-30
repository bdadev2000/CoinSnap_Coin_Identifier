package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18173a;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final u f18175a;
        private final w b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f18176c;

        public a(u uVar, w wVar, Runnable runnable) {
            this.f18175a = uVar;
            this.b = wVar;
            this.f18176c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f18175a.n()) {
                this.f18175a.c("canceled-at-delivery");
                return;
            }
            w wVar = this.b;
            ad adVar = wVar.f18286c;
            if (adVar == null) {
                this.f18175a.a((u) wVar.f18285a);
            } else {
                this.f18175a.b(adVar);
            }
            if (!this.b.f18287d) {
                this.f18175a.c("done");
            }
            Runnable runnable = this.f18176c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public g(final Handler handler) {
        this.f18173a = new Executor() { // from class: com.mbridge.msdk.tracker.network.g.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public final void a(u<?> uVar, ad adVar) {
        this.f18173a.execute(new a(uVar, w.a(adVar), null));
    }

    public g(Executor executor) {
        this.f18173a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public final void a(u<?> uVar, w<?> wVar) {
        uVar.w();
        this.f18173a.execute(new a(uVar, wVar, null));
    }
}
