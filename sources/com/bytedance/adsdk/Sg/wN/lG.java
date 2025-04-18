package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg.Wwa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class lG {
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00bf. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.vc YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        char c10;
        Wwa.YFl yFl;
        Wwa.Sg sg2;
        com.bytedance.adsdk.Sg.tN.Sg.DSW dsw2;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str = null;
        com.bytedance.adsdk.Sg.tN.Sg.DSW dsw3 = null;
        com.bytedance.adsdk.Sg.tN.YFl.tN tNVar = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        Wwa.YFl yFl2 = null;
        Wwa.Sg sg4 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg5 = null;
        boolean z10 = false;
        com.bytedance.adsdk.Sg.tN.YFl.AlY alY = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            boolean z11 = z10;
            com.bytedance.adsdk.Sg.tN.YFl.Sg sg6 = sg5;
            float f11 = f10;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.Sg.tN.YFl.Sg sg7 = null;
                        while (jsonReader.hasNext()) {
                            Wwa.Sg sg8 = sg4;
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            Wwa.YFl yFl3 = yFl2;
                            if (!nextName2.equals("n")) {
                                if (!nextName2.equals("v")) {
                                    jsonReader.skipValue();
                                } else {
                                    sg7 = AlY.YFl(jsonReader, dsw);
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                            sg4 = sg8;
                            yFl2 = yFl3;
                        }
                        Wwa.YFl yFl4 = yFl2;
                        Wwa.Sg sg9 = sg4;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            sg6 = sg7;
                            sg4 = sg9;
                            yFl2 = yFl4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dsw.YFl(true);
                                arrayList.add(sg7);
                            }
                            sg4 = sg9;
                            yFl2 = yFl4;
                        }
                    }
                    yFl = yFl2;
                    sg2 = sg4;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        z10 = z11;
                        sg5 = sg6;
                        sg4 = sg2;
                        f10 = f11;
                        yFl2 = yFl;
                        break;
                    } else {
                        sg5 = sg6;
                        z10 = z11;
                        sg4 = sg2;
                        f10 = f11;
                        yFl2 = yFl;
                    }
                    break;
                case 1:
                    vcVar2 = AlY.tN(jsonReader, dsw);
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i10 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            if (!nextName3.equals(TtmlNode.TAG_P)) {
                                jsonReader.skipValue();
                            } else {
                                i10 = jsonReader.nextInt();
                            }
                        } else {
                            tNVar = AlY.YFl(jsonReader, dsw, i10);
                        }
                    }
                    jsonReader.endObject();
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 3:
                    alY = AlY.Sg(jsonReader, dsw);
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 4:
                    vcVar = AlY.tN(jsonReader, dsw);
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        dsw2 = com.bytedance.adsdk.Sg.tN.Sg.DSW.LINEAR;
                    } else {
                        dsw2 = com.bytedance.adsdk.Sg.tN.Sg.DSW.RADIAL;
                    }
                    dsw3 = dsw2;
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 6:
                    sg3 = AlY.YFl(jsonReader, dsw);
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case 7:
                    z10 = jsonReader.nextBoolean();
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case '\b':
                    yFl2 = Wwa.YFl.values()[jsonReader.nextInt() - 1];
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case '\t':
                    sg4 = Wwa.Sg.values()[jsonReader.nextInt() - 1];
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                case '\n':
                    f10 = (float) jsonReader.nextDouble();
                    z10 = z11;
                    sg5 = sg6;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    z10 = z11;
                    sg5 = sg6;
                    f10 = f11;
                    break;
                default:
                    jsonReader.skipValue();
                    yFl = yFl2;
                    sg2 = sg4;
                    sg5 = sg6;
                    z10 = z11;
                    sg4 = sg2;
                    f10 = f11;
                    yFl2 = yFl;
                    break;
            }
        }
        Wwa.YFl yFl5 = yFl2;
        Wwa.Sg sg10 = sg4;
        float f12 = f10;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg11 = sg5;
        boolean z12 = z10;
        if (alY == null) {
            alY = new com.bytedance.adsdk.Sg.tN.YFl.AlY(Collections.singletonList(new com.bytedance.adsdk.Sg.DSW.YFl(100)));
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.vc(str, dsw3, tNVar, alY, vcVar, vcVar2, sg3, yFl5, sg10, f12, arrayList, sg11, z12);
    }
}
