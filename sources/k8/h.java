package k8;

import G7.j;
import G7.w;
import O7.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import r8.k;
import r8.m;
import w8.A;
import w8.C2911a;
import w8.C2912b;
import w8.p;
import w8.s;
import w8.t;

/* loaded from: classes3.dex */
public final class h implements Closeable, Flushable {

    /* renamed from: v, reason: collision with root package name */
    public static final O7.e f21517v = new O7.e("[a-z0-9_-]{1,120}");

    /* renamed from: w, reason: collision with root package name */
    public static final String f21518w = "CLEAN";

    /* renamed from: x, reason: collision with root package name */
    public static final String f21519x = "DIRTY";

    /* renamed from: y, reason: collision with root package name */
    public static final String f21520y = "REMOVE";

    /* renamed from: z, reason: collision with root package name */
    public static final String f21521z = "READ";
    public final q8.a b;

    /* renamed from: c, reason: collision with root package name */
    public final File f21522c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21523d;

    /* renamed from: f, reason: collision with root package name */
    public final File f21524f;

    /* renamed from: g, reason: collision with root package name */
    public final File f21525g;

    /* renamed from: h, reason: collision with root package name */
    public final File f21526h;

    /* renamed from: i, reason: collision with root package name */
    public long f21527i;

    /* renamed from: j, reason: collision with root package name */
    public w8.g f21528j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f21529k;
    public int l;
    public boolean m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21530n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21531o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21532p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21533q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21534r;

    /* renamed from: s, reason: collision with root package name */
    public long f21535s;

    /* renamed from: t, reason: collision with root package name */
    public final l8.b f21536t;

    /* renamed from: u, reason: collision with root package name */
    public final g f21537u;

