package com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class StarRatingKt {
    @ComposableTarget
    @Composable
    public static final void StarItem(boolean z2, @NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(831899707);
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
        } else {
            MyImages myImages = MyImages.INSTANCE;
            Painter a2 = PainterResources_androidKt.a(z2 ? myImages.getStar1() : myImages.getStar(), g2, 0);
            float f2 = 32;
            Modifier h2 = PaddingKt.h(SizeKt.e(SizeKt.r(Modifier.Companion.f14687a, f2), f2), 2, 0.0f, 2);
            g2.J(1517155994);
            boolean z3 = (i3 & 112) == 32;
            Object u2 = g2.u();
            if (z3 || u2 == Composer.Companion.f13690a) {
                u2 = new StarRatingKt$StarItem$1$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            ImageKt.a(a2, null, ClickableKt.c(h2, false, null, (a) u2, 7), null, null, 0.0f, null, g2, 56, 120);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new StarRatingKt$StarItem$2(z2, aVar, i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void StarRating(@NotNull RatingDialogViewModel ratingDialogViewModel, @Nullable Composer composer, int i2) {
        p0.a.s(ratingDialogViewModel, "ratingDialogViewModel");
        ComposerImpl g2 = composer.g(-1377714096);
        RatingDialogState ratingDialogState = (RatingDialogState) SnapshotStateKt.b(ratingDialogViewModel.getState(), g2, 8).getValue();
        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        RowMeasurePolicy a2 = RowKt.a(arrangement$Center$1, vertical, g2, 54);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c2 = ComposedModifierKt.c(g2, companion);
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
        Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
        Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
        p pVar = ComposeUiNode.Companion.f15900i;
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar);
        }
        Updater.b(g2, c2, ComposeUiNode.Companion.d);
        g2.J(-262967597);
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 >= 5) {
                break;
            }
            if (i4 >= ratingDialogState.getRating()) {
                z2 = false;
            }
            StarItem(z2, new StarRatingKt$StarRating$1$1$1(ratingDialogViewModel, i4), g2, 0);
            i4++;
        }
        g2.V(false);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new StarRatingKt$StarRating$2(ratingDialogViewModel, i2);
        }
    }
}
