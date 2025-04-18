package qc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class r extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f23864b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.facebook.internal.m f23866d;

    /* renamed from: f, reason: collision with root package name */
    public int f23867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.facebook.internal.m mVar, Continuation continuation) {
        super(continuation);
        this.f23866d = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23865c = obj;
        this.f23867f |= Integer.MIN_VALUE;
        return this.f23866d.i(null, this);
    }
}
