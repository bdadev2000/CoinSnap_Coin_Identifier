package com.bytedance.sdk.openadsdk.core.NjR;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import com.bytedance.sdk.openadsdk.utils.aIu;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class YFl {
    private volatile boolean Sg;
    private PglSSManager YFl;
    private volatile boolean tN = true;
    private volatile boolean AlY = false;

    public YFl() {
        YFl();
    }

    private void NjR() {
        if (this.YFl == null) {
            this.YFl = PglSSManager.getInstance();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class nc() {
        try {
            this.tN = true;
        } catch (Throwable unused) {
            this.tN = false;
        }
        return PglSSManager.class;
    }

    private boolean qsH() {
        if (!this.Sg && this.tN) {
            YFl();
        }
        return this.Sg;
    }

    public String AlY() {
        if (!qsH()) {
            return "";
        }
        NjR();
        PglSSManager pglSSManager = this.YFl;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public int DSW() {
        if (this.tN) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public boolean Sg() {
        return this.Sg;
    }

    public void tN() {
        if (qsH()) {
            NjR();
            if (this.YFl != null) {
                pDU.Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NjR.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, lG.AlY().xg());
                            YFl.this.YFl.setCustomInfo(hashMap);
                        } catch (Throwable th2) {
                            aIu.Sg("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public long vc() {
        if (!qsH()) {
            return 0L;
        }
        NjR();
        PglSSManager pglSSManager = this.YFl;
        if (pglSSManager == null) {
            return 0L;
        }
        return pglSSManager.getECForBidding();
    }

    public String wN() {
        if (!qsH()) {
            return "";
        }
        NjR();
        PglSSManager pglSSManager = this.YFl;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getSofChara();
    }

    public void Sg(final String str) {
        if (qsH()) {
            NjR();
            if (this.YFl != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    mn.Sg(new qsH("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.NjR.YFl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (YFl.this.YFl != null) {
                                YFl.this.YFl.setDeviceId(str);
                            }
                        }
                    });
                } else {
                    this.YFl.setDeviceId(str);
                }
            }
        }
    }

    public synchronized void YFl() {
        Context YFl;
        String AlY;
        if (!this.Sg) {
            try {
                YFl = lG.YFl();
                AlY = NjR.Sg().AlY();
                if (TextUtils.isEmpty(AlY)) {
                    AlY = NjR.YFl(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                nc();
                this.Sg = false;
            }
            if (TextUtils.isEmpty(AlY)) {
                return;
            }
            PglSSManager.init(YFl, PglSSConfig.builder().setAppId(AlY).setOVRegionType(0).setAdsdkVersionCode(BuildConfig.VERSION_CODE).build(), null, null, YoT.YFl(YFl), com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
            NjR();
            this.Sg = true;
            try {
                if (this.tN) {
                    AlY(PglSSManager.getLoadError());
                }
            } catch (Throwable th2) {
                aIu.Sg("mssdk", th2.getMessage());
            }
        }
    }

    private void AlY(final String str) {
        if (this.AlY || TextUtils.isEmpty(str)) {
            return;
        }
        lG.wN().YFl(new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.core.NjR.YFl.3
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return AlY.Sg().YFl("secsdk_init_error").Sg(str);
            }
        }, false);
        this.AlY = true;
    }

    public void tN(String str) {
        if (qsH()) {
            NjR();
            PglSSManager pglSSManager = this.YFl;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str);
            }
        }
    }

    public void YFl(String str) {
        if (qsH()) {
            NjR();
            PglSSManager pglSSManager = this.YFl;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void YFl(MotionEvent motionEvent) {
        if (Sg()) {
            NjR();
            PglSSManager pglSSManager = this.YFl;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> YFl(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!qsH() || (featureHash = this.YFl.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
