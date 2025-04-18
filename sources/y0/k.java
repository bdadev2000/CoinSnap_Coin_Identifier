package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class k extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public o f27774b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f27776d;

    /* renamed from: f, reason: collision with root package name */
    public int f27777f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Continuation continuation) {
        super(continuation);
        this.f27776d = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27775c = obj;
        this.f27777f |= Integer.MIN_VALUE;
        return this.f27776d.a(this);
    }
}
