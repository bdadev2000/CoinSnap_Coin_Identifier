package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class rV {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.KS zp(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        float f9 = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case -1866931350:
                    if (nextName.equals("fFamily")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1408684838:
                    if (nextName.equals("ascent")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1294566165:
                    if (nextName.equals("fStyle")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 96619537:
                    if (nextName.equals("fName")) {
                        c9 = 3;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    f9 = (float) jsonReader.nextDouble();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    break;
                case 3:
                    str3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.KS.KS(str, str3, str2, f9);
    }
}
