package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import androidx.compose.runtime.internal.StabilityInferred;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FeatureFlagsConfig {
    public static final int $stable = 8;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    public FeatureFlagsConfig(@NotNull RemoteConfigService remoteConfigService) {
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
    }

    @Nullable
    public final Object fetchInAppUpdateRequirement(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.CONFIG_IN_APP_UPDATE_MODE, Boolean.FALSE, gVar);
    }

    @Nullable
    public final Object getAddGameNewFlow(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_SHOW_ADD_GAME_NEW_FLOW, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getFirstOpenRating(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_FIRST_OPEN_ONBOARDING, Boolean.TRUE, gVar);
    }

    @Nullable
    public final Object getFreePlayGame(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.FREE_PLAY_GAME, new Integer(2), gVar);
    }

    @Nullable
    public final Object getLimitAddGame(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.LIMIT_ADD_GAME, new Integer(3), gVar);
    }

    @Nullable
    public final Object getLimitPlayGame(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.LIMIT_PLAY_GAME, new Integer(3), gVar);
    }

    @Nullable
    public final Object getRatingOnboardingVisible(@NotNull g gVar) {
        return this.remoteConfigService.fetchConfigValue(RemoteConfigKeys.IS_SHOW_RATING_ONBOARDING, Boolean.TRUE, gVar);
    }
}
