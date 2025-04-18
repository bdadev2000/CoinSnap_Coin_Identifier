package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class wN {
    private static com.bytedance.adsdk.Sg.tN.Sg.YFl Sg(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.Sg.tN.Sg.YFl yFl = null;
        while (true) {
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                if (!nextName.equals("v")) {
                    if (!nextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.nextInt() == 0) {
                        z10 = true;
                    }
                } else if (z10) {
                    yFl = new com.bytedance.adsdk.Sg.tN.Sg.YFl(AlY.YFl(jsonReader, dsw));
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return yFl;
        }
    }

    public static com.bytedance.adsdk.Sg.tN.Sg.YFl YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        com.bytedance.adsdk.Sg.tN.Sg.YFl yFl = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.Sg.tN.Sg.YFl Sg = Sg(jsonReader, dsw);
                    if (Sg != null) {
                        yFl = Sg;
                    }
                }
                jsonReader.endArray();
            }
        }
        return yFl;
    }
}
