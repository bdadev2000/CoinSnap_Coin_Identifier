package v4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import u4.AbstractC2762g;

/* loaded from: classes2.dex */
public final class l implements InterfaceC2851c {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f23627f = Charset.forName("UTF-8");
    public final File b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23628c = 65536;

    /* renamed from: d, reason: collision with root package name */
    public k f23629d;

    public l(File file) {
        this.b = file;
    }

    @Override // v4.InterfaceC2851c
    public final void a() {
        AbstractC2762g.c(this.f23629d, "There was a problem closing the Crashlytics log file.");
        this.f23629d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // v4.InterfaceC2851c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            java.io.File r0 = r7.b
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L38
        Lc:
            r7.d()
            v4.k r0 = r7.f23629d
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.m()
            byte[] r0 = new byte[r0]
            v4.k r4 = r7.f23629d     // Catch: java.io.IOException -> L29
            v4.e r5 = new v4.e     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.c(r5)     // Catch: java.io.IOException -> L29
            goto L31
        L29:
            r4 = move-exception
            java.lang.String r5 = "FirebaseCrashlytics"
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            android.util.Log.e(r5, r6, r4)
        L31:
            J5.b r4 = new J5.b
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L38:
            if (r4 != 0) goto L3c
            r3 = r1
            goto L45
        L3c:
            int r0 = r4.b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f1592a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L45:
            if (r3 == 0) goto L4e
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = v4.l.f23627f
            r1.<init>(r3, r0)
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.l.b():java.lang.String");
    }

    @Override // v4.InterfaceC2851c
    public final void c(long j7, String str) {
        boolean z8;
        d();
        int i9 = this.f23628c;
        if (this.f23629d != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i10 = i9 / 4;
                if (str.length() > i10) {
                    str = "..." + str.substring(str.length() - i10);
                }
                this.f23629d.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j7), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f23627f));
                while (true) {
                    k kVar = this.f23629d;
                    synchronized (kVar) {
                        if (kVar.f23623d == 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    }
                    if (!z8 && this.f23629d.m() > i9) {
                        this.f23629d.j();
                    } else {
                        return;
                    }
                }
            } catch (IOException e4) {
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e4);
            }
        }
    }

    public final void d() {
        File file = this.b;
        if (this.f23629d == null) {
            try {
                this.f23629d = new k(file);
            } catch (IOException e4) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e4);
            }
        }
    }
}
