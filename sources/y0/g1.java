package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class g1 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Mutex f27742b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27743c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27744d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f27745f;

    /* renamed from: g, reason: collision with root package name */
    public int f27746g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, Continuation continuation) {
        super(continuation);
        this.f27745f = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27744d = obj;
        this.f27746g |= Integer.MIN_VALUE;
        return this.f27745f.c(null, this);
    }
}
