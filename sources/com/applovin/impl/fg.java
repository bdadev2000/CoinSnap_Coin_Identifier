package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class fg {
    private static fg e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f23913a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f23914b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f23915c = new Object();
    private int d = 0;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static volatile boolean f23916a;
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(int i2);
    }

    /* loaded from: classes3.dex */
    public final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c2 = fg.c(context);
            int i2 = xp.f27962a;
            if (i2 >= 29 && !b.f23916a && c2 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) b1.a((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i2 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            fg.this.a(c2);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends PhoneStateListener {
        private e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            fg.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            fg.this.a(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private fg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i2 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type == 9) {
                        return 7;
                    }
                    if (type != 4 && type != 5) {
                        return type != 6 ? 8 : 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    public void b(c cVar) {
        b();
        this.f23914b.add(new WeakReference(cVar));
        this.f23913a.post(new ms(9, this, cVar));
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return xp.f27962a >= 29 ? 9 : 0;
        }
    }

    private void b() {
        Iterator it = this.f23914b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f23914b.remove(weakReference);
            }
        }
    }

    public int a() {
        int i2;
        synchronized (this.f23915c) {
            i2 = this.d;
        }
        return i2;
    }

    public static synchronized fg b(Context context) {
        fg fgVar;
        synchronized (fg.class) {
            try {
                if (e == null) {
                    e = new fg(context);
                }
                fgVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        cVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        synchronized (this.f23915c) {
            try {
                if (this.d == i2) {
                    return;
                }
                this.d = i2;
                Iterator it = this.f23914b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i2);
                    } else {
                        this.f23914b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
