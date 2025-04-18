package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class s implements Executor {
    private Runnable a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f13636b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.a == null) {
            this.a = a(runnable);
            q.a().execute(this.a);
        } else if (this.f13636b == null) {
            this.f13636b = a(runnable);
        }
    }

    private Runnable a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.s.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("LimitExecutor", e2.getMessage());
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
        Runnable runnable = this.f13636b;
        this.a = runnable;
        this.f13636b = null;
        if (runnable != null) {
            q.a().execute(this.a);
        }
    }
}
