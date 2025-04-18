package com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes.dex */
public final class GoodLuckDialogKt {
    @ComposableTarget
    @Composable
    public static final void GoodLuckDialog(boolean z2, @NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onDismissRequest");
        ComposerImpl g2 = composer.g(1421590810);
        if ((i2 & 14) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else if (z2) {
            g2.J(784340360);
            boolean z3 = (i3 & 112) == 32;
            Object u2 = g2.u();
            if (z3 || u2 == Composer.Companion.f13690a) {
                u2 = new GoodLuckDialogKt$GoodLuckDialog$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            AndroidDialog_androidKt.a((a) u2, new DialogProperties(3), ComposableLambdaKt.c(694584780, new GoodLuckDialogKt$GoodLuckDialog$2(aVar), g2), g2, 432, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GoodLuckDialogKt$GoodLuckDialog$3(z2, aVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextSubTitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1400058869);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("Thank you for your feedback, we will try to develop better applications in the future.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), inter, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GoodLuckDialogKt$TextSubTitle$1(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextTitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(867994431);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(45);
            FontFamily determinationSans = MyFonts.INSTANCE.getDeterminationSans();
            TextKt.b("Good luck", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), determinationSans, 0L, null, 3, 0L, 16744408), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GoodLuckDialogKt$TextTitle$1(i2);
        }
    }
}
