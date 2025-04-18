package o9;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.adjust.sdk.Constants;
import n9.h0;

/* loaded from: classes3.dex */
public final class l extends Surface {

    /* renamed from: f, reason: collision with root package name */
    public static int f23230f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f23231g;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23232b;

    /* renamed from: c, reason: collision with root package name */
    public final k f23233c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23234d;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f23233c = kVar;
        this.f23232b = z10;
    }

    public static int a(Context context) {
        boolean z10;
        String eglQueryString;
        String eglQueryString2;
        int i10 = h0.a;
        boolean z11 = false;
        if (i10 >= 24 && ((i10 >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(h0.f22545c) && !"XT1650".equals(h0.f22546d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        if (i10 >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z11 = true;
        }
        if (z11) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o9.l b(android.content.Context r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<o9.l> r2 = o9.l.class
            monitor-enter(r2)
            boolean r3 = o9.l.f23231g     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L13
            int r4 = a(r4)     // Catch: java.lang.Throwable -> L20
            o9.l.f23230f = r4     // Catch: java.lang.Throwable -> L20
            o9.l.f23231g = r0     // Catch: java.lang.Throwable -> L20
        L13:
            int r4 = o9.l.f23230f     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L19
            r4 = r0
            goto L1a
        L19:
            r4 = r1
        L1a:
            monitor-exit(r2)
            if (r4 == 0) goto L1e
            goto L23
        L1e:
            r4 = r1
            goto L24
        L20:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L23:
            r4 = r0
        L24:
            v8.u0.m(r4)
            o9.k r4 = new o9.k
            r4.<init>()
            if (r5 == 0) goto L31
            int r5 = o9.l.f23230f
            goto L32
        L31:
            r5 = r1
        L32:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.f23226c = r2
            n9.e r3 = new n9.e
            r3.<init>(r2)
            r4.f23225b = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.f23226c     // Catch: java.lang.Throwable -> L7d
            android.os.Message r5 = r2.obtainMessage(r0, r5, r1)     // Catch: java.lang.Throwable -> L7d
            r5.sendToTarget()     // Catch: java.lang.Throwable -> L7d
        L51:
            o9.l r5 = r4.f23229g     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.RuntimeException r5 = r4.f23228f     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            java.lang.Error r5 = r4.f23227d     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L63
            r4.wait()     // Catch: java.lang.InterruptedException -> L61 java.lang.Throwable -> L7d
            goto L51
        L61:
            r1 = r0
            goto L51
        L63:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L6d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L6d:
            java.lang.RuntimeException r5 = r4.f23228f
            if (r5 != 0) goto L7c
            java.lang.Error r5 = r4.f23227d
            if (r5 != 0) goto L7b
            o9.l r4 = r4.f23229g
            r4.getClass()
            return r4
        L7b:
            throw r5
        L7c:
            throw r5
        L7d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.l.b(android.content.Context, boolean):o9.l");
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f23233c) {
            if (!this.f23234d) {
                k kVar = this.f23233c;
                kVar.f23226c.getClass();
                kVar.f23226c.sendEmptyMessage(2);
                this.f23234d = true;
            }
        }
    }
}
