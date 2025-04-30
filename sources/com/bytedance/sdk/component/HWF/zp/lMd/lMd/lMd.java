package com.bytedance.sdk.component.HWF.zp.lMd.lMd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.HWF.zp.HWF;
import com.bytedance.sdk.component.HWF.zp.ku;
import com.bytedance.sdk.component.HWF.zp.zp.zp.QR;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class lMd {
    public static HWF zp;

    private static String jU() {
        return AbstractC2914a.h(new StringBuilder(), QR.lMd, "/ad_log_event/");
    }

    public static void lMd() {
        if (ku.QR().HWF() == null) {
            return;
        }
        try {
            HWF zp2 = zp(ku.QR().HWF());
            if (zp2 != null) {
                zp2.zp(Uri.parse(jU() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public String KS() {
        return "ad_log_event";
    }

    public int zp(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public int zp(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor zp(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri zp(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static HWF zp(Context context) {
        try {
            if (zp == null) {
                zp = ku.QR().KVG().Bj();
            }
        } catch (Exception unused) {
        }
        return zp;
    }

    public static void zp() {
        if (ku.QR().HWF() == null) {
            return;
        }
        try {
            HWF zp2 = zp(ku.QR().HWF());
            if (zp2 != null) {
                zp2.zp(Uri.parse(jU() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        if (zpVar == null) {
            return;
        }
        try {
            HWF zp2 = zp(ku.QR().HWF());
            if (zp2 != null) {
                zp2.zp(Uri.parse(jU() + "adLogDispatch?event=" + com.bytedance.sdk.component.HWF.zp.zp.zp.HWF.zp(zpVar.HWF())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void zp(String str, List<String> list, boolean z8, int i9, String str2) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(com.bytedance.sdk.component.HWF.zp.zp.zp.HWF.zp(it.next()));
                    sb.append(",");
                }
                String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.HWF.zp.zp.zp.HWF.zp(sb.toString())) + "&replace=" + String.valueOf(z8) + "&urlType=" + String.valueOf(i9) + "&adId=" + str2;
                HWF zp2 = zp(ku.QR().HWF());
                if (zp2 == null) {
                    return;
                }
                zp2.zp(Uri.parse(jU() + "trackAdUrl" + str3));
            } catch (Throwable unused) {
            }
        }
    }

    public static void zp(String str, boolean z8) {
        if (ku.QR().KVG().HWF() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HWF zp2 = zp(ku.QR().HWF());
            if (zp2 != null) {
                zp2.zp(Uri.parse(jU() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z8));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r1.equals("adLogStop") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String zp(android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.zp(android.net.Uri):java.lang.String");
    }
}
