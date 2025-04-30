package com.com.bytedance.overseas.sdk.zp;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;

/* loaded from: classes.dex */
public class jU {
    public static KS zp(Context context, woN won, String str) {
        if (YhE.ku(context)) {
            return new lMd(context, won, str);
        }
        return new zp(context, won, str);
    }
}
