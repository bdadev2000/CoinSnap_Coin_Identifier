package com.cooldev.gba.emulator.gameboy.features.setting.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.setting.enums.SettingEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ItemSettingWidgetKt {
    @ComposableTarget
    @Composable
    public static final void ItemSettingWidget(@NotNull SettingEnum settingEnum, @NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(settingEnum, "data");
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(815097635);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(settingEnum) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 8;
            Modifier a2 = BackgroundKt.a(ClipKt.a(SizeKt.d(PaddingKt.h(companion, 0.0f, 4, 1), 1.0f), RoundedCornerShapeKt.b(f2)), MyColors.INSTANCE.m37getText70d7_KjU(), RectangleShapeKt.f15014a);
            g2.J(1752390237);
            boolean z2 = (i3 & 112) == 32;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new ItemSettingWidgetKt$ItemSettingWidget$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(a2, false, 0L, (a) u2, 3, null);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
            ComposeUiNode.h8.getClass();
            a aVar2 = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            Modifier g3 = PaddingKt.g(companion, 16, 12);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, g2, 54);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, g3);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, a3, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            ImageKt.a(PainterResources_androidKt.a(settingEnum.getResId(), g2, 0), null, SizeKt.n(companion, 24), null, null, 0.0f, null, g2, 440, 120);
            SpacerKt.a(SizeKt.r(companion, f2), g2);
            TextKt.b(settingEnum.getTitle(), null, Color.f14958c, TextUnitKt.b(16), null, FontWeight.f17265c, MyFonts.INSTANCE.getInter(), 0L, null, new TextAlign(5), TextUnitKt.b(24), 0, false, 0, 0, null, null, g2, 1772928, 6, 129426);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemSettingWidgetKt$ItemSettingWidget$3(settingEnum, aVar, i2);
        }
    }
}
