package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class pq {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0019. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.eT YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 112:
                    if (nextName.equals(TtmlNode.TAG_P)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
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
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    ga2 = YFl.Sg(jsonReader, dsw);
                    break;
                case 1:
                    sg2 = AlY.YFl(jsonReader, dsw);
                    break;
                case 2:
                    vcVar = AlY.tN(jsonReader, dsw);
                    break;
                case 3:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.eT(str, ga2, vcVar, sg2, z10);
    }
}
