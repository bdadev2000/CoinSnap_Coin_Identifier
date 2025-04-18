package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class YoT implements zG<Float> {
    public static final YoT YFl = new YoT();

    private YoT() {
    }

    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public Float Sg(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(qO.Sg(jsonReader) * f10);
    }
}
