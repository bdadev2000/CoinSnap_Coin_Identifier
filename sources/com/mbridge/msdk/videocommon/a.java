package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19312a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0202a> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19313c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19314d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19315e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19316f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19317g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19318h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19319i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0202a> f19320j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0202a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f19321a;
        private boolean b;

        public final WindVaneWebView a() {
            return this.f19321a;
        }

        public final String b() {
            WindVaneWebView windVaneWebView = this.f19321a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public final boolean c() {
            return this.b;
        }

        public final void a(WindVaneWebView windVaneWebView) {
            this.f19321a = windVaneWebView;
        }

        public final void a(String str) {
            WindVaneWebView windVaneWebView = this.f19321a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public final void a(boolean z8) {
            this.b = z8;
        }
    }

    public static C0202a a(String str) {
        if (f19317g.containsKey(str)) {
            return f19317g.get(str);
        }
        if (f19318h.containsKey(str)) {
            return f19318h.get(str);
        }
        if (f19319i.containsKey(str)) {
            return f19319i.get(str);
        }
        if (f19320j.containsKey(str)) {
            return f19320j.get(str);
        }
        return null;
    }

    public static void b(String str) {
        if (f19317g.containsKey(str)) {
            f19317g.remove(str);
        }
        if (f19319i.containsKey(str)) {
            f19319i.remove(str);
        }
        if (f19318h.containsKey(str)) {
            f19318h.remove(str);
        }
        if (f19320j.containsKey(str)) {
            f19320j.remove(str);
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f19317g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f19317g.remove(str2);
                }
            }
        } else {
            f19317g.clear();
        }
        f19318h.clear();
    }

    public static void d(String str) {
        for (Map.Entry<String, C0202a> entry : f19317g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f19317g.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        for (Map.Entry<String, C0202a> entry : f19318h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f19318h.remove(entry.getKey());
            }
        }
    }

    public static void a(String str, C0202a c0202a, boolean z8, boolean z9) {
        if (z8) {
            if (z9) {
                f19318h.put(str, c0202a);
                return;
            } else {
                f19317g.put(str, c0202a);
                return;
            }
        }
        if (z9) {
            f19320j.put(str, c0202a);
        } else {
            f19319i.put(str, c0202a);
        }
    }

    public static void b(int i9, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i9 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i9 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0202a> concurrentHashMap = b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0202a> concurrentHashMap2 = f19315e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i9 != 287) {
                if (i9 != 288) {
                    ConcurrentHashMap<String, C0202a> concurrentHashMap3 = f19312a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0202a> concurrentHashMap4 = f19314d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0202a> concurrentHashMap5 = f19313c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0202a> concurrentHashMap6 = f19316f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public static void a() {
        f19319i.clear();
        f19320j.clear();
    }

    public static C0202a a(int i9, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i9 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i9 != 94) {
                if (i9 != 287) {
                    if (i9 != 288) {
                        ConcurrentHashMap<String, C0202a> concurrentHashMap = f19312a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f19312a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0202a> concurrentHashMap2 = f19314d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f19314d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0202a> concurrentHashMap3 = f19313c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f19313c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0202a> concurrentHashMap4 = f19316f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f19316f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0202a> concurrentHashMap5 = b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0202a> concurrentHashMap6 = f19315e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f19315e.get(requestIdNotice);
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i9, String str, C0202a c0202a) {
        try {
            if (i9 == 94) {
                if (f19315e == null) {
                    f19315e = new ConcurrentHashMap<>();
                }
                f19315e.put(str, c0202a);
            } else if (i9 == 287) {
                if (f19316f == null) {
                    f19316f = new ConcurrentHashMap<>();
                }
                f19316f.put(str, c0202a);
            } else if (i9 != 288) {
                if (f19312a == null) {
                    f19312a = new ConcurrentHashMap<>();
                }
                f19312a.put(str, c0202a);
            } else {
                if (f19314d == null) {
                    f19314d = new ConcurrentHashMap<>();
                }
                f19314d.put(str, c0202a);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public static void a(int i9, String str, C0202a c0202a) {
        try {
            if (i9 == 94) {
                if (b == null) {
                    b = new ConcurrentHashMap<>();
                }
                b.put(str, c0202a);
            } else {
                if (i9 != 287) {
                    return;
                }
                if (f19313c == null) {
                    f19313c = new ConcurrentHashMap<>();
                }
                f19313c.put(str, c0202a);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
