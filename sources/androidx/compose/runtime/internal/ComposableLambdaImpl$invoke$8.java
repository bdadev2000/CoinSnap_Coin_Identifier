package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$8 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14465c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14469i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14470j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14471k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$8(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i2) {
        super(2);
        this.f14463a = composableLambdaImpl;
        this.f14464b = obj;
        this.f14465c = obj2;
        this.d = obj3;
        this.f14466f = obj4;
        this.f14467g = obj5;
        this.f14468h = obj6;
        this.f14469i = obj7;
        this.f14470j = obj8;
        this.f14471k = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14463a.x(this.f14464b, this.f14465c, this.d, this.f14466f, this.f14467g, this.f14468h, this.f14469i, this.f14470j, (Composer) obj, RecomposeScopeImplKt.a(this.f14471k) | 1);
        return b0.f30125a;
    }
}
