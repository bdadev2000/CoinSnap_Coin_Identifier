package y0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27684b;

    /* renamed from: c, reason: collision with root package name */
    public int f27685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f27686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s sVar, Continuation continuation) {
        super(continuation);
        this.f27686d = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27684b = obj;
        this.f27685c |= Integer.MIN_VALUE;
        return this.f27686d.emit(null, this);
    }
}
