package com.mbridge.msdk.newreward.function.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    public static int a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static int f14432b = 5;

    /* renamed from: c, reason: collision with root package name */
    private static String f14433c = "BaseCandidateCache";

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f14434d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f14435e;

    /* renamed from: f, reason: collision with root package name */
    private String f14436f;

    /* renamed from: g, reason: collision with root package name */
    private int f14437g;

    /* renamed from: h, reason: collision with root package name */
    private String f14438h;

    /* renamed from: i, reason: collision with root package name */
    private e f14439i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f14440j;

    /* renamed from: com.mbridge.msdk.newreward.function.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0186a {
        private com.mbridge.msdk.newreward.function.d.a.b a;

        /* renamed from: b, reason: collision with root package name */
        private double f14441b;

        public C0186a(double d10, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.f14441b = d10;
            this.a = bVar;
        }

        public final com.mbridge.msdk.newreward.function.d.a.b a() {
            return this.a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f14434d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i10 = 0; i10 < this.f14434d.length(); i10++) {
                try {
                    JSONObject optJSONObject = this.f14434d.optJSONObject(i10);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f14435e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
        return this.f14434d.optJSONObject(0);
    }

    public final String b(String str) {
        b c10 = c(str);
        if (c10 != null && c10.h() != com.mbridge.msdk.foundation.b.c.f12993c && c10.h() != com.mbridge.msdk.foundation.b.c.a) {
            String[] split = x.a(str.split("_")[3]).split("\\|");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public final b c(String str) {
        b bVar = new b();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f14434d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a10 = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a10)) {
                    bVar.d("bid token exception:decode error");
                    bVar.a(com.mbridge.msdk.foundation.b.c.a);
                    return bVar;
                }
                String[] split = a10.split("\\|");
                if (split.length == 0) {
                    bVar.d("bid token can not get bid price");
                    bVar.a(com.mbridge.msdk.foundation.b.c.a);
                    return bVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        bVar.d("bid token can not cast bid price");
                        bVar.a(com.mbridge.msdk.foundation.b.c.a);
                        return bVar;
                    }
                }
                if (TextUtils.isEmpty(this.f14436f)) {
                    bVar.d("unitId is empty");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f12993c);
                }
                return bVar;
            }
            bVar.d("config is empty");
            bVar.a(com.mbridge.msdk.foundation.b.c.a);
            return bVar;
        }
        bVar.d("bid token exception");
        bVar.a(com.mbridge.msdk.foundation.b.c.a);
        return bVar;
    }

    public final double d(String str) {
        b c10 = c(str);
        if (c10 != null && c10.h() != com.mbridge.msdk.foundation.b.c.f12993c && c10.h() != com.mbridge.msdk.foundation.b.c.a) {
            try {
                String[] split = x.a(str.split("_")[3]).split("\\|");
                if (split.length > 0) {
                    return Double.parseDouble(split[0]);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return -1.0d;
    }

    public final void e(String str) {
        this.f14436f = str;
    }

    public final void f(String str) {
        this.f14438h = str;
    }

    private List<String> b(List<String> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11), i10, str, str2));
        }
        return arrayList;
    }

    public final void a(JSONArray jSONArray) {
        this.f14434d = jSONArray;
    }

    public final void a(List<com.mbridge.msdk.newreward.function.d.a.a> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx g10 = list.get(i12).g();
                        g10.setReadyState(0);
                        if (bVar != null) {
                            g10.setNLRid(bVar.f());
                        }
                        g10.setNRid(str);
                        g10.setReasond(str2);
                        g10.setTyped(i10);
                        String b3 = x.b(d10 + "");
                        g10.setNoticeUrl(a(g10.getNoticeUrl(), i11, str, b3));
                        g10.setClickURL(a(g10.getClickURL(), i11, str, b3));
                        g10.setImpressionURL(a(g10.getImpressionURL(), i11, str, b3));
                        g10.setOnlyImpressionURL(a(g10.getOnlyImpressionURL(), i11, str, b3));
                        g10.setAdvImp(a(g10.getAdvImpList(), i11, str, b3));
                        j nativeVideoTracking = g10.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.k(a(nativeVideoTracking.l(), i11, str, b3));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i11, str, b3));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i11, str, b3));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i11, str, b3));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i11, str, b3));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i11, str, b3));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i11, str, b3));
                            nativeVideoTracking.u(a(nativeVideoTracking.v(), i11, str, b3));
                            nativeVideoTracking.t(a(nativeVideoTracking.v(), i11, str, b3));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i11, str, b3));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i11, str, b3));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i11, str, b3));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i11, str, b3));
                            nativeVideoTracking.n(a(nativeVideoTracking.o(), i11, str, b3));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i11, str, b3));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i11, str, b3));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i11, str, b3));
                            nativeVideoTracking.i(a(nativeVideoTracking.j(), i11, str, b3));
                            nativeVideoTracking.j(a(nativeVideoTracking.k(), i11, str, b3));
                            nativeVideoTracking.l(a(nativeVideoTracking.m(), i11, str, b3));
                            nativeVideoTracking.a(a(nativeVideoTracking.i(), i11, str, b3));
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i11, str, b3));
                            nativeVideoTracking.m(a(nativeVideoTracking.n(), i11, str, b3));
                            g10.setNativeVideoTracking(nativeVideoTracking);
                            g10.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        g10.setPv_urls(b(g10.getPv_urls(), i11, str, b3));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final b a() {
        b bVar = new b();
        try {
            JSONArray jSONArray = this.f14434d;
            if (jSONArray == null || jSONArray.length() == 0) {
                bVar.d("setting config is null");
                bVar.a(com.mbridge.msdk.foundation.b.c.a);
                return bVar;
            }
        } catch (Exception unused) {
            bVar.d("checkConfigAndDB exception");
            bVar.a(com.mbridge.msdk.foundation.b.c.f12993c);
        }
        return bVar;
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i10, int i11, String str) {
        return com.mbridge.msdk.newreward.function.e.c.a().b().a(i11, str, this.f14436f, true, 0);
    }

    private String a(String str, int i10, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (ao.c(str) > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&ca_sce=");
            sb2.append(i10);
            sb2.append("&real_rid=");
            sb2.append(str2);
            return vd.e.h(sb2, "&real_bp=", str3);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?ca_sce=");
        sb3.append(i10);
        sb3.append("&real_rid=");
        sb3.append(str2);
        return vd.e.h(sb3, "&real_bp=", str3);
    }

    private String a(Map<Integer, String> map, int i10, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i10, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i10, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = a(strArr[i11], i10, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> a(List<Map<Integer, String>> list, int i10, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            Map<Integer, String> map = list.get(i11);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i10, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public final void a(int i10) {
        this.f14437g = i10;
    }

    public final void a(e eVar) {
        this.f14439i = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar) {
        this.f14440j = cVar;
    }

    public final void a(String str, String str2, int i10, double d10) {
        if (d10 == 0.0d) {
            return;
        }
        try {
            if (i10 == 1) {
                a(a, 3, null, true, str2, str, -1, this.f14436f);
            } else if (i10 == 2) {
                a(a, 1, null, true, str2, str, -1, this.f14436f);
            } else if (i10 != 3) {
            } else {
                a(a, 4, null, true, str2, str, -1, this.f14436f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0181 A[Catch: Exception -> 0x019e, TryCatch #0 {Exception -> 0x019e, blocks: (B:3:0x000d, B:6:0x002a, B:8:0x0064, B:11:0x0075, B:14:0x007b, B:16:0x0096, B:19:0x009d, B:21:0x00a3, B:23:0x00ab, B:25:0x0101, B:28:0x0105, B:31:0x0110, B:34:0x0116, B:37:0x011c, B:39:0x0129, B:41:0x012d, B:43:0x0139, B:45:0x013f, B:47:0x0147, B:49:0x015f, B:52:0x0162, B:53:0x0177, B:55:0x0181, B:56:0x0186, B:62:0x0171), top: B:2:0x000d, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.a.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
