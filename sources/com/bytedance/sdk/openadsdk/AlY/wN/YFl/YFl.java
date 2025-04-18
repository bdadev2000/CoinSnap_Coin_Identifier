package com.bytedance.sdk.openadsdk.AlY.wN.YFl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AlY.DSW;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.AlY;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.GA;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.NjR;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.Sg;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.nc;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.pDU;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.vc;
import com.bytedance.sdk.openadsdk.AlY.wN.Sg.wN;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.pDU.tN;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import m2.l;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;
import p5.c;

/* loaded from: classes.dex */
public class YFl {
    private static final Map<a, EH> YFl = Collections.synchronizedMap(new WeakHashMap());

    public static void AlY(a aVar, EH.YFl yFl) {
        EH eh2;
        if (aVar == null || yFl == null || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        Sg sg2 = new Sg();
        sg2.YFl(yFl.Sg());
        sg2.Sg(tN);
        sg2.YFl(yFl.AlY());
        sg2.Sg(yFl.wN());
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl(wN, eh2.Sg(), eh2.tN(), AlY), sg2);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "endcard_skip", jSONObject);
        } catch (JSONException e2) {
            YoT.YFl("TTAD.VideoEventManager", "", e2);
        }
    }

    public static void tN(a aVar, EH.YFl yFl) {
        EH eh2;
        if (aVar == null || yFl == null || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        pDU pdu = new pDU(yFl.YoT());
        pdu.YFl(yFl.Sg());
        pdu.Sg(tN);
        JSONObject YFl3 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
        int i10 = AlY.AlY;
        if (i10 > 0) {
            try {
                YFl3.put("play_time", i10);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl3, pdu);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "play_error", jSONObject);
        } catch (JSONException e10) {
            YoT.YFl("TTAD.VideoEventManager", "", e10);
        }
        YFl.remove(aVar);
    }

    public static void wN(a aVar, EH.YFl yFl) {
        EH eh2;
        if (aVar == null || yFl == null || yFl.NjR() <= 0 || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY != null && wN != null) {
            long tN = yFl.tN();
            GA ga2 = new GA();
            ga2.YFl(yFl.Sg());
            ga2.Sg(tN);
            ga2.YFl(yFl.NjR());
            JSONObject YFl2 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
            int i10 = AlY.AlY;
            if (i10 > 0) {
                try {
                    YFl2.put("play_time", i10);
                } catch (JSONException e2) {
                    YoT.YFl("TTAD.VideoEventManager", "", e2);
                }
            }
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl2, ga2);
            yFl2.YFl(yFl.nc());
            YFl(yFl2, "play_buffer");
        }
    }

    public static void Sg(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl<NjR> yFl) {
        tN.YFl("load_video_cancel", yFl);
    }

    public static JSONObject YFl(Wwa wwa, String str, int i10, c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i10 > 0) {
                jSONObject.put("play_type", String.valueOf(i10));
            }
            if (wwa != null) {
                p5.a BPI = wwa.BPI();
                if (BPI != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, BPI.f23460e);
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(BPI.f23458c));
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, BPI.f23462g);
                    jSONObject.put("player_type", cVar.EH());
                    jSONObject.put("video_encode_type", cVar.eT() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", wwa.Ja());
            }
        } catch (JSONException e2) {
            YoT.YFl("TTAD.VideoEventManager", "", e2);
        }
        return jSONObject;
    }

    public static void Sg(a aVar, EH.YFl yFl) {
        EH eh2;
        if (aVar == null || yFl == null || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        if (tN <= 0 || YFl2 <= 0) {
            return;
        }
        wN wNVar = new wN();
        wNVar.YFl(yFl.Sg());
        wNVar.Sg(tN);
        JSONObject YFl3 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
        int i10 = AlY.AlY;
        if (i10 > 0) {
            try {
                YFl3.put("play_time", i10);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl3, wNVar);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "feed_continue", jSONObject);
        } catch (JSONException e10) {
            YoT.YFl("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void YFl(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl<nc> yFl) {
        tN.YFl("load_video_error", yFl);
    }

    public static void YFl(Wwa wwa, a aVar, c cVar) {
        if (wwa == null || aVar == null || cVar == null) {
            return;
        }
        String YFl2 = Ne.YFl();
        ((l) CacheDirFactory.getICacheDir(wwa.dBO())).getClass();
        int i10 = (TextUtils.isEmpty(cVar.Sg()) || TextUtils.isEmpty(cVar.pDU())) ? false : new File(cVar.Sg(), cVar.pDU()).exists() ? 1 : 2;
        YFl.put(aVar, new EH(SystemClock.elapsedRealtime(), YFl2, i10, cVar, wwa));
        JSONObject YFl3 = YFl(wwa, YFl2, i10, cVar);
        String YFl4 = Sco.YFl(wwa);
        int i11 = cVar.AlY;
        if (i11 > 0) {
            try {
                YFl3.put("play_time", i11);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wwa, YFl4, YFl3, null);
        yFl.YFl(cVar.EH() == -1);
        YFl(yFl, "play_start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String AlY(c cVar) {
        return new File(cVar.Sg(), cVar.pDU()).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long tN(c cVar) {
        if (cVar == null) {
            return 0L;
        }
        p5.a wXo = cVar.eT() ? cVar.wXo() : cVar.aIu();
        if (wXo != null) {
            return Double.valueOf(wXo.f23459d * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void Sg(a aVar, EH.YFl yFl, DSW dsw) {
        if (aVar == null || yFl == null) {
            return;
        }
        wN(aVar, yFl);
        EH eh2 = YFl.get(aVar);
        if (eh2 == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        vc vcVar = new vc();
        vcVar.Sg(yFl.Sg());
        vcVar.YFl(tN);
        vcVar.YFl(yFl.qsH());
        JSONObject YFl3 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
        int i10 = AlY.AlY;
        if (i10 > 0) {
            try {
                YFl3.put("play_time", i10);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl3, vcVar);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "feed_over", jSONObject, dsw);
        } catch (JSONException e10) {
            YoT.YFl("TTAD.VideoEventManager", "", e10);
        }
        YFl.remove(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void YFl(android.content.Context r6, n5.a r7, com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH.YFl r8, com.bytedance.sdk.openadsdk.AlY.DSW r9) {
        /*
            if (r6 == 0) goto Lc2
            if (r7 == 0) goto Lc2
            if (r8 != 0) goto L8
            goto Lc2
        L8:
            java.util.Map<n5.a, com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH> r6 = com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl
            java.lang.Object r6 = r6.get(r7)
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH r6 = (com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH) r6
            if (r6 != 0) goto L13
            return
        L13:
            p5.c r7 = r6.AlY()
            com.bytedance.sdk.openadsdk.core.model.Wwa r0 = r6.wN()
            if (r7 == 0) goto Lc2
            if (r0 != 0) goto L21
            goto Lc2
        L21:
            boolean r1 = r8.nc()
            if (r1 != 0) goto L2a
            YFl(r0, r7, r8)
        L2a:
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.qsH r1 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.qsH
            r1.<init>()
            boolean r2 = r8.eT()
            r1.YFl(r2)
            int r2 = r0.dBO()
            o5.a r2 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r2)
            m2.l r2 = (m2.l) r2
            r2.getClass()
            java.lang.String r2 = r7.Sg()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L7e
            java.lang.String r2 = r7.pDU()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L58
            goto L7e
        L58:
            java.lang.String r2 = r7.Sg()
            java.lang.String r3 = r7.pDU()
            java.io.File r4 = com.bumptech.glide.d.G(r2, r3)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L6f
            long r2 = r4.length()
            goto L80
        L6f:
            java.io.File r2 = com.bumptech.glide.d.a(r2, r3)
            boolean r3 = r2.exists()
            if (r3 == 0) goto L7e
            long r2 = r2.length()
            goto L80
        L7e:
            r2 = 0
        L80:
            r1.Sg(r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.YFl()
            long r2 = r2 - r4
            r1.YFl(r2)
            int r2 = r6.tN()
            java.lang.String r6 = r6.Sg()
            org.json.JSONObject r6 = YFl(r0, r6, r2, r7)
            int r7 = r7.AlY
            if (r7 <= 0) goto Lad
            java.lang.String r2 = "play_time"
            r6.put(r2, r7)     // Catch: org.json.JSONException -> La5
            goto Lad
        La5:
            r7 = move-exception
            java.lang.String r2 = "TTAD.VideoEventManager"
            java.lang.String r3 = ""
            com.bytedance.sdk.component.utils.YoT.YFl(r2, r3, r7)
        Lad:
            java.lang.String r7 = com.bytedance.sdk.openadsdk.utils.Sco.YFl(r0)
            com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl r2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl
            r2.<init>(r0, r7, r6, r1)
            boolean r6 = r8.nc()
            r2.YFl(r6)
            java.lang.String r6 = "feed_play"
            YFl(r2, r6, r9)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.YFl(android.content.Context, n5.a, com.bytedance.sdk.openadsdk.AlY.wN.Sg.EH$YFl, com.bytedance.sdk.openadsdk.AlY.DSW):void");
    }

    public static void YFl(a aVar, EH.YFl yFl) {
        EH eh2;
        if (aVar == null || yFl == null || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        if (tN <= 0 || YFl2 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.DSW dsw = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.DSW();
        dsw.YFl(yFl.Sg());
        dsw.Sg(tN);
        JSONObject YFl3 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
        int i10 = AlY.AlY;
        if (i10 > 0) {
            try {
                YFl3.put("play_time", i10);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl3, dsw);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "feed_pause", jSONObject);
        } catch (JSONException e10) {
            YoT.YFl("TTAD.VideoEventManager", "", e10);
        }
    }

    public static void YFl(a aVar, EH.YFl yFl, DSW dsw) {
        EH eh2;
        if (aVar == null || yFl == null || (eh2 = YFl.get(aVar)) == null) {
            return;
        }
        c AlY = eh2.AlY();
        Wwa wN = eh2.wN();
        if (AlY == null || wN == null) {
            return;
        }
        long YFl2 = yFl.YFl();
        long tN = yFl.tN();
        AlY alY = new AlY();
        alY.Sg(yFl.Sg());
        alY.YFl(tN);
        alY.YFl(yFl.DSW());
        alY.Sg(yFl.qsH());
        JSONObject YFl3 = YFl(wN, eh2.Sg(), eh2.tN(), AlY);
        int i10 = AlY.AlY;
        if (i10 > 0) {
            try {
                YFl3.put("play_time", i10);
            } catch (JSONException e2) {
                YoT.YFl("TTAD.VideoEventManager", "", e2);
            }
        }
        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl2 = new com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl(wN, Sco.YFl(wN), YFl3, alY);
        yFl2.YFl(yFl.nc());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", YFl2);
            jSONObject.put("percent", yFl.vc());
            YFl(yFl2, "feed_break", jSONObject, dsw);
        } catch (JSONException e10) {
            YoT.YFl("TTAD.VideoEventManager", "", e10);
        }
    }

    private static void YFl(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl, String str) {
        YFl(yFl, str, (JSONObject) null, (DSW) null);
    }

    private static void YFl(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl, String str, JSONObject jSONObject) {
        YFl(yFl, str, jSONObject, (DSW) null);
    }

    private static void YFl(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl, String str, DSW dsw) {
        YFl(yFl, str, (JSONObject) null, dsw);
    }

    private static void YFl(final com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl, String str, final JSONObject jSONObject, final DSW dsw) {
        if (yFl == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (yFl.wN() && !TextUtils.isEmpty(yFl.Sg())) {
            String Sg = yFl.Sg();
            Sg.getClass();
            if (Sg.equals("stream") || Sg.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(System.currentTimeMillis(), yFl.YFl(), yFl.Sg(), str2, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.1
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                DSW dsw2;
                try {
                    JSONObject tN = com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.tN();
                    if (com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.AlY() != null) {
                        com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.AlY().YFl(tN);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (dsw2 = dsw) != null) {
                        dsw2.YFl(tN);
                    }
                    jSONObject.put("ad_extra_data", tN.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    private static void YFl(final Wwa wwa, final c cVar, final EH.YFl yFl) {
        tN.YFl();
        tN.YFl("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.AlY.wN.YFl.YFl.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                int i10;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", YFl.tN(c.this));
                jSONObject.put("player_duration", yFl.tN());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", c.this.GA());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, YFl.AlY(c.this));
                jSONObject.put("player_type", c.this.EH());
                com.bytedance.sdk.openadsdk.pDU.YFl.AlY YFl2 = com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("pangle_video_play_state");
                Wwa wwa2 = wwa;
                if (wwa2 != null) {
                    i10 = wwa2.Uv();
                } else {
                    i10 = 0;
                }
                return YFl2.YFl(i10).Sg(jSONObject.toString());
            }
        });
    }
}
