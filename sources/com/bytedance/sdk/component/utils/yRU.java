package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class yRU {
    private static final Object zp = new Object();
    private static final Map<zp, Object> lMd = new ConcurrentHashMap();
    private static AtomicBoolean KS = new AtomicBoolean(false);
    private static volatile int jU = -1;
    private static volatile long COT = 0;
    private static volatile int HWF = 60000;
    private static woN QR = null;
    private static final AtomicBoolean ku = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class lMd extends BroadcastReceiver {
        private lMd() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z8 = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (yRU.lMd != null && yRU.lMd.size() > 0) {
                z8 = true;
            }
            yRU.lMd(context, intent, z8, booleanExtra);
        }
    }

    /* loaded from: classes.dex */
    public interface zp {
        void zp(Context context, Intent intent, boolean z8, int i9);
    }

    private static int KS(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        woN won = QR;
                        return (won == null || !won.zp(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(final Context context, final Intent intent, final boolean z8, final boolean z9) {
        if (!z8 && z9) {
            jU = 0;
        } else if (ku.compareAndSet(false, true)) {
            com.bytedance.sdk.component.ku.HWF.lMd(new com.bytedance.sdk.component.ku.ku("getNetworkType") { // from class: com.bytedance.sdk.component.utils.yRU.1
                @Override // java.lang.Runnable
                public void run() {
                    int lMd2;
                    if (!z9) {
                        lMd2 = yRU.lMd(context);
                    } else {
                        lMd2 = 0;
                    }
                    int unused = yRU.jU = lMd2;
                    yRU.ku.set(false);
                    if (z8) {
                        yRU.lMd(context, intent, yRU.jU, z9);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(Context context, Intent intent, int i9, boolean z8) {
        Map<zp, Object> map = lMd;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (zp zpVar : map.keySet()) {
            if (zpVar != null) {
                zpVar.zp(context, intent, !z8, i9);
            }
        }
    }

    public static int zp(Context context, long j7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (COT + j7 <= elapsedRealtime) {
            return lMd(context);
        }
        if (jU == -1) {
            return lMd(context);
        }
        if (elapsedRealtime - COT >= HWF) {
            lMd(context, (Intent) null, false, false);
        }
        return jU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lMd(Context context) {
        jU = KS(context);
        COT = SystemClock.elapsedRealtime();
        return jU;
    }

    public static void zp(zp zpVar, Context context) {
        if (zpVar == null) {
            return;
        }
        if (!KS.get()) {
            try {
                context.registerReceiver(new lMd(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                KS.set(true);
            } catch (Throwable unused) {
            }
        }
        lMd.put(zpVar, zp);
    }

    public static void zp(zp zpVar) {
        if (zpVar == null) {
            return;
        }
        lMd.remove(zpVar);
    }
}
