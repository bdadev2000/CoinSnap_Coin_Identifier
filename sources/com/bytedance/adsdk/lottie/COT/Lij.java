package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
class Lij {
    public static com.bytedance.adsdk.lottie.zp.lMd.YW zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        boolean z8;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new com.bytedance.adsdk.lottie.zp.lMd.YW(hwf, cz.zp(jsonReader, hwf, com.bytedance.adsdk.lottie.HWF.HWF.zp(), Gzh.zp, z8, false));
    }
}
