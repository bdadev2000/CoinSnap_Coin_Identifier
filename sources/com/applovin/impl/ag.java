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

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: e */
    private static ag f6744e;

    /* renamed from: a */
    private final Handler f6745a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Object f6746c = new Object();

    /* renamed from: d */
    private int f6747d = 0;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private static volatile boolean f6748a;
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i9);
    }

    /* loaded from: classes.dex */
    public final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c9 = ag.c(context);
            int i9 = yp.f12451a;
            if (i9 >= 29 && !b.f6748a && c9 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) AbstractC0669a1.a((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i9 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            ag.this.a(c9);
        }

        public /* synthetic */ d(ag agVar, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public class e extends PhoneStateListener {
        private e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z8;
            int i9;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            ag agVar = ag.this;
            if (z8) {
                i9 = 10;
            } else {
                i9 = 5;
            }
            agVar.a(i9);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z8;
            int i9;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z8 = false;
            } else {
                z8 = true;
            }
            ag agVar = ag.this;
            if (z8) {
                i9 = 10;
            } else {
                i9 = 5;
            }
            agVar.a(i9);
        }

        public /* synthetic */ e(ag agVar, a aVar) {
            this();
        }
    }

    private ag(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static /* synthetic */ void a(ag agVar, c cVar) {
        agVar.a(cVar);
    }

    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i9 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i9 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 9) {
                            if (type != 4 && type != 5) {
                                if (type == 6) {
                                    return 5;
                                }
                                return 8;
                            }
                        } else {
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i9;
    }

    public void b(c cVar) {
        b();
        this.b.add(new WeakReference(cVar));
        this.f6745a.post(new F(7, this, cVar));
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
                return yp.f12451a >= 29 ? 9 : 0;
        }
    }

    private void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
    }

    public int a() {
        int i9;
        synchronized (this.f6746c) {
            i9 = this.f6747d;
        }
        return i9;
    }

    public static synchronized ag b(Context context) {
        ag agVar;
        synchronized (ag.class) {
            try {
                if (f6744e == null) {
                    f6744e = new ag(context);
                }
                agVar = f6744e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return agVar;
    }

    public /* synthetic */ void a(c cVar) {
        cVar.a(a());
    }

    public void a(int i9) {
        synchronized (this.f6746c) {
            try {
                if (this.f6747d == i9) {
                    return;
                }
                this.f6747d = i9;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i9);
                    } else {
                        this.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
