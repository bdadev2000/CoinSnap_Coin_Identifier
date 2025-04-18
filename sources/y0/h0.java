package y0;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class h0 extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f27753b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27754c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f27755d;

    /* renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f27756f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27757g;

    /* renamed from: h, reason: collision with root package name */
    public int f27758h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f27759i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f27760j;

    /* renamed from: k, reason: collision with root package name */
    public int f27761k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f27760j = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27759i = obj;
        this.f27761k |= Integer.MIN_VALUE;
        return u0.d(this.f27760j, false, this);
    }
}
