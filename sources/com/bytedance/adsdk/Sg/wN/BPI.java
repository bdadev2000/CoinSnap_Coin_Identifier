package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg.qO;
import java.io.IOException;

/* loaded from: classes.dex */
class BPI {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.qO YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        String str = null;
        qO.YFl yFl = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg4 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    sg3 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 1:
                    yFl = qO.YFl.YFl(jsonReader.nextInt());
                    break;
                case 2:
                    sg4 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 3:
                    sg2 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 4:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.qO(str, yFl, sg2, sg3, sg4, z10);
    }
}
