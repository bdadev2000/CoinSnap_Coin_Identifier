package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.safedk.android.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class TitleSectionKt {
    @ComposableTarget
    @Composable
    public static final void TitleSection(@NotNull String str, @Nullable Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        a.s(str, "text");
        ComposerImpl g2 = composer.g(-1716235694);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            composerImpl = g2;
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(d.f29936c), MyFonts.INSTANCE.getInter(), 0L, null, 5, b3, 16613336), composerImpl, i3 & 14, 0, 65534);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new TitleSectionKt$TitleSection$1(str, i2);
        }
    }
}
