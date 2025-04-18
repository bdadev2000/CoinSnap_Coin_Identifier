package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class DrawablePainter$callback$2 extends r implements a {
    final /* synthetic */ DrawablePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.this$0 = drawablePainter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
    @Override // q0.a
    @NotNull
    public final AnonymousClass1 invoke() {
        final DrawablePainter drawablePainter = this.this$0;
        return new Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(@NotNull Drawable drawable) {
                int drawInvalidateTick;
                long intrinsicSize;
                p0.a.s(drawable, "d");
                DrawablePainter drawablePainter2 = DrawablePainter.this;
                drawInvalidateTick = drawablePainter2.getDrawInvalidateTick();
                drawablePainter2.setDrawInvalidateTick(drawInvalidateTick + 1);
                DrawablePainter drawablePainter3 = DrawablePainter.this;
                intrinsicSize = DrawablePainterKt.getIntrinsicSize(drawablePainter3.getDrawable());
                drawablePainter3.m587setDrawableIntrinsicSizeuvyYCjk(intrinsicSize);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j2) {
                Handler main_handler;
                p0.a.s(drawable, "d");
                p0.a.s(runnable, "what");
                main_handler = DrawablePainterKt.getMAIN_HANDLER();
                main_handler.postAtTime(runnable, j2);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
                Handler main_handler;
                p0.a.s(drawable, "d");
                p0.a.s(runnable, "what");
                main_handler = DrawablePainterKt.getMAIN_HANDLER();
                main_handler.removeCallbacks(runnable);
            }
        };
    }
}
