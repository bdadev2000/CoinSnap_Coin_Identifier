package com.meta.analytics.dsp.uinode;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.location.GeofenceStatusCodes;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7C extends QQ {
    public final Paint A00;
    public final C1636Yn A01;
    public final JA A02;
    public final AbstractC1413Pu A03;
    public final AbstractC1380On A04;
    public final O7 A05;
    public final C1426Qh A06;

    public C7C(C1636Yn c1636Yn, boolean z8, JA ja) {
        super(c1636Yn);
        this.A04 = new AbstractC1380On() { // from class: com.facebook.ads.redexgen.X.7F
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass98 anonymousClass98) {
                C1426Qh c1426Qh;
                c1426Qh = C7C.this.A06;
                c1426Qh.setChecked(true);
            }
        };
        this.A05 = new O7() { // from class: com.facebook.ads.redexgen.X.7E
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(O8 o82) {
                C1426Qh c1426Qh;
                c1426Qh = C7C.this.A06;
                c1426Qh.setChecked(false);
            }
        };
        this.A03 = new AbstractC1413Pu() { // from class: com.facebook.ads.redexgen.X.7D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9H c9h) {
                C1426Qh c1426Qh;
                c1426Qh = C7C.this.A06;
                c1426Qh.setChecked(true);
            }
        };
        this.A02 = ja;
        this.A01 = c1636Yn;
        C1426Qh c1426Qh = new C1426Qh(c1636Yn, z8);
        this.A06 = c1426Qh;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        c1426Qh.setLayoutParams(layoutParams);
        c1426Qh.setChecked(true);
        c1426Qh.setClickable(false);
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setStyle(Paint.Style.FILL);
        if (z8) {
            paint.setColor(-1728053248);
        } else {
            paint.setColor(-1);
            paint.setAlpha(204);
        }
        AbstractC1303Lo.A0M(this, 0);
        addView(c1426Qh);
        setGravity(17);
        RelativeLayout.LayoutParams layout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layout.addRule(13);
        setLayoutParams(layout);
        AbstractC1303Lo.A0G(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, this);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC1423Qe(this);
        setOnClickListener(clickListener);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
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
        int i9 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i9 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f9 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f9, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
