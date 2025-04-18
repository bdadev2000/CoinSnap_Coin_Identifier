package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class eT {
    private com.bytedance.adsdk.Sg.tN.YFl.Sg AlY;
    private com.bytedance.adsdk.Sg.tN.YFl.Sg Sg;
    private com.bytedance.adsdk.Sg.tN.YFl.YFl YFl;
    private com.bytedance.adsdk.Sg.tN.YFl.Sg tN;
    private com.bytedance.adsdk.Sg.tN.YFl.Sg wN;

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0034. Please report as an issue. */
    private void Sg(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("v")) {
                if (!nextName.equals("nm")) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.AlY = AlY.YFl(jsonReader, dsw);
                        break;
                    case 1:
                        this.Sg = AlY.YFl(jsonReader, dsw, false);
                        break;
                    case 2:
                        this.tN = AlY.YFl(jsonReader, dsw, false);
                        break;
                    case 3:
                        this.YFl = AlY.DSW(jsonReader, dsw);
                        break;
                    case 4:
                        this.wN = AlY.YFl(jsonReader, dsw);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
        }
        jsonReader.endObject();
    }

    public nc YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg4;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg5;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    Sg(jsonReader, dsw);
                }
                jsonReader.endArray();
            }
        }
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl = this.YFl;
        if (yFl != null && (sg2 = this.Sg) != null && (sg3 = this.tN) != null && (sg4 = this.AlY) != null && (sg5 = this.wN) != null) {
            return new nc(yFl, sg2, sg3, sg4, sg5);
        }
        return null;
    }
}
