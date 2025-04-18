package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.view.MotionEvent;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class TouchUtils$iteratePointerIndexes$1 extends r implements l {
    final /* synthetic */ MotionEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUtils$iteratePointerIndexes$1(MotionEvent motionEvent) {
        super(1);
        this.$event = motionEvent;
    }

    @NotNull
    public final Integer invoke(int i2) {
        return Integer.valueOf(this.$event.getPointerId(i2));
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
