package lb;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class m implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f21321f = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public final File f21322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21323c = C.DEFAULT_BUFFER_SEGMENT_SIZE;

    /* renamed from: d, reason: collision with root package name */
    public k f21324d;

    public m(File file) {
        this.f21322b = file;
    }

    @Override // lb.c
    public final void a() {
        jb.g.c(this.f21324d, "There was a problem closing the Crashlytics log file.");
        this.f21324d = null;
    }

    public final void b() {
        File file = this.f21322b;
        if (this.f21324d == null) {
            try {
                this.f21324d = new k(file);
            } catch (IOException e2) {
                b6.a.f2288f.e("Could not open log file: " + file, e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // lb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            java.io.File r0 = r7.f21322b
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            r7.b()
            lb.k r0 = r7.f21324d
            if (r0 != 0) goto L14
        L12:
            r4 = r1
            goto L39
        L14:
            r3 = 1
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r0 = r0.t()
            byte[] r0 = new byte[r0]
            lb.k r4 = r7.f21324d     // Catch: java.io.IOException -> L2a
            com.google.common.collect.c1 r5 = new com.google.common.collect.c1     // Catch: java.io.IOException -> L2a
            r5.<init>(r7, r0, r3)     // Catch: java.io.IOException -> L2a
            r4.j(r5)     // Catch: java.io.IOException -> L2a
            goto L32
        L2a:
            r4 = move-exception
            b6.a r5 = b6.a.f2288f
            java.lang.String r6 = "A problem occurred while reading the Crashlytics log file."
            r5.e(r6, r4)
        L32:
            lb.l r4 = new lb.l
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L39:
            if (r4 != 0) goto L3d
            r3 = r1
            goto L46
        L3d:
            int r0 = r4.f21320b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L46:
            if (r3 == 0) goto L4f
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = lb.m.f21321f
            r1.<init>(r3, r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.m.e():java.lang.String");
    }

    @Override // lb.c
    public final void h(long j3, String str) {
        boolean z10;
        b();
        int i10 = this.f21323c;
        if (this.f21324d != null) {
            if (str == null) {
                str = AbstractJsonLexerKt.NULL;
            }
            try {
                int i11 = i10 / 4;
                if (str.length() > i11) {
                    str = "..." + str.substring(str.length() - i11);
                }
                this.f21324d.d(String.format(Locale.US, "%d %s%n", Long.valueOf(j3), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f21321f));
                while (true) {
                    k kVar = this.f21324d;
                    synchronized (kVar) {
                        if (kVar.f21316d == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10 && this.f21324d.t() > i10) {
                        this.f21324d.q();
                    } else {
                        return;
                    }
                }
            } catch (IOException e2) {
                b6.a.f2288f.e("There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }
}
