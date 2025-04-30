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

/* loaded from: classes3.dex */
public final class l implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private String f16959a;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f16960a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f16960a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 != null && (bVar = this.f16960a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f16962a;
        private JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f16963c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f16962a = str;
            this.b = jSONObject;
            this.f16963c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.c cVar;
            if (this.f16963c != null && this.b != null) {
                try {
                    String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.b)) {
                        JSONObject optJSONObject = this.b.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.b = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String e4 = com.mbridge.msdk.videocommon.d.b.a().e(k6, this.f16962a);
                                if (!TextUtils.isEmpty(e4)) {
                                    this.b = com.mbridge.msdk.c.h.a().a(new JSONObject(e4), this.b);
                                }
                            }
                            if (com.mbridge.msdk.videocommon.d.b.e(this.b.toString())) {
                                this.b.put("current_time", System.currentTimeMillis());
                                com.mbridge.msdk.videocommon.d.b.a().a(k6, this.f16962a, this.b.toString());
                            }
                            cVar = com.mbridge.msdk.videocommon.d.c.c(this.b.toString());
                            this.f16963c.a(cVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(k6, this.f16962a);
                    }
                    cVar = null;
                    this.f16963c.a(cVar);
                } catch (Throwable th) {
                    ad.b("ReqRewardUnitSettingService", th.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i9;
        int d2;
        String j7;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
            this.f16959a = cVar.b();
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.b);
            if (com.mbridge.msdk.videocommon.d.b.a().d(this.f16959a)) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(this.f16959a);
            try {
                com.mbridge.msdk.videocommon.d.c f9 = com.mbridge.msdk.videocommon.d.b.a().f(k6, this.f16959a);
                if (f9 == null) {
                    j7 = "";
                } else {
                    j7 = f9.j();
                }
                cVar.b(j7);
            } catch (Throwable th) {
                ad.b("ReqRewardUnitSettingService", th.getMessage());
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.e.d.f().f15840r) {
                    str = com.mbridge.msdk.foundation.same.net.e.d.f().f15810J;
                } else {
                    str = com.mbridge.msdk.foundation.same.net.e.d.f().f15809I;
                }
                if (com.mbridge.msdk.foundation.same.net.e.d.f().f15840r) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uri", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, cVar.d());
                    com.mbridge.msdk.foundation.same.net.e.a().a(com.mbridge.msdk.foundation.same.net.e.d.f().l, com.mbridge.msdk.foundation.same.net.e.d.f().f15838p, jSONObject.toString(), true, new b(this.f16959a, bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new b(this.f16959a, bVar));
                byte[] p2 = gVar.p();
                if (p2 != null) {
                    i9 = p2.length;
                } else {
                    i9 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.foundation.same.net.f.e.f15857h, String.valueOf(i9));
                gVar.a((Map<String, String>) hashMap);
                if (p2 != null && (d2 = com.mbridge.msdk.foundation.same.net.e.d.f().d()) > 0 && i9 > d2) {
                    gVar.a(1);
                    gVar.a("Content-Type", "application/x-www-form-urlencoded");
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().a(gVar);
                return;
            } catch (Exception e4) {
                throw new IOException(e4);
            }
        }
        throw new IOException("ReqRewardUnitSettingService doReq: params is null");
    }

    /* loaded from: classes3.dex */
    public static final class b implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f16961a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public b(String str, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f16961a = str;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f16961a);
            MBridgeTaskManager.commonExecute(new c(this.f16961a, jSONObject, this.b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f16961a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f16961a);
            MBridgeTaskManager.commonExecute(new c(this.f16961a, dVar.f15778c, this.b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f16961a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.b));
        }
    }
}
