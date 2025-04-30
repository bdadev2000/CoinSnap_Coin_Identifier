package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.YW;
import java.io.IOException;

/* loaded from: classes.dex */
class RCv {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.YW zp(JsonReader jsonReader) throws IOException {
        String str = null;
        YW.zp zpVar = null;
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
                case 3488:
                    if (nextName.equals("mm")) {
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
                    z8 = jsonReader.nextBoolean();
                    break;
                case 1:
                    zpVar = YW.zp.zp(jsonReader.nextInt());
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.YW(str, zpVar, z8);
    }
}
