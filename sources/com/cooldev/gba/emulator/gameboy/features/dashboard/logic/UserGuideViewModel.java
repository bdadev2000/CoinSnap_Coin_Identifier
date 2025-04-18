package com.cooldev.gba.emulator.gameboy.features.dashboard.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class UserGuideViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _guideState;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;
    private boolean firstOpenApp;

    @NotNull
    private final g1 guideState;
    private boolean isShowAddApp;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    /* loaded from: classes.dex */
    public interface GuideState {

        @StabilityInferred
        /* loaded from: classes.dex */
        public static final class DownloadGuide implements GuideState {
            public static final int $stable = 0;
            private final boolean userGuide;

            public DownloadGuide(boolean z2) {
                this.userGuide = z2;
            }

            public static /* synthetic */ DownloadGuide copy$default(DownloadGuide downloadGuide, boolean z2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z2 = downloadGuide.userGuide;
                }
                return downloadGuide.copy(z2);
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            @NotNull
            public GuideState closeUserGuide() {
                return copy(false);
            }

            public final boolean component1() {
                return this.userGuide;
            }

            @NotNull
            public final DownloadGuide copy(boolean z2) {
                return new DownloadGuide(z2);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DownloadGuide) && this.userGuide == ((DownloadGuide) obj).userGuide;
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            public boolean getUserGuide() {
                return this.userGuide;
            }

            public int hashCode() {
                return Boolean.hashCode(this.userGuide);
            }

            @NotNull
            public String toString() {
                return d.s(new StringBuilder("DownloadGuide(userGuide="), this.userGuide, ')');
            }
        }

        @StabilityInferred
        /* loaded from: classes.dex */
        public static final class EndGuide implements GuideState {
            public static final int $stable = 0;

            @NotNull
            public static final EndGuide INSTANCE = new EndGuide();

            private EndGuide() {
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            @NotNull
            public GuideState closeUserGuide() {
                return INSTANCE;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EndGuide)) {
                    return false;
                }
                return true;
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            public boolean getUserGuide() {
                return false;
            }

            public int hashCode() {
                return -430248156;
            }

            @NotNull
            public String toString() {
                return "EndGuide";
            }
        }

        @StabilityInferred
        /* loaded from: classes.dex */
        public static final class TrialGame implements GuideState {
            public static final int $stable = 0;
            private final boolean userGuide;

            public TrialGame(boolean z2) {
                this.userGuide = z2;
            }

            public static /* synthetic */ TrialGame copy$default(TrialGame trialGame, boolean z2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z2 = trialGame.userGuide;
                }
                return trialGame.copy(z2);
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            @NotNull
            public GuideState closeUserGuide() {
                return copy(false);
            }

            public final boolean component1() {
                return this.userGuide;
            }

            @NotNull
            public final TrialGame copy(boolean z2) {
                return new TrialGame(z2);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TrialGame) && this.userGuide == ((TrialGame) obj).userGuide;
            }

            @Override // com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel.GuideState
            public boolean getUserGuide() {
                return this.userGuide;
            }

            public int hashCode() {
                return Boolean.hashCode(this.userGuide);
            }

            @NotNull
            public String toString() {
                return d.s(new StringBuilder("TrialGame(userGuide="), this.userGuide, ')');
            }
        }

        @NotNull
        GuideState closeUserGuide();

        boolean getUserGuide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGuideViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        this.remoteConfigService = remoteConfigService;
        this.context = application.getApplicationContext();
        this.firstOpenApp = true;
        i1 c2 = t0.c(GuideState.EndGuide.INSTANCE);
        this._guideState = c2;
        this.guideState = new o0(c2);
        fetchDataRemoteConfig();
    }

    private final void fetchDataRemoteConfig() {
        e.v(ViewModelKt.a(this), null, 0, new UserGuideViewModel$fetchDataRemoteConfig$1(this, null), 3);
    }

    public final void closeUserGuide() {
        m0 m0Var = this._guideState;
        ((i1) m0Var).h(((GuideState) ((i1) m0Var).getValue()).closeUserGuide());
    }

    public final void endUserGuideAtDownloadGuide() {
        if (((i1) this._guideState).getValue() instanceof GuideState.DownloadGuide) {
            moveToNextGuide();
        }
    }

    public final boolean getDataRemote() {
        return !(((i1) this._guideState).getValue() instanceof GuideState.EndGuide);
    }

    @NotNull
    public final g1 getGuideState() {
        return this.guideState;
    }

    public final void moveToNextGuide() {
        GuideState guideState = (GuideState) ((i1) this._guideState).getValue();
        if (guideState instanceof GuideState.TrialGame) {
            ((i1) this._guideState).h(new GuideState.DownloadGuide(true));
        } else {
            if (!(guideState instanceof GuideState.DownloadGuide)) {
                a.g(guideState, GuideState.EndGuide.INSTANCE);
                return;
            }
            ((i1) this._guideState).h(GuideState.EndGuide.INSTANCE);
        }
    }

    public final void turnOffUserGuide() {
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        appPrefUtils.setValueShouldShowUserGuide(context);
    }
}
