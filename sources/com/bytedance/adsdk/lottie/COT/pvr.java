package com.bytedance.adsdk.lottie.COT;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.component.sdk.annotation.ColorInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class pvr {

    /* renamed from: com.bytedance.adsdk.lottie.COT.pvr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[JsonToken.values().length];
            zp = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF COT(JsonReader jsonReader, float f9) throws IOException {
        jsonReader.beginObject();
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("x")) {
                if (!nextName.equals("y")) {
                    jsonReader.skipValue();
                } else {
                    f11 = lMd(jsonReader);
                }
            } else {
                f10 = lMd(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f10 * f9, f11 * f9);
    }

    private static PointF KS(JsonReader jsonReader, float f9) throws IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f9, nextDouble2 * f9);
    }

    private static PointF jU(JsonReader jsonReader, float f9) throws IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f9, nextDouble2 * f9);
    }

    public static PointF lMd(JsonReader jsonReader, float f9) throws IOException {
        int i9 = AnonymousClass1.zp[jsonReader.peek().ordinal()];
        if (i9 == 1) {
            return KS(jsonReader, f9);
        }
        if (i9 == 2) {
            return jU(jsonReader, f9);
        }
        if (i9 == 3) {
            return COT(jsonReader, f9);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    @ColorInt
    public static int zp(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    public static float lMd(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i9 = AnonymousClass1.zp[peek.ordinal()];
        if (i9 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i9 == 2) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(peek)));
    }

    public static List<PointF> zp(JsonReader jsonReader, float f9) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(lMd(jsonReader, f9));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
