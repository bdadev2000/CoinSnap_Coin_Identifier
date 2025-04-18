package com.bytedance.sdk.component.adexpress.dynamic.Sg;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW;

/* loaded from: classes.dex */
public class YFl {
    public static int YFl(DSW dsw) {
        if (dsw == null) {
            return 0;
        }
        String lu = dsw.lu();
        String bZ = dsw.bZ();
        if (TextUtils.isEmpty(bZ) || TextUtils.isEmpty(lu) || !bZ.equals("creative")) {
            return 0;
        }
        if (lu.equals("shake")) {
            return 2;
        }
        if (lu.equals("twist")) {
            return 3;
        }
        if (!lu.equals("slide")) {
            return 0;
        }
        return 1;
    }
}
