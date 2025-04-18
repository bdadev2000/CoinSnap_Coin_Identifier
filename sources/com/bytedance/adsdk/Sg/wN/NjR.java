package com.bytedance.adsdk.Sg.wN;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.Sg.tN.Sg;
import java.io.IOException;

/* loaded from: classes.dex */
public class NjR implements zG<com.bytedance.adsdk.Sg.tN.Sg> {
    public static final NjR YFl = new NjR();

    private NjR() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0029. Please report as an issue. */
    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.Sg.tN.Sg Sg(JsonReader jsonReader, float f10) throws IOException {
        Sg.YFl yFl = Sg.YFl.CENTER;
        jsonReader.beginObject();
        Sg.YFl yFl2 = yFl;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals("f")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 106:
                    if (nextName.equals("j")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3587:
                    if (nextName.equals("ps")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 3687:
                    if (nextName.equals("sz")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c10 = '\f';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    int nextInt = jsonReader.nextInt();
                    yFl2 = Sg.YFl.CENTER;
                    if (nextInt <= yFl2.ordinal() && nextInt >= 0) {
                        yFl2 = Sg.YFl.values()[nextInt];
                        break;
                    }
                    break;
                case 2:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i11 = qO.YFl(jsonReader);
                    break;
                case 5:
                    f12 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f13 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z10 = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case '\t':
                    i12 = qO.YFl(jsonReader);
                    break;
                case '\n':
                    f14 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case '\f':
                    i10 = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.Sg.tN.Sg(str, str2, f11, yFl2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
