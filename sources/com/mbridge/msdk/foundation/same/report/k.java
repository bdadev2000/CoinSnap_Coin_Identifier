package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f15949a;
    private final String b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f15950a = new HashMap();
        private final String b;

        public a(String str) {
            this.b = str;
        }

        public final k a() {
            return new k(this);
        }
    }

    public final void a(String str) {
        String str2;
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        StringBuilder sb = new StringBuilder("key=");
        sb.append(this.b);
        try {
            str2 = a(this.f15949a);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e4.getMessage());
            }
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb.toString());
    }

    private k(a aVar) {
        this.b = aVar.b;
        this.f15949a = aVar.f15950a;
    }

    private String a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                str2 = URLEncoder.encode(str2, "utf-8");
                            } catch (Exception e4) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("SameCommonReporter", e4.getMessage());
                                }
                            }
                            sb.append("&");
                            sb.append(str);
                            sb.append("=");
                            sb.append(str2);
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("SameCommonReporter", e9.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }
}
