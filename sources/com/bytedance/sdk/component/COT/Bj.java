package com.bytedance.sdk.component.COT;

import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;
import java.util.Map;

@ATSApi
/* loaded from: classes.dex */
public interface Bj<T> {
    @ATSMethod(9)
    boolean COT();

    @ATSMethod(10)
    boolean HWF();

    @ATSMethod(4)
    T KS();

    @ATSMethod(12)
    int QR();

    @ATSMethod(8)
    Map<String, String> jU();

    @ATSMethod(3)
    T lMd();

    @ATSMethod(2)
    String zp();

    @ATSMethod(5)
    void zp(T t9);
}
