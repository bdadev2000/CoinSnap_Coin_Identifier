package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Sg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.dXO;
import com.bytedance.sdk.openadsdk.utils.mn;
import i5.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
class qsH extends PAGRewardedAd {
    private com.bytedance.sdk.openadsdk.YFl.wN.YFl AlY;
    private boolean NjR;
    private final com.bytedance.sdk.openadsdk.core.model.YFl Sg;
    private final Context YFl;
    private boolean qsH;
    private final AdSlot tN;
    private boolean wN;

    /* renamed from: vc, reason: collision with root package name */
    private final AtomicBoolean f10604vc = new AtomicBoolean(false);
    private final String DSW = Ne.YFl();

    public qsH(Context context, com.bytedance.sdk.openadsdk.core.model.YFl yFl, AdSlot adSlot) {
        this.YFl = context;
        this.Sg = yFl;
        this.tN = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.YFl yFl = this.Sg;
        if (yFl != null && yFl.wN() != null && this.Sg.wN().AfY() != null) {
            try {
                return this.Sg.wN().AfY().get(str);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTRewardVideoAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.YFl yFl = this.Sg;
        if (yFl != null && yFl.wN() != null) {
            return this.Sg.wN().AfY();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.NjR) {
            dXO.YFl(this.Sg.wN(), d10, str, str2);
            this.NjR = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.AlY = new NjR(pAGRewardedAdInteractionCallback);
        YFl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.AlY = new NjR(pAGRewardedAdInteractionListener);
        YFl(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        Context context;
        Intent intent;
        Intent intent2;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.YFl yFl = this.Sg;
        if (yFl != null && yFl.AlY()) {
            boolean vc2 = this.Sg.vc();
            final Wwa wN = this.Sg.wN();
            if (a.a()) {
                List<Wwa> tN = this.Sg.tN();
                if (tN != null) {
                    Iterator<Wwa> it = tN.iterator();
                    while (it.hasNext()) {
                        IPMiBroadcastReceiver.YFl(this.YFl, it.next());
                    }
                }
                if (!this.f10604vc.compareAndSet(false, true)) {
                    return;
                }
                if (wN != null && wN.BPI() != null) {
                    if (activity == null) {
                        context = this.YFl;
                    } else {
                        context = activity;
                    }
                    if (context == null) {
                        context = lG.YFl();
                    }
                    if (rkt.JwO().IXB() && YFl(this.Sg)) {
                        intent = new Intent(context, (Class<?>) TTAdActivity.class);
                    } else {
                        if (vc2) {
                            intent2 = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
                        } else if (YFl(wN)) {
                            intent2 = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
                        } else {
                            intent = new Intent(context, (Class<?>) TTRewardVideoActivity.class);
                        }
                        intent = intent2;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(intent, activity, this.wN, this.Sg, this.DSW);
                    intent.putExtra("media_extra", this.tN.getMediaExtra());
                    intent.putExtra("user_id", this.tN.getUserID());
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        bZ.YFl().YFl(this.AlY);
                        this.AlY = null;
                    }
                    com.bytedance.sdk.component.utils.Sg.YFl(context, intent, new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qsH.1
                        @Override // com.bytedance.sdk.component.utils.Sg.YFl
                        public void YFl() {
                        }

                        @Override // com.bytedance.sdk.component.utils.Sg.YFl
                        public void YFl(Throwable th2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTRewardVideoAdImpl", "show reward video error: ", th2);
                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    if (!vc2) {
                        YFl.YFl(this.Sg.wN(), this.wN, true);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.YoT.YFl("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.qsH) {
            dXO.YFl(this.Sg.wN(), d10);
            this.qsH = true;
        }
    }

    public void YFl() {
        if (this.f10604vc.get()) {
            return;
        }
        this.wN = true;
    }

    private static boolean YFl(Wwa wwa) {
        if (wwa == null) {
            return false;
        }
        int rkt = wwa.rkt();
        return (wwa.Ne() != 2 || rkt == 5 || rkt == 33 || rkt == 6 || rkt == 19 || rkt == 12) ? false : true;
    }

    private void YFl(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            mn.tN(new com.bytedance.sdk.component.qsH.qsH("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.qsH.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl YFl = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl();
                    if (i10 == 0 && qsH.this.AlY != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY alY = new com.bytedance.sdk.openadsdk.multipro.aidl.Sg.AlY(qsH.this.AlY);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(YFl.YFl(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(qsH.this.DSW, alY);
                            } catch (RemoteException e2) {
                                com.bytedance.sdk.component.utils.YoT.YFl("TTRewardVideoAdImpl", e2.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean YFl(com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        Wwa wN;
        p5.a BPI;
        String str;
        if (yFl == null || (wN = yFl.wN()) == null) {
            return false;
        }
        String YFl = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("rviv_new_arch_not_support_style", (String) null);
        if (TextUtils.isEmpty(YFl)) {
            return true;
        }
        try {
            JSONArray jSONArray = new JSONArray(YFl);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                int i11 = jSONArray.getInt(i10);
                if (i11 != 0) {
                    if (wN.rkt() == i11) {
                        return false;
                    }
                    if (i11 == 8 && (BPI = wN.BPI()) != null && (str = BPI.f23463h) != null && Uri.parse(str).getQueryParameterNames().contains("show_landingpage")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
