package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.page;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets.AppbarSaveGameKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets.LayerBlackSaveGameKt;
import d0.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class SaveGameOverlayKt {
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.internal.r, q0.q] */
    @ComposableTarget
    @Composable
    public static final void SaveGameOverlay(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1924026681);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(SaveGameViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            SaveGameViewModel saveGameViewModel = (SaveGameViewModel) resolveViewModel;
            g2.t(-1614864554);
            ViewModelStoreOwner a3 = LocalViewModelStoreOwner.a(g2);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel2 = GetViewModelKt.resolveViewModel(g0.a(MenuGameViewModel.class), a3.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a3, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            MenuGameViewModel menuGameViewModel = (MenuGameViewModel) resolveViewModel2;
            g2.t(-1614864554);
            ViewModelStoreOwner a4 = LocalViewModelStoreOwner.a(g2);
            if (a4 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel3 = GetViewModelKt.resolveViewModel(g0.a(GameViewModel.class), a4.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a4, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            GameViewModel gameViewModel = (GameViewModel) resolveViewModel3;
            GameState gameState = (GameState) SnapshotStateKt.b(gameViewModel.getState(), g2, 8).getValue();
            EffectsKt.c(b0.f30125a, new SaveGameOverlayKt$SaveGameOverlay$1(saveGameViewModel), g2);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            FillElement fillElement = SizeKt.f4107c;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, fillElement);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            LayerBlackSaveGameKt.LayerBlackSaveGame(fillElement, g2, 6);
            Modifier a5 = ComposedModifierKt.a(companion, new r(3));
            ColumnMeasurePolicy a6 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, a5);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a6, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            AppbarSaveGameKt.AppbarSaveGame(g2, 0);
            SpacerKt.a(SizeKt.e(companion, 48), g2);
            LazyDslKt.a(PaddingKt.h(companion, 16, 0.0f, 2), null, null, false, Arrangement.g(39), Alignment.Companion.f14670n, null, false, new SaveGameOverlayKt$SaveGameOverlay$2$1$1(gameState, gameViewModel, saveGameViewModel, menuGameViewModel), g2, 221190, 206);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SaveGameOverlayKt$SaveGameOverlay$3(i2);
        }
    }
}
