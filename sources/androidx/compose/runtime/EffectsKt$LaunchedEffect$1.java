package androidx.compose.runtime;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class EffectsKt$LaunchedEffect$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f13798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13799b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectsKt$LaunchedEffect$1(p pVar, int i2) {
        super(2);
        this.f13798a = pVar;
        this.f13799b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f13799b | 1);
        ComposerImpl g2 = ((Composer) obj).g(-805415771);
        if ((a2 & 1) != 0 || !g2.i()) {
            throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString());
        }
        g2.A();
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new EffectsKt$LaunchedEffect$1(this.f13798a, a2);
        }
        return b0.f30125a;
    }
}
