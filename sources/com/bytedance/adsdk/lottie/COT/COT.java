package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class COT {
    private static com.bytedance.adsdk.lottie.KS.lMd.zp lMd(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.KS.lMd.zp zpVar = null;
        while (true) {
            boolean z8 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                if (!nextName.equals("v")) {
                    if (!nextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.nextInt() == 0) {
                        z8 = true;
                    }
                } else if (z8) {
                    zpVar = new com.bytedance.adsdk.lottie.KS.lMd.zp(jU.zp(jsonReader, hwf));
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return zpVar;
        }
    }

    public static com.bytedance.adsdk.lottie.KS.lMd.zp zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        com.bytedance.adsdk.lottie.KS.lMd.zp zpVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.KS.lMd.zp lMd = lMd(jsonReader, hwf);
                    if (lMd != null) {
                        zpVar = lMd;
                    }
                }
                jsonReader.endArray();
            }
        }
        return zpVar;
    }
}
