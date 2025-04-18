package com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog;

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

/* loaded from: classes2.dex */
public final class CancelSubDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonBack(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1024868654);
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
            CancelSubDialogKt$ButtonBack$$inlined$debounced$1 cancelSubDialogKt$ButtonBack$$inlined$debounced$1 = new CancelSubDialogKt$ButtonBack$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-422195094);
            boolean I = g2.I(cancelSubDialogKt$ButtonBack$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new CancelSubDialogKt$ButtonBack$1$1(cancelSubDialogKt$ButtonBack$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$CancelSubDialogKt.INSTANCE.m161getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CancelSubDialogKt$ButtonBack$2(modifier, aVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonUnSub(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1510277074);
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
            CancelSubDialogKt$ButtonUnSub$$inlined$debounced$1 cancelSubDialogKt$ButtonUnSub$$inlined$debounced$1 = new CancelSubDialogKt$ButtonUnSub$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-167447962);
            boolean I = g2.I(cancelSubDialogKt$ButtonUnSub$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new CancelSubDialogKt$ButtonUnSub$1$1(cancelSubDialogKt$ButtonUnSub$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$CancelSubDialogKt.INSTANCE.m162getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CancelSubDialogKt$ButtonUnSub$2(modifier, aVar, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void CancelSubDialog(boolean z2, @NotNull a aVar, @NotNull a aVar2, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onUnSub");
        p0.a.s(aVar2, "onBack");
        ComposerImpl g2 = composer.g(1432063390);
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
            AndroidDialog_androidKt.a(CancelSubDialogKt$CancelSubDialog$1.INSTANCE, new DialogProperties(3), ComposableLambdaKt.c(-1081771476, new CancelSubDialogKt$CancelSubDialog$2(aVar, aVar2), g2), g2, 438, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CancelSubDialogKt$CancelSubDialog$3(z2, aVar, aVar2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextSubtitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1418289631);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("You are canceling your subscription. Package benefits will be used until the end of the term. You can re-register later.", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), inter, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CancelSubDialogKt$TextSubtitle$1(i2);
        }
    }
}
