package jb;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class s implements Thread.UncaughtExceptionHandler {
    public final y7.q a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.l f19948b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f19949c;

    /* renamed from: d, reason: collision with root package name */
    public final gb.a f19950d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19951e = new AtomicBoolean(false);

    public s(y7.q qVar, m2.l lVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gb.a aVar) {
        this.a = qVar;
        this.f19948b = lVar;
        this.f19949c = uncaughtExceptionHandler;
        this.f19950d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        b6.a aVar = b6.a.f2288f;
        if (thread == null) {
            aVar.e("Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th2 == null) {
            aVar.e("Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (((gb.b) this.f19950d).b()) {
            aVar.d("Crashlytics will not record uncaught exception; native crash exists for session.", null);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r4.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3.d("Completed exception processing, but no default exception handler.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        java.lang.System.exit(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r3.d("Completed exception processing. Invoking default exception handler.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r2.uncaughtException(r11, r12);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "Completed exception processing, but no default exception handler."
            java.lang.Thread$UncaughtExceptionHandler r2 = r10.f19949c
            b6.a r3 = b6.a.f2288f
            java.util.concurrent.atomic.AtomicBoolean r4 = r10.f19951e
            r5 = 1
            r4.set(r5)
            r6 = 0
            r7 = 0
            boolean r8 = r10.a(r11, r12)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            if (r8 == 0) goto L1e
            y7.q r8 = r10.a     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            m2.l r9 = r10.f19948b     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r8.d(r9, r11, r12)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            goto L23
        L1e:
            java.lang.String r8 = "Uncaught exception will not be recorded by Crashlytics."
            r3.d(r8, r7)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
        L23:
            if (r2 == 0) goto L29
        L25:
            r3.d(r0, r7)
            goto L38
        L29:
            r3.d(r1, r7)
            goto L3c
        L2d:
            r8 = move-exception
            goto L43
        L2f:
            r8 = move-exception
            java.lang.String r9 = "An error occurred in the uncaught exception handler"
            r3.e(r9, r8)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L29
            goto L25
        L38:
            r2.uncaughtException(r11, r12)
            goto L3f
        L3c:
            java.lang.System.exit(r5)
        L3f:
            r4.set(r6)
            return
        L43:
            if (r2 == 0) goto L4c
            r3.d(r0, r7)
            r2.uncaughtException(r11, r12)
            goto L52
        L4c:
            r3.d(r1, r7)
            java.lang.System.exit(r5)
        L52:
            r4.set(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.s.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
