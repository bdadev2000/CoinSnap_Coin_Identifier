package com.bytedance.adsdk.ugeno.component.dislike;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.component.lMd;
import com.bytedance.adsdk.ugeno.lMd.ku;

/* loaded from: classes.dex */
public class zp extends lMd<DislikeView> {
    private int DY;
    private int Rh;
    private int zp;

    public zp(Context context) {
        super(context);
        this.zp = 0;
        this.Rh = 0;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((DislikeView) this.COT).setRadius(this.cW);
        ((DislikeView) this.COT).setStrokeWidth((int) this.ffE);
        ((DislikeView) this.COT).setDislikeColor(this.zp);
        ((DislikeView) this.COT).setStrokeColor(this.eWG);
        ((DislikeView) this.COT).setDislikeWidth(this.DY);
        ((DislikeView) this.COT).setBgColor(this.Rh);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public DislikeView KS() {
        DislikeView dislikeView = new DislikeView(this.lMd);
        dislikeView.zp(this);
        return dislikeView;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -991792834:
                if (str.equals("dislikeColor")) {
                    c9 = 0;
                    break;
                }
                break;
            case -973508703:
                if (str.equals("dislikeWidth")) {
                    c9 = 1;
                    break;
                }
                break;
            case 95494139:
                if (str.equals("dislikeFillColor")) {
                    c9 = 2;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.zp = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 1:
                this.DY = (int) ku.zp(this.lMd, Integer.parseInt(str2));
                return;
            case 2:
                this.Rh = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            default:
                return;
        }
    }
}
