package com.bytedance.adsdk.Sg.wN;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.component.sdk.annotation.ColorInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class qO {

    /* renamed from: com.bytedance.adsdk.Sg.wN.qO$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[JsonToken.values().length];
            YFl = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF AlY(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    public static PointF Sg(JsonReader jsonReader, float f10) throws IOException {
        int i10 = AnonymousClass1.YFl[jsonReader.peek().ordinal()];
        if (i10 == 1) {
            return tN(jsonReader, f10);
        }
        if (i10 == 2) {
            return AlY(jsonReader, f10);
        }
        if (i10 == 3) {
            return wN(jsonReader, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    @ColorInt
    public static int YFl(JsonReader jsonReader) throws IOException {
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

    private static PointF tN(JsonReader jsonReader, float f10) throws IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f10, nextDouble2 * f10);
    }

    private static PointF wN(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.beginObject();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("x")) {
                if (!nextName.equals("y")) {
                    jsonReader.skipValue();
                } else {
                    f12 = Sg(jsonReader);
                }
            } else {
                f11 = Sg(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static float Sg(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i10 = AnonymousClass1.YFl[peek.ordinal()];
        if (i10 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i10 == 2) {
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

    public static List<PointF> YFl(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(Sg(jsonReader, f10));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
