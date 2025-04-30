package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.controller.a;
import java.io.IOException;

/* loaded from: classes.dex */
class YhE {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.vDp zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2 = null;
        com.bytedance.adsdk.lottie.KS.zp.vDp vdp = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.f15376a)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c9 = 4;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    lmd = jU.zp(jsonReader, hwf, false);
                    break;
                case 1:
                    lmd2 = jU.zp(jsonReader, hwf, false);
                    break;
                case 2:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    vdp = KS.zp(jsonReader, hwf);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.vDp(str, lmd, lmd2, vdp, z8);
    }
}
