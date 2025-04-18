package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k {
    private final Map<String, String> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13510b;

    /* loaded from: classes4.dex */
    public static class a {
        private final Map<String, String> a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final String f13511b;

        public a(String str) {
            this.f13511b = str;
        }

        public final k a() {
            return new k(this);
        }
    }

    public final void a(String str) {
        String str2;
        if (TextUtils.isEmpty(this.f13510b)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("key=");
        sb2.append(this.f13510b);
        try {
            str2 = a(this.a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("SameCommonReporter", e2.getMessage());
            }
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
        }
        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2.toString());
    }

    private k(a aVar) {
        this.f13510b = aVar.f13511b;
        this.a = aVar.a;
    }

    private String a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                str2 = URLEncoder.encode(str2, "utf-8");
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("SameCommonReporter", e2.getMessage());
                                }
                            }
                            sb2.append("&");
                            sb2.append(str);
                            sb2.append("=");
                            sb2.append(str2);
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("SameCommonReporter", e10.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }
}
