package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* loaded from: classes.dex */
public class WNy {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.tG zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 2;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    lmd = jU.zp(jsonReader, hwf, true);
                    break;
                case 1:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z8) {
            return null;
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.tG(str, lmd);
    }
}
