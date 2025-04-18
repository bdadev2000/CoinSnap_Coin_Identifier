package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import e0.w;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ViewAllState {
    public static final int $stable = 8;

    @Nullable
    private final Game currentGameForPopupMenu;

    @NotNull
    private final List<Game> games;
    private final boolean isDialogRemoveGameVisible;
    private final boolean isNewFlow;
    private final int numberLimitPlayGame;
    private final long touchPoint;

    public /* synthetic */ ViewAllState(List list, Game game, long j2, boolean z2, int i2, boolean z3, k kVar) {
        this(list, game, j2, z2, i2, z3);
    }

    /* renamed from: copy-1hIXUjU$default, reason: not valid java name */
    public static /* synthetic */ ViewAllState m365copy1hIXUjU$default(ViewAllState viewAllState, List list, Game game, long j2, boolean z2, int i2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = viewAllState.games;
        }
        if ((i3 & 2) != 0) {
            game = viewAllState.currentGameForPopupMenu;
        }
        Game game2 = game;
        if ((i3 & 4) != 0) {
            j2 = viewAllState.touchPoint;
        }
        long j3 = j2;
        if ((i3 & 8) != 0) {
            z2 = viewAllState.isDialogRemoveGameVisible;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            i2 = viewAllState.numberLimitPlayGame;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            z3 = viewAllState.isNewFlow;
        }
        return viewAllState.m367copy1hIXUjU(list, game2, j3, z4, i4, z3);
    }

    @NotNull
    public final List<Game> component1() {
        return this.games;
    }

    @Nullable
    public final Game component2() {
        return this.currentGameForPopupMenu;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m366component3F1C5BW0() {
        return this.touchPoint;
    }

    public final boolean component4() {
        return this.isDialogRemoveGameVisible;
    }

    public final int component5() {
        return this.numberLimitPlayGame;
    }

    public final boolean component6() {
        return this.isNewFlow;
    }

    @NotNull
    /* renamed from: copy-1hIXUjU, reason: not valid java name */
    public final ViewAllState m367copy1hIXUjU(@NotNull List<Game> list, @Nullable Game game, long j2, boolean z2, int i2, boolean z3) {
        a.s(list, "games");
        return new ViewAllState(list, game, j2, z2, i2, z3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewAllState)) {
            return false;
        }
        ViewAllState viewAllState = (ViewAllState) obj;
        return a.g(this.games, viewAllState.games) && a.g(this.currentGameForPopupMenu, viewAllState.currentGameForPopupMenu) && Offset.d(this.touchPoint, viewAllState.touchPoint) && this.isDialogRemoveGameVisible == viewAllState.isDialogRemoveGameVisible && this.numberLimitPlayGame == viewAllState.numberLimitPlayGame && this.isNewFlow == viewAllState.isNewFlow;
    }

    @Nullable
    public final Game getCurrentGameForPopupMenu() {
        return this.currentGameForPopupMenu;
    }

    @NotNull
    public final List<Game> getGames() {
        return this.games;
    }

    public final int getNumberLimitPlayGame() {
        return this.numberLimitPlayGame;
    }

    public final boolean getShowingPopup() {
        return !Offset.d(this.touchPoint, 0L);
    }

    /* renamed from: getTouchPoint-F1C5BW0, reason: not valid java name */
    public final long m368getTouchPointF1C5BW0() {
        return this.touchPoint;
    }

    public int hashCode() {
        int hashCode = this.games.hashCode() * 31;
        Game game = this.currentGameForPopupMenu;
        return Boolean.hashCode(this.isNewFlow) + d.c(this.numberLimitPlayGame, d.g(this.isDialogRemoveGameVisible, d.d(this.touchPoint, (hashCode + (game == null ? 0 : game.hashCode())) * 31, 31), 31), 31);
    }

    public final boolean isDialogRemoveGameVisible() {
        return this.isDialogRemoveGameVisible;
    }

    public final boolean isNewFlow() {
        return this.isNewFlow;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewAllState(games=");
        sb.append(this.games);
        sb.append(", currentGameForPopupMenu=");
        sb.append(this.currentGameForPopupMenu);
        sb.append(", touchPoint=");
        sb.append((Object) Offset.m(this.touchPoint));
        sb.append(", isDialogRemoveGameVisible=");
        sb.append(this.isDialogRemoveGameVisible);
        sb.append(", numberLimitPlayGame=");
        sb.append(this.numberLimitPlayGame);
        sb.append(", isNewFlow=");
        return d.s(sb, this.isNewFlow, ')');
    }

    private ViewAllState(List<Game> list, Game game, long j2, boolean z2, int i2, boolean z3) {
        a.s(list, "games");
        this.games = list;
        this.currentGameForPopupMenu = game;
        this.touchPoint = j2;
        this.isDialogRemoveGameVisible = z2;
        this.numberLimitPlayGame = i2;
        this.isNewFlow = z3;
    }

    public /* synthetic */ ViewAllState(List list, Game game, long j2, boolean z2, int i2, boolean z3, int i3, k kVar) {
        this((i3 & 1) != 0 ? w.f30218a : list, (i3 & 2) != 0 ? null : game, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? 3 : i2, (i3 & 32) == 0 ? z3 : false, null);
    }
}
