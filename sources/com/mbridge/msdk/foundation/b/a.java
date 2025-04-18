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
import vd.e;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static int f12977b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static String f12978c = "BaseCandidateCache";
    protected com.mbridge.msdk.foundation.db.c a;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f12979d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f12980e;

    /* renamed from: f, reason: collision with root package name */
    private String f12981f;

    /* renamed from: com.mbridge.msdk.foundation.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0167a {
        private b a;

        /* renamed from: b, reason: collision with root package name */
        private double f12982b;

        public C0167a(double d10, b bVar) {
            this.f12982b = d10;
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }
    }

    public final JSONObject a(String str) {
        JSONArray jSONArray = this.f12979d;
        if (jSONArray == null) {
            return null;
        }
        if (jSONArray.length() > 1) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            for (int i10 = 0; i10 < this.f12979d.length(); i10++) {
                try {
                    JSONObject optJSONObject = this.f12979d.optJSONObject(i10);
                    if (optJSONObject != null && str.equals(optJSONObject.getString("g"))) {
                        this.f12980e = optJSONObject;
                        return optJSONObject;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
        return this.f12979d.optJSONObject(0);
    }

    public final String b(String str) {
        c c10 = c(str);
        if (c10 != null && c10.g() != c.f12993c && c10.g() != c.a) {
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
            JSONArray jSONArray = this.f12979d;
            if (jSONArray != null && jSONArray.length() != 0) {
                String a = x.a(str.split("_")[3]);
                if (TextUtils.isEmpty(a)) {
                    cVar.d("bid token exception:decode error");
                    cVar.a(c.a);
                    return cVar;
                }
                String[] split = a.split("\\|");
                if (split.length == 0) {
                    cVar.d("bid token can not get bid price");
                    cVar.a(c.a);
                    return cVar;
                }
                if (split.length > 0) {
                    try {
                        Double.parseDouble(split[0]);
                    } catch (Exception unused) {
                        cVar.d("bid token can not cast bid price");
                        cVar.a(c.a);
                        return cVar;
                    }
                }
                if (TextUtils.isEmpty(this.f12981f)) {
                    cVar.d("unitId is empty");
                    cVar.a(c.f12993c);
                }
                return cVar;
            }
            cVar.d("config is empty");
            cVar.a(c.a);
            return cVar;
        }
        cVar.d("bid token exception");
        cVar.a(c.a);
        return cVar;
    }

    public final double d(String str) {
        c c10 = c(str);
        if (c10 != null && c10.g() != c.f12993c && c10.g() != c.a) {
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
        this.f12981f = str;
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
        this.f12979d = jSONArray;
    }

    public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, int i10, String str2, int i11, double d10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        CampaignEx campaignEx = list.get(i12);
                        campaignEx.setReadyState(0);
                        if (bVar != null) {
                            campaignEx.setNLRid(bVar.f());
                        }
                        campaignEx.setNRid(str);
                        campaignEx.setReasond(str2);
                        campaignEx.setTyped(i10);
                        String b3 = x.b(d10 + "");
                        campaignEx.setNoticeUrl(a(campaignEx.getNoticeUrl(), i11, str, b3));
                        campaignEx.setClickURL(a(campaignEx.getClickURL(), i11, str, b3));
                        campaignEx.setImpressionURL(a(campaignEx.getImpressionURL(), i11, str, b3));
                        campaignEx.setOnlyImpressionURL(a(campaignEx.getOnlyImpressionURL(), i11, str, b3));
                        campaignEx.setAdvImp(a(campaignEx.getAdvImpList(), i11, str, b3));
                        j nativeVideoTracking = campaignEx.getNativeVideoTracking();
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
                            campaignEx.setNativeVideoTracking(nativeVideoTracking);
                            campaignEx.setNativeVideoTrackingString(CampaignEx.object2TrackingStr(nativeVideoTracking));
                        }
                        campaignEx.setPv_urls(b(campaignEx.getPv_urls(), i11, str, b3));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final c a() {
        JSONArray jSONArray;
        c cVar = new c();
        try {
            jSONArray = this.f12979d;
        } catch (Exception unused) {
            cVar.d("checkConfigAndDB exception");
            cVar.a(c.f12993c);
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            if (this.a == null) {
                cVar.d("db error");
                cVar.a(c.f12993c);
                return cVar;
            }
            return cVar;
        }
        cVar.d("setting config is null");
        cVar.a(c.a);
        return cVar;
    }

    public final void a(List<C0167a> list, int i10) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Collections.sort(list, new Comparator<C0167a>() { // from class: com.mbridge.msdk.foundation.b.a.1
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(C0167a c0167a, C0167a c0167a2) {
                            return Double.compare(c0167a.f12982b, c0167a2.f12982b);
                        }
                    });
                    int size = list.size() - i10;
                    if (size > 0) {
                        List<C0167a> subList = list.subList(0, size);
                        if (this.a == null || subList.size() <= 0) {
                            return;
                        }
                        for (int i11 = 0; i11 < subList.size(); i11++) {
                            b bVar = subList.get(i11).a;
                            this.a.a(this.f12981f, bVar.e(), bVar.d());
                            a(f12977b, 1, null, true, bVar.e(), bVar.d(), -1, this.f12981f);
                        }
                    }
                }
            } catch (Exception e2) {
                ad.a(f12978c, e2);
            }
        }
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
            return e.h(sb2, "&real_bp=", str3);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?ca_sce=");
        sb3.append(i10);
        sb3.append("&real_rid=");
        sb3.append(str2);
        return e.h(sb3, "&real_bp=", str3);
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

    public final long a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return 0L;
        }
        String ecppv = list.get(0).getEcppv();
        if (TextUtils.isEmpty(ecppv)) {
            return 0L;
        }
        String a = x.a(ecppv);
        if (TextUtils.isEmpty(a)) {
            return 0L;
        }
        try {
            if (Double.parseDouble(a) <= 0.0d) {
                return 0L;
            }
            JSONObject a10 = a(b(str));
            int optInt = a10 != null ? a10.optInt("max_cache_num", 20) : 20;
            com.mbridge.msdk.foundation.db.c cVar = this.a;
            if (cVar == null || optInt <= 0) {
                return -1L;
            }
            return cVar.a(list, this.f12981f);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    public final void a(String str, String str2, int i10, String str3) {
        try {
            if (this.a == null || TextUtils.isEmpty(str3)) {
                return;
            }
            if (i10 == 1) {
                this.a.a(str2, str, this.f12981f, i10);
                a(f12977b, 3, null, true, str2, str, -1, this.f12981f);
            } else if (i10 == 2) {
                this.a.a(this.f12981f, str2, str);
                a(f12977b, 1, null, true, str2, str, -1, this.f12981f);
            } else if (i10 == 3) {
                this.a.b(str2, str, this.f12981f);
                a(f12977b, 4, null, true, str2, str, -1, this.f12981f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0199 A[Catch: Exception -> 0x01ac, TryCatch #2 {Exception -> 0x01ac, blocks: (B:3:0x0011, B:6:0x002e, B:8:0x0066, B:11:0x0076, B:13:0x007c, B:17:0x0083, B:19:0x008e, B:22:0x0095, B:24:0x009b, B:26:0x00a3, B:29:0x00b3, B:31:0x00fe, B:33:0x0114, B:36:0x011d, B:39:0x0123, B:41:0x0131, B:44:0x0135, B:46:0x0140, B:48:0x0146, B:50:0x014e, B:53:0x0159, B:55:0x016b, B:57:0x0187, B:58:0x018f, B:60:0x0199, B:61:0x019e, B:68:0x0170, B:81:0x0103), top: B:2:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r17, int r18, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.b.a.a(int, int, java.util.List, boolean, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final List<b> a(int i10, long j3) {
        com.mbridge.msdk.foundation.db.c cVar;
        if (i10 >= 0 && (cVar = this.a) != null) {
            cVar.a(this.f12981f, i10);
            a(f12977b, 1, null, true, "", "", i10, this.f12981f);
        }
        com.mbridge.msdk.foundation.db.c cVar2 = this.a;
        if (cVar2 != null) {
            return cVar2.a(this.f12981f, 0, j3);
        }
        return null;
    }
}