    public h(File file, long j7, l8.c cVar) {
        q8.a aVar = q8.a.f22806a;
        j.e(file, "directory");
        j.e(cVar, "taskRunner");
        this.b = aVar;
        this.f21522c = file;
        this.f21523d = j7;
        this.f21529k = new LinkedHashMap(0, 0.75f, true);
        this.f21536t = cVar.f();
        this.f21537u = new g(this, j.j(" Cache", j8.b.f21219g), 0);
        if (j7 > 0) {
            this.f21524f = new File(file, "journal");
            this.f21525g = new File(file, "journal.tmp");
            this.f21526h = new File(file, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void r(String str) {
        O7.e eVar = f21517v;
        eVar.getClass();
        j.e(str, "input");
        if (eVar.b.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void a() {
        if (!(!this.f21532p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final synchronized void b(H0.b bVar, boolean z8) {
        j.e(bVar, "editor");
        e eVar = (e) bVar.f1345c;
        if (j.a(eVar.f21508g, bVar)) {
            int i9 = 0;
            if (z8 && !eVar.f21506e) {
                int i10 = 0;
                while (i10 < 2) {
                    int i11 = i10 + 1;
                    boolean[] zArr = (boolean[]) bVar.f1346d;
                    j.b(zArr);
                    if (zArr[i10]) {
                        if (!this.b.c((File) eVar.f21505d.get(i10))) {
                            bVar.a();
                            return;
                        }
                        i10 = i11;
                    } else {
                        bVar.a();
                        throw new IllegalStateException(j.j(Integer.valueOf(i10), "Newly created entry didn't create value for index "));
                    }
                }
            }
            int i12 = 0;
            while (i12 < 2) {
                int i13 = i12 + 1;
                File file = (File) eVar.f21505d.get(i12);
                if (z8 && !eVar.f21507f) {
                    if (this.b.c(file)) {
                        File file2 = (File) eVar.f21504c.get(i12);
                        this.b.d(file, file2);
                        long j7 = eVar.b[i12];
                        this.b.getClass();
                        long length = file2.length();
                        eVar.b[i12] = length;
                        this.f21527i = (this.f21527i - j7) + length;
                    }
                } else {
                    this.b.a(file);
                }
                i12 = i13;
            }
            eVar.f21508g = null;
            if (eVar.f21507f) {
                p(eVar);
                return;
            }
            this.l++;
            w8.g gVar = this.f21528j;
            j.b(gVar);
            if (!eVar.f21506e && !z8) {
                this.f21529k.remove(eVar.f21503a);
                gVar.writeUtf8(f21520y).writeByte(32);
                gVar.writeUtf8(eVar.f21503a);
                gVar.writeByte(10);
                gVar.flush();
                if (this.f21527i <= this.f21523d || j()) {
                    this.f21536t.c(this.f21537u, 0L);
                }
                return;
            }
            eVar.f21506e = true;
            gVar.writeUtf8(f21518w).writeByte(32);
            gVar.writeUtf8(eVar.f21503a);
            s sVar = (s) gVar;
            long[] jArr = eVar.b;
            int length2 = jArr.length;
            while (i9 < length2) {
                long j9 = jArr[i9];
                i9++;
                sVar.writeByte(32);
                sVar.writeDecimalLong(j9);
            }
            gVar.writeByte(10);
            if (z8) {
                long j10 = this.f21535s;
                this.f21535s = 1 + j10;
                eVar.f21510i = j10;
            }
            gVar.flush();
            if (this.f21527i <= this.f21523d) {
            }
            this.f21536t.c(this.f21537u, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final synchronized H0.b c(long j7, String str) {
        H0.b bVar;
        try {
            j.e(str, "key");
            i();
            a();
            r(str);
            e eVar = (e) this.f21529k.get(str);
            if (j7 != -1 && (eVar == null || eVar.f21510i != j7)) {
                return null;
            }
            if (eVar == null) {
                bVar = null;
            } else {
                bVar = eVar.f21508g;
            }
            if (bVar != null) {
                return null;
            }
            if (eVar != null && eVar.f21509h != 0) {
                return null;
            }
            if (!this.f21533q && !this.f21534r) {
                w8.g gVar = this.f21528j;
                j.b(gVar);
                gVar.writeUtf8(f21519x).writeByte(32).writeUtf8(str).writeByte(10);
                gVar.flush();
                if (this.m) {
                    return null;
                }
                if (eVar == null) {
                    eVar = new e(this, str);
                    this.f21529k.put(str, eVar);
                }
                H0.b bVar2 = new H0.b(this, eVar);
                eVar.f21508g = bVar2;
                return bVar2;
            }
            this.f21536t.c(this.f21537u, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f21531o && !this.f21532p) {
                Collection values = this.f21529k.values();
                j.d(values, "lruEntries.values");
                int i9 = 0;
                Object[] array = values.toArray(new e[0]);
                if (array != null) {
                    e[] eVarArr = (e[]) array;
                    int length = eVarArr.length;
                    while (i9 < length) {
                        e eVar = eVarArr[i9];
                        i9++;
                        H0.b bVar = eVar.f21508g;
                        if (bVar != null && bVar != null) {
                            bVar.c();
                        }
                    }
                    q();
                    w8.g gVar = this.f21528j;
                    j.b(gVar);
                    gVar.close();
                    this.f21528j = null;
                    this.f21532p = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            this.f21532p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f21531o) {
            return;
        }
        a();
        q();
        w8.g gVar = this.f21528j;
        j.b(gVar);
        gVar.flush();
    }

    public final synchronized f h(String str) {
        j.e(str, "key");
        i();
        a();
        r(str);
        e eVar = (e) this.f21529k.get(str);
        if (eVar == null) {
            return null;
        }
        f a6 = eVar.a();
        if (a6 == null) {
            return null;
        }
        this.l++;
        w8.g gVar = this.f21528j;
        j.b(gVar);
        gVar.writeUtf8(f21521z).writeByte(32).writeUtf8(str).writeByte(10);
        if (j()) {
            this.f21536t.c(this.f21537u, 0L);
        }
        return a6;
    }

    public final synchronized void i() {
        boolean z8;
        try {
            byte[] bArr = j8.b.f21214a;
            if (this.f21531o) {
                return;
            }
            if (this.b.c(this.f21526h)) {
                if (this.b.c(this.f21524f)) {
                    this.b.a(this.f21526h);
                } else {
                    this.b.d(this.f21526h, this.f21524f);
                }
            }
            q8.a aVar = this.b;
            File file = this.f21526h;
            j.e(aVar, "<this>");
            j.e(file, "file");
            C2911a e4 = aVar.e(file);
            try {
                aVar.a(file);
                android.support.v4.media.session.a.f(e4, null);
                z8 = true;
            } catch (IOException unused) {
                android.support.v4.media.session.a.f(e4, null);
                aVar.a(file);
                z8 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    android.support.v4.media.session.a.f(e4, th);
                    throw th2;
                }
            }
            this.f21530n = z8;
            if (this.b.c(this.f21524f)) {
                try {
                    m();
                    l();
                    this.f21531o = true;
                    return;
                } catch (IOException e9) {
                    m mVar = m.f22950a;
                    m mVar2 = m.f22950a;
                    String str = "DiskLruCache " + this.f21522c + " is corrupt: " + ((Object) e9.getMessage()) + ", removing";
                    mVar2.getClass();
                    m.i(5, str, e9);
                    try {
                        close();
                        this.b.b(this.f21522c);
                        this.f21532p = false;
                    } catch (Throwable th3) {
                        this.f21532p = false;
                        throw th3;
                    }
                }
            }
            o();
            this.f21531o = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final boolean j() {
        int i9 = this.l;
        if (i9 >= 2000 && i9 >= this.f21529k.size()) {
            return true;
        }
        return false;
    }

    public final s k() {
        C2911a d2;
        this.b.getClass();
        File file = this.f21524f;
        j.e(file, "file");
        try {
            d2 = k.d(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            d2 = k.d(file);
        }
        return k.e(new i(d2, new w(this, 14)));
    }

    public final void l() {
        File file = this.f21525g;
        q8.a aVar = this.b;
        aVar.a(file);
        Iterator it = this.f21529k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            j.d(next, "i.next()");
            e eVar = (e) next;
            int i9 = 0;
            if (eVar.f21508g == null) {
                while (i9 < 2) {
                    this.f21527i += eVar.b[i9];
                    i9++;
                }
            } else {
                eVar.f21508g = null;
                while (i9 < 2) {
                    aVar.a((File) eVar.f21504c.get(i9));
                    aVar.a((File) eVar.f21505d.get(i9));
                    i9++;
                }
                it.remove();
            }
        }
    }

    public final void m() {
        File file = this.f21524f;
        this.b.getClass();
        j.e(file, "file");
        Logger logger = p.f24030a;
        t f9 = k.f(new C2912b(new FileInputStream(file), A.f23999d));
        try {
            String readUtf8LineStrict = f9.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict2 = f9.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict3 = f9.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict4 = f9.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict5 = f9.readUtf8LineStrict(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(readUtf8LineStrict) && "1".equals(readUtf8LineStrict2) && j.a(String.valueOf(201105), readUtf8LineStrict3) && j.a(String.valueOf(2), readUtf8LineStrict4) && readUtf8LineStrict5.length() <= 0) {
                int i9 = 0;
                while (true) {
                    try {
                        n(f9.readUtf8LineStrict(Long.MAX_VALUE));
                        i9++;
                    } catch (EOFException unused) {
                        this.l = i9 - this.f21529k.size();
                        if (!f9.exhausted()) {
                            o();
                        } else {
                            this.f21528j = k();
                        }
                        android.support.v4.media.session.a.f(f9, null);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + ']');
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                android.support.v4.media.session.a.f(f9, th);
                throw th2;
            }
        }
    }

    public final void n(String str) {
        String substring;
        int i9 = 0;
        int I5 = O7.g.I(str, ' ', 0, false, 6);
        if (I5 != -1) {
            int i10 = I5 + 1;
            int I7 = O7.g.I(str, ' ', i10, false, 4);
            LinkedHashMap linkedHashMap = this.f21529k;
            if (I7 == -1) {
                substring = str.substring(i10);
                j.d(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = f21520y;
                if (I5 == str2.length() && o.C(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, I7);
                j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            e eVar = (e) linkedHashMap.get(substring);
            if (eVar == null) {
                eVar = new e(this, substring);
                linkedHashMap.put(substring, eVar);
            }
            if (I7 != -1) {
                String str3 = f21518w;
                if (I5 == str3.length() && o.C(str, str3, false)) {
                    String substring2 = str.substring(I7 + 1);
                    j.d(substring2, "this as java.lang.String).substring(startIndex)");
                    List U8 = O7.g.U(substring2, new char[]{' '});
                    eVar.f21506e = true;
                    eVar.f21508g = null;
                    int size = U8.size();
                    eVar.f21511j.getClass();
                    if (size == 2) {
                        try {
                            int size2 = U8.size();
                            while (i9 < size2) {
                                int i11 = i9 + 1;
                                eVar.b[i9] = Long.parseLong((String) U8.get(i9));
                                i9 = i11;
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException(j.j(U8, "unexpected journal line: "));
                        }
                    }
                    throw new IOException(j.j(U8, "unexpected journal line: "));
                }
            }
            if (I7 == -1) {
                String str4 = f21519x;
                if (I5 == str4.length() && o.C(str, str4, false)) {
                    eVar.f21508g = new H0.b(this, eVar);
                    return;
                }
            }
            if (I7 == -1) {
                String str5 = f21521z;
                if (I5 == str5.length() && o.C(str, str5, false)) {
                    return;
                }
            }
            throw new IOException(j.j(str, "unexpected journal line: "));
        }
        throw new IOException(j.j(str, "unexpected journal line: "));
    }

    public final synchronized void o() {
        try {
            w8.g gVar = this.f21528j;
            if (gVar != null) {
                gVar.close();
            }
            s e4 = k.e(this.b.e(this.f21525g));
            try {
                e4.writeUtf8("libcore.io.DiskLruCache");
                e4.writeByte(10);
                e4.writeUtf8("1");
                e4.writeByte(10);
                e4.writeDecimalLong(201105);
                e4.writeByte(10);
                e4.writeDecimalLong(2);
                e4.writeByte(10);
                e4.writeByte(10);
                Iterator it = this.f21529k.values().iterator();
                while (true) {
                    int i9 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    e eVar = (e) it.next();
                    if (eVar.f21508g != null) {
                        e4.writeUtf8(f21519x);
                        e4.writeByte(32);
                        e4.writeUtf8(eVar.f21503a);
                        e4.writeByte(10);
                    } else {
                        e4.writeUtf8(f21518w);
                        e4.writeByte(32);
                        e4.writeUtf8(eVar.f21503a);
                        long[] jArr = eVar.b;
                        int length = jArr.length;
                        while (i9 < length) {
                            long j7 = jArr[i9];
                            i9++;
                            e4.writeByte(32);
                            e4.writeDecimalLong(j7);
                        }
                        e4.writeByte(10);
                    }
                }
                android.support.v4.media.session.a.f(e4, null);
                if (this.b.c(this.f21524f)) {
                    this.b.d(this.f21524f, this.f21526h);
                }
                this.b.d(this.f21525g, this.f21524f);
                this.b.a(this.f21526h);
                this.f21528j = k();
                this.m = false;
                this.f21534r = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p(e eVar) {
        w8.g gVar;
        j.e(eVar, "entry");
        boolean z8 = this.f21530n;
        String str = eVar.f21503a;
        if (!z8) {
            if (eVar.f21509h > 0 && (gVar = this.f21528j) != null) {
                gVar.writeUtf8(f21519x);
                gVar.writeByte(32);
                gVar.writeUtf8(str);
                gVar.writeByte(10);
                gVar.flush();
            }
            if (eVar.f21509h > 0 || eVar.f21508g != null) {
                eVar.f21507f = true;
                return;
            }
        }
        H0.b bVar = eVar.f21508g;
        if (bVar != null) {
            bVar.c();
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.b.a((File) eVar.f21504c.get(i9));
            long j7 = this.f21527i;
            long[] jArr = eVar.b;
            this.f21527i = j7 - jArr[i9];
            jArr[i9] = 0;
        }
        this.l++;
        w8.g gVar2 = this.f21528j;
        if (gVar2 != null) {
            gVar2.writeUtf8(f21520y);
            gVar2.writeByte(32);
            gVar2.writeUtf8(str);
            gVar2.writeByte(10);
        }
        this.f21529k.remove(str);
        if (j()) {
            this.f21536t.c(this.f21537u, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        p(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f21527i
            long r2 = r4.f21523d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f21529k
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            k8.e r1 = (k8.e) r1
            boolean r2 = r1.f21507f
            if (r2 != 0) goto L12
            r4.p(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f21533q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.h.q():void");
    }
}
