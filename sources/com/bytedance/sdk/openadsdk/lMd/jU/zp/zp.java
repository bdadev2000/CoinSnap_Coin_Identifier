package com.bytedance.sdk.openadsdk.lMd.jU.zp;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.KS.KS;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.lMd.QR;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.COT;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.HWF;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.YW;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dQp;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.dT;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.jU;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.ku;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.lMd;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.rV;
import com.bytedance.sdk.openadsdk.lMd.jU.lMd.tG;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private static final Map<com.bykv.vk.openvk.component.video.api.lMd.zp, dQp> zp = Collections.synchronizedMap(new WeakHashMap());

    public static void COT(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || zpVar2.YW() <= 0 || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU != null && COT != null) {
            long KS = zpVar2.KS();
            tG tGVar = new tG();
            tGVar.zp(zpVar2.lMd());
            tGVar.lMd(KS);
            tGVar.zp(zpVar2.YW());
            JSONObject zp2 = zp(COT, dqp.lMd(), dqp.KS(), jU);
            int i9 = jU.jU;
            if (i9 > 0) {
                try {
                    zp2.put("play_time", i9);
                } catch (JSONException e4) {
                    com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
                }
            }
            com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp2, tGVar);
            zpVar3.zp(zpVar2.dT());
            zp(zpVar3, "play_buffer");
        }
    }

    public static void KS(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        rV rVVar = new rV(zpVar2.vDp());
        rVVar.zp(zpVar2.lMd());
        rVVar.lMd(KS);
        JSONObject zp3 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp3.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp3, rVVar);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "play_error", jSONObject);
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e9);
        }
        zp.remove(zpVar);
    }

    public static void jU(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        lMd lmd = new lMd();
        lmd.zp(zpVar2.lMd());
        lmd.lMd(KS);
        lmd.zp(zpVar2.jU());
        lmd.lMd(zpVar2.COT());
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp(COT, dqp.lMd(), dqp.KS(), jU), lmd);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "endcard_skip", jSONObject);
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
        }
    }

    public static void lMd(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp<YW> zpVar) {
        com.bytedance.sdk.openadsdk.dT.KS.zp("load_video_cancel", zpVar);
    }

    public static JSONObject zp(woN won, String str, int i9, KS ks) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i9 > 0) {
                jSONObject.put("play_type", String.valueOf(i9));
            }
            if (won != null) {
                com.bykv.vk.openvk.component.video.api.KS.lMd eWG = won.eWG();
                if (eWG != null) {
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, eWG.YW());
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(eWG.COT()));
                    jSONObject.put(CampaignEx.JSON_KEY_VIDEO_URL, eWG.Bj());
                    jSONObject.put("player_type", ks.dQp());
                    jSONObject.put("video_encode_type", ks.Bj() ? 1 : 0);
                }
                jSONObject.put("dp_creative_type", won.que());
            }
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
        }
        return jSONObject;
    }

    public static void lMd(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        if (KS <= 0 || zp2 <= 0) {
            return;
        }
        COT cot = new COT();
        cot.zp(zpVar2.lMd());
        cot.lMd(KS);
        JSONObject zp3 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp3.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp3, cot);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "feed_continue", jSONObject);
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e9);
        }
    }

    public static void zp(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp<dT> zpVar) {
        com.bytedance.sdk.openadsdk.dT.KS.zp("load_video_error", zpVar);
    }

    public static void zp(woN won, com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, KS ks) {
        if (won == null || zpVar == null || ks == null) {
            return;
        }
        String zp2 = FP.zp();
        int i9 = CacheDirFactory.getICacheDir(won.jyq()).zp(ks) ? 1 : 2;
        zp.put(zpVar, new dQp(SystemClock.elapsedRealtime(), zp2, i9, ks, won));
        JSONObject zp3 = zp(won, zp2, i9, ks);
        String zp4 = YhE.zp(won);
        int i10 = ks.jU;
        if (i10 > 0) {
            try {
                zp3.put("play_time", i10);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar2 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(won, zp4, zp3, null);
        zpVar2.zp(ks.dQp() == -1);
        zp(zpVar2, "play_start");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jU(KS ks) {
        return new File(ks.lMd(), ks.rV()).getAbsolutePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long KS(KS ks) {
        if (ks == null) {
            return 0L;
        }
        com.bykv.vk.openvk.component.video.api.KS.lMd FP = ks.Bj() ? ks.FP() : ks.cz();
        if (FP != null) {
            return Double.valueOf(FP.HWF() * 1000.0d).longValue();
        }
        return 0L;
    }

    public static void lMd(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2, QR qr) {
        if (zpVar == null || zpVar2 == null) {
            return;
        }
        COT(zpVar, zpVar2);
        dQp dqp = zp.get(zpVar);
        if (dqp == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        HWF hwf = new HWF();
        hwf.lMd(zpVar2.lMd());
        hwf.zp(KS);
        hwf.zp(zpVar2.ku());
        JSONObject zp3 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp3.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp3, hwf);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "feed_over", jSONObject, qr);
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e9);
        }
        zp.remove(zpVar);
    }

    public static void zp(Context context, com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2, QR qr) {
        dQp dqp;
        if (context == null || zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        if (!zpVar2.dT()) {
            zp(COT, jU, zpVar2);
        }
        ku kuVar = new ku();
        kuVar.zp(zpVar2.Bj() ? 1 : 0);
        kuVar.lMd(CacheDirFactory.getICacheDir(COT.jyq()).lMd(jU));
        kuVar.zp(SystemClock.elapsedRealtime() - dqp.zp());
        JSONObject zp2 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp2.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp2, kuVar);
        zpVar3.zp(zpVar2.dT());
        zp(zpVar3, "feed_play", qr);
    }

    public static void zp(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        if (KS <= 0 || zp2 <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.QR qr = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.QR();
        qr.zp(zpVar2.lMd());
        qr.lMd(KS);
        JSONObject zp3 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp3.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp3, qr);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "feed_pause", jSONObject);
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e9);
        }
    }

    public static void zp(com.bykv.vk.openvk.component.video.api.lMd.zp zpVar, dQp.zp zpVar2, QR qr) {
        dQp dqp;
        if (zpVar == null || zpVar2 == null || (dqp = zp.get(zpVar)) == null) {
            return;
        }
        KS jU = dqp.jU();
        woN COT = dqp.COT();
        if (jU == null || COT == null) {
            return;
        }
        long zp2 = zpVar2.zp();
        long KS = zpVar2.KS();
        jU jUVar = new jU();
        jUVar.lMd(zpVar2.lMd());
        jUVar.zp(KS);
        jUVar.zp(zpVar2.QR());
        jUVar.lMd(zpVar2.ku());
        JSONObject zp3 = zp(COT, dqp.lMd(), dqp.KS(), jU);
        int i9 = jU.jU;
        if (i9 > 0) {
            try {
                zp3.put("play_time", i9);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e4);
            }
        }
        com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar3 = new com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp(COT, YhE.zp(COT), zp3, jUVar);
        zpVar3.zp(zpVar2.dT());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", zp2);
            jSONObject.put("percent", zpVar2.HWF());
            zp(zpVar3, "feed_break", jSONObject, qr);
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.VideoEventManager", "", e9);
        }
    }

    private static void zp(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar, String str) {
        zp(zpVar, str, (JSONObject) null, (QR) null);
    }

    private static void zp(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar, String str, JSONObject jSONObject) {
        zp(zpVar, str, jSONObject, (QR) null);
    }

    private static void zp(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar, String str, QR qr) {
        zp(zpVar, str, (JSONObject) null, qr);
    }

    private static void zp(final com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar, String str, JSONObject jSONObject, final QR qr) {
        if (zpVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        if (zpVar.COT() && !TextUtils.isEmpty(zpVar.lMd())) {
            String lMd = zpVar.lMd();
            lMd.getClass();
            if (lMd.equals("stream") || lMd.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.lMd.KS.zp(System.currentTimeMillis(), zpVar.zp(), zpVar.lMd(), str2, jSONObject2, qr, new com.bytedance.sdk.openadsdk.lMd.lMd.zp() { // from class: com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.1
            @Override // com.bytedance.sdk.openadsdk.lMd.lMd.zp
            public void zp(JSONObject jSONObject3) throws JSONException {
                QR qr2;
                JSONObject KS = com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.KS();
                if (com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.jU() != null) {
                    com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.jU().zp(KS);
                }
                if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (qr2 = qr) != null) {
                    qr2.zp(KS);
                }
                jSONObject3.put("ad_extra_data", KS.toString());
            }
        });
    }

    private static void zp(final woN won, final KS ks, final dQp.zp zpVar) {
        com.bytedance.sdk.openadsdk.dT.KS.zp();
        com.bytedance.sdk.openadsdk.dT.KS.zp("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.lMd.jU.zp.zp.2
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                int i9;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", zp.KS(KS.this));
                jSONObject.put("player_duration", zpVar.KS());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", KS.this.tG());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, zp.jU(KS.this));
                jSONObject.put("player_type", KS.this.dQp());
                com.bytedance.sdk.openadsdk.dT.zp.KS zp2 = com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("pangle_video_play_state");
                woN won2 = won;
                if (won2 != null) {
                    i9 = won2.Dp();
                } else {
                    i9 = 0;
                }
                return zp2.zp(i9).lMd(jSONObject.toString());
            }
        });
    }
}
