package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$4 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14439c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$4(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(2);
        this.f14437a = composableLambdaImpl;
        this.f14438b = obj;
        this.f14439c = obj2;
        this.d = obj3;
        this.f14440f = obj4;
        this.f14441g = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14437a.n(this.f14438b, this.f14439c, this.d, this.f14440f, (Composer) obj, RecomposeScopeImplKt.a(this.f14441g) | 1);
        return b0.f30125a;
    }
}
