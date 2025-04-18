package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class s0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Ref.IntRef f27837b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f27839d;

    /* renamed from: f, reason: collision with root package name */
    public int f27840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f27839d = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27838c = obj;
        this.f27840f |= Integer.MIN_VALUE;
        return this.f27839d.h(null, false, this);
    }
}
