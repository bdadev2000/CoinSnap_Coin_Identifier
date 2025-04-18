package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class UI {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.lG YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.qsH qsh = null;
        int i10 = 0;
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
                case 3432:
                    if (nextName.equals("ks")) {
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
                case 104415:
                    if (nextName.equals("ind")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 1:
                    qsh = AlY.wN(jsonReader, dsw);
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    i10 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.lG(str, i10, qsh, z10);
    }
}
