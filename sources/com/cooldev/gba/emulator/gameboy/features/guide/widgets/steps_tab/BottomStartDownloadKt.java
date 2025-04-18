package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.guide.logic.GuideViewModel;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class BottomStartDownloadKt {
    @ComposableTarget
    @Composable
    public static final void BottomStartDownload(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1634533999);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(GuideViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            GuideViewModel guideViewModel = (GuideViewModel) resolveViewModel;
            Modifier h2 = PaddingKt.h(BackgroundKt.a(Modifier.Companion.f14687a, MyColors.INSTANCE.m25getText200d7_KjU(), RectangleShapeKt.f15014a), 0.0f, 14, 1);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            ButtonDownload(new BottomStartDownloadKt$BottomStartDownload$1$1(guideViewModel, context), g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomStartDownloadKt$BottomStartDownload$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ButtonDownload(a aVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1225245040);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            BottomStartDownloadKt$ButtonDownload$$inlined$debounced$1 bottomStartDownloadKt$ButtonDownload$$inlined$debounced$1 = new BottomStartDownloadKt$ButtonDownload$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier h2 = PaddingKt.h(SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 52), 16, 0.0f, 2);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-1704340607);
            boolean I = g2.I(bottomStartDownloadKt$ButtonDownload$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new BottomStartDownloadKt$ButtonDownload$1$1(bottomStartDownloadKt$ButtonDownload$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            ButtonKt.a((a) u2, h2, false, a3, a4, null, null, a2, null, ComposableSingletons$BottomStartDownloadKt.INSTANCE.m213getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BottomStartDownloadKt$ButtonDownload$2(aVar, i2);
        }
    }
}
