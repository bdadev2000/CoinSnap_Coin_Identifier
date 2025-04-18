package a1;

import ki.e0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public b f6b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f7c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f9f;

    /* renamed from: g, reason: collision with root package name */
    public int f10g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.f9f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f8d = obj;
        this.f10g |= Integer.MIN_VALUE;
        return b.a(this.f9f, this);
    }
}
