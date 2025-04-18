package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.view.MotionEvent;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import d0.k;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class TouchUtils$extractFingersPositions$1 extends r implements l {
    final /* synthetic */ MotionEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUtils$extractFingersPositions$1(MotionEvent motionEvent) {
        super(1);
        this.$event = motionEvent;
    }

    @Override // q0.l
    @NotNull
    public final TouchUtils.FingerPosition invoke(@NotNull k kVar) {
        a.s(kVar, "<name for destructuring parameter 0>");
        int intValue = ((Number) kVar.f30134a).intValue();
        int intValue2 = ((Number) kVar.f30135b).intValue();
        return new TouchUtils.FingerPosition(intValue, this.$event.getX(intValue2), this.$event.getY(intValue2));
    }
}
