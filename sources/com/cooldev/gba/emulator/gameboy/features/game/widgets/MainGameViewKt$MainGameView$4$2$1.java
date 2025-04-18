package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.State;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$4$2$1 extends r implements l {
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ State<Boolean> $isLandscape;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;
    final /* synthetic */ ThemeViewModel $themeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$4$2$1(State<Boolean> state, GameViewModel gameViewModel, MenuGameViewModel menuGameViewModel, ThemeViewModel themeViewModel) {
        super(1);
        this.$isLandscape = state;
        this.$gameViewModel = gameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
        this.$themeViewModel = themeViewModel;
    }

    @Override // q0.l
    @NotNull
    public final FragmentContainerView invoke(@NotNull Context context) {
        a.s(context, "ctx");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        State<Boolean> state = this.$isLandscape;
        GameViewModel gameViewModel = this.$gameViewModel;
        MenuGameViewModel menuGameViewModel = this.$menuGameViewModel;
        ThemeViewModel themeViewModel = this.$themeViewModel;
        fragmentContainerView.setId(View.generateViewId());
        GameControlFragment gameControlFragment = new GameControlFragment();
        gameControlFragment.setLandscape(((Boolean) state.getValue()).booleanValue());
        gameControlFragment.setGameViewModel(gameViewModel);
        gameControlFragment.setMenuGameViewModel(menuGameViewModel);
        gameControlFragment.setThemeViewModel(themeViewModel);
        FragmentTransaction d = ((AppCompatActivity) context).getSupportFragmentManager().d();
        d.g(fragmentContainerView.getId(), gameControlFragment);
        d.c();
        return fragmentContainerView;
    }
}
