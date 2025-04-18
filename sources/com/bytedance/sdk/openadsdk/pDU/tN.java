package com.bytedance.sdk.openadsdk.pDU;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.qsH.qsH;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.pDU;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.pDU.YFl.AlY;
import com.bytedance.sdk.openadsdk.utils.Sco;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    private static volatile tN YFl;

    private tN() {
    }

    public static void AlY() {
        YFl("disk_log", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.11
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j3 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long YFl2 = tN.YFl(file2);
                        j3 += YFl2;
                        jSONObject.put(file2.getName(), YFl2);
                    }
                }
                if (j3 < 524288000) {
                    return null;
                }
                return AlY.Sg().YFl("disk_log").Sg(jSONObject.toString());
            }
        });
    }

    public static void Sg(final Wwa wwa) {
        if (Sco.YFl(wwa) == null || TextUtils.isEmpty(wwa.DjU())) {
            return;
        }
        YFl("download_gecko_start", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.18
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", Wwa.this.Cqy());
                jSONObject.put("channel_name", Wwa.this.DjU());
                return AlY.Sg().YFl("download_gecko_start").YFl(Wwa.this.JGG()).Sg(jSONObject.toString());
            }
        });
    }

    public static tN YFl() {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = new tN();
                }
            }
        }
        return YFl;
    }

    private boolean tN(AlY alY) {
        return alY == null;
    }

    public void tN() {
        YFl("blind_mode_status", true, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.9
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return AlY.Sg().YFl("blind_mode_status");
            }
        });
    }

    public static void tN(final String str) {
        YFl("request_monitor_daily", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.15
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return AlY.Sg().YFl("request_monitor_daily").Sg(str);
            }
        });
    }

    public void Sg(final AlY alY) {
        if (tN(alY)) {
            return;
        }
        alY.YFl("show_backup_endcard");
        lG.wN().YFl(new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.21
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return alY;
            }
        });
    }

    public static void YFl(final Wwa wwa) {
        if (wwa == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        YFl("bidding_receive", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.1
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (wwa.JGG() == 3) {
                    jSONObject.put("is_icon_only", wwa.Zu() ? 1 : 0);
                }
                return AlY.Sg().YFl("bidding_receive").Sg(jSONObject.toString());
            }
        });
    }

    public void Sg(final String str) {
        YFl("close_playable_test_tool", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.3
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return AlY.Sg().YFl("close_playable_test_tool").Sg(jSONObject.toString());
            }
        });
    }

    public static void Sg() {
        mn.tN(new qsH("showFailLog") { // from class: com.bytedance.sdk.openadsdk.pDU.tN.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    tN.YFl().YFl("show_fail_log", new JSONObject());
                } catch (Throwable th2) {
                    YoT.YFl("StatsLogManager", th2.getMessage());
                }
            }
        });
    }

    public static void Sg(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final AlY Sg = AlY.Sg().YFl(str).Sg(str2);
                lG.wN().YFl(new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.13
                    @Override // com.bytedance.sdk.openadsdk.pDU.Sg
                    public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                        return AlY.this;
                    }
                }, false);
            }
        } catch (Throwable th2) {
            YoT.YFl("StatsLogManager", th2.getMessage());
        }
    }

    public static void YFl(Wwa wwa, final long j3) {
        if (wwa == null) {
            return;
        }
        YFl("bidding_load", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.12
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j3);
                return AlY.Sg().YFl("bidding_load").Sg(jSONObject.toString());
            }
        });
    }

    public static void YFl(final String str, final com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl yFl) {
        if (yFl == null) {
            return;
        }
        YFl(str, false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.17
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject tN = com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.tN();
                if (tN == null) {
                    tN = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.AlY.wN.Sg.tN AlY = com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.AlY();
                if (AlY != null) {
                    AlY.YFl(tN);
                }
                return AlY.Sg().YFl(str).YFl(com.bytedance.sdk.openadsdk.AlY.wN.Sg.YFl.this.YFl().JGG()).Sg(tN.toString());
            }
        });
    }

    public static void YFl(final Wwa wwa, final JSONObject jSONObject) {
        if (Sco.YFl(wwa) == null || TextUtils.isEmpty(wwa.DjU())) {
            return;
        }
        YFl("download_gecko_end", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.19
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", Wwa.this.Cqy());
                jSONObject2.put("channel_name", Wwa.this.DjU());
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                return AlY.Sg().YFl("download_gecko_end").YFl(Wwa.this.JGG()).Sg(jSONObject2.toString());
            }
        });
    }

    public void YFl(final AlY alY) {
        if (tN(alY)) {
            return;
        }
        alY.YFl("express_ad_render");
        lG.wN().YFl(new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.20
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return alY;
            }
        });
    }

    public void YFl(final String str) {
        YFl("click_playable_test_tool", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.2
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return AlY.Sg().YFl("click_playable_test_tool").Sg(jSONObject.toString());
            }
        });
    }

    public void YFl(final String str, final int i10, final String str2) {
        YFl("use_playable_test_tool_error", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.4
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return AlY.Sg().YFl("use_playable_test_tool_error").Sg(jSONObject.toString());
            }
        });
    }

    public void YFl(final long j3, final long j10) {
        final long j11 = j10 - j3;
        YFl("general_label", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.5
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                int i10 = !pDU.Sg.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j3);
                    jSONObject.put("endtime", j10);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                return AlY.Sg().YFl("general_label").qsH(String.valueOf(j11)).Sg(jSONObject.toString());
            }
        });
    }

    public void YFl(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        YFl(str, false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.7
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return AlY.Sg().YFl(str).Sg(jSONObject.toString());
            }
        });
    }

    public void YFl(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        YFl(str, false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.8
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                return AlY.Sg().YFl(str).Sg(str2);
            }
        });
    }

    public void YFl(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            return;
        }
        YFl("ad_revenue", true, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.10
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                try {
                    jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                    jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.YoT.tN(lG.YFl()));
                    String str = "";
                    try {
                        if (com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl()) != null) {
                            str = com.bytedance.sdk.openadsdk.core.YoT.YFl(lG.YFl());
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    jSONObject.put("device_id", str);
                    jSONObject.put("platform", "android");
                    jSONObject.put("partner", "PangleSDK");
                } catch (Throwable th3) {
                    th3.getMessage();
                }
                return AlY.Sg().YFl("ad_revenue").Sg(jSONObject.toString());
            }
        });
    }

    public static long YFl(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j3 = 0;
        for (File file2 : file.listFiles()) {
            j3 += YFl(file2);
        }
        return j3;
    }

    public static void YFl(String str, boolean z10, Sg sg2) {
        int Sg = rkt.JwO().Sg(str);
        if (TextUtils.isEmpty(str) || Sg == 0 || sg2 == null) {
            return;
        }
        boolean z11 = Sg == 100;
        if (!z11) {
            z11 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= Sg;
        }
        if (z11) {
            lG.wN().YFl(sg2, z10);
        }
    }

    public static void YFl(long j3, long j10, final String str, final int i10) {
        if (j3 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j11 = elapsedRealtime - j3;
        final long j12 = elapsedRealtime - j10;
        final long j13 = j10 - j3;
        YFl("ad_show_cost_time", false, new Sg() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.14
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j11);
                jSONObject.put("renderDuration", j12);
                jSONObject.put("showToRenderDuration", j13);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i10);
                return AlY.Sg().YFl("ad_show_cost_time").Sg(jSONObject.toString());
            }
        });
    }

    public static void YFl(int i10, String str) {
        YFl(i10, str, 0, (String) null);
    }

    public static void YFl(final int i10, final String str, final int i11, final String str2) {
        YFl("ipv6_req", false, (Sg) new Sg<com.bytedance.sdk.openadsdk.pDU.YFl.tN>() { // from class: com.bytedance.sdk.openadsdk.pDU.tN.16
            @Override // com.bytedance.sdk.openadsdk.pDU.Sg
            @Nullable
            public com.bytedance.sdk.openadsdk.pDU.YFl.tN getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i12 = i10;
                if (i12 == 1) {
                    str3 = "success";
                } else if (i12 == -1) {
                    jSONObject.put("error_code", i11);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
                return AlY.Sg().YFl("ipv6_req").Sg(jSONObject.toString());
            }
        });
    }
}
