package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import androidx.compose.ui.node.ComposeUiNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class SectionHeaderKt {
    @ComposableTarget
    @Composable
    public static final void SectionHeader(@NotNull String str, @NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(str, "title");
        p0.a.s(aVar, "onViewAllClick");
        ComposerImpl g2 = composer.g(1629075514);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Modifier h2 = PaddingKt.h(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 16, 0.0f, 2);
            RowMeasurePolicy a2 = RowKt.a(Arrangement.f3776g, Alignment.Companion.f14667k, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
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
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            TitleSectionKt.TitleSection(str, g2, i3 & 14);
            TextViewAllKt.TextViewAll(aVar, g2, (i3 >> 3) & 14);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SectionHeaderKt$SectionHeader$2(str, aVar, i2);
        }
    }
}
