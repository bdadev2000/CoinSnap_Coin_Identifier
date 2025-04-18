package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.c;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.model.nc;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import o.a;
import o.h;
import o.s;
import o.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdActAction {
    private String AlY;
    private s DSW;
    private Long EH;
    private Context Sg;
    private ActServiceConnection qsH;
    private BindCustomTabsServiceCallback rkt;
    private Wwa tN;
    private String wN;

    /* renamed from: vc, reason: collision with root package name */
    private h f10667vc = null;
    private boolean NjR = false;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10666nc = false;
    private boolean eT = false;
    private boolean YoT = false;
    private boolean GA = false;
    private long pDU = 0;
    private Sg lG = new Sg() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1
        @Override // com.bytedance.sdk.openadsdk.core.act.Sg
        public void YFl(final h hVar) {
            if (!mn.wN()) {
                mn.YFl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdActAction.this.YFl(hVar);
                    }
                });
            } else {
                AdActAction.this.YFl(hVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.act.Sg
        public void YFl() {
            AdActAction.this.f10667vc = null;
            AdActAction.this.qsH = null;
            AdActAction.this.DSW = null;
        }
    };
    public t YFl = new PAGEngagementSignalsCallback();
    private a Wwa = new PAGCustomTabsCallback();

    /* loaded from: classes.dex */
    public interface BindCustomTabsServiceCallback {
        void onBindFail(int i10, String str);

        void onBindSuccess(s sVar);
    }

    /* loaded from: classes.dex */
    public class PAGCustomTabsCallback extends a {
        public PAGCustomTabsCallback() {
        }

        @Override // o.a
        public void onNavigationEvent(int i10, @Nullable Bundle bundle) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            AdActAction.this.YFl();
                            if (!AdActAction.this.GA && AdActAction.this.tN != null && !AdActAction.this.eT && !AdActAction.this.f10666nc && AdActAction.this.EH != null) {
                                com.bytedance.sdk.openadsdk.AlY.tN.YFl(AdActAction.this.tN, Sco.YFl(AdActAction.this.tN), SystemClock.elapsedRealtime() - AdActAction.this.EH.longValue(), 0, 1);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!AdActAction.this.eT && AdActAction.this.tN != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put("url", AdActAction.this.wN);
                            jSONObject.put("preload_h5_type", AdActAction.this.tN.rnG());
                            AdActAction.this.YFl("load_fail", jSONObject, 0L);
                            AdActAction.this.eT = true;
                            return;
                        } catch (Throwable th2) {
                            YoT.YFl("AdActAction", th2.getMessage());
                            return;
                        }
                    }
                    return;
                }
                if (!AdActAction.this.f10666nc && AdActAction.this.EH != null && AdActAction.this.tN != null) {
                    long longValue = AdActAction.this.EH.longValue() - SystemClock.elapsedRealtime();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("first_page", true);
                        jSONObject2.putOpt("render_type", "h5");
                        jSONObject2.putOpt("render_type_2", 0);
                        jSONObject2.put("url", AdActAction.this.wN);
                        jSONObject2.put("preload_h5_type", AdActAction.this.tN.rnG());
                        AdActAction.this.YFl("load_finish", jSONObject2, longValue);
                        AdActAction.this.f10666nc = true;
                        return;
                    } catch (Throwable th3) {
                        YoT.YFl("AdActAction", th3.getMessage());
                        return;
                    }
                }
                return;
            }
            AdActAction.this.EH = Long.valueOf(SystemClock.elapsedRealtime());
            if (!AdActAction.this.YoT && AdActAction.this.tN != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("render_type", "h5");
                    jSONObject3.putOpt("render_type_2", 0);
                    AdActAction.this.YFl("load_start", jSONObject3, 0L);
                    AdActAction.this.YoT = true;
                } catch (Throwable th4) {
                    YoT.YFl("AdActAction", th4.getMessage());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class PAGEngagementSignalsCallback implements t {
        public PAGEngagementSignalsCallback() {
        }

        @Override // o.t
        public void onGreatestScrollPercentageIncreased(int i10, @NonNull Bundle bundle) {
        }

        @Override // o.t
        public void onSessionEnded(boolean z10, @NonNull Bundle bundle) {
        }

        @Override // o.t
        public void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle) {
            int i10;
            AdActAction.this.pDU = System.currentTimeMillis();
            if (AdActAction.this.tN != null && !AdActAction.this.NjR) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", AdActAction.this.wN);
                    jSONObject.put("down_time", AdActAction.this.pDU);
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject.put("up_time", currentTimeMillis);
                    com.bytedance.sdk.openadsdk.AlY.tN.Sg(AdActAction.this.tN, Sco.YFl(AdActAction.this.tN), "in_web_click", jSONObject, currentTimeMillis - AdActAction.this.pDU);
                } catch (Throwable th2) {
                    YoT.YFl("AdActAction", th2.getMessage());
                }
                if (!TextUtils.isEmpty(Wwa.YFl(AdActAction.this.Sg, AdActAction.this.tN))) {
                    nc.YFl YFl = new nc.YFl().Sg(AdActAction.this.pDU).YFl(System.currentTimeMillis());
                    if (NjR.Sg().YFl()) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    com.bytedance.sdk.openadsdk.AlY.tN.YFl(CampaignEx.JSON_NATIVE_VIDEO_CLICK, AdActAction.this.tN, YFl.Sg(i10).tN(GS.DSW(AdActAction.this.Sg)).YFl(GS.wN(AdActAction.this.Sg)).Sg(GS.vc(AdActAction.this.Sg)).YFl(), Sco.YFl(AdActAction.this.tN), true, (Map<String, Object>) new HashMap(), 2);
                }
                AdActAction.this.NjR = true;
            }
        }
    }

    public AdActAction(Context context, Wwa wwa, String str, String str2) {
        this.Sg = context;
        this.tN = wwa;
        this.AlY = str;
        this.wN = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(h hVar) {
        this.f10667vc = hVar;
        this.DSW = hVar.c(this.Wwa);
        com.bytedance.sdk.openadsdk.pDU.YFl.Sg YFl = YFl(9);
        try {
            s sVar = this.DSW;
            Bundle bundle = Bundle.EMPTY;
            Bundle a = sVar.a(bundle);
            try {
                if (((c) sVar.f22950b).d(sVar.f22951c, a)) {
                    boolean c10 = this.DSW.c(this.YFl, bundle);
                    YFl.tN(1);
                    YFl.YFl(1);
                    if (c10) {
                        YFl.AlY(1);
                        YFl.Sg(1);
                    } else {
                        YFl.Sg(0);
                    }
                } else {
                    YFl.tN(0);
                    YFl.YFl(0);
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl);
                BindCustomTabsServiceCallback bindCustomTabsServiceCallback = this.rkt;
                if (bindCustomTabsServiceCallback != null) {
                    bindCustomTabsServiceCallback.onBindSuccess(this.DSW);
                }
            } catch (SecurityException e2) {
                throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
            }
        } catch (Throwable th2) {
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.rkt;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(11, th2.getMessage());
            }
        }
    }

    public void YFl(BindCustomTabsServiceCallback bindCustomTabsServiceCallback) {
        this.rkt = bindCustomTabsServiceCallback;
        if (this.Sg == null || this.tN == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(YFl(8));
            String YFl = YFl.YFl(this.Sg);
            if (YFl == null) {
                return;
            }
            ActServiceConnection actServiceConnection = new ActServiceConnection(this.lG);
            this.qsH = actServiceConnection;
            h.a(this.Sg, YFl, actServiceConnection);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            YoT.YFl("AdActAction", message);
            BindCustomTabsServiceCallback bindCustomTabsServiceCallback2 = this.rkt;
            if (bindCustomTabsServiceCallback2 != null) {
                bindCustomTabsServiceCallback2.onBindFail(10, message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl() {
        try {
            ActServiceConnection actServiceConnection = this.qsH;
            if (actServiceConnection == null) {
                return;
            }
            this.Sg.unbindService(actServiceConnection);
            this.f10667vc = null;
            this.DSW = null;
            this.qsH = null;
        } catch (Throwable th2) {
            YoT.YFl("AdActAction", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(String str, final JSONObject jSONObject, final long j3) {
        if (this.tN == null || TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Wwa wwa = this.tN;
        com.bytedance.sdk.openadsdk.AlY.tN.YFl(currentTimeMillis, wwa, Sco.YFl(wwa), str, new com.bytedance.sdk.openadsdk.pDU.tN.YFl() { // from class: com.bytedance.sdk.openadsdk.core.act.AdActAction.2
            @Override // com.bytedance.sdk.openadsdk.pDU.tN.YFl
            public JSONObject YFl() {
                JSONObject jSONObject2;
                Throwable th2;
                int i10;
                try {
                    JSONObject jSONObject3 = jSONObject;
                    int i11 = 1;
                    if (Ne.Sg(AdActAction.this.tN)) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    jSONObject3.put("is_playable", i10);
                    JSONObject jSONObject4 = jSONObject;
                    if (!com.bytedance.sdk.openadsdk.core.GA.tN.YFl.YFl().YFl(AdActAction.this.tN)) {
                        i11 = 0;
                    }
                    jSONObject4.put("usecache", i11);
                    jSONObject2 = new JSONObject();
                } catch (Throwable th3) {
                    jSONObject2 = null;
                    th2 = th3;
                }
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    long j10 = j3;
                    if (j10 > 0) {
                        jSONObject2.put("duration", j10);
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    YoT.YFl("AdActAction", th2.getMessage());
                    return jSONObject2;
                }
                return jSONObject2;
            }
        });
    }

    private com.bytedance.sdk.openadsdk.pDU.YFl.Sg YFl(int i10) {
        com.bytedance.sdk.openadsdk.pDU.YFl.Sg sg2 = new com.bytedance.sdk.openadsdk.pDU.YFl.Sg();
        sg2.YFl(this.AlY);
        sg2.YFl(this.tN);
        sg2.Sg(Sco.YFl(this.tN));
        sg2.YFl(i10);
        sg2.YFl(false);
        sg2.Sg(8);
        return sg2;
    }
}
