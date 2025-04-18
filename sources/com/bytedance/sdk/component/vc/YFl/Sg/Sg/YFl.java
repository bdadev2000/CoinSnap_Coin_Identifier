package com.bytedance.sdk.component.vc.YFl.Sg.Sg;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.vc.YFl.YFl.YFl.DSW;
import com.bytedance.sdk.component.vc.YFl.YFl.YFl.vc;
import com.bytedance.sdk.component.vc.YFl.qsH;
import java.util.Iterator;
import java.util.List;
import vd.e;

/* loaded from: classes.dex */
public class YFl {
    private static String AlY() {
        return e.h(new StringBuilder(), DSW.Sg, "/ad_log_event/");
    }

    public static void Sg() {
        if (qsH.DSW().vc() == null) {
            return;
        }
        try {
            ContentResolver tN = tN();
            if (tN != null) {
                tN.getType(Uri.parse(AlY() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl() {
        if (qsH.DSW().vc() == null) {
            return;
        }
        try {
            ContentResolver tN = tN();
            if (tN != null) {
                tN.getType(Uri.parse(AlY() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver tN() {
        try {
            if (qsH.DSW().vc() != null) {
                return qsH.DSW().vc().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void YFl(com.bytedance.sdk.component.vc.YFl.AlY.YFl yFl) {
        if (yFl == null) {
            return;
        }
        try {
            ContentResolver tN = tN();
            if (tN != null) {
                tN.getType(Uri.parse(AlY() + "adLogDispatch?event=" + vc.YFl(yFl.vc())));
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public static void YFl(String str, List<String> list, boolean z10) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    sb2.append(vc.YFl(it.next()));
                    sb2.append(",");
                }
                String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(vc.YFl(sb2.toString())) + "&replace=" + String.valueOf(z10);
                ContentResolver tN = tN();
                if (tN == null) {
                    return;
                }
                tN.getType(Uri.parse(AlY() + "trackAdUrl" + str2));
            } catch (Throwable unused) {
            }
        }
    }

    public static void YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver tN = tN();
            if (tN != null) {
                tN.getType(Uri.parse(AlY() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
