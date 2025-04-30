package com.bytedance.sdk.openadsdk.lMd;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KVG implements com.bytedance.sdk.openadsdk.lMd.KS.COT {
    private Boolean COT;
    private JSONObject HWF;
    private Boolean KS;
    private JSONArray QR;
    private Boolean jU;
    private JSONArray ku;
    private woN lMd;
    private String zp;

    public KVG(int i9, String str, woN won) {
        Boolean bool = Boolean.FALSE;
        this.KS = bool;
        this.jU = bool;
        this.COT = bool;
        this.zp = str;
        this.lMd = won;
        this.HWF = new JSONObject();
        this.QR = new JSONArray();
        this.ku = new JSONArray();
        zp(this.HWF, "webview_source", Integer.valueOf(i9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean KVG() {
        if (!this.COT.booleanValue()) {
            if (!this.jU.booleanValue() || !this.KS.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.COT
    public void Bj() {
        this.KS = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.KS
    public void QR() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.29
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.KS
    public void YW() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "type", "native_enterBackground");
                KVG kvg = KVG.this;
                kvg.zp(kvg.QR, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.jU
    public void dQp() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.KS
    public void dT() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "type", "native_enterForeground");
                KVG kvg = KVG.this;
                kvg.zp(kvg.QR, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.KS
    public void ku() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.lMd
    public void rV() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.lMd
    public void tG() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                KVG.this.zp(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis2));
                KVG kvg2 = KVG.this;
                kvg2.zp(kvg2.HWF, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.COT
    public void vDp() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.10
            @Override // java.lang.Runnable
            public void run() {
                if (!KVG.this.KVG()) {
                    return;
                }
                if (KVG.this.QR != null && KVG.this.QR.length() != 0) {
                    try {
                        KVG.this.HWF.put("native_switchBackgroundAndForeground", KVG.this.QR);
                    } catch (Exception unused) {
                    }
                }
                if (KVG.this.ku != null && KVG.this.ku.length() != 0) {
                    try {
                        KVG.this.HWF.put("intercept_source", KVG.this.ku);
                    } catch (Exception unused2) {
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("webview_time_track", KVG.this.HWF);
                } catch (JSONException e4) {
                    com.bytedance.sdk.component.utils.tG.zp("WebviewTimeTrack", "trySendTrackInfo json error", e4);
                }
                if (com.bytedance.sdk.openadsdk.core.ku.lMd().woN() && KVG.this.HWF != null) {
                    JSONObject unused3 = KVG.this.HWF;
                }
                KS.lMd(KVG.this.lMd, KVG.this.zp, "webview_time_track", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void COT() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void HWF() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.lMd
    public void KS() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void QR(final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.21
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.KS
    public void jU() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.jU
    public void lMd() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void COT(final String str) {
        try {
            com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.18
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    KVG kvg = KVG.this;
                    kvg.zp(kvg.HWF, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void HWF(final String str) {
        try {
            com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.19
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    KVG kvg = KVG.this;
                    kvg.zp(kvg.HWF, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void KS(final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.11
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void jU(final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.17
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void lMd(final String str, final long j7, final long j9, final int i9) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.6
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str) && j9 >= j7) {
                    JSONObject jSONObject = new JSONObject();
                    KVG.this.zp(jSONObject, "start_ts", Long.valueOf(j7));
                    KVG.this.zp(jSONObject, "end_ts", Long.valueOf(j9));
                    KVG.this.zp(jSONObject, "intercept_type", Integer.valueOf(i9));
                    KVG.this.zp(jSONObject, "type", "intercept_js");
                    KVG.this.zp(jSONObject, "url", str);
                    KVG.this.zp(jSONObject, "duration", Long.valueOf(j9 - j7));
                    KVG kvg = KVG.this;
                    kvg.zp(kvg.ku, jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void KS(final int i9, final String str) {
        try {
            com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.20
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    KVG.this.zp(jSONObject, "code", Integer.valueOf(i9));
                    KVG kvg = KVG.this;
                    kvg.zp(kvg.HWF, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void lMd(final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "jsb", str);
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void lMd(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (KVG.this.HWF != null && (jSONObject2 = jSONObject) != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        KVG kvg = KVG.this;
                        kvg.zp(kvg.HWF, next, jSONObject.opt(next));
                    }
                    KVG.this.jU = Boolean.TRUE;
                    KVG.this.vDp();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.zp
    public void lMd(final int i9, final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.13
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "code", Integer.valueOf(i9));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.jU
    public void zp() {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG kvg = KVG.this;
                kvg.zp(jSONObject, "render_sequence", Integer.valueOf(kvg.lMd.yRU()));
                if (KVG.this.lMd != null && KVG.this.lMd.fRl() != null) {
                    if (KVG.this.lMd.fRl().tG()) {
                        KVG.this.zp(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.COT.COT.zp().jU()));
                        KVG.this.zp(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.COT.COT.zp().jU()));
                    } else {
                        KVG.this.zp(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.COT.COT.zp().KS()));
                        KVG.this.zp(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.COT.COT.zp().KS()));
                    }
                }
                KVG kvg2 = KVG.this;
                kvg2.zp(kvg2.HWF, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.jU
    public void zp(final int i9, final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "code", Integer.valueOf(i9));
                String str2 = str;
                if (str2 != null) {
                    KVG.this.zp(jSONObject, NotificationCompat.CATEGORY_MESSAGE, str2);
                }
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void zp(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.28
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                KVG.this.zp(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void zp(final String str, final long j7, final long j9, final int i9) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.5
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str) && j9 >= j7) {
                    JSONObject jSONObject = new JSONObject();
                    KVG.this.zp(jSONObject, "start_ts", Long.valueOf(j7));
                    KVG.this.zp(jSONObject, "end_ts", Long.valueOf(j9));
                    KVG.this.zp(jSONObject, "intercept_type", Integer.valueOf(i9));
                    KVG.this.zp(jSONObject, "type", "intercept_html");
                    KVG.this.zp(jSONObject, "url", str);
                    KVG.this.zp(jSONObject, "duration", Long.valueOf(j9 - j7));
                    KVG kvg = KVG.this;
                    kvg.zp(kvg.ku, jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void zp(final String str) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "jsb", str);
                KVG kvg = KVG.this;
                kvg.zp(kvg.HWF, "webview_jsb_start", jSONObject);
            }
        });
    }

    public KVG() {
        this.zp = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.KS = bool;
        this.jU = bool;
        this.COT = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.COT
    public void zp(boolean z8) {
        this.COT = Boolean.valueOf(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(JSONObject jSONObject, String str, Object obj, boolean z8) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z8) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(JSONObject jSONObject, String str, Object obj) {
        zp(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lMd.KS.HWF
    public void zp(final int i9) {
        com.bytedance.sdk.component.utils.ku.zp().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lMd.KVG.22
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                KVG.this.zp(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                KVG.this.zp(jSONObject, "isWebViewCache", Integer.valueOf(i9));
                if (KVG.this.lMd != null && KVG.this.lMd.fRl() != null) {
                    if (!KVG.this.lMd.fRl().tG()) {
                        KVG.this.zp(jSONObject, "engine_version", "v1");
                    } else {
                        KVG kvg = KVG.this;
                        kvg.zp(jSONObject, "engine_version", kvg.lMd.fRl().vDp());
                    }
                }
                KVG kvg2 = KVG.this;
                kvg2.zp(kvg2.HWF, "before_webview_request", jSONObject);
            }
        });
    }
}
