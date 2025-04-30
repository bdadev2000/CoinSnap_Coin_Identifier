package L1;

import J1.v;
import android.os.Build;
import android.os.StrictMode;
import j5.C2400c;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c implements Closeable {
    public final File b;

    /* renamed from: c, reason: collision with root package name */
    public final File f1693c;

    /* renamed from: d, reason: collision with root package name */
    public final File f1694d;

    /* renamed from: f, reason: collision with root package name */
    public final File f1695f;

    /* renamed from: h, reason: collision with root package name */
    public final long f1697h;

    /* renamed from: k, reason: collision with root package name */
    public BufferedWriter f1700k;
    public int m;

    /* renamed from: j, reason: collision with root package name */
    public long f1699j = 0;
    public final LinkedHashMap l = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: n, reason: collision with root package name */
    public long f1701n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final ThreadPoolExecutor f1702o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());

    /* renamed from: p, reason: collision with root package name */
    public final v f1703p = new v(this, 1);

    /* renamed from: g, reason: collision with root package name */
    public final int f1696g = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f1698i = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public c(File file, long j7) {
        this.b = file;
        this.f1693c = new File(file, "journal");
        this.f1694d = new File(file, "journal.tmp");
        this.f1695f = new File(file, "journal.bkp");
        this.f1697h = j7;
    }

    public static void a(c cVar, H0.b bVar, boolean z8) {
        synchronized (cVar) {
            b bVar2 = (b) bVar.f1345c;
            if (bVar2.f1691f == bVar) {
                if (z8 && !bVar2.f1690e) {
                    for (int i9 = 0; i9 < cVar.f1698i; i9++) {
                        if (((boolean[]) bVar.f1346d)[i9]) {
                            if (!bVar2.f1689d[i9].exists()) {
                                bVar.a();
                                return;
                            }
                        } else {
                            bVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i9);
                        }
                    }
                }
                for (int i10 = 0; i10 < cVar.f1698i; i10++) {
                    File file = bVar2.f1689d[i10];
                    if (z8) {
                        if (file.exists()) {
                            File file2 = bVar2.f1688c[i10];
                            file.renameTo(file2);
                            long j7 = bVar2.b[i10];
                            long length = file2.length();
                            bVar2.b[i10] = length;
                            cVar.f1699j = (cVar.f1699j - j7) + length;
                        }
                    } else {
                        c(file);
                    }
                }
                cVar.m++;
                bVar2.f1691f = null;
                if (bVar2.f1690e | z8) {
                    bVar2.f1690e = true;
                    cVar.f1700k.append((CharSequence) "CLEAN");
                    cVar.f1700k.append(' ');
                    cVar.f1700k.append((CharSequence) bVar2.f1687a);
                    cVar.f1700k.append((CharSequence) bVar2.a());
                    cVar.f1700k.append('\n');
                    if (z8) {
                        cVar.f1701n++;
                        bVar2.getClass();
                    }
                } else {
                    cVar.l.remove(bVar2.f1687a);
                    cVar.f1700k.append((CharSequence) "REMOVE");
                    cVar.f1700k.append(' ');
                    cVar.f1700k.append((CharSequence) bVar2.f1687a);
                    cVar.f1700k.append('\n');
                }
                i(cVar.f1700k);
                if (cVar.f1699j > cVar.f1697h || cVar.k()) {
                    cVar.f1702o.submit(cVar.f1703p);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void i(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c l(File file, long j7) {
        if (j7 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    q(file2, file3, false);
                }
            }
            c cVar = new c(file, j7);
            if (cVar.f1693c.exists()) {
                try {
                    cVar.n();
                    cVar.m();
                    return cVar;
                } catch (IOException e4) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                    cVar.close();
                    f.a(cVar.b);
                }
            }
            file.mkdirs();
            c cVar2 = new c(file, j7);
            cVar2.p();
            return cVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void q(File file, File file2, boolean z8) {
        if (z8) {
            c(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f1700k == null) {
                return;
            }
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                H0.b bVar = ((b) it.next()).f1691f;
                if (bVar != null) {
                    bVar.a();
                }
            }
            r();
            b(this.f1700k);
            this.f1700k = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final H0.b h(String str) {
        synchronized (this) {
            try {
                if (this.f1700k != null) {
                    b bVar = (b) this.l.get(str);
                    if (bVar == null) {
                        bVar = new b(this, str);
                        this.l.put(str, bVar);
                    } else if (bVar.f1691f != null) {
                        return null;
                    }
                    H0.b bVar2 = new H0.b(this, bVar);
                    bVar.f1691f = bVar2;
                    this.f1700k.append((CharSequence) "DIRTY");
                    this.f1700k.append(' ');
                    this.f1700k.append((CharSequence) str);
                    this.f1700k.append('\n');
                    i(this.f1700k);
                    return bVar2;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C2400c j(String str) {
        if (this.f1700k != null) {
            b bVar = (b) this.l.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.f1690e) {
                return null;
            }
            for (File file : bVar.f1688c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.m++;
            this.f1700k.append((CharSequence) "READ");
            this.f1700k.append(' ');
            this.f1700k.append((CharSequence) str);
            this.f1700k.append('\n');
            if (k()) {
                this.f1702o.submit(this.f1703p);
            }
            return new C2400c(bVar.f1688c, 7);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean k() {
        int i9 = this.m;
        if (i9 >= 2000 && i9 >= this.l.size()) {
            return true;
        }
        return false;
    }

    public final void m() {
        c(this.f1694d);
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            H0.b bVar2 = bVar.f1691f;
            int i9 = this.f1698i;
            int i10 = 0;
            if (bVar2 == null) {
                while (i10 < i9) {
                    this.f1699j += bVar.b[i10];
                    i10++;
                }
            } else {
                bVar.f1691f = null;
                while (i10 < i9) {
                    c(bVar.f1688c[i10]);
                    c(bVar.f1689d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void n() {
        File file = this.f1693c;
        FileInputStream fileInputStream = new FileInputStream(file);
        Charset charset = f.f1708a;
        e eVar = new e(fileInputStream);
        try {
            String a6 = eVar.a();
            String a9 = eVar.a();
            String a10 = eVar.a();
            String a11 = eVar.a();
            String a12 = eVar.a();
            if ("libcore.io.DiskLruCache".equals(a6) && "1".equals(a9) && Integer.toString(this.f1696g).equals(a10) && Integer.toString(this.f1698i).equals(a11) && "".equals(a12)) {
                int i9 = 0;
                while (true) {
                    try {
                        o(eVar.a());
                        i9++;
                    } catch (EOFException unused) {
                        this.m = i9 - this.l.size();
                        if (eVar.f1707g == -1) {
                            p();
                        } else {
                            this.f1700k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), f.f1708a));
                        }
                        try {
                            eVar.close();
                            return;
                        } catch (RuntimeException e4) {
                            throw e4;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a6 + ", " + a9 + ", " + a11 + ", " + a12 + "]");
            }
        } catch (Throwable th) {
            try {
                eVar.close();
            } catch (RuntimeException e9) {
                throw e9;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void o(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i9 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i9);
            LinkedHashMap linkedHashMap = this.l;
            if (indexOf2 == -1) {
                substring = str.substring(i9);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i9, indexOf2);
            }
            b bVar = (b) linkedHashMap.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring);
                linkedHashMap.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f1690e = true;
                bVar.f1691f = null;
                if (split.length == bVar.f1692g.f1698i) {
                    for (int i10 = 0; i10 < split.length; i10++) {
                        try {
                            bVar.b[i10] = Long.parseLong(split[i10]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f1691f = new H0.b(this, bVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void p() {
        try {
            BufferedWriter bufferedWriter = this.f1700k;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1694d), f.f1708a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f1696g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f1698i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.l.values()) {
                    if (bVar.f1691f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f1687a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f1687a + bVar.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f1693c.exists()) {
                    q(this.f1693c, this.f1695f, true);
                }
                q(this.f1694d, this.f1693c, false);
                this.f1695f.delete();
                this.f1700k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1693c, true), f.f1708a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void r() {
        while (this.f1699j > this.f1697h) {
            String str = (String) ((Map.Entry) this.l.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f1700k != null) {
                        b bVar = (b) this.l.get(str);
                        if (bVar != null && bVar.f1691f == null) {
                            for (int i9 = 0; i9 < this.f1698i; i9++) {
                                File file = bVar.f1688c[i9];
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                                long j7 = this.f1699j;
                                long[] jArr = bVar.b;
                                this.f1699j = j7 - jArr[i9];
                                jArr[i9] = 0;
                            }
                            this.m++;
                            this.f1700k.append((CharSequence) "REMOVE");
                            this.f1700k.append(' ');
                            this.f1700k.append((CharSequence) str);
                            this.f1700k.append('\n');
                            this.l.remove(str);
                            if (k()) {
                                this.f1702o.submit(this.f1703p);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
