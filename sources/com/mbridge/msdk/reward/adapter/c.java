package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.bt.module.b.h;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.download.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    private boolean A;
    private String C;
    private int D;
    private int E;
    private int F;
    private CampaignUnit G;
    private CopyOnWriteArrayList<CampaignEx> H;
    private String K;
    private a L;
    private List<CampaignEx> S;
    private CopyOnWriteArrayList<CampaignEx> T;
    private List<CampaignEx> U;

    /* renamed from: k, reason: collision with root package name */
    private Context f14897k;

    /* renamed from: l, reason: collision with root package name */
    private String f14898l;

    /* renamed from: m, reason: collision with root package name */
    private String f14899m;

    /* renamed from: n, reason: collision with root package name */
    private int f14900n;

    /* renamed from: o, reason: collision with root package name */
    private int f14901o;

    /* renamed from: p, reason: collision with root package name */
    private int f14902p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14903q;

    /* renamed from: r, reason: collision with root package name */
    private String f14904r;

    /* renamed from: s, reason: collision with root package name */
    private h f14905s;

    /* renamed from: t, reason: collision with root package name */
    private volatile com.mbridge.msdk.reward.adapter.a f14906t;
    private com.mbridge.msdk.videocommon.d.c u;

    /* renamed from: z, reason: collision with root package name */
    private boolean f14911z;

    /* renamed from: v, reason: collision with root package name */
    private boolean f14907v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14908w = false;
    public Object a = new Object();

    /* renamed from: x, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f14909x = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private int f14910y = 2;
    private String B = "";
    private boolean I = false;
    private long J = 0;
    private boolean M = false;
    private boolean N = false;

    /* renamed from: b, reason: collision with root package name */
    public String f14888b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f14889c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f14890d = "";
    private Handler O = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.reward.adapter.c.1
        /* JADX WARN: Removed duplicated region for block: B:194:0x037f  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0381  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r25) {
            /*
                Method dump skipped, instructions count: 1522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };
    private boolean P = false;
    private long Q = 0;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f14891e = false;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f14892f = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f14893g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f14894h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f14895i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f14896j = false;
    private String R = "";

    /* renamed from: com.mbridge.msdk.reward.adapter.c$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements b.i {
        com.mbridge.msdk.foundation.same.report.d.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f14927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14929d;

        public AnonymousClass4(CampaignEx campaignEx, boolean z10, int i10) {
            this.f14927b = campaignEx;
            this.f14928c = z10;
            this.f14929d = i10;
            this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, final String str2, final com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.f14928c && c.this.f14906t != null && c.this.O != null) {
                ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.f14927b.getRsIgnoreCheckRule() == null || this.f14927b.getRsIgnoreCheckRule().size() <= 0 || !this.f14927b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar = c.this;
                            c.a(cVar, cVar.f14898l, c.this.S, c.this.A, str2);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (!c.this.f14895i && c.this.f14906t != null) {
                                c.this.f14895i = true;
                                com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                                if (bVar2 != null) {
                                    bVar2.a("errorCode: 3202 errorMessage: temp resource download failed");
                                }
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                if (anonymousClass4.a == null) {
                                    anonymousClass4.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                anonymousClass42.a.b(c.this.H);
                                AnonymousClass4.this.a.a(bVar);
                                c.this.f14906t.a(c.this.S, bVar, AnonymousClass4.this.a);
                                ad.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
                            }
                        }
                    });
                    return;
                } else {
                    ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.f14929d == 1) {
                if (this.f14927b.getRsIgnoreCheckRule() != null && this.f14927b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.f14927b.getRsIgnoreCheckRule().contains(3)) {
                        ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.f14927b.getCMPTEntryUrl().equals(this.f14927b.getendcard_url()) && this.f14927b.getRsIgnoreCheckRule().contains(2)) {
                        ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.f14906t == null || c.this.O == null) {
                    return;
                }
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.4.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        c.a(cVar, cVar.f14898l, c.this.S, c.this.A, str2);
                        if (c.this.O != null) {
                            c.this.O.removeMessages(5);
                        }
                        if (!c.this.f14895i && c.this.f14906t != null) {
                            c.this.f14895i = true;
                            com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                            }
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            if (anonymousClass4.a == null) {
                                anonymousClass4.a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            anonymousClass42.a.b(c.this.H);
                            AnonymousClass4.this.a.a(bVar);
                            c.this.f14906t.a(c.this.S, bVar, AnonymousClass4.this.a);
                            ad.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private String f14943b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f14944c;

        public a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f14943b = str;
            this.f14944c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!c.this.M) {
                    c.this.N = true;
                    if (c.this.O != null) {
                        Message obtainMessage = c.this.O.obtainMessage();
                        obtainMessage.obj = this.f14943b;
                        obtainMessage.what = 2;
                        if (this.f14944c != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("metrics_data_lrid", this.f14944c.f());
                            obtainMessage.setData(bundle);
                        }
                        c.this.O.sendMessage(obtainMessage);
                    }
                }
            } catch (Exception e2) {
                ad.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private String f14945b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f14946c;

        public b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f14945b = str;
            this.f14946c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (com.mbridge.msdk.e.b.a()) {
                    c cVar = c.this;
                    String unused = cVar.f14898l;
                    Context unused2 = c.this.f14897k;
                    cVar.C = "";
                }
                c cVar2 = c.this;
                cVar2.f14904r = ai.a(cVar2.f14897k, c.this.f14898l);
                if (c.this.N) {
                    return;
                }
                if (c.this.L != null && c.this.O != null) {
                    c.this.O.removeCallbacks(c.this.L);
                }
                c.this.M = true;
                if (c.this.O != null) {
                    Message obtainMessage = c.this.O.obtainMessage();
                    obtainMessage.obj = this.f14945b;
                    obtainMessage.what = 1;
                    if (this.f14946c != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.f14946c.f());
                        obtainMessage.setData(bundle);
                    }
                    c.this.O.sendMessage(obtainMessage);
                }
                if (!TextUtils.isEmpty(c.this.f14904r)) {
                    ad.b("RewardMVVideoAdapter", "excludeId : " + c.this.f14904r);
                }
            } catch (Exception e2) {
                ad.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f14897k = context.getApplicationContext();
            this.f14898l = str2;
            this.f14899m = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: Exception -> 0x009c, TryCatch #0 {Exception -> 0x009c, blocks: (B:11:0x0027, B:13:0x002d, B:14:0x0070, B:16:0x0076, B:18:0x007e, B:24:0x0042, B:26:0x0048, B:27:0x004c, B:29:0x0052, B:32:0x005a, B:35:0x0064), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r0 = r0.c()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.db.b.a(r0)
            java.lang.String r1 = r4.f14898l
            java.lang.String r2 = r4.f14889c
            java.util.List r0 = r0.a(r1, r2)
            if (r0 == 0) goto La6
            int r1 = r0.size()
            java.lang.String r2 = r4.f14898l
            java.lang.String r2 = com.mbridge.msdk.foundation.same.a.b.b(r2)
            if (r1 != 0) goto L23
            return
        L23:
            r3 = 1
            if (r1 != r3) goto L42
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r3 = (com.mbridge.msdk.foundation.entity.d) r3     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = r3.d()     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r0 = (com.mbridge.msdk.foundation.entity.d) r0     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r0.b()     // Catch: java.lang.Exception -> L9c
            goto L70
        L42:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto L6d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L9c
        L4c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.entity.d r1 = (com.mbridge.msdk.foundation.entity.d) r1     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto L4c
            java.lang.String r3 = r1.a()     // Catch: java.lang.Exception -> L9c
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L4c
            java.lang.String r3 = r1.d()     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r1.b()     // Catch: java.lang.Exception -> L9c
            goto L70
        L6d:
            java.lang.String r3 = ""
            r0 = r3
        L70:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto La6
            java.lang.String r1 = r4.f14889c     // Catch: java.lang.Exception -> L9c
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L9c
            if (r1 == 0) goto La6
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> L9c
            android.content.Context r1 = r1.c()     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.db.b.a(r1)     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = r4.f14898l     // Catch: java.lang.Exception -> L9c
            r1.b(r2, r3)     // Catch: java.lang.Exception -> L9c
            java.lang.String r1 = r4.f14898l     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = r4.f14889c     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.same.a.b.a(r1, r2, r0)     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = r4.f14898l     // Catch: java.lang.Exception -> L9c
            com.mbridge.msdk.foundation.same.a.b.c(r0)     // Catch: java.lang.Exception -> L9c
            goto La6
        L9c:
            r0 = move-exception
            java.lang.String r1 = "RewardMVVideoAdapter"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.g():void");
    }

    private String h() {
        int F;
        g a10 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(this.K)) {
            F = a10.ap();
        } else {
            F = a10.F();
        }
        return com.mbridge.msdk.foundation.same.net.e.d.f().a(this.K, F);
    }

    private void i() {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            try {
                g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b3 == null) {
                    com.mbridge.msdk.c.h.a();
                    b3 = i.a();
                }
                com.mbridge.msdk.videocommon.a.a.a().a(b3.aa() * 1000, this.f14898l);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        try {
            if (an.b(this.f14898l)) {
                com.mbridge.msdk.reward.b.a.a(this.f14898l, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String k() {
        try {
            return an.b(com.mbridge.msdk.reward.b.a.f14952d) ? com.mbridge.msdk.reward.b.a.f14952d : "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private void l() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.a.b.f13306k;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.b.f13306k.clear();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void m() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f14897k)).a(this.f14898l);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void c(boolean z10) {
        this.A = z10;
    }

    public final boolean d(boolean z10) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        CopyOnWriteArrayList<CampaignEx> a10 = com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, 1, this.A, this.B);
        if (a10 != null && a10.size() > 0) {
            CampaignEx campaignEx = a10.get(0);
            int b3 = com.mbridge.msdk.videocommon.a.a.a().b(this.f14898l, 1, this.A, this.B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || a10.size() >= b3) {
                return a(a10, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z10);
            }
            if (z10) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("event_name", "is_ready_cltr");
                dVar.a("reason", "nscpt error");
                a(bVar, dVar, a10);
            }
            return false;
        }
        ad.a("RewardVideoController", "database has not can use data");
        if (z10) {
            com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar2.a("event_name", "is_ready_cse");
            dVar2.a("reason", "no effective campaign list");
        }
        return false;
    }

    public final void e(boolean z10) {
        this.P = z10;
    }

    public final void f(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.H) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, this.H);
    }

    public final boolean c() {
        List<CampaignEx> c10 = com.mbridge.msdk.videocommon.a.a.a().c(this.f14898l, 1, this.A, this.B);
        if (c10 != null && c10.size() > 0) {
            CampaignEx campaignEx = c10.get(0);
            int b3 = com.mbridge.msdk.videocommon.a.a.a().b(this.f14898l, 1, this.A, this.B);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || c10.size() >= b3) {
                return a(c10, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
            }
            return false;
        }
        ad.a("test_isReay_db", "database has not can use data");
        return false;
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.T;
    }

    public final void b(boolean z10) {
        this.f14911z = z10;
    }

    public final String f() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.a(this.H);
        }
        return com.mbridge.msdk.foundation.same.c.a(this.U);
    }

    public final boolean b() {
        return d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.O.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.O.sendMessage(obtain);
            }
        }
    }

    public final boolean h(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, this.U, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<CampaignEx> it = this.H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(1);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14898l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, this.H, "load_timeout", 1);
        return true;
    }

    public final String a(boolean z10) {
        CopyOnWriteArrayList<CampaignEx> a10;
        CampaignEx campaignEx;
        if (z10) {
            if (TextUtils.isEmpty(this.f14889c) && (a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f14898l)) != null && a10.size() > 0 && (campaignEx = a10.get(0)) != null) {
                this.f14889c = campaignEx.getRequestId();
            }
            return this.f14889c;
        }
        return this.f14888b;
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 implements b.i {
        com.mbridge.msdk.foundation.same.report.d.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f14935b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14936c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14937d;

        public AnonymousClass5(CampaignEx campaignEx, boolean z10, int i10) {
            this.f14935b = campaignEx;
            this.f14936c = z10;
            this.f14937d = i10;
            this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.f14892f = true;
            if (!c.this.f14891e || c.this.f14893g || c.this.O == null) {
                return;
            }
            synchronized (c.this.a) {
                if (c.this.f14893g) {
                    return;
                }
                c.this.f14893g = true;
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.5.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.mbridge.msdk.reward.adapter.b a = b.m.a();
                        boolean z10 = c.this.I;
                        Handler handler = c.this.O;
                        boolean z11 = c.this.f14911z;
                        boolean z12 = c.this.A;
                        String str5 = str3;
                        String requestIdNotice = AnonymousClass5.this.f14935b.getRequestIdNotice();
                        String str6 = str;
                        String str7 = str2;
                        String cMPTEntryUrl = AnonymousClass5.this.f14935b.getCMPTEntryUrl();
                        int i10 = c.this.f14910y;
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        a.a(z10, handler, z11, z12, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i10, anonymousClass5.f14935b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass5.this.f14935b.getCMPTEntryUrl()), str2, c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.5.1.1
                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str8, String str9, String str10, String str11, String str12, a.C0214a c0214a) {
                                e.A("模板加载成功 requestId ", str11, "HBOPTIMIZE");
                                c cVar = c.this;
                                CopyOnWriteArrayList copyOnWriteArrayList = cVar.H;
                                AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                                if (cVar.a(copyOnWriteArrayList, anonymousClass52.f14936c, anonymousClass52.f14937d)) {
                                    c cVar2 = c.this;
                                    c.a(cVar2, cVar2.f14898l, c.this.S, c.this.U, c.this.A);
                                    if (c.this.O != null) {
                                        c.this.O.removeMessages(5);
                                    }
                                    if (c.this.f14906t == null || c.this.f14894h) {
                                        return;
                                    }
                                    c.this.f14894h = true;
                                    AnonymousClass5 anonymousClass53 = AnonymousClass5.this;
                                    com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass53.a;
                                    if (bVar != null) {
                                        bVar.b(c.this.H);
                                    }
                                    c.this.f14906t.a(c.this.H, AnonymousClass5.this.a);
                                    return;
                                }
                                c cVar3 = c.this;
                                c.a(cVar3, str10, cVar3.S, c.this.A, str3);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.f14906t == null || c.this.f14895i) {
                                    return;
                                }
                                c.this.f14895i = true;
                                com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                AnonymousClass5 anonymousClass54 = AnonymousClass5.this;
                                if (anonymousClass54.a == null) {
                                    anonymousClass54.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass5 anonymousClass55 = AnonymousClass5.this;
                                anonymousClass55.a.b(c.this.H);
                                AnonymousClass5.this.a.a(b3);
                                c.this.f14906t.a(c.this.S, b3, AnonymousClass5.this.a);
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                            }

                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str8, String str9, String str10, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar) {
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                                ad.b("HBOPTIMIZE", "模板加载失败 requestId " + str9);
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                c cVar = c.this;
                                c.a(cVar, str2, cVar.S, c.this.A, str9);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.f14906t == null || c.this.f14895i) {
                                    return;
                                }
                                c.this.f14895i = true;
                                AnonymousClass5 anonymousClass52 = AnonymousClass5.this;
                                if (anonymousClass52.a == null) {
                                    anonymousClass52.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass5 anonymousClass53 = AnonymousClass5.this;
                                anonymousClass53.a.b(c.this.H);
                                AnonymousClass5.this.a.a(bVar);
                                c.this.f14906t.a(c.this.S, bVar, AnonymousClass5.this.a);
                                ad.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                            }
                        }, false);
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.f14935b.getRsIgnoreCheckRule() != null && this.f14935b.getRsIgnoreCheckRule().size() > 0) {
                if (this.f14935b.getRsIgnoreCheckRule().contains(3)) {
                    ad.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f14935b.getCMPTEntryUrl().equals(this.f14935b.getendcard_url()) && this.f14935b.getRsIgnoreCheckRule().contains(2)) {
                    ad.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            c.a(cVar, cVar.f14898l, c.this.S, c.this.A, str2);
            c.this.f14892f = false;
            if (c.this.O != null) {
                c.this.O.removeMessages(5);
            }
            if (c.this.f14906t == null || c.this.f14895i) {
                return;
            }
            c.this.f14895i = true;
            if (bVar != null) {
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.a == null) {
                this.a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.a.b(c.this.H);
            this.a.a(bVar);
            c.this.f14906t.a(c.this.S, bVar, this.a);
            ad.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }
    }

    private com.mbridge.msdk.foundation.same.report.d.b c(List<CampaignEx> list) {
        String str;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        str = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    str = list.get(0) != null ? list.get(0).getLocalRequestId() : "";
                    bVar.c(str);
                    bVar.b(list);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("cache", 1);
        dVar.a(CampaignEx.JSON_KEY_HB, 1);
        dVar.a("auto_load", 2);
        bVar.a("2000127", dVar);
        bVar.a("2000048", dVar);
        bVar.b(this.f14911z ? 287 : 94);
        bVar.i("1");
        bVar.b(MBridgeConstans.API_REUQEST_CATEGORY_APP);
        if (!TextUtils.isEmpty(str) && !com.mbridge.msdk.foundation.same.report.d.c.a().b().containsKey(str)) {
            com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
        }
        return bVar;
    }

    public final void a(String str) {
        this.B = str;
    }

    public final void a(int i10) {
        this.f14910y = i10;
    }

    public final String a() {
        return this.f14898l;
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f14900n += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.d.c cVar = this.u;
        if (cVar == null || this.f14900n > cVar.v()) {
            this.f14900n = 0;
        }
        if (an.b(this.f14898l)) {
            com.mbridge.msdk.reward.b.a.a(this.f14898l, this.f14900n);
        }
    }

    public final boolean a(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.foundation.c.b bVar, int i10, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        com.mbridge.msdk.foundation.b.c cVar;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(this.f14898l, this.f14911z);
        boolean z11 = false;
        if (aVar.a(this.K)) {
            return false;
        }
        if (!this.f14896j) {
            this.f14896j = true;
            cVar2 = aVar.a(this.K, bVar2, campaignEx, bVar, i10, this);
            if (cVar2 != null && cVar2.g() > com.mbridge.msdk.foundation.b.c.a) {
                if (cVar2.a() != null && cVar2.a().size() > 0) {
                    a(cVar2.a(), true, true);
                } else if (cVar2.g() == com.mbridge.msdk.foundation.b.c.f12993c && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.c.a.b(880038));
                    bVar.b(cVar2.b());
                }
            }
            cVar = cVar2;
            aVar.a(bVar2, this.K, cVar, (List<a.C0167a>) null, (JSONObject) null, 3);
            return z11;
        }
        cVar2.d("isCandidate:false");
        cVar2.a(com.mbridge.msdk.foundation.b.c.f12993c);
        cVar = cVar2;
        z11 = true;
        aVar.a(bVar2, this.K, cVar, (List<a.C0167a>) null, (JSONObject) null, 3);
        return z11;
    }

    public final void g(boolean z10) {
        if (z10) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, this.U, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<CampaignEx> it = this.H.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                next.setLoadTimeoutState(0);
                if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14898l + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().e(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.a.a.a().a(this.f14898l, this.H, "load_timeout", 0);
    }

    public final CopyOnWriteArrayList<CampaignEx> d() {
        return this.H;
    }

    private void b(String str) {
        if (an.b(str)) {
            com.mbridge.msdk.reward.b.a.f14952d = str;
        }
    }

    private boolean b(CampaignEx campaignEx) {
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

    private void b(String str, boolean z10, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.foundation.same.f.b.f().execute(new b(str, bVar));
        if (this.O != null) {
            a aVar = new a(str, bVar);
            this.L = aVar;
            this.O.postDelayed(aVar, 90000L);
            return;
        }
        a(str, z10, bVar);
    }

    public final void a(com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            this.u = cVar;
            if (cVar == null || cVar.D() * 1000 == com.mbridge.msdk.foundation.same.a.K) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.K = this.u.D() * 1000;
        } catch (Throwable th2) {
            ad.b("RewardMVVideoAdapter", th2.getMessage(), th2);
        }
    }

    public static /* synthetic */ void b(c cVar, CampaignUnit campaignUnit) {
        cVar.G = campaignUnit;
        CopyOnWriteArrayList<CampaignEx> a10 = cVar.a(campaignUnit);
        new com.mbridge.msdk.reward.a.a(cVar.f14898l, cVar.f14911z).a(a10, cVar.K, cVar, cVar.f14898l);
        cVar.a(a10, true, false);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.c$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements b.c {
        com.mbridge.msdk.foundation.same.report.d.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f14913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14914c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14915d;

        public AnonymousClass3(CampaignEx campaignEx, boolean z10, int i10) {
            this.f14913b = campaignEx;
            this.f14914c = z10;
            this.f14915d = i10;
            this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.f14891e = true;
            if (!this.f14914c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && c.this.O != null) {
                        c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b a = b.m.a();
                                boolean z10 = c.this.I;
                                Handler handler = c.this.O;
                                boolean z11 = c.this.f14911z;
                                boolean z12 = c.this.A;
                                String e2 = next.getRewardTemplateMode().e();
                                int i10 = c.this.f14910y;
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                a.a(z10, handler, z11, z12, null, e2, i10, anonymousClass3.f14913b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0214a c0214a) {
                                        c cVar = c.this;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.H;
                                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                        if (cVar.a(copyOnWriteArrayList2, anonymousClass32.f14914c, anonymousClass32.f14915d)) {
                                            c cVar2 = c.this;
                                            String str9 = cVar2.f14898l;
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            c.a(cVar2, str9, copyOnWriteArrayList, c.this.U, c.this.A);
                                            if (c.this.O != null) {
                                                c.this.O.removeMessages(5);
                                            }
                                            if (c.this.f14906t == null || c.this.f14894h) {
                                                return;
                                            }
                                            c.this.f14894h = true;
                                            AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                            com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass33.a;
                                            if (bVar != null) {
                                                bVar.b(c.this.H);
                                            }
                                            c.this.f14906t.a(c.this.H, AnonymousClass3.this.a);
                                            return;
                                        }
                                        c cVar3 = c.this;
                                        c.a(cVar3, str6, cVar3.S, c.this.A, str7);
                                        if (c.this.O != null) {
                                            c.this.O.removeMessages(5);
                                        }
                                        if (c.this.f14906t == null || c.this.f14895i) {
                                            return;
                                        }
                                        c.this.f14895i = true;
                                        com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass3 anonymousClass34 = AnonymousClass3.this;
                                        if (anonymousClass34.a == null) {
                                            anonymousClass34.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass3 anonymousClass35 = AnonymousClass3.this;
                                        anonymousClass35.a.b(c.this.H);
                                        AnonymousClass3.this.a.a(b3);
                                        c.this.f14906t.a(c.this.H, b3, AnonymousClass3.this.a);
                                        ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar) {
                                        if (bVar != null) {
                                            bVar.a("his_reason", "preload template failed is tpl :" + AnonymousClass3.this.f14914c);
                                        }
                                        if (AnonymousClass3.this.f14913b.getRsIgnoreCheckRule() != null && AnonymousClass3.this.f14913b.getRsIgnoreCheckRule().size() > 0 && AnonymousClass3.this.f14913b.getRsIgnoreCheckRule().contains(1)) {
                                            ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                            return;
                                        }
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        c cVar = c.this;
                                        c.a(cVar, str2, cVar.S, c.this.A, str5);
                                        if (c.this.O != null) {
                                            c.this.O.removeMessages(5);
                                        }
                                        if (c.this.f14906t == null || c.this.f14895i) {
                                            return;
                                        }
                                        c.this.f14895i = true;
                                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                        if (anonymousClass32.a == null) {
                                            anonymousClass32.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                        anonymousClass33.a.b(c.this.H);
                                        AnonymousClass3.this.a.a(bVar);
                                        c.this.f14906t.a(c.this.S, bVar, AnonymousClass3.this.a);
                                        ad.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                                    }
                                });
                            }
                        });
                    } else {
                        c cVar = c.this;
                        if (cVar.a(cVar.H, this.f14914c, this.f14915d)) {
                            c cVar2 = c.this;
                            c.a(cVar2, cVar2.f14898l, copyOnWriteArrayList, c.this.U, c.this.A);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (c.this.f14906t != null && !c.this.f14894h) {
                                c.this.f14894h = true;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.a;
                                if (bVar != null) {
                                    bVar.b(c.this.H);
                                }
                                c.this.f14906t.a(c.this.H, this.a);
                            }
                        } else {
                            c cVar3 = c.this;
                            c.a(cVar3, str2, cVar3.S, c.this.A, str3);
                            if (c.this.O != null) {
                                c.this.O.removeMessages(5);
                            }
                            if (c.this.f14906t != null && !c.this.f14895i) {
                                c.this.f14895i = true;
                                com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.a == null) {
                                    this.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.a.b(c.this.H);
                                this.a.a(b3);
                                c.this.f14906t.a(c.this.H, b3, this.a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                            }
                        }
                    }
                }
                return;
            }
            if (!c.this.f14892f || c.this.f14893g || c.this.O == null) {
                return;
            }
            synchronized (c.this.a) {
                if (c.this.f14893g) {
                    return;
                }
                c.this.f14893g = true;
                c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.mbridge.msdk.reward.adapter.b a = b.m.a();
                        boolean z10 = c.this.I;
                        Handler handler = c.this.O;
                        boolean z11 = c.this.f14911z;
                        boolean z12 = c.this.A;
                        String str4 = str3;
                        String requestIdNotice = AnonymousClass3.this.f14913b.getRequestIdNotice();
                        String str5 = c.this.f14899m;
                        String str6 = str2;
                        String cMPTEntryUrl = AnonymousClass3.this.f14913b.getCMPTEntryUrl();
                        int i10 = c.this.f14910y;
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        a.a(z10, handler, z11, z12, str4, requestIdNotice, str5, str6, cMPTEntryUrl, i10, anonymousClass3.f14913b, c.this.H, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass3.this.f14913b.getCMPTEntryUrl()), str2, c.this.u, new b.j() { // from class: com.mbridge.msdk.reward.adapter.c.3.2.1
                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str7, String str8, String str9, String str10, String str11, a.C0214a c0214a) {
                                c cVar4 = c.this;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = cVar4.H;
                                AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                if (cVar4.a(copyOnWriteArrayList2, anonymousClass32.f14914c, anonymousClass32.f14915d)) {
                                    c cVar5 = c.this;
                                    String str12 = cVar5.f14898l;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    c.a(cVar5, str12, copyOnWriteArrayList, c.this.U, c.this.A);
                                    if (c.this.O != null) {
                                        c.this.O.removeMessages(5);
                                    }
                                    if (c.this.f14906t == null || c.this.f14894h) {
                                        return;
                                    }
                                    c.this.f14894h = true;
                                    AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                    com.mbridge.msdk.foundation.same.report.d.b bVar2 = anonymousClass33.a;
                                    if (bVar2 != null) {
                                        bVar2.b(c.this.H);
                                    }
                                    c.this.f14906t.a(c.this.H, AnonymousClass3.this.a);
                                    return;
                                }
                                c cVar6 = c.this;
                                c.a(cVar6, str9, cVar6.S, c.this.A, str10);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.f14906t == null || c.this.f14895i) {
                                    return;
                                }
                                c.this.f14895i = true;
                                com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                AnonymousClass3 anonymousClass34 = AnonymousClass3.this;
                                if (anonymousClass34.a == null) {
                                    anonymousClass34.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass3 anonymousClass35 = AnonymousClass3.this;
                                anonymousClass35.a.b(c.this.H);
                                AnonymousClass3.this.a.a(b10);
                                c.this.f14906t.a(c.this.S, b10, AnonymousClass3.this.a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                            }

                            @Override // com.mbridge.msdk.reward.adapter.b.j
                            public final void a(String str7, String str8, String str9, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar2) {
                                if (bVar2 != null) {
                                    bVar2.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                                }
                                if (AnonymousClass3.this.f14913b.getRsIgnoreCheckRule() != null && AnonymousClass3.this.f14913b.getRsIgnoreCheckRule().size() > 0 && AnonymousClass3.this.f14913b.getRsIgnoreCheckRule().contains(3)) {
                                    ad.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                    return;
                                }
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                c cVar4 = c.this;
                                c.a(cVar4, str2, cVar4.S, c.this.A, str8);
                                if (c.this.O != null) {
                                    c.this.O.removeMessages(5);
                                }
                                if (c.this.f14906t == null || c.this.f14895i) {
                                    return;
                                }
                                c.this.f14895i = true;
                                AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                                if (anonymousClass32.a == null) {
                                    anonymousClass32.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                AnonymousClass3 anonymousClass33 = AnonymousClass3.this;
                                anonymousClass33.a.b(c.this.H);
                                AnonymousClass3.this.a.a(bVar2);
                                c.this.f14906t.a(c.this.S, bVar2, AnonymousClass3.this.a);
                                ad.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                            }
                        }, false);
                    }
                });
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, final com.mbridge.msdk.foundation.c.b bVar) {
            c.this.f14891e = false;
            if (c.this.f14906t == null || c.this.O == null) {
                return;
            }
            c.this.O.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.3.3
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = c.this;
                    c.a(cVar, cVar.f14898l, copyOnWriteArrayList, c.this.A, "");
                    if (c.this.O != null) {
                        c.this.O.removeMessages(5);
                    }
                    if (!c.this.f14895i && c.this.f14906t != null) {
                        c.this.f14895i = true;
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        if (anonymousClass3.a == null) {
                            anonymousClass3.a = new com.mbridge.msdk.foundation.same.report.d.b();
                        }
                        AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                        anonymousClass32.a.b(c.this.H);
                        com.mbridge.msdk.foundation.c.b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a("errorCode: 3201 errorMessage: campaign resource download failed");
                        }
                        AnonymousClass3.this.a.a(bVar);
                        c.this.f14906t.a(copyOnWriteArrayList, bVar, AnonymousClass3.this.a);
                        ad.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
                    }
                }
            });
        }
    }

    private boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11) {
        return a(list, z10, i10, false, z11);
    }

    public final boolean a(List<CampaignEx> list, boolean z10, int i10) {
        return a(list, z10, i10, false, false);
    }

    public final boolean a(List<CampaignEx> list, boolean z10) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx == null) {
                return false;
            }
            com.mbridge.msdk.videocommon.download.b bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
            String str = this.f14898l;
            j c10 = bVar.c(str);
            if (c10 == null) {
                c10 = bVar.createUnitCache(com.mbridge.msdk.foundation.controller.c.m().c(), str, (CopyOnWriteArrayList<CampaignEx>) list, 94, (com.mbridge.msdk.videocommon.listener.a) null);
            }
            if (c10 != null ? c10.a(list, str) : false) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        ad.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e())) {
                            ad.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        ad.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            ad.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public final boolean a(List<CampaignEx> list, boolean z10, int i10, boolean z11, boolean z12) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            boolean a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.f14898l, this.A, list.size(), z10, i10, list, z11, dVar);
            dVar.a("event_name", "is_ready_crwtpl_" + a10);
            if (z12) {
                a(bVar, dVar, list);
            }
            if (a10) {
                if (z10) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            ad.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z12) {
                        dVar.a("event_name", "is_ready_crwtpl_" + a10);
                        dVar.a("reason", "h5 big template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                } else {
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        ad.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        return true;
                    }
                    String str = this.f14898l + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e();
                    if (z12) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z12) {
                        dVar.a("event_name", "is_ready_crwtpl_" + a10);
                        dVar.a("reason", "h5 template checkPreLoadState error");
                        a(bVar, dVar, list);
                    }
                }
            }
        } else {
            dVar.a("event_name", "is_ready_crwtpl_empty");
            dVar.a("reason", "campaign list is empty error");
        }
        a(bVar, dVar, list);
        return false;
    }

    public final void a(h hVar, String str, String str2, int i10, String str3, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            this.f14905s = hVar;
            if (this.f14897k != null && !an.a(this.f14898l)) {
                Intent intent = new Intent(this.f14897k, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.f14898l);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f14899m);
                intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i10);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.f14911z);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.A);
                intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                CopyOnWriteArrayList<CampaignEx> a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f14898l);
                boolean z10 = false;
                if (a10 != null && a10.size() > 0) {
                    CampaignEx campaignEx = a10.get(0);
                    if (campaignEx != null) {
                        this.f14889c = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z10 = true;
                    }
                    g();
                } else {
                    h hVar2 = this.f14905s;
                    if (hVar2 != null) {
                        hVar2.a(bVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z10);
                if (this.f14911z) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.D);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.E);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.F);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.f14899m, this.f14898l, this.u);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.m() != null && com.mbridge.msdk.foundation.controller.c.m().e() != null) {
                        ((Activity) com.mbridge.msdk.foundation.controller.c.m().e()).startActivity(intent);
                        return;
                    }
                } catch (Throwable th2) {
                    ad.b("RewardMVVideoAdapter", th2.getMessage());
                }
                intent.addFlags(268435456);
                this.f14897k.startActivity(intent);
                return;
            }
            h hVar3 = this.f14905s;
            if (hVar3 != null) {
                hVar3.a(bVar, "context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            h hVar4 = this.f14905s;
            if (hVar4 != null) {
                hVar4.a(bVar, "show failed, exception is " + e2.getMessage());
            }
        }
    }

    public final void a(int i10, int i11, boolean z10, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        a(i10, i11, z10, "", this.I, bVar);
    }

    public final void a(int i10, int i11, boolean z10, String str, boolean z11, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        CampaignEx campaignEx;
        this.f14901o = i10;
        this.f14902p = i11;
        this.f14903q = z10;
        this.K = str;
        this.I = z11;
        boolean z12 = false;
        this.f14896j = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.H;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.H.clear();
        }
        List<CampaignEx> list = this.S;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.T;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f14891e = false;
        this.f14892f = false;
        synchronized (this.a) {
            if (this.f14893g) {
                this.f14893g = false;
            }
        }
        this.f14895i = false;
        this.f14894h = false;
        try {
            z12 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(this.f14897k);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
        if (!z12) {
            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (bVar != null) {
                bVar.a(b3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", bVar);
            return;
        }
        if (this.f14897k == null) {
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (bVar != null) {
                bVar.a(b10);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
            return;
        }
        if (an.a(this.f14898l)) {
            com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (bVar != null) {
                bVar.a(b11);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
            return;
        }
        if (this.u == null) {
            com.mbridge.msdk.foundation.c.b b12 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (bVar != null) {
                bVar.a(b12);
            }
            b("RewardUnitSetting is null", bVar);
            return;
        }
        l();
        m();
        ad.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        i();
        b(str, z11, bVar);
    }

    private void a(String str, boolean z10, final com.mbridge.msdk.foundation.same.report.d.b bVar) {
        boolean z11;
        try {
            if (this.f14897k == null) {
                com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (bVar != null) {
                    bVar.a(b3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", bVar);
                return;
            }
            if (an.a(this.f14898l)) {
                com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (bVar != null) {
                    bVar.a(b10);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", bVar);
                return;
            }
            if (this.u == null) {
                com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (bVar != null) {
                    bVar.a(b11);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", bVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.J < this.u.a() * 1000) {
                    com.mbridge.msdk.foundation.c.b b12 = com.mbridge.msdk.foundation.c.a.b(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (bVar != null) {
                        bVar.a(b12);
                        bVar.c(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", bVar);
                    return;
                }
            }
            com.mbridge.msdk.foundation.same.net.f.e a10 = new d(this.f14899m, this.f14898l, this.f14911z, this.u, bVar != null ? bVar.f() : "").a(this.f14903q, this.f14904r, this.f14900n, k(), "", this.C, str, z10, this.D);
            if (a10 == null) {
                com.mbridge.msdk.foundation.c.b b13 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (bVar != null) {
                    bVar.a(b13);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", bVar);
                return;
            }
            this.Q = System.currentTimeMillis();
            com.mbridge.msdk.reward.d.b bVar2 = new com.mbridge.msdk.reward.d.b(this.f14897k);
            com.mbridge.msdk.reward.d.a aVar = new com.mbridge.msdk.reward.d.a() { // from class: com.mbridge.msdk.reward.adapter.c.2
                @Override // com.mbridge.msdk.reward.d.a
                public final void a(CampaignUnit campaignUnit) {
                    CampaignEx campaignEx;
                    try {
                        c.a(c.this, campaignUnit);
                        c.b(c.this, campaignUnit);
                        if (campaignUnit != null) {
                            c.this.f14888b = campaignUnit.getRequestId();
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                        }
                        if (c.this.H != null && c.this.H.size() > 0 && (campaignEx = (CampaignEx) c.this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                            c.this.H.clear();
                        }
                        if (c.this.S != null) {
                            c.this.S.clear();
                        }
                        c.this.f14891e = false;
                        c.this.f14892f = false;
                        synchronized (c.this.a) {
                            if (c.this.f14893g) {
                                c.this.f14893g = false;
                            }
                            c.this.f14895i = false;
                            c.this.f14894h = false;
                            c.this.b("exception after load success", bVar);
                            c.this.j();
                        }
                    }
                }

                @Override // com.mbridge.msdk.reward.d.a
                public final void a(int i10, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar3) {
                    CampaignEx campaignEx;
                    if (i10 == -1) {
                        c.this.J = System.currentTimeMillis();
                    }
                    if (c.this.H != null && c.this.H.size() > 0 && (campaignEx = (CampaignEx) c.this.H.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                        c.this.H.clear();
                    }
                    if (c.this.S != null) {
                        c.this.S.clear();
                    }
                    c.this.f14891e = false;
                    c.this.f14892f = false;
                    synchronized (c.this.a) {
                        if (c.this.f14893g) {
                            c.this.f14893g = false;
                        }
                    }
                    c.a(c.this, bVar3, i10);
                    c.this.f14895i = false;
                    c.this.f14894h = false;
                    if (!c.this.P) {
                        c.this.a(i10, str2, bVar3);
                    }
                    c.this.j();
                }
            };
            aVar.a(str);
            aVar.setUnitId(this.f14898l);
            aVar.setPlacementId(this.f14899m);
            int i10 = 287;
            aVar.setAdType(this.f14911z ? 287 : 94);
            aVar.a(bVar);
            try {
                com.mbridge.msdk.videocommon.download.h a11 = com.mbridge.msdk.videocommon.download.h.a();
                if (!this.f14911z) {
                    i10 = 94;
                }
                z11 = a11.b(i10);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e2.getMessage());
                }
                z11 = false;
            }
            boolean z12 = z11;
            try {
                if (com.mbridge.msdk.foundation.same.net.e.c.a().a(a10) == null) {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("hst", h());
                    bVar.a("2000125", dVar);
                    com.mbridge.msdk.reward.c.a.a.a().a("2000125", bVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
            if (z12) {
                com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_c", com.mbridge.msdk.foundation.same.a.f13285p);
                com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_r", com.mbridge.msdk.foundation.same.a.f13286q);
                com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_t_w", com.mbridge.msdk.foundation.same.a.f13286q);
                com.mbridge.msdk.videocommon.download.h.a().a("r_v_c_r_r_c", com.mbridge.msdk.foundation.same.a.f13287r);
                bVar2.getCampaign(1, str, a10, aVar, com.mbridge.msdk.foundation.same.c.a(this.f14902p * 1000, 30000L));
                return;
            }
            String str2 = com.mbridge.msdk.foundation.same.a.a;
            try {
                g a12 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
                if (a12 != null) {
                    a12.c();
                    a12.e();
                    a12.b();
                    a12.d();
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardMVVideoAdapter", e11.getMessage());
                }
            }
            bVar2.choiceV3OrV5BySetting(1, a10, aVar, str, com.mbridge.msdk.foundation.same.c.a(this.f14902p * 1000, 30000L));
        } catch (Exception e12) {
            e12.printStackTrace();
            b("Load exception", bVar);
            j();
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            if (bVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            this.O.sendMessage(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.O != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i10;
            if (bVar != null) {
                bVar.c(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.O.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.O.sendMessage(obtain);
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.db.j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.b(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.a(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.a.a.a() != null) {
            com.mbridge.msdk.videocommon.a.a.a().a(str, str2, list);
        }
    }

    public final void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.f14906t = aVar;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z10, boolean z11) {
        com.mbridge.msdk.foundation.same.report.d.b bVar;
        try {
            if (z11) {
                this.S = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.T = copyOnWriteArrayList2;
                bVar = c(copyOnWriteArrayList2);
            } else {
                bVar = this.G.getMetricsData();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e2.getMessage());
            }
            bVar = null;
        }
        a(this.G, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            ad.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z10) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (z11) {
                    dVar.a("cache", 1);
                } else {
                    dVar.a("cache", 2);
                }
                if (bVar != null) {
                    bVar.a("2000127", dVar);
                    bVar.a("2000048", dVar);
                }
                a(bVar);
            }
            CampaignUnit campaignUnit = this.G;
            if (campaignUnit != null) {
                b(campaignUnit.getSessionId());
            }
            b(copyOnWriteArrayList);
            if (copyOnWriteArrayList.size() > 0) {
                ad.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
                a(this.f14899m, this.f14898l, copyOnWriteArrayList);
            }
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            this.H = copyOnWriteArrayList;
            a(campaignEx);
            return;
        }
        ad.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.R)) {
            this.R = "APP ALREADY INSTALLED";
        }
        a(this.R.contains("INSTALL") ? 880021 : 880003, this.R, bVar);
    }

    private void a(CampaignEx campaignEx) {
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f14891e = false;
        this.f14892f = false;
        synchronized (this.a) {
            if (this.f14893g) {
                this.f14893g = false;
            }
        }
        this.f14895i = false;
        this.f14894h = false;
        if (this.A) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        b.m.a().a(this.f14897k, z10, nscpt, this.A, this.f14911z ? 287 : 94, this.f14899m, this.f14898l, campaignEx.getRequestId(), this.H, new AnonymousClass3(campaignEx, z10, nscpt), new AnonymousClass4(campaignEx, z10, nscpt));
        if (z10) {
            b.m.a().a(this.f14897k, campaignEx, this.f14899m, this.f14898l, campaignEx.getRequestId(), new AnonymousClass5(campaignEx, z10, nscpt));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:49:0x0004, B:51:0x000a, B:53:0x0013, B:55:0x0029, B:4:0x0031, B:6:0x0037, B:7:0x0045, B:9:0x004b, B:11:0x0054, B:13:0x005a, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:25:0x008d, B:27:0x0093, B:28:0x0097, B:30:0x009d, B:33:0x00a5, B:38:0x00b1), top: B:48:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:49:0x0004, B:51:0x000a, B:53:0x0013, B:55:0x0029, B:4:0x0031, B:6:0x0037, B:7:0x0045, B:9:0x004b, B:11:0x0054, B:13:0x005a, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:25:0x008d, B:27:0x0093, B:28:0x0097, B:30:0x009d, B:33:0x00a5, B:38:0x00b1), top: B:48:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037 A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:49:0x0004, B:51:0x000a, B:53:0x0013, B:55:0x0029, B:4:0x0031, B:6:0x0037, B:7:0x0045, B:9:0x004b, B:11:0x0054, B:13:0x005a, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:25:0x008d, B:27:0x0093, B:28:0x0097, B:30:0x009d, B:33:0x00a5, B:38:0x00b1), top: B:48:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:49:0x0004, B:51:0x000a, B:53:0x0013, B:55:0x0029, B:4:0x0031, B:6:0x0037, B:7:0x0045, B:9:0x004b, B:11:0x0054, B:13:0x005a, B:14:0x0061, B:16:0x0067, B:19:0x006f, B:25:0x008d, B:27:0x0093, B:28:0x0097, B:30:0x009d, B:33:0x00a5, B:38:0x00b1), top: B:48:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r11, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r13) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            if (r12 == 0) goto L2e
            int r1 = r12.size()     // Catch: java.lang.Exception -> Lc4
            if (r1 <= 0) goto L2e
            r1 = 0
            java.lang.Object r1 = r12.get(r1)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.getRequestId()     // Catch: java.lang.Exception -> Lc4
            int r3 = r1.getVcn()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r4 = r1.getBidToken()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r5 = r1.getNLRid()     // Catch: java.lang.Exception -> Lc4
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lc4
            if (r5 == 0) goto L31
            java.lang.String r0 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> Lc4
            goto L31
        L2e:
            r3 = 1
            r2 = r0
            r4 = r2
        L31:
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto L45
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r1.b(r11, r0)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r0.b(r11)     // Catch: java.lang.Exception -> Lc4
        L45:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L52
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()     // Catch: java.lang.Exception -> Lc4
            r0.b(r11, r3)     // Catch: java.lang.Exception -> Lc4
        L52:
            if (r12 == 0) goto L8b
            int r0 = r12.size()     // Catch: java.lang.Exception -> Lc4
            if (r0 <= 0) goto L8b
            com.mbridge.msdk.reward.b.a.a(r2, r4)     // Catch: java.lang.Exception -> Lc4
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> Lc4
        L61:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch: java.lang.Exception -> Lc4
            if (r0 == 0) goto L61
            java.lang.String r1 = r0.getCampaignUnitId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r2 = r0.getRequestId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r3 = r0.getId()     // Catch: java.lang.Exception -> Lc4
            long r4 = r0.getPlct()     // Catch: java.lang.Exception -> Lc4
            long r6 = r0.getPlctb()     // Catch: java.lang.Exception -> Lc4
            long r8 = r0.getTimestamp()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.same.a.b.a(r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Exception -> Lc4
            goto L61
        L8b:
            if (r13 == 0) goto Lb1
            int r12 = r13.size()     // Catch: java.lang.Exception -> Lc4
            if (r12 <= 0) goto Lb1
            java.util.Iterator r12 = r13.iterator()     // Catch: java.lang.Exception -> Lc4
        L97:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r13 == 0) goto Lb1
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = (com.mbridge.msdk.foundation.entity.CampaignEx) r13     // Catch: java.lang.Exception -> Lc4
            if (r13 == 0) goto L97
            java.lang.String r0 = r13.getCampaignUnitId()     // Catch: java.lang.Exception -> Lc4
            java.lang.String r13 = r13.getRequestId()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.same.a.b.c(r0, r13)     // Catch: java.lang.Exception -> Lc4
            goto L97
        Lb1:
            com.mbridge.msdk.foundation.same.a.b.c(r11)     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.controller.c r11 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Exception -> Lc4
            android.content.Context r11 = r11.c()     // Catch: java.lang.Exception -> Lc4
            com.mbridge.msdk.foundation.db.b r11 = com.mbridge.msdk.foundation.db.b.a(r11)     // Catch: java.lang.Exception -> Lc4
            r11.a()     // Catch: java.lang.Exception -> Lc4
            goto Lcc
        Lc4:
            r11 = move-exception
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto Lcc
            r11.printStackTrace()
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x01a1, code lost:
    
        if (com.mbridge.msdk.foundation.tools.an.a(r4.getVideoUrlEncode()) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0201, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021a, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0203, code lost:
    
        com.mbridge.msdk.foundation.tools.ad.b("RewardMVVideoAdapter", r14.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> a(com.mbridge.msdk.foundation.entity.CampaignUnit r14) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.concurrent.CopyOnWriteArrayList");
    }

    private void a(final CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.c.7
            @Override // java.lang.Runnable
            public final void run() {
                com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f14897k)).a();
                CampaignUnit campaignUnit2 = campaignUnit;
                if (campaignUnit2 != null && campaignUnit2.getAds() != null && campaignUnit.getAds().size() > 0) {
                    c.a(c.this, campaignUnit.getAds());
                }
            }
        });
    }

    public final void a(List<CampaignEx> list) {
        this.U = list;
    }

    public final void a(int i10, int i11, int i12) {
        this.D = i10;
        this.E = i11;
        this.F = i12;
    }

    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.u != null && TextUtils.isEmpty(str)) {
            int b3 = this.u.b() * 1000;
            List<CampaignEx> list = this.U;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.U.get(0).getTimestamp() < b3) {
                    b("hit ltorwc", bVar);
                    return;
                }
            }
        }
        a(str, this.I, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        if (message == null) {
            return bVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid")) : bVar;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return bVar;
            }
            e2.printStackTrace();
            return bVar;
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.same.report.d.d dVar, List<CampaignEx> list) {
        if (bVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        bVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            bVar.c(campaignEx.getLocalRequestId());
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            bVar.d(this.f14898l);
            bVar.b(this.f14911z ? 287 : 94);
            if (dVar != null) {
                bVar.a("m_temp_is_ready_check", dVar);
            }
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        }
    }

    public static /* synthetic */ void a(c cVar, String str, List list, List list2, boolean z10) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z10);
        if (list2 != null && list2.size() > 0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    StringBuilder n10 = eb.j.n(str, "_");
                    n10.append(campaignEx.getId());
                    n10.append("_");
                    n10.append(campaignEx.getRequestId());
                    n10.append("_");
                    n10.append(campaignEx.getRewardTemplateMode().e());
                    com.mbridge.msdk.videocommon.a.b(n10.toString());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z10) {
            cVar.a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = (CampaignEx) list.get(0);
            com.mbridge.msdk.reward.a.a aVar = new com.mbridge.msdk.reward.a.a(str, cVar.f14911z);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void a(c cVar, String str, List list, boolean z10, String str2) {
        CampaignEx campaignEx;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && ((campaignEx = (CampaignEx) list.get(0)) == null || TextUtils.isEmpty(campaignEx.getEcppv()) || TextUtils.isEmpty(str2))) {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (List<CampaignEx>) list, z10);
        } else {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(str, (CampaignEx) null, z10, str2);
        }
    }

    public static /* synthetic */ void a(c cVar, CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("result", 1);
                dVar.a("timeout", Integer.valueOf(cVar.f14902p));
                dVar.a("hst", cVar.h());
                metricsData.b(campaignUnit.getAds());
                metricsData.a("2000126", dVar);
                campaignUnit.setLocalRequestId(metricsData.f());
                com.mbridge.msdk.reward.c.a.a.a().a("2000126", metricsData);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #0 {Exception -> 0x00a2, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002c, B:17:0x004a, B:19:0x0052, B:21:0x0056, B:24:0x005f, B:25:0x0078, B:26:0x006d, B:27:0x008e, B:31:0x0027), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: Exception -> 0x00a2, TryCatch #0 {Exception -> 0x00a2, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:15:0x002c, B:17:0x004a, B:19:0x0052, B:21:0x0056, B:24:0x005f, B:25:0x0078, B:26:0x006d, B:27:0x008e, B:31:0x0027), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.mbridge.msdk.reward.adapter.c r5, com.mbridge.msdk.foundation.same.report.d.b r6, int r7) {
        /*
            java.lang.String r0 = "2000126"
            if (r6 == 0) goto Laa
            boolean r1 = r6.r()     // Catch: java.lang.Exception -> La2
            if (r1 != 0) goto Laa
            com.mbridge.msdk.foundation.same.report.d.d r1 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> La2
            r1.<init>()     // Catch: java.lang.Exception -> La2
            r2 = 3
            java.lang.String r3 = "result"
            if (r7 == r2) goto L27
            r2 = 880023(0xd6d97, float:1.233175E-39)
            if (r7 == r2) goto L27
            r2 = 880041(0xd6da9, float:1.2332E-39)
            if (r7 == r2) goto L27
            switch(r7) {
                case 10: goto L27;
                case 11: goto L27;
                case 12: goto L27;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "1"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> La2
            goto L2c
        L27:
            java.lang.String r7 = "2"
            r1.a(r3, r7)     // Catch: java.lang.Exception -> La2
        L2c:
            java.lang.String r7 = "timeout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r2.<init>()     // Catch: java.lang.Exception -> La2
            int r3 = r5.f14902p     // Catch: java.lang.Exception -> La2
            r2.append(r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> La2
            r1.a(r7, r2)     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.c.b r7 = r6.o()     // Catch: java.lang.Exception -> La2
            if (r7 == 0) goto L8e
            java.lang.String r2 = "campaign_request_error"
            java.lang.Object r2 = r7.a(r2)     // Catch: java.lang.Exception -> La2
            if (r2 == 0) goto L8e
            boolean r3 = r2 instanceof com.mbridge.msdk.foundation.same.net.a.a     // Catch: java.lang.Exception -> La2
            if (r3 == 0) goto L8e
            r3 = r2
            com.mbridge.msdk.foundation.same.net.a.a r3 = (com.mbridge.msdk.foundation.same.net.a.a) r3     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.same.net.d.a r3 = r3.f13365c     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = "code"
            if (r3 == 0) goto L6d
            com.mbridge.msdk.foundation.same.net.a.a r2 = (com.mbridge.msdk.foundation.same.net.a.a) r2     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.foundation.same.net.d.a r2 = r2.f13365c     // Catch: java.lang.Exception -> La2
            int r2 = r2.f13370d     // Catch: java.lang.Exception -> La2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> La2
            r1.a(r4, r2)     // Catch: java.lang.Exception -> La2
            goto L78
        L6d:
            int r2 = r7.a()     // Catch: java.lang.Exception -> La2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> La2
            r1.a(r4, r2)     // Catch: java.lang.Exception -> La2
        L78:
            java.lang.String r2 = "reason"
            java.lang.String r3 = r7.b()     // Catch: java.lang.Exception -> La2
            r1.a(r2, r3)     // Catch: java.lang.Exception -> La2
            java.lang.String r2 = "err_desc"
            java.lang.String r7 = r7.l()     // Catch: java.lang.Exception -> La2
            r1.a(r2, r7)     // Catch: java.lang.Exception -> La2
            r7 = 0
            r6.a(r7)     // Catch: java.lang.Exception -> La2
        L8e:
            java.lang.String r7 = "hst"
            java.lang.String r5 = r5.h()     // Catch: java.lang.Exception -> La2
            r1.a(r7, r5)     // Catch: java.lang.Exception -> La2
            r6.a(r0, r1)     // Catch: java.lang.Exception -> La2
            com.mbridge.msdk.reward.c.a.a r5 = com.mbridge.msdk.reward.c.a.a.a()     // Catch: java.lang.Exception -> La2
            r5.a(r0, r6)     // Catch: java.lang.Exception -> La2
            goto Laa
        La2:
            r5 = move-exception
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto Laa
            r5.printStackTrace()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.c.a(com.mbridge.msdk.reward.adapter.c, com.mbridge.msdk.foundation.same.report.d.b, int):void");
    }

    public static /* synthetic */ void a(c cVar, List list) {
        if (cVar.f14897k == null || list == null || list.size() == 0) {
            return;
        }
        com.mbridge.msdk.foundation.db.j a10 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(cVar.f14897k));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i10);
            if (campaignEx != null) {
                if (com.mbridge.msdk.e.b.a()) {
                    if (!ai.c(cVar.f14897k, campaignEx.getPackageName())) {
                        cVar.a(a10, campaignEx);
                    }
                } else {
                    cVar.a(a10, campaignEx);
                }
            }
        }
    }
}
