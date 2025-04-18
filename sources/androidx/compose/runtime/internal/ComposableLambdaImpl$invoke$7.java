package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$7 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14457c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f14461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14462j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$7(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2) {
        super(2);
        this.f14455a = composableLambdaImpl;
        this.f14456b = obj;
        this.f14457c = obj2;
        this.d = obj3;
        this.f14458f = obj4;
        this.f14459g = obj5;
        this.f14460h = obj6;
        this.f14461i = obj7;
        this.f14462j = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14455a.w(this.f14456b, this.f14457c, this.d, this.f14458f, this.f14459g, this.f14460h, this.f14461i, (Composer) obj, RecomposeScopeImplKt.a(this.f14462j) | 1);
        return b0.f30125a;
    }
}
