package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.n;
import java.util.List;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16559a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                o a6 = o.a(g.a(context));
                if (!TextUtils.isEmpty(str) && a6 != null && a6.a() > 0) {
                    List<n> a9 = a6.a("m_download_end");
                    List<n> a10 = a6.a("2000021");
                    List<n> a11 = a6.a("m_download_end");
                    String e4 = n.e(a10);
                    String a12 = n.a(a9);
                    String b = n.b(a11);
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(e4)) {
                        sb.append(e4);
                    }
                    if (!TextUtils.isEmpty(a12)) {
                        sb.append(a12);
                    }
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }
}
