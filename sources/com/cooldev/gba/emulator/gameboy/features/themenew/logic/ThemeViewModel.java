package com.cooldev.gba.emulator.gameboy.features.themenew.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class ThemeViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final g1 state;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final ThemeState invoke(@NotNull ThemeState themeState) {
            a.s(themeState, "it");
            return themeState.copy(GamePadTheme.Default);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements l {
        final /* synthetic */ GamePadTheme $theme;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(GamePadTheme gamePadTheme) {
            super(1);
            this.$theme = gamePadTheme;
        }

        @Override // q0.l
        @NotNull
        public final ThemeState invoke(@NotNull ThemeState themeState) {
            a.s(themeState, "it");
            return themeState.copy(this.$theme);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeViewModel(@NotNull Application application, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(iAPViewModel, "iapViewModel");
        Context applicationContext = application.getApplicationContext();
        this.context = applicationContext;
        i1 c2 = t0.c(new ThemeState(null, 1, 0 == true ? 1 : 0));
        this._state = c2;
        this.state = new o0(c2);
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        a.r(applicationContext, "context");
        GamePadTheme gamePadTheme = appPrefUtils.getGamePadTheme(applicationContext);
        if (((IAPState) iAPViewModel.getState().getValue()).isPremium() || !gamePadTheme.getLock()) {
            updateState(new AnonymousClass2(gamePadTheme));
        } else {
            updateState(AnonymousClass1.INSTANCE);
        }
    }

    private final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void onSelect(@NotNull GamePadTheme gamePadTheme) {
        a.s(gamePadTheme, RouterName.THEME);
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        if (appPrefUtils.addGamePadTheme(context, gamePadTheme)) {
            updateState(new ThemeViewModel$onSelect$1(gamePadTheme));
        }
    }
}
