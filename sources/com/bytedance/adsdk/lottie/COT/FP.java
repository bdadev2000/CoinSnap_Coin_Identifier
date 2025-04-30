package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class FP {
    public static <T> List<com.bytedance.adsdk.lottie.QR.zp<T>> zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, float f9, Iv<T> iv, boolean z8) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            hwf.zp("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(cz.zp(jsonReader, hwf, f9, iv, false, z8));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(cz.zp(jsonReader, hwf, f9, iv, true, z8));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(cz.zp(jsonReader, hwf, f9, iv, false, z8));
            }
        }
        jsonReader.endObject();
        zp(arrayList);
        return arrayList;
    }

    public static <T> void zp(List<? extends com.bytedance.adsdk.lottie.QR.zp<T>> list) {
        int i9;
        T t9;
        int size = list.size();
        int i10 = 0;
        while (true) {
            i9 = size - 1;
            if (i10 >= i9) {
                break;
            }
            com.bytedance.adsdk.lottie.QR.zp<T> zpVar = list.get(i10);
            i10++;
            com.bytedance.adsdk.lottie.QR.zp<T> zpVar2 = list.get(i10);
            zpVar.QR = Float.valueOf(zpVar2.HWF);
            if (zpVar.lMd == null && (t9 = zpVar2.zp) != null) {
                zpVar.lMd = t9;
                if (zpVar instanceof com.bytedance.adsdk.lottie.zp.lMd.YW) {
                    ((com.bytedance.adsdk.lottie.zp.lMd.YW) zpVar).zp();
                }
            }
        }
        com.bytedance.adsdk.lottie.QR.zp<T> zpVar3 = list.get(i9);
        if ((zpVar3.zp == null || zpVar3.lMd == null) && list.size() > 1) {
            list.remove(zpVar3);
        }
    }
}
