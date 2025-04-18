package com.bytedance.sdk.component.wN;

import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;
import java.io.InputStream;

@ATSApi("img_service")
/* loaded from: classes.dex */
public interface EH {
    @ATSMethod(1)
    nc YFl(String str);

    @ATSMethod(6)
    InputStream YFl(String str, String str2);

    @ATSMethod(8)
    boolean YFl(String str, String str2, String str3);
}
