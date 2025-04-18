package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.videocommon.download.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f16435e;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f16437g;

    /* renamed from: j, reason: collision with root package name */
    private Context f16440j;

    /* renamed from: l, reason: collision with root package name */
    private String f16442l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f16443m;

    /* renamed from: o, reason: collision with root package name */
    private int f16445o;

    /* renamed from: p, reason: collision with root package name */
    private i f16446p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16447q;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f16433c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f16434d = true;

    /* renamed from: f, reason: collision with root package name */
    private String f16436f = "";

    /* renamed from: h, reason: collision with root package name */
    private c f16438h = new c() { // from class: com.mbridge.msdk.videocommon.download.j.1
        @Override // com.mbridge.msdk.videocommon.download.c
        public final void a(long j3, int i10) {
            if (i10 == 5 || i10 == 4) {
                j.this.f16434d = true;
                j.this.a();
            }
            if (i10 == 2) {
                j.this.f16434d = true;
            }
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, a>> f16439i = new CopyOnWriteArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private long f16441k = 3600;

    /* renamed from: n, reason: collision with root package name */
    private int f16444n = 1;
    k a = null;

    /* renamed from: b, reason: collision with root package name */
    k f16432b = null;

    public j(Context context, List<CampaignEx> list, String str, int i10) {
        this.f16445o = 1;
        try {
            boolean a = h.a.a.a(i10);
            this.f16447q = a;
            if (a) {
                this.f16442l = str;
                this.f16445o = i10;
                this.f16446p = new i(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f16446p = null;
            this.f16447q = false;
        }
        this.f16440j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list2 = this.f16433c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f16442l = str;
        this.f16445o = i10;
        b(this.f16433c);
    }

    private void d() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((this.f16447q && this.f16446p != null) || af.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f16439i) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                long currentTimeMillis = System.currentTimeMillis();
                int i10 = 0;
                while (i10 < this.f16439i.size()) {
                    Map<String, a> map = this.f16439i.get(i10);
                    Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        a value = it.next().getValue();
                        if (value != null) {
                            if (currentTimeMillis - value.g() > this.f16441k * 1000 && value.k() == 1) {
                                value.b(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                value.a(this.f16444n);
                                value.s();
                                this.f16439i.remove(map);
                                i10--;
                            }
                            if (value.k() != 1 && value.k() != 5 && value.k() != 0) {
                                value.s();
                                this.f16439i.remove(map);
                                i10--;
                            }
                        }
                    }
                    i10++;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void e() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.f16439i;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f16439i.size()) {
                        Map<String, a> map = this.f16439i.get(i10);
                        Iterator<Map.Entry<String, a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            a value = it.next().getValue();
                            if (value != null && value.l() != null && value.f()) {
                                value.r();
                                this.f16439i.remove(map);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
            } catch (Throwable unused) {
                ad.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    private void f(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", 1);
                dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    dVar.a("resumed_breakpoint", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                } else {
                    dVar.a("resumed_breakpoint", "1");
                }
                dVar.a("resource_type", 4);
                dVar.a("scenes", "1");
                dVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final CopyOnWriteArrayList<Map<String, a>> c() {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            return iVar.d();
        }
        return this.f16439i;
    }

    private void b(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        boolean z10;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.f16436f = list.get(0).getCurrentLocalRid();
        }
        e();
        d();
        int i10 = this.f16445o;
        if (i10 != 1) {
            if (i10 != 287) {
                if (i10 == 298) {
                    k b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                    this.f16432b = b3;
                    if (b3 == null) {
                        this.f16432b = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                    }
                    k kVar = this.f16432b;
                    if (kVar != null) {
                        this.f16441k = kVar.j();
                        this.f16444n = this.f16432b.k();
                    }
                } else if (i10 != 94) {
                    if (i10 == 95) {
                        try {
                            if (!TextUtils.isEmpty(this.f16442l)) {
                                k d10 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                                if (d10 == null) {
                                    d10 = k.e(this.f16442l);
                                }
                                if (d10 != null) {
                                    this.f16441k = d10.j();
                                    this.f16444n = d10.k();
                                }
                            }
                        } catch (Exception unused) {
                            ad.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                            return;
                        }
                    }
                }
            }
            try {
                com.mbridge.msdk.videocommon.d.a b10 = com.mbridge.msdk.videocommon.d.b.a().b();
                if (b10 == null) {
                    com.mbridge.msdk.videocommon.d.b.a().c();
                }
                if (b10 != null) {
                    this.f16441k = b10.g();
                }
                if (!TextUtils.isEmpty(this.f16442l)) {
                    this.f16443m = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                }
                com.mbridge.msdk.videocommon.d.c cVar = this.f16443m;
                if (cVar != null) {
                    this.f16444n = cVar.w();
                }
            } catch (Exception unused2) {
                ad.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else {
            try {
                if (!TextUtils.isEmpty(this.f16442l)) {
                    k d11 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                    this.a = d11;
                    if (d11 == null) {
                        this.a = k.d(this.f16442l);
                    }
                    k kVar2 = this.a;
                    if (kVar2 != null) {
                        this.f16441k = kVar2.j();
                        this.f16444n = this.a.k();
                    }
                }
            } catch (Exception unused3) {
                ad.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            CampaignEx campaignEx = list.get(i11);
            if (campaignEx != null) {
                int i12 = this.f16445o;
                String str = (i12 != 94 && i12 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((c(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.f16439i) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i13 = 0;
                        while (true) {
                            try {
                                if (i13 >= this.f16439i.size()) {
                                    z10 = false;
                                    break;
                                }
                                Map<String, a> map = this.f16439i.get(i13);
                                if (map == null || !map.containsKey(str)) {
                                    i13++;
                                } else {
                                    a aVar = map.get(str);
                                    if (aVar != null) {
                                        aVar.a(campaignEx);
                                        aVar.a(this.f16444n);
                                        aVar.e(false);
                                        map.remove(str);
                                        map.put(str, aVar);
                                        this.f16439i.set(i13, map);
                                    }
                                    z10 = true;
                                }
                            } finally {
                            }
                        }
                        if (!z10) {
                            a aVar2 = new a(this.f16440j, campaignEx, this.f16442l, this.f16444n);
                            aVar2.a(this.f16444n);
                            aVar2.d(this.f16445o);
                            HashMap hashMap = new HashMap();
                            hashMap.put(str, aVar2);
                            this.f16439i.add(hashMap);
                        } else {
                            f(campaignEx);
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f16433c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f16433c.clear();
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            iVar.a(aVar);
        } else {
            this.f16435e = aVar;
        }
    }

    private boolean c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    public final void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            iVar.a(str, aVar);
            return;
        }
        if (this.f16437g == null) {
            this.f16437g = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f16437g.put(str, aVar);
    }

    public final void a(List<CampaignEx> list) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            iVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f16433c;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        b(this.f16433c);
    }

    private int e(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f16432b == null) {
                    this.f16432b = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l);
                }
                return this.f16432b.p();
            }
            if (campaignEx.getAdType() == 42) {
                return d(null);
            }
            if (this.f16443m == null) {
                this.f16443m = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16442l, false);
            }
            return this.f16443m.r();
        } catch (Throwable th2) {
            ad.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public final void a(CampaignEx campaignEx) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            iVar.a(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f16433c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        b(this.f16433c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01df, code lost:
    
        if (r29 != 94) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r15.isBidCampaign() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r28, int r29, boolean r30, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r31, boolean r32, com.mbridge.msdk.foundation.same.report.d.d r33) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.d.d):java.util.List");
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.a;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("UnitCacheCtroller", e2.getMessage());
            return 100;
        }
    }

    public j(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f16445o = 1;
        try {
            boolean a = h.a.a.a(i10);
            this.f16447q = a;
            if (a) {
                this.f16442l = str;
                this.f16445o = i10;
                this.f16446p = new i(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f16446p = null;
            this.f16447q = false;
        }
        this.f16440j = com.mbridge.msdk.foundation.controller.c.m().c();
        List<CampaignEx> list = this.f16433c;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f16442l = str;
        this.f16445o = i10;
        b(this.f16433c);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return e(campaignEx);
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !c(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return an.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || an.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public final a b(int i10, boolean z10) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            return iVar.c();
        }
        try {
            return a(i10, z10);
        } catch (Throwable th2) {
            ad.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public final void b() {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        if ((!this.f16447q || this.f16446p == null) && (copyOnWriteArrayList = this.f16439i) != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    Iterator<Map<String, a>> it = this.f16439i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                            while (it2.hasNext()) {
                                a value = it2.next().getValue();
                                if (value != null && value.k() == 1) {
                                    value.b("playing and stop download");
                                    value.s();
                                    this.f16439i.remove(next);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("UnitCacheCtroller", th2.getMessage());
                }
            }
        }
    }

    public final boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, str, this.f16444n), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: all -> 0x0285, Exception -> 0x0287, TryCatch #1 {Exception -> 0x0287, blocks: (B:12:0x001b, B:16:0x0027, B:20:0x006f, B:21:0x0074, B:23:0x007c, B:24:0x008c, B:26:0x0092, B:28:0x00a0, B:30:0x00a8, B:31:0x00b2, B:33:0x00b8, B:42:0x00d9, B:50:0x00e1, B:54:0x00e8, B:56:0x00f8, B:57:0x0100, B:61:0x0151, B:63:0x0163, B:135:0x0174, B:138:0x017a, B:142:0x0190, B:149:0x019a, B:72:0x01a6, B:74:0x01b3, B:76:0x01bd, B:78:0x01ca, B:87:0x01e4, B:127:0x01ea, B:129:0x01f0, B:89:0x0209, B:96:0x021c, B:101:0x0228, B:105:0x0230, B:107:0x0234, B:109:0x023e, B:114:0x0246, B:117:0x0250, B:119:0x025a, B:155:0x010d, B:157:0x0113, B:159:0x011d, B:163:0x0126, B:165:0x012c, B:178:0x0132, B:167:0x013d, B:169:0x0145, B:190:0x0035, B:192:0x0041, B:195:0x0059, B:196:0x027b, B:201:0x004b), top: B:11:0x001b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0209 A[Catch: all -> 0x0285, Exception -> 0x0287, TRY_ENTER, TryCatch #1 {Exception -> 0x0287, blocks: (B:12:0x001b, B:16:0x0027, B:20:0x006f, B:21:0x0074, B:23:0x007c, B:24:0x008c, B:26:0x0092, B:28:0x00a0, B:30:0x00a8, B:31:0x00b2, B:33:0x00b8, B:42:0x00d9, B:50:0x00e1, B:54:0x00e8, B:56:0x00f8, B:57:0x0100, B:61:0x0151, B:63:0x0163, B:135:0x0174, B:138:0x017a, B:142:0x0190, B:149:0x019a, B:72:0x01a6, B:74:0x01b3, B:76:0x01bd, B:78:0x01ca, B:87:0x01e4, B:127:0x01ea, B:129:0x01f0, B:89:0x0209, B:96:0x021c, B:101:0x0228, B:105:0x0230, B:107:0x0234, B:109:0x023e, B:114:0x0246, B:117:0x0250, B:119:0x025a, B:155:0x010d, B:157:0x0113, B:159:0x011d, B:163:0x0126, B:165:0x012c, B:178:0x0132, B:167:0x013d, B:169:0x0145, B:190:0x0035, B:192:0x0041, B:195:0x0059, B:196:0x027b, B:201:0x004b), top: B:11:0x001b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.videocommon.download.a a(int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    public final void b(String str) {
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList;
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            iVar.b(str);
            return;
        }
        try {
            synchronized (this.f16439i) {
                if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f16439i) != null && copyOnWriteArrayList.size() > 0) {
                    Iterator<Map<String, a>> it = this.f16439i.iterator();
                    while (it.hasNext()) {
                        Map<String, a> next = it.next();
                        if (next != null) {
                            for (Map.Entry<String, a> entry : next.entrySet()) {
                                if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                    this.f16439i.remove(next);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("UnitCacheCtroller", e2.getMessage());
            }
        }
    }

    public static boolean a(a aVar, int i10) {
        long m10 = aVar.m();
        long j3 = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.l() != null && !TextUtils.isEmpty(aVar.l().getVideoUrlEncode())) {
                return true;
            }
        } else if (j3 > 0 && m10 * 100 >= j3 * i10) {
            if (i10 != 100 || aVar.k() == 5) {
                return true;
            }
            aVar.s();
            return false;
        }
        return false;
    }

    private static boolean a(a aVar, int i10, boolean z10) {
        long m10 = aVar.m();
        long j3 = aVar.j();
        if (TextUtils.isEmpty(aVar.e())) {
            ad.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx l10 = aVar.l();
        if (l10 != null) {
            if (l10.getRsIgnoreCheckRule() != null && l10.getRsIgnoreCheckRule().size() > 0 && l10.getRsIgnoreCheckRule().contains(0)) {
                ad.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (l10.getIsTimeoutCheckVideoStatus() == 1 && l10.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && l10.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((j3 != 0 || m10 != 0) && m10 >= (i10 / 100) * j3) {
                    l10.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !ai.l(str)) || an.a(str) || b(str, campaignEx);
            }
            ad.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            ad.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            ad.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            ad.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public final a a(String str) {
        i iVar;
        if (this.f16447q && (iVar = this.f16446p) != null) {
            return iVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList = this.f16439i;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                Iterator<Map<String, a>> it = this.f16439i.iterator();
                while (it.hasNext()) {
                    Map<String, a> next = it.next();
                    if (next != null && next.containsKey(str)) {
                        return next.get(str);
                    }
                }
            } catch (Throwable unused) {
                ad.b("UnitCacheCtroller", "failed to get campaignTast by cid");
            }
            return null;
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, a> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, a>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().k() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x003e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db A[Catch: all -> 0x020f, TryCatch #2 {, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0021, B:16:0x0027, B:18:0x002d, B:21:0x0036, B:22:0x003e, B:24:0x0044, B:27:0x0054, B:30:0x005b, B:32:0x0061, B:33:0x0063, B:36:0x006f, B:37:0x007f, B:39:0x0090, B:41:0x0094, B:42:0x009c, B:43:0x00a0, B:49:0x00b5, B:51:0x00b9, B:52:0x00cd, B:54:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:63:0x0125, B:65:0x012a, B:66:0x0130, B:70:0x0167, B:71:0x016b, B:73:0x0170, B:78:0x0178, B:82:0x017e, B:84:0x0182, B:85:0x018b, B:87:0x018f, B:91:0x0199, B:92:0x019d, B:96:0x01a9, B:100:0x01af, B:102:0x01b3, B:107:0x01c1, B:113:0x01ca, B:115:0x01d5, B:118:0x01d9, B:121:0x01dd, B:124:0x01e3, B:137:0x01ee, B:142:0x01f6, B:127:0x01fb, B:132:0x0208, B:135:0x0205, B:156:0x00fc, B:158:0x0100, B:161:0x0115, B:163:0x011b, B:165:0x011f, B:179:0x020d), top: B:11:0x0016, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[Catch: all -> 0x020f, TryCatch #2 {, blocks: (B:12:0x0016, B:14:0x001f, B:15:0x0021, B:16:0x0027, B:18:0x002d, B:21:0x0036, B:22:0x003e, B:24:0x0044, B:27:0x0054, B:30:0x005b, B:32:0x0061, B:33:0x0063, B:36:0x006f, B:37:0x007f, B:39:0x0090, B:41:0x0094, B:42:0x009c, B:43:0x00a0, B:49:0x00b5, B:51:0x00b9, B:52:0x00cd, B:54:0x00d1, B:55:0x00d7, B:57:0x00db, B:59:0x00df, B:60:0x00f3, B:62:0x00f7, B:63:0x0125, B:65:0x012a, B:66:0x0130, B:70:0x0167, B:71:0x016b, B:73:0x0170, B:78:0x0178, B:82:0x017e, B:84:0x0182, B:85:0x018b, B:87:0x018f, B:91:0x0199, B:92:0x019d, B:96:0x01a9, B:100:0x01af, B:102:0x01b3, B:107:0x01c1, B:113:0x01ca, B:115:0x01d5, B:118:0x01d9, B:121:0x01dd, B:124:0x01e3, B:137:0x01ee, B:142:0x01f6, B:127:0x01fb, B:132:0x0208, B:135:0x0205, B:156:0x00fc, B:158:0x0100, B:161:0x0115, B:163:0x011b, B:165:0x011f, B:179:0x020d), top: B:11:0x0016, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.j.a():void");
    }
}
