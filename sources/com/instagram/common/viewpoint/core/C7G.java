package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.android.gms.location.GeofenceStatusCodes;

/* renamed from: com.facebook.ads.redexgen.X.7G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7G extends AbstractC0861Sm {
    public final Paint A00;
    public final C1045Zs A01;
    public final JF A02;
    public final AbstractC0858Sj A03;
    public final AbstractC0852Sd A04;
    public final AbstractC0836Rn A05;
    public final RD A06;

    public C7G(C1045Zs c1045Zs, boolean z2, JF jf) {
        super(c1045Zs);
        this.A04 = new AbstractC0852Sd() { // from class: com.facebook.ads.redexgen.X.7K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9P c9p) {
                RD rd;
                rd = C7G.this.A06;
                rd.setChecked(true);
            }
        };
        this.A05 = new AbstractC0836Rn() { // from class: com.facebook.ads.redexgen.X.7I
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(SZ sz) {
                RD rd;
                rd = C7G.this.A06;
                rd.setChecked(false);
            }
        };
        this.A03 = new AbstractC0858Sj() { // from class: com.facebook.ads.redexgen.X.7H
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC03808x
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C9R c9r) {
                RD rd;
                rd = C7G.this.A06;
                rd.setChecked(true);
            }
        };
        this.A02 = jf;
        this.A01 = c1045Zs;
        this.A06 = new RD(c1045Zs, z2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z2) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        M3.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        M3.A0G(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0861Sm
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new RA(this);
        setOnClickListener(clickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0861Sm
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
        int i2 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i2 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f2 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f2, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
