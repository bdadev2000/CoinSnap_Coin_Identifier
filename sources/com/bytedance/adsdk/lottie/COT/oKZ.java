package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd.vwr;
import com.mbridge.msdk.foundation.controller.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class oKZ {
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x008b. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.KS.lMd.vwr zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar;
        char c9;
        String str;
        char c10;
        ArrayList arrayList = new ArrayList();
        float f9 = 0.0f;
        String str2 = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd = null;
        com.bytedance.adsdk.lottie.KS.zp.zp zpVar = null;
        com.bytedance.adsdk.lottie.KS.zp.lMd lmd2 = null;
        vwr.zp zpVar2 = null;
        vwr.lMd lmd3 = null;
        boolean z8 = false;
        com.bytedance.adsdk.lottie.KS.zp.jU jUVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.f15376a)) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 100:
                    if (nextName.equals("d")) {
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
                case 119:
                    if (nextName.equals("w")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c9 = '\b';
                        break;
                    }
                    break;
            }
            c9 = 65535;
            switch (c9) {
                case 0:
                    zpVar = jU.QR(jsonReader, hwf);
                    break;
                case 1:
                    str = str2;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.lottie.KS.zp.lMd lmd4 = null;
                        String str3 = null;
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
                                str3 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 100:
                                if (str3.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str3.equals("g")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str3.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                            case 1:
                                hwf.zp(true);
                                arrayList.add(lmd4);
                                break;
                            case 2:
                                lmd = lmd4;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        str2 = str;
                        break;
                    }
                    str2 = str;
                    break;
                case 2:
                    jUVar2 = jU.lMd(jsonReader, hwf);
                    break;
                case 3:
                    lmd2 = jU.zp(jsonReader, hwf);
                    break;
                case 4:
                    z8 = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = str2;
                    zpVar2 = vwr.zp.values()[jsonReader.nextInt() - 1];
                    str2 = str;
                    break;
                case 6:
                    str = str2;
                    lmd3 = vwr.lMd.values()[jsonReader.nextInt() - 1];
                    str2 = str;
                    break;
                case 7:
                    str = str2;
                    f9 = (float) jsonReader.nextDouble();
                    str2 = str;
                    break;
                case '\b':
                    str2 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    str = str2;
                    str2 = str;
                    break;
            }
        }
        String str4 = str2;
        if (jUVar2 == null) {
            jUVar = new com.bytedance.adsdk.lottie.KS.zp.jU(Collections.singletonList(new com.bytedance.adsdk.lottie.QR.zp(100)));
        } else {
            jUVar = jUVar2;
        }
        return new com.bytedance.adsdk.lottie.KS.lMd.vwr(str4, lmd, arrayList, zpVar, jUVar, lmd2, zpVar2, lmd3, f9, z8);
    }
}
