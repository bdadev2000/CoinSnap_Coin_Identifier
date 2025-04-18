package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class i {
    private com.mbridge.msdk.videocommon.listener.a a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f16423b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f16424c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16425d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f16426e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16427f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f16428g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f16429h;

    public i(List<CampaignEx> list, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f16428g = copyOnWriteArrayList;
        this.f16429h = new ConcurrentHashMap<>();
        this.f16424c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f16425d = str;
        this.f16427f = i10;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    private String b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.e();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f16425d + " getVideoTemplateUrl error", e2);
            }
        }
        return "";
    }

    private com.mbridge.msdk.videocommon.download.a c(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar = null;
        try {
            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f16424c, campaignEx, this.f16425d, f());
            try {
                aVar2.a(campaignEx);
                aVar2.d(this.f16427f);
                aVar2.c(f(campaignEx));
                aVar2.b(e());
                aVar2.e(d(campaignEx));
                aVar2.a((c) null);
                aVar2.a(new a(this.f16425d, this.f16423b, this.a));
                return aVar2;
            } catch (Exception e2) {
                e = e2;
                aVar = aVar2;
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.f16425d + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return aVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            ad.a("RewardVideoRefactorManager", this.f16425d + " getVideoCtnType error " + e2.getMessage());
            return 1;
        }
    }

    private boolean e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.a("RewardVideoRefactorManager", this.f16425d + " isPlayerAbleAds error:" + th2.getMessage());
            return false;
        }
    }

    private int f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return g();
    }

    private int g() {
        try {
            return c(this.f16425d).r();
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f16425d + " getRewardReadyRate error:" + th2.getMessage());
                return 100;
            }
            return 100;
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.a = aVar;
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.f16423b == null) {
            this.f16423b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f16423b.put(str, aVar);
    }

    private int f() {
        if (TextUtils.isEmpty(this.f16425d)) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.d.c c10 = c(this.f16425d);
            if (c10 != null) {
                return c10.w();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f16425d + " getDlnet error " + e2.getMessage());
            }
        }
        return 1;
    }

    private int e() {
        com.mbridge.msdk.videocommon.d.c c10 = c(this.f16425d);
        if (c10 == null) {
            return 0;
        }
        try {
            return c10.s();
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            ad.a("RewardVideoRefactorManager", this.f16425d + " getCDRate error " + e2.getMessage());
            return 0;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f16428g.addAll(list);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoRefactorManager", this.f16425d + " update error", e2);
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> d() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f16429h);
            return copyOnWriteArrayList;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f16425d + " getCampaignDownLoadTaskList error:" + e2.getMessage());
            return null;
        }
    }

    public final com.mbridge.msdk.videocommon.download.a b() {
        List<com.mbridge.msdk.videocommon.download.a> list;
        if (this.f16428g.size() == 0) {
            ad.a("RewardVideoRefactorManager", this.f16425d + " isReady campaignExes is null");
            return null;
        }
        try {
            list = a((List<CampaignEx>) this.f16428g, false);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f16425d + " isReady error", e2);
            }
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public i(CampaignEx campaignEx, String str, int i10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f16428g = copyOnWriteArrayList;
        this.f16429h = new ConcurrentHashMap<>();
        this.f16424c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f16425d = str;
        this.f16427f = i10;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a implements com.mbridge.msdk.videocommon.listener.a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f16430b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f16431c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.a = str;
            this.f16430b = concurrentHashMap;
            this.f16431c = aVar;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f16431c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadDone error: " + e2.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f16430b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadDone error: " + e10.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f16431c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadFailed error: " + e2.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.f16430b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.a + " videoDownloadListener onDownLoadFailed error: " + e10.getMessage());
                        }
                    }
                }
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f16428g.add(campaignEx);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoRefactorManager", this.f16425d + " update error", e2);
                }
            }
        }
    }

    public final void a() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f16428g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null) {
                    try {
                        String str = next.getRequestId() + next.getId() + next.getVideoUrlEncode();
                        if (!this.f16429h.containsKey(str)) {
                            a(next, str, (com.mbridge.msdk.videocommon.download.a) null);
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f16425d + " handlerCampaignLoadEvent error", e2);
                        }
                    }
                }
            }
            return;
        }
        ad.a("RewardVideoRefactorManager", this.f16425d + " load campaignExes is null");
    }

    private com.mbridge.msdk.videocommon.d.c c(String str) {
        try {
            if (this.f16426e == null) {
                this.f16426e = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, this.f16427f == 287);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f16425d + " getRewardUnitSetting error " + e2.getMessage());
            }
        }
        return this.f16426e;
    }

    public final void b(String str) {
        com.mbridge.msdk.videocommon.download.a remove;
        CampaignEx l10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.f16429h.containsKey(str) || (remove = this.f16429h.remove(str)) == null || (l10 = remove.l()) == null) {
                return;
            }
            this.f16428g.remove(l10);
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f16425d + " removeCampaignDownloadTask campaign name: " + l10.getAppName());
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f16425d + " removeCampaignDownloadTask error:" + e2.getMessage());
            }
        }
    }

    public final com.mbridge.msdk.videocommon.download.a c() {
        try {
            return b();
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f16425d + " getCampaignDownLoadTask error:" + th2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:15|16|17|18|(18:20|(4:129|(3:164|165|(1:167))|131|(6:135|(1:(2:141|(5:145|(2:147|148)|149|(1:(3:152|(1:158)(1:156)|157)(3:159|160|(1:162)))|148))(1:140))|163|149|(0)|148))|24|25|26|(1:116)(1:30)|(3:33|34|35)|81|(4:83|(2:113|(9:88|(3:91|92|93)|41|(5:47|48|(1:50)|51|(1:79)(9:53|54|(1:56)|57|(1:59)(1:78)|60|(2:62|(1:(2:65|(2:67|(1:69)(1:73))(1:74))(1:75))(1:76))(1:77)|70|71))|80|48|(0)|51|(0)(0)))|86|(0))|114|(3:91|92|93)|41|(5:47|48|(0)|51|(0)(0))|80|48|(0)|51|(0)(0))|172|25|26|(1:28)|116|(3:33|34|35)|81|(0)|114|(0)|41|(0)|80|48|(0)|51|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00ab, code lost:
    
        if (r7.getRsIgnoreCheckRule().contains(0) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("RewardVideoRefactorManager", r18.f16425d + " checkResourceReadyState error", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ba A[Catch: Exception -> 0x0360, TryCatch #1 {Exception -> 0x0360, blocks: (B:11:0x002d, B:38:0x01b6, B:40:0x01ba, B:41:0x01d0, B:48:0x01e0, B:50:0x01e5, B:51:0x01e8, B:54:0x01ec, B:56:0x01f2, B:57:0x01f7, B:60:0x025f, B:70:0x030b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e5 A[Catch: Exception -> 0x0360, TryCatch #1 {Exception -> 0x0360, blocks: (B:11:0x002d, B:38:0x01b6, B:40:0x01ba, B:41:0x01d0, B:48:0x01e0, B:50:0x01e5, B:51:0x01e8, B:54:0x01ec, B:56:0x01f2, B:57:0x01f7, B:60:0x025f, B:70:0x030b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154 A[Catch: Exception -> 0x01ae, TryCatch #3 {Exception -> 0x01ae, blocks: (B:35:0x014b, B:81:0x014e, B:83:0x0154, B:96:0x015f, B:99:0x0166, B:102:0x016d, B:104:0x0173, B:106:0x017d, B:109:0x018d, B:111:0x0193), top: B:34:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.util.List, boolean):java.util.List");
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a c10 = c(campaignEx);
        c10.n();
        this.f16429h.put(str, c10);
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.videocommon.download.a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "RewardVideoRefactorManager"
            r1 = 0
            if (r7 == 0) goto Lce
            if (r8 != 0) goto L9
            goto Lce
        L9:
            boolean r8 = r8.b()     // Catch: java.lang.Throwable -> Lac
            r2 = 1
            if (r8 == 0) goto L27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r6.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r5.f16425d     // Catch: java.lang.Throwable -> Lac
            r6.append(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = " checkEndCardZipOrSourceDownLoad endCard download success"
            r6.append(r7)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lac
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)     // Catch: java.lang.Throwable -> Lac
            return r2
        L27:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            r3 = 2
            if (r8 == 0) goto L47
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Lac
            if (r8 <= 0) goto L47
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lac
            boolean r8 = r8.contains(r4)     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L47
            return r2
        L47:
            boolean r8 = r7.isDynamicView()     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L54
            boolean r8 = com.mbridge.msdk.foundation.tools.ai.l(r6)     // Catch: java.lang.Throwable -> Lac
            if (r8 != 0) goto L54
            return r2
        L54:
            boolean r8 = com.mbridge.msdk.foundation.tools.an.a(r6)     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L5b
            return r2
        L5b:
            boolean r8 = r7.isMraid()     // Catch: java.lang.Throwable -> Lac
            if (r8 != 0) goto La8
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L68
            goto La8
        L68:
            int r8 = r7.getLoadTimeoutState()     // Catch: java.lang.Throwable -> Lac
            if (r8 != r2) goto L75
            boolean r8 = r5.e(r7)     // Catch: java.lang.Throwable -> Lac
            if (r8 != 0) goto L75
            goto La8
        L75:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L94
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Lac
            if (r8 <= 0) goto L94
            java.util.ArrayList r7 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r7.contains(r8)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L94
            goto La8
        L94:
            java.lang.String r7 = com.mbridge.msdk.videocommon.download.f.a(r6)     // Catch: java.lang.Throwable -> Lac
            boolean r7 = com.mbridge.msdk.foundation.tools.an.b(r7)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L9f
            goto La8
        L9f:
            java.lang.String r6 = com.mbridge.msdk.videocommon.download.f.b(r6)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = com.mbridge.msdk.foundation.tools.an.b(r6)     // Catch: java.lang.Throwable -> Lac
            goto La9
        La8:
            r6 = r2
        La9:
            if (r6 == 0) goto Lce
            return r2
        Lac:
            r6 = move-exception
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto Lce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f16425d
            r7.append(r8)
            java.lang.String r8 = " checkEndCardDownload error "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.videocommon.download.a):boolean");
    }

    public final com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f16429h.containsKey(str)) {
            return this.f16429h.get(str);
        }
        return null;
    }
}
