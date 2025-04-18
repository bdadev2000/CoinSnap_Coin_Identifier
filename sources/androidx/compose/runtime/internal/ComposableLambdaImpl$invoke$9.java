package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$9 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14474c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14479j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f14480k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$9(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i2) {
        super(2);
        this.f14472a = composableLambdaImpl;
        this.f14473b = obj;
        this.f14474c = obj2;
        this.d = obj3;
        this.f14475f = obj4;
        this.f14476g = obj5;
        this.f14477h = obj6;
        this.f14478i = obj7;
        this.f14479j = obj8;
        this.f14480k = obj9;
        this.f14481l = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14472a.y(this.f14473b, this.f14474c, this.d, this.f14475f, this.f14476g, this.f14477h, this.f14478i, this.f14479j, this.f14480k, (Composer) obj, RecomposeScopeImplKt.a(this.f14481l) | 1);
        return b0.f30125a;
    }
}
