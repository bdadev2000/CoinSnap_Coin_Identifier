package C0;

import android.content.pm.PackageInfo;
import com.mbridge.msdk.foundation.entity.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.e f404a = new R3.e(2);
    public static final byte[] b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f405c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f406d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f407e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f408f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f409g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f410h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f411i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f412j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i9 = 0;
        for (c cVar : cVarArr) {
            i9 += ((((cVar.f401g * 2) + 7) & (-8)) / 8) + (cVar.f399e * 2) + d(cVar.f396a, bArr, cVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f400f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f408f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f396a, bArr, cVar2.b));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f402h;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f396a, bArr, cVar3.b));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f402h;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z8 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            return z8;
        }
        file.delete();
        return true;
    }

    public static String d(String str, byte[] bArr, String str2) {
        Object obj;
        byte[] bArr2 = f410h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f409g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder b8 = AbstractC2965e.b(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return AbstractC2914a.h(b8, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            return str2.replace("!", ":");
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i9) {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(o.h(i9, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f411i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f406d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m = (int) m(fileInputStream, 1);
                    byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
                        try {
                            c[] j7 = j(byteArrayInputStream, m, cVarArr);
                            byteArrayInputStream.close();
                            return j7;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, f412j)) {
            int m2 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
                try {
                    c[] k6 = k(byteArrayInputStream2, bArr2, m2, cVarArr);
                    byteArrayInputStream2.close();
                    return k6;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i9, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i9 == cVarArr.length) {
            String[] strArr = new String[i9];
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int m = (int) m(byteArrayInputStream, 2);
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                c cVar = cVarArr[i11];
                if (cVar.b.equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    cVar.f399e = i12;
                    cVar.f402h = g(byteArrayInputStream, i12);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i9 == cVarArr.length) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m = m(byteArrayInputStream, 4);
                int m2 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= cVarArr.length) {
                            break;
                        }
                        if (cVarArr[i11].b.equals(str)) {
                            cVar = cVarArr[i11];
                            break;
                        }
                        i11++;
                    }
                }
                if (cVar != null) {
                    cVar.f398d = m;
                    int[] g9 = g(byteArrayInputStream, m2);
                    if (Arrays.equals(bArr, f410h)) {
                        cVar.f399e = m2;
                        cVar.f402h = g9;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return cVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f407e)) {
            int m = (int) m(fileInputStream, 1);
            byte[] h6 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h6);
                try {
                    c[] n2 = n(byteArrayInputStream, str, m);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i9) {
        byte[] f9 = f(inputStream, i9);
        long j7 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j7 += (f9[i10] & 255) << (i10 * 8);
        }
        return j7;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i9) {
        TreeMap treeMap;
        int i10;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            int m = (int) m(byteArrayInputStream, 2);
            int m2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i11] = new c(str, new String(f(byteArrayInputStream, m), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m2], new TreeMap());
        }
        for (int i12 = 0; i12 < i9; i12++) {
            c cVar = cVarArr[i12];
            int available = byteArrayInputStream.available() - cVar.f400f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = cVar.f403i;
                if (available2 <= available) {
                    break;
                }
                i13 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int m6 = (int) m(byteArrayInputStream, 2); m6 > 0; m6--) {
                    m(byteArrayInputStream, 2);
                    int m7 = (int) m(byteArrayInputStream, 1);
                    if (m7 != 6 && m7 != 7) {
                        while (m7 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m9 = (int) m(byteArrayInputStream, 1); m9 > 0; m9--) {
                                m(byteArrayInputStream, 2);
                            }
                            m7--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                cVar.f402h = g(byteArrayInputStream, cVar.f399e);
                int i14 = cVar.f401g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    if (valueOf.get(i15)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    if (valueOf.get(i15 + i14)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i10 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j7;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f406d;
        int i9 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, cVarArr.length);
                int i10 = 2;
                int i11 = 2;
                for (c cVar : cVarArr) {
                    t(byteArrayOutputStream2, cVar.f397c, 4);
                    t(byteArrayOutputStream2, cVar.f398d, 4);
                    t(byteArrayOutputStream2, cVar.f401g, 4);
                    String d2 = d(cVar.f396a, bArr2, cVar.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d2.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i11 = i11 + 14 + length2;
                    byteArrayOutputStream2.write(d2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i11 == byteArray.length) {
                    m mVar = new m(byteArray, 1, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(mVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < cVarArr.length) {
                        try {
                            c cVar2 = cVarArr[i12];
                            u(byteArrayOutputStream3, i12);
                            u(byteArrayOutputStream3, cVar2.f399e);
                            i13 = i13 + 4 + (cVar2.f399e * 2);
                            int[] iArr = cVar2.f402h;
                            int length3 = iArr.length;
                            int i14 = i9;
                            while (i9 < length3) {
                                int i15 = iArr[i9];
                                u(byteArrayOutputStream3, i15 - i14);
                                i9++;
                                i14 = i15;
                            }
                            i12++;
                            i9 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        m mVar2 = new m(byteArray2, 3, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(mVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < cVarArr.length) {
                            try {
                                c cVar3 = cVarArr[i16];
                                Iterator it = cVar3.f403i.entrySet().iterator();
                                int i18 = 0;
                                while (it.hasNext()) {
                                    i18 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    q(byteArrayOutputStream4, cVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        r(byteArrayOutputStream4, cVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        u(byteArrayOutputStream3, i16);
                                        int length4 = byteArray3.length + i10 + byteArray4.length;
                                        int i19 = i17 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        t(byteArrayOutputStream3, length4, 4);
                                        u(byteArrayOutputStream3, i18);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i17 = i19 + length4;
                                        i16++;
                                        arrayList3 = arrayList4;
                                        i10 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i17 == byteArray5.length) {
                            m mVar3 = new m(byteArray5, 4, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(mVar3);
                            long j9 = 4;
                            long size = j9 + j9 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                m mVar4 = (m) arrayList2.get(i20);
                                int i21 = mVar4.f419a;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        if (i21 != 3) {
                                            if (i21 != 4) {
                                                if (i21 == 5) {
                                                    j7 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j7 = 3;
                                            }
                                        } else {
                                            j7 = 2;
                                        }
                                    } else {
                                        j7 = 1;
                                    }
                                } else {
                                    j7 = 0;
                                }
                                t(byteArrayOutputStream, j7, 4);
                                t(byteArrayOutputStream, size, 4);
                                boolean z8 = mVar4.f420c;
                                byte[] bArr3 = mVar4.b;
                                if (z8) {
                                    long length5 = bArr3.length;
                                    byte[] a6 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a6);
                                    t(byteArrayOutputStream, a6.length, 4);
                                    t(byteArrayOutputStream, length5, 4);
                                    length = a6.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i20++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f407e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b8 = b(cVarArr, bArr4);
            t(byteArrayOutputStream, cVarArr.length, 1);
            t(byteArrayOutputStream, b8.length, 4);
            byte[] a9 = a(b8);
            t(byteArrayOutputStream, a9.length, 4);
            byteArrayOutputStream.write(a9);
            return true;
        }
        byte[] bArr5 = f409g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, cVarArr.length, 1);
            for (c cVar4 : cVarArr) {
                int size2 = cVar4.f403i.size() * 4;
                String d9 = d(cVar4.f396a, bArr5, cVar4.b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d9.getBytes(charset2).length);
                u(byteArrayOutputStream, cVar4.f402h.length);
                t(byteArrayOutputStream, size2, 4);
                t(byteArrayOutputStream, cVar4.f397c, 4);
                byteArrayOutputStream.write(d9.getBytes(charset2));
                Iterator it2 = cVar4.f403i.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i23 : cVar4.f402h) {
                    u(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        byte[] bArr6 = f408f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b9 = b(cVarArr, bArr6);
            t(byteArrayOutputStream, cVarArr.length, 1);
            t(byteArrayOutputStream, b9.length, 4);
            byte[] a10 = a(b9);
            t(byteArrayOutputStream, a10.length, 4);
            byteArrayOutputStream.write(a10);
            return true;
        }
        byte[] bArr7 = f410h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar5 : cVarArr) {
                String d10 = d(cVar5.f396a, bArr7, cVar5.b);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d10.getBytes(charset3).length);
                TreeMap treeMap = cVar5.f403i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar5.f402h.length);
                t(byteArrayOutputStream, cVar5.f397c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i24 : cVar5.f402h) {
                    u(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.f399e);
        t(byteArrayOutputStream, cVar.f400f, 4);
        t(byteArrayOutputStream, cVar.f397c, 4);
        t(byteArrayOutputStream, cVar.f401g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        byte[] bArr = new byte[(((cVar.f401g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f403i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + cVar.f401g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i9 = 0;
        for (Map.Entry entry : cVar.f403i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i9);
                u(byteArrayOutputStream, 0);
                i9 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c6, code lost:
    
        if (r5 == null) goto L129;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x016f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, C0.d r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.e.s(android.content.Context, java.util.concurrent.Executor, C0.d, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j7, int i9) {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j7 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        t(byteArrayOutputStream, i9, 2);
    }
}
