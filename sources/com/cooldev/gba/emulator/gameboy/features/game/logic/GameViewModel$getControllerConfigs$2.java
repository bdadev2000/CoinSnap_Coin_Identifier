package com.cooldev.gba.emulator.gameboy.features.game.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.ControllerConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import d0.b0;
import e0.u;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getControllerConfigs$2", f = "GameViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$getControllerConfigs$2 extends i implements p {
    final /* synthetic */ SystemCoreConfig $systemCoreConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$getControllerConfigs$2(SystemCoreConfig systemCoreConfig, g gVar) {
        super(2, gVar);
        this.$systemCoreConfig = systemCoreConfig;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$getControllerConfigs$2(this.$systemCoreConfig, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$getControllerConfigs$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        Set<Map.Entry<Integer, ArrayList<ControllerConfig>>> entrySet = this.$systemCoreConfig.getControllerConfigs().entrySet();
        p0.a.r(entrySet, "<get-entries>(...)");
        Set<Map.Entry<Integer, ArrayList<ControllerConfig>>> set = entrySet;
        int g2 = q.g(e0.q.M(set, 10));
        if (g2 < 16) {
            g2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            p0.a.p(entry);
            Integer num = (Integer) entry.getKey();
            ArrayList arrayList = (ArrayList) entry.getValue();
            p0.a.p(arrayList);
            linkedHashMap.put(num, (ControllerConfig) u.E0(arrayList));
        }
        return linkedHashMap;
    }
}
