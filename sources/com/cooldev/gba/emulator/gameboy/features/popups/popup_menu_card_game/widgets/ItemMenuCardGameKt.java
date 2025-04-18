package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemMenuCardGameKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    /* renamed from: ImageLeading-RPmYEkk, reason: not valid java name */
    public static final void m348ImageLeadingRPmYEkk(int i2, long j2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1214195942);
        if ((i3 & 14) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= g2.d(j2) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(i2, g2, i4 & 14), null, SizeKt.n(Modifier.Companion.f14687a, 24), null, null, 0.0f, ColorFilter.Companion.a(5, j2), g2, 440, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemMenuCardGameKt$ImageLeading$1(i2, j2, i3);
        }
    }

    @ComposableTarget
    @Composable
    /* renamed from: ItemMenuCardGame-RPmYEkk, reason: not valid java name */
    public static final void m349ItemMenuCardGameRPmYEkk(@NotNull MenuCardGame menuCardGame, long j2, @Nullable Composer composer, int i2) {
        int i3;
        a.s(menuCardGame, "data");
        ComposerImpl g2 = composer.g(-1193453311);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(menuCardGame) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            RowMeasurePolicy a2 = RowKt.a(arrangement$Start$1, vertical, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
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
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            int i5 = i3 & 112;
            m348ImageLeadingRPmYEkk(menuCardGame.getResId(), j2, g2, i5);
            SpacerKt.a(SizeKt.r(companion, 4), g2);
            m350TitleRPmYEkk(menuCardGame.getTitle(), j2, g2, i5);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemMenuCardGameKt$ItemMenuCardGame$2(menuCardGame, j2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    /* renamed from: Title-RPmYEkk, reason: not valid java name */
    public static final void m350TitleRPmYEkk(String str, long j2, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(-1933928567);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.d(j2) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            composerImpl = g2;
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(j2, TextUnitKt.b(16), new FontWeight(com.safedk.android.internal.d.f29936c), MyFonts.INSTANCE.getInter(), 0L, null, 5, TextUnitKt.b(24), 16613336), composerImpl, i4 & 14, 0, 65534);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemMenuCardGameKt$Title$1(str, j2, i2);
        }
    }
}
