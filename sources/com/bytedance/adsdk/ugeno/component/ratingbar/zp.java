package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.lMd;

/* loaded from: classes.dex */
public class zp extends lMd<UGRatingBar> {
    private int DY;
    private float Rh;
    private int gH;
    private int zp;

    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((UGRatingBar) this.COT).zp(this.Rh, this.zp, this.gH, 5);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public UGRatingBar KS() {
        UGRatingBar uGRatingBar = new UGRatingBar(this.lMd);
        uGRatingBar.zp(this);
        return uGRatingBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1810866385:
                if (str.equals("highLightColor")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1804390815:
                if (str.equals("lowLightColor")) {
                    c9 = 1;
                    break;
                }
                break;
            case 3530753:
                if (str.equals("size")) {
                    c9 = 2;
                    break;
                }
                break;
            case 109264530:
                if (str.equals("score")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.zp = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 1:
                this.DY = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 2:
                try {
                    this.gH = Integer.parseInt(str2);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 3:
                try {
                    this.Rh = Float.parseFloat(str2);
                    return;
                } catch (NumberFormatException unused2) {
                    this.Rh = 5.0f;
                    return;
                }
            default:
                return;
        }
    }
}
