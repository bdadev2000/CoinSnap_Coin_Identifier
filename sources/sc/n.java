package sc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class n extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f24979c;

    /* renamed from: d, reason: collision with root package name */
    public int f24980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(continuation);
        this.f24979c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24978b = obj;
        this.f24980d |= Integer.MIN_VALUE;
        return this.f24979c.c(null, null, this);
    }
}
