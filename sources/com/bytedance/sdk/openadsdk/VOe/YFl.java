package com.bytedance.sdk.openadsdk.VOe;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class YFl {
    private static int YFl(int i10) {
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5 && i10 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    public static List<String> YFl(List<String> list, boolean z10) {
        String YFl = YoT.YFl(lG.YFl());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(YFl)) {
                next = next.replace("{UID}", YFl).replace("__UID__", YFl);
            }
            if (z10) {
                next = YFl(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TrackAdUrlUtils", e2.getMessage());
            return str;
        }
    }

    public static List<String> YFl(List<String> list, boolean z10, Wwa wwa) {
        String YFl = YoT.YFl(lG.YFl());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(YFl)) {
                next = next.replace("{UID}", YFl).replace("__UID__", YFl);
            }
            if (next.contains("__CID__") && wwa != null && !TextUtils.isEmpty(wwa.zz())) {
                next = next.replace("__CID__", wwa.zz());
            }
            if (next.contains("__CTYPE__") && wwa != null) {
                next = next.replace("__CTYPE__", String.valueOf(YFl(wwa.ZLB())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(Sco.tN()));
            }
            if (z10) {
                next = YFl(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
