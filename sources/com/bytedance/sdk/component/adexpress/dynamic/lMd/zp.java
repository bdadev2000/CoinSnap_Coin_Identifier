package com.bytedance.sdk.component.adexpress.dynamic.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.KS.QR;

/* loaded from: classes.dex */
public class zp {
    public static int zp(QR qr) {
        if (qr == null) {
            return 0;
        }
        String eWG = qr.eWG();
        String ox = qr.ox();
        if (TextUtils.isEmpty(ox) || TextUtils.isEmpty(eWG) || !ox.equals("creative")) {
            return 0;
        }
        if (eWG.equals("shake")) {
            return 2;
        }
        if (eWG.equals("twist")) {
            return 3;
        }
        if (!eWG.equals("slide")) {
            return 0;
        }
        return 1;
    }
}
