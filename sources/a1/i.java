package a1;

import ki.d0;
import ki.v;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class i extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public v f41b;

    /* renamed from: c, reason: collision with root package name */
    public v f42c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f43d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f44f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f45g;

    /* renamed from: h, reason: collision with root package name */
    public int f46h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(continuation);
        this.f45g = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44f = obj;
        this.f46h |= Integer.MIN_VALUE;
        return this.f45g.b(null, this);
    }
}
