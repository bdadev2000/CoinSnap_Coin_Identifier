package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$12 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14312b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14313c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14317i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14318j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f14319k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f14320l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14321m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f14322n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14323o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14324p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$12(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i2, int i3) {
        super(2);
        this.f14311a = composableLambdaImpl;
        this.f14312b = obj;
        this.f14313c = obj2;
        this.d = obj3;
        this.f14314f = obj4;
        this.f14315g = obj5;
        this.f14316h = obj6;
        this.f14317i = obj7;
        this.f14318j = obj8;
        this.f14319k = obj9;
        this.f14320l = obj10;
        this.f14321m = obj11;
        this.f14322n = obj12;
        this.f14323o = i2;
        this.f14324p = i3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14311a.B(this.f14312b, this.f14313c, this.d, this.f14314f, this.f14315g, this.f14316h, this.f14317i, this.f14318j, this.f14319k, this.f14320l, this.f14321m, this.f14322n, (Composer) obj, RecomposeScopeImplKt.a(this.f14323o) | 1, RecomposeScopeImplKt.a(this.f14324p));
        return b0.f30125a;
    }
}
