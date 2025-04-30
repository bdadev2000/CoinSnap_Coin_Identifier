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
public final class k implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f16956a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f16956a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.b;
            if (bVar2 != null && (bVar = this.f16956a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f16957a;
        private final com.mbridge.msdk.newreward.a.b.b b;

        public b(JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f16957a = jSONObject;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.a aVar;
            if (this.b != null && this.f16957a != null) {
                try {
                    String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.f16957a)) {
                        JSONObject optJSONObject = this.f16957a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.f16957a = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String g9 = com.mbridge.msdk.videocommon.d.b.a().g(k6);
                                if (!TextUtils.isEmpty(g9)) {
                                    this.f16957a = com.mbridge.msdk.c.h.a().a(new JSONObject(g9), this.f16957a);
                                }
                            }
                            this.f16957a.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(k6, this.f16957a.toString());
                            aVar = com.mbridge.msdk.videocommon.d.a.a(this.f16957a.toString());
                            this.b.a(aVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(k6);
                    }
                    aVar = null;
                    this.b.a(aVar);
                } catch (Throwable th) {
                    ad.b("ReqRewardSettingService", th.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i9;
        int d2;
        String a6;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f17220a);
            if (com.mbridge.msdk.videocommon.d.b.a().d()) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(true);
            try {
                com.mbridge.msdk.videocommon.d.a e4 = com.mbridge.msdk.videocommon.d.b.a().e();
                if (e4 == null) {
                    a6 = "";
                } else {
                    a6 = e4.a();
                }
                cVar.b(a6);
            } catch (Throwable th) {
                ad.b("ReqRewardSettingService", th.getMessage());
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
                    com.mbridge.msdk.foundation.same.net.e.a().a(com.mbridge.msdk.foundation.same.net.e.d.f().l, com.mbridge.msdk.foundation.same.net.e.d.f().f15838p, jSONObject.toString(), true, new c(bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new c(bVar));
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
            } catch (Exception e9) {
                throw new IOException(e9);
            }
        }
        throw new IOException("ReqRewardSettingService doReq: params is null");
    }

    /* loaded from: classes3.dex */
    public static final class c implements com.mbridge.msdk.foundation.same.net.b<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f16958a;

        public c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f16958a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, u<JSONObject> uVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(jSONObject, this.f16958a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onError(com.mbridge.msdk.foundation.same.net.a.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f16958a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.b
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.d<JSONObject> dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(dVar.f15778c, this.f16958a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(u<JSONObject> uVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f16958a));
        }
    }
}
