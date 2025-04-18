package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.view.MotionEvent;
import d0.k;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class TouchUtils$iteratePointerIndexes$3 extends r implements l {
    final /* synthetic */ MotionEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUtils$iteratePointerIndexes$3(MotionEvent motionEvent) {
        super(1);
        this.$event = motionEvent;
    }

    @Override // q0.l
    @NotNull
    public final Boolean invoke(@NotNull k kVar) {
        boolean isCancelEvent;
        a.s(kVar, "<name for destructuring parameter 0>");
        isCancelEvent = TouchUtils.INSTANCE.isCancelEvent(this.$event, ((Number) kVar.f30135b).intValue());
        return Boolean.valueOf(!isCancelEvent);
    }
}
