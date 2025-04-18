package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes.dex */
public final class x extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f27867b;

    /* renamed from: c, reason: collision with root package name */
    public u0 f27868c;

    /* renamed from: d, reason: collision with root package name */
    public CompletableDeferred f27869d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f27870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f27871g;

    /* renamed from: h, reason: collision with root package name */
    public int f27872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f27871g = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27870f = obj;
        this.f27872h |= Integer.MIN_VALUE;
        return u0.b(this.f27871g, null, this);
    }
}
