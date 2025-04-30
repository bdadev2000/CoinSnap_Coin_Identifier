package com.bytedance.adsdk.zp.zp;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class zp extends RuntimeException {
    public zp(String str, String str2) {
        super(o.k(str, ",problem area:", str2));
    }
}
