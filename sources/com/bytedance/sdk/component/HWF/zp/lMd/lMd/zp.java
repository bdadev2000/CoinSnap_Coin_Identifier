package com.bytedance.sdk.component.HWF.zp.lMd.lMd;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.zp.HWF;
import com.bytedance.sdk.component.HWF.zp.zp.zp.QR;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class zp {
    private static ContentResolver KS() {
        try {
            if (ku.QR().HWF() != null) {
                return ku.QR().HWF().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String jU() {
        return AbstractC2914a.h(new StringBuilder(), QR.lMd, "/ad_log_event/");
    }

    public static void lMd() {
        if (ku.QR().HWF() == null) {
            return;
        }
        try {
            ContentResolver KS = KS();
            if (KS != null) {
                KS.getType(Uri.parse(jU() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp() {
        if (ku.QR().HWF() == null) {
            return;
        }
        try {
            ContentResolver KS = KS();
            if (KS != null) {
                KS.getType(Uri.parse(jU() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (zpVar == null) {
            return;
        }
        try {
            ContentResolver KS = KS();
            if (KS != null) {
                KS.getType(Uri.parse(jU() + "adLogDispatch?event=" + HWF.zp(zpVar.HWF())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void zp(String str, List<String> list, boolean z8) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(HWF.zp(it.next()));
                    sb.append(",");
                }
                String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(HWF.zp(sb.toString())) + "&replace=" + String.valueOf(z8);
                ContentResolver KS = KS();
                if (KS == null) {
                    return;
                }
                KS.getType(Uri.parse(jU() + "trackAdUrl" + str2));
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver KS = KS();
            if (KS != null) {
                KS.getType(Uri.parse(jU() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
