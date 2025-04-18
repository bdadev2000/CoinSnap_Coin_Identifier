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

/* loaded from: classes4.dex */
public class a {
    private static final String a = "com.mbridge.msdk.videocommon.c.a";

    public final void a(Context context, final String str, String str2) {
        e eVar = new e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            com.mbridge.msdk.videocommon.d.a e2 = com.mbridge.msdk.videocommon.d.b.a().e();
            if (e2 == null) {
                eVar.a("vtag", "");
            } else {
                String a10 = e2.a();
                if (TextUtils.isEmpty(a10)) {
                    a10 = "";
                }
                eVar.a("vtag", a10);
            }
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
        new b(context).get(1, d.f().I, eVar, new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.videocommon.c.a.1
            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(JSONObject jSONObject) {
                try {
                    if (ai.a(jSONObject)) {
                        com.mbridge.msdk.videocommon.d.b.a().a(false);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String g10 = com.mbridge.msdk.videocommon.d.b.a().g(str);
                            if (!TextUtils.isEmpty(g10)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(g10), jSONObject);
                                } catch (Exception e10) {
                                    ad.b(a.a, e10.getMessage());
                                }
                            }
                        }
                        try {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(str, jSONObject.toString());
                        } catch (JSONException e11) {
                            ad.b(a.a, e11.getMessage());
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(str);
                    }
                    a.this.a(1, 2, "");
                } catch (Throwable th3) {
                    ad.b(a.a, th3.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(String str3) {
                com.mbridge.msdk.videocommon.d.b.a().a(false);
                ad.b(a.a, str3);
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
            com.mbridge.msdk.videocommon.d.c f10 = com.mbridge.msdk.videocommon.d.b.a().f(str, str3);
            if (f10 == null) {
                eVar.a("vtag", "");
            } else {
                String j3 = f10.j();
                if (TextUtils.isEmpty(j3)) {
                    j3 = "";
                }
                eVar.a("vtag", j3);
            }
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
        com.mbridge.msdk.foundation.same.net.f.d dVar = new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.videocommon.c.a.2
            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(final JSONObject jSONObject) {
                try {
                    try {
                        com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                    } catch (Exception e2) {
                        ad.b(a.a, e2.getMessage());
                    }
                    if (ai.a(jSONObject)) {
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String e10 = com.mbridge.msdk.videocommon.d.b.a().e(str, this.unitId);
                            if (!TextUtils.isEmpty(e10)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(e10), jSONObject);
                                } catch (Exception e11) {
                                    ad.b(a.a, e11.getMessage());
                                }
                            }
                        }
                        if (com.mbridge.msdk.videocommon.d.b.e(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.videocommon.c.a.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.mbridge.msdk.videocommon.d.b a10 = com.mbridge.msdk.videocommon.d.b.a();
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    a10.a(str, anonymousClass2.unitId, jSONObject.toString());
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
                } catch (Throwable th3) {
                    ad.b(a.a, th3.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(String str4) {
                try {
                    com.mbridge.msdk.videocommon.d.b.a().b(this.unitId);
                } catch (Exception e2) {
                    ad.b(a.a, e2.getMessage());
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
        new b(context).get(1, d.f().I, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 3, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", "2000112");
            dVar.a("st_net", Integer.valueOf(d.f().f13409s));
            dVar.a("result", Integer.valueOf(i10));
            dVar.a("type", Integer.valueOf(i11));
            dVar.a("url", d.f().f13408r ? d.f().J : d.f().I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }
}
