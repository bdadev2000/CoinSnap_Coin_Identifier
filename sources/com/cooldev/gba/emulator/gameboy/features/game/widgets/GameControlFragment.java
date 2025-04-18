package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleKt;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.KindGame;
import com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigs;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeState;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GameControlFragment extends Fragment {
    public static final int $stable = 8;
    public GameViewModel gameViewModel;
    private boolean isLandscape;
    private RadialGamePad leftPad;
    public MenuGameViewModel menuGameViewModel;
    private RadialGamePad rightPad;
    public ThemeViewModel themeViewModel;

    @NotNull
    public final GameViewModel getGameViewModel() {
        GameViewModel gameViewModel = this.gameViewModel;
        if (gameViewModel != null) {
            return gameViewModel;
        }
        a.B0("gameViewModel");
        throw null;
    }

    @NotNull
    public final MenuGameViewModel getMenuGameViewModel() {
        MenuGameViewModel menuGameViewModel = this.menuGameViewModel;
        if (menuGameViewModel != null) {
            return menuGameViewModel;
        }
        a.B0("menuGameViewModel");
        throw null;
    }

    @NotNull
    public final ThemeViewModel getThemeViewModel() {
        ThemeViewModel themeViewModel = this.themeViewModel;
        if (themeViewModel != null) {
            return themeViewModel;
        }
        a.B0("themeViewModel");
        throw null;
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        a.s(layoutInflater, "inflater");
        return layoutInflater.inflate(this.isLandscape ? R.layout.fragment_double_pad_landscape : R.layout.fragment_double_pad, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        a.s(view, ViewHierarchyConstants.VIEW_KEY);
        if (this.gameViewModel == null || this.menuGameViewModel == null) {
            TouchConfigs touchConfigs = TouchConfigs.INSTANCE;
            KindGame kindGame = KindGame.GB_LEFT;
            HapticConfig hapticConfig = HapticConfig.PRESS;
            RadialGamePadConfig radialGamePadConfig$default = TouchConfigs.getRadialGamePadConfig$default(touchConfigs, kindGame, hapticConfig, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), null, 8, null);
            RadialGamePadConfig radialGamePadConfig$default2 = TouchConfigs.getRadialGamePadConfig$default(touchConfigs, KindGame.GB_RIGHT, hapticConfig, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), null, 8, null);
            Context requireContext = requireContext();
            a.r(requireContext, "requireContext(...)");
            this.leftPad = new RadialGamePad(radialGamePadConfig$default, 8.0f, requireContext, null, 0, 24, null);
            Context requireContext2 = requireContext();
            a.r(requireContext2, "requireContext(...)");
            this.rightPad = new RadialGamePad(radialGamePadConfig$default2, 8.0f, requireContext2, null, 0, 24, null);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.leftcontainer);
            RadialGamePad radialGamePad = this.leftPad;
            if (radialGamePad == null) {
                a.B0("leftPad");
                throw null;
            }
            frameLayout.addView(radialGamePad);
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.rightcontainer);
            RadialGamePad radialGamePad2 = this.rightPad;
            if (radialGamePad2 != null) {
                frameLayout2.addView(radialGamePad2);
                return;
            } else {
                a.B0("rightPad");
                throw null;
            }
        }
        ThemeState themeState = (ThemeState) getThemeViewModel().getState().getValue();
        GameState gameState = (GameState) getGameViewModel().getState().getValue();
        TouchConfigs touchConfigs2 = TouchConfigs.INSTANCE;
        GameData gameData = gameState.getGameData();
        a.p(gameData);
        KindGame leftConfig = gameData.getControllerConfig().getTouchControllerConfig().getLeftConfig();
        HapticConfig hapticConfig2 = HapticConfig.PRESS;
        RadialGamePadConfig radialGamePadConfig = touchConfigs2.getRadialGamePadConfig(leftConfig, hapticConfig2, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), themeState.getTheme());
        RadialGamePadConfig radialGamePadConfig2 = touchConfigs2.getRadialGamePadConfig(gameState.getGameData().getControllerConfig().getTouchControllerConfig().getRightConfig(), hapticConfig2, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), themeState.getTheme());
        Context requireContext3 = requireContext();
        a.r(requireContext3, "requireContext(...)");
        this.leftPad = new RadialGamePad(radialGamePadConfig, 8.0f, requireContext3, null, 0, 24, null);
        Context requireContext4 = requireContext();
        a.r(requireContext4, "requireContext(...)");
        this.rightPad = new RadialGamePad(radialGamePadConfig2, 8.0f, requireContext4, null, 0, 24, null);
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.leftcontainer);
        RadialGamePad radialGamePad3 = this.leftPad;
        if (radialGamePad3 == null) {
            a.B0("leftPad");
            throw null;
        }
        frameLayout3.addView(radialGamePad3);
        FrameLayout frameLayout4 = (FrameLayout) view.findViewById(R.id.rightcontainer);
        RadialGamePad radialGamePad4 = this.rightPad;
        if (radialGamePad4 == null) {
            a.B0("rightPad");
            throw null;
        }
        frameLayout4.addView(radialGamePad4);
        e.v(LifecycleKt.a(getLifecycle()), null, 0, new GameControlFragment$onViewCreated$1(this, gameState, null), 3);
    }

    public final void setGameViewModel(@NotNull GameViewModel gameViewModel) {
        a.s(gameViewModel, "<set-?>");
        this.gameViewModel = gameViewModel;
    }

    public final void setLandscape(boolean z2) {
        this.isLandscape = z2;
    }

    public final void setMenuGameViewModel(@NotNull MenuGameViewModel menuGameViewModel) {
        a.s(menuGameViewModel, "<set-?>");
        this.menuGameViewModel = menuGameViewModel;
    }

    public final void setThemeViewModel(@NotNull ThemeViewModel themeViewModel) {
        a.s(themeViewModel, "<set-?>");
        this.themeViewModel = themeViewModel;
    }
}
