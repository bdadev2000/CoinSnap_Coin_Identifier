package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class DrawablePainterKt$MAIN_HANDLER$2 extends r implements a {
    public static final DrawablePainterKt$MAIN_HANDLER$2 INSTANCE = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
