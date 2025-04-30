package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class vDp implements Iv<Float> {
    public static final vDp zp = new vDp();

    private vDp() {
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public Float lMd(JsonReader jsonReader, float f9) throws IOException {
        return Float.valueOf(pvr.lMd(jsonReader) * f9);
    }
}
