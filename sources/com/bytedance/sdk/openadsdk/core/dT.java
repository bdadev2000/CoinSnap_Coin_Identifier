package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.yRU;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dT {
    private static final AtomicInteger zp = new AtomicInteger(0);
    private static final AtomicBoolean lMd = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS(final String str) {
        QUv.KS(new com.bytedance.sdk.component.ku.ku("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.dT.1
            @Override // java.lang.Runnable
            public void run() {
                final String eyb = com.bytedance.sdk.openadsdk.core.settings.dQp.etV().eyb();
                com.bytedance.sdk.openadsdk.dT.KS.zp(0, eyb);
                if (TextUtils.isEmpty(eyb)) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp(-1, eyb, -1, "url is null");
                    return;
                }
                com.bytedance.sdk.component.QR.lMd.jU lMd2 = com.bytedance.sdk.openadsdk.Bj.KS.zp().lMd().lMd();
                try {
                    lMd2.lMd(eyb);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", com.bytedance.sdk.component.utils.yRU.zp(KVG.zp(), 0L));
                    jSONObject.put("device_id", Long.parseLong(str));
                    jSONObject.put("header", com.bytedance.sdk.openadsdk.lMd.zp.KS.zp().lMd());
                    JSONObject zp2 = com.bytedance.sdk.component.utils.zp.zp(jSONObject);
                    if (dT.lMd(zp2)) {
                        jSONObject = zp2;
                    }
                    lMd2.lMd("Content-Type", "application/json; charset=utf-8");
                    if (dT.lMd(jSONObject)) {
                        lMd2.lMd("Content-Encoding", "union_sdk_encode");
                    }
                    lMd2.lMd(Command.HTTP_HEADER_USER_AGENT, YhE.KS());
                    lMd2.zp(jSONObject);
                    lMd2.zp(6);
                    lMd2.zp("send_i_p_v6");
                    lMd2.zp(new com.bytedance.sdk.component.QR.zp.zp() { // from class: com.bytedance.sdk.openadsdk.core.dT.1.1
                        @Override // com.bytedance.sdk.component.QR.zp.zp
                        public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, com.bytedance.sdk.component.QR.lMd lmd) {
                            if (lmd.HWF()) {
                                com.bytedance.sdk.openadsdk.dT.KS.zp(1, eyb);
                            } else {
                                com.bytedance.sdk.openadsdk.dT.KS.zp(-1, eyb, lmd.zp(), lmd.lMd());
                                dT.jU();
                            }
                        }

                        @Override // com.bytedance.sdk.component.QR.zp.zp
                        public void zp(com.bytedance.sdk.component.QR.lMd.KS ks, IOException iOException) {
                            if (iOException != null) {
                                com.bytedance.sdk.openadsdk.dT.KS.zp(-1, eyb, 1, iOException.getMessage());
                            }
                            dT.jU();
                        }
                    });
                } catch (Exception e4) {
                    com.bytedance.sdk.openadsdk.dT.KS.zp(-1, eyb, -2, e4.getMessage());
                    com.bytedance.sdk.component.utils.tG.lMd("build ipv6 request failed:" + e4.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jU() {
        if (zp.getAndIncrement() <= 0) {
            QUv.zp().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dT.2
                @Override // java.lang.Runnable
                public void run() {
                    dT.KS(Bj.zp(KVG.zp()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void KS() {
        zp.set(0);
    }

    /* loaded from: classes.dex */
    public static class zp implements yRU.zp {
        private static final AtomicBoolean zp = new AtomicBoolean(false);
        private static volatile long lMd = -1;

        private zp() {
        }

        public static void zp() {
            if (zp.compareAndSet(false, true)) {
                lMd = System.currentTimeMillis();
                com.bytedance.sdk.component.utils.yRU.zp(new zp(), KVG.zp());
            }
        }

        public void lMd() {
            com.bytedance.sdk.component.utils.yRU.zp(this);
        }

        @Override // com.bytedance.sdk.component.utils.yRU.zp
        public void zp(Context context, Intent intent, boolean z8, int i9) {
            if (System.currentTimeMillis() - lMd >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS && i9 != 0) {
                dT.KS();
                dT.KS(Bj.zp(KVG.zp()));
                lMd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lMd(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static void zp(String str) {
        AtomicBoolean atomicBoolean = lMd;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!com.bytedance.sdk.component.utils.KVG.ku(KVG.zp())) {
                atomicBoolean.set(false);
            } else {
                zp.zp();
                KS(str);
            }
        }
    }
}
