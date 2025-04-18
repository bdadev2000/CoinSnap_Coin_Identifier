package a1;

import ki.b0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public h f28b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f30d;

    /* renamed from: f, reason: collision with root package name */
    public Object f31f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f32g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f33h;

    /* renamed from: i, reason: collision with root package name */
    public int f34i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(continuation);
        this.f33h = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32g = obj;
        this.f34i |= Integer.MIN_VALUE;
        return this.f33h.b(null, this);
    }
}
