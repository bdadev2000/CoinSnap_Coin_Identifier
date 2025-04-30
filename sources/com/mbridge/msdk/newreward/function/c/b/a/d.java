package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import com.mbridge.msdk.newreward.function.d.c.n;
import java.util.Map;
import java.util.UUID;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class d implements a.InterfaceC0173a, com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.a.a f17065a;
    com.mbridge.msdk.newreward.a.b.b b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f17066c;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f17067d;

    /* renamed from: e, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.b.b.c f17068e;

    /* renamed from: i, reason: collision with root package name */
    private Map f17072i;

    /* renamed from: f, reason: collision with root package name */
    private String f17069f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    private String f17070g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    private long f17071h = 10000;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f17073j = false;

    /* loaded from: classes3.dex */
    public class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17069f);
            d dVar = d.this;
            dVar.b.a(dVar.f17066c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f17067d, dVar.f17066c, 2);
            com.mbridge.msdk.newreward.function.c.b.b.c cVar = d.this.f17068e;
            if (cVar == null || !cVar.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17069f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f17067d.p(), d.this.f17067d.w(), d.this.f17067d.A(), d.this.f17067d.z(), 404);
                d.this.b.a(bVar);
                return;
            }
            d.this.f17068e.a(eVar, this);
        }
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e r9;
        com.mbridge.msdk.videocommon.d.c b8;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f17067d;
            if (eVar == null || (r9 = eVar.r()) == null || (b8 = r9.b()) == null) {
                return 60000;
            }
            return b8.F() * 1000;
        } catch (Exception unused) {
            return 60000;
        }
    }

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f17065a = aVar;
        this.f17068e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.b = bVar2;
            int b8 = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f17069f, b8, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.f17072i = map;
            this.f17066c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.f17072i.get("adapter_model");
            this.f17067d = eVar;
            eVar.f(b8);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f17066c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.f17067d;
            cVar.a(eVar2, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START, cVar.a("auto_load", Integer.valueOf(eVar2.B() ? 2 : 1), "hst", com.mbridge.msdk.foundation.same.net.e.d.f().a(this.f17067d.C())));
            this.f17065a.a(bVar, new a(bVar, this.f17072i));
            long a6 = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.f17071h = a6;
            if (a6 > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.f17070g, this.f17071h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f17067d.p(), this.f17067d.w(), this.f17067d.A(), this.f17067d.z(), !TextUtils.isEmpty(this.f17067d.C()), this.f17067d.C(), this.f17067d.L());
        } catch (Exception e4) {
            ad.b("LoadControllerReceiver", "action", e4);
            if (this.f17067d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f17067d.p(), this.f17067d.w(), this.f17067d.A(), this.f17067d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f17070g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f17069f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e4.getMessage()));
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class a implements com.mbridge.msdk.newreward.a.b.b {
        private final com.mbridge.msdk.newreward.function.c.b b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f17075c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.b = bVar;
            this.f17075c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b a6;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17070g);
            if (d.this.f17073j) {
                return;
            }
            d.this.f17073j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar = dVar.f17066c;
            com.mbridge.msdk.newreward.a.e eVar = dVar.f17067d;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS, cVar.a("metrics_data", bVar, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "result", 1, "cache", 2, "timeout", Integer.valueOf(d.this.f17067d.I()), "hst", bVar != null ? bVar.H() : ""));
            d dVar2 = d.this;
            dVar2.b.a(dVar2.f17066c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.f17066c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d dVar3 = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar2 = dVar3.f17066c;
            cVar2.d(cVar2.a("adapter_model", dVar3.f17067d, "campaign", bVar));
            try {
                d dVar4 = d.this;
                com.mbridge.msdk.newreward.function.c.c cVar3 = dVar4.f17066c;
                cVar3.c(cVar3.a("adapter_model", dVar4.f17067d, "campaign", bVar));
                this.b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.f17075c.put("campaign", bVar);
                this.b.a(this.f17075c);
                d dVar5 = d.this;
                dVar5.f17065a.a(this.b, new b());
            } catch (MBridgeError e4) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17069f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e4.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    a6 = com.mbridge.msdk.foundation.c.a.a(e4.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e4.getErrorMessage());
                } else {
                    a6 = com.mbridge.msdk.foundation.c.a.a(e4.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e4.getErrorMessage());
                }
                d.this.b.a(a6);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            int i9 = 1;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f17067d, dVar.f17066c, 1);
            if (!d.this.f17068e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17070g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f17069f);
                if (d.this.f17073j) {
                    return;
                }
                d.this.f17073j = true;
                try {
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.c.c cVar = dVar2.f17066c;
                    com.mbridge.msdk.newreward.a.e eVar2 = dVar2.f17067d;
                    com.mbridge.msdk.newreward.function.c.e eVar3 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL;
                    Integer valueOf = Integer.valueOf(eVar2.B() ? 2 : 1);
                    if (!bVar.m()) {
                        i9 = 2;
                    }
                    cVar.a(eVar2, eVar3, cVar.a("auto_load", valueOf, "result", Integer.valueOf(i9), "code", Integer.valueOf(bVar.i()), "reason", bVar.b(), "timeout", Integer.valueOf(d.this.f17067d.I()), "hst", bVar.j(), "err_desc", bVar.l()));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.f17066c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f17067d.p(), d.this.f17067d.w(), d.this.f17067d.A(), d.this.f17067d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.b.a(bVar);
                return;
            }
            d.this.f17068e.a(eVar, this);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0173a
    public final void a(String str, long j7) {
        if (TextUtils.equals(str, this.f17069f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f17067d.p(), this.f17067d.w(), this.f17067d.A(), this.f17067d.z(), 405);
            this.b.a(new com.mbridge.msdk.foundation.c.b(880010, AbstractC2914a.d("errorCode: 3401 errorMessage: ", a())));
        } else {
            if (!TextUtils.equals(str, this.f17070g) || this.f17068e == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.f17067d, this.f17066c, 3);
            com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f17066c;
            bVar.a(cVar.a("adapter_model", this.f17067d, "command_manager", cVar));
            this.f17068e.a(eVar, new a(bVar, this.f17072i));
        }
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f17067d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b b8 = this.f17067d.x().b();
                if (b8 != null && b8.s() != null && b8.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : b8.s()) {
                        if (aVar != null) {
                            n d2 = aVar.d();
                            if (d2 != null && !d2.c()) {
                                sb.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> c9 = aVar.c();
                            if (c9 != null && !c9.c()) {
                                sb.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> f9 = aVar.f();
                            if (f9 != null && !f9.c()) {
                                sb.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb.append(" load timeout ");
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        return sb.toString();
    }
}
