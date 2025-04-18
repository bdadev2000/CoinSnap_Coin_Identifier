package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg.NjR;
import java.io.IOException;

/* loaded from: classes.dex */
class UZM {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.NjR YFl(JsonReader jsonReader) throws IOException {
        String str = null;
        NjR.YFl yFl = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3488:
                    if (nextName.equals("mm")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 1:
                    yFl = NjR.YFl.YFl(jsonReader.nextInt());
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.NjR(str, yFl, z10);
    }
}
