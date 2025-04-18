package com.bytedance.sdk.component.wN.tN.YFl.YFl;

import a4.j;
import android.util.Log;
import com.applovin.impl.mediation.ads.e;
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

/* loaded from: classes.dex */
public final class YFl implements Closeable {
    static final Pattern YFl = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream tN = new OutputStream() { // from class: com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };
    private final File AlY;
    private final File DSW;
    private long NjR;
    final ExecutorService Sg;
    private Writer YoT;

    /* renamed from: nc, reason: collision with root package name */
    private final int f10475nc;
    private int pDU;
    private final int qsH;

    /* renamed from: vc, reason: collision with root package name */
    private final File f10476vc;
    private final File wN;
    private long eT = 0;
    private final LinkedHashMap<String, Sg> GA = new LinkedHashMap<>(0, 0.75f, true);
    private long EH = -1;
    private long rkt = 0;
    private final Callable<Void> lG = new Callable<Void>() { // from class: com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl.1
        @Override // java.util.concurrent.Callable
        /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (YFl.this) {
                if (YFl.this.YoT != null) {
                    YFl.this.qsH();
                    if (YFl.this.vc()) {
                        YFl.this.wN();
                        YFl.this.pDU = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    };

    /* loaded from: classes.dex */
    public final class Sg {
        private boolean AlY;
        private final String Sg;
        private final long[] tN;

        /* renamed from: vc, reason: collision with root package name */
        private long f10477vc;
        private C0096YFl wN;

        private Sg(String str) {
            this.Sg = str;
            this.tN = new long[YFl.this.f10475nc];
        }

        private IOException Sg(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File Sg(int i10) {
            return new File(YFl.this.AlY, this.Sg + "." + i10 + ".tmp");
        }

        public String YFl() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j3 : this.tN) {
                sb2.append(' ');
                sb2.append(j3);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void YFl(String[] strArr) throws IOException {
            if (strArr.length == YFl.this.f10475nc) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.tN[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw Sg(strArr);
                    }
                }
                return;
            }
            throw Sg(strArr);
        }

        public File YFl(int i10) {
            return new File(YFl.this.AlY, this.Sg + "." + i10);
        }
    }

    /* renamed from: com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0096YFl {
        private boolean AlY;
        private final Sg Sg;
        private final boolean[] tN;
        private boolean wN;

        /* renamed from: com.bytedance.sdk.component.wN.tN.YFl.YFl.YFl$YFl$YFl, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0097YFl extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0096YFl.this.AlY = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0096YFl.this.AlY = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0096YFl.this.AlY = true;
                }
            }

            private C0097YFl(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0096YFl.this.AlY = true;
                }
            }
        }

        private C0096YFl(Sg sg2) {
            this.Sg = sg2;
            this.tN = sg2.AlY ? null : new boolean[YFl.this.f10475nc];
        }

        public void Sg() throws IOException {
            YFl.this.YFl(this, false);
        }

        public OutputStream YFl(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0097YFl c0097YFl;
            if (i10 >= 0 && i10 < YFl.this.f10475nc) {
                synchronized (YFl.this) {
                    if (this.Sg.wN == this) {
                        if (!this.Sg.AlY) {
                            this.tN[i10] = true;
                        }
                        File Sg = this.Sg.Sg(i10);
                        try {
                            fileOutputStream = new FileOutputStream(Sg);
                        } catch (FileNotFoundException unused) {
                            YFl.this.AlY.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(Sg);
                            } catch (FileNotFoundException unused2) {
                                return YFl.tN;
                            }
                        }
                        c0097YFl = new C0097YFl(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return c0097YFl;
            }
            StringBuilder m10 = j.m("Expected index ", i10, " to be greater than 0 and less than the maximum value count of ");
            m10.append(YFl.this.f10475nc);
            throw new IllegalArgumentException(m10.toString());
        }

        public void YFl() throws IOException {
            if (this.AlY) {
                YFl.this.YFl(this, false);
                YFl.this.tN(this.Sg.Sg);
            } else {
                YFl.this.YFl(this, true);
            }
            this.wN = true;
        }
    }

    /* loaded from: classes.dex */
    public final class tN implements Closeable {
        private final InputStream[] AlY;
        private final String Sg;
        private final long tN;
        private final long[] wN;

        public InputStream YFl(int i10) {
            return this.AlY[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.AlY) {
                com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
            }
        }

        private tN(String str, long j3, InputStream[] inputStreamArr, long[] jArr) {
            this.Sg = str;
            this.tN = j3;
            this.AlY = inputStreamArr;
            this.wN = jArr;
        }
    }

    private YFl(File file, int i10, int i11, long j3, ExecutorService executorService) {
        this.AlY = file;
        this.qsH = i10;
        this.wN = new File(file, "journal");
        this.f10476vc = new File(file, "journal.tmp");
        this.DSW = new File(file, "journal.bkp");
        this.f10475nc = i11;
        this.NjR = j3;
        this.Sg = executorService;
    }

    private void DSW() {
        if (this.YoT != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qsH() throws IOException {
        long j3 = this.NjR;
        long j10 = this.EH;
        if (j10 >= 0) {
            j3 = j10;
        }
        while (this.eT > j3) {
            tN(this.GA.entrySet().iterator().next().getKey());
        }
        this.EH = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.YoT == null) {
            return;
        }
        Iterator it = new ArrayList(this.GA.values()).iterator();
        while (it.hasNext()) {
            Sg sg2 = (Sg) it.next();
            if (sg2.wN != null) {
                sg2.wN.Sg();
            }
        }
        qsH();
        this.YoT.close();
        this.YoT = null;
    }

    private void AlY(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.GA.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            Sg sg2 = this.GA.get(substring);
            if (sg2 == null) {
                sg2 = new Sg(substring);
                this.GA.put(substring, sg2);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                sg2.AlY = true;
                sg2.wN = null;
                sg2.YFl(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                sg2.wN = new C0096YFl(sg2);
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

    private void tN() throws IOException {
        com.bytedance.sdk.component.wN.tN.YFl.YFl.tN tNVar = new com.bytedance.sdk.component.wN.tN.YFl.YFl.tN(new FileInputStream(this.wN), AlY.YFl);
        try {
            String YFl2 = tNVar.YFl();
            String YFl3 = tNVar.YFl();
            String YFl4 = tNVar.YFl();
            String YFl5 = tNVar.YFl();
            String YFl6 = tNVar.YFl();
            if (!"libcore.io.DiskLruCache".equals(YFl2) || !"1".equals(YFl3) || !Integer.toString(this.qsH).equals(YFl4) || !Integer.toString(this.f10475nc).equals(YFl5) || !"".equals(YFl6)) {
                throw new IOException("unexpected journal header: [" + YFl2 + ", " + YFl3 + ", " + YFl5 + ", " + YFl6 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    AlY(tNVar.YFl());
                    i10++;
                } catch (EOFException unused) {
                    this.pDU = i10 - this.GA.size();
                    if (tNVar.Sg()) {
                        wN();
                    } else {
                        this.YoT = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.wN, true), AlY.YFl));
                    }
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(tNVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(tNVar);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vc() {
        int i10 = this.pDU;
        return i10 >= 2000 && i10 >= this.GA.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void wN() throws IOException {
        Writer writer = this.YoT;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10476vc), AlY.YFl));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.qsH));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10475nc));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Sg sg2 : this.GA.values()) {
                if (sg2.wN != null) {
                    bufferedWriter.write("DIRTY " + sg2.Sg + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + sg2.Sg + sg2.YFl() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.wN.exists()) {
                YFl(this.wN, this.DSW, true);
            }
            YFl(this.f10476vc, this.wN, false);
            this.DSW.delete();
            this.YoT = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.wN, true), AlY.YFl));
        } catch (Throwable th2) {
            bufferedWriter.close();
            throw th2;
        }
    }

