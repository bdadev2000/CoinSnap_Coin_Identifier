package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.lMd;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.RCv;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class HWF extends PAGInterstitialAd {
    private com.bytedance.sdk.openadsdk.apiImpl.lMd.lMd KS;
    private boolean YW;
    private boolean ku;
    private final com.bytedance.sdk.openadsdk.core.model.zp lMd;
    private final Context zp;
    private final AtomicBoolean COT = new AtomicBoolean(false);
    private boolean HWF = false;
    private boolean jU = false;
    private final String QR = FP.zp();

    public HWF(Context context, com.bytedance.sdk.openadsdk.core.model.zp zpVar) {
        this.zp = context;
        this.lMd = zpVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.zp zpVar = this.lMd;
        if (zpVar != null && zpVar.COT() != null) {
            return this.lMd.COT().zpV();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d2, String str, String str2) {
        if (!this.YW) {
            RCv.zp(this.lMd.COT(), d2, str, str2);
            this.YW = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.KS = new com.bytedance.sdk.openadsdk.component.KS.zp(pAGInterstitialAdInteractionCallback);
        zp(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.KS = new com.bytedance.sdk.openadsdk.component.KS.zp(pAGInterstitialAdInteractionListener);
        zp(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Context context;
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.tG.zp("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.zp zpVar = this.lMd;
        if (zpVar != null && zpVar.jU()) {
            boolean HWF = this.lMd.HWF();
            final woN COT = this.lMd.COT();
            if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
                if (this.COT.get()) {
                    return;
                }
                this.COT.set(true);
                if (COT != null && (COT.eWG() != null || COT.Rg() != null)) {
                    if (activity == null) {
                        context = this.zp;
                    } else {
                        context = activity;
                    }
                    if (context == null) {
                        context = KVG.zp();
                    }
                    if (HWF) {
                        intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
                    } else if (zp(COT)) {
                        if (com.bytedance.sdk.openadsdk.component.reward.lMd.ku.zp(COT)) {
                            intent = new Intent(context, (Class<?>) TTInterstitialExpressActivity.class);
                        } else {
                            intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
                        }
                    } else if (com.bytedance.sdk.openadsdk.component.reward.lMd.ku.zp(COT)) {
                        intent = new Intent(context, (Class<?>) TTInterstitialActivity.class);
                    } else {
                        intent = new Intent(context, (Class<?>) TTFullScreenVideoActivity.class);
                    }
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(intent, activity, this.jU, this.lMd, this.QR);
                    intent.putExtra("is_verity_playable", this.HWF);
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        cz.zp().zp(this.KS);
                        this.KS = null;
                    }
                    com.bytedance.sdk.component.utils.lMd.zp(context, intent, new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.HWF.1
                        @Override // com.bytedance.sdk.component.utils.lMd.zp
                        public void zp() {
                            if (HWF.this.HWF) {
                                try {
                                    com.bytedance.sdk.openadsdk.dT.KS.zp().zp(COT.eWG().vDp());
                                } catch (Throwable unused) {
                                }
                            }
                        }

                        @Override // com.bytedance.sdk.component.utils.lMd.zp
                        public void zp(Throwable th) {
                            com.bytedance.sdk.component.utils.tG.zp("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                            if (HWF.this.HWF) {
                                try {
                                    com.bytedance.sdk.openadsdk.dT.KS.zp().zp(COT.eWG().vDp(), -1, th != null ? th.getMessage() : "playable tool error open");
                                } catch (Throwable unused) {
                                }
                            }
                            com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    if (!HWF) {
                        zp.zp(this.lMd.COT(), this.jU);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.tG.zp("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d2) {
        if (!this.ku) {
            RCv.zp(this.lMd.COT(), d2);
            this.ku = true;
        }
    }

    public void zp(boolean z8) {
        this.HWF = z8;
    }

    public void zp() {
        if (this.COT.get()) {
            return;
        }
        this.jU = true;
    }

    private static boolean zp(woN won) {
        if (won == null) {
            return false;
        }
        int rV = won.rV();
        return (won.cz() != 2 || rV == 5 || rV == 33 || rV == 6 || rV == 19 || rV == 12) ? false : true;
    }

    private void zp(final int i9) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            QUv.KS(new com.bytedance.sdk.component.ku.ku("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.HWF.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp();
                    if (i9 == 1 && HWF.this.KS != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.lMd.KS ks = new com.bytedance.sdk.openadsdk.multipro.aidl.lMd.KS(HWF.this.KS);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(zp.zp(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(HWF.this.QR, ks);
                            } catch (RemoteException e4) {
                                com.bytedance.sdk.component.utils.tG.zp("TTFullScreenVideoAdImpl", e4.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
