package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ComposableLambdaImpl$invoke$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComposableLambdaImpl f14284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$1(ComposableLambdaImpl composableLambdaImpl, Object obj, int i2) {
        super(2);
        this.f14284a = composableLambdaImpl;
        this.f14285b = obj;
        this.f14286c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f14286c) | 1;
        this.f14284a.b(this.f14285b, (Composer) obj, a2);
        return b0.f30125a;
    }
}
