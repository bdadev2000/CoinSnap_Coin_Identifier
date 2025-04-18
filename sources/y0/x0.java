package y0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class x0 {
    public final Function2 a;

    /* renamed from: b, reason: collision with root package name */
    public final CompletableDeferred f27873b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f27874c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineContext f27875d;

    public x0(Function2 transform, CompletableDeferred ack, j1 j1Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.a = transform;
        this.f27873b = ack;
        this.f27874c = j1Var;
        this.f27875d = callerContext;
    }
}
