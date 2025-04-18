package com.mbridge.msdk.videocommon.d;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ad;
import eb.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile b f16356d;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f16357c = false;

    /* renamed from: e, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f16358e = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f16355b = new ConcurrentHashMap<>();
    public static a a = null;

    private b() {
    }

    private void h(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, e.e("alert url is exception ,url:", str));
        } else {
            H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.d.b(true), str, new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.videocommon.d.b.1
                @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                public final void onFailed(String str3, String str4) {
                    i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 2, str4);
                }

                @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                public final void onSuccess(String str3, String str4, boolean z10) {
                    i.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, 1, "");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.d.c a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reward_"
            java.lang.String r1 = "_"
            java.lang.String r0 = eb.j.l(r0, r5, r1, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f16355b
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L2e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f16355b     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L1e
            com.mbridge.msdk.videocommon.d.c r0 = (com.mbridge.msdk.videocommon.d.c) r0     // Catch: java.lang.Exception -> L1e
            boolean r1 = r4.a(r0)     // Catch: java.lang.Exception -> L1f
            goto L20
        L1e:
            r0 = r2
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L2d
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r4.a(r5, r1, r6, r2)
        L2d:
            return r0
        L2e:
            com.mbridge.msdk.foundation.a.a.a r1 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.d.c r1 = com.mbridge.msdk.videocommon.d.c.c(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L4c
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
            return r2
        L4c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r5 = com.mbridge.msdk.videocommon.d.b.f16355b
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.a(java.lang.String, java.lang.String):com.mbridge.msdk.videocommon.d.c");
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f16358e.remove(str);
        } catch (Exception unused) {
        }
    }

    public final void c(String str, String str2) {
        com.mbridge.msdk.foundation.a.a.a.a().a(e.e("reward_", str), str2);
        a = a.a(str2);
    }

    public final boolean d() {
        return this.f16357c;
    }

    public final String e(String str, String str2) {
        return com.mbridge.msdk.foundation.a.a.a.a().a(j.l("reward_", str, "_", str2));
    }

    public final c f(String str, String str2) {
        String l10 = j.l("reward_", str, "_", str2);
        if (f16355b.containsKey(l10)) {
            return f16355b.get(l10);
        }
        c c10 = c.c(com.mbridge.msdk.foundation.a.a.a.a().a(l10));
        if (c10 != null) {
            f16355b.put(l10, c10);
        }
        return c10;
    }

    public final String g(String str) {
        return com.mbridge.msdk.foundation.a.a.a.a().a(e.e("reward_", str));
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f16358e.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.d.a b() {
        /*
            r7 = this;
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.d.b.a
            if (r0 != 0) goto L74
            com.mbridge.msdk.foundation.a.a.a r0 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "reward_"
            r1.<init>(r2)
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r2 = r2.k()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.a(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L5d
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.d.a.a(r0)
            if (r0 == 0) goto L41
            long r1 = r0.d()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.i()
            long r5 = r5 + r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L41
            r1 = 0
            goto L42
        L41:
            r1 = 1
        L42:
            if (r1 != 0) goto L45
            return r0
        L45:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r7.g(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.c()
            return r0
        L5d:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.k()
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.b()
            r7.g(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.c()
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.b():com.mbridge.msdk.videocommon.d.a");
    }

    public final void d(String str, String str2) {
        try {
            String a10 = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a10);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            ad.b("RewardSettingManager", th2.getMessage());
        }
    }

    private void g(String str, String str2) {
        if (this.f16357c) {
            return;
        }
        this.f16357c = true;
        new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2);
    }

    public final a c() {
        a aVar = new a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new com.mbridge.msdk.videocommon.b.c("Virtual Item", 1));
        aVar.a(hashMap);
        aVar.b(hashMap2);
        aVar.a(43200L);
        aVar.b(5400L);
        aVar.c(3600L);
        aVar.d(3600L);
        aVar.e(5L);
        aVar.a(1);
        return aVar;
    }

    public static boolean e(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
                if (optJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(optString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void f(String str) {
        try {
            String a10 = com.mbridge.msdk.foundation.a.a.a.a().a("reward_" + str);
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a10);
            jSONObject.put("current_time", System.currentTimeMillis());
            c(str, jSONObject.toString());
        } catch (Throwable th2) {
            ad.b("RewardSettingManager", th2.getMessage());
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    public final a e() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.m().k();
        if (a == null) {
            String a10 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
            if (!TextUtils.isEmpty(a10)) {
                a a11 = a.a(a10);
                if (a11 != null) {
                    a = a11;
                }
                return a11;
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.d.c a(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "reward_"
            java.lang.String r1 = "_"
            java.lang.String r0 = eb.j.l(r0, r5, r1, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r1 = com.mbridge.msdk.videocommon.d.b.f16355b
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L2e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r7 = com.mbridge.msdk.videocommon.d.b.f16355b     // Catch: java.lang.Exception -> L1e
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1e
            com.mbridge.msdk.videocommon.d.c r7 = (com.mbridge.msdk.videocommon.d.c) r7     // Catch: java.lang.Exception -> L1e
            boolean r0 = r4.a(r7)     // Catch: java.lang.Exception -> L1f
            goto L20
        L1e:
            r7 = r2
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L2d
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
        L2d:
            return r7
        L2e:
            com.mbridge.msdk.foundation.a.a.a r1 = com.mbridge.msdk.foundation.a.a.a.a()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.d.c r1 = com.mbridge.msdk.videocommon.d.c.c(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L53
            if (r1 != 0) goto L52
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.b()
            r4.a(r5, r0, r6, r2)
            com.mbridge.msdk.videocommon.d.c r5 = r4.b(r7)
            return r5
        L52:
            return r1
        L53:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.d.c> r5 = com.mbridge.msdk.videocommon.d.b.f16355b
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.d.b.a(java.lang.String, java.lang.String, boolean):com.mbridge.msdk.videocommon.d.c");
    }

    public final c b(boolean z10) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.b.b(1, 30, null));
            cVar.a((List<com.mbridge.msdk.videocommon.b.b>) arrayList);
            cVar.m(1);
            cVar.l(1);
            cVar.n(1);
            cVar.q(1);
            cVar.o(1);
            cVar.p(1);
            cVar.h(3);
            cVar.i(80);
            cVar.j(100);
            cVar.k(0);
            cVar.g(2);
            cVar.e(-1);
            cVar.x(70);
            cVar.d(2);
            if (z10) {
                cVar.c(5);
            } else {
                cVar.c(-1);
            }
            cVar.b(0);
            cVar.a(0);
            cVar.f(1);
            cVar.r(1);
            cVar.t(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.u(1);
            cVar.v(1);
            cVar.w(60);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, false);
        String str2 = c.a;
        if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        h(str2, str);
    }

    public final void a(String str, String str2, String str3) {
        String l10 = j.l("reward_", str, "_", str2);
        com.mbridge.msdk.foundation.a.a.a.a().a(l10, str3);
        f16355b.put(l10, c.c(str3));
        if (com.mbridge.msdk.e.b.a() || TextUtils.isEmpty(c.a)) {
            return;
        }
        h(c.a, str2);
    }

    public static b a() {
        if (f16356d == null) {
            synchronized (b.class) {
                if (f16356d == null) {
                    f16356d = new b();
                }
            }
        }
        return f16356d;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f16358e.add(str);
        } catch (Exception unused) {
        }
    }

    public final void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.c.c cVar) {
        if (!TextUtils.isEmpty(str3) && !this.f16358e.contains(str3)) {
            a(str3);
            new com.mbridge.msdk.videocommon.c.a().a(com.mbridge.msdk.foundation.controller.c.m().c(), str, str2, str3, cVar);
            return;
        }
        ad.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
    }

    private final boolean a(c cVar) {
        a b3 = b();
        if (b3 == null || cVar == null) {
            return true;
        }
        return cVar.x() + b3.e() <= System.currentTimeMillis();
    }

    public final void a(boolean z10) {
        this.f16357c = z10;
    }
}
