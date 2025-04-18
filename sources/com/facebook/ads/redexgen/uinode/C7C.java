package com.facebook.ads.redexgen.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7C extends QQ {
    public final Paint A00;
    public final C1070Yn A01;
    public final JA A02;
    public final AbstractC0847Pu A03;
    public final AbstractC0814On A04;
    public final O7 A05;
    public final C0860Qh A06;

    public C7C(C1070Yn c1070Yn, boolean z10, JA ja2) {
        super(c1070Yn);
        this.A04 = new AbstractC0814On() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                C0860Qh c0860Qh;
                c0860Qh = C7C.this.A06;
                c0860Qh.setChecked(true);
            }
        };
        this.A05 = new O7() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                C0860Qh c0860Qh;
                c0860Qh = C7C.this.A06;
                c0860Qh.setChecked(false);
            }
        };
        this.A03 = new AbstractC0847Pu() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                C0860Qh c0860Qh;
                c0860Qh = C7C.this.A06;
                c0860Qh.setChecked(true);
            }
        };
        this.A02 = ja2;
        this.A01 = c1070Yn;
        C0860Qh c0860Qh = new C0860Qh(c1070Yn, z10);
        this.A06 = c0860Qh;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        c0860Qh.setLayoutParams(layoutParams);
        c0860Qh.setChecked(true);
        c0860Qh.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z10) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        AbstractC0737Lo.A0M(this, 0);
        addView(c0860Qh);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        AbstractC0737Lo.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.uinode.QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC0857Qe(this);
        setOnClickListener(clickListener);
    }

    @Override // com.facebook.ads.redexgen.uinode.QQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i10 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i10 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f10 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f10, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
