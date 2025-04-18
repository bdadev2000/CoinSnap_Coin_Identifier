package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class vc {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.Sg YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, int i10) throws IOException {
        boolean z10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = false;
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.GA<PointF, PointF> ga2 = null;
        com.bytedance.adsdk.Sg.tN.YFl.vc vcVar = null;
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
                    if (jsonReader.nextInt() == 3) {
                        z11 = true;
                        break;
                    } else {
                        z11 = false;
                        break;
                    }
                case 1:
                    ga2 = YFl.Sg(jsonReader, dsw);
                    break;
                case 2:
                    vcVar = AlY.tN(jsonReader, dsw);
                    break;
                case 3:
                    z12 = jsonReader.nextBoolean();
                    break;
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.Sg(str, ga2, vcVar, z11, z12);
    }
}
