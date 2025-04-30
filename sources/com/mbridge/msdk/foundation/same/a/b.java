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

/* loaded from: classes3.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, c>> f15703d = null;

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f15704e = null;

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f15705f = null;

    /* renamed from: n, reason: collision with root package name */
    private static final String f15711n = "b";

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15701a = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15702c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15706g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15707h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15708i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> f15709j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static Map<String, Long> f15710k = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> l = new HashMap();
    public static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> m = new HashMap();

    public static void a(String str, String str2, String str3, long j7, long j9, long j10) {
        if (f15703d == null) {
            f15703d = new ConcurrentHashMap<>();
        }
        try {
            if (f15703d.containsKey(str)) {
                ConcurrentHashMap<String, c> concurrentHashMap = f15703d.get(str);
                if (concurrentHashMap != null) {
                    c cVar = concurrentHashMap.get(str2);
                    if (cVar == null) {
                        c cVar2 = new c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        cVar2.a(arrayList);
                        cVar2.a(j7);
                        cVar2.b(j9);
                        cVar2.c(j10);
                        concurrentHashMap.put(str2, cVar2);
                        return;
                    }
                    if (cVar.c() != null) {
                        cVar.a(j7);
                        cVar.b(j9);
                        cVar.c(j10);
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
            cVar3.a(j7);
            cVar3.b(j9);
            cVar3.c(j10);
            concurrentHashMap2.put(str2, cVar3);
            f15703d.put(str, concurrentHashMap2);
        } catch (Throwable th) {
            ad.b(f15711n, th.getMessage());
        }
    }

    public static String b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f15705f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f15705f.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    public static void c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f15703d) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f15703d.remove(str);
            return;
        }
        ConcurrentHashMap<String, c> concurrentHashMap2 = f15703d.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2)) {
            return;
        }
        concurrentHashMap2.remove(str2);
    }

    private static Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    c9 = 1;
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c9 = 2;
                    break;
                }
                break;
            case -895866265:
                if (str.equals("splash")) {
                    c9 = 3;
                    break;
                }
                break;
            case 538816457:
                if (str.equals("h5_native")) {
                    c9 = 4;
                    break;
                }
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c9 = 5;
                    break;
                }
                break;
            case 1844104930:
                if (str.equals("interactive")) {
                    c9 = 6;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                return b;
            case 1:
                return f15708i;
            case 2:
                return f15709j;
            case 3:
                return l;
            case 4:
                return f15702c;
            case 5:
                return f15707h;
            case 6:
                return f15706g;
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
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f15704e;
            if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f15704e.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                dVar.a(1);
                dVar.c(concurrentHashMap.get(str2));
            }
        } catch (Exception e4) {
            ad.a(f15711n, e4.getMessage());
        }
        return dVar;
    }

    public static void c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f15705f) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f15705f.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
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
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f15704e;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f15704e.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e4) {
            ad.a(f15711n, e4.getMessage());
        }
    }

    public static void a(String str, String str2, int i9) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f15705f == null) {
            f15705f = new ConcurrentHashMap<>();
        }
        try {
            if (f15705f.containsKey(str)) {
                copyOnWriteArrayList = f15705f.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f15705f.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i9;
            if (size >= 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    copyOnWriteArrayList.remove(i10);
                }
            }
        } catch (Exception e4) {
            ad.a(f15711n, e4.getMessage());
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f15704e == null) {
                f15704e = new ConcurrentHashMap<>();
            }
            if (f15704e.containsKey(str)) {
                if (f15704e.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f15704e.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f15704e.put(str, concurrentHashMap2);
        } catch (Exception e4) {
            ad.a(f15711n, e4.getMessage());
        }
    }

    public static String a(String str, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d2;
        List<com.mbridge.msdk.foundation.same.d.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            if (f15708i.containsKey(str)) {
                d2 = f15708i;
            } else if (f15709j.containsKey(str)) {
                d2 = f15709j;
            } else if (f15706g.containsKey(str)) {
                d2 = f15706g;
            } else if (m.containsKey(str)) {
                d2 = m;
            } else if (f15707h.containsKey(str)) {
                d2 = f15707h;
            } else if (b.containsKey(str)) {
                d2 = b;
            } else if (l.containsKey(str)) {
                d2 = l;
            } else {
                d2 = f15702c.containsKey(str) ? f15702c : null;
            }
        } else {
            d2 = d(str2);
        }
        if (d2 != null) {
            try {
                if (an.b(str) && d2.containsKey(str) && (list = d2.get(str)) != null && list.size() > 0) {
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(MBridgeConstans.API_REUQEST_CATEGORY_APP, list.get(i9).a());
                        jSONObject.put("1", list.get(i9).c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public static ConcurrentHashMap<String, c> a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, c>> concurrentHashMap = f15703d;
        if (concurrentHashMap == null) {
            e a6 = e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            if (a6 != null) {
                a6.d(str, "");
                f15703d = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f15703d.get(str);
        }
        return null;
    }

    public static void a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<com.mbridge.msdk.foundation.same.d.a>> d2 = d(str2);
        if (campaignEx == null || d2 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            com.mbridge.msdk.foundation.same.d.a aVar = new com.mbridge.msdk.foundation.same.d.a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (d2.containsKey(str)) {
                List<com.mbridge.msdk.foundation.same.d.a> list = d2.get(str);
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
            d2.put(str, arrayList);
        } catch (Throwable th) {
            ad.b(f15711n, th.getMessage(), th);
        }
    }
}
