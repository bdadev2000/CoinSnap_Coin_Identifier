package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$6 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14450c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14454i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$6(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        super(2);
        this.f14448a = composableLambdaImpl;
        this.f14449b = obj;
        this.f14450c = obj2;
        this.d = obj3;
        this.f14451f = obj4;
        this.f14452g = obj5;
        this.f14453h = obj6;
        this.f14454i = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14448a.v(this.f14449b, this.f14450c, this.d, this.f14451f, this.f14452g, this.f14453h, (Composer) obj, RecomposeScopeImplKt.a(this.f14454i) | 1);
        return b0.f30125a;
    }
}
