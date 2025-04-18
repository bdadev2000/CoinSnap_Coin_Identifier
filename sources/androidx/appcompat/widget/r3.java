package androidx.appcompat.widget;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class r3 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1010b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1011c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1012d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1013e;

    public r3() {
        this.a = 0;
    }

    public final void a() {
        switch (this.a) {
            case 1:
                this.f1010b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f1013e;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            default:
                this.f1010b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f1013e;
                if (wifiLock != null) {
                    wifiLock.release();
                    return;
                }
                return;
        }
    }

    public final void b(boolean z10) {
        switch (this.a) {
            case 1:
                this.f1011c = z10;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f1013e;
                if (wakeLock != null) {
                    if (this.f1010b && z10) {
                        wakeLock.acquire();
                        return;
                    } else {
                        wakeLock.release();
                        return;
                    }
                }
                return;
            default:
                this.f1011c = z10;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f1013e;
                if (wifiLock != null) {
                    if (this.f1010b && z10) {
                        wifiLock.acquire();
                        return;
                    } else {
                        wifiLock.release();
                        return;
                    }
                }
                return;
        }
    }

    public r3(int i10) {
        ld.d dVar = ld.d.STANDALONE;
        this.a = 3;
        this.f1010b = false;
        this.f1012d = null;
        this.f1011c = true;
        this.f1013e = dVar;
    }

    public r3(Context context, int i10) {
        this.a = i10;
        if (i10 != 2) {
            this.f1012d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.f1012d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }
}
