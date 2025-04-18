package com.cooldev.gba.emulator.gameboy.features.game_pad;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadConfig;
import com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.KindGame;
import com.cooldev.gba.emulator.gameboy.features.home.models.touch_config.TouchConfigs;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GameControlFragment1 extends Fragment {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        a.s(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_double_pad, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        a.s(view, ViewHierarchyConstants.VIEW_KEY);
        TouchConfigs touchConfigs = TouchConfigs.INSTANCE;
        KindGame kindGame = KindGame.PSP_LEFT;
        HapticConfig hapticConfig = HapticConfig.PRESS;
        RadialGamePadConfig radialGamePadConfig$default = TouchConfigs.getRadialGamePadConfig$default(touchConfigs, kindGame, hapticConfig, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), null, 8, null);
        RadialGamePadConfig radialGamePadConfig$default2 = TouchConfigs.getRadialGamePadConfig$default(touchConfigs, KindGame.PSP_RIGHT, hapticConfig, new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null), null, 8, null);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.leftcontainer);
        Context requireContext = requireContext();
        a.r(requireContext, "requireContext(...)");
        frameLayout.addView(new RadialGamePad(radialGamePadConfig$default, 8.0f, requireContext, null, 0, 24, null));
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.rightcontainer);
        Context requireContext2 = requireContext();
        a.r(requireContext2, "requireContext(...)");
        frameLayout2.addView(new RadialGamePad(radialGamePadConfig$default2, 8.0f, requireContext2, null, 0, 24, null));
    }
}
