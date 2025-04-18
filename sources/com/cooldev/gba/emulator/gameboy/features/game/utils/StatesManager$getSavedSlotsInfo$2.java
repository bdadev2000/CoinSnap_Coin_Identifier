package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import e0.u;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getSavedSlotsInfo$2", f = "StatesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatesManager$getSavedSlotsInfo$2 extends i implements p {
    final /* synthetic */ CoreID $coreID;
    final /* synthetic */ Game $game;
    int label;
    final /* synthetic */ StatesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesManager$getSavedSlotsInfo$2(StatesManager statesManager, Game game, CoreID coreID, g gVar) {
        super(2, gVar);
        this.this$0 = statesManager;
        this.$game = game;
        this.$coreID = coreID;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new StatesManager$getSavedSlotsInfo$2(this.this$0, this.$game, this.$coreID, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((StatesManager$getSavedSlotsInfo$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String slotSaveFileName;
        File stateFileOrDeprecated;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        w0.g F0 = p0.a.F0(0, 4);
        StatesManager statesManager = this.this$0;
        Game game = this.$game;
        CoreID coreID = this.$coreID;
        ArrayList<File> arrayList = new ArrayList(e0.q.M(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            slotSaveFileName = statesManager.getSlotSaveFileName(game, ((e0.b0) it).b());
            stateFileOrDeprecated = statesManager.getStateFileOrDeprecated(slotSaveFileName, coreID.getCoreName());
            arrayList.add(stateFileOrDeprecated);
        }
        ArrayList arrayList2 = new ArrayList(e0.q.M(arrayList, 10));
        for (File file : arrayList) {
            arrayList2.add(new SaveInfo(file.exists(), file.lastModified()));
        }
        return u.Z0(arrayList2);
    }
}
