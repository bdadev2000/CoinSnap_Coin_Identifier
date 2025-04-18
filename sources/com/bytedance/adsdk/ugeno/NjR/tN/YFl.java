package com.bytedance.adsdk.ugeno.NjR.tN;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.NjR.AlY.tN;

/* loaded from: classes.dex */
public class YFl extends tN {
    private int Gmi;

    public YFl(Context context) {
        super(context);
    }

    private String vc(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -282781070:
                if (str.equals("unmuted")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3015911:
                if (str.equals("back")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3327403:
                if (str.equals("logo")) {
                    c10 = 2;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = 3;
                    break;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "local://tt_reward_full_unmute";
            case 1:
                return "local://tt_ugen_back";
            case 2:
                return "local://tt_ad_logo";
            case 3:
                return "local://tt_close_btn";
            case 4:
                return "local://tt_reward_full_mute";
            default:
                return "";
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NjR.AlY.tN, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        ((tN) this).YFl = vc(((tN) this).YFl);
        super.Sg();
        ((com.bytedance.adsdk.ugeno.NjR.AlY.YFl) this.wN).setColorFilter(this.Gmi);
        ((com.bytedance.adsdk.ugeno.NjR.AlY.YFl) this.wN).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.NjR.AlY.tN, com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.Gmi = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
        }
    }
}
