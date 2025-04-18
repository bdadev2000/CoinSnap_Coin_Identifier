package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.utils.Ne;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class eT {
    private static final AtomicInteger YFl = new AtomicInteger(0);
    private static final AtomicBoolean Sg = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void AlY() {
        if (YFl.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.mn.YFl().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.eT.2
                @Override // java.lang.Runnable
                public void run() {
                    eT.tN(YoT.YFl(lG.YFl()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN(final String str) {
        com.bytedance.sdk.openadsdk.utils.mn.tN(new com.bytedance.sdk.component.qsH.qsH("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.eT.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject YFl2;
                final String qjy = com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().qjy();
                com.bytedance.sdk.openadsdk.pDU.tN.YFl(0, qjy);
                if (TextUtils.isEmpty(qjy)) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl(-1, qjy, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.DSW.Sg.AlY Sg2 = com.bytedance.sdk.openadsdk.lG.tN.YFl().Sg().Sg();
                try {
                    Sg2.Sg(qjy);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.Ne.YFl(lG.YFl(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.AlY.YFl.tN.YFl().Sg());
                    if (com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(PangleEncryptConstant.CryptDataScene.APP_LOG)) {
                        YFl2 = PangleEncryptManager.encryptType4(jSONObject, new wXo(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                        if (YFl2 != null && YFl2.optInt("cypher") == 4) {
                            Ne.Sg(true);
                            Sg2.Sg("x-pgli18n", "4");
                            Sg2.Sg("Content-Type", "application/json; charset=utf-8");
                        } else {
                            Ne.Sg(false);
                        }
                    } else {
                        YFl2 = com.bytedance.sdk.component.utils.YFl.YFl(jSONObject);
                        if (eT.Sg(YFl2)) {
                            Sg2.Sg("Content-Encoding", "union_sdk_encode");
                        }
                    }
                    if (eT.Sg(YFl2)) {
                        jSONObject = YFl2;
                    }
                    Sg2.Sg("Content-Type", "application/json; charset=utf-8");
                    Sg2.Sg(Command.HTTP_HEADER_USER_AGENT, Sco.tN());
                    Sg2.YFl(jSONObject);
                    Sg2.YFl(6);
                    Sg2.YFl("send_i_p_v6");
                    Sg2.YFl(new com.bytedance.sdk.component.DSW.YFl.YFl() { // from class: com.bytedance.sdk.openadsdk.core.eT.1.1
                        @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                        public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, com.bytedance.sdk.component.DSW.Sg sg2) {
                            if (sg2.vc()) {
                                com.bytedance.sdk.openadsdk.pDU.tN.YFl(1, qjy);
                            } else {
                                com.bytedance.sdk.openadsdk.pDU.tN.YFl(-1, qjy, sg2.YFl(), sg2.Sg());
                                eT.AlY();
                            }
                        }

                        @Override // com.bytedance.sdk.component.DSW.YFl.YFl
                        public void YFl(com.bytedance.sdk.component.DSW.Sg.tN tNVar, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.pDU.tN.YFl(-1, qjy, 1, iOException.getMessage());
                            }
                            eT.AlY();
                        }
                    });
                } catch (Exception e2) {
                    com.bytedance.sdk.openadsdk.pDU.tN.YFl(-1, qjy, -2, e2.getMessage());
                    com.bytedance.sdk.component.utils.YoT.Sg("build ipv6 request failed:" + e2.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tN() {
        YFl.set(0);
    }

    /* loaded from: classes.dex */
    public static class YFl implements Ne.YFl {
        private static final AtomicBoolean YFl = new AtomicBoolean(false);
        private static volatile long Sg = -1;

        private YFl() {
        }

        public static void YFl() {
            if (YFl.compareAndSet(false, true)) {
                Sg = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.Ne.YFl(new YFl(), lG.YFl());
            }
        }

        public void Sg() {
            com.bytedance.sdk.component.utils.Ne.YFl(this);
        }

        @Override // com.bytedance.sdk.component.utils.Ne.YFl
        public void YFl(Context context, Intent intent, boolean z10, int i10) {
            if (System.currentTimeMillis() - Sg >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS && i10 != 0) {
                eT.tN();
                eT.tN(YoT.YFl(lG.YFl()));
                Sg();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Sg(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static void YFl(String str) {
        AtomicBoolean atomicBoolean = Sg;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.EH.qsH(lG.YFl())) {
                atomicBoolean.set(false);
            } else {
                YFl.YFl();
                tN(str);
            }
        }
    }
}
