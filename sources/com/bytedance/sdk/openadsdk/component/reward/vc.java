package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.Sg;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
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

/* loaded from: classes.dex */
class vc extends PAGInterstitialAd {
    private boolean NjR;
    private final com.bytedance.sdk.openadsdk.core.model.YFl Sg;
    private final Context YFl;
    private boolean qsH;
    private com.bytedance.sdk.openadsdk.YFl.tN.Sg tN;
    private final AtomicBoolean wN = new AtomicBoolean(false);

    /* renamed from: vc, reason: collision with root package name */
    private boolean f10607vc = false;
    private boolean AlY = false;
    private final String DSW = Ne.YFl();

    public vc(Context context, com.bytedance.sdk.openadsdk.core.model.YFl yFl) {
        this.YFl = context;
        this.Sg = yFl;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.YFl yFl = this.Sg;
        if (yFl != null && yFl.wN() != null && this.Sg.wN().AfY() != null) {
            try {
                return this.Sg.wN().AfY().get(str);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTFullScreenVideoAdImpl", th2.getMessage());
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

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.tN = new com.bytedance.sdk.openadsdk.component.tN.YFl(pAGInterstitialAdInteractionCallback);
        YFl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.tN = new com.bytedance.sdk.openadsdk.component.tN.YFl(pAGInterstitialAdInteractionListener);
        YFl(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        Context context;
        Intent intent;
        Intent intent2;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
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
                if (this.wN.get()) {
                    return;
                }
                this.wN.set(true);
                if (wN != null && (wN.BPI() != null || wN.VB() != null)) {
                    if (activity == null) {
                        context = this.YFl;
                    } else {
                        context = activity;
                    }
                    if (context == null) {
                        context = lG.YFl();
                    }
                    if (rkt.JwO().IXB() && qsH.YFl(this.Sg)) {
                        intent = new Intent(context, (Class<?>) TTAdActivity.class);
                    } else {
                        if (vc2) {
                            intent2 = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
                        } else if (YFl(wN)) {
                            if (com.bytedance.sdk.openadsdk.component.reward.Sg.qsH.YFl(wN)) {
                                intent = new Intent(context, (Class<?>) TTInterstitialExpressActivity.class);
                            } else {
                                intent2 = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
                            }
                        } else if (com.bytedance.sdk.openadsdk.component.reward.Sg.qsH.YFl(wN)) {
                            intent = new Intent(context, (Class<?>) TTInterstitialActivity.class);
                        } else {
                            intent = new Intent(context, (Class<?>) TTFullScreenVideoActivity.class);
                        }
                        intent = intent2;
                    }
                    intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                    com.bytedance.sdk.openadsdk.component.reward.YFl.Sg.YFl(intent, activity, this.AlY, this.Sg, this.DSW);
                    intent.putExtra("is_verity_playable", this.f10607vc);
                    if (!com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                        bZ.YFl().YFl(this.tN);
                        this.tN = null;
                    }
                    com.bytedance.sdk.component.utils.Sg.YFl(context, intent, new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.reward.vc.1
                        @Override // com.bytedance.sdk.component.utils.Sg.YFl
                        public void YFl() {
                            if (vc.this.f10607vc) {
                                try {
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(wN.BPI().f23463h);
                                } catch (Throwable unused) {
                                }
                            }
                        }

                        @Override // com.bytedance.sdk.component.utils.Sg.YFl
                        public void YFl(Throwable th2) {
                            com.bytedance.sdk.component.utils.YoT.YFl("TTFullScreenVideoAdImpl", "show full screen video error: ", th2);
                            if (vc.this.f10607vc) {
                                try {
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(wN.BPI().f23463h, -1, th2 != null ? th2.getMessage() : "playable tool error open");
                                } catch (Throwable unused) {
                                }
                            }
                            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "activity start  fail ");
                        }
                    });
                    if (!vc2) {
                        YFl.YFl(this.Sg.wN(), this.AlY, false);
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wN, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.YoT.YFl("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.qsH) {
            dXO.YFl(this.Sg.wN(), d10);
            this.qsH = true;
        }
    }

    public void YFl(boolean z10) {
        this.f10607vc = z10;
    }

    public void YFl() {
        if (this.wN.get()) {
            return;
        }
        this.AlY = true;
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
            mn.tN(new com.bytedance.sdk.component.qsH.qsH("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.vc.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl YFl = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl();
                    if (i10 == 1 && vc.this.tN != null) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.Sg.tN tNVar = new com.bytedance.sdk.openadsdk.multipro.aidl.Sg.tN(vc.this.tN);
                        IListenerManager asInterface = IListenerManager.Stub.asInterface(YFl.YFl(1));
                        if (asInterface != null) {
                            try {
                                asInterface.registerFullVideoListener(vc.this.DSW, tNVar);
                            } catch (RemoteException e2) {
                                com.bytedance.sdk.component.utils.YoT.YFl("TTFullScreenVideoAdImpl", e2.getMessage());
                            }
                        }
                    }
                }
            }, 5);
        }
    }
}
