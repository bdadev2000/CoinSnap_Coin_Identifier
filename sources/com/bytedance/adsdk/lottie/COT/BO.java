package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.pvr;
import java.io.IOException;

/* loaded from: classes.dex */
class BO {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.pvr zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        String str = null;
        pvr.zp zpVar = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd3 = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 5;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    lmd2 = jU.zp(jsonReader, hwf, false);
                    break;
                case 1:
                    zpVar = pvr.zp.zp(jsonReader.nextInt());
                    break;
                case 2:
                    lmd3 = jU.zp(jsonReader, hwf, false);
                    break;
                case 3:
                    lmd = jU.zp(jsonReader, hwf, false);
                    break;
                case 4:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.pvr(str, zpVar, lmd, lmd2, lmd3, z8);
    }
}
