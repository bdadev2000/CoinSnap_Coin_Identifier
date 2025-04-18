package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class a1 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public b1 f27687b;

    /* renamed from: c, reason: collision with root package name */
    public Mutex f27688c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27689d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f27690f;

    /* renamed from: g, reason: collision with root package name */
    public int f27691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, Continuation continuation) {
        super(continuation);
        this.f27690f = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27689d = obj;
        this.f27691g |= Integer.MIN_VALUE;
        return this.f27690f.b(this);
    }
}
