package com.cooldev.gba.emulator.gameboy.features.home.models;

import d0.k;
import e0.e0;
import e0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class GameSystem$Companion$byIdCache$2 extends r implements a {
    public static final GameSystem$Companion$byIdCache$2 INSTANCE = new GameSystem$Companion$byIdCache$2();

    public GameSystem$Companion$byIdCache$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Map<String, GameSystem> invoke() {
        List<GameSystem> list = GameSystem.SYSTEMS;
        ArrayList arrayList = new ArrayList(q.M(list, 10));
        for (GameSystem gameSystem : list) {
            arrayList.add(new k(gameSystem.getId().getDbname(), gameSystem));
        }
        k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
        return e0.t((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
    }
}
