package com.glority.base.utils.crop;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class CropHelper {
    private static final String TAG = "Touch";
    private final int DRAG;
    private final int NONE;
    private final int ZOOM;
    private CropPath cropPath;
    private ImageView imageView;
    private Rect limit;
    private Matrix matrix;
    private PointF mid;
    private int mode;
    private float oldDist;
    private Matrix savedMatrix;
    private PointF start;
    private float[] values;

    public CropHelper(Rect rect) {
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.NONE = 0;
        this.DRAG = 1;
        this.ZOOM = 2;
        this.mode = 0;
        this.start = new PointF();
        this.mid = new PointF();
        this.oldDist = 1.0f;
        this.values = new float[9];
        this.limit = rect;
    }

    public CropHelper() {
        this.matrix = new Matrix();
        this.savedMatrix = new Matrix();
        this.NONE = 0;
        this.DRAG = 1;
        this.ZOOM = 2;
        this.mode = 0;
        this.start = new PointF();
        this.mid = new PointF();
        this.oldDist = 1.0f;
        this.values = new float[9];
    }

    public CropHelper attractTo(final ImageView imageView) {
        this.imageView = imageView;
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.base.utils.crop.CropHelper.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                CropHelper.this.matrix.set(imageView.getImageMatrix());
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                imageView.setImageMatrix(CropHelper.this.matrix);
                CropHelper.this.onTouch(view, motionEvent);
                return true;
            }
        });
        return this;
    }

    public void setCropPath(CropPath cropPath) {
        this.cropPath = cropPath;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r2 != 6) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = 1
            if (r7 == 0) goto Lb3
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            if (r1 == 0) goto Lb3
            android.graphics.drawable.Drawable r1 = r7.getDrawable()
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r8.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L8f
            if (r2 == r0) goto L88
            r3 = 1092616192(0x41200000, float:10.0)
            r4 = 2
            if (r2 == r4) goto L43
            r5 = 5
            if (r2 == r5) goto L2a
            r8 = 6
            if (r2 == r8) goto L88
            goto Lae
        L2a:
            float r1 = r6.distance(r8)
            r6.oldDist = r1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto Lae
            android.graphics.Matrix r1 = r6.savedMatrix
            android.graphics.Matrix r2 = r6.matrix
            r1.set(r2)
            android.graphics.PointF r1 = r6.mid
            r6.midPoint(r1, r8)
            r6.mode = r4
            goto Lae
        L43:
            int r1 = r6.mode
            if (r1 != r0) goto L66
            android.graphics.Matrix r1 = r6.matrix
            android.graphics.Matrix r2 = r6.savedMatrix
            r1.set(r2)
            android.graphics.Matrix r1 = r6.matrix
            float r2 = r8.getX()
            android.graphics.PointF r3 = r6.start
            float r3 = r3.x
            float r2 = r2 - r3
            float r8 = r8.getY()
            android.graphics.PointF r3 = r6.start
            float r3 = r3.y
            float r8 = r8 - r3
            r1.postTranslate(r2, r8)
            goto Lae
        L66:
            if (r1 != r4) goto Lae
            float r8 = r6.distance(r8)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 <= 0) goto Lae
            android.graphics.Matrix r1 = r6.matrix
            android.graphics.Matrix r2 = r6.savedMatrix
            r1.set(r2)
            float r1 = r6.oldDist
            float r8 = r8 / r1
            android.graphics.Matrix r1 = r6.matrix
            android.graphics.PointF r2 = r6.mid
            float r2 = r2.x
            android.graphics.PointF r3 = r6.mid
            float r3 = r3.y
            r1.postScale(r8, r8, r2, r3)
            goto Lae
        L88:
            r6.checkMatrix(r1)
            r8 = 0
            r6.mode = r8
            goto Lae
        L8f:
            android.graphics.Matrix r1 = r6.matrix
            android.graphics.Matrix r2 = r7.getImageMatrix()
            r1.set(r2)
            android.graphics.Matrix r1 = r6.savedMatrix
            android.graphics.Matrix r2 = r6.matrix
            r1.set(r2)
            android.graphics.PointF r1 = r6.start
            float r2 = r8.getX()
            float r8 = r8.getY()
            r1.set(r2, r8)
            r6.mode = r0
        Lae:
            android.graphics.Matrix r8 = r6.matrix
            r7.setImageMatrix(r8)
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.base.utils.crop.CropHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public Bitmap crop() {
        CropPath cropPath;
        if (this.imageView == null || (cropPath = this.cropPath) == null) {
            return null;
        }
        if (this.limit == null) {
            this.limit = cropPath.limit();
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.imageView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.limit.width(), this.limit.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, this.limit.width(), this.limit.height(), null, 31);
        Path path = new Path();
        path.addPath(this.cropPath.path(), -this.limit.left, -this.limit.top);
        canvas.drawPath(path, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.imageView.getDrawingCache(), -this.limit.left, -this.limit.top, paint);
        paint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        this.imageView.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public String cropAndSave(String str) throws IOException {
        Bitmap crop = crop();
        if (crop == null) {
            return null;
        }
        File file = new File(str);
        if (!file.getParentFile().exists() && !file.mkdirs()) {
            return null;
        }
        if (file.exists() && !file.delete()) {
            return null;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        crop.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        crop.recycle();
        return file.getAbsolutePath();
    }

    private void checkMatrix(Rect rect) {
        CropPath cropPath;
        if (this.limit == null && (cropPath = this.cropPath) != null) {
            this.limit = cropPath.limit();
        }
        if (this.limit != null) {
            if (this.mode == 2) {
                this.matrix.getValues(this.values);
                if (rect.width() * this.values[0] < this.limit.width()) {
                    float width = (this.limit.width() / rect.width()) / this.values[0];
                    this.matrix.postScale(width, width, this.mid.x, this.mid.y);
                }
                this.matrix.getValues(this.values);
                if (rect.height() * this.values[4] < this.limit.height()) {
                    float height = (this.limit.height() / rect.height()) / this.values[4];
                    this.matrix.postScale(height, height, this.mid.x, this.mid.y);
                }
            }
            this.matrix.getValues(this.values);
            if (this.values[2] >= this.limit.left) {
                this.matrix.postTranslate(this.limit.left - this.values[2], 0.0f);
            }
            this.matrix.getValues(this.values);
            if (this.values[2] + (rect.width() * this.values[0]) < this.limit.right) {
                Matrix matrix = this.matrix;
                float f = this.limit.right;
                float width2 = rect.width();
                float[] fArr = this.values;
                matrix.postTranslate((f - (width2 * fArr[0])) - fArr[2], 0.0f);
            }
            this.matrix.getValues(this.values);
            if (this.values[5] > this.limit.top) {
                this.matrix.postTranslate(0.0f, this.limit.top - this.values[5]);
            }
            this.matrix.getValues(this.values);
            if (this.values[5] + (rect.height() * this.values[4]) < this.limit.bottom) {
                Matrix matrix2 = this.matrix;
                float f2 = this.limit.bottom;
                float height2 = rect.height();
                float[] fArr2 = this.values;
                matrix2.postTranslate(0.0f, (f2 - (height2 * fArr2[4])) - fArr2[5]);
            }
        }
    }

    private float distance(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    private void midPoint(PointF pointF, MotionEvent motionEvent) {
        float x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        float y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        Log.d(TAG, "midPoint: " + x + " -- " + y);
        pointF.set(x, y);
    }
}
