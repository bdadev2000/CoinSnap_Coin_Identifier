package com.bytedance.sdk.openadsdk.rkt;

import android.content.Context;
import android.os.Handler;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static Boolean Sg;
    private static volatile YFl YFl;

    public static void Sg(AlY alY) {
        YFl().YFl(new wN(alY, 0, 1, 0));
    }

    public static void Sg() {
        YFl().YFl(true);
    }

    public static YFl YFl() {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = YFl.YFl(new Sg() { // from class: com.bytedance.sdk.openadsdk.rkt.tN.1
                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public Context getContext() {
                            return lG.YFl();
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public ExecutorService getExecutorService() {
                            return mn.NjR();
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public Handler getHandler() {
                            return pDU.Sg();
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public int getOnceLogCount() {
                            int YFl2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("bus_monitor_config", "once_count", 10);
                            if (YFl2 > 100 || YFl2 < 5) {
                                return 10;
                            }
                            return YFl2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public int getOnceLogInterval() {
                            int YFl2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("bus_monitor_config", "once_interval", 10000);
                            if (YFl2 < 10000) {
                                return 10000;
                            }
                            return YFl2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public int getUploadIntervalTime() {
                            int YFl2 = com.bytedance.sdk.openadsdk.aIu.YFl.YFl("bus_monitor_config", "interval", 43200000);
                            if (YFl2 < 3600000) {
                                return 86400000;
                            }
                            return YFl2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public boolean isMonitorOpen() {
                            if (tN.Sg != null) {
                                return tN.Sg.booleanValue();
                            }
                            boolean z10 = false;
                            if (com.bytedance.sdk.openadsdk.aIu.YFl.YFl("bus_monitor_config", "enable", 0) == 1) {
                                z10 = true;
                            }
                            Boolean unused = tN.Sg = Boolean.valueOf(z10);
                            return tN.Sg.booleanValue();
                        }

                        @Override // com.bytedance.sdk.openadsdk.rkt.Sg
                        public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.rkt.Sg.YFl> list) {
                            if (list != null && !list.isEmpty()) {
                                for (final com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl : list) {
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl();
                                    com.bytedance.sdk.openadsdk.pDU.tN.YFl("bus_monitor", false, new com.bytedance.sdk.openadsdk.pDU.Sg() { // from class: com.bytedance.sdk.openadsdk.rkt.tN.1.1
                                        @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                                        public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", yFl.Sg());
                                                jSONObject.put("scene", yFl.tN());
                                                jSONObject.put("start_count", yFl.AlY());
                                                jSONObject.put("success_count", yFl.wN());
                                                jSONObject.put("fail_count", yFl.vc());
                                                jSONObject.put("rit", yFl.DSW());
                                                jSONObject.put("tag", yFl.qsH());
                                                jSONObject.put("label", yFl.NjR());
                                                jSONObject.put("mediation", yFl.eT());
                                                jSONObject.put("is_init", yFl.YoT());
                                                jSONObject.put("extra", yFl.GA());
                                                return com.bytedance.sdk.openadsdk.pDU.YFl.AlY.Sg().YFl("bus_monitor").Sg(jSONObject.toString());
                                            } catch (Exception e2) {
                                                YoT.YFl("BusMonitorUtils", "onMonitorUpload: ", e2);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }
        }
        return YFl;
    }

    public static void tN(AlY alY) {
        YFl().YFl(new wN(alY, 0, 0, 1));
    }

    public static void YFl(AlY alY) {
        YFl().YFl(new wN(alY, 1, 0, 0));
    }
}
