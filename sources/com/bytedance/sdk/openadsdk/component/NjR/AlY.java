package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class AlY extends tN {
    private final com.bytedance.sdk.openadsdk.core.wN.qsH EH;
    private final com.bytedance.sdk.openadsdk.core.wN.tN GA;
    private final com.bytedance.sdk.openadsdk.core.wN.wN lG;
    private final rkt pDU;
    private final com.bytedance.sdk.openadsdk.core.wN.AlY rkt;

    /* loaded from: classes.dex */
    public static final class YFl extends Drawable {
        private final boolean AlY;
        private static final int wN = Color.parseColor("#b0000000");

        /* renamed from: vc, reason: collision with root package name */
        private static final int f10572vc = Color.parseColor("#40000000");
        private final RectF YFl = new RectF();
        private final Paint Sg = new Paint();
        private final Path tN = new Path();

        public YFl(Context context) {
            this.AlY = com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.drawPath(this.tN, this.Sg);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(@NonNull Rect rect) {
            float[] fArr;
            int i10;
            int i11;
            super.onBoundsChange(rect);
            this.YFl.set(rect);
            this.tN.reset();
            int height = rect.height() / 2;
            Path path = this.tN;
            RectF rectF = this.YFl;
            if (this.AlY) {
                float f10 = height;
                fArr = new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10};
            } else {
                float f11 = height;
                fArr = new float[]{0.0f, 0.0f, f11, f11, f11, f11, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f12 = rect.right;
            int[] iArr = new int[2];
            boolean z10 = this.AlY;
            if (z10) {
                i10 = f10572vc;
            } else {
                i10 = wN;
            }
            iArr[0] = i10;
            if (z10) {
                i11 = wN;
            } else {
                i11 = f10572vc;
            }
            iArr[1] = i11;
            this.Sg.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public AlY(Context context) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int tN = GS.tN(context, 8.0f);
        int tN2 = GS.tN(context, 9.0f);
        int tN3 = GS.tN(context, 10.0f);
        int tN4 = GS.tN(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.tN tNVar = new com.bytedance.sdk.openadsdk.core.widget.tN(context);
        this.YoT = tNVar;
        tNVar.setPadding(tN2, 0, tN2, 0);
        this.YoT.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(GS.tN(context, 32.0f), GS.tN(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, tN3, tN3);
        this.YoT.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar2 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        this.GA = tNVar2;
        tNVar2.setBackgroundColor(-1);
        tNVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, GS.tN(context, 107.0f));
        layoutParams2.addRule(12);
        tNVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(0);
        wNVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        wNVar.setLayoutParams(layoutParams3);
        tNVar2.addView(wNVar);
        lG lGVar = new lG(context);
        this.f10574vc = lGVar;
        lGVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(tN4, tN4);
        layoutParams4.rightMargin = tN;
        layoutParams4.setMarginEnd(tN);
        this.f10574vc.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.DSW = qsh;
        qsh.setId(520093761);
        this.DSW.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.DSW.setEllipsize(TextUtils.TruncateAt.END);
        this.DSW.setMaxLines(2);
        this.DSW.setTextColor(Color.parseColor("#161823"));
        this.DSW.setTextSize(30.0f);
        wNVar.addView(this.f10574vc);
        wNVar.addView(this.DSW);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar3 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, tNVar2.getId());
        layoutParams5.addRule(10);
        tNVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.YFl = alY;
        alY.setId(520093754);
        this.YFl.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tNVar3.addView(this.YFl, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar4 = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        this.Sg = tNVar4;
        tNVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        tNVar3.addView(this.Sg, layoutParams6);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.tN = alY2;
        alY2.setId(520093756);
        tNVar3.addView(this.tN, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.wN = qsh2;
        qsh2.setId(520093717);
        this.wN.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, Color.parseColor("#b3000000"), 24));
        this.wN.setEllipsize(TextUtils.TruncateAt.END);
        this.wN.setGravity(17);
        this.wN.setSingleLine(true);
        this.wN.setText(qO.YFl(context, "tt_video_download_apk"));
        this.wN.setTextColor(-1);
        this.wN.setTextSize(1, 16.0f);
        this.wN.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(GS.tN(context, 236.0f), GS.tN(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = GS.tN(context, 32.0f);
        tNVar3.addView(this.wN, layoutParams7);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        this.lG = wNVar2;
        wNVar2.setOrientation(0);
        wNVar2.setGravity(16);
        wNVar2.setBackground(new YFl(context));
        wNVar2.setPadding(GS.tN(context, 16.0f), GS.tN(context, 8.0f), GS.tN(context, 16.0f), GS.tN(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = GS.tN(context, 90.0f);
        wNVar2.setLayoutParams(layoutParams8);
        lG lGVar2 = new lG(context);
        this.rkt = lGVar2;
        wNVar2.addView(lGVar2, new LinearLayout.LayoutParams(GS.tN(context, 36.0f), GS.tN(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar3 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = GS.tN(context, 8.0f);
        wNVar2.addView(wNVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.EH = qsh3;
        qsh3.setTextColor(-1);
        wNVar3.addView(qsh3, new LinearLayout.LayoutParams(-2, -2));
        rkt rktVar = new rkt(context, true);
        this.pDU = rktVar;
        wNVar3.addView(rktVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.AlY = pAGLogoView;
        pAGLogoView.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, GS.tN(context, 14.0f));
        layoutParams10.gravity = 83;
        tNVar3.addView(this.AlY, layoutParams10);
        addView(tNVar3);
        addView(this.YoT);
        addView(tNVar2);
        addView(this.qsH);
        addView(wNVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.AlY getAdIconView() {
        return this.rkt;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.qsH getAdTitleTextView() {
        return this.EH;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.wN getOverlayLayout() {
        return this.lG;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public rkt getScoreBar() {
        return this.pDU;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public View getUserInfo() {
        return this.GA;
    }
}
