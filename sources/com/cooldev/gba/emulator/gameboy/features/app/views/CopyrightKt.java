package com.cooldev.gba.emulator.gameboy.features.app.views;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class CopyrightKt {
    @ComposableTarget
    @Composable
    /* renamed from: Copyright-Iv8Zu3U, reason: not valid java name */
    public static final void m117CopyrightIv8Zu3U(long j2, @Nullable Composer composer, int i2, int i3) {
        long j3;
        int i4;
        ComposerImpl g2 = composer.g(-1535411007);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j3 = j2;
        } else if ((i2 & 14) == 0) {
            j3 = j2;
            i4 = (g2.d(j3) ? 4 : 2) | i2;
        } else {
            j3 = j2;
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            long j4 = i5 != 0 ? Color.f14958c : j3;
            TextKt.b("© 2024 CoolDev Studio", null, j4, TextUnitKt.b(12), null, FontWeight.f17271k, MyFonts.INSTANCE.getInter(), 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, g2, ((i4 << 6) & 896) | 1772550, 0, 130450);
            j3 = j4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CopyrightKt$Copyright$1(j3, i2, i3);
        }
    }
}
