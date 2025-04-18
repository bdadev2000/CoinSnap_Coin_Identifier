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
public final class k implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        private final com.mbridge.msdk.foundation.c.b a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14367b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.a = bVar;
            this.f14367b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14367b;
            if (bVar2 != null && (bVar = this.a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements Runnable {
        private JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f14368b;

        public b(JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = jSONObject;
            this.f14368b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.a aVar;
            if (this.f14368b != null && this.a != null) {
                try {
                    String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.a)) {
                        JSONObject optJSONObject = this.a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.a = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String g10 = com.mbridge.msdk.videocommon.d.b.a().g(k10);
                                if (!TextUtils.isEmpty(g10)) {
                                    this.a = com.mbridge.msdk.c.h.a().a(new JSONObject(g10), this.a);
                                }
                            }
                            this.a.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(k10, this.a.toString());
                            aVar = com.mbridge.msdk.videocommon.d.a.a(this.a.toString());
                            this.f14368b.a(aVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(k10);
                    }
                    aVar = null;
                    this.f14368b.a(aVar);
                } catch (Throwable th2) {
                    ad.b("ReqRewardSettingService", th2.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i10;
        int d10;
        String a10;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.a);
            if (com.mbridge.msdk.videocommon.d.b.a().d()) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(true);
            try {
                com.mbridge.msdk.videocommon.d.a e2 = com.mbridge.msdk.videocommon.d.b.a().e();
                if (e2 == null) {
                    a10 = "";
                } else {
                    a10 = e2.a();
                }
                cVar.b(a10);
            } catch (Throwable th2) {
                ad.b("ReqRewardSettingService", th2.getMessage());
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
                    com.mbridge.msdk.foundation.same.net.e.a().a(com.mbridge.msdk.foundation.same.net.e.d.f().f13402l, com.mbridge.msdk.foundation.same.net.e.d.f().f13406p, jSONObject.toString(), true, new c(bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new c(bVar));
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
            } catch (Exception e10) {
                throw new IOException(e10);
            }
        }
        throw new IOException("ReqRewardSettingService doReq: params is null");
    }

    /* loaded from: classes4.dex */
    public static final class c implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {
        private final com.mbridge.msdk.newreward.a.b.b a;

        public c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(jSONObject, this.a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(dVar.f13367c, this.a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.a));
        }
    }
}
