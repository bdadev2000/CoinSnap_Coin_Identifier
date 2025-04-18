package zh;

import gi.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ki.a0;
import ki.d0;
import ki.e0;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import y0.p0;

/* loaded from: classes5.dex */
public final class j implements Closeable, Flushable {

    /* renamed from: b, reason: collision with root package name */
    public final fi.b f28805b;

    /* renamed from: c, reason: collision with root package name */
    public final File f28806c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28807d;

    /* renamed from: f, reason: collision with root package name */
    public final int f28808f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28809g;

    /* renamed from: h, reason: collision with root package name */
    public final File f28810h;

    /* renamed from: i, reason: collision with root package name */
    public final File f28811i;

    /* renamed from: j, reason: collision with root package name */
    public final File f28812j;

    /* renamed from: k, reason: collision with root package name */
    public long f28813k;

    /* renamed from: l, reason: collision with root package name */
    public ki.j f28814l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f28815m;

    /* renamed from: n, reason: collision with root package name */
    public int f28816n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28817o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28818p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28819q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f28820r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f28821s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28822t;
    public long u;

    /* renamed from: v, reason: collision with root package name */
    public final ai.c f28823v;

    /* renamed from: w, reason: collision with root package name */
    public final i f28824w;

    /* renamed from: x, reason: collision with root package name */
    public static final Regex f28802x = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: y, reason: collision with root package name */
    public static final String f28803y = "CLEAN";

    /* renamed from: z, reason: collision with root package name */
    public static final String f28804z = "DIRTY";
    public static final String A = "REMOVE";
    public static final String B = "READ";

