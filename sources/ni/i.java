package ni;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes5.dex */
public final class i extends CompletableFuture {

    /* renamed from: b, reason: collision with root package name */
    public final c f22806b;

    public i(b0 b0Var) {
        this.f22806b = b0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        if (z10) {
            this.f22806b.cancel();
        }
        return super.cancel(z10);
    }
}
