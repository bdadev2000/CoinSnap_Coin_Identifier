package com.bytedance.sdk.openadsdk.core.COT;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.ku.ku;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.pvr;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zp {
    private volatile boolean KS = true;
    private volatile boolean jU = false;
    private volatile boolean lMd;
    private PglSSManager zp;

    public zp() {
        zp();
    }

    private boolean QR() {
        if (!this.lMd && this.KS) {
            zp();
        }
        return this.lMd;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class YW() {
        try {
            this.KS = true;
        } catch (Throwable unused) {
            this.KS = false;
        }
        return PglSSManager.class;
    }

    private void ku() {
        if (this.zp == null) {
            this.zp = PglSSManager.getInstance();
        }
    }

    public String COT() {
        if (!QR()) {
            return "";
        }
        ku();
        PglSSManager pglSSManager = this.zp;
        if (pglSSManager == null) {
            return "";
        }
        return pglSSManager.getSofChara();
    }

    public int HWF() {
        if (this.KS) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void KS() {
        if (QR()) {
            ku();
            if (this.zp != null) {
                tG.lMd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.COT.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, KVG.jU().HaA());
                            zp.this.zp.setCustomInfo(hashMap);
                        } catch (Throwable th) {
                            pvr.lMd("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public String jU() {
        if (!QR()) {
            return "";
        }
        ku();
        PglSSManager pglSSManager = this.zp;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public boolean lMd() {
        return this.lMd;
    }

    public void lMd(final String str) {
        if (QR()) {
            ku();
            if (this.zp != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    QUv.lMd(new ku("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.COT.zp.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (zp.this.zp != null) {
                                zp.this.zp.setDeviceId(str);
                            }
                        }
                    });
                } else {
                    this.zp.setDeviceId(str);
                }
            }
        }
    }

    public synchronized void zp() {
        Context zp;
        String jU;
        if (!this.lMd) {
            try {
                zp = KVG.zp();
                jU = com.bytedance.sdk.openadsdk.core.ku.lMd().jU();
                if (TextUtils.isEmpty(jU)) {
                    jU = com.bytedance.sdk.openadsdk.core.ku.zp(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                YW();
                this.lMd = false;
            }
            if (TextUtils.isEmpty(jU)) {
                return;
            }
            PglSSManager.init(zp, PglSSConfig.builder().setAppId(jU).setOVRegionType(0).setAdsdkVersionCode(6003).build(), null, null, Bj.zp(zp), com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
            ku();
            this.lMd = true;
            try {
                if (this.KS) {
                    jU(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                pvr.lMd("mssdk", th.getMessage());
            }
        }
    }

    private void jU(final String str) {
        if (this.jU || TextUtils.isEmpty(str)) {
            return;
        }
        KVG.COT().zp(new com.bytedance.sdk.openadsdk.dT.lMd() { // from class: com.bytedance.sdk.openadsdk.core.COT.zp.3
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("secsdk_init_error").lMd(str);
            }
        }, false);
        this.jU = true;
    }

    public void KS(String str) {
        if (QR()) {
            ku();
            PglSSManager pglSSManager = this.zp;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str);
            }
        }
    }

    public void zp(String str) {
        if (QR()) {
            ku();
            PglSSManager pglSSManager = this.zp;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void zp(MotionEvent motionEvent) {
        if (lMd()) {
            ku();
            PglSSManager pglSSManager = this.zp;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> zp(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!QR() || (featureHash = this.zp.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}
