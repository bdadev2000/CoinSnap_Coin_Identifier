package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.dT;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: classes.dex */
class QUv {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.dT zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, int i9) throws IOException {
        boolean z8;
        if (i9 == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = false;
        boolean z10 = z8;
        String str = null;
        dT.zp zpVar = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd3 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd4 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd5 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
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
                case 3369:
                    if (nextName.equals("ir")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c9 = '\n';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    if (jsonReader.nextInt() == 3) {
                        z10 = true;
                        break;
                    } else {
                        z10 = false;
                        break;
                    }
                case 1:
                    tGVar = zp.lMd(jsonReader, hwf);
                    break;
                case 2:
                    lmd2 = jU.zp(jsonReader, hwf, false);
                    break;
                case 3:
                    z9 = jsonReader.nextBoolean();
                    break;
                case 4:
                    lmd3 = jU.zp(jsonReader, hwf);
                    break;
                case 5:
                    lmd5 = jU.zp(jsonReader, hwf, false);
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                case 7:
                    lmd4 = jU.zp(jsonReader, hwf);
                    break;
                case '\b':
                    lmd6 = jU.zp(jsonReader, hwf, false);
                    break;
                case '\t':
                    lmd = jU.zp(jsonReader, hwf, false);
                    break;
                case '\n':
                    zpVar = dT.zp.zp(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.dT(str, zpVar, lmd, tGVar, lmd2, lmd3, lmd4, lmd5, lmd6, z9, z10);
    }
}
