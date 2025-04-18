package t1;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class e extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public f f25175b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f25177d;

    /* renamed from: f, reason: collision with root package name */
    public int f25178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(continuation);
        this.f25177d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25176c = obj;
        this.f25178f |= Integer.MIN_VALUE;
        return f.M(this.f25177d, null, this);
    }
}
