package com.bytedance.sdk.openadsdk.rV;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.YhE;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class zp {
    private static int zp(int i9) {
        int i10 = 2;
        if (i9 != 2) {
            i10 = 3;
            if (i9 != 3) {
                i10 = 4;
                if (i9 != 4) {
                    i10 = 5;
                    if (i9 != 5 && i9 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i10;
    }

    public static List<String> zp(List<String> list, boolean z8) {
        String zp = Bj.zp(KVG.zp());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(zp)) {
                next = next.replace("{UID}", zp).replace("__UID__", zp);
            }
            if (z8) {
                next = zp(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e4) {
            tG.zp("TrackAdUrlUtils", e4.getMessage());
            return str;
        }
    }

    public static List<String> zp(List<String> list, boolean z8, woN won) {
        String zp = Bj.zp(KVG.zp());
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
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(zp)) {
                next = next.replace("{UID}", zp).replace("__UID__", zp);
            }
            if (next.contains("__CID__") && won != null && !TextUtils.isEmpty(won.fgJ())) {
                next = next.replace("__CID__", won.fgJ());
            }
            if (next.contains("__CTYPE__") && won != null) {
                next = next.replace("__CTYPE__", String.valueOf(zp(won.mW())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(YhE.KS()));
            }
            if (z8) {
                next = zp(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
