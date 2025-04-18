package com.cooldev.gba.emulator.gameboy.router;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import com.cooldev.gba.emulator.gameboy.constants.MyKeys;
import com.cooldev.gba.emulator.gameboy.features.game.page.GamePageKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* renamed from: com.cooldev.gba.emulator.gameboy.router.ComposableSingletons$RouterDelegateKt$lambda-9$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$RouterDelegateKt$lambda9$1 extends r implements q0.r {
    public static final ComposableSingletons$RouterDelegateKt$lambda9$1 INSTANCE = new ComposableSingletons$RouterDelegateKt$lambda9$1();

    public ComposableSingletons$RouterDelegateKt$lambda9$1() {
        super(4);
    }

    @Override // q0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull AnimatedContentScope animatedContentScope, @NotNull NavBackStackEntry navBackStackEntry, @Nullable Composer composer, int i2) {
        SavedStateHandle b2;
        SavedStateHandle b3;
        a.s(animatedContentScope, "$this$composable");
        a.s(navBackStackEntry, "it");
        NavBackStackEntry i3 = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController().i();
        Boolean bool = null;
        Game game = (i3 == null || (b3 = i3.b()) == null) ? null : (Game) b3.b(MyKeys.GAME);
        if (i3 != null && (b2 = i3.b()) != null) {
            bool = (Boolean) b2.b(MyKeys.IS_RESTART);
        }
        GamePageKt.GamePage(game, bool, composer, 8);
    }
}
