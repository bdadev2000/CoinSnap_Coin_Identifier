package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class Pxi {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.woN zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.KS.zp.ku kuVar = null;
        int i9 = 0;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
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
                case 104415:
                    if (nextName.equals("ind")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 1:
                    kuVar = jU.COT(jsonReader, hwf);
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    i9 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.woN(str, i9, kuVar, z8);
    }
}
