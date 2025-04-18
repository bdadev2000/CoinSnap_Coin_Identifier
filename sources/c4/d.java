package c4;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l2.h;

/* loaded from: classes.dex */
public final class d implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f2594b;

    /* renamed from: c, reason: collision with root package name */
    public final File f2595c;

    /* renamed from: d, reason: collision with root package name */
    public final File f2596d;

    /* renamed from: f, reason: collision with root package name */
    public final File f2597f;

    /* renamed from: h, reason: collision with root package name */
    public final long f2599h;

    /* renamed from: k, reason: collision with root package name */
    public BufferedWriter f2602k;

    /* renamed from: m, reason: collision with root package name */
    public int f2604m;

    /* renamed from: j, reason: collision with root package name */
    public long f2601j = 0;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f2603l = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: n, reason: collision with root package name */
    public long f2605n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final ThreadPoolExecutor f2606o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* renamed from: p, reason: collision with root package name */
    public final h f2607p = new h(this, 2);

    /* renamed from: g, reason: collision with root package name */
    public final int f2598g = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f2600i = 1;

    public d(File file, long j3) {
        this.f2594b = file;
        this.f2595c = new File(file, "journal");
        this.f2596d = new File(file, "journal.tmp");
        this.f2597f = new File(file, "journal.bkp");
        this.f2599h = j3;
    }

    public static void d(d dVar, h3.a aVar, boolean z10) {
        synchronized (dVar) {
            b bVar = (b) aVar.f18723d;
            if (bVar.f2586f == aVar) {
                if (z10 && !bVar.f2585e) {
                    for (int i10 = 0; i10 < dVar.f2600i; i10++) {
                        if (((boolean[]) aVar.f18724f)[i10]) {
                            if (!bVar.f2584d[i10].exists()) {
                                aVar.a();
                                return;
                            }
                        } else {
                            aVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        }
                    }
                }
                for (int i11 = 0; i11 < dVar.f2600i; i11++) {
                    File file = bVar.f2584d[i11];
                    if (z10) {
                        if (file.exists()) {
                            File file2 = bVar.f2583c[i11];
                            file.renameTo(file2);
                            long j3 = bVar.f2582b[i11];
                            long length = file2.length();
                            bVar.f2582b[i11] = length;
                            dVar.f2601j = (dVar.f2601j - j3) + length;
                        }
                    } else {
                        j(file);
                    }
                }
                dVar.f2604m++;
                bVar.f2586f = null;
                if (bVar.f2585e | z10) {
                    bVar.f2585e = true;
                    dVar.f2602k.append((CharSequence) "CLEAN");
                    dVar.f2602k.append(' ');
                    dVar.f2602k.append((CharSequence) bVar.a);
                    dVar.f2602k.append((CharSequence) bVar.a());
                    dVar.f2602k.append('\n');
                    if (z10) {
                        long j10 = dVar.f2605n;
                        dVar.f2605n = 1 + j10;
                        bVar.f2587g = j10;
                    }
                } else {
                    dVar.f2603l.remove(bVar.a);
                    dVar.f2602k.append((CharSequence) "REMOVE");
                    dVar.f2602k.append(' ');
                    dVar.f2602k.append((CharSequence) bVar.a);
                    dVar.f2602k.append('\n');
                }
                p(dVar.f2602k);
                if (dVar.f2601j > dVar.f2599h || dVar.r()) {
                    dVar.f2606o.submit(dVar.f2607p);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void g(Writer writer) {
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

    public static void j(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void p(Writer writer) {
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

    public static d s(File file, long j3) {
        if (j3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    x(file2, file3, false);
                }
            }
            d dVar = new d(file, j3);
            if (dVar.f2595c.exists()) {
                try {
                    dVar.u();
                    dVar.t();
                    return dVar;
                } catch (IOException e2) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    dVar.close();
                    g.a(dVar.f2594b);
                }
            }
            file.mkdirs();
            d dVar2 = new d(file, j3);
            dVar2.w();
            return dVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void x(File file, File file2, boolean z10) {
        if (z10) {
            j(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    public final void T() {
        while (this.f2601j > this.f2599h) {
            String str = (String) ((Map.Entry) this.f2603l.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.f2602k != null) {
                    b bVar = (b) this.f2603l.get(str);
                    if (bVar != null && bVar.f2586f == null) {
                        for (int i10 = 0; i10 < this.f2600i; i10++) {
                            File file = bVar.f2583c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j3 = this.f2601j;
                            long[] jArr = bVar.f2582b;
                            this.f2601j = j3 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f2604m++;
                        this.f2602k.append((CharSequence) "REMOVE");
                        this.f2602k.append(' ');
                        this.f2602k.append((CharSequence) str);
                        this.f2602k.append('\n');
                        this.f2603l.remove(str);
                        if (r()) {
                            this.f2606o.submit(this.f2607p);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f2602k == null) {
            return;
        }
        Iterator it = new ArrayList(this.f2603l.values()).iterator();
        while (it.hasNext()) {
            h3.a aVar = ((b) it.next()).f2586f;
            if (aVar != null) {
                aVar.a();
            }
        }
        T();
        g(this.f2602k);
        this.f2602k = null;
    }

    public final h3.a k(String str) {
        synchronized (this) {
            if (this.f2602k != null) {
                b bVar = (b) this.f2603l.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f2603l.put(str, bVar);
                } else if (bVar.f2586f != null) {
                    return null;
                }
                h3.a aVar = new h3.a(this, bVar, 0);
                bVar.f2586f = aVar;
                this.f2602k.append((CharSequence) "DIRTY");
                this.f2602k.append(' ');
                this.f2602k.append((CharSequence) str);
                this.f2602k.append('\n');
                p(this.f2602k);
                return aVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized c q(String str) {
        if (this.f2602k != null) {
            b bVar = (b) this.f2603l.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.f2585e) {
                return null;
            }
            for (File file : bVar.f2583c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f2604m++;
            this.f2602k.append((CharSequence) "READ");
            this.f2602k.append(' ');
            this.f2602k.append((CharSequence) str);
            this.f2602k.append('\n');
            if (r()) {
                this.f2606o.submit(this.f2607p);
            }
            return new c(this, str, bVar.f2587g, bVar.f2583c, bVar.f2582b);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean r() {
        int i10 = this.f2604m;
        if (i10 >= 2000 && i10 >= this.f2603l.size()) {
            return true;
        }
        return false;
    }

    public final void t() {
        j(this.f2596d);
        Iterator it = this.f2603l.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            h3.a aVar = bVar.f2586f;
            int i10 = this.f2600i;
            int i11 = 0;
            if (aVar == null) {
                while (i11 < i10) {
                    this.f2601j += bVar.f2582b[i11];
                    i11++;
                }
            } else {
                bVar.f2586f = null;
                while (i11 < i10) {
                    j(bVar.f2583c[i11]);
                    j(bVar.f2584d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void u() {
        File file = this.f2595c;
        f fVar = new f(new FileInputStream(file), g.a);
        try {
            String d10 = fVar.d();
            String d11 = fVar.d();
            String d12 = fVar.d();
            String d13 = fVar.d();
            String d14 = fVar.d();
            if ("libcore.io.DiskLruCache".equals(d10) && "1".equals(d11) && Integer.toString(this.f2598g).equals(d12) && Integer.toString(this.f2600i).equals(d13) && "".equals(d14)) {
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    try {
                        v(fVar.d());
                        i10++;
                    } catch (EOFException unused) {
                        this.f2604m = i10 - this.f2603l.size();
                        if (fVar.f2613g == -1) {
                            z10 = true;
                        }
                        if (z10) {
                            w();
                        } else {
                            this.f2602k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), g.a));
                        }
                        try {
                            fVar.close();
                            return;
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + d10 + ", " + d11 + ", " + d13 + ", " + d14 + "]");
            }
        } catch (Throwable th2) {
            try {
                fVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void v(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            LinkedHashMap linkedHashMap = this.f2603l;
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            b bVar = (b) linkedHashMap.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring);
                linkedHashMap.put(substring, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f2585e = true;
                bVar.f2586f = null;
                if (split.length == bVar.f2588h.f2600i) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            bVar.f2582b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f2586f = new h3.a(this, bVar, 0);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void w() {
        BufferedWriter bufferedWriter = this.f2602k;
        if (bufferedWriter != null) {
            g(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2596d), g.a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f2598g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f2600i));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (b bVar : this.f2603l.values()) {
                if (bVar.f2586f != null) {
                    bufferedWriter2.write("DIRTY " + bVar.a + '\n');
                } else {
                    bufferedWriter2.write("CLEAN " + bVar.a + bVar.a() + '\n');
                }
            }
            g(bufferedWriter2);
            if (this.f2595c.exists()) {
                x(this.f2595c, this.f2597f, true);
            }
            x(this.f2596d, this.f2595c, false);
            this.f2597f.delete();
            this.f2602k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2595c, true), g.a));
        } catch (Throwable th2) {
            g(bufferedWriter2);
            throw th2;
        }
    }
}
