package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public u0 f27714b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f27715c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27716d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f27717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f27718g;

    /* renamed from: h, reason: collision with root package name */
    public int f27719h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f27718g = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27717f = obj;
        this.f27719h |= Integer.MIN_VALUE;
        return u0.c(this.f27718g, false, this);
    }
}
