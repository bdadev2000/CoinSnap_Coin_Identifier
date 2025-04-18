package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg.Wwa;
import com.mbridge.msdk.foundation.controller.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class ZU {
    public static com.bytedance.adsdk.Sg.tN.Sg.Wwa YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        char c10;
        char c11;
        int i10;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.YFl yFl = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        Wwa.YFl yFl2 = null;
        Wwa.Sg sg4 = null;
        boolean z10 = false;
        com.bytedance.adsdk.Sg.tN.YFl.AlY alY = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i11 = 1;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals(a.a)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 100:
                    if (nextName.equals("d")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    yFl = AlY.DSW(jsonReader, dsw);
                    continue;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.Sg.tN.YFl.Sg sg5 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            if (!nextName2.equals("n")) {
                                if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    sg5 = AlY.YFl(jsonReader, dsw);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        switch (c11) {
                            case 0:
                            case 1:
                                i10 = 1;
                                dsw.YFl(true);
                                arrayList.add(sg5);
                                break;
                            case 2:
                                sg2 = sg5;
                                i11 = 1;
                                break;
                            default:
                                i10 = 1;
                                break;
                        }
                        i11 = i10;
                    }
                    int i12 = i11;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                case 2:
                    alY = AlY.Sg(jsonReader, dsw);
                    continue;
                case 3:
                    sg3 = AlY.YFl(jsonReader, dsw);
                    continue;
                case 4:
                    z10 = jsonReader.nextBoolean();
                    continue;
                case 5:
                    yFl2 = Wwa.YFl.values()[jsonReader.nextInt() - 1];
                    continue;
                case 6:
                    sg4 = Wwa.Sg.values()[jsonReader.nextInt() - 1];
                    continue;
                case 7:
                    f10 = (float) jsonReader.nextDouble();
                    continue;
                case '\b':
                    str = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (alY == null) {
            alY = new com.bytedance.adsdk.Sg.tN.YFl.AlY(Collections.singletonList(new com.bytedance.adsdk.Sg.DSW.YFl(100)));
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.Wwa(str, sg2, arrayList, yFl, alY, sg3, yFl2, sg4, f10, z10);
    }
}
