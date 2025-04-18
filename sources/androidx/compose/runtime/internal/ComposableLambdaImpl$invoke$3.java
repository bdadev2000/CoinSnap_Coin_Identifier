package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$3 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14435c;
    public final /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$3(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i2) {
        super(2);
        this.f14433a = composableLambdaImpl;
        this.f14434b = obj;
        this.f14435c = obj2;
        this.d = obj3;
        this.f14436f = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f14433a.m(this.f14434b, this.f14435c, this.d, (Composer) obj, RecomposeScopeImplKt.a(this.f14436f) | 1);
        return b0.f30125a;
    }
}
