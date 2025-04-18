package com.mbridge.msdk.newreward.a.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.tracker.network.u;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l implements com.mbridge.msdk.newreward.a.b.a {
    private String a;

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        private final com.mbridge.msdk.foundation.c.b a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14369b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.a = bVar;
            this.f14369b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14369b;
            if (bVar2 != null && (bVar = this.a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c implements Runnable {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f14371b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14372c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = str;
            this.f14371b = jSONObject;
            this.f14372c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.c cVar;
            if (this.f14372c != null && this.f14371b != null) {
                try {
                    String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.f14371b)) {
                        JSONObject optJSONObject = this.f14371b.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.f14371b = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String e2 = com.mbridge.msdk.videocommon.d.b.a().e(k10, this.a);
                                if (!TextUtils.isEmpty(e2)) {
                                    this.f14371b = com.mbridge.msdk.c.h.a().a(new JSONObject(e2), this.f14371b);
                                }
                            }
                            if (com.mbridge.msdk.videocommon.d.b.e(this.f14371b.toString())) {
                                this.f14371b.put("current_time", System.currentTimeMillis());
                                com.mbridge.msdk.videocommon.d.b.a().a(k10, this.a, this.f14371b.toString());
                            }
                            cVar = com.mbridge.msdk.videocommon.d.c.c(this.f14371b.toString());
                            this.f14372c.a(cVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(k10, this.a);
                    }
                    cVar = null;
                    this.f14372c.a(cVar);
                } catch (Throwable th2) {
                    ad.b("ReqRewardUnitSettingService", th2.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i10;
        int d10;
        String j3;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
            this.a = cVar.b();
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f14584b);
            if (com.mbridge.msdk.videocommon.d.b.a().d(this.a)) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(this.a);
            try {
                com.mbridge.msdk.videocommon.d.c f10 = com.mbridge.msdk.videocommon.d.b.a().f(k10, this.a);
                if (f10 == null) {
                    j3 = "";
                } else {
                    j3 = f10.j();
                }
                cVar.b(j3);
            } catch (Throwable th2) {
                ad.b("ReqRewardUnitSettingService", th2.getMessage());
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.e.d.f().f13408r) {
                    str = com.mbridge.msdk.foundation.same.net.e.d.f().J;
                } else {
                    str = com.mbridge.msdk.foundation.same.net.e.d.f().I;
                }
                if (com.mbridge.msdk.foundation.same.net.e.d.f().f13408r) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uri", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, cVar.d());
                    com.mbridge.msdk.foundation.same.net.e.a().a(com.mbridge.msdk.foundation.same.net.e.d.f().f13402l, com.mbridge.msdk.foundation.same.net.e.d.f().f13406p, jSONObject.toString(), true, new b(this.a, bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new b(this.a, bVar));
                byte[] p10 = gVar.p();
                if (p10 != null) {
                    i10 = p10.length;
                } else {
                    i10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.foundation.same.net.f.e.f13422h, String.valueOf(i10));
                gVar.a((Map<String, String>) hashMap);
                if (p10 != null && (d10 = com.mbridge.msdk.foundation.same.net.e.d.f().d()) > 0 && i10 > d10) {
                    gVar.a(1);
                    gVar.a("Content-Type", "application/x-www-form-urlencoded");
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().a(gVar);
                return;
            } catch (Exception e2) {
                throw new IOException(e2);
            }
        }
        throw new IOException("ReqRewardUnitSettingService doReq: params is null");
    }

    /* loaded from: classes4.dex */
    public static final class b implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14370b;

        public b(String str, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = str;
            this.f14370b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.a);
            MBridgeTaskManager.commonExecute(new c(this.a, jSONObject, this.f14370b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f14370b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.a);
            MBridgeTaskManager.commonExecute(new c(this.a, dVar.f13367c, this.f14370b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f14370b));
        }
    }
}
