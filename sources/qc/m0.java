package qc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class m0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public n0 f23838b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f23840d;

    /* renamed from: f, reason: collision with root package name */
    public int f23841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f23840d = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23839c = obj;
        this.f23841f |= Integer.MIN_VALUE;
        return n0.a(this.f23840d, this);
    }
}
