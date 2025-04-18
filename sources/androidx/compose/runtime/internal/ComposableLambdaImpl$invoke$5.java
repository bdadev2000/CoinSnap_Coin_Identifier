package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$5 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14444c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14447h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$5(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        super(2);
        this.f14442a = composableLambdaImpl;
        this.f14443b = obj;
        this.f14444c = obj2;
        this.d = obj3;
        this.f14445f = obj4;
        this.f14446g = obj5;
        this.f14447h = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14442a.q(this.f14443b, this.f14444c, this.d, this.f14445f, this.f14446g, (Composer) obj, RecomposeScopeImplKt.a(this.f14447h) | 1);
        return b0.f30125a;
    }
}
