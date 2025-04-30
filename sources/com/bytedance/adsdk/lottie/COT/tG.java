package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class tG {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.jU zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d2 = 0.0d;
        String str = null;
        String str2 = null;
        char c9 = 0;
        double d9 = 0.0d;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1866931350:
                    if (nextName.equals("fFamily")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3173:
                    if (nextName.equals("ch")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3076010:
                    if (nextName.equals(DataSchemeDataSource.SCHEME_DATA)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 109780401:
                    if (nextName.equals(TtmlNode.TAG_STYLE)) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    d2 = jsonReader.nextDouble();
                    break;
                case 2:
                    c9 = jsonReader.nextString().charAt(0);
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((com.bytedance.adsdk.lottie.KS.lMd.KVG) ku.zp(jsonReader, hwf));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    d9 = jsonReader.nextDouble();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.KS.jU(arrayList, c9, d9, d2, str, str2);
    }
}
