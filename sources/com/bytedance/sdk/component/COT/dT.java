package com.bytedance.sdk.component.COT;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

@ATSApi
/* loaded from: classes.dex */
public interface dT {
    @ATSMethod(19)
    dT COT(int i9);

    @ATSMethod(12)
    dT KS(int i9);

    @ATSMethod(18)
    dT jU(int i9);

    @ATSMethod(11)
    dT lMd(int i9);

    @ATSMethod(7)
    dT lMd(String str);

    @ATSMethod(3)
    YW zp(ImageView imageView);

    @ATSMethod(2)
    YW zp(KVG kvg);

    @ATSMethod(1)
    YW zp(KVG kvg, int i9);

    @ATSMethod(10)
    dT zp(int i9);

    @ATSMethod(9)
    dT zp(Bitmap.Config config);

    @ATSMethod(8)
    dT zp(ImageView.ScaleType scaleType);

    @ATSMethod(13)
    dT zp(cz czVar);

    @ATSMethod(17)
    dT zp(ku kuVar);

    @ATSMethod(5)
    dT zp(String str);

    @ATSMethod(15)
    dT zp(boolean z8);
}
