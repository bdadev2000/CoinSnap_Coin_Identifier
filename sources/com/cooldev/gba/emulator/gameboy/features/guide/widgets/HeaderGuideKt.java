package com.cooldev.gba.emulator.gameboy.features.guide.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GuideSection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class HeaderGuideKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void CustomOutlinedButton(String str, boolean z2, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-712753157);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && g2.i()) {
            g2.A();
        } else {
            MyColors myColors = MyColors.INSTANCE;
            long m36getText60d7_KjU = z2 ? myColors.m36getText60d7_KjU() : myColors.m22getText180d7_KjU();
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == Composer.Companion.f13690a) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            HeaderGuideKt$CustomOutlinedButton$$inlined$debounced$1 headerGuideKt$CustomOutlinedButton$$inlined$debounced$1 = new HeaderGuideKt$CustomOutlinedButton$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            BorderStroke a2 = BorderStrokeKt.a(m36getText60d7_KjU, 1);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            long j2 = Color.f14961h;
            long j3 = Color.f14962i;
            float f2 = 8;
            float f3 = 24;
            ButtonKt.b(headerGuideKt$CustomOutlinedButton$$inlined$debounced$1, null, false, null, ButtonDefaults.c(MaterialTheme.a(g2)).a(j3, j2, j3, j3), null, a2, new PaddingValuesImpl(f3, f2, f3, f2), null, ComposableLambdaKt.c(654514633, new HeaderGuideKt$CustomOutlinedButton$1(str, m36getText60d7_KjU), g2), g2, 805306368, 302);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HeaderGuideKt$CustomOutlinedButton$2(str, z2, aVar, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void HeaderGuide(@NotNull GuideSection guideSection, @NotNull l lVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(guideSection, "selectedSection");
        p0.a.s(lVar, "onSectionSelected");
        ComposerImpl g2 = composer.g(1571163980);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(guideSection) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(lVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Arrangement.SpacedAligned g3 = Arrangement.g(8);
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            Modifier h2 = PaddingKt.h(Modifier.Companion.f14687a, 16, 0.0f, 2);
            RowMeasurePolicy a2 = RowKt.a(g3, vertical, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(-1816291768);
            Iterator<E> it = GuideSection.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GuideSection guideSection2 = (GuideSection) it.next();
                String title = guideSection2.getTitle();
                boolean z2 = guideSection == guideSection2;
                g2.J(1093957851);
                boolean I = ((i3 & 112) == 32) | g2.I(guideSection2);
                Object u2 = g2.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    u2 = new HeaderGuideKt$HeaderGuide$1$1$1$1(lVar, guideSection2);
                    g2.o(u2);
                }
                g2.V(false);
                CustomOutlinedButton(title, z2, (a) u2, g2, 0);
            }
            g2.V(false);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new HeaderGuideKt$HeaderGuide$2(guideSection, lVar, i2);
        }
    }
}
