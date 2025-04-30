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

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f19458a;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19459c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19460d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f19461e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19462f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<CampaignEx> f19463g;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.download.a> f19464h;

    public i(List<CampaignEx> list, String str, int i9) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f19463g = copyOnWriteArrayList;
        this.f19464h = new ConcurrentHashMap<>();
        this.f19459c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f19460d = str;
        this.f19462f = i9;
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
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f19460d + " getVideoTemplateUrl error", e4);
            }
        }
        return "";
    }

    private com.mbridge.msdk.videocommon.download.a c(CampaignEx campaignEx) {
        com.mbridge.msdk.videocommon.download.a aVar = null;
        try {
            com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.f19459c, campaignEx, this.f19460d, f());
            try {
                aVar2.a(campaignEx);
                aVar2.d(this.f19462f);
                aVar2.c(f(campaignEx));
                aVar2.b(e());
                aVar2.e(d(campaignEx));
                aVar2.a((c) null);
                aVar2.a(new a(this.f19460d, this.b, this.f19458a));
                return aVar2;
            } catch (Exception e4) {
                e = e4;
                aVar = aVar2;
                if (MBridgeConstans.DEBUG) {
                    ad.a("RewardVideoRefactorManager", this.f19460d + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return aVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            ad.a("RewardVideoRefactorManager", this.f19460d + " getVideoCtnType error " + e4.getMessage());
            return 1;
        }
    }

    private boolean e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.a("RewardVideoRefactorManager", this.f19460d + " isPlayerAbleAds error:" + th.getMessage());
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
            return c(this.f19460d).r();
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f19460d + " getRewardReadyRate error:" + th.getMessage());
                return 100;
            }
            return 100;
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f19458a = aVar;
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        if (this.b == null) {
            this.b = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.b.put(str, aVar);
    }

    private int f() {
        if (TextUtils.isEmpty(this.f19460d)) {
            return 1;
        }
        try {
            com.mbridge.msdk.videocommon.d.c c9 = c(this.f19460d);
            if (c9 != null) {
                return c9.w();
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f19460d + " getDlnet error " + e4.getMessage());
            }
        }
        return 1;
    }

    private int e() {
        com.mbridge.msdk.videocommon.d.c c9 = c(this.f19460d);
        if (c9 == null) {
            return 0;
        }
        try {
            return c9.s();
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            ad.a("RewardVideoRefactorManager", this.f19460d + " getCDRate error " + e4.getMessage());
            return 0;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f19463g.addAll(list);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoRefactorManager", this.f19460d + " update error", e4);
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> d() {
        try {
            CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f19464h);
            return copyOnWriteArrayList;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f19460d + " getCampaignDownLoadTaskList error:" + e4.getMessage());
            return null;
        }
    }

    public i(CampaignEx campaignEx, String str, int i9) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f19463g = copyOnWriteArrayList;
        this.f19464h = new ConcurrentHashMap<>();
        this.f19459c = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f19460d = str;
        this.f19462f = i9;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public final com.mbridge.msdk.videocommon.download.a b() {
        List<com.mbridge.msdk.videocommon.download.a> list;
        if (this.f19463g.size() == 0) {
            ad.a("RewardVideoRefactorManager", this.f19460d + " isReady campaignExes is null");
            return null;
        }
        try {
            list = a((List<CampaignEx>) this.f19463g, false);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f19460d + " isReady error", e4);
            }
            list = null;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    /* loaded from: classes3.dex */
    public static final class a implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f19465a;
        private final ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.listener.a f19466c;

        public a(String str, ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap, com.mbridge.msdk.videocommon.listener.a aVar) {
            this.f19465a = str;
            this.b = concurrentHashMap;
            this.f19466c = aVar;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f19466c;
            if (aVar != null) {
                try {
                    aVar.a(str);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f19465a + " videoDownloadListener onDownLoadDone error: " + e4.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f19465a + " videoDownloadListener onDownLoadDone error: " + e9.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f19466c;
            if (aVar != null) {
                try {
                    aVar.a(str, str2);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoRefactorManager", this.f19465a + " videoDownloadListener onDownLoadFailed error: " + e4.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.b;
            if (concurrentHashMap != null) {
                Iterator<com.mbridge.msdk.videocommon.listener.a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().a(str, str2);
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f19465a + " videoDownloadListener onDownLoadFailed error: " + e9.getMessage());
                        }
                    }
                }
            }
        }
    }

    public final void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f19463g.add(campaignEx);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoRefactorManager", this.f19460d + " update error", e4);
                }
            }
        }
    }

    public final void a() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f19463g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null) {
                    try {
                        String str = next.getRequestId() + next.getId() + next.getVideoUrlEncode();
                        if (!this.f19464h.containsKey(str)) {
                            a(next, str, (com.mbridge.msdk.videocommon.download.a) null);
                        }
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoRefactorManager", this.f19460d + " handlerCampaignLoadEvent error", e4);
                        }
                    }
                }
            }
            return;
        }
        ad.a("RewardVideoRefactorManager", this.f19460d + " load campaignExes is null");
    }

    private com.mbridge.msdk.videocommon.d.c c(String str) {
        try {
            if (this.f19461e == null) {
                this.f19461e = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, this.f19462f == 287);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f19460d + " getRewardUnitSetting error " + e4.getMessage());
            }
        }
        return this.f19461e;
    }

    public final void b(String str) {
        com.mbridge.msdk.videocommon.download.a remove;
        CampaignEx l;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!this.f19464h.containsKey(str) || (remove = this.f19464h.remove(str)) == null || (l = remove.l()) == null) {
                return;
            }
            this.f19463g.remove(l);
            if (MBridgeConstans.DEBUG) {
                ad.a("RewardVideoRefactorManager", this.f19460d + " removeCampaignDownloadTask campaign name: " + l.getAppName());
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoRefactorManager", this.f19460d + " removeCampaignDownloadTask error:" + e4.getMessage());
            }
        }
    }

    public final com.mbridge.msdk.videocommon.download.a c() {
        try {
            return b();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("RewardVideoRefactorManager", this.f19460d + " getCampaignDownLoadTask error:" + th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:15|16|17|18|(2:20|(4:32|(3:155|156|(1:158))|34|(5:38|(1:(6:44|(2:46|(1:48))|49|(1:51)|52|(16:(3:56|(1:60)|61)(2:151|152)|62|63|(1:147)(1:67)|(3:70|71|72)|115|(2:117|(9:137|(3:140|141|142)|79|(5:85|86|(1:88)|89|(1:113)(7:91|92|(1:94)|95|(2:97|(1:(2:100|(2:102|(1:104)(1:108))(1:109))(1:110))(1:111))(1:112)|105|106))|114|86|(0)|89|(0)(0)))|145|(3:140|141|142)|79|(5:85|86|(0)|89|(0)(0))|114|86|(0)|89|(0)(0))(1:54))(1:43))|154|52|(0)(0))))|163|62|63|(1:65)|147|(3:70|71|72)|115|(0)|145|(0)|79|(0)|114|86|(0)|89|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0144, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00f4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0128, code lost:
    
        if (com.mbridge.msdk.foundation.download.utils.Utils.getDownloadRate(r8.j(), r8.m()) >= r17) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00ab, code lost:
    
        if (r7.getRsIgnoreCheckRule().contains(0) != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158 A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:72:0x014c, B:115:0x0152, B:117:0x0158, B:120:0x0163, B:123:0x016a, B:126:0x0171, B:128:0x0177, B:130:0x0181, B:133:0x0191, B:135:0x0197), top: B:71:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af A[Catch: Exception -> 0x01c6, TryCatch #3 {Exception -> 0x01c6, blocks: (B:11:0x002d, B:76:0x01ab, B:78:0x01af, B:79:0x01c9, B:86:0x01d9, B:88:0x01de, B:89:0x01e1, B:92:0x01e5, B:94:0x01eb, B:95:0x01f0, B:105:0x0301), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de A[Catch: Exception -> 0x01c6, TryCatch #3 {Exception -> 0x01c6, blocks: (B:11:0x002d, B:76:0x01ab, B:78:0x01af, B:79:0x01c9, B:86:0x01d9, B:88:0x01de, B:89:0x01e1, B:92:0x01e5, B:94:0x01eb, B:95:0x01f0, B:105:0x0301), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.util.List, boolean):java.util.List");
    }

    private com.mbridge.msdk.videocommon.download.a a(CampaignEx campaignEx, String str, com.mbridge.msdk.videocommon.download.a aVar) {
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.videocommon.download.a c9 = c(campaignEx);
        c9.n();
        this.f19464h.put(str, c9);
        return c9;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.lang.String r6, com.mbridge.msdk.foundation.entity.CampaignEx r7, com.mbridge.msdk.videocommon.download.a r8) {
        /*
            r5 = this;
            java.lang.String r0 = "RewardVideoRefactorManager"
            r1 = 0
            if (r7 == 0) goto Lcf
            if (r8 != 0) goto L9
            goto Lcf
        L9:
            boolean r8 = r8.b()     // Catch: java.lang.Throwable -> L27
            r2 = 1
            if (r8 == 0) goto L2a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r6.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = r5.f19460d     // Catch: java.lang.Throwable -> L27
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = " checkEndCardZipOrSourceDownLoad endCard download success"
            r6.append(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L27
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)     // Catch: java.lang.Throwable -> L27
            return r2
        L27:
            r6 = move-exception
            goto Lae
        L2a:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r8 == 0) goto L4a
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L27
            if (r8 <= 0) goto L4a
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            boolean r8 = r8.contains(r4)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L4a
            return r2
        L4a:
            boolean r8 = r7.isDynamicView()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L57
            boolean r8 = com.mbridge.msdk.foundation.tools.ai.l(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L57
            return r2
        L57:
            boolean r8 = com.mbridge.msdk.foundation.tools.an.a(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L5e
            return r2
        L5e:
            boolean r8 = r7.isMraid()     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L77
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L6b
            goto L77
        L6b:
            int r8 = r7.getLoadTimeoutState()     // Catch: java.lang.Throwable -> L27
            if (r8 != r2) goto L79
            boolean r8 = r5.e(r7)     // Catch: java.lang.Throwable -> L27
            if (r8 != 0) goto L79
        L77:
            r6 = r2
            goto Lab
        L79:
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            if (r8 == 0) goto L98
            java.util.ArrayList r8 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L27
            if (r8 <= 0) goto L98
            java.util.ArrayList r7 = r7.getRsIgnoreCheckRule()     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L27
            boolean r7 = r7.contains(r8)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto L98
            goto L77
        L98:
            java.lang.String r7 = com.mbridge.msdk.videocommon.download.f.a(r6)     // Catch: java.lang.Throwable -> L27
            boolean r7 = com.mbridge.msdk.foundation.tools.an.b(r7)     // Catch: java.lang.Throwable -> L27
            if (r7 == 0) goto La3
            goto L77
        La3:
            java.lang.String r6 = com.mbridge.msdk.videocommon.download.f.b(r6)     // Catch: java.lang.Throwable -> L27
            boolean r6 = com.mbridge.msdk.foundation.tools.an.b(r6)     // Catch: java.lang.Throwable -> L27
        Lab:
            if (r6 == 0) goto Lcf
            return r2
        Lae:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto Lcf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f19460d
            r7.append(r8)
            java.lang.String r8 = " checkEndCardDownload error "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.mbridge.msdk.foundation.tools.ad.a(r0, r6)
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.i.a(java.lang.String, com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.videocommon.download.a):boolean");
    }

    public final com.mbridge.msdk.videocommon.download.a a(String str) {
        if (!TextUtils.isEmpty(str) && this.f19464h.containsKey(str)) {
            return this.f19464h.get(str);
        }
        return null;
    }
}
