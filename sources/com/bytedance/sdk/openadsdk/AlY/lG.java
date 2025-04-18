package com.bytedance.sdk.openadsdk.AlY;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lG implements com.bytedance.sdk.openadsdk.AlY.AlY.wN {
    private Boolean AlY;
    private JSONArray DSW;
    private Wwa Sg;
    private String YFl;
    private JSONArray qsH;
    private Boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private JSONObject f10501vc;
    private Boolean wN;

    public lG(int i10, String str, Wwa wwa) {
        Boolean bool = Boolean.FALSE;
        this.tN = bool;
        this.AlY = bool;
        this.wN = bool;
        this.YFl = str;
        this.Sg = wwa;
        this.f10501vc = new JSONObject();
        this.DSW = new JSONArray();
        this.qsH = new JSONArray();
        YFl(this.f10501vc, "webview_source", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lG() {
        if (this.wN.booleanValue()) {
            return true;
        }
        return this.AlY.booleanValue() && this.tN.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.tN
    public void DSW() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.30
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.AlY
    public void EH() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.Sg
    public void GA() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                lG.this.YFl(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis2));
                lG lGVar2 = lG.this;
                lGVar2.YFl(lGVar2.f10501vc, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.tN
    public void NjR() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "type", "native_enterBackground");
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.DSW, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.wN
    public void YoT() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.10
            @Override // java.lang.Runnable
            public void run() {
                if (!lG.this.lG()) {
                    return;
                }
                if (lG.this.DSW != null && lG.this.DSW.length() != 0) {
                    try {
                        lG.this.f10501vc.put("native_switchBackgroundAndForeground", lG.this.DSW);
                    } catch (Exception unused) {
                    }
                }
                if (lG.this.qsH != null && lG.this.qsH.length() != 0) {
                    try {
                        lG.this.f10501vc.put("intercept_source", lG.this.qsH);
                    } catch (Exception unused2) {
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("webview_time_track", lG.this.f10501vc);
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("WebviewTimeTrack", "trySendTrackInfo json error", e2);
                }
                if (com.bytedance.sdk.openadsdk.core.NjR.Sg().lG() && lG.this.f10501vc != null) {
                    JSONObject unused3 = lG.this.f10501vc;
                }
                tN.Sg(lG.this.Sg, lG.this.YFl, "webview_time_track", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.wN
    public void eT() {
        this.tN = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.tN
    public void nc() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "type", "native_enterForeground");
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.DSW, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.Sg
    public void pDU() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.tN
    public void qsH() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.2
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.AlY
    public void rkt() {
        try {
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.17
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.f10501vc, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.tN
    public void AlY() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void DSW(final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.22
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.AlY
    public void Sg() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.Sg
    public void tN() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void vc() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.28
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void wN() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void AlY(final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.18
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void Sg(final String str, final long j3, final long j10, final int i10) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.6
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str) && j10 >= j3) {
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, "start_ts", Long.valueOf(j3));
                    lG.this.YFl(jSONObject, "end_ts", Long.valueOf(j10));
                    lG.this.YFl(jSONObject, "intercept_type", Integer.valueOf(i10));
                    lG.this.YFl(jSONObject, "type", "intercept_js");
                    lG.this.YFl(jSONObject, "url", str);
                    lG.this.YFl(jSONObject, "duration", Long.valueOf(j10 - j3));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.qsH, jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void tN(final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.11
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void vc(final String str) {
        try {
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.20
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.f10501vc, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void wN(final String str) {
        try {
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.19
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.f10501vc, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void Sg(final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "jsb", str);
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void tN(final int i10, final String str) {
        try {
            com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.21
                @Override // java.lang.Runnable
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                    lG.this.YFl(jSONObject, "code", Integer.valueOf(i10));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.f10501vc, str, jSONObject);
                }
            });
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void Sg(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.9
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (lG.this.f10501vc != null && (jSONObject2 = jSONObject) != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        lG lGVar = lG.this;
                        lGVar.YFl(lGVar.f10501vc, next, jSONObject.opt(next));
                    }
                    lG.this.AlY = Boolean.TRUE;
                    lG.this.YoT();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.YFl
    public void Sg(final int i10, final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.13
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "code", Integer.valueOf(i10));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.AlY
    public void YFl() {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG lGVar = lG.this;
                lGVar.YFl(jSONObject, "render_sequence", Integer.valueOf(lGVar.Sg.UZM()));
                if (lG.this.Sg != null) {
                    if (lG.this.Sg.lu() != null) {
                        if (lG.this.Sg.lu().pDU()) {
                            lG.this.YFl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().AlY()));
                            lG.this.YFl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().AlY()));
                        } else {
                            lG.this.YFl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().tN()));
                            lG.this.YFl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().tN()));
                        }
                    } else if (lG.this.Sg.UI() != null) {
                        lG.this.YFl(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().AlY()));
                        lG.this.YFl(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.wN.wN.YFl().AlY()));
                    }
                }
                lG lGVar2 = lG.this;
                lGVar2.YFl(lGVar2.f10501vc, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.AlY
    public void YFl(final int i10, final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "code", Integer.valueOf(i10));
                String str2 = str;
                if (str2 != null) {
                    lG.this.YFl(jSONObject, "reason", str2);
                }
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void YFl(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.29
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                lG.this.YFl(jSONObject2, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(System.currentTimeMillis()));
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void YFl(final String str, final long j3, final long j10, final int i10) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.5
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(str) && j10 >= j3) {
                    JSONObject jSONObject = new JSONObject();
                    lG.this.YFl(jSONObject, "start_ts", Long.valueOf(j3));
                    lG.this.YFl(jSONObject, "end_ts", Long.valueOf(j10));
                    lG.this.YFl(jSONObject, "intercept_type", Integer.valueOf(i10));
                    lG.this.YFl(jSONObject, "type", "intercept_html");
                    lG.this.YFl(jSONObject, "url", str);
                    lG.this.YFl(jSONObject, "duration", Long.valueOf(j10 - j3));
                    lG lGVar = lG.this;
                    lGVar.YFl(lGVar.qsH, jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void YFl(final String str) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "jsb", str);
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "webview_jsb_start", jSONObject);
            }
        });
    }

    public lG() {
        this.YFl = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.tN = bool;
        this.AlY = bool;
        this.wN = bool;
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.wN
    public void YFl(boolean z10) {
        this.wN = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(JSONObject jSONObject, String str, Object obj, boolean z10) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
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
    public void YFl(JSONObject jSONObject, String str, Object obj) {
        YFl(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.AlY.AlY.vc
    public void YFl(final int i10) {
        com.bytedance.sdk.component.utils.DSW.YFl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.AlY.lG.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                lG.this.YFl(jSONObject, CampaignEx.JSON_KEY_ST_TS, Long.valueOf(currentTimeMillis));
                lG.this.YFl(jSONObject, "isWebViewCache", Integer.valueOf(i10));
                if (lG.this.Sg != null) {
                    if (lG.this.Sg.mB()) {
                        lG.this.YFl(jSONObject, "engine_version", "v3");
                    } else {
                        lG.this.YFl(jSONObject, "engine_version", "v1");
                    }
                }
                lG lGVar = lG.this;
                lGVar.YFl(lGVar.f10501vc, "before_webview_request", jSONObject);
            }
        });
    }
}
