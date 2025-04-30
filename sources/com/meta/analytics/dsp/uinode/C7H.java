package com.meta.analytics.dsp.uinode;

import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.7H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7H extends QQ {
    public static String[] A01 = {"4h8fvEACfo1aNbNL", "KiY64Fil", "L", "TPcthrsJz3ToBiwYAQ4xewU", "cWfSExW1cmjdZd3Ek8eXqqhjC3VFU", "NINEnIjXlG8iO8hrf55I2V2lHb1VufX", "CO", "8GF4DU4RrtKBXlYvExHV9F2Nh74lSozH"};
    public final AbstractC09988s<C1354Nn> A00;

    public C7H(C1636Yn c1636Yn) {
        this(c1636Yn, null);
    }

    public C7H(C1636Yn c1636Yn, AttributeSet attributeSet) {
        this(c1636Yn, attributeSet, 0);
    }

    public C7H(C1636Yn c1636Yn, AttributeSet attributeSet, int i9) {
        super(c1636Yn, attributeSet, i9);
        this.A00 = new C1267Kb(this);
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        RelativeLayout.LayoutParams spinnerParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        spinnerParams.addRule(13);
        addView(progressBar, spinnerParams);
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A07() {
        super.A07();
        setVisibility(0);
        if (getVideoView() != null) {
            SA videoView = getVideoView();
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[7] = "LLc1CvKTLQ71W60sfu5S1t2gX7MmeGtJ";
            videoView.getEventBus().A05(this.A00);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.QQ
    public final void A08() {
        if (getVideoView() != null) {
            C09978r<AbstractC09988s, C09968q> eventBus = getVideoView().getEventBus();
            AbstractC09988s<C1354Nn> abstractC09988s = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "4Zu3PRCBzV1MZjgNBq7KORh";
            strArr2[1] = "VnRIjxfO";
            eventBus.A06(abstractC09988s);
        }
        setVisibility(8);
        super.A08();
    }
}
