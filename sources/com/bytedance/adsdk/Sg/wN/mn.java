package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.controller.a;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class mn {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.YoT YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        com.bytedance.adsdk.Sg.tN.YFl.YoT yoT = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.a)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    sg2 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 1:
                    sg3 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 2:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    yoT = tN.YFl(jsonReader, dsw);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.YoT(str, sg2, sg3, yoT, z10);
    }
}
