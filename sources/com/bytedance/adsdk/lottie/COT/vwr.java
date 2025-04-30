package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class vwr implements Iv<Integer> {
    public static final vwr zp = new vwr();

    private vwr() {
    }

    @Override // com.bytedance.adsdk.lottie.COT.Iv
    /* renamed from: zp, reason: merged with bridge method [inline-methods] */
    public Integer lMd(JsonReader jsonReader, float f9) throws IOException {
        return Integer.valueOf(Math.round(pvr.lMd(jsonReader) * f9));
    }
}
