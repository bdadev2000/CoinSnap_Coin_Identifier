package com.mbridge.msdk.newreward.function.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14681b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14682c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14683d;

    /* renamed from: g, reason: collision with root package name */
    private Handler f14686g;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f14688i;

    /* renamed from: l, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.d f14691l;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f14689j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f14690k = false;

    /* renamed from: e, reason: collision with root package name */
    private final int f14684e = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, 120000);

    /* renamed from: h, reason: collision with root package name */
    private final long f14687h = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, Constants.THIRTY_MINUTES);

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14685f = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        private final Handler a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference<b> f14698b;

        /* renamed from: c, reason: collision with root package name */
        private final long f14699c;

        public a(Handler handler, b bVar, long j3) {
            this.a = handler;
            this.f14698b = new WeakReference<>(bVar);
            this.f14699c = j3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f14698b.get();
            if (bVar != null) {
                try {
                    b.a(bVar);
                } catch (Exception e2) {
                    ad.a("LoadCheckController", "startCheckTask error: " + e2.getMessage());
                }
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.postDelayed(this, this.f14699c);
            }
        }
    }

    public b(int i10, String str, String str2, boolean z10) {
        this.a = i10;
        this.f14681b = str;
        this.f14682c = str2;
        this.f14683d = z10;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar, com.mbridge.msdk.newreward.a.d dVar) {
        if (cVar != null && dVar != null) {
            if (!this.f14685f) {
                a();
                return;
            }
            this.f14691l = dVar;
            this.f14688i = cVar;
            HandlerThread handlerThread = new HandlerThread("load_check_controller");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f14686g = handler;
            handler.postDelayed(new a(handler, this, this.f14684e), this.f14684e);
            return;
        }
        a();
    }

    private void a() {
        com.mbridge.msdk.newreward.function.e.c.a().b().b(this.a, this.f14681b, this.f14682c);
    }

    private void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        eVar.y().a(bVar, bVar2);
    }

    private com.mbridge.msdk.newreward.a.e a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        com.mbridge.msdk.newreward.a.e eVar = new com.mbridge.msdk.newreward.a.e(false, this.a, bVar.f(), this.f14682c, bVar.g());
        eVar.e(bVar.e());
        eVar.e(30000);
        eVar.f(60000);
        eVar.d(this.f14681b);
        eVar.e(true);
        eVar.f(false);
        eVar.g(false);
        return eVar;
    }

    public static /* synthetic */ void a(b bVar) {
        if (bVar.f14691l.a() != null) {
            Iterator<com.mbridge.msdk.newreward.a.e> it = bVar.f14691l.a().iterator();
            while (it.hasNext()) {
                if (it.next().s() == 1) {
                    return;
                }
            }
        }
        if (bVar.f14689j) {
            return;
        }
        bVar.f14689j = true;
        com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a, bVar.f14681b, bVar.f14682c, bVar.f14683d, new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.f.b.1
            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a(List<com.mbridge.msdk.newreward.function.d.a.b> list) {
                b.a(b.this, list);
            }

            @Override // com.mbridge.msdk.newreward.function.e.b
            public final void a() {
                b.a(b.this, (com.mbridge.msdk.newreward.a.e) null, (com.mbridge.msdk.newreward.function.d.a.b) null);
            }
        });
    }

    public static /* synthetic */ void a(b bVar, List list) {
        Iterator it = list.iterator();
        final com.mbridge.msdk.newreward.function.d.a.b bVar2 = null;
        final com.mbridge.msdk.newreward.function.d.a.b bVar3 = null;
        while (it.hasNext()) {
            com.mbridge.msdk.newreward.function.d.a.b bVar4 = (com.mbridge.msdk.newreward.function.d.a.b) it.next();
            if (bVar4.g()) {
                long G = bVar4.G();
                if (G == 0) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (TextUtils.isEmpty(bVar4.f())) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (System.currentTimeMillis() - G > bVar.f14687h && bVar4.s() == null) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (bVar4.q() > 0.0d || bVar4.E() == 1) {
                    if (bVar3 != null && bVar4.q() <= bVar3.q()) {
                    }
                    bVar3 = bVar4;
                } else {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                }
            } else if (bVar4.G() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else if (bVar4.C() == null || bVar4.C().size() == 0) {
                com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
            } else {
                if (bVar3 != null && bVar4.G() <= bVar3.G()) {
                }
                bVar3 = bVar4;
            }
        }
        if (list.size() != 0 && !bVar.f14690k) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.newreward.function.d.a.b bVar5 = (com.mbridge.msdk.newreward.function.d.a.b) it2.next();
                if (bVar5 != bVar3 && bVar5.s() != null && (bVar2 == null || bVar5.G() > bVar2.G())) {
                    bVar2 = bVar5;
                }
            }
        }
        if (!bVar.f14690k && bVar2 != null) {
            bVar.f14690k = true;
            final com.mbridge.msdk.newreward.a.e a10 = bVar.a(bVar2);
            try {
                com.mbridge.msdk.newreward.function.c.c cVar = bVar.f14688i;
                cVar.a(a10, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "download_start_resource", "campaign", bVar2));
            } catch (Exception e2) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
            }
            bVar.a(a10, bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.3
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.this.f14690k = false;
                    try {
                        b.this.f14688i.a(a10, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f14688i.a("check_type", "download_success", "campaign", bVar2));
                    } catch (Exception e10) {
                        com.applovin.impl.mediation.ads.e.p(e10, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.this.f14690k = false;
                    try {
                        b.this.f14688i.a(a10, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f14688i.a("check_type", "download_failed", "campaign", bVar2));
                    } catch (Exception e10) {
                        com.applovin.impl.mediation.ads.e.p(e10, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
                    }
                }
            });
        }
        if (bVar3 != null) {
            List<CampaignEx> C = bVar3.C();
            final com.mbridge.msdk.newreward.a.e a11 = bVar.a(bVar3);
            if (C == null) {
                try {
                    com.mbridge.msdk.newreward.function.c.c cVar2 = bVar.f14688i;
                    cVar2.a(a11, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar2.a("check_type", "check_start_campaign"));
                } catch (Exception e10) {
                    com.applovin.impl.mediation.ads.e.p(e10, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
                }
                com.mbridge.msdk.newreward.function.c.c cVar3 = bVar.f14688i;
                cVar3.a(cVar3.a("command_manager", cVar3, "adapter_model", a11), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.4
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        b.a(b.this, bVar3, a11);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                        b.a(b.this, a11, bVar3);
                    }
                });
                return;
            }
            try {
                com.mbridge.msdk.newreward.function.c.c cVar4 = bVar.f14688i;
                cVar4.a(a11, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar4.a("check_type", "check_start_resource"));
            } catch (Exception e11) {
                com.applovin.impl.mediation.ads.e.p(e11, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
            }
            bVar.a(a11, bVar3, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.2
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.a(b.this, bVar3, a11);
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.a(b.this, a11, bVar3);
                }
            });
            return;
        }
        bVar.f14689j = false;
    }

    public static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar2) {
        Map a10;
        bVar.f14689j = false;
        if (eVar == null) {
            return;
        }
        try {
            if (bVar2 == null) {
                a10 = bVar.f14688i.a("check_type", "check_failed");
            } else {
                a10 = bVar.f14688i.a("check_type", "check_failed", "campaign", bVar2);
            }
            bVar.f14688i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, a10);
        } catch (Exception e2) {
            com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("reportLoadCheckFailed error: "), "LoadCheckController");
        }
    }

    public static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.a.e eVar) {
        bVar.f14689j = false;
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = bVar.f14688i;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "check_success", "campaign", bVar2));
        eVar.d(true);
        if (!bVar2.g() || bVar2.q() <= 0.0d) {
            bVar.f14691l.a(eVar);
        }
    }
}
