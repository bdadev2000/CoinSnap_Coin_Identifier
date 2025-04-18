package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import android.support.v4.media.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void DownloadGuideSign(Modifier modifier, a aVar, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        ComposerImpl g2 = composer.g(-1832214998);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (g2.I(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= g2.w(aVar) ? 32 : 16;
        }
        int i6 = i4;
        if ((i6 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier modifier3 = i5 != 0 ? companion : modifier2;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, modifier3);
            ComposeUiNode.h8.getClass();
            a aVar2 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            Modifier modifier4 = modifier3;
            ImageKt.a(PainterResources_androidKt.a(R.drawable.download_guide_sign, g2, 0), null, SizeKt.d(companion, 1.0f), null, ContentScale.Companion.d, 0.0f, null, g2, 25016, 104);
            Painter a2 = PainterResources_androidKt.a(MyImages.INSTANCE.getIcClose(), g2, 6);
            Modifier a3 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 0.0f, 4, 21, 0.0f, 9), 11), Alignment.Companion.f14661c);
            g2.J(-87165678);
            boolean z2 = (i6 & 112) == 32;
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new PopupFileAndDownloadKt$DownloadGuideSign$1$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            ImageKt.a(a2, null, ClickableKt.c(a3, false, null, (a) u2, 7), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
            modifier2 = modifier4;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PopupFileAndDownloadKt$DownloadGuideSign$2(modifier2, aVar, i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ee, code lost:
    
        if (p0.a.g(r15.u(), java.lang.Integer.valueOf(r8)) == false) goto L63;
     */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.jvm.internal.r, q0.q] */
    @androidx.compose.runtime.ComposableTarget
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PopupFileAndDownload(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view.PopupFileAndDownloadKt.PopupFileAndDownload(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }

    private static final float PopupFileAndDownload$lambda$1(MutableState<Dp> mutableState) {
        return ((Dp) mutableState.getValue()).f17486a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupFileAndDownload$lambda$2(MutableState<Dp> mutableState, float f2) {
        mutableState.setValue(new Dp(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToGuide(AddGameViewModel addGameViewModel) {
        MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo(RouterName.GUIDE);
        addGameViewModel.hidePopupSelect();
    }
}
