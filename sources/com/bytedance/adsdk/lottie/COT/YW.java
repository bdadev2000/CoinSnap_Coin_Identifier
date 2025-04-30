package com.bytedance.adsdk.lottie.COT;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.KS.lMd;
import java.io.IOException;

/* loaded from: classes.dex */
public class YW implements Iv<com.bytedance.adsdk.lottie.KS.lMd> {
    public static final YW zp = new YW();

    private YW() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0029. Please report as an issue. */
    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.KS.lMd lMd(JsonReader jsonReader, float f9) throws IOException {
        lMd.zp zpVar = lMd.zp.CENTER;
        jsonReader.beginObject();
        lMd.zp zpVar2 = zpVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c9 = 65535;
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals("f")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case 106:
                    if (nextName.equals("j")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        c9 = 6;
                        break;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        c9 = 7;
                        break;
                    }
                    break;
                case 3587:
                    if (nextName.equals("ps")) {
                        c9 = '\b';
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c9 = '\t';
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c9 = '\n';
                        break;
                    }
                    break;
                case 3687:
                    if (nextName.equals("sz")) {
                        c9 = 11;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c9 = '\f';
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    int nextInt = jsonReader.nextInt();
                    zpVar2 = lMd.zp.CENTER;
                    if (nextInt <= zpVar2.ordinal() && nextInt >= 0) {
                        zpVar2 = lMd.zp.values()[nextInt];
                        break;
                    }
                    break;
                case 2:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i10 = pvr.zp(jsonReader);
                    break;
                case 5:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z8 = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f9, ((float) jsonReader.nextDouble()) * f9);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case '\t':
                    i11 = pvr.zp(jsonReader);
                    break;
                case '\n':
                    f13 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f9, ((float) jsonReader.nextDouble()) * f9);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case '\f':
                    i9 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.KS.lMd(str, str2, f10, zpVar2, i9, f11, f12, i10, i11, f13, z8, pointF, pointF2);
    }
}
