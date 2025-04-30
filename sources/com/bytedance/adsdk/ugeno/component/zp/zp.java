package com.bytedance.adsdk.ugeno.component.zp;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* loaded from: classes.dex */
public abstract class zp extends com.bytedance.adsdk.ugeno.component.zp<UGFrameLayout> {
    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp, com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void zp(String str, String str2) {
        super.zp(str, str2);
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -411339735:
                if (str.equals("onVideoProgress")) {
                    c9 = 0;
                    break;
                }
                break;
            case 1139576207:
                if (str.equals("onVideoFinish")) {
                    c9 = 1;
                    break;
                }
                break;
            case 1302043440:
                if (str.equals("onVideoPlay")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1479592233:
                if (str.equals("onVideoResume")) {
                    c9 = 3;
                    break;
                }
                break;
            case 1708332410:
                if (str.equals("onVideoPause")) {
                    c9 = 4;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                lMd(str, str2);
                return;
            default:
                return;
        }
    }
}
