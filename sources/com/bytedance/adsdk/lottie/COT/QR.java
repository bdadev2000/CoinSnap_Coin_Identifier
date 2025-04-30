package com.bytedance.adsdk.lottie.COT;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class QR implements Iv<Integer> {
    public static final QR zp = new QR();

    private QR() {
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public Integer lMd(JsonReader jsonReader, float f9) throws IOException {
        boolean z8;
        double d2;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        if (jsonReader.peek() == JsonToken.NUMBER) {
            d2 = jsonReader.nextDouble();
        } else {
            d2 = 1.0d;
        }
        if (z8) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (d2 <= 1.0d) {
                d2 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d2, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
