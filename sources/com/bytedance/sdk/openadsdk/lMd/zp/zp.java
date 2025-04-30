package com.bytedance.sdk.openadsdk.lMd.zp;

/* loaded from: classes.dex */
public class zp {
    public static final lMd zp = new lMd(0);
    public static final lMd lMd = new lMd(1);
    public static final lMd KS = new lMd(2);
    public static final lMd jU = new lMd(0);
    public static final lMd COT = new lMd(1);
    public static final lMd HWF = new lMd(2);

    public static void lMd() {
        try {
            com.bytedance.sdk.openadsdk.dT.KS.lMd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.dT.KS.lMd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.dT.KS.lMd("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.dT.KS.lMd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.dT.KS.lMd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.dT.KS.lMd("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.jU.zp.lMd("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void zp(lMd lmd, boolean z8, int i9, long j7) {
        try {
            lmd.QR.getAndSet(true);
            if (z8) {
                lmd.zp.incrementAndGet();
                lmd.KS.addAndGet(j7);
                return;
            }
            lmd.lMd.incrementAndGet();
            Integer num = lmd.HWF.get(Integer.valueOf(i9));
            if (num != null) {
                lmd.HWF.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() + 1));
            } else {
                lmd.HWF.put(Integer.valueOf(i9), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp(lMd lmd, boolean z8) {
        try {
            lmd.QR.getAndSet(true);
            if (z8) {
                lmd.zp.incrementAndGet();
            } else {
                lmd.lMd.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void zp(lMd lmd) {
        try {
            lmd.QR.getAndSet(true);
            lmd.COT.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void zp() {
        try {
            lMd lmd = zp;
            if (lmd.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", lmd.zp().toString());
            }
            lMd lmd2 = lMd;
            if (lmd2.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_state", "tt_sdk_event_net_state", lmd2.zp().toString());
            }
            lMd lmd3 = KS;
            if (lmd3.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", lmd3.zp().toString());
            }
            lMd lmd4 = jU;
            if (lmd4.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", lmd4.lMd().toString());
            }
            lMd lmd5 = COT;
            if (lmd5.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_state", "tt_sdk_event_db_state", lmd5.lMd().toString());
            }
            lMd lmd6 = HWF;
            if (lmd6.QR.get()) {
                com.bytedance.sdk.openadsdk.multipro.jU.zp.zp("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", lmd6.lMd().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