    public j(File directory, long j3, ai.f taskRunner) {
        fi.a fileSystem = fi.b.a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f28805b = fileSystem;
        this.f28806c = directory;
        this.f28807d = 201105;
        this.f28808f = 2;
        this.f28809g = j3;
        this.f28815m = new LinkedHashMap(0, 0.75f, true);
        this.f28823v = taskRunner.f();
        this.f28824w = new i(0, this, Intrinsics.stringPlus(xh.b.f27682g, " Cache"));
        if ((j3 > 0 ? 1 : 0) != 0) {
            this.f28810h = new File(directory, "journal");
            this.f28811i = new File(directory, "journal.tmp");
            this.f28812j = new File(directory, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void T(String str) {
        if (f28802x.matches(str)) {
        } else {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f28819q && !this.f28820r) {
            Collection values = this.f28815m.values();
            Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
            int i10 = 0;
            Object[] array = values.toArray(new g[0]);
            if (array != null) {
                g[] gVarArr = (g[]) array;
                int length = gVarArr.length;
                while (i10 < length) {
                    g gVar = gVarArr[i10];
                    i10++;
                    h3.a aVar = gVar.f28792g;
                    if (aVar != null && aVar != null) {
                        aVar.e();
                    }
                }
                x();
                ki.j jVar = this.f28814l;
                Intrinsics.checkNotNull(jVar);
                jVar.close();
                this.f28814l = null;
                this.f28820r = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.f28820r = true;
    }

    public final synchronized void d() {
        if (!(!this.f28820r)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f28819q) {
            return;
        }
        d();
        x();
        ki.j jVar = this.f28814l;
        Intrinsics.checkNotNull(jVar);
        jVar.flush();
    }

    public final synchronized void g(h3.a editor, boolean z10) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        g gVar = (g) editor.f18723d;
        if (Intrinsics.areEqual(gVar.f28792g, editor)) {
            int i10 = 0;
            if (z10 && !gVar.f28790e) {
                int i11 = this.f28808f;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    boolean[] zArr = (boolean[]) editor.f18724f;
                    Intrinsics.checkNotNull(zArr);
                    if (zArr[i12]) {
                        if (!((fi.a) this.f28805b).c((File) gVar.f28789d.get(i12))) {
                            editor.a();
                            return;
                        }
                        i12 = i13;
                    } else {
                        editor.a();
                        throw new IllegalStateException(Intrinsics.stringPlus("Newly created entry didn't create value for index ", Integer.valueOf(i12)));
                    }
                }
            }
            int i14 = this.f28808f;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15 + 1;
                File file = (File) gVar.f28789d.get(i15);
                if (z10 && !gVar.f28791f) {
                    if (((fi.a) this.f28805b).c(file)) {
                        File file2 = (File) gVar.f28788c.get(i15);
                        ((fi.a) this.f28805b).d(file, file2);
                        long j3 = gVar.f28787b[i15];
                        ((fi.a) this.f28805b).getClass();
                        Intrinsics.checkNotNullParameter(file2, "file");
                        long length = file2.length();
                        gVar.f28787b[i15] = length;
                        this.f28813k = (this.f28813k - j3) + length;
                    }
                } else {
                    ((fi.a) this.f28805b).a(file);
                }
                i15 = i16;
            }
            gVar.f28792g = null;
            if (gVar.f28791f) {
                w(gVar);
                return;
            }
            this.f28816n++;
            ki.j writer = this.f28814l;
            Intrinsics.checkNotNull(writer);
            if (!gVar.f28790e && !z10) {
                this.f28815m.remove(gVar.a);
                writer.writeUtf8(A).writeByte(32);
                writer.writeUtf8(gVar.a);
                writer.writeByte(10);
                writer.flush();
                if (this.f28813k <= this.f28809g || q()) {
                    this.f28823v.c(this.f28824w, 0L);
                }
                return;
            }
            gVar.f28790e = true;
            writer.writeUtf8(f28803y).writeByte(32);
            writer.writeUtf8(gVar.a);
            Intrinsics.checkNotNullParameter(writer, "writer");
            long[] jArr = gVar.f28787b;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                i10++;
                writer.writeByte(32).writeDecimalLong(j10);
            }
            writer.writeByte(10);
            if (z10) {
                long j11 = this.u;
                this.u = 1 + j11;
                gVar.f28794i = j11;
            }
            writer.flush();
            if (this.f28813k <= this.f28809g) {
            }
            this.f28823v.c(this.f28824w, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final synchronized h3.a j(long j3, String key) {
        h3.a aVar;
        Intrinsics.checkNotNullParameter(key, "key");
        p();
        d();
        T(key);
        g gVar = (g) this.f28815m.get(key);
        if (j3 != -1 && (gVar == null || gVar.f28794i != j3)) {
            return null;
        }
        if (gVar == null) {
            aVar = null;
        } else {
            aVar = gVar.f28792g;
        }
        if (aVar != null) {
            return null;
        }
        if (gVar != null && gVar.f28793h != 0) {
            return null;
        }
        if (!this.f28821s && !this.f28822t) {
            ki.j jVar = this.f28814l;
            Intrinsics.checkNotNull(jVar);
            jVar.writeUtf8(f28804z).writeByte(32).writeUtf8(key).writeByte(10);
            jVar.flush();
            if (this.f28817o) {
                return null;
            }
            if (gVar == null) {
                gVar = new g(this, key);
                this.f28815m.put(key, gVar);
            }
            h3.a aVar2 = new h3.a(this, gVar);
            gVar.f28792g = aVar2;
            return aVar2;
        }
        this.f28823v.c(this.f28824w, 0L);
        return null;
    }

    public final synchronized h k(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        p();
        d();
        T(key);
        g gVar = (g) this.f28815m.get(key);
        if (gVar == null) {
            return null;
        }
        h a = gVar.a();
        if (a == null) {
            return null;
        }
        this.f28816n++;
        ki.j jVar = this.f28814l;
        Intrinsics.checkNotNull(jVar);
        jVar.writeUtf8(B).writeByte(32).writeUtf8(key).writeByte(10);
        if (q()) {
            this.f28823v.c(this.f28824w, 0L);
        }
        return a;
    }

    public final synchronized void p() {
        boolean z10;
        byte[] bArr = xh.b.a;
        if (this.f28819q) {
            return;
        }
        if (((fi.a) this.f28805b).c(this.f28812j)) {
            if (((fi.a) this.f28805b).c(this.f28810h)) {
                ((fi.a) this.f28805b).a(this.f28812j);
            } else {
                ((fi.a) this.f28805b).d(this.f28812j, this.f28810h);
            }
        }
        fi.b bVar = this.f28805b;
        File file = this.f28812j;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        fi.a aVar = (fi.a) bVar;
        a0 e2 = aVar.e(file);
        try {
            try {
                aVar.a(file);
                CloseableKt.closeFinally(e2, null);
                z10 = true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(e2, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(e2, null);
            aVar.a(file);
            z10 = false;
        }
        this.f28818p = z10;
        if (((fi.a) this.f28805b).c(this.f28810h)) {
            try {
                t();
                s();
                this.f28819q = true;
                return;
            } catch (IOException e10) {
                l lVar = l.a;
                l lVar2 = l.a;
                String str = "DiskLruCache " + this.f28806c + " is corrupt: " + ((Object) e10.getMessage()) + ", removing";
                lVar2.getClass();
                l.i(5, str, e10);
                try {
                    close();
                    ((fi.a) this.f28805b).b(this.f28806c);
                    this.f28820r = false;
                } catch (Throwable th4) {
                    this.f28820r = false;
                    throw th4;
                }
            }
        }
        v();
        this.f28819q = true;
    }

    public final boolean q() {
        int i10 = this.f28816n;
        if (i10 >= 2000 && i10 >= this.f28815m.size()) {
            return true;
        }
        return false;
    }

    public final d0 r() {
        a0 d10;
        File file = this.f28810h;
        ((fi.a) this.f28805b).getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            d10 = a6.k.d(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            d10 = a6.k.d(file);
        }
        return a6.k.e(new k(d10, new p0(this, 15)));
    }

    public final void s() {
        File file = this.f28811i;
        fi.a aVar = (fi.a) this.f28805b;
        aVar.a(file);
        Iterator it = this.f28815m.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            g gVar = (g) next;
            h3.a aVar2 = gVar.f28792g;
            int i10 = this.f28808f;
            int i11 = 0;
            if (aVar2 == null) {
                while (i11 < i10) {
                    this.f28813k += gVar.f28787b[i11];
                    i11++;
                }
            } else {
                gVar.f28792g = null;
                while (i11 < i10) {
                    aVar.a((File) gVar.f28788c.get(i11));
                    aVar.a((File) gVar.f28789d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void t() {
        boolean z10;
        File file = this.f28810h;
        ((fi.a) this.f28805b).getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        e0 f10 = a6.k.f(a6.k.M(file));
        try {
            String readUtf8LineStrict = f10.readUtf8LineStrict();
            String readUtf8LineStrict2 = f10.readUtf8LineStrict();
            String readUtf8LineStrict3 = f10.readUtf8LineStrict();
            String readUtf8LineStrict4 = f10.readUtf8LineStrict();
            String readUtf8LineStrict5 = f10.readUtf8LineStrict();
            if (Intrinsics.areEqual("libcore.io.DiskLruCache", readUtf8LineStrict) && Intrinsics.areEqual("1", readUtf8LineStrict2) && Intrinsics.areEqual(String.valueOf(this.f28807d), readUtf8LineStrict3) && Intrinsics.areEqual(String.valueOf(this.f28808f), readUtf8LineStrict4)) {
                int i10 = 0;
                if (readUtf8LineStrict5.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    while (true) {
                        try {
                            u(f10.readUtf8LineStrict());
                            i10++;
                        } catch (EOFException unused) {
                            this.f28816n = i10 - this.f28815m.size();
                            if (!f10.exhausted()) {
                                v();
                            } else {
                                this.f28814l = r();
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(f10, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + AbstractJsonLexerKt.END_LIST);
        } finally {
        }
    }

    public final void u(String str) {
        int indexOf$default;
        int indexOf$default2;
        String substring;
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        List strings;
        boolean startsWith$default4;
        int i10 = 0;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            int i11 = indexOf$default + 1;
            indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i11, false, 4, (Object) null);
            LinkedHashMap linkedHashMap = this.f28815m;
            if (indexOf$default2 == -1) {
                substring = str.substring(i11);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = A;
                if (indexOf$default == str2.length()) {
                    startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
                    if (startsWith$default4) {
                        linkedHashMap.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i11, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            g gVar = (g) linkedHashMap.get(substring);
            if (gVar == null) {
                gVar = new g(this, substring);
                linkedHashMap.put(substring, gVar);
            }
            if (indexOf$default2 != -1) {
                String str3 = f28803y;
                if (indexOf$default == str3.length()) {
                    startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str, str3, false, 2, null);
                    if (startsWith$default3) {
                        String substring2 = str.substring(indexOf$default2 + 1);
                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                        strings = StringsKt__StringsKt.split$default(substring2, new char[]{' '}, false, 0, 6, (Object) null);
                        gVar.f28790e = true;
                        gVar.f28792g = null;
                        Intrinsics.checkNotNullParameter(strings, "strings");
                        if (strings.size() == gVar.f28795j.f28808f) {
                            try {
                                int size = strings.size();
                                while (i10 < size) {
                                    int i12 = i10 + 1;
                                    gVar.f28787b[i10] = Long.parseLong((String) strings.get(i10));
                                    i10 = i12;
                                }
                                return;
                            } catch (NumberFormatException unused) {
                                throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", strings));
                            }
                        }
                        throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", strings));
                    }
                }
            }
            if (indexOf$default2 == -1) {
                String str4 = f28804z;
                if (indexOf$default == str4.length()) {
                    startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, str4, false, 2, null);
                    if (startsWith$default2) {
                        gVar.f28792g = new h3.a(this, gVar);
                        return;
                    }
                }
            }
            if (indexOf$default2 == -1) {
                String str5 = B;
                if (indexOf$default == str5.length()) {
                    startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, str5, false, 2, null);
                    if (startsWith$default) {
                        return;
                    }
                }
            }
            throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
        }
        throw new IOException(Intrinsics.stringPlus("unexpected journal line: ", str));
    }

    public final synchronized void v() {
        ki.j jVar = this.f28814l;
        if (jVar != null) {
            jVar.close();
        }
        d0 writer = a6.k.e(((fi.a) this.f28805b).e(this.f28811i));
        try {
            writer.writeUtf8("libcore.io.DiskLruCache");
            writer.writeByte(10);
            writer.writeUtf8("1");
            writer.writeByte(10);
            writer.writeDecimalLong(this.f28807d);
            writer.writeByte(10);
            writer.writeDecimalLong(this.f28808f);
            writer.writeByte(10);
            writer.writeByte(10);
            Iterator it = this.f28815m.values().iterator();
            while (true) {
                int i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) it.next();
                if (gVar.f28792g != null) {
                    writer.writeUtf8(f28804z);
                    writer.writeByte(32);
                    writer.writeUtf8(gVar.a);
                    writer.writeByte(10);
                } else {
                    writer.writeUtf8(f28803y);
                    writer.writeByte(32);
                    writer.writeUtf8(gVar.a);
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    long[] jArr = gVar.f28787b;
                    int length = jArr.length;
                    while (i10 < length) {
                        long j3 = jArr[i10];
                        i10++;
                        writer.writeByte(32);
                        writer.writeDecimalLong(j3);
                    }
                    writer.writeByte(10);
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(writer, null);
            if (((fi.a) this.f28805b).c(this.f28810h)) {
                ((fi.a) this.f28805b).d(this.f28810h, this.f28812j);
            }
            ((fi.a) this.f28805b).d(this.f28811i, this.f28810h);
            ((fi.a) this.f28805b).a(this.f28812j);
            this.f28814l = r();
            this.f28817o = false;
            this.f28822t = false;
        } finally {
        }
    }

    public final void w(g entry) {
        ki.j jVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f28818p) {
            if (entry.f28793h > 0 && (jVar = this.f28814l) != null) {
                jVar.writeUtf8(f28804z);
                jVar.writeByte(32);
                jVar.writeUtf8(entry.a);
                jVar.writeByte(10);
                jVar.flush();
            }
            if (entry.f28793h > 0 || entry.f28792g != null) {
                entry.f28791f = true;
                return;
            }
        }
        h3.a aVar = entry.f28792g;
        if (aVar != null) {
            aVar.e();
        }
        for (int i10 = 0; i10 < this.f28808f; i10++) {
            ((fi.a) this.f28805b).a((File) entry.f28788c.get(i10));
            long j3 = this.f28813k;
            long[] jArr = entry.f28787b;
            this.f28813k = j3 - jArr[i10];
            jArr[i10] = 0;
        }
        this.f28816n++;
        ki.j jVar2 = this.f28814l;
        String str = entry.a;
        if (jVar2 != null) {
            jVar2.writeUtf8(A);
            jVar2.writeByte(32);
            jVar2.writeUtf8(str);
            jVar2.writeByte(10);
        }
        this.f28815m.remove(str);
        if (q()) {
            this.f28823v.c(this.f28824w, 0L);
        }
    }

    public final void x() {
        boolean z10;
        do {
            z10 = false;
            if (this.f28813k > this.f28809g) {
                Iterator it = this.f28815m.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    g toEvict = (g) it.next();
                    if (!toEvict.f28791f) {
                        Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                        w(toEvict);
                        z10 = true;
                        break;
                    }
                }
            } else {
                this.f28821s = false;
                return;
            }
        } while (z10);
    }
}
