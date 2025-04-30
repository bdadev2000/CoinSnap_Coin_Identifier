package com.bytedance.sdk.component.COT;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

@ATSApi
/* loaded from: classes.dex */
public interface YW {
    @ATSMethod(7)
    String COT();

    @ATSMethod(8)
    Bitmap.Config HWF();

    @ATSMethod(4)
    int KS();

    @ATSMethod(5)
    ImageView.ScaleType jU();

    @ATSMethod(3)
    int lMd();

    @ATSMethod(2)
    String zp();
}
