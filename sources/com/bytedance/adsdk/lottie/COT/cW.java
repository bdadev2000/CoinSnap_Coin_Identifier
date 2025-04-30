package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: classes.dex */
class cW {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.Bj zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 4;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    tGVar = zp.lMd(jsonReader, hwf);
                    break;
                case 1:
                    lmd = jU.zp(jsonReader, hwf);
                    break;
                case 2:
                    hwf2 = jU.KS(jsonReader, hwf);
                    break;
                case 3:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.Bj(str, tGVar, hwf2, lmd, z8);
    }
}
