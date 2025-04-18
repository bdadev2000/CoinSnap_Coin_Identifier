package com.bytedance.sdk.component.adexpress.vc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes.dex */
public class qsH extends Ne {
    private ImageView AlY;
    private ImageView Sg;
    private TextView YFl;
    private ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    private AnimatorSet f10426vc;
    private int wN;

    public qsH(Context context) {
        super(context);
        this.f10426vc = new AnimatorSet();
        Sg(context);
    }

    private void AlY() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        ofInt.setRepeatCount(-1);
        ofInt.start();
    }

    private void Sg(Context context) {
        addView(com.bytedance.sdk.component.adexpress.tN.YFl.Sg(context));
        this.Sg = (ImageView) findViewById(2097610751);
        this.tN = (ImageView) findViewById(2097610750);
        this.AlY = (ImageView) findViewById(2097610749);
        this.YFl = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void YFl(Context context) {
    }

    public float getAlphaColor() {
        return this.wN;
    }

    public void setAlphaColor(int i10) {
        if (i10 >= 0 && i10 <= 60) {
            int i11 = i10 + 195;
            this.AlY.setColorFilter(Color.rgb(i11, i11, i11), PorterDuff.Mode.SRC_IN);
            int i12 = ((i10 + 20) % 60) + 195;
            this.tN.setColorFilter(Color.rgb(i12, i12, i12), PorterDuff.Mode.SRC_IN);
            int i13 = ((i10 + 40) % 60) + 195;
            this.Sg.setColorFilter(Color.rgb(i13, i13, i13), PorterDuff.Mode.SRC_IN);
        }
    }

    public void setButtonText(String str) {
        if (this.YFl != null && !TextUtils.isEmpty(str)) {
            this.YFl.setText(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void YFl() {
        AlY();
    }

    @Override // com.bytedance.sdk.component.adexpress.vc.Ne
    public void Sg() {
        this.f10426vc.cancel();
    }
}
