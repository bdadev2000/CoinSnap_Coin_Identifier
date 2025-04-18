package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class a {
    private static ConcurrentHashMap<String, C0214a> a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16324b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16325c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16326d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16327e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16328f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16329g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16330h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16331i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0214a> f16332j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0214a {
        private WindVaneWebView a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16333b;

        public final WindVaneWebView a() {
            return this.a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.f16333b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z10) {
            this.f16333b = z10;
        }
    }

    public static C0214a a(String str) {
        if (f16329g.containsKey(str)) {
            return f16329g.get(str);
        }
        if (f16330h.containsKey(str)) {
            return f16330h.get(str);
        }
        if (f16331i.containsKey(str)) {
            return f16331i.get(str);
        }
        if (f16332j.containsKey(str)) {
            return f16332j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f16329g.containsKey(str)) {
            f16329g.remove(str);
        }
        if (f16331i.containsKey(str)) {
            f16331i.remove(str);
        }
        if (f16330h.containsKey(str)) {
            f16330h.remove(str);
        }
        if (f16332j.containsKey(str)) {
            f16332j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f16329g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f16329g.remove(str2);
                }
            }
        } else {
            f16329g.clear();
        }
        f16330h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0214a> entry : f16329g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f16329g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0214a> entry : f16330h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f16330h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0214a c0214a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f16330h.put(str, c0214a);
                return;
            } else {
                f16329g.put(str, c0214a);
                return;
            }
        }
        if (z11) {
            f16332j.put(str, c0214a);
        } else {
            f16331i.put(str, c0214a);
        }
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0214a> concurrentHashMap = f16324b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0214a> concurrentHashMap2 = f16327e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0214a> concurrentHashMap3 = a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0214a> concurrentHashMap4 = f16326d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0214a> concurrentHashMap5 = f16325c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0214a> concurrentHashMap6 = f16328f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        f16331i.clear();
        f16332j.clear();
    }

    public static C0214a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0214a> concurrentHashMap = a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0214a> concurrentHashMap2 = f16326d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f16326d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0214a> concurrentHashMap3 = f16325c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f16325c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0214a> concurrentHashMap4 = f16328f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f16328f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0214a> concurrentHashMap5 = f16324b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f16324b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0214a> concurrentHashMap6 = f16327e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f16327e.get(requestIdNotice);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0214a c0214a) {
        try {
            if (i10 == 94) {
                if (f16327e == null) {
                    f16327e = new ConcurrentHashMap<>();
                }
                f16327e.put(str, c0214a);
            } else if (i10 == 287) {
                if (f16328f == null) {
                    f16328f = new ConcurrentHashMap<>();
                }
                f16328f.put(str, c0214a);
            } else if (i10 != 288) {
                if (a == null) {
                    a = new ConcurrentHashMap<>();
                }
                a.put(str, c0214a);
            } else {
                if (f16326d == null) {
                    f16326d = new ConcurrentHashMap<>();
                }
                f16326d.put(str, c0214a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0214a c0214a) {
        try {
            if (i10 == 94) {
                if (f16324b == null) {
                    f16324b = new ConcurrentHashMap<>();
                }
                f16324b.put(str, c0214a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f16325c == null) {
                    f16325c = new ConcurrentHashMap<>();
                }
                f16325c.put(str, c0214a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
