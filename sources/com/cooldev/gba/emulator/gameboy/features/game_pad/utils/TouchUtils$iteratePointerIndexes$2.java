package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.view.MotionEvent;
import d0.k;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class TouchUtils$iteratePointerIndexes$2 extends r implements l {
    final /* synthetic */ MotionEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUtils$iteratePointerIndexes$2(MotionEvent motionEvent) {
        super(1);
        this.$event = motionEvent;
    }

    @NotNull
    public final k invoke(int i2) {
        return new k(Integer.valueOf(i2), Integer.valueOf(this.$event.findPointerIndex(i2)));
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
