package com.cooldev.gba.emulator.gameboy.utils;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes4.dex */
public final class UtilsModifierKt$dropShadow$1 extends r implements l {
    final /* synthetic */ float $blur;
    final /* synthetic */ long $color;
    final /* synthetic */ float $offsetX;
    final /* synthetic */ float $offsetY;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ float $spread;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsModifierKt$dropShadow$1(float f2, Shape shape, long j2, float f3, float f4, float f5) {
        super(1);
        this.$spread = f2;
        this.$shape = shape;
        this.$color = j2;
        this.$blur = f3;
        this.$offsetX = f4;
        this.$offsetY = f5;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull DrawScope drawScope) {
        p0.a.s(drawScope, "$this$drawBehind");
        Outline a2 = this.$shape.a(SizeKt.a(drawScope.y1(this.$spread) + Size.d(drawScope.b()), drawScope.y1(this.$spread) + Size.b(drawScope.b())), drawScope.getLayoutDirection(), drawScope);
        AndroidPaint a3 = AndroidPaint_androidKt.a();
        a3.v(this.$color);
        if (drawScope.y1(this.$blur) > 0.0f) {
            a3.f14933a.setMaskFilter(new BlurMaskFilter(drawScope.y1(this.$blur), BlurMaskFilter.Blur.NORMAL));
        }
        float f2 = this.$offsetX;
        float f3 = this.$offsetY;
        Canvas a4 = drawScope.A1().a();
        a4.p();
        a4.h(drawScope.y1(f2), drawScope.y1(f3));
        if (a2 instanceof Outline.Rectangle) {
            a4.o(((Outline.Rectangle) a2).f15001a, a3);
        } else if (a2 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) a2;
            AndroidPath androidPath = rounded.f15003b;
            if (androidPath != null) {
                a4.s(androidPath, a3);
            } else {
                RoundRect roundRect = rounded.f15002a;
                float f4 = roundRect.f14917a;
                float f5 = roundRect.f14918b;
                float f6 = roundRect.f14919c;
                float f7 = roundRect.d;
                long j2 = roundRect.f14922h;
                a4.v(f4, f5, f6, f7, CornerRadius.b(j2), CornerRadius.c(j2), a3);
            }
        } else if (a2 instanceof Outline.Generic) {
            a4.s(((Outline.Generic) a2).f15000a, a3);
        } else {
            throw new RuntimeException();
        }
        a4.i();
    }
}
