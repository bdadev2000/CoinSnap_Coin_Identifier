package com.mbridge.msdk.foundation.same.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.c;
import com.mbridge.msdk.foundation.entity.d;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, c>> f13299d = null;

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f13300e = null;

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f13301f = null;

    /* renamed from: n, reason: collision with root package name */
    private static final String f13309n = "b";
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13297b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13298c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13302g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13303h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13304i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13305j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, Long> f13306k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13307l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f13308m = new HashMap();

    public static void a(String str, String str2, String str3, long j3, long j10, long j11) {
        if (f13299d == null) {
            f13299d = new ConcurrentHashMap<>();
        }
        try {
            if (f13299d.containsKey(str)) {
                ConcurrentHashMap<String, c> concurrentHashMap = f13299d.get(str);
                if (concurrentHashMap != null) {
                    c cVar = concurrentHashMap.get(str2);
                    if (cVar == null) {
                        c cVar2 = new c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        cVar2.a(arrayList);
                        cVar2.a(j3);
                        cVar2.b(j10);
                        cVar2.c(j11);
                        concurrentHashMap.put(str2, cVar2);
                        return;
                    }
                    if (cVar.c() != null) {
                        cVar.a(j3);
                        cVar.b(j10);
                        cVar.c(j11);
                        cVar.c().add(str3);
                        return;
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str3);
            ConcurrentHashMap<String, c> concurrentHashMap2 = new ConcurrentHashMap<>();
            c cVar3 = new c();
            cVar3.a(arrayList2);
            cVar3.a(j3);
            cVar3.b(j10);
            cVar3.c(j11);
            concurrentHashMap2.put(str2, cVar3);
            f13299d.put(str, concurrentHashMap2);
        } catch (Throwable th2) {
            ad.b(f13309n, th2.getMessage());
        }
    }

    public static String b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f13301f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f13301f.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f13299d) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f13299d.remove(str);
            return;
        }
        ConcurrentHashMap<String, c> concurrentHashMap2 = f13299d.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2)) {
            return;
        }
        concurrentHashMap2.remove(str2);
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    c10 = 1;
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c10 = 2;
                    break;
                }
                break;
            case -895866265:
                if (str.equals("splash")) {
                    c10 = 3;
                    break;
                }
                break;
            case 538816457:
                if (str.equals("h5_native")) {
                    c10 = 4;
                    break;
                }
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1844104930:
                if (str.equals("interactive")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f13297b;
            case 1:
                return f13304i;
            case 2:
                return f13305j;
            case 3:
                return f13307l;
            case 4:
                return f13298c;
            case 5:
                return f13303h;
            case 6:
                return f13302g;
            default:
                return null;
        }
    }

    public static d b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        d dVar = new d();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return dVar;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f13300e;
            if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f13300e.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                dVar.a(1);
                dVar.c(concurrentHashMap.get(str2));
            }
        } catch (Exception e2) {
            ad.a(f13309n, e2.getMessage());
        }
        return dVar;
    }

    public static void c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f13301f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f13301f.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    public static void d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f13300e;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f13300e.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e2) {
            ad.a(f13309n, e2.getMessage());
        }
    }

    public static void a(String str, String str2, int i10) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f13301f == null) {
            f13301f = new ConcurrentHashMap<>();
        }
        try {
            if (f13301f.containsKey(str)) {
                copyOnWriteArrayList = f13301f.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f13301f.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i10;
            if (size >= 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    copyOnWriteArrayList.remove(i11);
                }
            }
        } catch (Exception e2) {
            ad.a(f13309n, e2.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f13300e == null) {
                f13300e = new ConcurrentHashMap<>();
            }
            if (f13300e.containsKey(str)) {
                if (f13300e.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f13300e.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f13300e.put(str, concurrentHashMap2);
        } catch (Exception e2) {
            ad.a(f13309n, e2.getMessage());
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d10;
        List<com.mbridge.msdk.foundation.same.d.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f13304i.containsKey(str)) {
                d10 = f13304i;
            } else if (f13305j.containsKey(str)) {
                d10 = f13305j;
            } else if (f13302g.containsKey(str)) {
                d10 = f13302g;
            } else if (f13308m.containsKey(str)) {
                d10 = f13308m;
            } else if (f13303h.containsKey(str)) {
                d10 = f13303h;
            } else if (f13297b.containsKey(str)) {
                d10 = f13297b;
            } else if (f13307l.containsKey(str)) {
                d10 = f13307l;
            } else {
                d10 = f13298c.containsKey(str) ? f13298c : null;
            }
        } else {
            d10 = d(str2);
        }
        if (d10 != null) {
            try {
                if (an.b(str) && d10.containsKey(str) && (list = d10.get(str)) != null && list.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(MBridgeConstans.API_REUQEST_CATEGORY_APP, list.get(i10).a());
                        jSONObject.put("1", list.get(i10).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public static ConcurrentHashMap<String, c> a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap = f13299d;
        if (concurrentHashMap == null) {
            e a10 = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            if (a10 != null) {
                a10.d(str, "");
                f13299d = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f13299d.get(str);
        }
        return null;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d10 = d(str2);
        if (campaignEx == null || d10 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.d.a aVar = new com.mbridge.msdk.foundation.same.d.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (d10.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.d.a> list = d10.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            d10.put(str, arrayList);
        } catch (Throwable th2) {
            ad.b(f13309n, th2.getMessage(), th2);
        }
    }
}
