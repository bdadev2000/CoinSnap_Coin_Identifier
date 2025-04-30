package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
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

/* loaded from: classes3.dex */
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
            StringBuilder sb = new StringBuilder();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = map.get(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "";
                        }
                        sb.append("&");
                        sb.append(str);
                        sb.append("=");
                        sb.append(str2);
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b(TAG, e4.getMessage());
                }
                sb = null;
            }
            if (sb != null && sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    private static com.mbridge.msdk.tracker.network.i<?> createRequest(int i9, int i10, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            return new j(i10, str, str2, j7, new i(bVar));
        }
        return new l(i10, str, str2, j7, new i(bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: Exception -> 0x00d1, TRY_ENTER, TryCatch #3 {Exception -> 0x00d1, blocks: (B:25:0x00a5, B:27:0x00ab, B:47:0x00b6, B:54:0x00db, B:58:0x00f8), top: B:23:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void post(int r14, java.lang.String r15, com.mbridge.msdk.foundation.same.net.f.e r16, com.mbridge.msdk.foundation.same.net.b r17, boolean r18, boolean r19, java.lang.String r20, long r21) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.c.post(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar != null) {
            String a6 = Aa.a();
            if (a6 == null) {
                a6 = "";
            }
            eVar.a("channel", a6);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().b() + "");
            eVar.a(q.OPEN, com.mbridge.msdk.foundation.same.a.f15670R);
            if (com.mbridge.msdk.e.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
                String b = Aa.b();
                if (!TextUtils.isEmpty(b)) {
                    eVar.a("keyword", b);
                }
            }
            String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (str2 != null) {
                String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
                if (!TextUtils.isEmpty(customInfoByUnitId)) {
                    eVar.a("ch_info", customInfoByUnitId);
                }
                k d2 = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), str2);
                if (d2 != null && !TextUtils.isEmpty(d2.a())) {
                    eVar.a("u_stid", d2.a());
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

    public void choiceV3OrV5BySetting(int i9, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j7) {
        int F4;
        e eVar2;
        com.mbridge.msdk.c.g a6 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (TextUtils.isEmpty(str)) {
            F4 = a6.ap();
        } else {
            F4 = a6.F();
        }
        String a9 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str, F4);
        if (F4 < 2) {
            postV5(i9, a9, eVar, bVar, "campaign", j7);
            return;
        }
        if (F4 % 2 == 0) {
            if (eVar == null) {
                eVar2 = new e();
            } else {
                eVar2 = eVar;
            }
            JSONArray b = com.mbridge.msdk.foundation.db.a.a.a().b();
            if (b != null) {
                String jSONArray = b.toString();
                int d2 = com.mbridge.msdk.foundation.same.net.e.d.f().d();
                if (d2 > 0 && jSONArray.length() > d2) {
                    post(i9, a9, eVar2, bVar, "campaign", j7);
                    return;
                }
                eVar2.a(e.f15857h, jSONArray);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i9, a9, eVar2, bVar, "campaign", j7);
    }

    public void get(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        get(i9, str, eVar, bVar, false, false, str2, j7);
    }

    public void getCampaign(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j7) {
        int F4;
        e eVar2;
        try {
            com.mbridge.msdk.c.g a6 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
            if (TextUtils.isEmpty(str)) {
                F4 = a6.ap();
            } else {
                F4 = a6.F();
            }
            String a9 = com.mbridge.msdk.foundation.same.net.e.d.f().a(str, F4);
            if (F4 < 2) {
                postV5(i9, a9, eVar, bVar, true, "campaign", j7);
                return;
            }
            if (F4 % 2 == 0) {
                if (eVar == null) {
                    eVar2 = new e();
                } else {
                    eVar2 = eVar;
                }
                JSONArray b = com.mbridge.msdk.foundation.db.a.a.a().b();
                if (b != null) {
                    String jSONArray = b.toString();
                    int d2 = com.mbridge.msdk.foundation.same.net.e.d.f().d();
                    if (d2 > 0 && jSONArray.length() > d2) {
                        post(i9, a9, eVar2, bVar, true, false, "campaign", j7);
                        return;
                    }
                    eVar2.a(e.f15857h, jSONArray);
                }
            } else {
                eVar2 = eVar;
            }
            get(i9, a9, eVar2, bVar, true, true, "campaign", j7);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, e4.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        getLoadOrSetting(i9, str, eVar, bVar, true, str2, j7);
    }

    public void postFocusReport(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        post(i9, str, eVar, bVar, false, true, str2, j7);
    }

    public void postV5(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i9, str, eVar, bVar, false, false, str2, j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void get(int r15, java.lang.String r16, com.mbridge.msdk.foundation.same.net.f.e r17, com.mbridge.msdk.foundation.same.net.b r18, boolean r19, boolean r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.c.get(int, java.lang.String, com.mbridge.msdk.foundation.same.net.f.e, com.mbridge.msdk.foundation.same.net.b, boolean, boolean, java.lang.String, long):void");
    }

    public void getLoadOrSetting(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z8, String str2, long j7) {
        get(i9, str, eVar, bVar, z8, false, str2, j7);
    }

    public void postV5(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z8, String str2, long j7) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i9, str, eVar, bVar, z8, false, str2, j7);
    }

    public void get(int i9, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put("platform", "1");
        String asUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(asUrlParams)) {
            str = o.k(str, "?", asUrlParams);
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            L.C("get wx scheme url = ", str3, "AppletsModel");
        }
        com.mbridge.msdk.tracker.network.i<?> createRequest = createRequest(i9, 0, str3, bVar, str2, j7);
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

    public void post(int i9, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j7) {
        post(i9, str, eVar, bVar, false, false, str2, j7);
    }
}
