package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class wXo {
    public static <T> List<com.bytedance.adsdk.Sg.DSW.YFl<T>> YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, float f10, zG<T> zGVar, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            dsw.YFl("Lottie doesn't support expressions.");
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
                    arrayList.add(aIu.YFl(jsonReader, dsw, f10, zGVar, false, z10));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(aIu.YFl(jsonReader, dsw, f10, zGVar, true, z10));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(aIu.YFl(jsonReader, dsw, f10, zGVar, false, z10));
            }
        }
        jsonReader.endObject();
        YFl(arrayList);
        return arrayList;
    }

    public static <T> void YFl(List<? extends com.bytedance.adsdk.Sg.DSW.YFl<T>> list) {
        int i10;
        T t5;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.Sg.DSW.YFl<T> yFl = list.get(i11);
            i11++;
            com.bytedance.adsdk.Sg.DSW.YFl<T> yFl2 = list.get(i11);
            yFl.DSW = Float.valueOf(yFl2.f10148vc);
            if (yFl.Sg == null && (t5 = yFl2.YFl) != null) {
                yFl.Sg = t5;
                if (yFl instanceof com.bytedance.adsdk.Sg.YFl.Sg.NjR) {
                    ((com.bytedance.adsdk.Sg.YFl.Sg.NjR) yFl).YFl();
                }
            }
        }
        com.bytedance.adsdk.Sg.DSW.YFl<T> yFl3 = list.get(i10);
        if ((yFl3.YFl == null || yFl3.Sg == null) && list.size() > 1) {
            list.remove(yFl3);
        }
    }
}
