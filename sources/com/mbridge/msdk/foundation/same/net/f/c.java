package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.l;
import com.mbridge.msdk.tracker.network.m;
import com.vungle.ads.internal.presenter.q;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.m().c();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuilder sb2 = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb2.append("&");
                        sb2.append(str);
                        sb2.append("=");
                        sb2.append(str2);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(TAG, e2.getMessage());
                }
                sb2 = null;
            }
            if (sb2 != null && sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.i<?> createRequest(int i10, int i11, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return new j(i11, str, str2, j3, new i(bVar));
        }
        return new l(i11, str, str2, j3, new i(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[Catch: Exception -> 0x00f1, TRY_ENTER, TryCatch #4 {Exception -> 0x00f1, blocks: (B:24:0x00a2, B:26:0x00a8, B:46:0x00b3, B:53:0x00d6, B:57:0x00f5), top: B:22:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void post(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.f.e r16, com.mbridge.msdk.foundation.same.net.b r17, boolean r18, boolean r19, java.lang.String r20, long r21) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar != null) {
            String a = Aa.a();
            if (a == null) {
                a = "";
            }
            eVar.a("channel", a);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().b() + "");
            eVar.a(q.OPEN, com.mbridge.msdk.foundation.same.a.R);
            if (com.mbridge.msdk.e.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
                String b3 = Aa.b();
                if (!TextUtils.isEmpty(b3)) {
                    eVar.a("keyword", b3);
                }
            }
            String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    eVar.a("ch_info", customInfoByUnitId);
                }
                k d10 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d10 != null && !TextUtils.isEmpty(d10.a())) {
                    eVar.a("u_stid", d10.a());
                }
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                eVar.a("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
                return;
            }
            return;
        }
        ad.b(TAG, "addExtraParams error, params is null,frame work error");
    }

    public boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i10, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j3) {
        int F;
        e eVar2;
        com.mbridge.msdk.c.g a = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(str)) {
            F = a.ap();
        } else {
            F = a.F();
        }
        String a10 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str, F);
        if (F < 2) {
            postV5(i10, a10, eVar, bVar, "campaign", j3);
            return;
        }
        if (F % 2 == 0) {
            if (eVar == null) {
                eVar2 = new e();
            } else {
                eVar2 = eVar;
            }
            JSONArray b3 = com.mbridge.msdk.foundation.db.a.a.a().b();
            if (b3 != null) {
                String jSONArray = b3.toString();
                int d10 = com.mbridge.msdk.foundation.same.net.e.d.f().d();
                if (d10 > 0 && jSONArray.length() > d10) {
                    post(i10, a10, eVar2, bVar, "campaign", j3);
                    return;
                }
                eVar2.a(e.f13422h, jSONArray);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i10, a10, eVar2, bVar, "campaign", j3);
    }

    public void get(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        get(i10, str, eVar, bVar, false, false, str2, j3);
    }

    public void getCampaign(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j3) {
        int F;
        e eVar2;
        try {
            com.mbridge.msdk.c.g a = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            if (TextUtils.isEmpty(str)) {
                F = a.ap();
            } else {
                F = a.F();
            }
            String a10 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str, F);
            if (F < 2) {
                postV5(i10, a10, eVar, bVar, true, "campaign", j3);
                return;
            }
            if (F % 2 == 0) {
                if (eVar == null) {
                    eVar2 = new e();
                } else {
                    eVar2 = eVar;
                }
                JSONArray b3 = com.mbridge.msdk.foundation.db.a.a.a().b();
                if (b3 != null) {
                    String jSONArray = b3.toString();
                    int d10 = com.mbridge.msdk.foundation.same.net.e.d.f().d();
                    if (d10 > 0 && jSONArray.length() > d10) {
                        post(i10, a10, eVar2, bVar, true, false, "campaign", j3);
                        return;
                    }
                    eVar2.a(e.f13422h, jSONArray);
                }
            } else {
                eVar2 = eVar;
            }
            get(i10, a10, eVar2, bVar, true, true, "campaign", j3);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e2.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        getLoadOrSetting(i10, str, eVar, bVar, true, str2, j3);
    }

    public void postFocusReport(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        post(i10, str, eVar, bVar, false, true, str2, j3);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i10, str, eVar, bVar, false, false, str2, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.f.e r17, com.mbridge.msdk.foundation.same.net.b r18, boolean r19, boolean r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.c.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void getLoadOrSetting(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j3) {
        get(i10, str, eVar, bVar, z10, false, str2, j3);
    }

    public void postV5(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z10, String str2, long j3) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i10, str, eVar, bVar, z10, false, str2, j3);
    }

    public void get(int i10, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String asUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(asUrlParams)) {
            str = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "?", asUrlParams);
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            com.applovin.impl.mediation.ads.e.A("get wx scheme url = ", str3, "AppletsModel");
        }
        com.mbridge.msdk.tracker.network.i<?> createRequest = createRequest(i10, 0, str3, bVar, str2, j3);
        if (createRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            createRequest.c("local_id", str4);
            String str5 = map.get("ad_type");
            createRequest.c("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            createRequest.a(map);
            createRequest.a(canTrack());
            m.a().b().a(createRequest);
        }
    }

    public void post(int i10, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j3) {
        post(i10, str, eVar, bVar, false, false, str2, j3);
    }
}
