package com.bytedance.adsdk.ugeno.NjR.DSW;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class YFl extends com.bytedance.adsdk.ugeno.Sg.YFl<com.bytedance.adsdk.ugeno.NjR.Sg.YFl> {
    public YFl(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -411339735:
                if (str.equals("onVideoProgress")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1139576207:
                if (str.equals("onVideoFinish")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1302043440:
                if (str.equals("onVideoPlay")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1479592233:
                if (str.equals("onVideoResume")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1708332410:
                if (str.equals("onVideoPause")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                Sg(str, str2);
                return;
            default:
                return;
        }
    }
}
