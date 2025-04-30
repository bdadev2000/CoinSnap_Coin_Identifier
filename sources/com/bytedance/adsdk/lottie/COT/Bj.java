package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class Bj {
    private com.bytedance.adsdk.lottie.KS.zp.lMd COT;
    private com.bytedance.adsdk.lottie.KS.zp.lMd KS;
    private com.bytedance.adsdk.lottie.KS.zp.lMd jU;
    private com.bytedance.adsdk.lottie.KS.zp.lMd lMd;
    private com.bytedance.adsdk.lottie.KS.zp.zp zp;

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0034. Please report as an issue. */
    private void lMd(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
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
                char c9 = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c9 = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c9 = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c9 = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c9 = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c9 = 4;
                            break;
                        }
                        break;
                }
                switch (c9) {
                    case 0:
                        this.jU = jU.zp(jsonReader, hwf);
                        break;
                    case 1:
                        this.lMd = jU.zp(jsonReader, hwf, false);
                        break;
                    case 2:
                        this.KS = jU.zp(jsonReader, hwf, false);
                        break;
                    case 3:
                        this.zp = jU.QR(jsonReader, hwf);
                        break;
                    case 4:
                        this.COT = jU.zp(jsonReader, hwf);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
        }
        jsonReader.endObject();
    }

    public dT zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd3;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    lMd(jsonReader, hwf);
                }
                jsonReader.endArray();
            }
        }
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar = this.zp;
        if (zpVar != null && (lmd = this.lMd) != null && (lmd2 = this.KS) != null && (lmd3 = this.jU) != null && (lmd4 = this.COT) != null) {
            return new dT(zpVar, lmd, lmd2, lmd3, lmd4);
        }
        return null;
    }
}
