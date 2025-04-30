package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class eWG {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.KVG zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
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
                case 3371:
                    if (nextName.equals("it")) {
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
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.lottie.KS.lMd.KS zp = ku.zp(jsonReader, hwf);
                        if (zp != null) {
                            arrayList.add(zp);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.KVG(str, arrayList, z8);
    }
}
