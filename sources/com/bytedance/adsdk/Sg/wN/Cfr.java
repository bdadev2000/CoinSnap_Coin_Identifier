package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class Cfr implements zG<PointF> {
    public static final Cfr YFl = new Cfr();

    private Cfr() {
    }

    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public PointF Sg(JsonReader jsonReader, float f10) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return qO.Sg(jsonReader, f10);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return qO.Sg(jsonReader, f10);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
