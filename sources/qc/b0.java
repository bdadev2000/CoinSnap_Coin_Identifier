package qc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23766b;

    /* renamed from: c, reason: collision with root package name */
    public int f23767c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f23768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f23768d = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23766b = obj;
        this.f23767c |= Integer.MIN_VALUE;
        return this.f23768d.emit(null, this);
    }
}
