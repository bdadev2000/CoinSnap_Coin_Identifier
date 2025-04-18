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
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ag {

    /* renamed from: e, reason: collision with root package name */
    private static ag f3752e;
    private final Handler a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f3753b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Object f3754c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f3755d = 0;

    /* loaded from: classes.dex */
    public static final class b {
        private static volatile boolean a;
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    public final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c10 = ag.c(context);
            int i10 = yp.a;
            if (i10 >= 29 && !b.a && c10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) a1.a((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            ag.this.a(c10);
        }
    }

    /* loaded from: classes.dex */
    public class e extends PhoneStateListener {
        private e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z10;
            int i10;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            ag agVar = ag.this;
            if (z10) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            agVar.a(i10);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z10;
            int i10;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z10 = false;
            } else {
                z10 = true;
            }
            ag agVar = ag.this;
            if (z10) {
                i10 = 10;
            } else {
                i10 = 5;
            }
            agVar.a(i10);
        }
    }

    private ag(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
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
        return i10;
    }

    public void b(c cVar) {
        b();
        this.f3753b.add(new WeakReference(cVar));
        this.a.post(new rs(7, this, cVar));
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
                return yp.a >= 29 ? 9 : 0;
        }
    }

    private void b() {
        Iterator it = this.f3753b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f3753b.remove(weakReference);
            }
        }
    }

    public int a() {
        int i10;
        synchronized (this.f3754c) {
            i10 = this.f3755d;
        }
        return i10;
    }

    public static synchronized ag b(Context context) {
        ag agVar;
        synchronized (ag.class) {
            if (f3752e == null) {
                f3752e = new ag(context);
            }
            agVar = f3752e;
        }
        return agVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        cVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        synchronized (this.f3754c) {
            if (this.f3755d == i10) {
                return;
            }
            this.f3755d = i10;
            Iterator it = this.f3753b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c cVar = (c) weakReference.get();
                if (cVar != null) {
                    cVar.a(i10);
                } else {
                    this.f3753b.remove(weakReference);
                }
            }
        }
    }
}
