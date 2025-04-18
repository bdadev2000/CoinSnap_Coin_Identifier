package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class rkt extends View {
    private Drawable AlY;
    private final boolean Sg;
    private final Path YFl;
    private int tN;

    /* renamed from: vc, reason: collision with root package name */
    private float f10771vc;
    private Drawable wN;

    public rkt(Context context) {
        this(context, false);
    }

    private void Sg() {
        int width = getWidth();
        int height = getHeight();
        if (this.f10771vc > 0.0f && width > 0 && height > 0) {
            this.YFl.reset();
            this.YFl.addRect(new RectF(0.0f, 0.0f, width * this.f10771vc, height), Path.Direction.CCW);
        }
    }

    private void YFl() {
        Context context = getContext();
        this.AlY = com.bytedance.sdk.component.utils.qO.tN(context, this.Sg ? "tt_star_thick_dark" : "tt_star_thick");
        this.wN = com.bytedance.sdk.component.utils.qO.tN(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.tN <= 0) {
            return;
        }
        int save = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.AlY.draw(canvas);
            canvas.translate(this.tN, 0.0f);
        }
        canvas.restoreToCount(save);
        canvas.clipPath(this.YFl);
        for (int i11 = 0; i11 < 5; i11++) {
            this.wN.draw(canvas);
            canvas.translate(this.tN, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.tN * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.tN, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Sg();
    }

    public rkt(Context context, boolean z10) {
        super(context);
        this.YFl = new Path();
        this.Sg = z10;
        YFl();
    }

    public void YFl(double d10, int i10) {
        int YFl = (int) GS.YFl(getContext(), i10, false);
        this.tN = YFl;
        this.AlY.setBounds(0, 0, YFl, YFl);
        Drawable drawable = this.wN;
        int i11 = this.tN;
        drawable.setBounds(0, 0, i11, i11);
        this.f10771vc = ((float) d10) / 5.0f;
        Sg();
        requestLayout();
    }
}
