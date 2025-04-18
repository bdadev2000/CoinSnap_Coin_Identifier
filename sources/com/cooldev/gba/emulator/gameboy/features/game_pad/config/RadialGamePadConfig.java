package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticConfig;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RadialGamePadConfig {
    public static final int $stable = 8;

    @NotNull
    private final GamePadTheme gamePadTheme;

    @NotNull
    private final HapticConfig haptic;
    private final boolean preferScreenTouchCoordinates;

    @NotNull
    private final PrimaryDialConfig primaryDial;

    @NotNull
    private final List<SecondaryDialConfig> secondaryDials;
    private final int sockets;

    @NotNull
    private final RadialGamePadTheme theme;

    /* JADX WARN: Multi-variable type inference failed */
    public RadialGamePadConfig(int i2, @NotNull PrimaryDialConfig primaryDialConfig, @NotNull List<? extends SecondaryDialConfig> list, @NotNull HapticConfig hapticConfig, @NotNull RadialGamePadTheme radialGamePadTheme, boolean z2, @NotNull GamePadTheme gamePadTheme) {
        a.s(primaryDialConfig, "primaryDial");
        a.s(list, "secondaryDials");
        a.s(hapticConfig, "haptic");
        a.s(radialGamePadTheme, RouterName.THEME);
        a.s(gamePadTheme, "gamePadTheme");
        this.sockets = i2;
        this.primaryDial = primaryDialConfig;
        this.secondaryDials = list;
        this.haptic = hapticConfig;
        this.theme = radialGamePadTheme;
        this.preferScreenTouchCoordinates = z2;
        this.gamePadTheme = gamePadTheme;
    }

    public static /* synthetic */ RadialGamePadConfig copy$default(RadialGamePadConfig radialGamePadConfig, int i2, PrimaryDialConfig primaryDialConfig, List list, HapticConfig hapticConfig, RadialGamePadTheme radialGamePadTheme, boolean z2, GamePadTheme gamePadTheme, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = radialGamePadConfig.sockets;
        }
        if ((i3 & 2) != 0) {
            primaryDialConfig = radialGamePadConfig.primaryDial;
        }
        PrimaryDialConfig primaryDialConfig2 = primaryDialConfig;
        if ((i3 & 4) != 0) {
            list = radialGamePadConfig.secondaryDials;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            hapticConfig = radialGamePadConfig.haptic;
        }
        HapticConfig hapticConfig2 = hapticConfig;
        if ((i3 & 16) != 0) {
            radialGamePadTheme = radialGamePadConfig.theme;
        }
        RadialGamePadTheme radialGamePadTheme2 = radialGamePadTheme;
        if ((i3 & 32) != 0) {
            z2 = radialGamePadConfig.preferScreenTouchCoordinates;
        }
        boolean z3 = z2;
        if ((i3 & 64) != 0) {
            gamePadTheme = radialGamePadConfig.gamePadTheme;
        }
        return radialGamePadConfig.copy(i2, primaryDialConfig2, list2, hapticConfig2, radialGamePadTheme2, z3, gamePadTheme);
    }

    public final int component1() {
        return this.sockets;
    }

    @NotNull
    public final PrimaryDialConfig component2() {
        return this.primaryDial;
    }

    @NotNull
    public final List<SecondaryDialConfig> component3() {
        return this.secondaryDials;
    }

    @NotNull
    public final HapticConfig component4() {
        return this.haptic;
    }

    @NotNull
    public final RadialGamePadTheme component5() {
        return this.theme;
    }

    public final boolean component6() {
        return this.preferScreenTouchCoordinates;
    }

    @NotNull
    public final GamePadTheme component7() {
        return this.gamePadTheme;
    }

    @NotNull
    public final RadialGamePadConfig copy(int i2, @NotNull PrimaryDialConfig primaryDialConfig, @NotNull List<? extends SecondaryDialConfig> list, @NotNull HapticConfig hapticConfig, @NotNull RadialGamePadTheme radialGamePadTheme, boolean z2, @NotNull GamePadTheme gamePadTheme) {
        a.s(primaryDialConfig, "primaryDial");
        a.s(list, "secondaryDials");
        a.s(hapticConfig, "haptic");
        a.s(radialGamePadTheme, RouterName.THEME);
        a.s(gamePadTheme, "gamePadTheme");
        return new RadialGamePadConfig(i2, primaryDialConfig, list, hapticConfig, radialGamePadTheme, z2, gamePadTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGamePadConfig)) {
            return false;
        }
        RadialGamePadConfig radialGamePadConfig = (RadialGamePadConfig) obj;
        return this.sockets == radialGamePadConfig.sockets && a.g(this.primaryDial, radialGamePadConfig.primaryDial) && a.g(this.secondaryDials, radialGamePadConfig.secondaryDials) && this.haptic == radialGamePadConfig.haptic && a.g(this.theme, radialGamePadConfig.theme) && this.preferScreenTouchCoordinates == radialGamePadConfig.preferScreenTouchCoordinates && this.gamePadTheme == radialGamePadConfig.gamePadTheme;
    }

    @NotNull
    public final GamePadTheme getGamePadTheme() {
        return this.gamePadTheme;
    }

    @NotNull
    public final HapticConfig getHaptic() {
        return this.haptic;
    }

    public final boolean getPreferScreenTouchCoordinates() {
        return this.preferScreenTouchCoordinates;
    }

    @NotNull
    public final PrimaryDialConfig getPrimaryDial() {
        return this.primaryDial;
    }

    @NotNull
    public final List<SecondaryDialConfig> getSecondaryDials() {
        return this.secondaryDials;
    }

    public final int getSockets() {
        return this.sockets;
    }

    @NotNull
    public final RadialGamePadTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.gamePadTheme.hashCode() + d.g(this.preferScreenTouchCoordinates, (this.theme.hashCode() + ((this.haptic.hashCode() + d.f(this.secondaryDials, (this.primaryDial.hashCode() + (Integer.hashCode(this.sockets) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "RadialGamePadConfig(sockets=" + this.sockets + ", primaryDial=" + this.primaryDial + ", secondaryDials=" + this.secondaryDials + ", haptic=" + this.haptic + ", theme=" + this.theme + ", preferScreenTouchCoordinates=" + this.preferScreenTouchCoordinates + ", gamePadTheme=" + this.gamePadTheme + ')';
    }

    public /* synthetic */ RadialGamePadConfig(int i2, PrimaryDialConfig primaryDialConfig, List list, HapticConfig hapticConfig, RadialGamePadTheme radialGamePadTheme, boolean z2, GamePadTheme gamePadTheme, int i3, k kVar) {
        this(i2, primaryDialConfig, list, (i3 & 8) != 0 ? HapticConfig.PRESS : hapticConfig, (i3 & 16) != 0 ? new RadialGamePadTheme(0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 1023, null) : radialGamePadTheme, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? GamePadTheme.Default : gamePadTheme);
    }
}
