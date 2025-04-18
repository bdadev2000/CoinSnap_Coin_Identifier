package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
class YI {
    public static com.bytedance.adsdk.Sg.YFl.Sg.NjR YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        boolean z10;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new com.bytedance.adsdk.Sg.YFl.Sg.NjR(dsw, aIu.YFl(jsonReader, dsw, com.bytedance.adsdk.Sg.vc.vc.YFl(), dXO.YFl, z10, false));
    }
}
