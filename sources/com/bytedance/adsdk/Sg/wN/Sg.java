package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class Sg {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    private static com.bytedance.adsdk.Sg.tN.YFl.eT Sg(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl = null;
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 116:
                    if (nextName.equals("t")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    sg3 = AlY.YFl(jsonReader, dsw);
                    break;
                case 1:
                    yFl = AlY.DSW(jsonReader, dsw);
                    break;
                case 2:
                    yFl2 = AlY.DSW(jsonReader, dsw);
                    break;
                case 3:
                    sg2 = AlY.YFl(jsonReader, dsw);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.Sg.tN.YFl.eT(yFl, yFl2, sg2, sg3);
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.eT YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.Sg.tN.YFl.eT eTVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                eTVar = Sg(jsonReader, dsw);
            }
        }
        jsonReader.endObject();
        if (eTVar == null) {
            return new com.bytedance.adsdk.Sg.tN.YFl.eT(null, null, null, null);
        }
        return eTVar;
    }
}
