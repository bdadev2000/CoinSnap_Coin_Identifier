package ni;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class w extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22892b;

    /* renamed from: c, reason: collision with root package name */
    public int f22893c;

    public w(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22892b = obj;
        this.f22893c |= Integer.MIN_VALUE;
        return com.bumptech.glide.e.U(null, this);
    }
}
