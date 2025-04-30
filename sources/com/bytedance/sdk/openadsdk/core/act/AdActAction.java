package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c.C0578b;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.YW;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u.AbstractC2736e;
import u.C2732a;
import u.C2744m;
import u.InterfaceC2745n;

/* loaded from: classes.dex */
public class AdActAction {
    private String COT;
    private woN KS;
    private BindCustomTabsServiceCallback KVG;
    private C2744m QR;
    private Long dQp;
    private String jU;
    private ActServiceConnection ku;
    private Context lMd;
    private AbstractC2736e HWF = null;
    private boolean YW = false;
    private boolean dT = false;
    private boolean Bj = false;
    private boolean vDp = false;
    private boolean tG = false;
    private long rV = 0;
    private lMd woN = new lMd() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.lMd
        public void zp(final AbstractC2736e abstractC2736e) {
            if (!QUv.COT()) {
                QUv.zp(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.zp(abstractC2736e);
                    }
                });
            } else {
                AdActAction.this.zp(abstractC2736e);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.lMd
        public void zp() {
            AdActAction.this.HWF = null;
            AdActAction.this.ku = null;
            AdActAction.this.QR = null;
        }
    };
    public InterfaceC2745n zp = new PAGEngagementSignalsCallback();
    private C2732a vwr = new PAGCustomTabsCallback();

    /* loaded from: classes.dex */
    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i9, String str);

        void onBindSuccess(C2744m c2744m);
    }

    /* loaded from: classes.dex */
    public class PAGCustomTabsCallback extends C2732a {
        public PAGCustomTabsCallback() {
        }

        @Override // u.C2732a
        public void onNavigationEvent(int i9, @Nullable Bundle bundle) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 6) {
                            AdActAction.this.zp();
                            if (!AdActAction.this.tG && AdActAction.this.KS != null && !AdActAction.this.Bj && !AdActAction.this.dT && AdActAction.this.dQp != null) {
                                com.bytedance.sdk.openadsdk.lMd.KS.zp(AdActAction.this.KS, YhE.zp(AdActAction.this.KS), SystemClock.elapsedRealtime() - AdActAction.this.dQp.longValue(), 0, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!AdActAction.this.Bj && AdActAction.this.KS != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put("url", AdActAction.this.COT);
                            jSONObject.put("preload_h5_type", AdActAction.this.KS.ho());
                            AdActAction.this.zp("load_fail", jSONObject, 0L);
                            AdActAction.this.Bj = true;
                            return;
                        } catch (Throwable th) {
                            tG.zp("AdActAction", th.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (!AdActAction.this.dT && AdActAction.this.dQp != null && AdActAction.this.KS != null) {
                    long longValue = AdActAction.this.dQp.longValue() - SystemClock.elapsedRealtime();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("first_page", true);
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put("url", AdActAction.this.COT);
                        jSONObject2.put("preload_h5_type", AdActAction.this.KS.ho());
                        AdActAction.this.zp("load_finish", jSONObject2, longValue);
                        AdActAction.this.dT = true;
                        return;
                    } catch (Throwable th2) {
                        tG.zp("AdActAction", th2.getMessage());
                        return;
                    }
                }
                return;
            }
            AdActAction.this.dQp = Long.valueOf(SystemClock.elapsedRealtime());
            if (!AdActAction.this.vDp && AdActAction.this.KS != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("render_type", "h5");
                    jSONObject3.putOpt("render_type_2", 0);
                    AdActAction.this.zp("load_start", jSONObject3, 0L);
                    AdActAction.this.vDp = true;
                } catch (Throwable th3) {
                    tG.zp("AdActAction", th3.getMessage());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class PAGEngagementSignalsCallback implements InterfaceC2745n {
        public PAGEngagementSignalsCallback() {
        }

        @Override // u.InterfaceC2745n
        public void onGreatestScrollPercentageIncreased(int i9, @NonNull Bundle bundle) {
        }

        @Override // u.InterfaceC2745n
        public void onSessionEnded(boolean z8, @NonNull Bundle bundle) {
        }

        @Override // u.InterfaceC2745n
        public void onVerticalScrollEvent(boolean z8, @NonNull Bundle bundle) {
            int i9;
            AdActAction.this.rV = System.currentTimeMillis();
            if (AdActAction.this.KS != null && !AdActAction.this.YW) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", AdActAction.this.COT);
                    jSONObject.put("down_time", AdActAction.this.rV);
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject.put("up_time", currentTimeMillis);
                    com.bytedance.sdk.openadsdk.lMd.KS.lMd(AdActAction.this.KS, YhE.zp(AdActAction.this.KS), "in_web_click", jSONObject, currentTimeMillis - AdActAction.this.rV);
                } catch (Throwable th) {
                    tG.zp("AdActAction", th.getMessage());
                }
                if (!TextUtils.isEmpty(woN.zp(AdActAction.this.lMd, AdActAction.this.KS))) {
                    YW.zp zp = new YW.zp().lMd(AdActAction.this.rV).zp(System.currentTimeMillis());
                    if (ku.lMd().zp()) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    com.bytedance.sdk.openadsdk.lMd.KS.zp(CampaignEx.JSON_NATIVE_VIDEO_CLICK, AdActAction.this.KS, zp.lMd(i9).KS(WNy.QR(AdActAction.this.lMd)).zp(WNy.COT(AdActAction.this.lMd)).lMd(WNy.HWF(AdActAction.this.lMd)).zp(), YhE.zp(AdActAction.this.KS), true, (Map<String, Object>) new HashMap(), 2);
                }
                AdActAction.this.YW = true;
            }
        }
    }

    public AdActAction(Context context, woN won, String str, String str2) {
        this.lMd = context;
        this.KS = won;
        this.jU = str;
        this.COT = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(AbstractC2736e abstractC2736e) {
        this.HWF = abstractC2736e;
        this.QR = abstractC2736e.b(this.vwr);
        com.bytedance.sdk.openadsdk.dT.zp.zp zp = zp(9);
        try {
            C2744m c2744m = this.QR;
            Bundle bundle = Bundle.EMPTY;
            c2744m.getClass();
            try {
                if (((C0578b) c2744m.b).b(c2744m.f23054c, bundle)) {
                    boolean b = this.QR.b(this.zp, bundle);
                    zp.KS(1);
                    zp.zp(1);
                    if (b) {
                        zp.jU(1);
                        zp.lMd(1);
                    } else {
                        zp.lMd(0);
                    }
                } else {
                    zp.KS(0);
                    zp.zp(0);
                }
                com.bytedance.sdk.openadsdk.lMd.KS.zp(zp);
                BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.KVG;
                if (bindCustomTabsServiceCallback != null) {
                    bindCustomTabsServiceCallback.onBindSuccess(this.QR);
                }
            } catch (SecurityException e4) {
                throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e4);
            }
        } catch (Throwable th) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.KVG;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th.getMessage());
            }
        }
    }

    public void zp(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.KVG = bindCustomTabsServiceCallback;
        if (this.lMd == null || this.KS == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.lMd.KS.zp(zp(8));
            String zp = zp.zp(this.lMd);
            if (zp == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.woN);
            this.ku = actServiceConnection;
            AbstractC2736e.a(this.lMd, zp, actServiceConnection);
        } catch (Throwable th) {
            String message = th.getMessage();
            tG.zp("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.KVG;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp() {
        try {
            ActServiceConnection actServiceConnection = this.ku;
            if (actServiceConnection == null) {
                return;
            }
            this.lMd.unbindService(actServiceConnection);
            this.HWF = null;
            this.QR = null;
            this.ku = null;
        } catch (Throwable th) {
            tG.zp("AdActAction", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, JSONObject jSONObject, long j7) {
        JSONObject jSONObject2;
        if (this.KS == null || TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject3 = null;
        try {
            jSONObject.put("is_playable", cz.lMd(this.KS) ? 1 : 0);
            jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.video.lMd.zp.zp().zp(this.KS) ? 1 : 0);
            jSONObject2 = new JSONObject();
        } catch (Throwable th) {
            th = th;
        }
        try {
            jSONObject2.put("ad_extra_data", jSONObject.toString());
            if (j7 > 0) {
                jSONObject2.put("duration", j7);
            }
        } catch (Throwable th2) {
            th = th2;
            jSONObject3 = jSONObject2;
            tG.zp("AdActAction", th.getMessage());
            jSONObject2 = jSONObject3;
            woN won = this.KS;
            com.bytedance.sdk.openadsdk.lMd.KS.KS(won, YhE.zp(won), str, jSONObject2);
        }
        woN won2 = this.KS;
        com.bytedance.sdk.openadsdk.lMd.KS.KS(won2, YhE.zp(won2), str, jSONObject2);
    }

    private com.bytedance.sdk.openadsdk.dT.zp.zp zp(int i9) {
        com.bytedance.sdk.openadsdk.dT.zp.zp zpVar = new com.bytedance.sdk.openadsdk.dT.zp.zp();
        zpVar.zp(this.jU);
        zpVar.zp(this.KS);
        zpVar.lMd(YhE.zp(this.KS));
        zpVar.zp(i9);
        zpVar.zp(false);
        zpVar.lMd(8);
        return zpVar;
    }
}
