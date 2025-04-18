package com.cooldev.gba.emulator.gameboy.features.dialogs.remove_game_dialog;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes.dex */
public final class RemoveGameDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonCancel(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1210194475);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            RemoveGameDialogKt$ButtonCancel$$inlined$debounced$1 removeGameDialogKt$ButtonCancel$$inlined$debounced$1 = new RemoveGameDialogKt$ButtonCancel$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-531761005);
            boolean I = g2.I(removeGameDialogKt$ButtonCancel$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new RemoveGameDialogKt$ButtonCancel$1$1(removeGameDialogKt$ButtonCancel$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$RemoveGameDialogKt.INSTANCE.m185getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RemoveGameDialogKt$ButtonCancel$2(modifier, aVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonRemove(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1259017141);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            RemoveGameDialogKt$ButtonRemove$$inlined$debounced$1 removeGameDialogKt$ButtonRemove$$inlined$debounced$1 = new RemoveGameDialogKt$ButtonRemove$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-921451107);
            boolean I = g2.I(removeGameDialogKt$ButtonRemove$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new RemoveGameDialogKt$ButtonRemove$1$1(removeGameDialogKt$ButtonRemove$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$RemoveGameDialogKt.INSTANCE.m184getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RemoveGameDialogKt$ButtonRemove$2(modifier, aVar, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void RemoveGameDialog(boolean z2, @NotNull a aVar, @NotNull a aVar2, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onCancel");
        p0.a.s(aVar2, "onRemove");
        ComposerImpl g2 = composer.g(-1955420584);
        if ((i2 & 14) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        if ((i3 & 731) == 146 && g2.i()) {
            g2.A();
        } else if (z2) {
            AndroidDialog_androidKt.a(RemoveGameDialogKt$RemoveGameDialog$1.INSTANCE, new DialogProperties(3), ComposableLambdaKt.c(-265173238, new RemoveGameDialogKt$RemoveGameDialog$2(aVar, aVar2), g2), g2, 438, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RemoveGameDialogKt$RemoveGameDialog$3(z2, aVar, aVar2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextSubtitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(216063463);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("The game and all data will be lost. You can re-download the game on the website.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), inter, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RemoveGameDialogKt$TextSubtitle$1(i2);
        }
    }
}
