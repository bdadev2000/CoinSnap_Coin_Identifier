package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.cz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FlowLightView extends View {
    private Paint Bj;
    private int COT;
    private int HWF;
    private int KS;
    private int QR;
    private int[] YW;
    private final List<zp> dQp;
    private Bitmap dT;
    private int jU;
    private int ku;
    Rect lMd;
    private LinearGradient rV;
    private PorterDuff.Mode tG;
    private Xfermode vDp;
    Rect zp;

    /* loaded from: classes.dex */
    public static class zp {
        private int lMd = 0;
        private final int zp;

        public zp(int i9) {
            this.zp = i9;
        }

        public void zp() {
            this.lMd += this.zp;
        }
    }

    public FlowLightView(Context context) {
        super(context);
        this.tG = PorterDuff.Mode.DST_IN;
        this.dQp = new ArrayList();
        zp();
    }

    private void zp() {
        this.KS = cz.jU(getContext(), "tt_splash_unlock_image_arrow");
        this.jU = Color.parseColor("#00ffffff");
        this.COT = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.HWF = parseColor;
        this.QR = 10;
        this.ku = 40;
        this.YW = new int[]{this.jU, this.COT, parseColor};
        setLayerType(1, null);
        this.Bj = new Paint(1);
        this.dT = BitmapFactory.decodeResource(getResources(), this.KS);
        this.vDp = new PorterDuffXfermode(this.tG);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.dT, this.zp, this.lMd, this.Bj);
        canvas.save();
        Iterator<zp> it = this.dQp.iterator();
        while (it.hasNext()) {
            zp next = it.next();
            this.rV = new LinearGradient(next.lMd, 0.0f, next.lMd + this.ku, this.QR, this.YW, (float[]) null, Shader.TileMode.CLAMP);
            this.Bj.setColor(-1);
            this.Bj.setShader(this.rV);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.Bj);
            this.Bj.setShader(null);
            next.zp();
            if (next.lMd > getWidth()) {
                it.remove();
            }
        }
        this.Bj.setXfermode(this.vDp);
        canvas.drawBitmap(this.dT, this.zp, this.lMd, this.Bj);
        this.Bj.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.dT == null) {
            return;
        }
        this.zp = new Rect(0, 0, this.dT.getWidth(), this.dT.getHeight());
        this.lMd = new Rect(0, 0, getWidth(), getHeight());
    }

    public void zp(int i9) {
        this.dQp.add(new zp(i9));
        postInvalidate();
    }
}
