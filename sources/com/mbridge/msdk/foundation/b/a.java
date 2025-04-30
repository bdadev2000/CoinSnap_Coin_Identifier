package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.j;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class a {
    public static int b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static String f15335c = "BaseCandidateCache";

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.foundation.db.c f15336a;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f15337d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f15338e;

    /* renamed from: f, reason: collision with root package name */
    private String f15339f;

    /* renamed from: com.mbridge.msdk.foundation.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0155a {

        /* renamed from: a, reason: collision with root package name */
        private b f15341a;
        private double b;

        public C0155a(double d2, b bVar) {
            this.b = d2;
            this.f15341a = bVar;
        }

        public final b a() {
            return this.f15341a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f15337d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i9 = 0; i9 < this.f15337d.length(); i9++) {
                try {
                    JSONObject optJSONObject = this.f15337d.optJSONObject(i9);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f15338e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return null;
        }
        return this.f15337d.optJSONObject(0);
    }

    public final String b(String str) {
        c c9 = c(str);
        if (c9 != null && c9.g() != c.f15352c && c9.g() != c.f15351a) {
            String[] split = x.a(str.split("_")[3]).split("\\|");
            if (split.length > 1) {
                return split[1];
            }
        }
        return "";
    }

    public final c c(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str) && str.split("_").length > 3 && !TextUtils.isEmpty(str.split("_")[3])) {
            JSONArray jSONArray = this.f15337d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a6 = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a6)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.f15351a);
                    return cVar;
                }
                String[] split = a6.split("\\|");
                if (split.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.f15351a);
                    return cVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.f15351a);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f15339f)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f15352c);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.f15351a);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.f15351a);
        return cVar;
    }

    public final double d(String str) {
        c c9 = c(str);
        if (c9 != null && c9.g() != c.f15352c && c9.g() != c.f15351a) {
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
        this.f15339f = str;
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
        this.f15337d = jSONArray;
    }

    public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i9, String str2, int i10, double d2) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        CampaignEx campaignEx = list.get(i11);
                        campaignEx.setReadyState(0);
                        if (bVar != null) {
                            campaignEx.setNLRid(bVar.f());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i9);
                        String b8 = x.b(d2 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i10, str, b8));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i10, str, b8));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i10, str, b8));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i10, str, b8));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i10, str, b8));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
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
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(b(campaignEx.getPv_urls(), i10, str, b8));
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
    }

    public final c a() {
        JSONArray jSONArray;
        c cVar = new c();
        try {
            jSONArray = this.f15337d;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f15352c);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            if (this.f15336a == null) {
                cVar.d("db error");
                cVar.a(c.f15352c);
                return cVar;
            }
            return cVar;
        }
        cVar.d("setting config is null");
        cVar.a(c.f15351a);
        return cVar;
    }

    public final void a(List<C0155a> list, int i9) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new Comparator<C0155a>() { // from class: com.mbridge.msdk.foundation.b.a.1
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(C0155a c0155a, C0155a c0155a2) {
                            return Double.compare(c0155a.b, c0155a2.b);
                        }
                    });
                    int size = list.size() - i9;
                    if (size > 0) {
                        List<C0155a> subList = list.subList(0, size);
                        if (this.f15336a == null || subList.size() <= 0) {
                            return;
                        }
                        for (int i10 = 0; i10 < subList.size(); i10++) {
                            b bVar = subList.get(i10).f15341a;
                            this.f15336a.a(this.f15339f, bVar.e(), bVar.d());
                            a(b, 1, null, true, bVar.e(), bVar.d(), -1, this.f15339f);
                        }
                    }
                }
            } catch (Exception e4) {
                ad.a(f15335c, e4);
            }
        }
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

    public final long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String a6 = x.a(ecppv);
        if (TextUtils.isEmpty(a6)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(a6) <= 0.0d) {
                return 0L;
            }
            JSONObject a9 = a(b(str));
            int optInt = a9 != null ? a9.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.f15336a;
            if (cVar == null || optInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f15339f);
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1L;
        }
    }

    public final void a(String str, String str2, int i9, String str3) {
        try {
            if (this.f15336a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i9 == 1) {
                this.f15336a.a(str2, str, this.f15339f, i9);
                a(b, 3, null, true, str2, str, -1, this.f15339f);
            } else if (i9 == 2) {
                this.f15336a.a(this.f15339f, str2, str);
                a(b, 1, null, true, str2, str, -1, this.f15339f);
            } else if (i9 == 3) {
                this.f15336a.b(str2, str, this.f15339f);
                a(b, 4, null, true, str2, str, -1, this.f15339f);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0187 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:3:0x0011, B:6:0x0031, B:8:0x0069, B:11:0x0079, B:13:0x007f, B:17:0x0086, B:19:0x0091, B:22:0x0098, B:24:0x009e, B:26:0x00a6, B:28:0x0104, B:32:0x0108, B:36:0x0113, B:39:0x0119, B:42:0x011f, B:44:0x012d, B:46:0x0131, B:48:0x0142, B:50:0x0148, B:52:0x0150, B:54:0x0168, B:57:0x016b, B:59:0x017f, B:61:0x0187, B:62:0x018c, B:69:0x0177), top: B:2:0x0011, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.b.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final List<b> a(int i9, long j7) {
        com.mbridge.msdk.foundation.db.c cVar;
        if (i9 >= 0 && (cVar = this.f15336a) != null) {
            cVar.a(this.f15339f, i9);
            a(b, 1, null, true, "", "", i9, this.f15339f);
        }
        com.mbridge.msdk.foundation.db.c cVar2 = this.f15336a;
        if (cVar2 != null) {
            return cVar2.a(this.f15339f, 0, j7);
        }
        return null;
    }
}
