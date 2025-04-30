package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class DynamicVideoView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.COT {
    boolean cz;
    FrameLayout lMd;
    TextView zp;

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.cz = false;
        View view = new View(context);
        this.dQp = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.zp = new TextView(context);
        this.lMd = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) QR.zp(context, 40.0f), (int) QR.zp(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.zp.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.zp.setBackground(gradientDrawable);
        this.zp.setTextSize(10.0f);
        this.zp.setGravity(17);
        this.zp.setTextColor(-1);
        this.zp.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            addView(this.lMd, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.zp);
        addView(this.dQp, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.jU.lMd()) {
            addView(this.lMd, getWidgetLayoutParams());
        }
        dynamicRootView.KS = this.lMd;
        dynamicRootView.setVideoListener(this);
    }

    private void KS(View view) {
        if (view == this.zp || view == ((DynamicBaseWidgetImp) this).pvr) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.zp.HWF)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i9 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i9 < viewGroup.getChildCount()) {
                KS(viewGroup.getChildAt(i9));
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean COT() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        double d2 = 0.0d;
        double d9 = 0.0d;
        for (ku kuVar = this.tG; kuVar != null; kuVar = kuVar.vDp()) {
            d9 = (d9 + kuVar.HWF()) - kuVar.jU();
            d2 = (d2 + kuVar.QR()) - kuVar.COT();
        }
        try {
            float f9 = (float) d9;
            int zp = (int) QR.zp(getContext(), f9);
            int zp2 = (int) QR.zp(getContext(), f9 + this.COT);
            if (com.bytedance.sdk.component.adexpress.jU.lMd.zp(getContext())) {
                int dynamicWidth = ((DynamicRoot) this.rV.getChildAt(0)).getDynamicWidth();
                int i9 = dynamicWidth - zp2;
                zp2 = dynamicWidth - zp;
                zp = i9;
            }
            if (!"open_ad".equals(this.rV.getRenderRequest().jU())) {
                float f10 = (float) d2;
                ((DynamicRoot) this.rV.getChildAt(0)).zp.zp(zp, (int) QR.zp(getContext(), f10), zp2, (int) QR.zp(getContext(), f10 + this.HWF));
            } else {
                this.rV.KS = this.lMd;
            }
        } catch (Exception unused) {
        }
        this.rV.zp(d9, d2, this.COT, this.HWF, this.vDp.dQp());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.COT
    public void setTimeUpdate(int i9) {
        String str;
        String str2;
        if (this.tG.dT().COT().hl() && i9 > 0 && !this.cz) {
            if (i9 >= 60) {
                str = "0" + (i9 / 60);
            } else {
                str = "00";
            }
            String j7 = o.j(str, ":");
            int i10 = i9 % 60;
            if (i10 > 9) {
                str2 = j7 + i10;
            } else {
                str2 = j7 + "0" + i10;
            }
            this.zp.setText(str2);
            this.zp.setVisibility(0);
            return;
        }
        this.cz = true;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            KS(getChildAt(i11));
        }
        this.zp.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.COT
    public void zp() {
        this.zp.setVisibility(8);
    }
}
