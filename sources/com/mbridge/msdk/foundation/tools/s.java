package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private Runnable f16076a;
    private Runnable b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f16076a == null) {
                this.f16076a = a(runnable);
                q.a().execute(this.f16076a);
            } else if (this.b == null) {
                this.b = a(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.s.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("LimitExecutor", e4.getMessage());
                        }
                    }
                } finally {
                    s.this.a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.b;
        this.f16076a = runnable;
        this.b = null;
        if (runnable != null) {
            q.a().execute(this.f16076a);
        }
    }
}
