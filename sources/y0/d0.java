package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class d0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public u0 f27703b;

    /* renamed from: c, reason: collision with root package name */
    public int f27704c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27705d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f27706f;

    /* renamed from: g, reason: collision with root package name */
    public int f27707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f27706f = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27705d = obj;
        this.f27707g |= Integer.MIN_VALUE;
        return this.f27706f.f(this);
    }
}
