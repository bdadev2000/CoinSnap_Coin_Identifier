package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class Sco implements zG<com.bytedance.adsdk.Sg.DSW.tN> {
    public static final Sco YFl = new Sco();

    private Sco() {
    }

    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.DSW.tN Sg(JsonReader jsonReader, float f10) throws IOException {
        boolean z10;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.Sg.DSW.tN((nextDouble / 100.0f) * f10, (nextDouble2 / 100.0f) * f10);
    }
}
