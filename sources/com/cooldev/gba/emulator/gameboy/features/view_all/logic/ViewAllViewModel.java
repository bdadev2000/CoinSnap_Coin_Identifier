package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.cooldev.gba.emulator.gameboy.constants.MyKeys;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.view_all.enums.TypeViewAll;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePlayCounter;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameEvents;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import e0.u;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class ViewAllViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;

    @NotNull
    private final String id;

    @NotNull
    private final LoadingDialogViewModel loadingDialogViewModel;

    @NotNull
    private final PaywallNavigationViewModel paywallNavigationViewModel;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel(@NotNull Application application, @NotNull LoadingDialogViewModel loadingDialogViewModel, @NotNull String str, @NotNull RemoteConfigService remoteConfigService, @NotNull PaywallNavigationViewModel paywallNavigationViewModel, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(loadingDialogViewModel, "loadingDialogViewModel");
        a.s(str, "id");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(paywallNavigationViewModel, "paywallNavigationViewModel");
        a.s(iAPViewModel, "iapViewModel");
        this.loadingDialogViewModel = loadingDialogViewModel;
        this.id = str;
        this.remoteConfigService = remoteConfigService;
        this.paywallNavigationViewModel = paywallNavigationViewModel;
        this.iapViewModel = iAPViewModel;
        this.context = application.getApplicationContext();
        i1 c2 = t0.c(new ViewAllState(null, null, 0L, false, 0, false, 63, null));
        this._state = c2;
        this.state = new o0(c2);
        fetchDataRemoteConfig();
        fetchGamesInAppLocal();
    }

    private final void fetchDataRemoteConfig() {
        e.v(ViewModelKt.a(this), null, 0, new ViewAllViewModel$fetchDataRemoteConfig$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchGamesInAppLocal() {
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        List<Game> allGames = gamePrefUtils.getAllGames(context);
        if (a.g(this.id, TypeViewAll.FAVORITE.getId())) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : allGames) {
                if (((Game) obj).isFavorite()) {
                    arrayList.add(obj);
                }
            }
            allGames = arrayList;
        }
        updateState(new ViewAllViewModel$fetchGamesInAppLocal$1(u.T0(allGames, new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel$fetchGamesInAppLocal$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return q.c(((Game) t3).getUpdatedAtInMillis(), ((Game) t2).getUpdatedAtInMillis());
            }
        })));
    }

    private final void navigateToGame(Game game, boolean z2) {
        SavedStateHandle b2;
        SavedStateHandle b3;
        if (((ViewAllState) ((i1) this._state).getValue()).isNewFlow()) {
            GamePlayCounter gamePlayCounter = GamePlayCounter.INSTANCE;
            Context context = this.context;
            a.r(context, "context");
            Context context2 = this.context;
            a.r(context2, "context");
            gamePlayCounter.setFreePlayCounter(context, gamePlayCounter.getFreePlayCounter(context2) + 1);
        } else if (!((IAPState) this.iapViewModel.getState().getValue()).isPremium()) {
            GamePlayCounter gamePlayCounter2 = GamePlayCounter.INSTANCE;
            Context context3 = this.context;
            a.r(context3, "context");
            Context context4 = this.context;
            a.r(context4, "context");
            gamePlayCounter2.setGamePlayCounter(context3, gamePlayCounter2.getGamePlayCounter(context4) + 1);
        }
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context5 = this.context;
        a.r(context5, "context");
        gamePrefUtils.updateGameLastPlayedAndTime(context5, game.getId());
        NavHostController getNavController = MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().getGetNavController();
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) getNavController.f20349g.j();
        if (navBackStackEntry != null && (b3 = navBackStackEntry.b()) != null) {
            b3.c(game, MyKeys.GAME);
        }
        if (navBackStackEntry != null && (b2 = navBackStackEntry.b()) != null) {
            b2.c(Boolean.valueOf(z2), MyKeys.IS_RESTART);
        }
        GameEvents.INSTANCE.logViewPlayGame();
        NavController.m(getNavController, RouterName.GAME, null, 6);
    }

    public static /* synthetic */ void onSelectGame$default(ViewAllViewModel viewAllViewModel, Game game, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        viewAllViewModel.onSelectGame(game, z2);
    }

    private final boolean shouldNavigateToGame() {
        int gamePlayCounter;
        if (((IAPState) this.iapViewModel.getState().getValue()).isPremium()) {
            return true;
        }
        if (((ViewAllState) ((i1) this._state).getValue()).isNewFlow()) {
            GamePlayCounter gamePlayCounter2 = GamePlayCounter.INSTANCE;
            Context context = this.context;
            a.r(context, "context");
            gamePlayCounter = gamePlayCounter2.getFreePlayCounter(context);
        } else {
            GamePlayCounter gamePlayCounter3 = GamePlayCounter.INSTANCE;
            Context context2 = this.context;
            a.r(context2, "context");
            gamePlayCounter = gamePlayCounter3.getGamePlayCounter(context2);
        }
        return gamePlayCounter < ((ViewAllState) this.state.getValue()).getNumberLimitPlayGame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    public final void addToFavorite() {
        e.v(ViewModelKt.a(this), null, 0, new ViewAllViewModel$addToFavorite$1(this, null), 3);
    }

    /* renamed from: applyTouchPoint-k-4lQ0M, reason: not valid java name */
    public final void m369applyTouchPointk4lQ0M(long j2) {
        updateState(new ViewAllViewModel$applyTouchPoint$1(j2));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void hideDialogRemoveGame() {
        updateState(ViewAllViewModel$hideDialogRemoveGame$1.INSTANCE);
    }

    public final void hidePopupMenuGame() {
        m369applyTouchPointk4lQ0M(0L);
    }

    public final void onSelectGame(@NotNull Game game, boolean z2) {
        a.s(game, RouterName.GAME);
        if (shouldNavigateToGame()) {
            navigateToGame(game, z2);
        } else {
            this.paywallNavigationViewModel.navigateToPaywall();
        }
    }

    public final void removeFromFavorite() {
        e.v(ViewModelKt.a(this), null, 0, new ViewAllViewModel$removeFromFavorite$1(this, null), 3);
    }

    public final void removeGame() {
        e.v(ViewModelKt.a(this), null, 0, new ViewAllViewModel$removeGame$1(this, null), 3);
    }

    public final void restartGame() {
        Game currentGameForPopupMenu = ((ViewAllState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        if (currentGameForPopupMenu == null) {
            b0.a.b(this.context, "An error occurred while removing the game.").show();
            return;
        }
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        this.loadingDialogViewModel.showDialog();
        onSelectGame(currentGameForPopupMenu, true);
        updateState(ViewAllViewModel$restartGame$1$1.INSTANCE);
        loadingDialogViewModel.hideDialog();
    }

    public final void resumeGame() {
        Game currentGameForPopupMenu = ((ViewAllState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        if (currentGameForPopupMenu == null) {
            b0.a.b(this.context, "An error occurred while removing the game.").show();
            return;
        }
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        this.loadingDialogViewModel.showDialog();
        onSelectGame$default(this, currentGameForPopupMenu, false, 2, null);
        updateState(ViewAllViewModel$resumeGame$1$1.INSTANCE);
        loadingDialogViewModel.hideDialog();
    }

    public final void showDialogRemoveGame() {
        updateState(ViewAllViewModel$showDialogRemoveGame$1.INSTANCE);
    }

    public final void showPopupMenuGame(@NotNull Game game) {
        a.s(game, RouterName.GAME);
        updateState(new ViewAllViewModel$showPopupMenuGame$1(game));
    }
}
