package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;

/* loaded from: classes.dex */
public class Sg extends GradientDrawable {
    private final Paint Sg;
    protected Path YFl;

    public Sg() {
        this.YFl = new Path();
        Paint paint = new Paint(1);
        this.Sg = paint;
        paint.setColor(-1);
    }

    public void YFl(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.YFl;
        if (path != null && !path.isEmpty()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.Sg, 31);
            YFl(canvas);
            this.Sg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.YFl, this.Sg);
            this.Sg.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            return;
        }
        YFl(canvas);
    }

    public void YFl(int i10, int i11, int i12, int i13) {
        this.YFl.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public Sg(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.YFl = new Path();
        Paint paint = new Paint(1);
        this.Sg = paint;
        paint.setColor(-1);
    }
}
