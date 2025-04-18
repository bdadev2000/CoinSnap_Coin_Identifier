package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
public final class KotlinUtilsKt$memoize$1 extends r implements l {
    final /* synthetic */ ConcurrentHashMap<T, U> $mem;
    final /* synthetic */ l $this_memoize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinUtilsKt$memoize$1(ConcurrentHashMap<T, U> concurrentHashMap, l lVar) {
        super(1);
        this.$mem = concurrentHashMap;
        this.$this_memoize = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [U, java.lang.Object] */
    @Override // q0.l
    public final U invoke(T t2) {
        ConcurrentMap concurrentMap = this.$mem;
        l lVar = this.$this_memoize;
        ?? r2 = concurrentMap.get(t2);
        if (r2 != 0) {
            return r2;
        }
        ?? invoke = lVar.invoke(t2);
        ?? putIfAbsent = concurrentMap.putIfAbsent(t2, invoke);
        return putIfAbsent == 0 ? invoke : putIfAbsent;
    }
}
