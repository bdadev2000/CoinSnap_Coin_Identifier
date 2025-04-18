package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import d0.k;
import e0.b0;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;
import w0.g;

/* loaded from: classes3.dex */
public final class KotlinUtilsKt {
    @NotNull
    public static final <T, U> l memoize(@NotNull l lVar) {
        a.s(lVar, "<this>");
        return new KotlinUtilsKt$memoize$1(new ConcurrentHashMap(), lVar);
    }

    @NotNull
    public static final <T> List<k> neighborsPairs(@NotNull List<? extends T> list) {
        a.s(list, "<this>");
        g F0 = a.F0(0, list.size() - 1);
        ArrayList arrayList = new ArrayList(q.M(F0, 10));
        Iterator<T> it = F0.iterator();
        while (it.hasNext()) {
            int b2 = ((b0) it).b();
            arrayList.add(new k(list.get(b2), list.get(b2 + 1)));
        }
        return arrayList;
    }
}
