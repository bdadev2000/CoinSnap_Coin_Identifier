package com.mbridge.msdk.newreward.function.f;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f17307a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17308c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17309d;

    /* renamed from: g, reason: collision with root package name */
    private Handler f17312g;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f17314i;
    private com.mbridge.msdk.newreward.a.d l;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f17315j = false;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f17316k = false;

    /* renamed from: e, reason: collision with root package name */
    private final int f17310e = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_INTERVAL, 120000);

    /* renamed from: h, reason: collision with root package name */
    private final long f17313h = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_TOKEN_VALIDITY_PERIOD, Constants.THIRTY_MINUTES);

    /* renamed from: f, reason: collision with root package name */
    private final boolean f17311f = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_LOAD_CHECK_OPTIMIZED, false);

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f17324a;
        private final WeakReference<b> b;

        /* renamed from: c, reason: collision with root package name */
        private final long f17325c;

        public a(Handler handler, b bVar, long j7) {
            this.f17324a = handler;
            this.b = new WeakReference<>(bVar);
            this.f17325c = j7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.b.get();
            if (bVar != null) {
                try {
                    b.a(bVar);
                } catch (Exception e4) {
                    ad.a("LoadCheckController", "startCheckTask error: " + e4.getMessage());
                }
            }
            Handler handler = this.f17324a;
            if (handler != null) {
                handler.postDelayed(this, this.f17325c);
            }
        }
    }

    public b(int i9, String str, String str2, boolean z8) {
        this.f17307a = i9;
        this.b = str;
        this.f17308c = str2;
        this.f17309d = z8;
    }

    public final void a(com.mbridge.msdk.newreward.function.c.c cVar, com.mbridge.msdk.newreward.a.d dVar) {
        if (cVar != null && dVar != null) {
            if (!this.f17311f) {
                a();
                return;
            }
            this.l = dVar;
            this.f17314i = cVar;
            HandlerThread handlerThread = new HandlerThread("load_check_controller");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f17312g = handler;
            handler.postDelayed(new a(handler, this, this.f17310e), this.f17310e);
            return;
        }
        a();
    }

    private void a() {
        com.mbridge.msdk.newreward.function.e.c.a().b().b(this.f17307a, this.b, this.f17308c);
    }

    private void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        eVar.y().a(bVar, bVar2);
    }

    private com.mbridge.msdk.newreward.a.e a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        com.mbridge.msdk.newreward.a.e eVar = new com.mbridge.msdk.newreward.a.e(false, this.f17307a, bVar.f(), this.f17308c, bVar.g());
        eVar.e(bVar.e());
        eVar.e(30000);
        eVar.f(60000);
        eVar.d(this.b);
        eVar.e(true);
        eVar.f(false);
        eVar.g(false);
        return eVar;
    }

    public static /* synthetic */ void a(b bVar) {
        if (bVar.l.a() != null) {
            Iterator<com.mbridge.msdk.newreward.a.e> it = bVar.l.a().iterator();
            while (it.hasNext()) {
                if (it.next().s() == 1) {
                    return;
                }
            }
        }
        if (bVar.f17315j) {
            return;
        }
        bVar.f17315j = true;
        com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.f17307a, bVar.b, bVar.f17308c, bVar.f17309d, new com.mbridge.msdk.newreward.function.e.b() { // from class: com.mbridge.msdk.newreward.function.f.b.1
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
                long G3 = bVar4.G();
                if (G3 == 0) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (TextUtils.isEmpty(bVar4.f())) {
                    com.mbridge.msdk.newreward.function.e.c.a().b().b(bVar4.a(), bVar4.b(), bVar4.c(), bVar4.e(), 8);
                } else if (System.currentTimeMillis() - G3 > bVar.f17313h && bVar4.s() == null) {
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
        if (list.size() != 0 && !bVar.f17316k) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.mbridge.msdk.newreward.function.d.a.b bVar5 = (com.mbridge.msdk.newreward.function.d.a.b) it2.next();
                if (bVar5 != bVar3 && bVar5.s() != null && (bVar2 == null || bVar5.G() > bVar2.G())) {
                    bVar2 = bVar5;
                }
            }
        }
        if (!bVar.f17316k && bVar2 != null) {
            bVar.f17316k = true;
            final com.mbridge.msdk.newreward.a.e a6 = bVar.a(bVar2);
            try {
                com.mbridge.msdk.newreward.function.c.c cVar = bVar.f17314i;
                cVar.a(a6, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "download_start_resource", "campaign", bVar2));
            } catch (Exception e4) {
                L.s(e4, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
            }
            bVar.a(a6, bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.3
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.this.f17316k = false;
                    try {
                        b.this.f17314i.a(a6, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f17314i.a("check_type", "download_success", "campaign", bVar2));
                    } catch (Exception e9) {
                        L.s(e9, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.this.f17316k = false;
                    try {
                        b.this.f17314i.a(a6, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, b.this.f17314i.a("check_type", "download_failed", "campaign", bVar2));
                    } catch (Exception e9) {
                        L.s(e9, new StringBuilder("handlerAnthonyNeedDownloadCampaign error: "), "LoadCheckController");
                    }
                }
            });
        }
        if (bVar3 != null) {
            List<CampaignEx> C8 = bVar3.C();
            final com.mbridge.msdk.newreward.a.e a9 = bVar.a(bVar3);
            if (C8 == null) {
                try {
                    com.mbridge.msdk.newreward.function.c.c cVar2 = bVar.f17314i;
                    cVar2.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar2.a("check_type", "check_start_campaign"));
                } catch (Exception e9) {
                    L.s(e9, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
                }
                com.mbridge.msdk.newreward.function.c.c cVar3 = bVar.f17314i;
                cVar3.a(cVar3.a("command_manager", cVar3, "adapter_model", a9), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.4
                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(Object obj) {
                        b.a(b.this, bVar3, a9);
                    }

                    @Override // com.mbridge.msdk.newreward.a.b.b
                    public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                        b.a(b.this, a9, bVar3);
                    }
                });
                return;
            }
            try {
                com.mbridge.msdk.newreward.function.c.c cVar4 = bVar.f17314i;
                cVar4.a(a9, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar4.a("check_type", "check_start_resource"));
            } catch (Exception e10) {
                L.s(e10, new StringBuilder("handlerLoadFailedCampaigns error: "), "LoadCheckController");
            }
            bVar.a(a9, bVar3, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.f.b.2
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    b.a(b.this, bVar3, a9);
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar6) {
                    b.a(b.this, a9, bVar3);
                }
            });
            return;
        }
        bVar.f17315j = false;
    }

    public static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar2) {
        bVar.f17315j = false;
        if (eVar == null) {
            return;
        }
        try {
            bVar.f17314i.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, bVar2 == null ? bVar.f17314i.a("check_type", "check_failed") : bVar.f17314i.a("check_type", "check_failed", "campaign", bVar2));
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("reportLoadCheckFailed error: "), "LoadCheckController");
        }
    }

    public static /* synthetic */ void a(b bVar, com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.a.e eVar) {
        bVar.f17315j = false;
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = bVar.f17314i;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK, cVar.a("check_type", "check_success", "campaign", bVar2));
        eVar.d(true);
        if (!bVar2.g() || bVar2.q() <= 0.0d) {
            bVar.l.a(eVar);
        }
    }
}
