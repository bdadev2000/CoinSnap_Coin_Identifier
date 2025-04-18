package com.bytedance.sdk.openadsdk.core.qsH;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YoT {
    private static String Sg;
    private static String YFl;

    @NonNull
    public static String Sg() {
        String tN;
        if (YFl == null) {
            YFl = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl Sg2 = com.bytedance.sdk.component.adexpress.YFl.Sg.qsH.Sg();
        if (Sg2 != null && (tN = Sg2.tN()) != null && !tN.equals(YFl)) {
            YFl = tN;
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sp", "js_render_ver", tN);
        }
        return YFl;
    }

    public static void YFl() {
        com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().YFl(new com.bytedance.sdk.component.adexpress.YFl.YFl.Sg() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YoT.1
            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.Sg
            public int YFl(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.Sg
            public Cursor YFl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.tN(com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.Sg
            public int YFl(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.Sg
            public void YFl(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.YFl.YFl.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().YFl(new com.bytedance.sdk.component.adexpress.YFl.YFl.tN() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YoT.2

            /* renamed from: com.bytedance.sdk.openadsdk.core.qsH.YoT$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ MessageQueue[] YFl;

                public AnonymousClass1(MessageQueue[] messageQueueArr) {
                    this.YFl = messageQueueArr;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.YFl[0] = Looper.myQueue();
                    YFl(this.YFl[0]);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public void AlY() {
                if ((com.bytedance.sdk.openadsdk.core.lG.AlY().VB() != 0 && com.bytedance.sdk.openadsdk.core.lG.AlY().RX() != 0) || (com.bytedance.sdk.openadsdk.core.lG.AlY().Jc() != 0 && com.bytedance.sdk.openadsdk.core.lG.AlY().tQ() != 0)) {
                    com.bytedance.sdk.component.adexpress.wN.wN.YFl().YFl(com.bytedance.sdk.openadsdk.core.lG.AlY().VB());
                    com.bytedance.sdk.component.adexpress.wN.wN.YFl().Sg(com.bytedance.sdk.openadsdk.core.lG.AlY().tQ());
                    YFl(com.bytedance.sdk.openadsdk.core.pDU.tN().getLooper().getQueue());
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public com.bytedance.sdk.component.DSW.Sg.Sg DSW() {
                com.bytedance.sdk.component.DSW.Sg.Sg tN = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().tN();
                tN.YFl(8);
                tN.YFl("express_get");
                return tN;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int EH() {
                return GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public ExecutorService GA() {
                if (mn.eT()) {
                    return mn.AlY();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int NjR() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public Context Sg() {
                return com.bytedance.sdk.openadsdk.core.lG.YFl();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int YoT() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int eT() {
                return com.bytedance.sdk.openadsdk.core.lG.AlY().Jc();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int nc() {
                return com.bytedance.sdk.openadsdk.core.lG.AlY().VB();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public ExecutorService pDU() {
                if (mn.eT()) {
                    return mn.qsH();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public String qsH() {
                return com.bytedance.sdk.openadsdk.core.NjR.Sg().AlY();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public Handler tN() {
                return com.bytedance.sdk.openadsdk.core.pDU.tN();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public com.bytedance.sdk.component.DSW.Sg.YFl vc() {
                com.bytedance.sdk.component.DSW.Sg.YFl AlY = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().AlY();
                AlY.YFl(8);
                AlY.YFl("express_down");
                return AlY;
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public com.bytedance.sdk.component.adexpress.YFl.tN.YFl wN() {
                return com.bytedance.sdk.openadsdk.core.lG.tN().YFl();
            }

            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.tN
            public int YFl() {
                if (com.bytedance.sdk.openadsdk.core.lG.AlY() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.lG.AlY().AlY();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void YFl(MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YoT.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.lG.AlY().RX() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.YFl.Sg sg2 = new com.bytedance.sdk.openadsdk.core.widget.YFl.Sg();
                                sg2.YFl(false);
                                sg2.Sg();
                            }
                            if (com.bytedance.sdk.openadsdk.core.lG.AlY().tQ() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.YFl.Sg sg3 = new com.bytedance.sdk.openadsdk.core.widget.YFl.Sg();
                                sg3.YFl(true);
                                sg3.Sg();
                            }
                            return false;
                        }
                    });
                }
            }
        });
        com.bytedance.sdk.component.adexpress.YFl.YFl.YFl.YFl().YFl(new com.bytedance.sdk.component.adexpress.YFl.YFl.AlY() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YoT.3
            @Override // com.bytedance.sdk.component.adexpress.YFl.YFl.AlY
            public void YFl(int i10) {
                com.bytedance.sdk.openadsdk.pDU.tN.YFl().YFl(com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().Sg(i10).vc(com.bytedance.sdk.openadsdk.core.qsH.YFl(i10)));
            }
        });
        com.bytedance.sdk.component.NjR.YFl.YFl.YFl().YFl(new com.bytedance.sdk.component.NjR.YFl.Sg() { // from class: com.bytedance.sdk.openadsdk.core.qsH.YoT.4
            @Override // com.bytedance.sdk.component.NjR.YFl.Sg
            public void YFl(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.AlY.tN.tN(com.bytedance.sdk.openadsdk.utils.Sg.YFl(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.NjR.YFl.Sg
            public void YFl(com.bytedance.sdk.component.NjR.Sg.YFl yFl, String str, String str2, JSONObject jSONObject, long j3) {
                com.bytedance.sdk.openadsdk.core.model.Wwa tN = com.bytedance.sdk.openadsdk.core.model.Wwa.tN();
                tN.lG(yFl.YFl());
                tN.aIu(yFl.Sg());
                tN.Wwa(yFl.tN());
                com.bytedance.sdk.openadsdk.AlY.tN.Sg(tN, str, str2, jSONObject, j3);
            }
        });
    }

    public static String tN() {
        Map<String, com.bytedance.sdk.component.adexpress.YFl.tN.YFl> YFl2;
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl yFl;
        String tN;
        if (Sg == null) {
            Sg = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.YFl.tN.YFl Sg2 = com.bytedance.sdk.component.adexpress.YFl.Sg.qsH.Sg();
        if (Sg2 != null && (YFl2 = Sg2.YFl()) != null && (yFl = YFl2.get("v3")) != null && (tN = yFl.tN()) != null && !tN.equals(Sg)) {
            Sg = tN;
            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sp", "js_render_v3_ver", tN);
        }
        return Sg;
    }
}
