package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class irS implements Iv<PointF> {
    public static final irS zp = new irS();

    private irS() {
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public PointF lMd(JsonReader jsonReader, float f9) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return pvr.lMd(jsonReader, f9);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return pvr.lMd(jsonReader, f9);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f9, ((float) jsonReader.nextDouble()) * f9);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
