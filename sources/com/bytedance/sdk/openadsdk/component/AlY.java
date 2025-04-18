package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.Sg;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.bZ;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.dXO;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AlY extends PAGAppOpenAd {
    private com.bytedance.sdk.openadsdk.YFl.AlY.Sg AlY;
    private final boolean DSW;
    private boolean NjR;
    private final Wwa Sg;
    private final Context YFl;
    private boolean qsH;
    private final AdSlot tN;
    private final AtomicBoolean wN = new AtomicBoolean(false);

    /* renamed from: vc, reason: collision with root package name */
    private final String f10569vc = Ne.YFl();

    public AlY(Context context, @NonNull Wwa wwa, boolean z10, AdSlot adSlot) {
        this.YFl = context;
        this.Sg = wwa;
        this.DSW = z10;
        this.tN = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Wwa wwa = this.Sg;
        if (wwa != null && wwa.AfY() != null) {
            try {
                return this.Sg.AfY().get(str);
            } catch (Throwable th2) {
                YoT.YFl("TTAppOpenAdImpl", th2.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        Wwa wwa = this.Sg;
        if (wwa != null) {
            return wwa.AfY();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (!this.NjR) {
            dXO.YFl(this.Sg, d10, str, str2);
            this.NjR = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.AlY = new wN(pAGAppOpenAdInteractionCallback);
        YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.AlY = new wN(pAGAppOpenAdInteractionListener);
        YFl();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        Context context;
        int i10;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        int i11 = 1;
        if (this.wN.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            IPMiBroadcastReceiver.YFl(this.YFl, this.Sg);
            if (activity != null) {
                context = activity;
            } else {
                context = this.YFl;
            }
            if (context == null) {
                context = lG.YFl();
            }
            try {
                i10 = activity.getWindowManager().getDefaultDisplay().getRotation();
            } catch (Exception unused) {
                i10 = 0;
            }
            Intent intent = new Intent(context, (Class<?>) TTAppOpenAdActivity.class);
            intent.putExtra("orientation_angle", i10);
            if (!this.DSW) {
                i11 = 2;
            }
            intent.putExtra("ad_source", i11);
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.Sg.ni().toString());
                intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.f10569vc);
            } else {
                bZ.YFl().vc();
                bZ.YFl().YFl(this.Sg);
                bZ.YFl().YFl(this.AlY);
                this.AlY = null;
            }
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            com.bytedance.sdk.component.utils.Sg.YFl(context, intent, new Sg.YFl() { // from class: com.bytedance.sdk.openadsdk.component.AlY.2
                @Override // com.bytedance.sdk.component.utils.Sg.YFl
                public void YFl() {
                }

                @Override // com.bytedance.sdk.component.utils.Sg.YFl
                public void YFl(Throwable th2) {
                }
            });
            pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.AlY.3
                @Override // java.lang.Runnable
                public void run() {
                    if (AlY.this.tN != null) {
                        try {
                            if (rkt.JwO().UZM(AlY.this.tN.getCodeId()) == 1 && !Wwa.vc(AlY.this.Sg)) {
                                vc YFl = vc.YFl(AlY.this.YFl);
                                YFl.DSW(Integer.parseInt(AlY.this.tN.getCodeId()));
                                YFl.YFl(AlY.this.tN);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            });
            return;
        }
        YoT.YFl("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
        throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (!this.qsH) {
            dXO.YFl(this.Sg, d10);
            this.qsH = true;
        }
    }

    private void YFl() {
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            mn.tN(new qsH("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.AlY.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager asInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.YFl YFl = com.bytedance.sdk.openadsdk.multipro.aidl.YFl.YFl();
                    if (AlY.this.AlY != null && (asInterface = IListenerManager.Stub.asInterface(YFl.YFl(7))) != null) {
                        try {
                            asInterface.registerAppOpenAdListener(AlY.this.f10569vc, new com.bytedance.sdk.openadsdk.multipro.aidl.Sg.YFl(AlY.this.AlY));
                            AlY.this.AlY = null;
                        } catch (RemoteException e2) {
                            YoT.YFl("TTAppOpenAdImpl", e2.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
