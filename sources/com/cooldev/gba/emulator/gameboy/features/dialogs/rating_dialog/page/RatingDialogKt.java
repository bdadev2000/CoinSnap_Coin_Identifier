package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page;

import android.content.Context;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingState;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.RatingDialogEvents;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes.dex */
public final class RatingDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonCancel(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-2041408309);
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
            RatingDialogKt$ButtonCancel$$inlined$debounced$1 ratingDialogKt$ButtonCancel$$inlined$debounced$1 = new RatingDialogKt$ButtonCancel$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-1235254822);
            boolean I = g2.I(ratingDialogKt$ButtonCancel$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new RatingDialogKt$ButtonCancel$1$1(ratingDialogKt$ButtonCancel$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$RatingDialogKt.INSTANCE.m174getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RatingDialogKt$ButtonCancel$2(modifier, aVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonSubmit(Modifier modifier, a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(107123689);
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
            RatingDialogKt$ButtonSubmit$$inlined$debounced$1 ratingDialogKt$ButtonSubmit$$inlined$debounced$1 = new RatingDialogKt$ButtonSubmit$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.d(modifier, 1.0f), 52);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(1115881848);
            boolean I = g2.I(ratingDialogKt$ButtonSubmit$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new RatingDialogKt$ButtonSubmit$1$1(ratingDialogKt$ButtonSubmit$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$RatingDialogKt.INSTANCE.m173getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889280, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RatingDialogKt$ButtonSubmit$2(modifier, aVar, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void RatingDialog(boolean z2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(822512489);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                z2 = true;
            }
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(OnboardingViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            OnboardingViewModel onboardingViewModel = (OnboardingViewModel) u2;
            OnboardingState onboardingState = (OnboardingState) SnapshotStateKt.b(onboardingViewModel.getState(), g2, 8).getValue();
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            if (onboardingState.isRatingOnboardingVisible()) {
                RatingDialogEvents.INSTANCE.logRatingDialogVisible();
                g2.t(-1614864554);
                ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
                if (a2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(RatingDialogViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
                g2.V(false);
                RatingDialogViewModel ratingDialogViewModel = (RatingDialogViewModel) resolveViewModel;
                AndroidDialog_androidKt.a(RatingDialogKt$RatingDialog$1.INSTANCE, new DialogProperties(3), ComposableLambdaKt.c(-843232485, new RatingDialogKt$RatingDialog$2(ratingDialogViewModel, onboardingViewModel, z2, context, (RatingDialogState) SnapshotStateKt.b(ratingDialogViewModel.getState(), g2, 8).getValue()), g2), g2, 438, 0);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RatingDialogKt$RatingDialog$3(z2, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextSubtitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1985964409);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(16);
            long b3 = TextUnitKt.b(24);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("You are Amazing", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m36getText60d7_KjU(), b2, new FontWeight(400), inter, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RatingDialogKt$TextSubtitle$1(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void TextTitle(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-118125135);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(40);
            long b3 = TextUnitKt.b(48);
            FontFamily determinationSans = MyFonts.INSTANCE.getDeterminationSans();
            TextKt.b("Rate Your\nExperience", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m36getText60d7_KjU(), b2, new FontWeight(400), determinationSans, 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new RatingDialogKt$TextTitle$1(i2);
        }
    }
}
