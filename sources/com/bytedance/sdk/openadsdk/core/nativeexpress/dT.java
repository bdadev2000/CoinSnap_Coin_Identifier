package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    public static void zp() {
        com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().zp(new com.bytedance.sdk.component.adexpress.zp.zp.lMd() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.dT.1
            @Override // com.bytedance.sdk.component.adexpress.zp.zp.lMd
            public int zp(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.lMd
            public Cursor zp(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.KS(com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.lMd
            public int zp(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.lMd
            public void zp(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.zp.zp.zp(com.bytedance.sdk.openadsdk.core.KVG.zp(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().zp(new com.bytedance.sdk.component.adexpress.zp.zp.KS() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.dT.2

            /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.dT$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ MessageQueue[] zp;

                public AnonymousClass1(MessageQueue[] messageQueueArr) {
                    this.zp = messageQueueArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.zp[0] = Looper.myQueue();
                    zp(this.zp[0]);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public int Bj() {
                return com.bytedance.sdk.openadsdk.core.KVG.jU().Vjb();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public com.bytedance.sdk.component.adexpress.zp.KS.zp COT() {
                return com.bytedance.sdk.openadsdk.core.KVG.KS().zp();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public com.bytedance.sdk.component.QR.lMd.zp HWF() {
                com.bytedance.sdk.component.QR.lMd.zp jU = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().jU();
                jU.zp(8);
                jU.zp("express_down");
                return jU;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public Handler KS() {
                return com.bytedance.sdk.openadsdk.core.tG.KS();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public com.bytedance.sdk.component.QR.lMd.lMd QR() {
                com.bytedance.sdk.component.QR.lMd.lMd KS = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().KS();
                KS.zp(8);
                KS.zp("express_get");
                return KS;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public int YW() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public int dT() {
                return com.bytedance.sdk.openadsdk.core.KVG.jU().qtv();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public void jU() {
                if ((com.bytedance.sdk.openadsdk.core.KVG.jU().qtv() != 0 && com.bytedance.sdk.openadsdk.core.KVG.jU().fs() != 0) || (com.bytedance.sdk.openadsdk.core.KVG.jU().Vjb() != 0 && com.bytedance.sdk.openadsdk.core.KVG.jU().GP() != 0)) {
                    com.bytedance.sdk.component.adexpress.COT.COT.zp().zp(com.bytedance.sdk.openadsdk.core.KVG.jU().qtv());
                    com.bytedance.sdk.component.adexpress.COT.COT.zp().lMd(com.bytedance.sdk.openadsdk.core.KVG.jU().GP());
                    zp(com.bytedance.sdk.openadsdk.core.tG.KS().getLooper().getQueue());
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public String ku() {
                return com.bytedance.sdk.openadsdk.core.ku.lMd().jU();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public Context lMd() {
                return com.bytedance.sdk.openadsdk.core.KVG.zp();
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public ExecutorService rV() {
                if (QUv.dT()) {
                    return QUv.ku();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public ExecutorService tG() {
                if (QUv.dT()) {
                    return QUv.jU();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public int vDp() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.zp.zp.KS
            public int zp() {
                if (com.bytedance.sdk.openadsdk.core.KVG.jU() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.KVG.jU().jU();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zp(MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.dT.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.KVG.jU().fs() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.zp.lMd lmd = new com.bytedance.sdk.openadsdk.core.widget.zp.lMd();
                                lmd.zp(false);
                                lmd.lMd();
                            }
                            if (com.bytedance.sdk.openadsdk.core.KVG.jU().GP() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.zp.lMd lmd2 = new com.bytedance.sdk.openadsdk.core.widget.zp.lMd();
                                lmd2.zp(true);
                                lmd2.lMd();
                            }
                            return false;
                        }
                    });
                }
            }
        });
        com.bytedance.sdk.component.adexpress.zp.zp.zp.zp().zp(new com.bytedance.sdk.component.adexpress.zp.zp.jU() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.dT.3
            @Override // com.bytedance.sdk.component.adexpress.zp.zp.jU
            public void zp(int i9) {
                com.bytedance.sdk.openadsdk.dT.KS.zp().zp(com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().lMd(i9).HWF(com.bytedance.sdk.openadsdk.core.QR.zp(i9)));
            }
        });
        com.bytedance.sdk.component.widget.zp.zp.zp().zp(new com.bytedance.sdk.component.widget.zp.lMd() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.dT.4
            @Override // com.bytedance.sdk.component.widget.zp.lMd
            public void zp(com.bytedance.sdk.component.widget.lMd.zp zpVar, String str, String str2, JSONObject jSONObject, long j7) {
                com.bytedance.sdk.openadsdk.core.model.woN lMd = com.bytedance.sdk.openadsdk.core.model.woN.lMd();
                lMd.woN(zpVar.zp());
                lMd.cz(zpVar.lMd());
                lMd.vwr(zpVar.KS());
                com.bytedance.sdk.openadsdk.lMd.KS.lMd(lMd, str, str2, jSONObject, j7);
            }
        });
    }
}
