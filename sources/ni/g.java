package ni;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes5.dex */
public final class g implements f {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22798c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f22798c = obj;
        this.f22797b = obj2;
    }

    @Override // ni.f
    public final void onFailure(c cVar, Throwable th2) {
        int i10 = this.a;
        Object obj = this.f22797b;
        switch (i10) {
            case 0:
                ((CompletableFuture) obj).completeExceptionally(th2);
                return;
            case 1:
                ((CompletableFuture) obj).completeExceptionally(th2);
                return;
            default:
                ((n) this.f22798c).f22823b.execute(new androidx.emoji2.text.n(27, this, (f) obj, th2));
                return;
        }
    }

    @Override // ni.f
    public final void onResponse(c cVar, s0 s0Var) {
        int i10 = this.a;
        Object obj = this.f22797b;
        switch (i10) {
            case 0:
                if (s0Var.a.j()) {
                    ((CompletableFuture) obj).complete(s0Var.f22877b);
                    return;
                } else {
                    ((CompletableFuture) obj).completeExceptionally(new p(s0Var));
                    return;
                }
            case 1:
                ((CompletableFuture) obj).complete(s0Var);
                return;
            default:
                ((n) this.f22798c).f22823b.execute(new androidx.emoji2.text.n(26, this, (f) obj, s0Var));
                return;
        }
    }
}
