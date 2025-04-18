package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.n;
import java.util.List;

/* loaded from: classes4.dex */
public class e {
    private static final String a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                o a10 = o.a(g.a(context));
                if (!TextUtils.isEmpty(str) && a10 != null && a10.a() > 0) {
                    List<n> a11 = a10.a("m_download_end");
                    List<n> a12 = a10.a("2000021");
                    List<n> a13 = a10.a("m_download_end");
                    String e2 = n.e(a12);
                    String a14 = n.a(a11);
                    String b3 = n.b(a13);
                    StringBuilder sb2 = new StringBuilder();
                    if (!TextUtils.isEmpty(e2)) {
                        sb2.append(e2);
                    }
                    if (!TextUtils.isEmpty(a14)) {
                        sb2.append(a14);
                    }
                    if (!TextUtils.isEmpty(b3)) {
                        sb2.append(b3);
                    }
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
