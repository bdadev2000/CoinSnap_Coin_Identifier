package a1;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class f extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public h f22b;

    /* renamed from: c, reason: collision with root package name */
    public b f23c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f25f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f26g;

    /* renamed from: h, reason: collision with root package name */
    public int f27h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(continuation);
        this.f26g = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25f = obj;
        this.f27h |= Integer.MIN_VALUE;
        return this.f26g.a(null, this);
    }
}
