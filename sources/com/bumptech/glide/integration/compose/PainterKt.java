package com.bumptech.glide.integration.compose;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Painter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"toPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroid/graphics/drawable/Drawable;", "compose_release"}, k = 2, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class PainterKt {
    public static final Painter toPainter(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            return new BitmapPainter(AndroidImageBitmap_androidKt.asImageBitmap(bitmap), 0L, 0L, 6, null);
        }
        if (drawable instanceof ColorDrawable) {
            return new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null);
        }
        if (drawable == null) {
            return new ColorPainter(Color.INSTANCE.m4550getTransparent0d7_KjU(), null);
        }
        Drawable mutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(mutate, "mutate()");
        return new DrawablePainter(mutate);
    }
}
