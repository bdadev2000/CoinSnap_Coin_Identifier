package com.bytedance.adsdk.lottie.COT;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
class KVG {
    public static com.bytedance.adsdk.lottie.KS.lMd.COT zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar;
        char c9;
        Path.FillType fillType;
        com.bytedance.adsdk.lottie.KS.lMd.QR qr;
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.lottie.KS.lMd.QR qr2 = null;
        com.bytedance.adsdk.lottie.KS.zp.KS ks = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf2 = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf3 = null;
        boolean z8 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = 7;
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    hwf3 = jU.KS(jsonReader, hwf);
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i9 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            if (!nextName2.equals(TtmlNode.TAG_P)) {
                                jsonReader.skipValue();
                            } else {
                                i9 = jsonReader.nextInt();
                            }
                        } else {
                            ks = jU.zp(jsonReader, hwf, i9);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    jUVar2 = jU.lMd(jsonReader, hwf);
                    break;
                case 3:
                    if (jsonReader.nextInt() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 4:
                    hwf2 = jU.KS(jsonReader, hwf);
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        qr = com.bytedance.adsdk.lottie.KS.lMd.QR.LINEAR;
                    } else {
                        qr = com.bytedance.adsdk.lottie.KS.lMd.QR.RADIAL;
                    }
                    qr2 = qr;
                    break;
                case 6:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (jUVar2 == null) {
            jUVar = new com.bytedance.adsdk.lottie.KS.zp.jU(Collections.singletonList(new com.bytedance.adsdk.lottie.QR.zp(100)));
        } else {
            jUVar = jUVar2;
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.COT(str, qr2, fillType2, ks, jUVar, hwf2, hwf3, null, null, z8);
    }
}
