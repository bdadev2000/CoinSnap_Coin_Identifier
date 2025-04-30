package com.mbridge.msdk.mbbid.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.ak;
import com.mbridge.msdk.foundation.tools.e;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f16391a = new HashMap();
    public static JSONArray b;

    public static String a(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(BidConstants.BID_FILTER_KEY_UNIT_ID, str);
        return a(context, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        r14 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d0, code lost:
    
        if (r5 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e1, code lost:
    
        if ((r14 - r5) >= (r9.optInt("ttl") * 1000)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0110, code lost:
    
        a(r19, r11, r14);
        r16 = 1;
        r4 = 0;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0117, code lost:
    
        r0 = r4;
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        r4 = r9.optDouble("rate");
        r0 = new java.util.Random().nextInt(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        if (r4 == 0.0d) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
    
        if ((r4 * 100.0d) < r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
    
        r0 = 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0107, code lost:
    
        r6 = r0;
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0105, code lost:
    
        r0 = 2;
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010c, code lost:
    
        r5 = r0;
        r4 = r9;
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0124, code lost:
    
        a(r19, r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0127, code lost:
    
        r16 = 1;
        r4 = r9;
        r0 = 0;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011b, code lost:
    
        r5 = r0;
        r0 = 1;
        r4 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151 A[Catch: all -> 0x01c1, TryCatch #1 {all -> 0x01c1, blocks: (B:28:0x0147, B:30:0x0151, B:32:0x01a5, B:33:0x01c4, B:35:0x01df, B:37:0x01e7, B:38:0x020a, B:40:0x0214, B:41:0x0237, B:43:0x0241, B:44:0x0264), top: B:27:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean b(android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbid.common.b.b(android.content.Context, java.lang.String):boolean");
    }

    public static String a(Context context, Map<String, String> map) {
        String str;
        String str2;
        f16391a = map;
        try {
            if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                com.mbridge.msdk.foundation.controller.c.m().b(context);
            }
            if (b == null) {
                b = h.a().a(com.mbridge.msdk.foundation.controller.c.m().k()).ai();
            }
            str = SameMD5.getMD5(ai.d());
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (b(context, str)) {
                return "";
            }
            Map<String, String> map2 = f16391a;
            if (map2 == null || !map2.containsKey(BidConstants.BID_FILTER_KEY_UNIT_ID)) {
                str2 = "";
            } else {
                str2 = f16391a.get(BidConstants.BID_FILTER_KEY_UNIT_ID);
            }
            return a(context, str2, str);
        } catch (Exception unused2) {
            return a(context, "", str);
        }
    }

    private static String a(Context context, String str, String str2) {
        long j7;
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (context != null) {
            try {
                if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
                    com.mbridge.msdk.foundation.controller.c.m().b(context);
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("BidCommon", e4.getMessage());
                }
            }
        }
        g b8 = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (b8 == null) {
            h.a();
            b8 = i.a();
        }
        stringBuffer.append(e.c());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(z.x());
        stringBuffer.append("|");
        stringBuffer.append(z.m());
        stringBuffer.append("|");
        stringBuffer.append(z.l(context));
        stringBuffer.append("|");
        stringBuffer.append(MBConfiguration.SDK_VERSION);
        stringBuffer.append("|");
        stringBuffer.append(z.i(context));
        stringBuffer.append("x");
        stringBuffer.append(z.g(context));
        stringBuffer.append("|");
        stringBuffer.append(z.g());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(ai.b(20));
        stringBuffer.append("|");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.same.a.f15678d);
        stringBuffer.append("|");
        stringBuffer.append(z.o());
        stringBuffer.append("|");
        stringBuffer.append(z.f());
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(ag.b());
        stringBuffer.append("|");
        stringBuffer.append(ag.a());
        stringBuffer.append("|");
        try {
            j7 = y.a();
        } catch (Exception unused) {
            j7 = 0;
        }
        if (j7 > 0) {
            stringBuffer.append(j7);
            stringBuffer.append("|");
        } else {
            stringBuffer.append("");
            stringBuffer.append("|");
        }
        stringBuffer.append("|");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.a.a.a.a().a(com.mbridge.msdk.foundation.controller.a.f15376a));
        stringBuffer.append("|");
        stringBuffer.append(z.i());
        if (b8 == null) {
            str3 = "";
        } else {
            str3 = b8.a();
        }
        stringBuffer.append("|");
        stringBuffer.append(str3);
        stringBuffer.append("|");
        stringBuffer.append(ai.a());
        stringBuffer.append("|");
        String c9 = ai.c();
        if (TextUtils.isEmpty(c9)) {
            c9 = "";
        }
        stringBuffer.append(c9);
        stringBuffer.append("|");
        stringBuffer.append(ai.c(str));
        stringBuffer.append("|");
        if (b8 != null && b8.as() == 1 && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append(z.z());
        stringBuffer.append("|");
        stringBuffer.append(z.u(context));
        stringBuffer.append("|");
        stringBuffer.append(z.u() + "");
        stringBuffer.append("|");
        stringBuffer.append(z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
        stringBuffer.append("|");
        stringBuffer.append(z.v());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.b.a() ? "1" : MBridgeConstans.API_REUQEST_CATEGORY_APP);
        stringBuffer.append("|");
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append("1");
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f());
        stringBuffer.append("|");
        if (z.q() != 0) {
            stringBuffer.append(z.q() + "");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            stringBuffer.append("|");
            stringBuffer.append(1);
        } else {
            stringBuffer.append("|");
            stringBuffer.append("");
        }
        stringBuffer.append("|");
        stringBuffer.append("");
        stringBuffer.append("|");
        stringBuffer.append(str2);
        stringBuffer.append("|");
        stringBuffer.append(z.k(context));
        stringBuffer.append("|");
        stringBuffer.append(z.j(context));
        stringBuffer.append("|");
        stringBuffer.append(e.d());
        stringBuffer.append("|");
        stringBuffer.append(e.a());
        stringBuffer.append("|");
        stringBuffer.append(com.mbridge.msdk.e.c.f15331a);
        stringBuffer.append("|");
        stringBuffer.append("");
        return x.b(stringBuffer.toString());
    }

    private static void a(Context context, String str, long j7) {
        ak.a(context, str, Long.valueOf(j7));
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        for (String str3 : str.split("-")) {
            if (!TextUtils.isEmpty(str3) && str3.length() > 2 && str3.startsWith("{") && str3.endsWith("}")) {
                String substring = str3.substring(1, str3.length() - 1);
                Map<String, String> map = f16391a;
                if (map != null && map.containsKey(substring)) {
                    String valueOf = String.valueOf(f16391a.get(substring));
                    if (!TextUtils.isEmpty(valueOf)) {
                        str = str.replace(str3, valueOf.concat(""));
                    }
                } else if (BidConstants.BID_FILTER_KEY_NETWORK.equals(str3)) {
                    str = str.replace(str3, z.l(com.mbridge.msdk.foundation.controller.c.m().c()) + "");
                }
            }
        }
        return str.equals(str2);
    }

    private static void a(String str, int i9) {
        d dVar = new d();
        dVar.a("filter", Integer.valueOf(i9));
        dVar.a("lrid", str);
        com.mbridge.msdk.foundation.same.report.d.c.a().b("2000124", dVar);
    }
}
