package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class mB {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.rkt YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
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
                case 3371:
                    if (nextName.equals("it")) {
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
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.Sg.tN.Sg.tN YFl = qsH.YFl(jsonReader, dsw);
                        if (YFl != null) {
                            arrayList.add(YFl);
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
        return new com.bytedance.adsdk.Sg.tN.Sg.rkt(str, arrayList, z10);
    }
}
