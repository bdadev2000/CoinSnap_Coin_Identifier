package com.cooldev.gba.emulator.gameboy.features.dialogs.survey_dialog;

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
import androidx.compose.runtime.EffectsKt;
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
import d0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes2.dex */
public final class SurveyDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonCustom(int i2, a aVar, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(401414475);
        if ((i3 & 14) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            SurveyDialogKt$ButtonCustom$$inlined$debounced$1 surveyDialogKt$ButtonCustom$$inlined$debounced$1 = new SurveyDialogKt$ButtonCustom$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier n2 = SizeKt.n(Modifier.Companion.f14687a, 56);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-968569613);
            boolean I = g2.I(surveyDialogKt$ButtonCustom$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new SurveyDialogKt$ButtonCustom$1$1(surveyDialogKt$ButtonCustom$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, n2, false, a3, a4, null, null, a2, null, ComposableLambdaKt.c(1965034331, new SurveyDialogKt$ButtonCustom$2(i2), g2), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SurveyDialogKt$ButtonCustom$3(i2, aVar, i3);
        }
    }

    @ComposableTarget
    @Composable
    public static final void SurveyDialog(boolean z2, @NotNull a aVar, @NotNull a aVar2, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onLike");
        p0.a.s(aVar2, "onDislike");
        ComposerImpl g2 = composer.g(-1709582705);
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
            EffectsKt.f(b0.f30125a, new SurveyDialogKt$SurveyDialog$1(null), g2);
            AndroidDialog_androidKt.a(SurveyDialogKt$SurveyDialog$2.INSTANCE, new DialogProperties(false, false, false), ComposableLambdaKt.c(-426148707, new SurveyDialogKt$SurveyDialog$3(aVar2, aVar), g2), g2, 438, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SurveyDialogKt$SurveyDialog$4(z2, aVar, aVar2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextTitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(29257970);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("Do you want to change the game theme while playing the game?", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, b2, new FontWeight(400), inter, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SurveyDialogKt$TextTitle$1(i2);
        }
    }
}
