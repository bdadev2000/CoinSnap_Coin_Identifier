package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.component.utils.lMd;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.RCv;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class jU extends PAGAppOpenAd {
    private final AtomicBoolean COT = new AtomicBoolean(false);
    private final String HWF = FP.zp();
    private final AdSlot KS;
    private final boolean QR;
    private boolean YW;
    private com.bytedance.sdk.openadsdk.apiImpl.KS.lMd jU;
    private boolean ku;
    private final woN lMd;
    private final Context zp;

    public jU(Context context, @NonNull woN won, boolean z8, AdSlot adSlot) {
        this.zp = context;
        this.lMd = won;
        this.QR = z8;
        this.KS = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        woN won = this.lMd;
        if (won != null) {
            return won.zpV();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d2, String str, String str2) {
        if (!this.YW) {
            RCv.zp(this.lMd, d2, str, str2);
            this.YW = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.jU = new COT(pAGAppOpenAdInteractionCallback);
        zp();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.jU = new COT(pAGAppOpenAdInteractionListener);
        zp();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        Context context;
        int i9;
        int i10;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.COT.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (activity != null) {
                context = activity;
            } else {
                context = this.zp;
            }
            if (context == null) {
                context = KVG.zp();
            }
            try {
                i9 = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
                i9 = 0;
            }
            Intent intent = new Intent(context, (Class<?>) TTAppOpenAdActivity.class);
            intent.putExtra("orientation_angle", i9);
            if (this.QR) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            intent.putExtra("ad_source", i10);
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.lMd.Eg().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.HWF);
            } else {
                cz.zp().HWF();
                cz.zp().zp(this.lMd);
                cz.zp().zp(this.jU);
                this.jU = null;
            }
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            com.bytedance.sdk.component.utils.lMd.zp(context, intent, new lMd.zp() { // from class: com.bytedance.sdk.openadsdk.component.jU.2
                @Override // com.bytedance.sdk.component.utils.lMd.zp
                public void zp() {
                }

                @Override // com.bytedance.sdk.component.utils.lMd.zp
                public void zp(Throwable th) {
                }
            });
            if (this.KS != null) {
                try {
                    if (dQp.etV().RCv(this.KS.getCodeId()) == 1) {
                        HWF zp = HWF.zp(this.zp);
                        zp.QR(Integer.parseInt(this.KS.getCodeId()));
                        zp.zp(this.KS);
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            return;
        }
        tG.zp("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d2) {
        if (!this.ku) {
            RCv.zp(this.lMd, d2);
            this.ku = true;
        }
    }

    private void zp() {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            QUv.KS(new ku("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.jU.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager asInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp();
                    if (jU.this.jU != null && (asInterface = IListenerManager.Stub.asInterface(zp.zp(7))) != null) {
                        try {
                            asInterface.registerAppOpenAdListener(jU.this.HWF, new com.bytedance.sdk.openadsdk.multipro.aidl.lMd.zp(jU.this.jU));
                            jU.this.jU = null;
                        } catch (RemoteException e4) {
                            tG.zp("TTAppOpenAdImpl", e4.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
