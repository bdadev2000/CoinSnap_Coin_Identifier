package com.cooldev.gba.emulator.gameboy.features.game_pad.utils;

import android.view.MotionEvent;
import com.cooldev.gba.emulator.gameboy.features.game_pad.utils.TouchUtils;
import d0.k;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class TouchUtils$extractRawFingersPositions$1 extends r implements l {
    final /* synthetic */ MotionEvent $event;
    final /* synthetic */ int $offsetX;
    final /* synthetic */ int $offsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchUtils$extractRawFingersPositions$1(MotionEvent motionEvent, int i2, int i3) {
        super(1);
        this.$event = motionEvent;
        this.$offsetX = i2;
        this.$offsetY = i3;
    }

    @Override // q0.l
    @NotNull
    public final TouchUtils.FingerPosition invoke(@NotNull k kVar) {
        float rawX;
        float rawY;
        a.s(kVar, "<name for destructuring parameter 0>");
        int intValue = ((Number) kVar.f30134a).intValue();
        int intValue2 = ((Number) kVar.f30135b).intValue();
        rawX = this.$event.getRawX(intValue2);
        float f2 = rawX - this.$offsetX;
        rawY = this.$event.getRawY(intValue2);
        return new TouchUtils.FingerPosition(intValue, f2, rawY - this.$offsetY);
    }
}
