package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.widgets.app_bar.CloseIconWidgetKt;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class AppbarMenuGameKt {
    @ComposableTarget
    @Composable
    public static final void AppbarMenuGame(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1543038229);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(MenuGameViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            MenuGameViewModel menuGameViewModel = (MenuGameViewModel) resolveViewModel;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier h2 = PaddingKt.h(SizeKt.e(companion, 48), 16, 0.0f, 2);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
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
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, g2, 48);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, companion);
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
            Updater.b(g2, a3, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            BoxKt.a(SizeKt.n(companion, 40), g2, 6);
            SpacerKt.a(rowScopeInstance.a(companion, 1.0f, true), g2);
            long b2 = TextUnitKt.b(40);
            long b3 = TextUnitKt.b(48);
            TextKt.b("Game Menu", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 3, b3, 16613336), g2, 6, 0, 65534);
            SpacerKt.a(rowScopeInstance.a(companion, 1.0f, true), g2);
            CloseIconWidgetKt.CloseIconWidget(new AppbarMenuGameKt$AppbarMenuGame$1$1$1(menuGameViewModel), g2, 0);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AppbarMenuGameKt$AppbarMenuGame$2(i2);
        }
    }
}
