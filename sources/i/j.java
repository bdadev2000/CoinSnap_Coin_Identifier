package i;

import b1.f0;
import com.facebook.appevents.AppEventsConstants;
import d0.b0;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.q;
import okio.BufferedSink;
import okio.FileSystem;
import okio.ForwardingFileSystem;
import okio.Okio;
import okio.Path;

/* loaded from: classes3.dex */
public final class j implements Closeable, Flushable {

    /* renamed from: r, reason: collision with root package name */
    public static final z0.h f30784r = new z0.h("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final Path f30785a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30786b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f30787c;
    public final Path d;

    /* renamed from: f, reason: collision with root package name */
    public final Path f30788f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f30789g;

    /* renamed from: h, reason: collision with root package name */
    public final g1.f f30790h;

    /* renamed from: i, reason: collision with root package name */
    public long f30791i;

    /* renamed from: j, reason: collision with root package name */
    public int f30792j;

    /* renamed from: k, reason: collision with root package name */
    public BufferedSink f30793k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30794l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30795m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30796n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30797o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30798p;

    /* renamed from: q, reason: collision with root package name */
    public final g f30799q;

    /* JADX WARN: Type inference failed for: r4v8, types: [okio.ForwardingFileSystem, i.g] */
    public j(FileSystem fileSystem, Path path, h1.c cVar, long j2) {
        this.f30785a = path;
        this.f30786b = j2;
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f30787c = path.resolve("journal");
        this.d = path.resolve("journal.tmp");
        this.f30788f = path.resolve("journal.bkp");
        this.f30789g = new LinkedHashMap(0, 0.75f, true);
        this.f30790h = p0.a.c(f0.y(p0.a.d(), cVar.k0(1)));
        this.f30799q = new ForwardingFileSystem(fileSystem);
    }

    public static void B(String str) {
        z0.h hVar = f30784r;
        hVar.getClass();
        p0.a.s(str, "input");
        if (hVar.f31477a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static final void a(j jVar, d dVar, boolean z2) {
        synchronized (jVar) {
            e eVar = dVar.f30768a;
            if (!p0.a.g(eVar.f30775g, dVar)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!z2 || eVar.f30774f) {
                for (int i2 = 0; i2 < 2; i2++) {
                    jVar.f30799q.delete((Path) eVar.d.get(i2));
                }
            } else {
                for (int i3 = 0; i3 < 2; i3++) {
                    if (dVar.f30770c[i3] && !jVar.f30799q.exists((Path) eVar.d.get(i3))) {
                        dVar.a(false);
                        return;
                    }
                }
                for (int i4 = 0; i4 < 2; i4++) {
                    Path path = (Path) eVar.d.get(i4);
                    Path path2 = (Path) eVar.f30773c.get(i4);
                    if (jVar.f30799q.exists(path)) {
                        jVar.f30799q.atomicMove(path, path2);
                    } else {
                        g gVar = jVar.f30799q;
                        Path path3 = (Path) eVar.f30773c.get(i4);
                        if (!gVar.exists(path3)) {
                            v.g.a(gVar.sink(path3));
                        }
                    }
                    long j2 = eVar.f30772b[i4];
                    Long size = jVar.f30799q.metadata(path2).getSize();
                    long longValue = size != null ? size.longValue() : 0L;
                    eVar.f30772b[i4] = longValue;
                    jVar.f30791i = (jVar.f30791i - j2) + longValue;
                }
            }
            eVar.f30775g = null;
            if (eVar.f30774f) {
                jVar.v(eVar);
                return;
            }
            jVar.f30792j++;
            BufferedSink bufferedSink = jVar.f30793k;
            p0.a.p(bufferedSink);
            if (!z2 && !eVar.e) {
                jVar.f30789g.remove(eVar.f30771a);
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(eVar.f30771a);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (jVar.f30791i <= jVar.f30786b || jVar.f30792j >= 2000) {
                    jVar.n();
                }
            }
            eVar.e = true;
            bufferedSink.writeUtf8("CLEAN");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(eVar.f30771a);
            for (long j3 : eVar.f30772b) {
                bufferedSink.writeByte(32).writeDecimalLong(j3);
            }
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (jVar.f30791i <= jVar.f30786b) {
            }
            jVar.n();
        }
    }

    public final synchronized void D() {
        b0 b0Var;
        try {
            BufferedSink bufferedSink = this.f30793k;
            if (bufferedSink != null) {
                bufferedSink.close();
            }
            int i2 = 0;
            BufferedSink buffer = Okio.buffer(this.f30799q.sink(this.d, false));
            Throwable th = null;
            try {
                buffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                buffer.writeUtf8(AppEventsConstants.EVENT_PARAM_VALUE_YES).writeByte(10);
                buffer.writeDecimalLong(1).writeByte(10);
                buffer.writeDecimalLong(2).writeByte(10);
                buffer.writeByte(10);
                for (e eVar : this.f30789g.values()) {
                    if (eVar.f30775g != null) {
                        buffer.writeUtf8("DIRTY");
                        buffer.writeByte(32);
                        buffer.writeUtf8(eVar.f30771a);
                        buffer.writeByte(10);
                    } else {
                        buffer.writeUtf8("CLEAN");
                        buffer.writeByte(32);
                        buffer.writeUtf8(eVar.f30771a);
                        for (long j2 : eVar.f30772b) {
                            buffer.writeByte(32).writeDecimalLong(j2);
                        }
                        buffer.writeByte(10);
                    }
                }
                b0Var = b0.f30125a;
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        q.a(th3, th4);
                    }
                }
                b0Var = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            p0.a.p(b0Var);
            if (this.f30799q.exists(this.f30787c)) {
                this.f30799q.atomicMove(this.f30787c, this.f30788f);
                this.f30799q.atomicMove(this.d, this.f30787c);
                this.f30799q.delete(this.f30788f);
            } else {
                this.f30799q.atomicMove(this.d, this.f30787c);
            }
            this.f30793k = Okio.buffer(new k(this.f30799q.appendingSink(this.f30787c), new i(this, i2)));
            this.f30792j = 0;
            this.f30794l = false;
            this.f30798p = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void c() {
        if (!(!this.f30796n)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f30795m && !this.f30796n) {
                for (e eVar : (e[]) this.f30789g.values().toArray(new e[0])) {
                    d dVar = eVar.f30775g;
                    if (dVar != null) {
                        e eVar2 = dVar.f30768a;
                        if (p0.a.g(eVar2.f30775g, dVar)) {
                            eVar2.f30774f = true;
                        }
                    }
                }
                y();
                p0.a.m(this.f30790h, null);
                BufferedSink bufferedSink = this.f30793k;
                p0.a.p(bufferedSink);
                bufferedSink.close();
                this.f30793k = null;
                this.f30796n = true;
                return;
            }
            this.f30796n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized d e(String str) {
        try {
            c();
            B(str);
            i();
            e eVar = (e) this.f30789g.get(str);
            if ((eVar != null ? eVar.f30775g : null) != null) {
                return null;
            }
            if (eVar != null && eVar.f30776h != 0) {
                return null;
            }
            if (!this.f30797o && !this.f30798p) {
                BufferedSink bufferedSink = this.f30793k;
                p0.a.p(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f30794l) {
                    return null;
                }
                if (eVar == null) {
                    eVar = new e(this, str);
                    this.f30789g.put(str, eVar);
                }
                d dVar = new d(this, eVar);
                eVar.f30775g = dVar;
                return dVar;
            }
            n();
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f30795m) {
            c();
            y();
            BufferedSink bufferedSink = this.f30793k;
            p0.a.p(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final synchronized f h(String str) {
        f a2;
        c();
        B(str);
        i();
        e eVar = (e) this.f30789g.get(str);
        if (eVar != null && (a2 = eVar.a()) != null) {
            this.f30792j++;
            BufferedSink bufferedSink = this.f30793k;
            p0.a.p(bufferedSink);
            bufferedSink.writeUtf8("READ");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            if (this.f30792j >= 2000) {
                n();
            }
            return a2;
        }
        return null;
    }

    public final synchronized void i() {
        try {
            if (this.f30795m) {
                return;
            }
            this.f30799q.delete(this.d);
            if (this.f30799q.exists(this.f30788f)) {
                if (this.f30799q.exists(this.f30787c)) {
                    this.f30799q.delete(this.f30788f);
                } else {
                    this.f30799q.atomicMove(this.f30788f, this.f30787c);
                }
            }
            if (this.f30799q.exists(this.f30787c)) {
                try {
                    s();
                    o();
                    this.f30795m = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        f0.k(this.f30799q, this.f30785a);
                        this.f30796n = false;
                    } catch (Throwable th) {
                        this.f30796n = false;
                        throw th;
                    }
                }
            }
            D();
            this.f30795m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void n() {
        kotlin.jvm.internal.e.v(this.f30790h, null, 0, new h(this, null), 3);
    }

    public final void o() {
        Iterator it = this.f30789g.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i2 = 0;
            if (eVar.f30775g == null) {
                while (i2 < 2) {
                    j2 += eVar.f30772b[i2];
                    i2++;
                }
            } else {
                eVar.f30775g = null;
                while (i2 < 2) {
                    Path path = (Path) eVar.f30773c.get(i2);
                    g gVar = this.f30799q;
                    gVar.delete(path);
                    gVar.delete((Path) eVar.d.get(i2));
                    i2++;
                }
                it.remove();
            }
        }
        this.f30791i = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            r13 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            i.g r2 = r13.f30799q
            okio.Path r3 = r13.f30787c
            okio.Source r4 = r2.source(r3)
            okio.BufferedSource r4 = okio.Okio.buffer(r4)
            r5 = 0
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r11 = "libcore.io.DiskLruCache"
            boolean r11 = p0.a.g(r11, r6)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L8e
            java.lang.String r11 = "1"
            boolean r11 = p0.a.g(r11, r7)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L8e
            r11 = 1
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5d
            boolean r11 = p0.a.g(r11, r8)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L8e
            r11 = 2
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5d
            boolean r11 = p0.a.g(r11, r9)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L8e
            int r11 = r10.length()     // Catch: java.lang.Throwable -> L5d
            if (r11 > 0) goto L8e
            r0 = 0
            r1 = r0
        L53:
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            r13.u(r6)     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            int r1 = r1 + 1
            goto L53
        L5d:
            r0 = move-exception
            goto Lbd
        L5f:
            java.util.LinkedHashMap r6 = r13.f30789g     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 - r6
            r13.f30792j = r1     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r4.exhausted()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L72
            r13.D()     // Catch: java.lang.Throwable -> L5d
            goto L86
        L72:
            okio.Sink r1 = r2.appendingSink(r3)     // Catch: java.lang.Throwable -> L5d
            i.k r2 = new i.k     // Catch: java.lang.Throwable -> L5d
            i.i r3 = new i.i     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r13, r0)     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L5d
            okio.BufferedSink r0 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> L5d
            r13.f30793k = r0     // Catch: java.lang.Throwable -> L5d
        L86:
            d0.b0 r0 = d0.b0.f30125a     // Catch: java.lang.Throwable -> L5d
            r4.close()     // Catch: java.lang.Throwable -> L8c
            goto Lca
        L8c:
            r5 = move-exception
            goto Lca
        L8e:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r3.append(r6)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r7)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r8)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r9)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r10)     // Catch: java.lang.Throwable -> L5d
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r2     // Catch: java.lang.Throwable -> L5d
        Lbd:
            if (r4 == 0) goto Lc7
            r4.close()     // Catch: java.lang.Throwable -> Lc3
            goto Lc7
        Lc3:
            r1 = move-exception
            kotlin.jvm.internal.q.a(r0, r1)
        Lc7:
            r12 = r5
            r5 = r0
            r0 = r12
        Lca:
            if (r5 != 0) goto Ld0
            p0.a.p(r0)
            return
        Ld0:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.j.s():void");
    }

    public final void u(String str) {
        String substring;
        int W0 = z0.m.W0(str, ' ', 0, false, 6);
        if (W0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i2 = W0 + 1;
        int W02 = z0.m.W0(str, ' ', i2, false, 4);
        LinkedHashMap linkedHashMap = this.f30789g;
        if (W02 == -1) {
            substring = str.substring(i2);
            p0.a.r(substring, "substring(...)");
            if (W0 == 6 && z0.m.q1(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i2, W02);
            p0.a.r(substring, "substring(...)");
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new e(this, substring);
            linkedHashMap.put(substring, obj);
        }
        e eVar = (e) obj;
        if (W02 == -1 || W0 != 5 || !z0.m.q1(str, "CLEAN", false)) {
            if (W02 == -1 && W0 == 5 && z0.m.q1(str, "DIRTY", false)) {
                eVar.f30775g = new d(this, eVar);
                return;
            } else {
                if (W02 != -1 || W0 != 4 || !z0.m.q1(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String substring2 = str.substring(W02 + 1);
        p0.a.r(substring2, "substring(...)");
        List n12 = z0.m.n1(substring2, new char[]{' '});
        eVar.e = true;
        eVar.f30775g = null;
        int size = n12.size();
        eVar.f30777i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + n12);
        }
        try {
            int size2 = n12.size();
            for (int i3 = 0; i3 < size2; i3++) {
                eVar.f30772b[i3] = Long.parseLong((String) n12.get(i3));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + n12);
        }
    }

    public final void v(e eVar) {
        BufferedSink bufferedSink;
        int i2 = eVar.f30776h;
        String str = eVar.f30771a;
        if (i2 > 0 && (bufferedSink = this.f30793k) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (eVar.f30776h > 0 || eVar.f30775g != null) {
            eVar.f30774f = true;
            return;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            this.f30799q.delete((Path) eVar.f30773c.get(i3));
            long j2 = this.f30791i;
            long[] jArr = eVar.f30772b;
            this.f30791i = j2 - jArr[i3];
            jArr[i3] = 0;
        }
        this.f30792j++;
        BufferedSink bufferedSink2 = this.f30793k;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(str);
            bufferedSink2.writeByte(10);
        }
        this.f30789g.remove(str);
        if (this.f30792j >= 2000) {
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        v(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f30791i
            long r2 = r4.f30786b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f30789g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            i.e r1 = (i.e) r1
            boolean r2 = r1.f30774f
            if (r2 != 0) goto L12
            r4.v(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f30797o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.j.y():void");
    }
}
