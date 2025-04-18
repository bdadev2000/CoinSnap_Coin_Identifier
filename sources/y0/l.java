package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class l extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f27781b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27782c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27783d;

    /* renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f27784f;

    /* renamed from: g, reason: collision with root package name */
    public u0 f27785g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f27786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f27787i;

    /* renamed from: j, reason: collision with root package name */
    public int f27788j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(continuation);
        this.f27787i = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27786h = obj;
        this.f27788j |= Integer.MIN_VALUE;
        return this.f27787i.a(null, this);
    }
}
