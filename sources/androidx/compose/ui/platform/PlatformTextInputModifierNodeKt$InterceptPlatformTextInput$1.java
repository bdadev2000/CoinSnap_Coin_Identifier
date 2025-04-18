package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputInterceptor f16557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.p f16558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(PlatformTextInputInterceptor platformTextInputInterceptor, q0.p pVar, int i2) {
        super(2);
        this.f16557a = platformTextInputInterceptor;
        this.f16558b = pVar;
        this.f16559c = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f16559c | 1);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = PlatformTextInputModifierNodeKt.f16556a;
        ComposerImpl g2 = ((Composer) obj).g(1315007550);
        int i3 = a2 & 6;
        PlatformTextInputInterceptor platformTextInputInterceptor = this.f16557a;
        if (i3 == 0) {
            i2 = ((a2 & 8) == 0 ? g2.I(platformTextInputInterceptor) : g2.w(platformTextInputInterceptor) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        int i4 = a2 & 48;
        q0.p pVar = this.f16558b;
        if (i4 == 0) {
            i2 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            ProvidableCompositionLocal providableCompositionLocal = PlatformTextInputModifierNodeKt.f16556a;
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) g2.K(providableCompositionLocal);
            boolean I = g2.I(chainedPlatformTextInputInterceptor);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                g2.o(u2);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) u2;
            chainedPlatformTextInputInterceptor2.f16403b.setValue(platformTextInputInterceptor);
            CompositionLocalKt.a(providableCompositionLocal.c(chainedPlatformTextInputInterceptor2), pVar, g2, (i2 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(platformTextInputInterceptor, pVar, a2);
        }
        return b0.f30125a;
    }
}
