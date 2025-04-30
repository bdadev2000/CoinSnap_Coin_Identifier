package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class UPs implements Iv<com.bytedance.adsdk.lottie.QR.KS> {
    public static final UPs zp = new UPs();

    private UPs() {
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.QR.KS lMd(JsonReader jsonReader, float f9) throws IOException {
        boolean z8;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z8) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.lottie.QR.KS((nextDouble / 100.0f) * f9, (nextDouble2 / 100.0f) * f9);
    }
}
