package com.bytedance.sdk.component.vc.YFl.Sg.Sg;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.YFl.YFl.DSW;
import com.bytedance.sdk.component.vc.YFl.qsH;
import com.bytedance.sdk.component.vc.YFl.vc;
import java.util.Iterator;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class Sg {
    public static vc YFl;

    private static String AlY() {
        return e.h(new StringBuilder(), DSW.Sg, "/ad_log_event/");
    }

    public static void Sg() {
        if (qsH.DSW().vc() == null) {
            return;
        }
        try {
            vc YFl2 = YFl(qsH.DSW().vc());
            if (YFl2 != null) {
                YFl2.YFl(Uri.parse(AlY() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public int YFl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public String tN() {
        return "ad_log_event";
    }

    public int YFl(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor YFl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public Uri YFl(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static vc YFl(Context context) {
        try {
            if (YFl == null) {
                YFl = qsH.DSW().rkt().eT();
            }
        } catch (Exception unused) {
        }
        return YFl;
    }

    public static void YFl() {
        if (qsH.DSW().vc() == null) {
            return;
        }
        try {
            vc YFl2 = YFl(qsH.DSW().vc());
            if (YFl2 != null) {
                YFl2.YFl(Uri.parse(AlY() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (yFl == null) {
            return;
        }
        try {
            vc YFl2 = YFl(qsH.DSW().vc());
            if (YFl2 != null) {
                YFl2.YFl(Uri.parse(AlY() + "adLogDispatch?event=" + com.bytedance.sdk.component.vc.YFl.YFl.YFl.vc.YFl(yFl.vc())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void YFl(String str, List<String> list, boolean z10, int i10, String str2) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb2.append(com.bytedance.sdk.component.vc.YFl.YFl.YFl.vc.YFl(it.next()));
                    sb2.append(",");
                }
                String str3 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(com.bytedance.sdk.component.vc.YFl.YFl.YFl.vc.YFl(sb2.toString())) + "&replace=" + String.valueOf(z10) + "&urlType=" + String.valueOf(i10) + "&adId=" + str2;
                vc YFl2 = YFl(qsH.DSW().vc());
                if (YFl2 == null) {
                    return;
                }
                YFl2.YFl(Uri.parse(AlY() + "trackAdUrl" + str3));
            } catch (Throwable unused) {
            }
        }
    }

    public static void YFl(String str, boolean z10) {
        if (qsH.DSW().rkt().vc() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        try {
            vc YFl2 = YFl(qsH.DSW().vc());
            if (YFl2 != null) {
                YFl2.YFl(Uri.parse(AlY() + "trackAdFailed?did=" + String.valueOf(str) + "&triggerOnInit=" + z10));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0037, code lost:
    
        if (r0.equals("adLogStop") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String YFl(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg.YFl(android.net.Uri):java.lang.String");
    }
}
