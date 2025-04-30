package com.bytedance.sdk.openadsdk.HWF;

import android.content.Context;
import com.bytedance.sdk.component.COT.FP;
import com.bytedance.sdk.component.COT.KS.COT;
import com.bytedance.sdk.component.COT.dQp;
import com.bytedance.sdk.component.COT.dT;
import com.bytedance.sdk.component.lMd.zp.Bj;
import com.bytedance.sdk.component.lMd.zp.HWF;
import com.bytedance.sdk.component.lMd.zp.tG;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.irS;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class jU {

    /* loaded from: classes.dex */
    public static final class zp {
        private static final dQp zp = zp(KVG.zp());

        /* JADX INFO: Access modifiers changed from: private */
        public static dT lMd(String str) {
            return zp(zp.zp(str).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static dT lMd(rV rVVar) {
            return zp(zp.zp(rVVar.zp()).zp(rVVar.lMd()).lMd(rVVar.KS()).COT(WNy.jU(KVG.zp())).jU(WNy.KS(KVG.zp())).zp(rVVar.QR()));
        }

        private static dQp zp(Context context) {
            return com.bytedance.sdk.component.COT.KS.lMd.zp(context, new COT.zp().zp(new com.bytedance.sdk.component.COT.KS.zp.zp(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).zp(new FP() { // from class: com.bytedance.sdk.openadsdk.HWF.jU.zp.2
                @Override // com.bytedance.sdk.component.COT.FP
                public ExecutorService zp() {
                    return QUv.lMd();
                }
            }).zp(new com.bytedance.sdk.component.COT.jU() { // from class: com.bytedance.sdk.openadsdk.HWF.jU.zp.1
                @Override // com.bytedance.sdk.component.COT.jU
                /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
                public com.bytedance.sdk.component.COT.lMd.jU zp(com.bytedance.sdk.component.COT.COT cot) {
                    com.bytedance.sdk.component.COT.lMd.COT cot2;
                    Bj COT = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().COT();
                    tG lMd = new tG.zp().lMd(cot.zp()).zp().lMd();
                    com.bytedance.sdk.component.lMd.zp.dQp dqp = null;
                    if (cot.KS()) {
                        cot2 = new com.bytedance.sdk.component.COT.lMd.COT();
                    } else {
                        cot2 = null;
                    }
                    if (cot2 != null) {
                        cot2.zp(System.currentTimeMillis());
                    }
                    try {
                        dqp = COT.zp(lMd).zp();
                        if (cot2 != null) {
                            cot2.lMd(System.currentTimeMillis());
                        }
                        Map<String, String> zp2 = zp(cot, dqp);
                        byte[] jU = dqp.HWF().jU();
                        if (cot2 != null) {
                            cot2.KS(System.currentTimeMillis());
                        }
                        com.bytedance.sdk.component.COT.lMd.jU jUVar = new com.bytedance.sdk.component.COT.lMd.jU(dqp.KS(), jU, "", zp2);
                        jUVar.zp(cot2);
                        return jUVar;
                    } catch (Throwable th) {
                        try {
                            return zp(cot2, th);
                        } finally {
                            com.bytedance.sdk.component.COT.KS.KS.lMd.zp(dqp);
                        }
                    }
                }

                private Map<String, String> zp(com.bytedance.sdk.component.COT.COT cot, com.bytedance.sdk.component.lMd.zp.dQp dqp) {
                    if (!cot.lMd()) {
                        return null;
                    }
                    HWF QR = dqp.QR();
                    HashMap hashMap = new HashMap();
                    int zp2 = QR.zp();
                    for (int i9 = 0; i9 < zp2; i9++) {
                        String zp3 = QR.zp(i9);
                        String lMd = QR.lMd(i9);
                        if (zp3 != null) {
                            hashMap.put(zp3, lMd);
                        }
                    }
                    return hashMap;
                }

                private com.bytedance.sdk.component.COT.lMd.jU zp(com.bytedance.sdk.component.COT.lMd.COT cot, Throwable th) {
                    th.getMessage();
                    if (cot != null) {
                        cot.KS(System.currentTimeMillis());
                    }
                    com.bytedance.sdk.component.COT.lMd.jU jUVar = new com.bytedance.sdk.component.COT.lMd.jU(98765, th, "net failed");
                    jUVar.zp(cot);
                    return jUVar;
                }
            }).zp());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream lMd(String str, String str2) {
            return zp.zp(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean lMd(String str, String str2, String str3) {
            return zp.zp(str, str2, str3);
        }

        private static dT zp(dT dTVar) {
            return irS.zp() ? dTVar.zp(new COT()) : dTVar;
        }
    }

    public static dT zp(String str) {
        return zp.lMd(str);
    }

    public static dT zp(rV rVVar) {
        return zp.lMd(rVVar);
    }

    public static InputStream zp(String str, String str2) {
        return zp.lMd(str, str2);
    }

    public static boolean zp(String str, String str2, String str3) {
        return zp.lMd(str, str2, str3);
    }

    public static dQp zp() {
        return zp.zp;
    }
}
