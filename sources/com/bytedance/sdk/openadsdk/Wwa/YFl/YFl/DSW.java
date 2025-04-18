package com.bytedance.sdk.openadsdk.Wwa.YFl.YFl;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;

/* loaded from: classes.dex */
public class DSW {
    public static vc YFl(Context context, Wwa wwa, String str) {
        if (tN.YFl()) {
            return new wN(context, wwa, str);
        }
        if (Sco.qsH(context)) {
            return new AlY(context, wwa, str);
        }
        return new YFl(context, wwa, str);
    }
}
