package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.component.lMd;
import com.bytedance.adsdk.ugeno.lMd.KS;
import com.bytedance.adsdk.ugeno.lMd.ku;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes.dex */
public class zp extends lMd<UGProgressBar> {
    private int DY;
    private float MBR;
    private String Rh;
    private int gH;
    private float rCC;
    private int zp;

    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
        ((UGProgressBar) this.COT).setBackgroundColor(this.DY);
        ((UGProgressBar) this.COT).setText(this.Rh);
        ((UGProgressBar) this.COT).setProgressBgColor(this.DY);
        ((UGProgressBar) this.COT).setProgressColor(this.zp);
        ((UGProgressBar) this.COT).setTextColor(this.gH);
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public UGProgressBar KS() {
        UGProgressBar uGProgressBar = new UGProgressBar(this.lMd);
        uGProgressBar.zp(this);
        return uGProgressBar;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1295741135:
                if (str.equals("progressBgColor")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c9 = 1;
                    break;
                }
                break;
            case -1003668786:
                if (str.equals("textSize")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                    c9 = 3;
                    break;
                }
                break;
            case 3556653:
                if (str.equals(MimeTypes.BASE_TYPE_TEXT)) {
                    c9 = 4;
                    break;
                }
                break;
            case 755159350:
                if (str.equals("progressColor")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                this.DY = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 1:
                this.gH = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            case 2:
                this.rCC = ku.zp(this.lMd, str2);
                return;
            case 3:
                this.MBR = KS.zp(str2, 0.0f);
                return;
            case 4:
                this.Rh = str2;
                return;
            case 5:
                this.zp = com.bytedance.adsdk.ugeno.lMd.zp.zp(str2);
                return;
            default:
                return;
        }
    }
}
