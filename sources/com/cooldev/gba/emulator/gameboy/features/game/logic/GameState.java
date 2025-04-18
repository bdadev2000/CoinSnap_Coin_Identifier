package com.cooldev.gba.emulator.gameboy.features.game.logic;

import android.graphics.Bitmap;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.game.models.StateEntry;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.swordfish.libretrodroid.GLRetroView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GameState {
    public static final int $stable = 8;
    private final boolean audioEnabled;
    private final boolean autoSaveEnable;
    private final boolean fastForwardEnabled;

    @Nullable
    private final Game game;

    @Nullable
    private final GameData gameData;
    private final boolean isFirstTimeInPremium;

    @NotNull
    private final List<StateEntry> loadSlot;

    @Nullable
    private final GLRetroView retroView;

    @NotNull
    private final List<StateEntry> saveSlot;

    @Nullable
    private final Bitmap thumbnail;

    public GameState() {
        this(null, null, null, false, false, false, false, null, null, null, 1023, null);
    }

    @Nullable
    public final Game component1() {
        return this.game;
    }

    @Nullable
    public final Bitmap component10() {
        return this.thumbnail;
    }

    @Nullable
    public final GameData component2() {
        return this.gameData;
    }

    @Nullable
    public final GLRetroView component3() {
        return this.retroView;
    }

    public final boolean component4() {
        return this.fastForwardEnabled;
    }

    public final boolean component5() {
        return this.autoSaveEnable;
    }

    public final boolean component6() {
        return this.isFirstTimeInPremium;
    }

    public final boolean component7() {
        return this.audioEnabled;
    }

    @NotNull
    public final List<StateEntry> component8() {
        return this.saveSlot;
    }

    @NotNull
    public final List<StateEntry> component9() {
        return this.loadSlot;
    }

    @NotNull
    public final GameState copy(@Nullable Game game, @Nullable GameData gameData, @Nullable GLRetroView gLRetroView, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull List<StateEntry> list, @NotNull List<StateEntry> list2, @Nullable Bitmap bitmap) {
        a.s(list, "saveSlot");
        a.s(list2, "loadSlot");
        return new GameState(game, gameData, gLRetroView, z2, z3, z4, z5, list, list2, bitmap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameState)) {
            return false;
        }
        GameState gameState = (GameState) obj;
        return a.g(this.game, gameState.game) && a.g(this.gameData, gameState.gameData) && a.g(this.retroView, gameState.retroView) && this.fastForwardEnabled == gameState.fastForwardEnabled && this.autoSaveEnable == gameState.autoSaveEnable && this.isFirstTimeInPremium == gameState.isFirstTimeInPremium && this.audioEnabled == gameState.audioEnabled && a.g(this.saveSlot, gameState.saveSlot) && a.g(this.loadSlot, gameState.loadSlot) && a.g(this.thumbnail, gameState.thumbnail);
    }

    public final boolean getAudioEnabled() {
        return this.audioEnabled;
    }

    public final boolean getAutoSaveEnable() {
        return this.autoSaveEnable;
    }

    public final boolean getFastForwardEnabled() {
        return this.fastForwardEnabled;
    }

    @Nullable
    public final Game getGame() {
        return this.game;
    }

    @Nullable
    public final GameData getGameData() {
        return this.gameData;
    }

    @NotNull
    public final List<StateEntry> getLoadSlot() {
        return this.loadSlot;
    }

    @Nullable
    public final GLRetroView getRetroView() {
        return this.retroView;
    }

    @NotNull
    public final List<StateEntry> getSaveSlot() {
        return this.saveSlot;
    }

    @Nullable
    public final Bitmap getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        Game game = this.game;
        int hashCode = (game == null ? 0 : game.hashCode()) * 31;
        GameData gameData = this.gameData;
        int hashCode2 = (hashCode + (gameData == null ? 0 : gameData.hashCode())) * 31;
        GLRetroView gLRetroView = this.retroView;
        int f2 = d.f(this.loadSlot, d.f(this.saveSlot, d.g(this.audioEnabled, d.g(this.isFirstTimeInPremium, d.g(this.autoSaveEnable, d.g(this.fastForwardEnabled, (hashCode2 + (gLRetroView == null ? 0 : gLRetroView.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        Bitmap bitmap = this.thumbnail;
        return f2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final boolean isFirstTimeInPremium() {
        return this.isFirstTimeInPremium;
    }

    @NotNull
    public String toString() {
        return "GameState(game=" + this.game + ", gameData=" + this.gameData + ", retroView=" + this.retroView + ", fastForwardEnabled=" + this.fastForwardEnabled + ", autoSaveEnable=" + this.autoSaveEnable + ", isFirstTimeInPremium=" + this.isFirstTimeInPremium + ", audioEnabled=" + this.audioEnabled + ", saveSlot=" + this.saveSlot + ", loadSlot=" + this.loadSlot + ", thumbnail=" + this.thumbnail + ')';
    }

    public GameState(@Nullable Game game, @Nullable GameData gameData, @Nullable GLRetroView gLRetroView, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull List<StateEntry> list, @NotNull List<StateEntry> list2, @Nullable Bitmap bitmap) {
        a.s(list, "saveSlot");
        a.s(list2, "loadSlot");
        this.game = game;
        this.gameData = gameData;
        this.retroView = gLRetroView;
        this.fastForwardEnabled = z2;
        this.autoSaveEnable = z3;
        this.isFirstTimeInPremium = z4;
        this.audioEnabled = z5;
        this.saveSlot = list;
        this.loadSlot = list2;
        this.thumbnail = bitmap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GameState(com.cooldev.gba.emulator.gameboy.features.home.models.Game r13, com.cooldev.gba.emulator.gameboy.features.game.models.GameData r14, com.swordfish.libretrodroid.GLRetroView r15, boolean r16, boolean r17, boolean r18, boolean r19, java.util.List r20, java.util.List r21, android.graphics.Bitmap r22, int r23, kotlin.jvm.internal.k r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r13
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r14
        L11:
            r4 = r0 & 4
            if (r4 == 0) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r15
        L18:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L1f
            r5 = r6
            goto L21
        L1f:
            r5 = r16
        L21:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            goto L28
        L26:
            r6 = r17
        L28:
            r7 = r0 & 32
            r8 = 1
            if (r7 == 0) goto L2f
            r7 = r8
            goto L31
        L2f:
            r7 = r18
        L31:
            r9 = r0 & 64
            if (r9 == 0) goto L36
            goto L38
        L36:
            r8 = r19
        L38:
            r9 = r0 & 128(0x80, float:1.8E-43)
            e0.w r10 = e0.w.f30218a
            if (r9 == 0) goto L40
            r9 = r10
            goto L42
        L40:
            r9 = r20
        L42:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L47
            goto L49
        L47:
            r10 = r21
        L49:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r2 = r22
        L50:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameState.<init>(com.cooldev.gba.emulator.gameboy.features.home.models.Game, com.cooldev.gba.emulator.gameboy.features.game.models.GameData, com.swordfish.libretrodroid.GLRetroView, boolean, boolean, boolean, boolean, java.util.List, java.util.List, android.graphics.Bitmap, int, kotlin.jvm.internal.k):void");
    }
}
