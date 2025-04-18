package com.mbridge.msdk.c;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class j {
    private static final String a = "j";

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context, final String str, final String str2) {
        if (!com.mbridge.msdk.foundation.same.net.e.d.f().a()) {
            try {
                if (com.mbridge.msdk.foundation.same.net.e.d.f().f13407q) {
                    return;
                }
                com.mbridge.msdk.foundation.same.net.e.d.f().f13407q = true;
                if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.a.a.a.a().b("mkey_spare_host_ts").longValue() + com.vungle.ads.internal.signals.j.TWENTY_FOUR_HOURS_MILLIS) {
                    String a10 = com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host");
                    if (!TextUtils.isEmpty(a10)) {
                        for (String str3 : a10.split("\n")) {
                            if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.e.d.f().f13410t.contains(str3.trim())) {
                                com.mbridge.msdk.foundation.same.net.e.d.f().f13410t.add(str3.trim());
                                com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.add(str3.trim());
                            }
                        }
                        b(context, str, str2);
                        return;
                    }
                }
                new com.mbridge.msdk.foundation.same.net.f.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.e.d.f().f13392b, new com.mbridge.msdk.foundation.same.net.f.e(), new com.mbridge.msdk.foundation.same.net.b.a() { // from class: com.mbridge.msdk.c.j.2
                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void a(String str4) {
                        com.mbridge.msdk.foundation.same.net.e.d.f().f13407q = false;
                        com.applovin.impl.mediation.ads.e.A("fetch CNDSettingHost failed, errorCode = ", str4, j.a);
                    }

                    @Override // com.mbridge.msdk.foundation.same.net.b.a
                    public final void b(String str4) {
                        ad.a(j.a, "fetch CNDSettingHost success, content = " + str4);
                        if (!TextUtils.isEmpty(str4)) {
                            com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host_ts", System.currentTimeMillis());
                            com.mbridge.msdk.foundation.a.a.a.a().a("mkey_spare_host", str4);
                            for (String str5 : str4.split("\n")) {
                                if (!TextUtils.isEmpty(str5.trim()) && !com.mbridge.msdk.foundation.same.net.e.d.f().f13410t.contains(str5.trim())) {
                                    com.mbridge.msdk.foundation.same.net.e.d.f().f13410t.add(str5.trim());
                                    com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.add(str5.trim());
                                }
                            }
                            j.this.b(context, str, str2);
                        }
                    }
                }, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Throwable th2) {
                com.mbridge.msdk.foundation.same.net.e.d.f().f13407q = false;
                ad.b(a, th2.getMessage());
                return;
            }
        }
        a(context, str, str2);
    }

    public final void a(final Context context, final String str, final String str2) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.f.e eVar = new com.mbridge.msdk.foundation.same.net.f.e();
        eVar.a(MBridgeConstans.APP_ID, str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            String av = h.a().a(str).av();
            if (TextUtils.isEmpty(av)) {
                av = "";
            }
            eVar.a("vtag", av);
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.e.d.f().f13407q) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.e.d.f().f13409s + "");
        }
        com.mbridge.msdk.foundation.same.net.f.d dVar = new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.c.j.1
            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(JSONObject jSONObject) {
                try {
                    j.this.a(1, 0, "");
                } catch (Throwable th3) {
                    ad.b(j.a, th3.getMessage());
                }
                try {
                    if (ai.a(jSONObject)) {
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String g10 = h.a().g(str);
                            if (!TextUtils.isEmpty(g10)) {
                                try {
                                    jSONObject = h.a().a(new JSONObject(g10), jSONObject);
                                } catch (Exception e2) {
                                    ad.b(j.a, e2.getMessage());
                                }
                            }
                        }
                        jSONObject.put("current_time", System.currentTimeMillis());
                        if (com.mbridge.msdk.foundation.same.net.e.d.f().f13408r) {
                            if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                                jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.e.d.f().f13402l);
                            }
                        } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                            jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.e.d.f().f13398h);
                        }
                        h.a().g(str, jSONObject.toString());
                        com.mbridge.msdk.foundation.same.net.e.d.f().e();
                        try {
                            if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                                com.mbridge.msdk.c.b.a.a().a(context, jSONObject.optString("mraid_js"));
                            }
                        } catch (Exception e10) {
                            ad.b(j.a, e10.getMessage());
                        }
                        if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                            com.mbridge.msdk.c.b.b.a().a(context, jSONObject.optString("web_env_url"));
                        }
                        j.a(j.this, context, str);
                    } else {
                        h.a().f(str);
                    }
                    j.a(j.this);
                } catch (Exception e11) {
                    ad.b(j.a, e11.getMessage());
                }
            }

            @Override // com.mbridge.msdk.foundation.same.net.f.d
            public final void a(String str3) {
                try {
                    j.this.a(2, 0, str3);
                } catch (Throwable th3) {
                    ad.b(j.a, th3.getMessage());
                }
                if (!com.mbridge.msdk.foundation.same.net.e.d.f().f13408r) {
                    com.mbridge.msdk.foundation.same.net.e.d.f().u++;
                } else {
                    com.mbridge.msdk.foundation.same.net.e.d.f().f13411v++;
                }
                j.this.b(context, str, str2);
                j.a(j.this);
                com.applovin.impl.mediation.ads.e.z("get app setting error", str3, j.a);
            }
        };
        com.mbridge.msdk.c.a.c cVar = new com.mbridge.msdk.c.a.c(context);
        String str3 = com.mbridge.msdk.foundation.same.net.e.d.f().G;
        try {
            if (com.mbridge.msdk.foundation.same.net.e.d.f().f13408r && com.mbridge.msdk.foundation.same.net.e.d.f().f13407q && com.mbridge.msdk.foundation.same.net.e.d.f().f13411v < com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.size()) {
                String str4 = com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.get(com.mbridge.msdk.foundation.same.net.e.d.f().f13411v);
                if (!TextUtils.isEmpty(str4) && (str4.startsWith("http") || str4.startsWith(Constants.SCHEME))) {
                    str3 = str4.concat("/setting");
                }
            }
        } catch (Throwable th3) {
            ad.b(a, th3.getMessage());
        }
        cVar.get(1, str3, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        a(3, 0, "");
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.e.d.f().f13408r ? com.mbridge.msdk.foundation.same.net.e.d.f().H : com.mbridge.msdk.foundation.same.net.e.d.f().G;
        try {
            if (!com.mbridge.msdk.foundation.same.net.e.d.f().f13408r || !com.mbridge.msdk.foundation.same.net.e.d.f().f13407q || com.mbridge.msdk.foundation.same.net.e.d.f().f13411v >= com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.size()) {
                return str;
            }
            String str2 = com.mbridge.msdk.foundation.same.net.e.d.f().f13412w.get(com.mbridge.msdk.foundation.same.net.e.d.f().f13411v);
            return !TextUtils.isEmpty(str2) ? (str2.startsWith("http") || str2.startsWith(Constants.SCHEME)) ? str2.concat("/setting") : str : str;
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
            return str;
        }
    }

    public final void a(Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.m().k();
            str2 = com.mbridge.msdk.foundation.controller.c.m().b();
        }
        if (h.a().e(str3, str) && h.a().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.f.e eVar = new com.mbridge.msdk.foundation.same.net.f.e();
            String str4 = "[" + str3 + "]";
            eVar.a("unit_ids", str4);
            eVar.a(MBridgeConstans.APP_ID, str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String t5 = h.a().c(str, str4).t();
                if (TextUtils.isEmpty(t5)) {
                    t5 = "";
                }
                eVar.a("vtag", t5);
            } catch (Throwable th2) {
                ad.b(a, th2.getMessage());
            }
            com.mbridge.msdk.foundation.same.net.f.d dVar = new com.mbridge.msdk.foundation.same.net.f.d() { // from class: com.mbridge.msdk.c.j.3
                @Override // com.mbridge.msdk.foundation.same.net.f.d
                public final void a(JSONObject jSONObject) {
                    try {
                        if (ai.a(jSONObject)) {
                            String optString = jSONObject.optString("vtag", "");
                            String optString2 = jSONObject.optString("rid", "");
                            JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                                if (jSONObject.optInt("vtag_status", 0) == 1) {
                                    h.a();
                                    String a10 = com.mbridge.msdk.foundation.a.a.a.a().a(str + "_" + str3);
                                    if (!TextUtils.isEmpty(a10)) {
                                        try {
                                            optJSONObject = h.a().a(new JSONObject(a10), optJSONObject);
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                }
                                optJSONObject.put("current_time", System.currentTimeMillis());
                                optJSONObject.put("vtag", optString);
                                optJSONObject.put("rid", optString2);
                                h.a().a(str, str3, optJSONObject.toString());
                            }
                        } else {
                            h.a().h(str, str3);
                        }
                        j.this.a(1, 1, "");
                    } catch (Exception e10) {
                        ad.b(j.a, e10.getMessage());
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f.d
                public final void a(String str5) {
                    j.this.a(2, 1, "");
                }
            };
            dVar.setUnitId(str3);
            new com.mbridge.msdk.c.a.c(context).get(1, com.mbridge.msdk.foundation.same.net.e.d.f().G, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String str2;
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", "2000112");
            dVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.e.d.f().f13409s));
            dVar.a("result", Integer.valueOf(i10));
            dVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                str2 = b();
            } else {
                str2 = com.mbridge.msdk.foundation.same.net.e.d.f().f13408r ? com.mbridge.msdk.foundation.same.net.e.d.f().H : com.mbridge.msdk.foundation.same.net.e.d.f().G;
            }
            dVar.a("url", str2);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }

    public static /* synthetic */ void a(j jVar, Context context, String str) {
        g b3;
        h a10 = h.a();
        if (a10 != null && (b3 = a10.b(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = b3.U();
            MBridgeConstans.OMID_JS_H5_URL = b3.T();
        }
        com.mbridge.msdk.a.b.a(context);
        com.mbridge.msdk.a.b.b(context);
    }

    public static /* synthetic */ void a(j jVar) {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().c()).a();
        } catch (Throwable th2) {
            ad.b(a, th2.getMessage());
        }
    }
}
