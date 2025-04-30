package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class lMd {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static com.bytedance.adsdk.lottie.KS.zp.Bj lMd(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar = null;
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 116:
                    if (nextName.equals("t")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    lmd2 = jU.zp(jsonReader, hwf);
                    break;
                case 1:
                    zpVar = jU.QR(jsonReader, hwf);
                    break;
                case 2:
                    zpVar2 = jU.QR(jsonReader, hwf);
                    break;
                case 3:
                    lmd = jU.zp(jsonReader, hwf);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.KS.zp.Bj(zpVar, zpVar2, lmd, lmd2);
    }

    public static com.bytedance.adsdk.lottie.KS.zp.Bj zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.KS.zp.Bj bj = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                bj = lMd(jsonReader, hwf);
            }
        }
        jsonReader.endObject();
        if (bj == null) {
            return new com.bytedance.adsdk.lottie.KS.zp.Bj(null, null, null, null);
        }
        return bj;
    }
}
