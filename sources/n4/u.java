package n4;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f22440g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f22441h;

    /* renamed from: i, reason: collision with root package name */
    public static final File f22442i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile u f22443j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile int f22444k;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22445b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22446c;

    /* renamed from: d, reason: collision with root package name */
    public int f22447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22448e = true;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f22449f = new AtomicBoolean(false);

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (i10 < 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f22440g = z10;
        if (i10 < 26) {
            z11 = false;
        }
        f22441h = z11;
        f22442i = new File("/proc/self/fd");
        f22444k = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        if (r2 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f22448e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f22449f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L17
            goto L5b
        L17:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L45
            r2 = r1
            goto L5c
        L5b:
            r2 = r3
        L5c:
            if (r2 != 0) goto La1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L66
            r2 = r3
            goto L9e
        L66:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L9e:
            if (r2 != 0) goto La1
            goto La2
        La1:
            r1 = r3
        La2:
            r0.a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lb1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f22445b = r1
            r0.f22446c = r3
            goto Lb9
        Lb1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f22445b = r1
            r1 = 128(0x80, float:1.8E-43)
            r0.f22446c = r1
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.u.<init>():void");
    }

    public final boolean a(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f22441h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f22440g && !this.f22449f.get()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i13 = this.f22446c;
        if (i10 < i13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i11 < i13) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            int i14 = this.f22447d + 1;
            this.f22447d = i14;
            if (i14 >= 50) {
                this.f22447d = 0;
                int length = f22442i.list().length;
                if (f22444k != -1) {
                    i12 = f22444k;
                } else {
                    i12 = this.f22445b;
                }
                long j3 = i12;
                if (length < j3) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f22448e = z14;
                if (!z14 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j3);
                }
            }
            z13 = this.f22448e;
        }
        if (z13) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
