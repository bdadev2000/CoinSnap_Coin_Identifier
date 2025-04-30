package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class WriggleGuideView extends View {
    private Paint COT;
    private int HWF;
    private Bitmap KS;
    private boolean QR;
    private zp YW;
    private Bitmap jU;
    private boolean ku;
    private int lMd;
    private int zp;

    /* loaded from: classes.dex */
    public interface zp {
    }

    private Bitmap KS(int i9, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        canvas.drawCircle(i9 / 2, 10.0f, this.HWF, paint);
        return createBitmap;
    }

    private Bitmap lMd(int i9, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), cz.jU(getContext(), "tt_wriggle_union_white"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i9, i10), paint);
        }
        return createBitmap;
    }

    private Bitmap zp(int i9, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), cz.jU(getContext(), "tt_wriggle_union"));
        if (decodeResource != null) {
            canvas.drawBitmap(decodeResource, (Rect) null, new RectF(0.0f, 0.0f, i9, i10), this.COT);
        }
        return createBitmap;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.YW != null) {
            this.YW = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.QR) {
            this.zp = getWidth();
            int height = getHeight();
            this.lMd = height;
            this.KS = zp(this.zp, height);
            this.jU = lMd(this.zp, this.lMd);
            this.QR = false;
        }
        Bitmap bitmap = this.KS;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.COT);
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        Bitmap bitmap2 = this.jU;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.COT);
        }
        this.COT.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(KS(this.zp, this.lMd), 0.0f, 0.0f, this.COT);
        this.COT.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        if (this.ku) {
            this.HWF += 5;
            invalidate();
            if (this.HWF >= this.zp) {
                this.ku = false;
            }
        }
    }
}
