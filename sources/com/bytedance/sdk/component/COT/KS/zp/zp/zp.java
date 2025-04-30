package com.bytedance.sdk.component.COT.KS.zp.zp;

import Q7.n0;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class zp implements Closeable {
    private final File COT;
    private final File HWF;
    private final File QR;
    private long YW;
    private final int dT;
    private final File jU;
    private final int ku;
    final ExecutorService lMd;
    private int rV;
    private Writer vDp;
    static final Pattern zp = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream KS = new OutputStream() { // from class: com.bytedance.sdk.component.COT.KS.zp.zp.zp.2
        @Override // java.io.OutputStream
        public void write(int i9) throws IOException {
        }
    };
    private long Bj = 0;
    private final LinkedHashMap<String, lMd> tG = new LinkedHashMap<>(0, 0.75f, true);
    private long dQp = -1;
    private long KVG = 0;
    private final Callable<Void> woN = new Callable<Void>() { // from class: com.bytedance.sdk.component.COT.KS.zp.zp.zp.1
        @Override // java.util.concurrent.Callable
        /* renamed from: zp, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (zp.this) {
                try {
                    if (zp.this.vDp != null) {
                        zp.this.ku();
                        if (zp.this.HWF()) {
                            zp.this.COT();
                            zp.this.rV = 0;
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* loaded from: classes.dex */
    public final class KS implements Closeable {
        private final long[] COT;
        private final long KS;
        private final InputStream[] jU;
        private final String lMd;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.jU) {
                com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
            }
        }

        public InputStream zp(int i9) {
            return this.jU[i9];
        }

        private KS(String str, long j7, InputStream[] inputStreamArr, long[] jArr) {
            this.lMd = str;
            this.KS = j7;
            this.jU = inputStreamArr;
            this.COT = jArr;
        }
    }

    /* loaded from: classes.dex */
    public final class lMd {
        private C0071zp COT;
        private long HWF;
        private final long[] KS;
        private boolean jU;
        private final String lMd;

        private lMd(String str) {
            this.lMd = str;
            this.KS = new long[zp.this.dT];
        }

        private IOException lMd(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File lMd(int i9) {
            return new File(zp.this.jU, this.lMd + "." + i9 + ".tmp");
        }

        public String zp() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j7 : this.KS) {
                sb.append(' ');
                sb.append(j7);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zp(String[] strArr) throws IOException {
            if (strArr.length == zp.this.dT) {
                for (int i9 = 0; i9 < strArr.length; i9++) {
                    try {
                        this.KS[i9] = Long.parseLong(strArr[i9]);
                    } catch (NumberFormatException unused) {
                        throw lMd(strArr);
                    }
                }
                return;
            }
            throw lMd(strArr);
        }

        public File zp(int i9) {
            return new File(zp.this.jU, this.lMd + "." + i9);
        }
    }

    /* renamed from: com.bytedance.sdk.component.COT.KS.zp.zp.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0071zp {
        private boolean COT;
        private final boolean[] KS;
        private boolean jU;
        private final lMd lMd;

        /* renamed from: com.bytedance.sdk.component.COT.KS.zp.zp.zp$zp$zp, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0072zp extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0071zp.this.jU = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0071zp.this.jU = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i9) {
                try {
                    ((FilterOutputStream) this).out.write(i9);
                } catch (IOException unused) {
                    C0071zp.this.jU = true;
                }
            }

            private C0072zp(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i9, int i10) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i9, i10);
                } catch (IOException unused) {
                    C0071zp.this.jU = true;
                }
            }
        }

        private C0071zp(lMd lmd) {
            this.lMd = lmd;
            this.KS = lmd.jU ? null : new boolean[zp.this.dT];
        }

        public void lMd() throws IOException {
            zp.this.zp(this, false);
        }

        public OutputStream zp(int i9) throws IOException {
            FileOutputStream fileOutputStream;
            C0072zp c0072zp;
            if (i9 >= 0 && i9 < zp.this.dT) {
                synchronized (zp.this) {
                    try {
                        if (this.lMd.COT == this) {
                            if (!this.lMd.jU) {
                                this.KS[i9] = true;
                            }
                            File lMd = this.lMd.lMd(i9);
                            try {
                                fileOutputStream = new FileOutputStream(lMd);
                            } catch (FileNotFoundException unused) {
                                zp.this.jU.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(lMd);
                                } catch (FileNotFoundException unused2) {
                                    return zp.KS;
                                }
                            }
                            c0072zp = new C0072zp(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c0072zp;
            }
            StringBuilder p2 = n0.p(i9, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            p2.append(zp.this.dT);
            throw new IllegalArgumentException(p2.toString());
        }

        public void zp() throws IOException {
            if (this.jU) {
                zp.this.zp(this, false);
                zp.this.KS(this.lMd.lMd);
            } else {
                zp.this.zp(this, true);
            }
            this.COT = true;
        }
    }

    private zp(File file, int i9, int i10, long j7, ExecutorService executorService) {
        this.jU = file;
        this.ku = i9;
        this.COT = new File(file, "journal");
        this.HWF = new File(file, "journal.tmp");
        this.QR = new File(file, "journal.bkp");
        this.dT = i10;
        this.YW = j7;
        this.lMd = executorService;
    }

    private void QR() {
        if (this.vDp != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ku() throws IOException {
        long j7 = this.YW;
        long j9 = this.dQp;
        if (j9 >= 0) {
            j7 = j9;
        }
        while (this.Bj > j7) {
            KS(this.tG.entrySet().iterator().next().getKey());
        }
        this.dQp = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.vDp == null) {
                return;
            }
            Iterator it = new ArrayList(this.tG.values()).iterator();
            while (it.hasNext()) {
                lMd lmd = (lMd) it.next();
                if (lmd.COT != null) {
                    lmd.COT.lMd();
                }
            }
            ku();
            this.vDp.close();
            this.vDp = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void COT() throws IOException {
        try {
            Writer writer = this.vDp;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.HWF), jU.zp));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.ku));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.dT));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (lMd lmd : this.tG.values()) {
                    if (lmd.COT != null) {
                        bufferedWriter.write("DIRTY " + lmd.lMd + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + lmd.lMd + lmd.zp() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.COT.exists()) {
                    zp(this.COT, this.QR, true);
                }
                zp(this.HWF, this.COT, false);
                this.QR.delete();
                this.vDp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.COT, true), jU.zp));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean HWF() {
        int i9 = this.rV;
        return i9 >= 2000 && i9 >= this.tG.size();
    }

    private void KS() throws IOException {
        com.bytedance.sdk.component.COT.KS.zp.zp.KS ks = new com.bytedance.sdk.component.COT.KS.zp.zp.KS(new FileInputStream(this.COT), jU.zp);
        try {
            String zp2 = ks.zp();
            String zp3 = ks.zp();
            String zp4 = ks.zp();
            String zp5 = ks.zp();
            String zp6 = ks.zp();
            if (!"libcore.io.DiskLruCache".equals(zp2) || !"1".equals(zp3) || !Integer.toString(this.ku).equals(zp4) || !Integer.toString(this.dT).equals(zp5) || !"".equals(zp6)) {
                throw new IOException("unexpected journal header: [" + zp2 + ", " + zp3 + ", " + zp5 + ", " + zp6 + "]");
            }
            int i9 = 0;
            while (true) {
                try {
                    jU(ks.zp());
                    i9++;
                } catch (EOFException unused) {
                    this.rV = i9 - this.tG.size();
                    if (ks.lMd()) {
                        COT();
                    } else {
                        this.vDp = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.COT, true), jU.zp));
                    }
                    com.bytedance.sdk.component.COT.KS.KS.lMd.zp(ks);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.COT.KS.KS.lMd.zp(ks);
            throw th;
        }
    }

    private void jU(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i9 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i9);
            if (indexOf2 == -1) {
                substring = str.substring(i9);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.tG.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i9, indexOf2);
            }
            lMd lmd = this.tG.get(substring);
            if (lmd == null) {
                lmd = new lMd(substring);
                this.tG.put(substring, lmd);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                lmd.jU = true;
                lmd.COT = null;
                lmd.zp(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                lmd.COT = new C0071zp(lmd);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public C0071zp lMd(String str) throws IOException {
        return zp(str, -1L);
    }

    public void lMd() throws IOException {
        close();
        jU.zp(this.jU);
    }

    public static zp zp(File file, int i9, int i10, long j7, ExecutorService executorService) throws IOException {
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    zp(file2, file3, false);
                }
            }
            zp zpVar = new zp(file, i9, i10, j7, executorService);
            if (zpVar.COT.exists()) {
                try {
                    zpVar.KS();
                    zpVar.jU();
                    return zpVar;
                } catch (IOException e4) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e4.getMessage() + ", removing");
                    zpVar.lMd();
                }
            }
            file.mkdirs();
            zp zpVar2 = new zp(file, i9, i10, j7, executorService);
            zpVar2.COT();
            return zpVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean KS(String str) throws IOException {
        try {
            QR();
            COT(str);
            lMd lmd = this.tG.get(str);
            if (lmd != null && lmd.COT == null) {
                for (int i9 = 0; i9 < this.dT; i9++) {
                    File zp2 = lmd.zp(i9);
                    if (zp2.exists() && !zp2.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(zp2)));
                    }
                    this.Bj -= lmd.KS[i9];
                    lmd.KS[i9] = 0;
                }
                this.rV++;
                this.vDp.append((CharSequence) ("REMOVE " + str + '\n'));
                this.tG.remove(str);
                if (HWF()) {
                    this.lMd.submit(this.woN);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void jU() throws IOException {
        zp(this.HWF);
        Iterator<lMd> it = this.tG.values().iterator();
        while (it.hasNext()) {
            lMd next = it.next();
            int i9 = 0;
            if (next.COT != null) {
                next.COT = null;
                while (i9 < this.dT) {
                    zp(next.zp(i9));
                    zp(next.lMd(i9));
                    i9++;
                }
                it.remove();
            } else {
                while (i9 < this.dT) {
                    this.Bj += next.KS[i9];
                    i9++;
                }
            }
        }
    }

    private static void zp(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void zp(File file, File file2, boolean z8) throws IOException {
        if (z8) {
            zp(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void COT(String str) {
        if (!zp.matcher(str).matches()) {
            throw new IllegalArgumentException(AbstractC2914a.e("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized KS zp(String str) throws IOException {
        InputStream inputStream;
        QR();
        COT(str);
        lMd lmd = this.tG.get(str);
        if (lmd == null) {
            return null;
        }
        if (!lmd.jU) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.dT];
        for (int i9 = 0; i9 < this.dT; i9++) {
            try {
                inputStreamArr[i9] = new FileInputStream(lmd.zp(i9));
            } catch (FileNotFoundException unused) {
                for (int i10 = 0; i10 < this.dT && (inputStream = inputStreamArr[i10]) != null; i10++) {
                    com.bytedance.sdk.component.COT.KS.KS.lMd.zp(inputStream);
                }
                return null;
            }
        }
        this.rV++;
        this.vDp.append((CharSequence) ("READ " + str + '\n'));
        if (HWF()) {
            this.lMd.submit(this.woN);
        }
        return new KS(str, lmd.HWF, inputStreamArr, lmd.KS);
    }

    private synchronized C0071zp zp(String str, long j7) throws IOException {
        QR();
        COT(str);
        lMd lmd = this.tG.get(str);
        if (j7 != -1 && (lmd == null || lmd.HWF != j7)) {
            return null;
        }
        if (lmd != null) {
            if (lmd.COT != null) {
                return null;
            }
        } else {
            lmd = new lMd(str);
            this.tG.put(str, lmd);
        }
        C0071zp c0071zp = new C0071zp(lmd);
        lmd.COT = c0071zp;
        this.vDp.write("DIRTY " + str + '\n');
        this.vDp.flush();
        return c0071zp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zp(C0071zp c0071zp, boolean z8) throws IOException {
        lMd lmd = c0071zp.lMd;
        if (lmd.COT == c0071zp) {
            if (z8 && !lmd.jU) {
                for (int i9 = 0; i9 < this.dT; i9++) {
                    if (c0071zp.KS[i9]) {
                        if (!lmd.lMd(i9).exists()) {
                            c0071zp.lMd();
                            return;
                        }
                    } else {
                        c0071zp.lMd();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i9)));
                    }
                }
            }
            for (int i10 = 0; i10 < this.dT; i10++) {
                File lMd2 = lmd.lMd(i10);
                if (z8) {
                    if (lMd2.exists()) {
                        File zp2 = lmd.zp(i10);
                        lMd2.renameTo(zp2);
                        long j7 = lmd.KS[i10];
                        long length = zp2.length();
                        lmd.KS[i10] = length;
                        this.Bj = (this.Bj - j7) + length;
                    }
                } else {
                    zp(lMd2);
                }
            }
            this.rV++;
            lmd.COT = null;
            if (!(lmd.jU | z8)) {
                this.tG.remove(lmd.lMd);
                this.vDp.write("REMOVE " + lmd.lMd + '\n');
            } else {
                lmd.jU = true;
                this.vDp.write("CLEAN " + lmd.lMd + lmd.zp() + '\n');
                if (z8) {
                    long j9 = this.KVG;
                    this.KVG = 1 + j9;
                    lmd.HWF = j9;
                }
            }
            this.vDp.flush();
            if (this.Bj > this.YW || HWF()) {
                this.lMd.submit(this.woN);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void zp() throws IOException {
        QR();
        ku();
        this.vDp.flush();
    }
}
