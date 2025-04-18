package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg.nc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* loaded from: classes.dex */
class hQ {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.nc YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, int i10) throws IOException {
        boolean z10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = false;
        boolean z12 = z10;
        String str = null;
        nc.YFl yFl = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg3 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg4 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg5 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg6 = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg7 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3369:
                    if (nextName.equals("ir")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3370:
                    if (nextName.equals("is")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3555:
                    if (nextName.equals("or")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3686:
                    if (nextName.equals("sy")) {
                        c10 = '\n';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (jsonReader.nextInt() == 3) {
                        z12 = true;
                        break;
                    } else {
                        z12 = false;
                        break;
                    }
                case 1:
                    ga2 = YFl.Sg(jsonReader, dsw);
                    break;
                case 2:
                    sg3 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 3:
                    z11 = jsonReader.nextBoolean();
                    break;
                case 4:
                    sg4 = AlY.YFl(jsonReader, dsw);
                    break;
                case 5:
                    sg6 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case 6:
                    str = jsonReader.nextString();
                    break;
                case 7:
                    sg5 = AlY.YFl(jsonReader, dsw);
                    break;
                case '\b':
                    sg7 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case '\t':
                    sg2 = AlY.YFl(jsonReader, dsw, false);
                    break;
                case '\n':
                    yFl = nc.YFl.YFl(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.nc(str, yFl, sg2, ga2, sg3, sg4, sg5, sg6, sg7, z11, z12);
    }
}
