package W1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3598e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f3599f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f3600g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile w f3601h;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3603c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3604d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f3602a = 20000;

    static {
        boolean z8;
        int i9 = Build.VERSION.SDK_INT;
        boolean z9 = false;
        if (i9 < 29) {
            z8 = true;
        } else {
            z8 = false;
        }
        f3598e = z8;
        if (i9 >= 28) {
            z9 = true;
        }
        f3599f = z9;
        f3600g = new File("/proc/self/fd");
    }

    public static w a() {
        if (f3601h == null) {
            synchronized (w.class) {
                try {
                    if (f3601h == null) {
                        f3601h = new w();
                    }
                } finally {
                }
            }
        }
        return f3601h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f3602a;
    }

    public final boolean c(int i9, int i10, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        if (!z8) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f3599f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f3598e && !this.f3604d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z9) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i9 >= 0 && i10 >= 0) {
            synchronized (this) {
                try {
                    int i11 = this.b + 1;
                    this.b = i11;
                    if (i11 >= 50) {
                        this.b = 0;
                        int length = f3600g.list().length;
                        long b = b();
                        if (length < b) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f3603c = z11;
                        if (!z11 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b);
                        }
                    }
                    z10 = this.f3603c;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }
}
