package com.bytedance.sdk.component.adexpress.vc;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class YoT extends View {
    private int AlY;
    private int DSW;
    private final List<YFl> EH;
    private PorterDuff.Mode GA;
    private int[] NjR;
    Rect Sg;
    Rect YFl;
    private Xfermode YoT;
    private Paint eT;

    /* renamed from: nc, reason: collision with root package name */
    private Bitmap f10418nc;
    private LinearGradient pDU;
    private int qsH;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10419vc;
    private int wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private int Sg = 0;
        private final int YFl;

        public YFl(int i10) {
            this.YFl = i10;
        }

        public void YFl() {
            this.Sg += this.YFl;
        }
    }

    public YoT(Context context) {
        super(context);
        this.GA = PorterDuff.Mode.DST_IN;
        this.EH = new ArrayList();
        YFl();
    }

    private void YFl() {
        this.tN = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_splash_unlock_image_arrow");
        this.AlY = Color.parseColor("#00ffffff");
        this.wN = Color.parseColor("#ffffffff");
        int parseColor = Color.parseColor("#00ffffff");
        this.f10419vc = parseColor;
        this.DSW = 10;
        this.qsH = 40;
        this.NjR = new int[]{this.AlY, this.wN, parseColor};
        setLayerType(1, null);
        this.eT = new Paint(1);
        this.f10418nc = BitmapFactory.decodeResource(getResources(), this.tN);
        this.YoT = new PorterDuffXfermode(this.GA);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f10418nc, this.YFl, this.Sg, this.eT);
        canvas.save();
        Iterator<YFl> it = this.EH.iterator();
        while (it.hasNext()) {
            YFl next = it.next();
            this.pDU = new LinearGradient(next.Sg, 0.0f, next.Sg + this.qsH, this.DSW, this.NjR, (float[]) null, Shader.TileMode.CLAMP);
            this.eT.setColor(-1);
            this.eT.setShader(this.pDU);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.eT);
            this.eT.setShader(null);
            next.YFl();
            if (next.Sg > getWidth()) {
                it.remove();
            }
        }
        this.eT.setXfermode(this.YoT);
        canvas.drawBitmap(this.f10418nc, this.YFl, this.Sg, this.eT);
        this.eT.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f10418nc == null) {
            return;
        }
        this.YFl = new Rect(0, 0, this.f10418nc.getWidth(), this.f10418nc.getHeight());
        this.Sg = new Rect(0, 0, getWidth(), getHeight());
    }

    public void YFl(int i10) {
        this.EH.add(new YFl(i10));
        postInvalidate();
    }
}
