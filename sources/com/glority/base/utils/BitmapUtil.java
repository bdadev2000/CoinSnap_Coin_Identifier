package com.glority.base.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.glority.base.R;
import com.glority.utils.UtilsApp;
import com.glority.utils.app.ResUtils;

/* loaded from: classes6.dex */
public class BitmapUtil {
    public static Bitmap rotate(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Drawable createImagePlaceHolder(int i, int i2, int i3, int i4) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Resources resources = UtilsApp.getApp().getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i4);
        if (decodeResource == null || decodeResource.getWidth() == 0 || decodeResource.getHeight() == 0) {
            return null;
        }
        float dimension = ResUtils.getDimension(R.dimen.x46);
        float dimension2 = ResUtils.getDimension(R.dimen.x60);
        float f = i;
        float f2 = (f - dimension) / 2.0f;
        float f3 = i2;
        float f4 = (f3 - dimension2) / 2.0f;
        RectF rectF = new RectF(f2, f4, dimension + f2, dimension2 + f4);
        Paint paint = new Paint();
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new RectF(0.0f, 0.0f, f, f3), paint);
        canvas.drawBitmap(decodeResource, (Rect) null, rectF, (Paint) null);
        return new BitmapDrawable(resources, createBitmap);
    }
}
