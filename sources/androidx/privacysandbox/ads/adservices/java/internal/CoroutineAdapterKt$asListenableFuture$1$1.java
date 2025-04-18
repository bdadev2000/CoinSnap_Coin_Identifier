package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import b1.i0;
import d0.b0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f20833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f20834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer completer, i0 i0Var) {
        super(1);
        this.f20833a = completer;
        this.f20834b = i0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CallbackToFutureAdapter.Completer completer = this.f20833a;
        if (th == null) {
            completer.a(this.f20834b.e());
        } else if (th instanceof CancellationException) {
            completer.b();
        } else {
            completer.c(th);
        }
        return b0.f30125a;
    }
}
