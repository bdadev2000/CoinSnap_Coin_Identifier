package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: classes.dex */
class HWF {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.lMd zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, int i9) throws IOException {
        boolean z8;
        if (i9 == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = z8;
        boolean z10 = false;
        String str = null;
        com.bytedance.adsdk.lottie.KS.zp.tG<PointF, PointF> tGVar = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf2 = null;
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
                    if (jsonReader.nextInt() == 3) {
                        z9 = true;
                        break;
                    } else {
                        z9 = false;
                        break;
                    }
                case 1:
                    tGVar = zp.lMd(jsonReader, hwf);
                    break;
                case 2:
                    hwf2 = jU.KS(jsonReader, hwf);
                    break;
                case 3:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.lMd(str, tGVar, hwf2, z9, z10);
    }
}
