package com.bytedance.adsdk.lottie.COT;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class jU {
    public static com.bytedance.adsdk.lottie.KS.zp.ku COT(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.ku(zp(jsonReader, com.bytedance.adsdk.lottie.HWF.HWF.zp(), hwf, fRl.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.dT HWF(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.dT(zp(jsonReader, com.bytedance.adsdk.lottie.HWF.HWF.zp(), hwf, YW.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.HWF KS(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.HWF(FP.zp(jsonReader, hwf, com.bytedance.adsdk.lottie.HWF.HWF.zp(), irS.zp, true));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.zp QR(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.zp(zp(jsonReader, hwf, QR.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.QR jU(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.QR(zp(jsonReader, hwf, UPs.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.jU lMd(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.jU(zp(jsonReader, hwf, vwr.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.lMd zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf) throws IOException {
        return zp(jsonReader, hwf, true);
    }

    public static com.bytedance.adsdk.lottie.KS.zp.lMd zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, boolean z8) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.lMd(zp(jsonReader, z8 ? com.bytedance.adsdk.lottie.HWF.HWF.zp() : 1.0f, hwf, vDp.zp));
    }

    public static com.bytedance.adsdk.lottie.KS.zp.KS zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, int i9) throws IOException {
        return new com.bytedance.adsdk.lottie.KS.zp.KS(zp(jsonReader, hwf, new dQp(i9)));
    }

    private static <T> List<com.bytedance.adsdk.lottie.QR.zp<T>> zp(JsonReader jsonReader, com.bytedance.adsdk.lottie.HWF hwf, Iv<T> iv) throws IOException {
        return FP.zp(jsonReader, hwf, 1.0f, iv, false);
    }

    private static <T> List<com.bytedance.adsdk.lottie.QR.zp<T>> zp(JsonReader jsonReader, float f9, com.bytedance.adsdk.lottie.HWF hwf, Iv<T> iv) throws IOException {
        return FP.zp(jsonReader, hwf, f9, iv, false);
    }
}
