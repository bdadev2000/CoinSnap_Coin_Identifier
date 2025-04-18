package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.safedk.android.internal.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes2.dex */
public final class TextViewAllKt {
    @ComposableTarget
    @Composable
    public static final void TextViewAll(@NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(-883284627);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(UserGuideViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            long b2 = TextUnitKt.b(12);
            long b3 = TextUnitKt.b(16);
            TextKt.b("VIEW ALL", ClickableKt.c(Modifier.Companion.f14687a, false, null, new TextViewAllKt$TextViewAll$1((UserGuideViewModel) u2, aVar), 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m38getText80d7_KjU(), b2, new FontWeight(d.f29936c), MyFonts.INSTANCE.getInter(), 0L, null, 6, b3, 16613336), g2, 6, 0, 65532);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TextViewAllKt$TextViewAll$2(aVar, i2);
        }
    }
}
