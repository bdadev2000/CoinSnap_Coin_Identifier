package com.bytedance.sdk.openadsdk.AlY.YFl;

/* loaded from: classes.dex */
public class YFl {
    public static final Sg YFl = new Sg(0);
    public static final Sg Sg = new Sg(1);
    public static final Sg tN = new Sg(2);
    public static final Sg AlY = new Sg(0);
    public static final Sg wN = new Sg(1);

    /* renamed from: vc, reason: collision with root package name */
    public static final Sg f10494vc = new Sg(2);

    public static void Sg() {
        try {
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.pDU.tN.Sg("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.AlY.YFl.Sg("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void YFl(Sg sg2, boolean z10, int i10, long j3) {
        try {
            sg2.DSW.getAndSet(true);
            if (z10) {
                sg2.YFl.incrementAndGet();
                sg2.tN.addAndGet(j3);
                return;
            }
            sg2.Sg.incrementAndGet();
            Integer num = sg2.f10493vc.get(Integer.valueOf(i10));
            if (num != null) {
                sg2.f10493vc.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
            } else {
                sg2.f10493vc.put(Integer.valueOf(i10), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl(Sg sg2, boolean z10) {
        try {
            sg2.DSW.getAndSet(true);
            if (z10) {
                sg2.YFl.incrementAndGet();
            } else {
                sg2.Sg.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl(Sg sg2) {
        try {
            sg2.DSW.getAndSet(true);
            sg2.wN.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void YFl() {
        try {
            Sg sg2 = YFl;
            if (sg2.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", sg2.YFl().toString());
            }
            Sg sg3 = Sg;
            if (sg3.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_state", "tt_sdk_event_net_state", sg3.YFl().toString());
            }
            Sg sg4 = tN;
            if (sg4.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", sg4.YFl().toString());
            }
            Sg sg5 = AlY;
            if (sg5.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", sg5.Sg().toString());
            }
            Sg sg6 = wN;
            if (sg6.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_state", "tt_sdk_event_db_state", sg6.Sg().toString());
            }
            Sg sg7 = f10494vc;
            if (sg7.DSW.get()) {
                com.bytedance.sdk.openadsdk.multipro.AlY.YFl.YFl("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", sg7.Sg().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
