package com.mbridge.msdk.videocommon.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.foundation.same.net.e.d;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19328a = "com.mbridge.msdk.videocommon.c.a";

    public final void a(Context context, final String str, String str2) {
        e eVar = new e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            com.mbridge.msdk.videocommon.d.a e4 = com.mbridge.msdk.videocommon.d.b.a().e();
            if (e4 == null) {
                eVar.a("vtag", "");
            } else {
                String a6 = e4.a();
                if (TextUtils.isEmpty(a6)) {
                    a6 = "";
                }
                eVar.a("vtag", a6);
            }
        } catch (Throwable th) {
            ad.b(f19328a, th.getMessage());
        }
        new b(context).get(1, d.f().f15809I, eVar, new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.videocommon.c.a.1
            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(JSONObject jSONObject) {
                try {
                    if (ai.a(jSONObject)) {
                        com.mbridge.msdk.videocommon.d.b.a().a(false);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String g9 = com.mbridge.msdk.videocommon.d.b.a().g(str);
                            if (!TextUtils.isEmpty(g9)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(g9), jSONObject);
                                } catch (Exception e9) {
                                    ad.b(a.f19328a, e9.getMessage());
                                }
                            }
                        }
                        try {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(str, jSONObject.toString());
                        } catch (JSONException e10) {
                            ad.b(a.f19328a, e10.getMessage());
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(str);
                    }
                    a.this.a(1, 2, "");
                } catch (Throwable th2) {
                    ad.b(a.f19328a, th2.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(String str3) {
                com.mbridge.msdk.videocommon.d.b.a().a(false);
                ad.b(a.f19328a, str3);
                a.this.a(2, 2, str3);
            }
        }, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 2, "");
    }

    public final void a(Context context, final String str, String str2, String str3, final c cVar) {
        e eVar = new e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        eVar.a("unit_ids", "[" + str3 + "]");
        try {
            com.mbridge.msdk.videocommon.d.c f9 = com.mbridge.msdk.videocommon.d.b.a().f(str, str3);
            if (f9 == null) {
                eVar.a("vtag", "");
            } else {
                String j7 = f9.j();
                if (TextUtils.isEmpty(j7)) {
                    j7 = "";
                }
                eVar.a("vtag", j7);
            }
        } catch (Throwable th) {
            ad.b(f19328a, th.getMessage());
        }
        com.mbridge.msdk.foundation.same.net.f.d dVar = new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.videocommon.c.a.2
            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(final JSONObject jSONObject) {
                try {
                    try {
                        com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                    } catch (Exception e4) {
                        ad.b(a.f19328a, e4.getMessage());
                    }
                    if (ai.a(jSONObject)) {
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String e9 = com.mbridge.msdk.videocommon.d.b.a().e(str, this.unitId);
                            if (!TextUtils.isEmpty(e9)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(e9), jSONObject);
                                } catch (Exception e10) {
                                    ad.b(a.f19328a, e10.getMessage());
                                }
                            }
                        }
                        if (com.mbridge.msdk.videocommon.d.b.e(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.videocommon.c.a.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.mbridge.msdk.videocommon.d.b a6 = com.mbridge.msdk.videocommon.d.b.a();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    a6.a(str, anonymousClass2.unitId, jSONObject.toString());
                                }
                            };
                            com.mbridge.msdk.foundation.controller.d.a();
                            com.mbridge.msdk.foundation.same.f.b.b().execute(runnable);
                            c cVar2 = cVar;
                            if (cVar2 != null) {
                                cVar2.a("request success");
                            }
                        } else {
                            c cVar3 = cVar;
                            if (cVar3 != null) {
                                cVar3.b("data error");
                            }
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(str, this.unitId);
                    }
                    a.this.a(1, 3, "");
                } catch (Throwable th2) {
                    ad.b(a.f19328a, th2.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(String str4) {
                try {
                    com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                } catch (Exception e4) {
                    ad.b(a.f19328a, e4.getMessage());
                }
                if (!TextUtils.isEmpty(str4)) {
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.b(str4);
                    }
                } else {
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        cVar3.b("request error");
                    }
                }
                a.this.a(2, 3, str4);
            }
        };
        dVar.setUnitId(str3);
        new b(context).get(1, d.f().f15809I, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 3, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9, int i10, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", "2000112");
            dVar.a("st_net", Integer.valueOf(d.f().f15841s));
            dVar.a("result", Integer.valueOf(i9));
            dVar.a("type", Integer.valueOf(i10));
            dVar.a("url", d.f().f15840r ? d.f().f15810J : d.f().f15809I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th) {
            ad.b(f19328a, th.getMessage());
        }
    }
}
