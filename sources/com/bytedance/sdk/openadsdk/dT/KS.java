package com.bytedance.sdk.openadsdk.dT;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.Bj;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.settings.dQp;
import com.bytedance.sdk.openadsdk.utils.YhE;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS zp;

    private KS() {
    }

    private boolean KS(com.bytedance.sdk.openadsdk.dT.zp.KS ks) {
        return ks == null;
    }

    public static void lMd(final woN won) {
        if (YhE.zp(won) == null || TextUtils.isEmpty(won.fVt())) {
            return;
        }
        zp("download_gecko_start", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.17
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", woN.this.aax());
                jSONObject.put("channel_name", woN.this.fVt());
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("download_gecko_start").zp(woN.this.WJ()).lMd(jSONObject.toString());
            }
        });
    }

    public static KS zp() {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public static void KS() {
        zp("disk_log", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.10
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                File file = new File(CacheDirFactory.getRootDir());
                long j7 = 0;
                if (file.exists() && file.isDirectory()) {
                    for (File file2 : file.listFiles()) {
                        long zp2 = KS.zp(file2);
                        j7 += zp2;
                        jSONObject.put(file2.getName(), zp2);
                    }
                }
                if (j7 < 524288000) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("disk_log").lMd(jSONObject.toString());
            }
        });
    }

    public static void KS(final String str) {
        zp("request_monitor_daily", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.14
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("request_monitor_daily").lMd(str);
            }
        });
    }

    public void lMd(final com.bytedance.sdk.openadsdk.dT.zp.KS ks) {
        if (KS(ks)) {
            return;
        }
        ks.zp("show_backup_endcard");
        KVG.COT().zp(new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.20
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return ks;
            }
        });
    }

    public static void zp(final woN won) {
        if (won == null) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        zp("bidding_receive", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.1
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reveice_ts", currentTimeMillis);
                if (won.WJ() == 3) {
                    jSONObject.put("is_icon_only", won.hG() ? 1 : 0);
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("bidding_receive").lMd(jSONObject.toString());
            }
        });
    }

    public void lMd(final String str) {
        zp("close_playable_test_tool", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.3
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("close_playable_test_tool").lMd(jSONObject.toString());
            }
        });
    }

    public void lMd() {
        zp("blind_mode_status", true, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.8
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("blind_mode_status");
            }
        });
    }

    public static void lMd(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                final com.bytedance.sdk.openadsdk.dT.zp.KS lMd = com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(str).lMd(str2);
                KVG.COT().zp(new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.11
                    @Override // com.bytedance.sdk.openadsdk.dT.lMd
                    public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                        return com.bytedance.sdk.openadsdk.dT.zp.KS.this;
                    }
                }, false);
            }
        } catch (Throwable th) {
            tG.zp("StatsLogManager", th.getMessage());
        }
    }

    public static void zp(woN won, final long j7) {
        if (won == null) {
            return;
        }
        zp("bidding_load", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.12
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j7);
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("bidding_load").lMd(jSONObject.toString());
            }
        });
    }

    public static void zp(final String str, final com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp zpVar) {
        if (zpVar == null) {
            return;
        }
        zp(str, false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.16
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject KS = com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.KS();
                if (KS == null) {
                    KS = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.lMd.jU.lMd.KS jU = com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.jU();
                if (jU != null) {
                    jU.zp(KS);
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(str).zp(com.bytedance.sdk.openadsdk.lMd.jU.lMd.zp.this.zp().WJ()).lMd(KS.toString());
            }
        });
    }

    public static void zp(final woN won, final JSONObject jSONObject) {
        if (YhE.zp(won) == null || TextUtils.isEmpty(won.fVt())) {
            return;
        }
        zp("download_gecko_end", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.18
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", woN.this.aax());
                jSONObject2.put("channel_name", woN.this.fVt());
                jSONObject2.put(DataSchemeDataSource.SCHEME_DATA, jSONObject);
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("download_gecko_end").zp(woN.this.WJ()).lMd(jSONObject2.toString());
            }
        });
    }

    public void zp(final com.bytedance.sdk.openadsdk.dT.zp.KS ks) {
        if (KS(ks)) {
            return;
        }
        ks.zp("express_ad_render");
        KVG.COT().zp(new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.19
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return ks;
            }
        });
    }

    public void zp(final String str) {
        zp("click_playable_test_tool", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.2
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("click_playable_test_tool").lMd(jSONObject.toString());
            }
        });
    }

    public void zp(final String str, final int i9, final String str2) {
        zp("use_playable_test_tool_error", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.4
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                    jSONObject.put("error_code", i9);
                    jSONObject.put("error_message", str2);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("use_playable_test_tool_error").lMd(jSONObject.toString());
            }
        });
    }

    public void zp(final long j7, final long j9) {
        final long j10 = j9 - j7;
        zp("general_label", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.5
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                int i9 = !com.bytedance.sdk.openadsdk.core.tG.lMd.get() ? 1 : 0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j7);
                    jSONObject.put("endtime", j9);
                    jSONObject.put("start_type", i9);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("general_label").ku(String.valueOf(j10)).lMd(jSONObject.toString());
            }
        });
    }

    public void zp(final String str, final JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        zp(str, false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.6
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(str).lMd(jSONObject.toString());
            }
        });
    }

    public void zp(final String str, final String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        zp(str, false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.7
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp(str).lMd(str2);
            }
        });
    }

    public void zp(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("device_ad_mediation_platform");
        if (!(opt instanceof String) || TextUtils.isEmpty((String) opt)) {
            return;
        }
        zp("ad_revenue", true, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.9
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                try {
                    jSONObject.put(NotificationCompat.CATEGORY_EVENT, 272);
                    jSONObject.put("uuid", Bj.KS(KVG.zp()));
                    String str = "";
                    try {
                        if (Bj.zp(KVG.zp()) != null) {
                            str = Bj.zp(KVG.zp());
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    jSONObject.put("device_id", str);
                    jSONObject.put("platform", "android");
                    jSONObject.put("partner", "PangleSDK");
                } catch (Throwable th2) {
                    th2.getMessage();
                }
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("ad_revenue").lMd(jSONObject.toString());
            }
        });
    }

    public static long zp(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j7 = 0;
        for (File file2 : file.listFiles()) {
            j7 += zp(file2);
        }
        return j7;
    }

    public static void zp(String str, boolean z8, lMd lmd) {
        int lMd = dQp.etV().lMd(str);
        if (TextUtils.isEmpty(str) || lMd == 0 || lmd == null) {
            return;
        }
        boolean z9 = lMd == 100;
        if (!z9) {
            z9 = ((int) ((Math.random() * 100.0d) + 1.0d)) <= lMd;
        }
        if (z9) {
            KVG.COT().zp(lmd, z8);
        }
    }

    public static void zp(long j7, long j9, final String str, final int i9) {
        if (j7 == 0) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final long j10 = elapsedRealtime - j7;
        final long j11 = elapsedRealtime - j9;
        final long j12 = j9 - j7;
        zp("ad_show_cost_time", false, new lMd() { // from class: com.bytedance.sdk.openadsdk.dT.KS.13
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j10);
                jSONObject.put("renderDuration", j11);
                jSONObject.put("showToRenderDuration", j12);
                jSONObject.put("tag", str);
                jSONObject.put("renderType", i9);
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("ad_show_cost_time").lMd(jSONObject.toString());
            }
        });
    }

    public static void zp(int i9, String str) {
        zp(i9, str, 0, (String) null);
    }

    public static void zp(final int i9, final String str, final int i10, final String str2) {
        zp("ipv6_req", false, (lMd) new lMd<com.bytedance.sdk.openadsdk.dT.zp.lMd>() { // from class: com.bytedance.sdk.openadsdk.dT.KS.15
            @Override // com.bytedance.sdk.openadsdk.dT.lMd
            @Nullable
            public com.bytedance.sdk.openadsdk.dT.zp.lMd getLogStats() throws Exception {
                String str3;
                JSONObject jSONObject = new JSONObject();
                int i11 = i9;
                if (i11 == 1) {
                    str3 = "success";
                } else if (i11 == -1) {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_msg", str2);
                    str3 = "fail";
                } else {
                    str3 = "start";
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("url", str);
                }
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
                return com.bytedance.sdk.openadsdk.dT.zp.KS.lMd().zp("ipv6_req").lMd(jSONObject.toString());
            }
        });
    }
}
