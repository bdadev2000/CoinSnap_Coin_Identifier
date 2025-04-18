package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public class CanvasCompat {

    /* loaded from: classes2.dex */
    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i2) {
        return canvas.saveLayerAlpha(rectF, i2);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f2, float f3, float f4, float f5, int i2) {
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
    }
}
