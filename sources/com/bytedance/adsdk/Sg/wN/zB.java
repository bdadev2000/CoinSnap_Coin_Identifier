package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* loaded from: classes.dex */
public class zB {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    public static com.bytedance.adsdk.Sg.tN.Sg.GA YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        String str = null;
        com.bytedance.adsdk.Sg.tN.YFl.Sg sg2 = null;
        boolean z10 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 114:
                    if (nextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    sg2 = AlY.YFl(jsonReader, dsw, true);
                    break;
                case 1:
                    z10 = jsonReader.nextBoolean();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z10) {
            return null;
        }
        return new com.bytedance.adsdk.Sg.tN.Sg.GA(str, sg2);
    }
}
