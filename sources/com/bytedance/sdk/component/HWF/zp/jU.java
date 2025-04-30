package com.bytedance.sdk.component.HWF.zp;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.vwr;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class jU {
    public static final jU zp = new jU();

    private boolean KS() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    private void lMd(zp zpVar, Context context) {
        KS.zp(context, "context == null");
        KS.zp(zpVar, "AdLogConfig == null");
        KS.zp(zpVar.jU(), "AdLogDepend ==null");
    }

    public void lMd() {
        final COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || KVG.jU() == null) {
            return;
        }
        if (ku.QR().lMd()) {
            if (zp(ku.QR().HWF(), KVG)) {
                ku.QR().Bj();
                return;
            } else if (KS()) {
                KVG.jU().execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("stop") { // from class: com.bytedance.sdk.component.HWF.zp.jU.3
                    @Override // java.lang.Runnable
                    public void run() {
                        jU.this.lMd(KVG.HWF());
                    }
                });
                return;
            } else {
                lMd(KVG.HWF());
                return;
            }
        }
        ku.QR().Bj();
    }

    public void zp(zp zpVar, Context context) {
        lMd(zpVar, context);
        ku.QR().zp(context);
        ku.QR().zp(zpVar.dT());
        ku.QR().lMd(zpVar.QR());
        ku.QR().KS(zpVar.ku());
        ku.QR().zp(zpVar.lMd());
        ku.QR().jU(zpVar.YW());
        ku.QR().COT(zpVar.HWF());
        ku.QR().zp(zpVar.zp() == null ? com.bytedance.sdk.component.HWF.zp.zp.zp.COT.zp : zpVar.zp());
        ku.QR().lMd(zpVar.Bj());
        ku.QR().zp(zpVar.jU());
        ku.QR().zp(zpVar.KS());
        ku.QR().zp(zpVar.COT());
        com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.zp(zpVar.tG());
        com.bytedance.sdk.component.HWF.zp.lMd.KS.KS.lMd(zpVar.vDp());
        zp(zpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        if (i9 == 0) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.zp.lMd();
        } else if (i9 == 1) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.lMd();
        }
    }

    private void lMd(final com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        final COT KVG = ku.QR().KVG();
        if (zpVar == null || KVG == null || ku.QR().HWF() == null || KVG.jU() == null) {
            return;
        }
        if (ku.QR().lMd()) {
            if (zp(ku.QR().HWF(), KVG)) {
                ku.QR().zp(zpVar);
                return;
            }
            KS();
            if (KS()) {
                KVG.jU().execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("dispatchEvent") { // from class: com.bytedance.sdk.component.HWF.zp.jU.4
                    @Override // java.lang.Runnable
                    public void run() {
                        jU.this.zp(zpVar, KVG.HWF());
                    }
                });
                return;
            } else {
                zp(zpVar, KVG.HWF());
                return;
            }
        }
        ku.QR().zp(zpVar);
    }

    private void zp(zp zpVar) {
        Executor COT;
        if (Looper.myLooper() != Looper.getMainLooper() && com.bytedance.sdk.component.HWF.zp.KS.zp.lMd()) {
            com.bytedance.sdk.component.HWF.zp.KS.zp.zp();
            return;
        }
        COT jU = zpVar.jU();
        if (jU == null || !com.bytedance.sdk.component.HWF.zp.KS.zp.lMd() || (COT = jU.COT()) == null) {
            return;
        }
        COT.execute(new Runnable() { // from class: com.bytedance.sdk.component.HWF.zp.jU.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.HWF.zp.KS.zp.zp();
            }
        });
    }

    public void zp(boolean z8) {
        ku.QR().zp(z8);
    }

    private boolean zp(Context context, COT cot) {
        if (context == null || cot == null) {
            return false;
        }
        if (cot.HWF() == 2) {
            return true;
        }
        if (cot.HWF() == 1) {
            return cot.rV();
        }
        try {
            return vwr.zp(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void zp() {
        final COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || KVG.jU() == null) {
            return;
        }
        if (ku.QR().lMd()) {
            if (zp(ku.QR().HWF(), KVG)) {
                ku.QR().YW();
                return;
            } else if (KS()) {
                KVG.jU().execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("start") { // from class: com.bytedance.sdk.component.HWF.zp.jU.2
                    @Override // java.lang.Runnable
                    public void run() {
                        jU.this.zp(KVG.HWF());
                    }
                });
                return;
            } else {
                zp(KVG.HWF());
                return;
            }
        }
        ku.QR().YW();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(int i9) {
        if (i9 == 0) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.zp.zp();
        } else if (i9 == 1) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.zp();
        }
    }

    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar) {
        lMd(zpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(com.bytedance.sdk.component.HWF.zp.jU.zp zpVar, int i9) {
        if (i9 == 0) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.zp.zp(zpVar);
        } else if (i9 == 1) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.zp(zpVar);
        }
    }

    public void zp(final String str, final List<String> list, final boolean z8, Map<String, String> map, final int i9, final String str2) {
        final COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || KVG.jU() == null) {
            return;
        }
        if (KVG.ku()) {
            if (KVG.HWF() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (KVG.HWF() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (ku.QR().lMd() && !zp(ku.QR().HWF(), KVG)) {
                if (KS()) {
                    KVG.jU().execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("trackFailed") { // from class: com.bytedance.sdk.component.HWF.zp.jU.5
                        @Override // java.lang.Runnable
                        public void run() {
                            jU.this.zp(str, (List<String>) list, z8, KVG.HWF(), i9, str2);
                        }
                    });
                    return;
                } else {
                    zp(str, list, z8, KVG.HWF(), i9, str2);
                    return;
                }
            }
            ku.QR().zp(str, list, z8, map, i9, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, List<String> list, boolean z8, int i9, int i10, String str2) {
        if (i9 == 0) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.zp.zp(str, list, z8);
        } else if (i9 == 1) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.zp(str, list, z8, i10, str2);
        }
    }

    public void zp(final String str, final boolean z8) {
        final COT KVG = ku.QR().KVG();
        if (KVG == null || ku.QR().HWF() == null || KVG.jU() == null || !KVG.ku()) {
            return;
        }
        if (KVG.HWF() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (ku.QR().lMd() && !zp(ku.QR().HWF(), KVG)) {
            if (KS()) {
                KVG.jU().execute(new com.bytedance.sdk.component.HWF.zp.COT.COT("trackFailed") { // from class: com.bytedance.sdk.component.HWF.zp.jU.6
                    @Override // java.lang.Runnable
                    public void run() {
                        jU.this.zp(str, KVG.HWF(), z8);
                    }
                });
                return;
            } else {
                zp(str, KVG.HWF(), z8);
                return;
            }
        }
        ku.QR().zp(str, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(String str, int i9, boolean z8) {
        if (i9 == 0) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.zp.zp(str);
        } else if (i9 == 1) {
            com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd.zp(str, z8);
        }
    }
}
