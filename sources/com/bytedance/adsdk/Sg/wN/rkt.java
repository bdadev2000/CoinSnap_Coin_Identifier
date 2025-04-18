package com.bytedance.adsdk.Sg.wN;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class rkt {
    public static com.bytedance.adsdk.Sg.tN.Sg.wN YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        com.bytedance.adsdk.Sg.tN.YFl.AlY alY;
        char c10;
        Path.FillType fillType;
        com.bytedance.adsdk.Sg.tN.Sg.DSW dsw2;
        com.bytedance.adsdk.Sg.tN.YFl.AlY alY2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.Sg.tN.Sg.DSW dsw3 = null;
        com.bytedance.adsdk.Sg.tN.YFl.tN tNVar = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar2 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i10 = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 103:
                    if (nextName.equals("g")) {
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
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
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
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    vcVar2 = AlY.tN(jsonReader, dsw);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            if (!nextName2.equals(TtmlNode.TAG_P)) {
                                jsonReader.skipValue();
                            } else {
                                i10 = jsonReader.nextInt();
                            }
                        } else {
                            tNVar = AlY.YFl(jsonReader, dsw, i10);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    alY2 = AlY.Sg(jsonReader, dsw);
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
                    vcVar = AlY.tN(jsonReader, dsw);
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        dsw2 = com.bytedance.adsdk.Sg.tN.Sg.DSW.LINEAR;
                    } else {
                        dsw2 = com.bytedance.adsdk.Sg.tN.Sg.DSW.RADIAL;
                    }
                    dsw3 = dsw2;
                    break;
                case 6:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (alY2 == null) {
            alY = new com.bytedance.adsdk.Sg.tN.YFl.AlY(Collections.singletonList(new com.bytedance.adsdk.Sg.DSW.YFl(100)));
        } else {
            alY = alY2;
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.wN(str, dsw3, fillType2, tNVar, alY, vcVar, vcVar2, null, null, z10);
    }
}
