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

/* loaded from: classes4.dex */
public final class d implements a.InterfaceC0185a, com.mbridge.msdk.newreward.function.c.b.a {
    com.mbridge.msdk.newreward.function.c.a.a a;

    /* renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.b.b f14457b;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.c f14458c;

    /* renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f14459d;

    /* renamed from: e, reason: collision with root package name */
    com.mbridge.msdk.newreward.function.c.b.b.c f14460e;

    /* renamed from: i, reason: collision with root package name */
    private Map f14464i;

    /* renamed from: f, reason: collision with root package name */
    private String f14461f = UUID.randomUUID().toString();

    /* renamed from: g, reason: collision with root package name */
    private String f14462g = UUID.randomUUID().toString();

    /* renamed from: h, reason: collision with root package name */
    private long f14463h = 10000;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f14465j = false;

    /* loaded from: classes4.dex */
    public class b implements com.mbridge.msdk.newreward.a.b.b {
        private b() {
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14461f);
            d dVar = d.this;
            dVar.f14457b.a(dVar.f14458c.a("type", 2, "object", obj));
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f14459d, dVar.f14458c, 2);
            com.mbridge.msdk.newreward.function.c.b.b.c cVar = d.this.f14460e;
            if (cVar != null && cVar.a(eVar)) {
                d.this.f14460e.a(eVar, this);
                return;
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14461f);
            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f14459d.p(), d.this.f14459d.w(), d.this.f14459d.A(), d.this.f14459d.z(), 404);
            d.this.f14457b.a(bVar);
        }
    }

    private int b() {
        com.mbridge.msdk.newreward.function.f.e r6;
        com.mbridge.msdk.videocommon.d.c b3;
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f14459d;
            if (eVar == null || (r6 = eVar.r()) == null || (b3 = r6.b()) == null) {
                return 60000;
            }
            return b3.F() * 1000;
        } catch (Exception unused) {
            return 60000;
        }
    }

    public final void a(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.a = aVar;
        this.f14460e = new com.mbridge.msdk.newreward.function.c.b.b.c(aVar);
    }

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        try {
            this.f14457b = bVar2;
            int b3 = b();
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f14461f, b3, this);
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            Map map = (Map) bVar.b();
            this.f14464i = map;
            this.f14458c = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            com.mbridge.msdk.newreward.a.e eVar = (com.mbridge.msdk.newreward.a.e) this.f14464i.get("adapter_model");
            this.f14459d = eVar;
            eVar.f(b3);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f14458c;
            com.mbridge.msdk.newreward.a.e eVar2 = this.f14459d;
            com.mbridge.msdk.newreward.function.c.e eVar3 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START;
            Object[] objArr = new Object[4];
            objArr[0] = "auto_load";
            objArr[1] = Integer.valueOf(eVar2.B() ? 2 : 1);
            objArr[2] = "hst";
            objArr[3] = com.mbridge.msdk.foundation.same.net.e.d.f().a(this.f14459d.C());
            cVar.a(eVar2, eVar3, cVar.a(objArr));
            this.a.a(bVar, new a(bVar, this.f14464i));
            long a10 = af.a().a(MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY, MBridgeCommon.SettingConfig.KEY_SETTING_CONFIG_RETRY_STRATEGY_CAMPAIGN_RETRY_TIMEOUT, 0);
            this.f14463h = a10;
            if (a10 > 0) {
                com.mbridge.msdk.newreward.a.c.a.a().a(this.f14462g, this.f14463h, this);
            }
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f14459d.p(), this.f14459d.w(), this.f14459d.A(), this.f14459d.z(), !TextUtils.isEmpty(this.f14459d.C()), this.f14459d.C(), this.f14459d.L());
        } catch (Exception e2) {
            ad.b("LoadControllerReceiver", "action", e2);
            if (this.f14459d != null) {
                com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f14459d.p(), this.f14459d.w(), this.f14459d.A(), this.f14459d.z(), 8);
            }
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f14462g);
            com.mbridge.msdk.newreward.a.c.a.a().a(this.f14461f);
            if (bVar2 != null) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e2.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.c.b f14466b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f14467c;

        public a(com.mbridge.msdk.newreward.function.c.b bVar, Map map) {
            this.f14466b = bVar;
            this.f14467c = map;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.foundation.c.b a;
            com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14462g);
            if (d.this.f14465j) {
                return;
            }
            d.this.f14465j = true;
            com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
            d dVar = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar = dVar.f14458c;
            com.mbridge.msdk.newreward.a.e eVar = dVar.f14459d;
            com.mbridge.msdk.newreward.function.c.e eVar2 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS;
            Object[] objArr = new Object[12];
            objArr[0] = "metrics_data";
            objArr[1] = bVar;
            objArr[2] = "auto_load";
            objArr[3] = Integer.valueOf(eVar.B() ? 2 : 1);
            objArr[4] = "result";
            objArr[5] = 1;
            objArr[6] = "cache";
            objArr[7] = 2;
            objArr[8] = "timeout";
            objArr[9] = Integer.valueOf(d.this.f14459d.I());
            objArr[10] = "hst";
            objArr[11] = bVar != null ? bVar.H() : "";
            cVar.a(eVar, eVar2, cVar.a(objArr));
            d dVar2 = d.this;
            dVar2.f14457b.a(dVar2.f14458c.a("type", 1, "object", bVar));
            ((MBridgeOffsetManager) d.this.f14458c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).increaseOffset(bVar.s().size());
            d dVar3 = d.this;
            com.mbridge.msdk.newreward.function.c.c cVar2 = dVar3.f14458c;
            cVar2.d(cVar2.a("adapter_model", dVar3.f14459d, "campaign", bVar));
            try {
                d dVar4 = d.this;
                com.mbridge.msdk.newreward.function.c.c cVar3 = dVar4.f14458c;
                cVar3.c(cVar3.a("adapter_model", dVar4.f14459d, "campaign", bVar));
                this.f14466b.a(com.mbridge.msdk.newreward.function.c.e.REQ_DOWN_CAMPAIGN);
                this.f14467c.put("campaign", bVar);
                this.f14466b.a(this.f14467c);
                d dVar5 = d.this;
                dVar5.a.a(this.f14466b, new b());
            } catch (MBridgeError e2) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14461f);
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 403);
                if (e2.getErrorMessage().contains("APP ALREADY INSTALLED")) {
                    a = com.mbridge.msdk.foundation.c.a.a(e2.getErrorCode(), 880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e2.getErrorMessage());
                } else {
                    a = com.mbridge.msdk.foundation.c.a.a(e2.getErrorCode(), 880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is " + e2.getErrorMessage());
                }
                d.this.f14457b.a(a);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            d dVar = d.this;
            int i10 = 1;
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(bVar, dVar.f14459d, dVar.f14458c, 1);
            if (!d.this.f14460e.a(eVar)) {
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14462g);
                com.mbridge.msdk.newreward.a.c.a.a().a(d.this.f14461f);
                if (d.this.f14465j) {
                    return;
                }
                d.this.f14465j = true;
                try {
                    d dVar2 = d.this;
                    com.mbridge.msdk.newreward.function.c.c cVar = dVar2.f14458c;
                    com.mbridge.msdk.newreward.a.e eVar2 = dVar2.f14459d;
                    com.mbridge.msdk.newreward.function.c.e eVar3 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL;
                    Object[] objArr = new Object[14];
                    objArr[0] = "auto_load";
                    objArr[1] = Integer.valueOf(eVar2.B() ? 2 : 1);
                    objArr[2] = "result";
                    if (!bVar.m()) {
                        i10 = 2;
                    }
                    objArr[3] = Integer.valueOf(i10);
                    objArr[4] = "code";
                    objArr[5] = Integer.valueOf(bVar.i());
                    objArr[6] = "reason";
                    objArr[7] = bVar.b();
                    objArr[8] = "timeout";
                    objArr[9] = Integer.valueOf(d.this.f14459d.I());
                    objArr[10] = "hst";
                    objArr[11] = bVar.j();
                    objArr[12] = "err_desc";
                    objArr[13] = bVar.l();
                    cVar.a(eVar2, eVar3, cVar.a(objArr));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                ((MBridgeOffsetManager) d.this.f14458c.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_OFFSET)).resetOffset();
                if (bVar != null) {
                    try {
                        if (bVar.a("campaign_request_error_type") != null) {
                            com.mbridge.msdk.newreward.function.e.c.a().b().a(d.this.f14459d.p(), d.this.f14459d.w(), d.this.f14459d.A(), d.this.f14459d.z(), ((Integer) bVar.a("campaign_request_error_type")).intValue());
                        }
                    } catch (Exception unused) {
                    }
                }
                d.this.f14457b.a(bVar);
                return;
            }
            d.this.f14460e.a(eVar, this);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
    public final void a(String str, long j3) {
        if (TextUtils.equals(str, this.f14461f)) {
            com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f14459d.p(), this.f14459d.w(), this.f14459d.A(), this.f14459d.z(), 405);
            this.f14457b.a(new com.mbridge.msdk.foundation.c.b(880010, vd.e.e("errorCode: 3401 errorMessage: ", a())));
        } else {
            if (!TextUtils.equals(str, this.f14462g) || this.f14460e == null) {
                return;
            }
            com.mbridge.msdk.newreward.function.c.b.b.e eVar = new com.mbridge.msdk.newreward.function.c.b.b.e(null, this.f14459d, this.f14458c, 3);
            com.mbridge.msdk.newreward.function.c.b bVar = new com.mbridge.msdk.newreward.function.c.b();
            bVar.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
            com.mbridge.msdk.newreward.function.c.c cVar = this.f14458c;
            bVar.a(cVar.a("adapter_model", this.f14459d, "command_manager", cVar));
            this.f14460e.a(eVar, new a(bVar, this.f14464i));
        }
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        try {
            com.mbridge.msdk.newreward.a.e eVar = this.f14459d;
            if (eVar != null && eVar.x() != null) {
                com.mbridge.msdk.newreward.function.d.a.b b3 = this.f14459d.x().b();
                if (b3 != null && b3.s() != null && b3.s().size() > 0) {
                    for (com.mbridge.msdk.newreward.function.d.a.a aVar : b3.s()) {
                        if (aVar != null) {
                            n d10 = aVar.d();
                            if (d10 != null && !d10.c()) {
                                sb2.append(" video timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> c10 = aVar.c();
                            if (c10 != null && !c10.c()) {
                                sb2.append(" video_template timeout ");
                            }
                            com.mbridge.msdk.newreward.function.d.c.d<?> f10 = aVar.f();
                            if (f10 != null && !f10.c()) {
                                sb2.append(" ec_template timeout ");
                            }
                        }
                    }
                } else {
                    sb2.append(" load timeout ");
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return sb2.toString();
    }
}
