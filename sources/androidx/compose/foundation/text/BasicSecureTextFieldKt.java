package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import q0.p;

/* loaded from: classes4.dex */
public final class BasicSecureTextFieldKt {
    public static final void a(p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1085555050);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.f16443o;
            final TextToolbar textToolbar = (TextToolbar) g2.K(staticProvidableCompositionLocal);
            boolean I = g2.I(textToolbar);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ TextToolbar f5455a;

                    {
                        this.f5455a = TextToolbar.this;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final void a(Rect rect, q0.a aVar, q0.a aVar2, q0.a aVar3, q0.a aVar4) {
                        TextToolbar.this.a(rect, null, aVar2, null, aVar4);
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final TextToolbarStatus getStatus() {
                        return this.f5455a.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public final void hide() {
                        this.f5455a.hide();
                    }
                };
                g2.o(u2);
            }
            CompositionLocalKt.a(staticProvidableCompositionLocal.c((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) u2), ComposableLambdaKt.c(-1448819882, new BasicSecureTextFieldKt$DisableCutCopy$1(pVar), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BasicSecureTextFieldKt$DisableCutCopy$2(pVar, i2);
        }
    }
}
