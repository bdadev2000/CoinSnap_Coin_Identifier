package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.utils.COT;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceUtils {
    private static int Bj = 0;
    private static int YW = 0;
    private static int dT = 0;
    private static int ku = 0;
    private static int tG = 0;
    private static int vDp = 0;
    public static String zp = "";
    private static volatile long lMd = System.currentTimeMillis();
    private static volatile boolean KS = false;
    private static volatile boolean jU = false;
    private static volatile boolean COT = false;
    private static volatile boolean HWF = true;
    private static long QR = 0;

    /* loaded from: classes.dex */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.YW.QR> zp = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void lMd(Context context) {
            if (!DeviceUtils.jU && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                    boolean unused = DeviceUtils.jU = true;
                } catch (Throwable unused2) {
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = DeviceUtils.dT = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        Iterator<com.bytedance.sdk.openadsdk.YW.QR> it = zp.iterator();
                        while (it.hasNext()) {
                            it.next().zp(DeviceUtils.dT);
                        }
                        if (DeviceUtils.YW != 0) {
                            int unused2 = DeviceUtils.Bj = (int) ((DeviceUtils.dT / DeviceUtils.YW) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.vDp = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }

        public static void zp(com.bytedance.sdk.openadsdk.YW.QR qr) {
            if (qr != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.YW.QR> copyOnWriteArrayList = zp;
                if (copyOnWriteArrayList.contains(qr)) {
                    return;
                }
                copyOnWriteArrayList.add(qr);
            }
        }

        public static void lMd(com.bytedance.sdk.openadsdk.YW.QR qr) {
            if (qr == null) {
                return;
            }
            zp.remove(qr);
        }
    }

    /* loaded from: classes.dex */
    public static class KS implements Runnable {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [com.bytedance.sdk.openadsdk.core.KS] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r32;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.KVG.zp());
                if (advertisingIdInfo != null) {
                    boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    r32 = isLimitAdTrackingEnabled;
                    if (com.bytedance.sdk.openadsdk.core.KVG.jU().irS("gaid")) {
                        String id = advertisingIdInfo.getId();
                        r32 = isLimitAdTrackingEnabled;
                        if (!TextUtils.isEmpty(id)) {
                            com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd(id);
                            com.com.bytedance.overseas.sdk.lMd.zp.zp(id);
                            com.bytedance.sdk.openadsdk.core.COT.KS.zp(id);
                            r32 = isLimitAdTrackingEnabled;
                        }
                    }
                } else {
                    r32 = -1;
                }
                if (r32 != -1) {
                    com.bytedance.sdk.openadsdk.core.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).zp("limit_ad_track", r32);
                }
            } catch (IOException e4) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e4);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.DeviceUtils", th.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class lMd extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.HWF = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.HWF = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.lMd = System.currentTimeMillis();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class zp extends BroadcastReceiver {
        private zp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void lMd(Context context) {
            int i9 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i9 >= 33) {
                    context.registerReceiver(new zp(), intentFilter, 2);
                } else {
                    context.registerReceiver(new zp(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    DeviceUtils.pvr(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i9 = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i9 = 1;
                    }
                    int unused = DeviceUtils.tG = i9;
                }
            }
        }
    }

    public static void Bj() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                ku = 1;
            } else if (ringerMode == 1) {
                ku = 2;
            } else {
                ku = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static JSONObject COT(Context context) {
        return zp(context, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int FP(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "XIAOMI"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            if (r4 != r2) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            r3 = r2
            goto L32
        L1c:
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L32
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            r0 = 4
            if (r4 != r0) goto L19
            goto L1a
        L32:
            return r3
        L33:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.DeviceUtils.FP(android.content.Context):int");
    }

    public static int HWF() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    private static float KVG(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int QR(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int YW() {
        return YW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cz(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                if (!((PowerManager) context.getSystemService("power")).isPowerSaveMode()) {
                    return 0;
                }
                return 1;
            }
            return FP(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int dQp(Context context) {
        return vDp;
    }

    @JProtect
    public static void dT() {
        new KS().run();
        Context zp2 = com.bytedance.sdk.openadsdk.core.KVG.zp();
        if (zp2 != null) {
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("cpu_count", QR.zp());
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("cpu_max_frequency", QR.zp(QR.zp()));
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("cpu_min_frequency", QR.lMd(QR.zp()));
            String YW2 = YhE.YW();
            if (YW2 != null) {
                com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("total_memory", YW2);
            }
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("total_internal_storage", YhE.dT());
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("free_internal_storage", com.bytedance.sdk.component.utils.rV.zp());
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("total_sdcard_storage", YhE.Bj());
            com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("is_root", YhE.vDp() ? 1 : 0);
            if (TextUtils.isEmpty(YW(zp2))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    zp = "unity";
                } catch (ClassNotFoundException unused) {
                    zp = "native";
                }
                com.bytedance.sdk.openadsdk.core.KS.zp(zp2).zp("framework_name", zp);
            }
            Bj();
            vwr(zp2);
            tG = cz(zp2);
        }
    }

    public static int ku(Context context) {
        return ku;
    }

    private static void ot(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z8) {
                super.onChange(z8);
                DeviceUtils.pvr(applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pvr(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        QUv.lMd(new com.bytedance.sdk.component.ku.ku("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.tG = DeviceUtils.cz(applicationContext);
            }
        });
    }

    private static void vwr(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            YW = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            dT = streamVolume;
            Bj = (int) ((streamVolume / YW) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    private static int woN(Context context) {
        return tG;
    }

    public static float COT() {
        int i9 = -1;
        try {
            Context zp2 = com.bytedance.sdk.openadsdk.core.KVG.zp();
            if (zp2 != null) {
                i9 = Settings.System.getInt(zp2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.DeviceUtils", th.getMessage());
        }
        if (i9 < 0) {
            return -1.0f;
        }
        return Math.round((i9 / 255.0f) * 10.0f) / 10.0f;
    }

    public static boolean KS(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int QR() {
        return dT;
    }

    public static String YW(Context context) {
        if (TextUtils.isEmpty(zp)) {
            zp = com.bytedance.sdk.openadsdk.core.KS.zp(context).lMd("framework_name", "");
        }
        return zp;
    }

    public static int jU(Context context) {
        if (KS(context)) {
            return 3;
        }
        return lMd(context) ? 2 : 1;
    }

    public static int ku() {
        return Bj;
    }

    private static int rV(Context context) {
        int i9;
        try {
            i9 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i9 == 32) {
            return 1;
        }
        return i9 == 16 ? 0 : -1;
    }

    public static int HWF(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("TTAD.DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static int KS() {
        return com.bytedance.sdk.openadsdk.core.KS.zp(com.bytedance.sdk.openadsdk.core.KVG.zp()).lMd("limit_ad_track", -1);
    }

    @JProtect
    public static boolean lMd() {
        if (SystemClock.elapsedRealtime() - QR >= 20000) {
            QR = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.KVG.zp().getSystemService("power");
                if (powerManager != null) {
                    HWF = powerManager.isInteractive();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("TTAD.DeviceUtils", th.getMessage());
            }
        }
        return HWF;
    }

    public static String jU() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void zp(Context context) {
        if (KS) {
            return;
        }
        try {
            lMd lmd = new lMd();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(lmd, intentFilter);
            KS = true;
        } catch (Throwable unused) {
        }
    }

    public static void Bj(Context context) {
        Context applicationContext;
        if (COT || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                zp.lMd(applicationContext);
            } else {
                ot(applicationContext);
            }
            COT = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean lMd(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void lMd(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.KVG.jU().irS("gaid")) {
            jSONObject.put("gaid", com.com.bytedance.overseas.sdk.lMd.zp.zp().lMd());
        }
    }

    public static long zp() {
        return lMd;
    }

    private static void zp(JSONObject jSONObject) throws JSONException {
        lMd(jSONObject);
    }

    @JProtect
    public static JSONObject zp(Context context, boolean z8) {
        String lMd2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", HWF(context));
            zp(jSONObject);
            jSONObject.put("type", jU(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", YhE.vDp(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.KS.KS());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.KS.lMd());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.KS.jU());
            jSONObject.put("screen_width", WNy.KS(context));
            jSONObject.put("screen_height", WNy.jU(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.COT.KS.HWF());
            com.bytedance.sdk.openadsdk.core.settings.COT jU2 = com.bytedance.sdk.openadsdk.core.KVG.jU();
            if (jU2.irS("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.Bj.KS(context));
            jSONObject.put("rom_version", yRU.zp());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.Bj.lMd(context));
            jSONObject.put("timezone", YhE.vwr());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.Bj.zp());
            jSONObject.put("carrier_name", ox.zp());
            if (z8) {
                lMd2 = YhE.zp(context);
            } else {
                lMd2 = YhE.lMd(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(lMd2) * 1024));
            jSONObject.put("locale_language", jU());
            jSONObject.put("screen_bright", Math.ceil(COT() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !lMd() ? 1 : 0);
            jSONObject.put("cpu_num", QR.zp(context));
            jSONObject.put("cpu_max_freq", QR.lMd(context));
            jSONObject.put("cpu_min_freq", QR.KS(context));
            COT.zp zp2 = COT.zp();
            jSONObject.put("battery_remaining_pct", (int) zp2.lMd);
            jSONObject.put("is_charging", zp2.zp);
            jSONObject.put("total_space", String.valueOf(YhE.KS(context)));
            jSONObject.put("free_space_in", String.valueOf(YhE.jU(context)));
            jSONObject.put("sdcard_size", String.valueOf(YhE.COT(context)));
            jSONObject.put("rooted", YhE.HWF(context));
            jSONObject.put("enable_assisted_clicking", HWF());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.cz.zp(context, "tt_choose_language"));
            jSONObject.put("airplane", QR(context));
            jSONObject.put("darkmode", rV(context));
            jSONObject.put("headset", dQp(context));
            jSONObject.put("ringmute", ku(context));
            jSONObject.put("screenscale", KVG(context));
            jSONObject.put("volume", ku());
            jSONObject.put("low_power_mode", woN(context));
            if (jU2.irS("mnc")) {
                jSONObject.put("mnc", ox.KS());
            }
            if (jU2.irS("mcc")) {
                jSONObject.put("mcc", ox.lMd());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.zp.lMd(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.zp.zp());
            String jU3 = com.bytedance.sdk.openadsdk.core.COT.KS.jU();
            if (!TextUtils.isEmpty(jU3)) {
                jSONObject.put("sof_chara", jU3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void dT(Context context) {
        AudioInfoReceiver.lMd(context);
    }
}
