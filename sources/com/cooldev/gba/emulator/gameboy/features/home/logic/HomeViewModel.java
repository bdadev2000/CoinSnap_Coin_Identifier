package com.cooldev.gba.emulator.gameboy.features.home.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.UriPermission;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.constants.MyKeys;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePlayCounter;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePrefUtils;
import com.cooldev.gba.emulator.gameboy.local.storage.RewardAdCounter;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameEvents;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.facebook.share.internal.ShareConstants;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class HomeViewModel extends AndroidViewModel {
    public static final int $stable = 8;

    @NotNull
    private final m0 _state;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;

    @NotNull
    private final LoadingDialogViewModel loadingDialogViewModel;

    @NotNull
    private final PaywallNavigationViewModel paywallNavigationViewModel;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel(@NotNull Application application, @NotNull LoadingDialogViewModel loadingDialogViewModel, @NotNull RemoteConfigService remoteConfigService, @NotNull PaywallNavigationViewModel paywallNavigationViewModel, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(loadingDialogViewModel, "loadingDialogViewModel");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(paywallNavigationViewModel, "paywallNavigationViewModel");
        a.s(iAPViewModel, "iapViewModel");
        this.loadingDialogViewModel = loadingDialogViewModel;
        this.remoteConfigService = remoteConfigService;
        this.paywallNavigationViewModel = paywallNavigationViewModel;
        this.iapViewModel = iAPViewModel;
        this.context = application.getApplicationContext();
        i1 c2 = t0.c(new HomeState(null, null, false, null, 0L, false, 0, 0, 0, false, false, false, false, false, false, false, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null));
        this._state = c2;
        this.state = new o0(c2);
        fetchDataRemoteConfig();
        fetchGamesInAppLocal();
    }

    private final void fetchDataRemoteConfig() {
        e.v(ViewModelKt.a(this), null, 0, new HomeViewModel$fetchDataRemoteConfig$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleGameAdditionResult(List<Game> list) {
        if (!list.isEmpty()) {
            fetchGamesInAppLocal();
            GameEvents.INSTANCE.logAddGame(list.size());
            b0.a.c(this.context, "Games have been successfully added to your list!").show();
            return true;
        }
        Context context = this.context;
        Typeface typeface = b0.a.f22277a;
        b0.a.a(context, "No new games were added. Please check the files and try again.", AppCompatResources.a(context, 2131231102), ContextCompat.getColor(context, R.color.infoColor), ContextCompat.getColor(context, R.color.defaultTextColor)).show();
        return false;
    }

    private final void navigateToGame(Game game, boolean z2) {
        SavedStateHandle b2;
        SavedStateHandle b3;
        if (((HomeState) ((i1) this._state).getValue()).isNewFlow()) {
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

    public static /* synthetic */ void onSelectGame$default(HomeViewModel homeViewModel, Game game, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        homeViewModel.onSelectGame(game, z2, z3);
    }

    public static /* synthetic */ boolean shouldNavigateToGame$default(HomeViewModel homeViewModel, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return homeViewModel.shouldNavigateToGame(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePersistableUris(Uri uri) {
        List<UriPermission> persistedUriPermissions = this.context.getContentResolver().getPersistedUriPermissions();
        a.r(persistedUriPermissions, "getPersistedUriPermissions(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : persistedUriPermissions) {
            if (((UriPermission) obj).isReadPermission()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (true ^ a.g(((UriPermission) obj2).getUri(), uri)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.context.getContentResolver().releasePersistableUriPermission(((UriPermission) it.next()).getUri(), 1);
        }
        this.context.getContentResolver().takePersistableUriPermission(uri, 1);
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
        Game currentGameForPopupMenu;
        String id;
        try {
            currentGameForPopupMenu = ((HomeState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (currentGameForPopupMenu != null && (id = currentGameForPopupMenu.getId()) != null) {
            this.loadingDialogViewModel.showDialog();
            GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
            Context context = this.context;
            a.r(context, "context");
            if (gamePrefUtils.updateGameFavoriteStatus(context, id, true)) {
                fetchGamesInAppLocal();
                b0.a.c(this.context, "Game added to favorites successfully!").show();
            } else {
                b0.a.b(this.context, "Failed to add game to favorites. Please try again.").show();
            }
            updateState(HomeViewModel$addToFavorite$1$1.INSTANCE);
            return;
        }
        b0.a.b(this.context, "An error occurred while adding the game to favorites.").show();
    }

    /* renamed from: applyTouchPoint-k-4lQ0M, reason: not valid java name */
    public final void m218applyTouchPointk4lQ0M(long j2) {
        updateState(new HomeViewModel$applyTouchPoint$1(j2));
    }

    public final void fetchGamesInAppLocal() {
        GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        updateState(new HomeViewModel$fetchGamesInAppLocal$1(gamePrefUtils.getAllGames(context)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    public final void fetchGamesInFolder(@NotNull Uri uri, @NotNull q0.a aVar) {
        a.s(uri, ShareConstants.MEDIA_URI);
        a.s(aVar, "showInAppReview");
        e.v(ViewModelKt.a(this), null, 0, new HomeViewModel$fetchGamesInFolder$1(this, uri, new Object(), aVar, null), 3);
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    public final void hideDialogRemoveGame() {
        updateState(HomeViewModel$hideDialogRemoveGame$1.INSTANCE);
    }

    public final void hidePopupFreeTrial() {
        updateState(HomeViewModel$hidePopupFreeTrial$1.INSTANCE);
    }

    public final void hidePopupMenuGame() {
        m218applyTouchPointk4lQ0M(0L);
    }

    public final void hidePopupOffReward1() {
        updateState(HomeViewModel$hidePopupOffReward1$1.INSTANCE);
    }

    public final void hidePopupOffReward2() {
        updateState(HomeViewModel$hidePopupOffReward2$1.INSTANCE);
    }

    public final void hidePopupOffReward3() {
        updateState(HomeViewModel$hidePopupOffReward3$1.INSTANCE);
    }

    public final void hideToast() {
        updateState(HomeViewModel$hideToast$1.INSTANCE);
    }

    public final void onChangedSearchText(@NotNull String str) {
        a.s(str, "value");
        updateState(new HomeViewModel$onChangedSearchText$1(str));
    }

    public final void onChangedViewType() {
        updateState(new HomeViewModel$onChangedViewType$1(this));
    }

    public final void onSelectGame(@NotNull Game game, boolean z2, boolean z3) {
        i1 i1Var;
        Object value;
        HomeState m216copyQIbh8i0;
        a.s(game, RouterName.GAME);
        if (shouldNavigateToGame(z3)) {
            navigateToGame(game, z2);
            return;
        }
        if (!((HomeState) ((i1) this._state).getValue()).isNewFlow()) {
            this.paywallNavigationViewModel.navigateToPaywall();
            return;
        }
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
            m216copyQIbh8i0 = r4.m216copyQIbh8i0((r35 & 1) != 0 ? r4.games : null, (r35 & 2) != 0 ? r4.searchText : null, (r35 & 4) != 0 ? r4.isViewListHorizontal : false, (r35 & 8) != 0 ? r4.currentGameForPopupMenu : null, (r35 & 16) != 0 ? r4.touchPoint : 0L, (r35 & 32) != 0 ? r4.isDialogRemoveGameVisible : false, (r35 & 64) != 0 ? r4.numberLimitAddGame : 0, (r35 & 128) != 0 ? r4.numberLimitPlayGame : 0, (r35 & 256) != 0 ? r4.numberRewardFree : 0, (r35 & 512) != 0 ? r4.isShowOfferRewardRemoteConfig : false, (r35 & 1024) != 0 ? r4.isNewFlow : false, (r35 & Opcodes.ACC_STRICT) != 0 ? r4.isShowOfferReward1 : false, (r35 & 4096) != 0 ? r4.isShowOfferReward2 : false, (r35 & 8192) != 0 ? r4.isShowOfferReward3 : false, (r35 & 16384) != 0 ? r4.isShowOfferFreeTrial : true, (r35 & 32768) != 0 ? ((HomeState) value).isShowToast : false);
        } while (!i1Var.g(value, m216copyQIbh8i0));
    }

    public final void removeFromFavorite() {
        Game currentGameForPopupMenu;
        String id;
        try {
            this.loadingDialogViewModel.showDialog();
            currentGameForPopupMenu = ((HomeState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (currentGameForPopupMenu != null && (id = currentGameForPopupMenu.getId()) != null) {
            GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
            Context context = this.context;
            a.r(context, "context");
            if (gamePrefUtils.updateGameFavoriteStatus(context, id, false)) {
                fetchGamesInAppLocal();
                b0.a.c(this.context, "Game removed from favorites successfully!").show();
            } else {
                b0.a.b(this.context, "Failed to remove game from favorites. Please try again.").show();
            }
            updateState(HomeViewModel$removeFromFavorite$1$1.INSTANCE);
            return;
        }
        b0.a.b(this.context, "An error occurred while removing the game from favorites.").show();
        this.loadingDialogViewModel.hideDialog();
    }

    public final void removeGame() {
        Game currentGameForPopupMenu;
        String id;
        try {
            currentGameForPopupMenu = ((HomeState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (currentGameForPopupMenu != null && (id = currentGameForPopupMenu.getId()) != null) {
            this.loadingDialogViewModel.showDialog();
            GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
            Context context = this.context;
            a.r(context, "context");
            if (gamePrefUtils.removeGame(context, id)) {
                fetchGamesInAppLocal();
                b0.a.c(this.context, "Game removed successfully!").show();
            } else {
                b0.a.b(this.context, "Failed to remove game. Please try again.").show();
            }
            updateState(HomeViewModel$removeGame$1$1.INSTANCE);
            return;
        }
        b0.a.b(this.context, "An error occurred while removing the game.").show();
    }

    public final void restartGame() {
        Game currentGameForPopupMenu = ((HomeState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        if (currentGameForPopupMenu == null) {
            b0.a.b(this.context, "An error occurred while removing the game.").show();
            return;
        }
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        this.loadingDialogViewModel.showDialog();
        onSelectGame$default(this, currentGameForPopupMenu, true, false, 4, null);
        updateState(HomeViewModel$restartGame$1$1.INSTANCE);
        loadingDialogViewModel.hideDialog();
    }

    public final void resumeGame() {
        Game currentGameForPopupMenu = ((HomeState) ((i1) this._state).getValue()).getCurrentGameForPopupMenu();
        if (currentGameForPopupMenu == null) {
            b0.a.b(this.context, "An error occurred while removing the game.").show();
            return;
        }
        LoadingDialogViewModel loadingDialogViewModel = this.loadingDialogViewModel;
        loadingDialogViewModel.showDialog();
        this.loadingDialogViewModel.showDialog();
        onSelectGame$default(this, currentGameForPopupMenu, false, false, 6, null);
        updateState(HomeViewModel$resumeGame$1$1.INSTANCE);
        loadingDialogViewModel.hideDialog();
    }

    public final boolean shouldNavigateToGame(boolean z2) {
        int gamePlayCounter;
        if (((IAPState) this.iapViewModel.getState().getValue()).isPremium() || z2) {
            return true;
        }
        if (((HomeState) ((i1) this._state).getValue()).isNewFlow()) {
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
        return gamePlayCounter < ((HomeState) this.state.getValue()).getNumberLimitPlayGame();
    }

    public final void showDialogRemoveGame() {
        updateState(HomeViewModel$showDialogRemoveGame$1.INSTANCE);
    }

    public final void showPopupMenuGame(@NotNull Game game) {
        a.s(game, RouterName.GAME);
        updateState(new HomeViewModel$showPopupMenuGame$1(game));
    }

    public final void showPopupOffReward2() {
        RewardAdCounter rewardAdCounter = RewardAdCounter.INSTANCE;
        Context context = this.context;
        a.r(context, "context");
        if (rewardAdCounter.getRewardAdCounter(context) < ((HomeState) this.state.getValue()).getNumberRewardFree()) {
            updateState(HomeViewModel$showPopupOffReward2$1.INSTANCE);
        } else {
            showPopupOffReward3();
        }
    }

    public final void showPopupOffReward3() {
        updateState(HomeViewModel$showPopupOffReward3$1.INSTANCE);
    }

    public final void showToast() {
        updateState(HomeViewModel$showToast$1.INSTANCE);
    }
}
