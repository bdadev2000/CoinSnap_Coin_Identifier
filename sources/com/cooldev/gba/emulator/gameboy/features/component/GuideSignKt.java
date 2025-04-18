package com.cooldev.gba.emulator.gameboy.features.component;

import android.support.v4.media.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class GuideSignKt {
    @ComposableTarget
    @Composable
    public static final void GuideSign(@Nullable Modifier modifier, @NotNull a aVar, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        p0.a.s(aVar, "onClose");
        ComposerImpl g2 = composer.g(-1881355361);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (g2.I(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= g2.w(aVar) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            Modifier T0 = modifier3.T0(modifier3);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, T0);
            ComposeUiNode.h8.getClass();
            a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            Modifier modifier4 = modifier3;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.guide_sign, g2, 0), null, SizeKt.e(companion, 156), null, ContentScale.Companion.f15722c, 0.0f, null, g2, 25016, 104);
            Painter a2 = PainterResources_androidKt.a(MyImages.INSTANCE.getIcClose(), g2, 6);
            Modifier a3 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 21, 4, 0.0f, 0.0f, 12), 11), Alignment.Companion.f14660b);
            g2.J(-1848815299);
            boolean z2 = (i6 & 112) == 32;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new GuideSignKt$GuideSign$1$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            ImageKt.a(a2, null, OffsetKt.c(ClickableKt.c(a3, false, null, (a) u2, 7), -12, 0.0f, 2), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GuideSignKt$GuideSign$2(modifier2, aVar, i2, i3);
        }
    }
}
