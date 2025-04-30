package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.vwr;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class woN {
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00bc. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.HWF zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar;
        int i9;
        com.bytedance.adsdk.lottie.KS.lMd.QR qr;
        int i10;
        int i11;
        com.bytedance.adsdk.lottie.KS.lMd.QR qr2;
        int i12 = 1;
        ArrayList arrayList = new ArrayList();
        float f9 = 0.0f;
        String str = null;
        com.bytedance.adsdk.lottie.KS.lMd.QR qr3 = null;
        com.bytedance.adsdk.lottie.KS.zp.KS ks = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf2 = null;
        com.bytedance.adsdk.lottie.KS.zp.HWF hwf3 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        vwr.zp zpVar = null;
        vwr.lMd lmd2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd3 = null;
        boolean z8 = false;
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        i9 = 0;
                        break;
                    }
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        i9 = i12;
                        break;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        i9 = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        i9 = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        i9 = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        i9 = 5;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        i9 = 6;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        i9 = 7;
                        break;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        i9 = 8;
                        break;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        i9 = 9;
                        break;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        i9 = 10;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        i9 = 11;
                        break;
                    }
                    break;
            }
            i9 = -1;
            switch (i9) {
                case 0:
                    qr = qr3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.lottie.KS.zp.lMd lmd4 = null;
                        String str2 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (!nextName2.equals("n")) {
                                if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    lmd4 = jU.zp(jsonReader, hwf);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            lmd3 = lmd4;
                            i12 = 1;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                i11 = 1;
                                hwf.zp(true);
                                arrayList.add(lmd4);
                            } else {
                                i11 = 1;
                            }
                            i12 = i11;
                        }
                    }
                    i10 = i12;
                    jsonReader.endArray();
                    if (arrayList.size() == i10) {
                        arrayList.add(arrayList.get(0));
                        i12 = i10;
                        qr3 = qr;
                        break;
                    }
                    i12 = i10;
                    qr3 = qr;
                    break;
                case 1:
                    hwf3 = jU.KS(jsonReader, hwf);
                    break;
                case 2:
                    qr = qr3;
                    jsonReader.beginObject();
                    int i13 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            if (!nextName3.equals(TtmlNode.TAG_P)) {
                                jsonReader.skipValue();
                            } else {
                                i13 = jsonReader.nextInt();
                            }
                        } else {
                            ks = jU.zp(jsonReader, hwf, i13);
                        }
                    }
                    jsonReader.endObject();
                    qr3 = qr;
                    break;
                case 3:
                    jUVar2 = jU.lMd(jsonReader, hwf);
                    break;
                case 4:
                    hwf2 = jU.KS(jsonReader, hwf);
                    break;
                case 5:
                    if (jsonReader.nextInt() == i12) {
                        qr2 = com.bytedance.adsdk.lottie.KS.lMd.QR.LINEAR;
                    } else {
                        qr2 = com.bytedance.adsdk.lottie.KS.lMd.QR.RADIAL;
                    }
                    qr3 = qr2;
                    break;
                case 6:
                    lmd = jU.zp(jsonReader, hwf);
                    break;
                case 7:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 8:
                    zpVar = vwr.zp.values()[jsonReader.nextInt() - i12];
                    break;
                case 9:
                    lmd2 = vwr.lMd.values()[jsonReader.nextInt() - i12];
                    break;
                case 10:
                    qr = qr3;
                    f9 = (float) jsonReader.nextDouble();
                    qr3 = qr;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    i10 = i12;
                    qr = qr3;
                    i12 = i10;
                    qr3 = qr;
                    break;
            }
        }
        com.bytedance.adsdk.lottie.KS.lMd.QR qr4 = qr3;
        if (jUVar2 == null) {
            jUVar = new com.bytedance.adsdk.lottie.KS.zp.jU(Collections.singletonList(new com.bytedance.adsdk.lottie.QR.zp(100)));
        } else {
            jUVar = jUVar2;
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.HWF(str, qr4, ks, jUVar, hwf2, hwf3, lmd, zpVar, lmd2, f9, arrayList, lmd3, z8);
    }
}
