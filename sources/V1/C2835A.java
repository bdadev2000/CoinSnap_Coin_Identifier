package v1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: v1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2835A extends FutureTask {
    public C2836B b;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.b.d((z) get());
            } catch (InterruptedException | ExecutionException e4) {
                this.b.d(new z(e4));
            }
        } finally {
            this.b = null;
        }
    }
}
