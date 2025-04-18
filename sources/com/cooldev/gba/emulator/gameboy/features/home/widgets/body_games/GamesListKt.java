package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class GamesListKt {
    @ComposableTarget
    @Composable
    public static final void GamesList(@NotNull List<Game> list, boolean z2, @Nullable Composer composer, int i2) {
        a.s(list, "games");
        ComposerImpl g2 = composer.g(-482395683);
        if (z2) {
            g2.J(-1096948884);
            LazyListState a2 = LazyListStateKt.a(0, g2, 3);
            g2.J(2042826649);
            boolean I = g2.I(a2);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new GamesListKt$GamesList$1$1(a2, null);
                g2.o(u2);
            }
            g2.V(false);
            EffectsKt.f(list, (p) u2, g2);
            LazyDslKt.b(null, a2, PaddingKt.a(2, 16), false, Arrangement.g(8), Alignment.Companion.f14667k, null, false, new GamesListKt$GamesList$2(list), g2, 221568, 201);
            g2.V(false);
        } else {
            g2.J(-1096456139);
            Modifier h2 = PaddingKt.h(Modifier.Companion.f14687a, 16, 0.0f, 2);
            ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.g(8), Alignment.Companion.f14670n, g2, 54);
            int i3 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, h2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
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
            Updater.b(g2, a3, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i3))) {
                d.x(i3, g2, i3, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            g2.J(1190041863);
            for (Game game : list) {
                g2.y(1190043027, game);
                ItemCardGameVerticalKt.ItemCardGameVertical(game, g2, 8);
                g2.V(false);
            }
            g2.V(false);
            g2.V(true);
            g2.V(false);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GamesListKt$GamesList$4(list, z2, i2);
        }
    }
}
