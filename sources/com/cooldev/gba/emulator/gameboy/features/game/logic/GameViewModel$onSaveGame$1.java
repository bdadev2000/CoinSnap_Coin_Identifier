package com.cooldev.gba.emulator.gameboy.features.game.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onSaveGame$1", f = "GameViewModel.kt", l = {354, 361}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$onSaveGame$1 extends i implements p {
    final /* synthetic */ a $block;
    final /* synthetic */ Game $game;
    final /* synthetic */ GameData $gameData;
    final /* synthetic */ int $index;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$onSaveGame$1(GameViewModel gameViewModel, Game game, GameData gameData, int i2, a aVar, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$game = game;
        this.$gameData = gameData;
        this.$index = i2;
        this.$block = aVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        GameViewModel$onSaveGame$1 gameViewModel$onSaveGame$1 = new GameViewModel$onSaveGame$1(this.this$0, this.$game, this.$gameData, this.$index, this.$block, gVar);
        gameViewModel$onSaveGame$1.L$0 = obj;
        return gameViewModel$onSaveGame$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$onSaveGame$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(1:(1:(6:5|6|7|8|9|10)(2:15|16))(1:17))(4:26|(2:28|(1:30)(1:31))|9|10)|18|19|(1:21)(4:22|8|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        r0 = r3;
        r2 = r5;
     */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            r14 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r14.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L28
            if (r1 != r2) goto L20
            java.lang.Object r0 = r14.L$2
            q0.a r0 = (q0.a) r0
            java.lang.Object r1 = r14.L$1
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r1 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel) r1
            java.lang.Object r2 = r14.L$0
            com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel) r2
            kotlin.jvm.internal.q.m(r15)     // Catch: java.lang.Throwable -> L1d
            goto Lb0
        L1d:
            r15 = move-exception
            goto Lad
        L20:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L28:
            int r1 = r14.I$0
            java.lang.Object r3 = r14.L$3
            q0.a r3 = (q0.a) r3
            java.lang.Object r4 = r14.L$2
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r4 = (com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel) r4
            java.lang.Object r5 = r14.L$1
            com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel r5 = (com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel) r5
            java.lang.Object r6 = r14.L$0
            b1.d0 r6 = (b1.d0) r6
            kotlin.jvm.internal.q.m(r15)
            r11 = r1
            r1 = r4
            goto L95
        L40:
            kotlin.jvm.internal.q.m(r15)
            java.lang.Object r15 = r14.L$0
            b1.d0 r15 = (b1.d0) r15
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r1 = r14.this$0
            com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel r1 = com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$getLoadingDialogViewModel$p(r1)
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel r4 = r14.this$0
            com.cooldev.gba.emulator.gameboy.features.home.models.Game r6 = r14.$game
            com.cooldev.gba.emulator.gameboy.features.game.models.GameData r5 = r14.$gameData
            int r11 = r14.$index
            q0.a r12 = r14.$block
            r1.showDialog()
            com.cooldev.gba.emulator.gameboy.features.game.models.SaveState r7 = com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$getCurrentSaveState(r4)
            if (r7 == 0) goto Lba
            com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager r8 = new com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager
            com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager r9 = new com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager
            android.content.Context r10 = com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$getContext$p(r4)
            java.lang.String r13 = "access$getContext$p(...)"
            p0.a.r(r10, r13)
            r9.<init>(r10)
            r8.<init>(r9)
            com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig r5 = r5.getSystemCoreConfig()
            com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r9 = r5.getCoreID()
            r14.L$0 = r15
            r14.L$1 = r1
            r14.L$2 = r4
            r14.L$3 = r12
            r14.I$0 = r11
            r14.label = r3
            r5 = r8
            r8 = r9
            r9 = r11
            r10 = r14
            java.lang.Object r15 = r5.setSlotSave(r6, r7, r8, r9, r10)
            if (r15 != r0) goto L92
            return r0
        L92:
            r5 = r1
            r1 = r4
            r3 = r12
        L95:
            r14.L$0 = r5     // Catch: java.lang.Throwable -> Laa
            r14.L$1 = r1     // Catch: java.lang.Throwable -> Laa
            r14.L$2 = r3     // Catch: java.lang.Throwable -> Laa
            r15 = 0
            r14.L$3 = r15     // Catch: java.lang.Throwable -> Laa
            r14.label = r2     // Catch: java.lang.Throwable -> Laa
            java.lang.Object r15 = com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$takeScreenshotPreview(r1, r11, r14)     // Catch: java.lang.Throwable -> Laa
            if (r15 != r0) goto La7
            return r0
        La7:
            r0 = r3
            r2 = r5
            goto Lb0
        Laa:
            r15 = move-exception
            r0 = r3
            r2 = r5
        Lad:
            kotlin.jvm.internal.q.d(r15)
        Lb0:
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$getSavedSlotsInfo(r1)
            com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel.access$getLoadSlotsInfo(r1)
            r0.invoke()
            r1 = r2
        Lba:
            r1.hideDialog()
            d0.b0 r15 = d0.b0.f30125a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onSaveGame$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
