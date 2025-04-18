package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes.dex */
public final class f1 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f27731b;

    /* renamed from: c, reason: collision with root package name */
    public Mutex f27732c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27733d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f27734f;

    /* renamed from: g, reason: collision with root package name */
    public int f27735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(i1 i1Var, Continuation continuation) {
        super(continuation);
        this.f27734f = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27733d = obj;
        this.f27735g |= Integer.MIN_VALUE;
        return this.f27734f.b(null, this);
    }
}
