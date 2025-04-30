package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lMd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.RCv;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ku extends PAGRewardedAd {
    private boolean COT;
    private final AdSlot KS;
    private boolean YW;
    private com.bytedance.sdk.openadsdk.apiImpl.jU.zp jU;
    private boolean ku;
    private final com.bytedance.sdk.openadsdk.core.model.zp lMd;
    private final Context zp;
    private final AtomicBoolean HWF = new AtomicBoolean(false);
    private final String QR = FP.zp();

    public ku(Context context, com.bytedance.sdk.openadsdk.core.model.zp zpVar, AdSlot adSlot) {
        this.zp = context;
        this.lMd = zpVar;
        this.KS = adSlot;
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

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.jU = new YW(pAGRewardedAdInteractionCallback);
        zp(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.jU = new YW(pAGRewardedAdInteractionListener);
        zp(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        Context context;
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.tG.zp("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.zp zpVar = this.lMd;
        if (zpVar != null && zpVar.jU()) {
            boolean HWF = this.lMd.HWF();
            final woN COT = this.lMd.COT();
            if (com.bykv.vk.openvk.component.video.zp.KS.zp.lMd()) {
                if (!this.HWF.compareAndSet(false, true)) {
                    return;
                }
                if (COT != null && COT.eWG() != null) {
                    if (activity == null) {
                        context = this.zp;
                    } else {
                        context = activity;
                    }
                    if (context == null) {
                        context = KVG.zp();
                    }
                    if (HWF) {
                        intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
                    } else if (zp(COT)) {
                        intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
                    } else {
                        intent = new Intent(context, (Class<?>) TTRewardVideoActivity.class);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.zp.lMd.zp(intent, activity, this.COT, this.lMd, this.QR);
                    intent.putExtra("media_extra", this.KS.getMediaExtra());
                    intent.putExtra("user_id", this.KS.getUserID());
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    if (!com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                        cz.zp().zp(this.jU);
                        this.jU = null;
                    }
                    com.bytedance.sdk.component.utils.lMd.zp(context, intent, new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.reward.ku.1
                        @Override // com.bytedance.sdk.component.utils.lMd.zp
                        public void zp() {
                        }

                        @Override // com.bytedance.sdk.component.utils.lMd.zp
                        public void zp(Throwable th) {
                            com.bytedance.sdk.component.utils.tG.zp("TTRewardVideoAdImpl", "show reward video error: ", th);
                            com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    com.bytedance.sdk.openadsdk.core.tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ku.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AdSlot QUv = COT.QUv();
                                if (QUv != null) {
                                    vDp.zp(ku.this.zp).zp(QUv.getCodeId());
                                    if (ku.this.COT) {
                                        vDp.zp(ku.this.zp).lMd(QUv);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return;
                }
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.lMd.KS.lMd(COT, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.tG.zp("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d2) {
        if (!this.ku) {
            RCv.zp(this.lMd.COT(), d2);
            this.ku = true;
        }
    }

    public void zp() {
        if (this.HWF.get()) {
            return;
        }
        this.COT = true;
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
            QUv.KS(new com.bytedance.sdk.component.ku.ku("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.ku.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp();
                    if (i9 == 0 && ku.this.jU != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU jUVar = new com.bytedance.sdk.openadsdk.multipro.aidl.lMd.jU(ku.this.jU);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(zp.zp(0));
                        if (asInterface != null) {
                            try {
                                asInterface.registerRewardVideoListener(ku.this.QR, jUVar);
                            } catch (RemoteException e4) {
                                com.bytedance.sdk.component.utils.tG.zp("TTRewardVideoAdImpl", e4.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
