package com.cooldev.gba.emulator.gameboy.local.storage;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GamePrefUtils$updateGameFavoriteStatus$1 extends r implements l {
    final /* synthetic */ boolean $isFavorite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePrefUtils$updateGameFavoriteStatus$1(boolean z2) {
        super(1);
        this.$isFavorite = z2;
    }

    @Override // q0.l
    @NotNull
    public final Game invoke(@NotNull Game game) {
        Game copy;
        a.s(game, RouterName.GAME);
        copy = game.copy((r34 & 1) != 0 ? game.id : null, (r34 & 2) != 0 ? game.fileName : null, (r34 & 4) != 0 ? game.fileUri : null, (r34 & 8) != 0 ? game.title : null, (r34 & 16) != 0 ? game.systemId : null, (r34 & 32) != 0 ? game.developer : null, (r34 & 64) != 0 ? game.coverFrontUrl : null, (r34 & 128) != 0 ? game.lastPlayedAt : null, (r34 & 256) != 0 ? game.isFavorite : this.$isFavorite, (r34 & 512) != 0 ? game.createdAtInMillis : null, (r34 & 1024) != 0 ? game.updatedAtInMillis : Long.valueOf(System.currentTimeMillis()), (r34 & Opcodes.ACC_STRICT) != 0 ? game.dataFiles : null, (r34 & 4096) != 0 ? game.fastForwardEnabled : false, (r34 & 8192) != 0 ? game.autoSaveEnable : false, (r34 & 16384) != 0 ? game.audioEnabled : false, (r34 & 32768) != 0 ? game.isFirstTimeInPremium : false);
        return copy;
    }
}
