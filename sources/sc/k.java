package sc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class k extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public l f24968b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f24970d;

    /* renamed from: f, reason: collision with root package name */
    public int f24971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(continuation);
        this.f24970d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24969c = obj;
        this.f24971f |= Integer.MIN_VALUE;
        return this.f24970d.b(this);
    }
}
