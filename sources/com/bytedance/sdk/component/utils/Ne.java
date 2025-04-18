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
public class Ne {
    private static final Object YFl = new Object();
    private static final Map<YFl, Object> Sg = new ConcurrentHashMap();
    private static AtomicBoolean tN = new AtomicBoolean(false);
    private static volatile int AlY = -1;
    private static volatile long wN = 0;

    /* renamed from: vc, reason: collision with root package name */
    private static volatile int f10442vc = 60000;
    private static rkt DSW = null;
    private static final AtomicBoolean qsH = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class Sg extends BroadcastReceiver {
        private Sg() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z10 = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (Ne.Sg != null && Ne.Sg.size() > 0) {
                z10 = true;
            }
            Ne.Sg(context, intent, z10, booleanExtra);
        }
    }

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(Context context, Intent intent, boolean z10, int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(final Context context, final Intent intent, final boolean z10, final boolean z11) {
        if (!z10 && z11) {
            AlY = 0;
        } else if (qsH.compareAndSet(false, true)) {
            com.bytedance.sdk.component.qsH.vc.Sg(new com.bytedance.sdk.component.qsH.qsH("getNetworkType") { // from class: com.bytedance.sdk.component.utils.Ne.1
                @Override // java.lang.Runnable
                public void run() {
                    int Sg2;
                    if (!z11) {
                        Sg2 = Ne.Sg(context);
                    } else {
                        Sg2 = 0;
                    }
                    int unused = Ne.AlY = Sg2;
                    Ne.qsH.set(false);
                    if (z10) {
                        Ne.Sg(context, intent, Ne.AlY, z11);
                    }
                }
            });
        }
    }

    private static int tN(Context context) {
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
                        rkt rktVar = DSW;
                        return (rktVar == null || !rktVar.YFl(context, telephonyManager)) ? 5 : 6;
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
    public static void Sg(Context context, Intent intent, int i10, boolean z10) {
        Map<YFl, Object> map = Sg;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (YFl yFl : map.keySet()) {
            if (yFl != null) {
                yFl.YFl(context, intent, !z10, i10);
            }
        }
    }

    public static int YFl(Context context, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (wN + j3 <= elapsedRealtime) {
            return Sg(context);
        }
        if (AlY == -1) {
            return Sg(context);
        }
        if (elapsedRealtime - wN >= f10442vc) {
            Sg(context, (Intent) null, false, false);
        }
        return AlY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Sg(Context context) {
        AlY = tN(context);
        wN = SystemClock.elapsedRealtime();
        return AlY;
    }

    public static void YFl(YFl yFl, Context context) {
        if (yFl == null) {
            return;
        }
        if (!tN.get()) {
            try {
                context.registerReceiver(new Sg(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                tN.set(true);
            } catch (Throwable unused) {
            }
        }
        Sg.put(yFl, YFl);
    }

    public static void YFl(YFl yFl) {
        if (yFl == null) {
            return;
        }
        Sg.remove(yFl);
    }
}
