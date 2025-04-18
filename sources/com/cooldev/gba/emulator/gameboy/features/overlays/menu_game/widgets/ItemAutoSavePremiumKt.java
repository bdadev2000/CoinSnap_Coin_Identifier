package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums.MenuGame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemAutoSavePremiumKt {
    @ComposableTarget
    @Composable
    public static final void ItemAutoSavePremium(@NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(406505505);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            MenuGame menuGame = MenuGame.AUTO_SAVE;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f3772a;
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier d = SizeKt.d(companion, 1.0f);
            g2.J(-328371007);
            boolean z2 = (i3 & 14) == 4;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new ItemAutoSavePremiumKt$ItemAutoSavePremium$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(d, false, 0L, (a) u2, 3, null);
            RowMeasurePolicy a2 = RowKt.a(arrangement$Start$1, vertical, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            float f2 = 24;
            ImageKt.a(PainterResources_androidKt.a(menuGame.getResId(), g2, 6), null, SizeKt.n(companion, f2), null, null, 0.0f, null, g2, 440, 120);
            SpacerKt.a(SizeKt.r(companion, 8), g2);
            String title = menuGame.getTitle();
            MyColors myColors = MyColors.INSTANCE;
            TextKt.b(title, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Brush.Companion.a(f0.v(new Color(myColors.m13getText10d7_KjU()), new Color(myColors.m24getText20d7_KjU())), 0L, 0L, 14), TextUnitKt.b(16), FontWeight.f17265c, MyFonts.INSTANCE.getInter(), 5, TextUnitKt.b(24)), g2, 6, 0, 65534);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPremium1(), g2, 6), null, OffsetKt.b(SizeKt.n(companion, 16), 0, -8), null, null, 0.0f, null, g2, 440, 120);
            SpacerKt.a(rowScopeInstance.a(companion, 1.0f, true), g2);
            SwitchKt.a(false, null, SizeKt.e(ScaleKt.a(), f2), null, false, null, null, g2, 25014, 104);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemAutoSavePremiumKt$ItemAutoSavePremium$3(aVar, i2);
        }
    }
}
