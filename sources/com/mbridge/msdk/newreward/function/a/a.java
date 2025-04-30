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
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f17035a = 4;
    public static int b = 5;

    /* renamed from: c, reason: collision with root package name */
    private static String f17036c = "BaseCandidateCache";

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f17037d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f17038e;

    /* renamed from: f, reason: collision with root package name */
    private String f17039f;

    /* renamed from: g, reason: collision with root package name */
    private int f17040g;

    /* renamed from: h, reason: collision with root package name */
    private String f17041h;

    /* renamed from: i, reason: collision with root package name */
    private e f17042i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f17043j;

    /* renamed from: com.mbridge.msdk.newreward.function.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0174a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.d.a.b f17045a;
        private double b;

        public C0174a(double d2, com.mbridge.msdk.newreward.function.d.a.b bVar) {
            this.b = d2;
            this.f17045a = bVar;
        }

        public final com.mbridge.msdk.newreward.function.d.a.b a() {
            return this.f17045a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f17037d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i9 = 0; i9 < this.f17037d.length(); i9++) {
                try {
                    JSONObject optJSONObject = this.f17037d.optJSONObject(i9);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f17038e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return null;
        }
        return this.f17037d.optJSONObject(0);
    }

    public final String b(String str) {
        b c9 = c(str);
        if (c9 != null && c9.h() != com.mbridge.msdk.foundation.b.c.f15352c && c9.h() != com.mbridge.msdk.foundation.b.c.f15351a) {
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
            JSONArray jSONArray = this.f17037d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a6 = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a6)) {
                    bVar.d("bid token exception:decode error");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
                    return bVar;
                }
                String[] split = a6.split("\\|");
                if (split.length == 0) {
                    bVar.d("bid token can not get bid price");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
                    return bVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        bVar.d("bid token can not cast bid price");
                        bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
                        return bVar;
                    }
                }
                if (TextUtils.isEmpty(this.f17039f)) {
                    bVar.d("unitId is empty");
                    bVar.a(com.mbridge.msdk.foundation.b.c.f15352c);
                }
                return bVar;
            }
            bVar.d("config is empty");
            bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
            return bVar;
        }
        bVar.d("bid token exception");
        bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
        return bVar;
    }

    public final double d(String str) {
        b c9 = c(str);
        if (c9 != null && c9.h() != com.mbridge.msdk.foundation.b.c.f15352c && c9.h() != com.mbridge.msdk.foundation.b.c.f15351a) {
            try {
                String[] split = x.a(str.split("_")[3]).split("\\|");
                if (split.length > 0) {
                    return Double.parseDouble(split[0]);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return -1.0d;
    }

    public final void e(String str) {
        this.f17039f = str;
    }

    public final void f(String str) {
        this.f17041h = str;
    }

    private List<String> b(List<String> list, int i9, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(a(list.get(i10), i9, str, str2));
        }
        return arrayList;
    }

    public final void a(JSONArray jSONArray) {
        this.f17037d = jSONArray;
    }

    public final void a(List<com.mbridge.msdk.newreward.function.d.a.a> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i9, String str2, int i10, double d2) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        CampaignEx g9 = list.get(i11).g();
                        g9.setReadyState(0);
                        if (bVar != null) {
                            g9.setNLRid(bVar.f());
                        }
                        g9.setNRid(str);
                        g9.setReasond(str2);
                        g9.setTyped(i9);
                        String b8 = x.b(d2 + "");
                        g9.setNoticeUrl(a(g9.getNoticeUrl(), i10, str, b8));
                        g9.setClickURL(a(g9.getClickURL(), i10, str, b8));
                        g9.setImpressionURL(a(g9.getImpressionURL(), i10, str, b8));
                        g9.setOnlyImpressionURL(a(g9.getOnlyImpressionURL(), i10, str, b8));
                        g9.setAdvImp(a(g9.getAdvImpList(), i10, str, b8));
                        j nativeVideoTracking = g9.getNativeVideoTracking();
                        if (nativeVideoTracking != null) {
                            nativeVideoTracking.k(a(nativeVideoTracking.l(), i10, str, b8));
                            nativeVideoTracking.c(a(nativeVideoTracking.c(), i10, str, b8));
                            nativeVideoTracking.o(a(nativeVideoTracking.p(), i10, str, b8));
                            nativeVideoTracking.s(a(nativeVideoTracking.t(), i10, str, b8));
                            nativeVideoTracking.a(a(nativeVideoTracking.a(), i10, str, b8));
                            nativeVideoTracking.b(a(nativeVideoTracking.b(), i10, str, b8));
                            nativeVideoTracking.r(a(nativeVideoTracking.s(), i10, str, b8));
                            nativeVideoTracking.u(a(nativeVideoTracking.v(), i10, str, b8));
                            nativeVideoTracking.t(a(nativeVideoTracking.v(), i10, str, b8));
                            nativeVideoTracking.v(a(nativeVideoTracking.w(), i10, str, b8));
                            nativeVideoTracking.h(a(nativeVideoTracking.h(), i10, str, b8));
                            nativeVideoTracking.p(a(nativeVideoTracking.q(), i10, str, b8));
                            nativeVideoTracking.q(a(nativeVideoTracking.r(), i10, str, b8));
                            nativeVideoTracking.n(a(nativeVideoTracking.o(), i10, str, b8));
                            nativeVideoTracking.e(a(nativeVideoTracking.e(), i10, str, b8));
                            nativeVideoTracking.f(a(nativeVideoTracking.f(), i10, str, b8));
                            nativeVideoTracking.g(a(nativeVideoTracking.g(), i10, str, b8));
                            nativeVideoTracking.i(a(nativeVideoTracking.j(), i10, str, b8));
                            nativeVideoTracking.j(a(nativeVideoTracking.k(), i10, str, b8));
                            nativeVideoTracking.l(a(nativeVideoTracking.m(), i10, str, b8));
                            nativeVideoTracking.a(a(nativeVideoTracking.i(), i10, str, b8));
                            nativeVideoTracking.d(a(nativeVideoTracking.d(), i10, str, b8));
                            nativeVideoTracking.m(a(nativeVideoTracking.n(), i10, str, b8));
                            g9.setNativeVideoTracking(nativeVideoTracking);
                            g9.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        g9.setPv_urls(b(g9.getPv_urls(), i10, str, b8));
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final b a() {
        b bVar = new b();
        try {
            JSONArray jSONArray = this.f17037d;
            if (jSONArray == null || jSONArray.length() == 0) {
                bVar.d("setting config is null");
                bVar.a(com.mbridge.msdk.foundation.b.c.f15351a);
                return bVar;
            }
        } catch (Exception unused) {
            bVar.d("checkConfigAndDB exception");
            bVar.a(com.mbridge.msdk.foundation.b.c.f15352c);
        }
        return bVar;
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i9, int i10, String str) {
        return com.mbridge.msdk.newreward.function.e.c.a().b().a(i10, str, this.f17039f, true, 0);
    }

    private String a(String str, int i9, String str2, String str3) {
        if (TextUtils.isEmpty(str) || str.contains("ca_sce") || str.contains("real_rid") || str.contains("real_bp")) {
            return str;
        }
        if (ao.c(str) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&ca_sce=");
            sb.append(i9);
            sb.append("&real_rid=");
            sb.append(str2);
            return AbstractC2914a.h(sb, "&real_bp=", str3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("?ca_sce=");
        sb2.append(i9);
        sb2.append("&real_rid=");
        sb2.append(str2);
        return AbstractC2914a.h(sb2, "&real_bp=", str3);
    }

    private String a(Map<Integer, String> map, int i9, String str, String str2) {
        if (map == null || map.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                String value = entry.getValue();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(CampaignEx.JSON_AD_IMP_KEY, entry.getKey());
                jSONObject.put("url", a(value, i9, str, str2));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray.toString();
    }

    private String[] a(String[] strArr, int i9, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = a(strArr[i10], i9, str, str2);
        }
        return strArr2;
    }

    private List<Map<Integer, String>> a(List<Map<Integer, String>> list, int i9, String str, String str2) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Map<Integer, String> map = list.get(i10);
            if (map != null && map.size() > 0) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    map.put(entry.getKey(), a(entry.getValue(), i9, str, str2));
                }
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    public final void a(int i9) {
        this.f17040g = i9;
    }

    public final void a(e eVar) {
        this.f17042i = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar) {
        this.f17043j = cVar;
    }

    public final void a(String str, String str2, int i9, double d2) {
        if (d2 == 0.0d) {
            return;
        }
        try {
            if (i9 == 1) {
                a(f17035a, 3, null, true, str2, str, -1, this.f17039f);
            } else if (i9 == 2) {
                a(f17035a, 1, null, true, str2, str, -1, this.f17039f);
            } else if (i9 != 3) {
            } else {
                a(f17035a, 4, null, true, str2, str, -1, this.f17039f);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0187 A[Catch: Exception -> 0x0028, TryCatch #1 {Exception -> 0x0028, blocks: (B:3:0x000d, B:6:0x002d, B:8:0x0067, B:11:0x0078, B:14:0x007e, B:16:0x0099, B:19:0x00a0, B:21:0x00a6, B:23:0x00ae, B:25:0x0107, B:28:0x010a, B:32:0x0114, B:35:0x011a, B:38:0x0120, B:40:0x012d, B:42:0x0131, B:44:0x0142, B:46:0x0148, B:48:0x0150, B:50:0x0168, B:53:0x016b, B:55:0x017f, B:57:0x0187, B:58:0x018c, B:65:0x0177), top: B:2:0x000d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.a.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
