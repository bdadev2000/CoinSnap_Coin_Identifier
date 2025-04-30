package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.ku;
import com.mbridge.msdk.foundation.same.report.i;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ox {
    public static com.bytedance.adsdk.lottie.KS.lMd.ku zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        boolean z8;
        boolean z9;
        jsonReader.beginObject();
        ku.zp zpVar = null;
        com.bytedance.adsdk.lottie.KS.zp.ku kuVar = null;
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z8 = false;
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z8 = true;
                        break;
                    }
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z8 = 2;
                        break;
                    }
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z8 = 3;
                        break;
                    }
                    break;
            }
            z8 = -1;
            switch (z8) {
                case false:
                    jUVar = jU.lMd(jsonReader, hwf);
                    break;
                case true:
                    kuVar = jU.COT(jsonReader, hwf);
                    break;
                case true:
                    z10 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.getClass();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                z9 = false;
                                break;
                            }
                            break;
                        case 105:
                            if (nextString.equals(i.f15948a)) {
                                z9 = true;
                                break;
                            }
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                z9 = 2;
                                break;
                            }
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z9 = 3;
                                break;
                            }
                            break;
                    }
                    z9 = -1;
                    switch (z9) {
                        case false:
                            zpVar = ku.zp.MASK_MODE_ADD;
                            break;
                        case true:
                            hwf.zp("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            zpVar = ku.zp.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            zpVar = ku.zp.MASK_MODE_NONE;
                            break;
                        case true:
                            zpVar = ku.zp.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            zpVar = ku.zp.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.KS.lMd.ku(zpVar, kuVar, jUVar, z10);
    }
}
