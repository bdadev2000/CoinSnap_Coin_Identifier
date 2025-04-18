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
import com.bytedance.sdk.openadsdk.core.settings.EH;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceUtils {
    private static int GA = 0;
    private static int NjR = 0;
    public static String YFl = "";
    private static int YoT;
    private static int eT;

    /* renamed from: nc, reason: collision with root package name */
    private static int f10813nc;
    private static int qsH;
    private static volatile long Sg = System.currentTimeMillis();
    private static volatile boolean tN = false;
    private static volatile boolean AlY = false;
    private static volatile boolean wN = false;

    /* renamed from: vc, reason: collision with root package name */
    private static volatile boolean f10814vc = true;
    private static long DSW = 0;
    private static AtomicBoolean pDU = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.YoT.DSW> YFl = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void Sg(Context context) {
            if (!DeviceUtils.AlY && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new AudioInfoReceiver(), intentFilter);
                    boolean unused = DeviceUtils.AlY = true;
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
                        int unused = DeviceUtils.f10813nc = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        Iterator<com.bytedance.sdk.openadsdk.YoT.DSW> it = YFl.iterator();
                        while (it.hasNext()) {
                            it.next().YFl(DeviceUtils.f10813nc);
                        }
                        if (DeviceUtils.NjR != 0) {
                            int unused2 = DeviceUtils.eT = (int) ((DeviceUtils.f10813nc / DeviceUtils.NjR) * 100.0d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = DeviceUtils.YoT = intent.getIntExtra("state", 0);
                }
            } catch (Exception unused4) {
            }
        }

        public static void YFl(com.bytedance.sdk.openadsdk.YoT.DSW dsw) {
            if (dsw != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.YoT.DSW> copyOnWriteArrayList = YFl;
                if (copyOnWriteArrayList.contains(dsw)) {
                    return;
                }
                copyOnWriteArrayList.add(dsw);
            }
        }

        public static void Sg(com.bytedance.sdk.openadsdk.YoT.DSW dsw) {
            if (dsw == null) {
                return;
            }
            YFl.remove(dsw);
        }
    }

    /* loaded from: classes.dex */
    public static class Sg extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.f10814vc = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.f10814vc = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.Sg = System.currentTimeMillis();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class YFl extends BroadcastReceiver {
        private YFl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void Sg(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new YFl(), intentFilter, 2);
                } else {
                    context.registerReceiver(new YFl(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    DeviceUtils.qO(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i10 = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i10 = 1;
                    }
                    int unused = DeviceUtils.GA = i10;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class tN implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i10;
            try {
                final AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.lG.YFl());
                if (advertisingIdInfo != null) {
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    DeviceUtils.Sg(advertisingIdInfo);
                    com.bytedance.sdk.openadsdk.core.settings.rkt.YFl(new EH.YFl() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.tN.1
                        @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
                        public void Sg() {
                            DeviceUtils.Sg(advertisingIdInfo);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.settings.EH.YFl
                        public void YFl() {
                            DeviceUtils.Sg(advertisingIdInfo);
                        }
                    });
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    com.bytedance.sdk.openadsdk.core.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).YFl("limit_ad_track", i10);
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e2);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.DeviceUtils", th2.getMessage());
            }
        }
    }

    public static int DSW(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static int EH(Context context) {
        return YoT;
    }

    private static void Ne(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                DeviceUtils.qO(applicationContext);
            }
        });
    }

    public static int NjR() {
        return NjR;
    }

    private static void Wwa(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            NjR = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f10813nc = streamVolume;
            eT = (int) ((streamVolume / NjR) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int aIu(Context context) {
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
            return wXo(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void eT() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getRingerMode();
            if (ringerMode == 2) {
                qsH = 1;
            } else if (ringerMode == 1) {
                qsH = 2;
            } else {
                qsH = 0;
            }
        } catch (Throwable unused) {
        }
    }

    private static int lG(Context context) {
        return GA;
    }

    @JProtect
    public static void nc() {
        new tN().run();
        Context YFl2 = com.bytedance.sdk.openadsdk.core.lG.YFl();
        if (YFl2 != null) {
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("cpu_count", DSW.YFl());
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("cpu_max_frequency", DSW.YFl(DSW.YFl()));
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("cpu_min_frequency", DSW.Sg(DSW.YFl()));
            String NjR2 = Sco.NjR();
            if (NjR2 != null) {
                com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("total_memory", NjR2);
            }
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("total_internal_storage", Sco.nc());
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("free_internal_storage", com.bytedance.sdk.component.utils.GA.YFl());
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("total_sdcard_storage", Sco.eT());
            com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("is_root", Sco.YoT() ? 1 : 0);
            if (TextUtils.isEmpty(NjR(YFl2))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    YFl = "unity";
                } catch (ClassNotFoundException unused) {
                    YFl = "native";
                }
                com.bytedance.sdk.openadsdk.core.tN.YFl(YFl2).YFl("framework_name", YFl);
            }
            eT();
            Wwa(YFl2);
            GA = aIu(YFl2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qO(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        mn.Sg(new com.bytedance.sdk.component.qsH.qsH("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.GA = DeviceUtils.aIu(applicationContext);
            }
        });
    }

    public static int qsH(Context context) {
        return qsH;
    }

    private static float rkt(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int vc() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static JSONObject wN(Context context) {
        return YFl(context, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int wXo(android.content.Context r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.DeviceUtils.wXo(android.content.Context):int");
    }

    public static int AlY(Context context) {
        if (tN(context)) {
            return 3;
        }
        return Sg(context) ? 2 : 1;
    }

    public static int DSW() {
        return f10813nc;
    }

    public static String NjR(Context context) {
        if (TextUtils.isEmpty(YFl)) {
            YFl = com.bytedance.sdk.openadsdk.core.tN.YFl(context).Sg("framework_name", "");
        }
        return YFl;
    }

    private static int pDU(Context context) {
        int i10;
        try {
            i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i10 == 32) {
            return 1;
        }
        return i10 == 16 ? 0 : -1;
    }

    public static int qsH() {
        return eT;
    }

    public static boolean tN(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float wN() {
        int i10 = -1;
        try {
            Context YFl2 = com.bytedance.sdk.openadsdk.core.lG.YFl();
            if (YFl2 != null) {
                i10 = Settings.System.getInt(YFl2.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.DeviceUtils", th2.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    @JProtect
    public static boolean Sg() {
        if (SystemClock.elapsedRealtime() - DSW >= 20000) {
            DSW = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.lG.YFl().getSystemService("power");
                if (powerManager != null) {
                    f10814vc = powerManager.isInteractive();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("TTAD.DeviceUtils", th2.getMessage());
            }
        }
        return f10814vc;
    }

    public static int tN() {
        return com.bytedance.sdk.openadsdk.core.tN.YFl(com.bytedance.sdk.openadsdk.core.lG.YFl()).Sg("limit_ad_track", -1);
    }

    public static int vc(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("TTAD.DeviceUtils", th2.getMessage());
            return -1;
        }
    }

    public static String AlY() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void YFl(Context context) {
        if (tN) {
            return;
        }
        try {
            Sg sg2 = new Sg();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(sg2, intentFilter);
            tN = true;
        } catch (Throwable unused) {
        }
    }

    public static void eT(Context context) {
        Context applicationContext;
        if (wN || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                Ne(applicationContext);
            } else {
                YFl.Sg(applicationContext);
            }
            wN = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean Sg(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void Sg(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.lG.AlY().dXO("gaid")) {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg());
        }
    }

    public static long YFl() {
        return Sg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(AdvertisingIdClient.Info info) {
        if (!com.bytedance.sdk.openadsdk.core.lG.AlY().dXO("gaid") || pDU.getAndSet(true)) {
            return;
        }
        String id2 = info.getId();
        if (TextUtils.isEmpty(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl().Sg(id2);
        com.bytedance.sdk.openadsdk.Wwa.YFl.Sg.YFl.YFl(id2);
        com.bytedance.sdk.openadsdk.core.NjR.tN.YFl(id2);
    }

    private static void YFl(JSONObject jSONObject) throws JSONException {
        Sg(jSONObject);
    }

    @JProtect
    public static JSONObject YFl(Context context, boolean z10) {
        String Sg2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", vc(context));
            YFl(jSONObject);
            jSONObject.put("type", AlY(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", Sco.YoT(context));
            jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.AlY.tN());
            jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.AlY.Sg());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.AlY.AlY());
            jSONObject.put("screen_width", GS.tN(context));
            jSONObject.put("screen_height", GS.AlY(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.NjR.tN.DSW());
            com.bytedance.sdk.openadsdk.core.settings.vc AlY2 = com.bytedance.sdk.openadsdk.core.lG.AlY();
            if (AlY2.dXO("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.YoT.tN(context));
            jSONObject.put("rom_version", bZ.YFl());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.YoT.Sg(context));
            jSONObject.put("timezone", Sco.Wwa());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.YoT.YFl());
            jSONObject.put("carrier_name", YI.YFl());
            if (z10) {
                Sg2 = Sco.YFl(context);
            } else {
                Sg2 = Sco.Sg(context);
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(Sg2) * 1024));
            jSONObject.put("locale_language", AlY());
            jSONObject.put("screen_bright", Math.ceil(wN() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", Sg() ? 0 : 1);
            jSONObject.put("cpu_num", DSW.YFl(context));
            jSONObject.put("cpu_max_freq", DSW.Sg(context));
            jSONObject.put("cpu_min_freq", DSW.tN(context));
            wN.YFl YFl2 = wN.YFl();
            jSONObject.put("battery_remaining_pct", (int) YFl2.Sg);
            jSONObject.put("is_charging", YFl2.YFl);
            jSONObject.put("total_space", String.valueOf(Sco.tN(context)));
            jSONObject.put("free_space_in", String.valueOf(Sco.AlY(context)));
            jSONObject.put("sdcard_size", String.valueOf(Sco.wN(context)));
            jSONObject.put("rooted", Sco.vc(context));
            jSONObject.put("enable_assisted_clicking", vc());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.qO.YFl(context, "tt_choose_language"));
            jSONObject.put("airplane", DSW(context));
            jSONObject.put("darkmode", pDU(context));
            jSONObject.put("headset", EH(context));
            jSONObject.put("ringmute", qsH(context));
            jSONObject.put("screenscale", rkt(context));
            jSONObject.put("volume", qsH());
            jSONObject.put("low_power_mode", lG(context));
            if (AlY2.dXO("mnc")) {
                jSONObject.put("mnc", YI.tN());
            }
            if (AlY2.dXO("mcc")) {
                jSONObject.put("mcc", YI.Sg());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.act.YFl.Sg(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.act.YFl.YFl());
            String AlY3 = com.bytedance.sdk.openadsdk.core.NjR.tN.AlY();
            com.bytedance.sdk.openadsdk.core.NjR.tN.wN();
            if (!TextUtils.isEmpty(AlY3)) {
                jSONObject.put("sof_chara", AlY3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void nc(Context context) {
        AudioInfoReceiver.Sg(context);
    }
}
