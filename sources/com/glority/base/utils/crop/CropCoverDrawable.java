package com.glority.base.utils.crop;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* loaded from: classes6.dex */
public class CropCoverDrawable extends Drawable implements CropPath {
    private Path cropPath;
    private int height;
    private Paint paint;
    private Rect rect;
    private int shape;
    private int width;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public CropCoverDrawable(int i, int i2) {
        this.width = i;
        this.height = i2;
        paintInit();
    }

    public CropCoverDrawable(int i, int i2, int i3, int i4, int i5) {
        this.shape = i;
        int i6 = i4 / 2;
        int i7 = i5 / 2;
        this.rect = new Rect(i2 - i6, i3 - i7, i2 + i6, i3 + i7);
        paintInit();
    }

    private void paintInit() {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setColor(-1442840576);
    }

    public void setShape(int i) {
        this.shape = i;
    }

    public void setShadowColor(int i) {
        this.paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.getWidth();
        canvas.getHeight();
        if (this.rect == null) {
            this.rect = new Rect(0, 0, this.width, this.height);
        }
        Log.d("CropCoverDrawable", "draw: " + this.rect.left);
        Log.d("CropCoverDrawable", "draw: " + this.rect.top);
        Log.d("CropCoverDrawable", "draw: " + this.rect.right);
        Log.d("CropCoverDrawable", "draw: " + this.rect.bottom);
        Log.d("CropCoverDrawable", "draw: ===========");
        canvas.drawColor(0);
        Path path = new Path();
        path.addRect(0.0f, 0.0f, this.width, this.height, Path.Direction.CW);
        Path path2 = new Path();
        this.cropPath = path2;
        int i = this.shape;
        if (i == 0) {
            path2.addRect(this.rect.left, this.rect.top, this.rect.right, this.rect.bottom, Path.Direction.CW);
        } else if (i == 1) {
            path2.addCircle(this.rect.centerX(), this.rect.centerY(), this.rect.width() / 2, Path.Direction.CW);
        }
        path.op(this.cropPath, Path.Op.DIFFERENCE);
        canvas.drawPath(path, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // com.glority.base.utils.crop.CropPath
    public Rect limit() {
        return this.rect;
    }

    @Override // com.glority.base.utils.crop.CropPath
    public Path path() {
        return this.cropPath;
    }
}