    public C0096YFl Sg(String str) throws IOException {
        return YFl(str, -1L);
    }

    public void Sg() throws IOException {
        close();
        AlY.YFl(this.AlY);
    }

    public static YFl YFl(File file, int i10, int i11, long j3, ExecutorService executorService) throws IOException {
        if (j3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    YFl(file2, file3, false);
                }
            }
            YFl yFl = new YFl(file, i10, i11, j3, executorService);
            if (yFl.wN.exists()) {
                try {
                    yFl.tN();
                    yFl.AlY();
                    return yFl;
                } catch (IOException e2) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e2.getMessage() + ", removing");
                    yFl.Sg();
                }
            }
            file.mkdirs();
            YFl yFl2 = new YFl(file, i10, i11, j3, executorService);
            yFl2.wN();
            return yFl2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    private void AlY() throws IOException {
        YFl(this.f10476vc);
        Iterator<Sg> it = this.GA.values().iterator();
        while (it.hasNext()) {
            Sg next = it.next();
            int i10 = 0;
            if (next.wN != null) {
                next.wN = null;
                while (i10 < this.f10475nc) {
                    YFl(next.YFl(i10));
                    YFl(next.Sg(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f10475nc) {
                    this.eT += next.tN[i10];
                    i10++;
                }
            }
        }
    }

    public synchronized boolean tN(String str) throws IOException {
        DSW();
        wN(str);
        Sg sg2 = this.GA.get(str);
        if (sg2 != null && sg2.wN == null) {
            for (int i10 = 0; i10 < this.f10475nc; i10++) {
                File YFl2 = sg2.YFl(i10);
                if (YFl2.exists() && !YFl2.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(YFl2)));
                }
                this.eT -= sg2.tN[i10];
                sg2.tN[i10] = 0;
            }
            this.pDU++;
            this.YoT.append((CharSequence) ("REMOVE " + str + '\n'));
            this.GA.remove(str);
            if (vc()) {
                this.Sg.submit(this.lG);
            }
            return true;
        }
        return false;
    }

    private static void YFl(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void YFl(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            YFl(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void wN(String str) {
        if (!YFl.matcher(str).matches()) {
            throw new IllegalArgumentException(e.f("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized tN YFl(String str) throws IOException {
        InputStream inputStream;
        DSW();
        wN(str);
        Sg sg2 = this.GA.get(str);
        if (sg2 == null) {
            return null;
        }
        if (!sg2.AlY) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f10475nc];
        for (int i10 = 0; i10 < this.f10475nc; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(sg2.YFl(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.f10475nc && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    com.bytedance.sdk.component.wN.tN.tN.Sg.YFl(inputStream);
                }
                return null;
            }
        }
        this.pDU++;
        this.YoT.append((CharSequence) ("READ " + str + '\n'));
        if (vc()) {
            this.Sg.submit(this.lG);
        }
        return new tN(str, sg2.f10477vc, inputStreamArr, sg2.tN);
    }

    private synchronized C0096YFl YFl(String str, long j3) throws IOException {
        DSW();
        wN(str);
        Sg sg2 = this.GA.get(str);
        if (j3 != -1 && (sg2 == null || sg2.f10477vc != j3)) {
            return null;
        }
        if (sg2 != null) {
            if (sg2.wN != null) {
                return null;
            }
        } else {
            sg2 = new Sg(str);
            this.GA.put(str, sg2);
        }
        C0096YFl c0096YFl = new C0096YFl(sg2);
        sg2.wN = c0096YFl;
        this.YoT.write("DIRTY " + str + '\n');
        this.YoT.flush();
        return c0096YFl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void YFl(C0096YFl c0096YFl, boolean z10) throws IOException {
        Sg sg2 = c0096YFl.Sg;
        if (sg2.wN == c0096YFl) {
            if (z10 && !sg2.AlY) {
                for (int i10 = 0; i10 < this.f10475nc; i10++) {
                    if (c0096YFl.tN[i10]) {
                        if (!sg2.Sg(i10).exists()) {
                            c0096YFl.Sg();
                            return;
                        }
                    } else {
                        c0096YFl.Sg();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.f10475nc; i11++) {
                File Sg2 = sg2.Sg(i11);
                if (z10) {
                    if (Sg2.exists()) {
                        File YFl2 = sg2.YFl(i11);
                        Sg2.renameTo(YFl2);
                        long j3 = sg2.tN[i11];
                        long length = YFl2.length();
                        sg2.tN[i11] = length;
                        this.eT = (this.eT - j3) + length;
                    }
                } else {
                    YFl(Sg2);
                }
            }
            this.pDU++;
            sg2.wN = null;
            if (sg2.AlY | z10) {
                sg2.AlY = true;
                this.YoT.write("CLEAN " + sg2.Sg + sg2.YFl() + '\n');
                if (z10) {
                    long j10 = this.rkt;
                    this.rkt = 1 + j10;
                    sg2.f10477vc = j10;
                }
            } else {
                this.GA.remove(sg2.Sg);
                this.YoT.write("REMOVE " + sg2.Sg + '\n');
            }
            this.YoT.flush();
            if (this.eT > this.NjR || vc()) {
                this.Sg.submit(this.lG);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void YFl() throws IOException {
        DSW();
        qsH();
        this.YoT.flush();
    }
}
