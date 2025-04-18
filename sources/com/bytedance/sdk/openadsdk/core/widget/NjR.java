package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class NjR extends View {
    private static final int[] YFl = {Color.parseColor("#1AFFFFFF"), Color.parseColor("#4DFFFFFF"), Color.parseColor("#99FFFFFF")};
    private final ArrayList<YFl> AlY;
    private int DSW;
    private int NjR;
    private final RectF Sg;
    private int qsH;
    private final RectF tN;

    /* renamed from: vc, reason: collision with root package name */
    private final Paint f10756vc;
    private final Paint wN;

    /* loaded from: classes.dex */
    public static final class YFl {
        float AlY;
        public float Sg;
        public Paint YFl;
        float tN;

        public YFl(Paint paint, float f10, float f11, float f12) {
            this.YFl = paint;
            this.Sg = f10;
            this.tN = f11;
            this.AlY = f12;
        }
    }

    public NjR(Context context) {
        super(context);
        this.Sg = new RectF();
        this.tN = new RectF();
        this.AlY = new ArrayList<>();
        this.f10756vc = new Paint();
        Paint paint = new Paint();
        this.wN = paint;
        paint.setColor(Color.parseColor("#D9D9D9"));
    }

    private void YFl() {
        if (this.DSW <= 0) {
            return;
        }
        int width = (int) (((this.qsH * 1.0f) / 100.0f) * getWidth());
        this.tN.right = Math.max(this.NjR, width);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.Sg;
        int i10 = this.DSW;
        canvas.drawRoundRect(rectF, i10, i10, this.wN);
        RectF rectF2 = this.tN;
        int i11 = this.DSW;
        canvas.drawRoundRect(rectF2, i11, i11, this.f10756vc);
        int save = canvas.save();
        canvas.translate(this.tN.right - this.NjR, 0.0f);
        Iterator<YFl> it = this.AlY.iterator();
        while (it.hasNext()) {
            YFl next = it.next();
            canvas.drawCircle(next.tN, next.AlY, next.Sg, next.YFl);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = i11 / 2;
        this.DSW = i14;
        this.NjR = i14 * 5;
        float f10 = i10;
        float f11 = i11;
        this.Sg.set(0.0f, 0.0f, f10, f11);
        this.tN.set(0.0f, 0.0f, 0.0f, f11);
        this.f10756vc.setShader(new LinearGradient(0.0f, 0.0f, f10, f11, new int[]{Color.parseColor("#90C0FF"), Color.parseColor("#196BE4")}, (float[]) null, Shader.TileMode.CLAMP));
        this.AlY.clear();
        float f12 = this.DSW / 4.0f;
        for (int i15 : YFl) {
            Paint paint = new Paint();
            paint.setColor(i15);
            this.AlY.add(new YFl(paint, this.DSW / 2.0f, f12, f11 / 2.0f));
            f12 += (this.DSW / 2.0f) * 3.0f;
        }
        YFl();
    }

    public void setProgress(int i10) {
        int i11 = this.qsH;
        if (i11 == i10) {
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 > 100) {
            i10 = 100;
        }
        if (i11 == i10) {
            return;
        }
        this.qsH = i10;
        YFl();
    }
}
