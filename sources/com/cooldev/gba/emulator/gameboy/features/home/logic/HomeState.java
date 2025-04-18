package com.cooldev.gba.emulator.gameboy.features.home.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes3.dex */
public final class HomeState {
    public static final int $stable = 8;

    @Nullable
    private final Game currentGameForPopupMenu;

    @NotNull
    private final List<Game> games;
    private final boolean isDialogRemoveGameVisible;
    private final boolean isNewFlow;
    private final boolean isShowOfferFreeTrial;
    private final boolean isShowOfferReward1;
    private final boolean isShowOfferReward2;
    private final boolean isShowOfferReward3;
    private final boolean isShowOfferRewardRemoteConfig;
    private final boolean isShowToast;
    private final boolean isViewListHorizontal;
    private final int numberLimitAddGame;
    private final int numberLimitPlayGame;
    private final int numberRewardFree;

    @NotNull
    private final String searchText;
    private final long touchPoint;

    public /* synthetic */ HomeState(List list, String str, boolean z2, Game game, long j2, boolean z3, int i2, int i3, int i4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, k kVar) {
        this(list, str, z2, game, j2, z3, i2, i3, i4, z4, z5, z6, z7, z8, z9, z10);
    }

    private final List<Game> getFilteredGames() {
        String developer;
        if (this.searchText.length() == 0) {
            return this.games;
        }
        List<Game> list = this.games;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Game game = (Game) obj;
            if (m.M0(game.getTitle(), this.searchText, true) || m.M0(game.getFileName(), this.searchText, true) || ((developer = game.getDeveloper()) != null && m.M0(developer, this.searchText, true))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Game> component1() {
        return this.games;
    }

    public final boolean component10() {
        return this.isShowOfferRewardRemoteConfig;
    }

    public final boolean component11() {
        return this.isNewFlow;
    }

    public final boolean component12() {
        return this.isShowOfferReward1;
    }

    public final boolean component13() {
        return this.isShowOfferReward2;
    }

    public final boolean component14() {
        return this.isShowOfferReward3;
    }

    public final boolean component15() {
        return this.isShowOfferFreeTrial;
    }

    public final boolean component16() {
        return this.isShowToast;
    }

    @NotNull
    public final String component2() {
        return this.searchText;
    }

    public final boolean component3() {
        return this.isViewListHorizontal;
    }

    @Nullable
    public final Game component4() {
        return this.currentGameForPopupMenu;
    }

    /* renamed from: component5-F1C5BW0, reason: not valid java name */
    public final long m215component5F1C5BW0() {
        return this.touchPoint;
    }

    public final boolean component6() {
        return this.isDialogRemoveGameVisible;
    }

    public final int component7() {
        return this.numberLimitAddGame;
    }

    public final int component8() {
        return this.numberLimitPlayGame;
    }

    public final int component9() {
        return this.numberRewardFree;
    }

    @NotNull
    /* renamed from: copy-QIbh8i0, reason: not valid java name */
    public final HomeState m216copyQIbh8i0(@NotNull List<Game> list, @NotNull String str, boolean z2, @Nullable Game game, long j2, boolean z3, int i2, int i3, int i4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        a.s(list, "games");
        a.s(str, "searchText");
        return new HomeState(list, str, z2, game, j2, z3, i2, i3, i4, z4, z5, z6, z7, z8, z9, z10, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeState)) {
            return false;
        }
        HomeState homeState = (HomeState) obj;
        return a.g(this.games, homeState.games) && a.g(this.searchText, homeState.searchText) && this.isViewListHorizontal == homeState.isViewListHorizontal && a.g(this.currentGameForPopupMenu, homeState.currentGameForPopupMenu) && Offset.d(this.touchPoint, homeState.touchPoint) && this.isDialogRemoveGameVisible == homeState.isDialogRemoveGameVisible && this.numberLimitAddGame == homeState.numberLimitAddGame && this.numberLimitPlayGame == homeState.numberLimitPlayGame && this.numberRewardFree == homeState.numberRewardFree && this.isShowOfferRewardRemoteConfig == homeState.isShowOfferRewardRemoteConfig && this.isNewFlow == homeState.isNewFlow && this.isShowOfferReward1 == homeState.isShowOfferReward1 && this.isShowOfferReward2 == homeState.isShowOfferReward2 && this.isShowOfferReward3 == homeState.isShowOfferReward3 && this.isShowOfferFreeTrial == homeState.isShowOfferFreeTrial && this.isShowToast == homeState.isShowToast;
    }

    @Nullable
    public final Game getCurrentGameForPopupMenu() {
        return this.currentGameForPopupMenu;
    }

    public final boolean getEmptyGames() {
        return this.games.isEmpty();
    }

    public final boolean getEmptySearch() {
        return getFilteredGames().isEmpty();
    }

    @NotNull
    public final List<Game> getFavoritesGames() {
        List<Game> filteredGames = getFilteredGames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : filteredGames) {
            if (((Game) obj).isFavorite()) {
                arrayList.add(obj);
            }
        }
        return u.U0(u.T0(arrayList, new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState$special$$inlined$sortedByDescending$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return q.c(((Game) t3).getUpdatedAtInMillis(), ((Game) t2).getUpdatedAtInMillis());
            }
        }), 8);
    }

    @NotNull
    public final List<Game> getGames() {
        return this.games;
    }

    public final int getNumberLimitAddGame() {
        return this.numberLimitAddGame;
    }

    public final int getNumberLimitPlayGame() {
        return this.numberLimitPlayGame;
    }

    public final int getNumberRewardFree() {
        return this.numberRewardFree;
    }

    @NotNull
    public final List<Game> getRecentGames() {
        List<Game> filteredGames = getFilteredGames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : filteredGames) {
            if (((Game) obj).getLastPlayedAt() != null) {
                arrayList.add(obj);
            }
        }
        return u.U0(u.T0(arrayList, new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState$special$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return q.c(((Game) t3).getLastPlayedAt(), ((Game) t2).getLastPlayedAt());
            }
        }), 8);
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public final boolean getShowingPopup() {
        return !Offset.d(this.touchPoint, 0L);
    }

    /* renamed from: getTouchPoint-F1C5BW0, reason: not valid java name */
    public final long m217getTouchPointF1C5BW0() {
        return this.touchPoint;
    }

    @NotNull
    public final List<Game> getYourGames() {
        return u.U0(u.T0(getFilteredGames(), new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return q.c(((Game) t3).getUpdatedAtInMillis(), ((Game) t2).getUpdatedAtInMillis());
            }
        }), 8);
    }

    public int hashCode() {
        int g2 = d.g(this.isViewListHorizontal, androidx.compose.foundation.text.input.a.b(this.searchText, this.games.hashCode() * 31, 31), 31);
        Game game = this.currentGameForPopupMenu;
        return Boolean.hashCode(this.isShowToast) + d.g(this.isShowOfferFreeTrial, d.g(this.isShowOfferReward3, d.g(this.isShowOfferReward2, d.g(this.isShowOfferReward1, d.g(this.isNewFlow, d.g(this.isShowOfferRewardRemoteConfig, d.c(this.numberRewardFree, d.c(this.numberLimitPlayGame, d.c(this.numberLimitAddGame, d.g(this.isDialogRemoveGameVisible, d.d(this.touchPoint, (g2 + (game == null ? 0 : game.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isDialogRemoveGameVisible() {
        return this.isDialogRemoveGameVisible;
    }

    public final boolean isGameLimitReached() {
        return this.games.size() >= this.numberLimitAddGame;
    }

    public final boolean isNewFlow() {
        return this.isNewFlow;
    }

    public final boolean isShowOfferFreeTrial() {
        return this.isShowOfferFreeTrial;
    }

    public final boolean isShowOfferReward1() {
        return this.isShowOfferReward1;
    }

    public final boolean isShowOfferReward2() {
        return this.isShowOfferReward2;
    }

    public final boolean isShowOfferReward3() {
        return this.isShowOfferReward3;
    }

    public final boolean isShowOfferRewardRemoteConfig() {
        return this.isShowOfferRewardRemoteConfig;
    }

    public final boolean isShowToast() {
        return this.isShowToast;
    }

    public final boolean isViewListHorizontal() {
        return this.isViewListHorizontal;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HomeState(games=");
        sb.append(this.games);
        sb.append(", searchText=");
        sb.append(this.searchText);
        sb.append(", isViewListHorizontal=");
        sb.append(this.isViewListHorizontal);
        sb.append(", currentGameForPopupMenu=");
        sb.append(this.currentGameForPopupMenu);
        sb.append(", touchPoint=");
        sb.append((Object) Offset.m(this.touchPoint));
        sb.append(", isDialogRemoveGameVisible=");
        sb.append(this.isDialogRemoveGameVisible);
        sb.append(", numberLimitAddGame=");
        sb.append(this.numberLimitAddGame);
        sb.append(", numberLimitPlayGame=");
        sb.append(this.numberLimitPlayGame);
        sb.append(", numberRewardFree=");
        sb.append(this.numberRewardFree);
        sb.append(", isShowOfferRewardRemoteConfig=");
        sb.append(this.isShowOfferRewardRemoteConfig);
        sb.append(", isNewFlow=");
        sb.append(this.isNewFlow);
        sb.append(", isShowOfferReward1=");
        sb.append(this.isShowOfferReward1);
        sb.append(", isShowOfferReward2=");
        sb.append(this.isShowOfferReward2);
        sb.append(", isShowOfferReward3=");
        sb.append(this.isShowOfferReward3);
        sb.append(", isShowOfferFreeTrial=");
        sb.append(this.isShowOfferFreeTrial);
        sb.append(", isShowToast=");
        return d.s(sb, this.isShowToast, ')');
    }

    private HomeState(List<Game> list, String str, boolean z2, Game game, long j2, boolean z3, int i2, int i3, int i4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        a.s(list, "games");
        a.s(str, "searchText");
        this.games = list;
        this.searchText = str;
        this.isViewListHorizontal = z2;
        this.currentGameForPopupMenu = game;
        this.touchPoint = j2;
        this.isDialogRemoveGameVisible = z3;
        this.numberLimitAddGame = i2;
        this.numberLimitPlayGame = i3;
        this.numberRewardFree = i4;
        this.isShowOfferRewardRemoteConfig = z4;
        this.isNewFlow = z5;
        this.isShowOfferReward1 = z6;
        this.isShowOfferReward2 = z7;
        this.isShowOfferReward3 = z8;
        this.isShowOfferFreeTrial = z9;
        this.isShowToast = z10;
    }

    public /* synthetic */ HomeState(List list, String str, boolean z2, Game game, long j2, boolean z3, int i2, int i3, int i4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, k kVar) {
        this((i5 & 1) != 0 ? w.f30218a : list, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? true : z2, (i5 & 8) != 0 ? null : game, (i5 & 16) != 0 ? 0L : j2, (i5 & 32) != 0 ? false : z3, (i5 & 64) != 0 ? 3 : i2, (i5 & 128) != 0 ? 3 : i3, (i5 & 256) == 0 ? i4 : 3, (i5 & 512) != 0 ? true : z4, (i5 & 1024) != 0 ? false : z5, (i5 & Opcodes.ACC_STRICT) == 0 ? z6 : true, (i5 & 4096) != 0 ? false : z7, (i5 & 8192) != 0 ? false : z8, (i5 & 16384) != 0 ? false : z9, (i5 & 32768) != 0 ? false : z10, null);
    }
}
