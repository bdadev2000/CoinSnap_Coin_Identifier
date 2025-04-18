package m3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class c0 extends FutureTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f21522b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Callable callable) {
        super(callable);
        this.f21522b = d0Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        d0 d0Var = this.f21522b;
        if (isCancelled()) {
            return;
        }
        try {
            d0Var.a((b0) get());
        } catch (InterruptedException | ExecutionException e2) {
            d0Var.a(new b0(e2));
        }
    }
}
