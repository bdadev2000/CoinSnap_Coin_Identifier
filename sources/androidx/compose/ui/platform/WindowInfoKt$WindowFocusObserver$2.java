package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class WindowInfoKt$WindowFocusObserver$2 extends r implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.l f16652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16653b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$2(int i2, q0.l lVar) {
        super(2);
        this.f16652a = lVar;
        this.f16653b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        int i2;
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f16653b | 1);
        ComposerImpl g2 = ((Composer) obj).g(127829799);
        int i3 = a2 & 6;
        q0.l lVar = this.f16652a;
        if (i3 == 0) {
            i2 = (g2.w(lVar) ? 4 : 2) | a2;
        } else {
            i2 = a2;
        }
        if ((i2 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            WindowInfo windowInfo = (WindowInfo) g2.K(CompositionLocalsKt.f16446r);
            MutableState k2 = SnapshotStateKt.k(lVar, g2);
            boolean I = g2.I(windowInfo) | g2.I(k2);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new WindowInfoKt$WindowFocusObserver$1$1(windowInfo, k2, null);
                g2.o(u2);
            }
            EffectsKt.f(windowInfo, (q0.p) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new WindowInfoKt$WindowFocusObserver$2(a2, lVar);
        }
        return b0.f30125a;
    }
}
