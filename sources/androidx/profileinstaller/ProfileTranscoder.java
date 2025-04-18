package androidx.profileinstaller;

import android.support.v4.media.d;
import androidx.annotation.RequiresApi;
import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@RequiresApi
/* loaded from: classes.dex */
class ProfileTranscoder {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20893a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f20894b = {112, 114, 109, 0};

    public static byte[] a(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i3 += ((((dexProfileData.f20883g * 2) + 7) & (-8)) / 8) + (dexProfileData.e * 2) + b(dexProfileData.f20879a, dexProfileData.f20880b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.f20882f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, ProfileVersion.f20903c)) {
            int length = dexProfileDataArr.length;
            while (i2 < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i2];
                l(byteArrayOutputStream, dexProfileData2, b(dexProfileData2.f20879a, dexProfileData2.f20880b, bArr));
                n(byteArrayOutputStream, dexProfileData2);
                k(byteArrayOutputStream, dexProfileData2);
                m(byteArrayOutputStream, dexProfileData2);
                i2++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                l(byteArrayOutputStream, dexProfileData3, b(dexProfileData3.f20879a, dexProfileData3.f20880b, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i2 < length2) {
                DexProfileData dexProfileData4 = dexProfileDataArr[i2];
                n(byteArrayOutputStream, dexProfileData4);
                k(byteArrayOutputStream, dexProfileData4);
                m(byteArrayOutputStream, dexProfileData4);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ProfileVersion.e;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.d;
        Object obj = (equals || Arrays.equals(bArr, bArr3)) ? CertificateUtil.DELIMITER : "!";
        if (str.length() <= 0) {
            return "!".equals(obj) ? str2.replace(CertificateUtil.DELIMITER, "!") : CertificateUtil.DELIMITER.equals(obj) ? str2.replace("!", CertificateUtil.DELIMITER) : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(CertificateUtil.DELIMITER)) {
            return "!".equals(obj) ? str2.replace(CertificateUtil.DELIMITER, "!") : CertificateUtil.DELIMITER.equals(obj) ? str2.replace("!", CertificateUtil.DELIMITER) : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return d.r(androidx.compose.foundation.text.input.a.q(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? CertificateUtil.DELIMITER : "!", str2);
    }

    public static int c(int i2, int i3, int i4) {
        if (i2 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i2 == 2) {
            return i3;
        }
        if (i2 == 4) {
            return i3 + i4;
        }
        throw new IllegalStateException(d.i("Unexpected flag: ", i2));
    }

    public static int[] d(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static DexProfileData[] e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) {
        byte[] bArr3 = ProfileVersion.f20904f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.f20905g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int d = (int) Encoding.d(fileInputStream, 2);
            byte[] c2 = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c2);
            try {
                DexProfileData[] g2 = g(byteArrayInputStream, bArr2, d, dexProfileDataArr);
                byteArrayInputStream.close();
                return g2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ProfileVersion.f20901a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int d2 = (int) Encoding.d(fileInputStream, 1);
        byte[] c3 = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c3);
        try {
            DexProfileData[] f2 = f(byteArrayInputStream2, d2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return f2;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static DexProfileData[] f(ByteArrayInputStream byteArrayInputStream, int i2, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int d = (int) Encoding.d(byteArrayInputStream, 2);
            iArr[i3] = (int) Encoding.d(byteArrayInputStream, 2);
            strArr[i3] = new String(Encoding.b(byteArrayInputStream, d), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            if (!dexProfileData.f20880b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            dexProfileData.e = i5;
            dexProfileData.f20884h = d(byteArrayInputStream, i5);
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i2 != dexProfileDataArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Encoding.d(byteArrayInputStream, 2);
            String str = new String(Encoding.b(byteArrayInputStream, (int) Encoding.d(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long d = Encoding.d(byteArrayInputStream, 4);
            int d2 = (int) Encoding.d(byteArrayInputStream, 2);
            DexProfileData dexProfileData = null;
            if (dexProfileDataArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(CertificateUtil.DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= dexProfileDataArr.length) {
                        break;
                    }
                    if (dexProfileDataArr[i4].f20880b.equals(substring)) {
                        dexProfileData = dexProfileDataArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (dexProfileData == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            dexProfileData.d = d;
            int[] d3 = d(byteArrayInputStream, d2);
            if (Arrays.equals(bArr, ProfileVersion.e)) {
                dexProfileData.e = d2;
                dexProfileData.f20884h = d3;
            }
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] h(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, ProfileVersion.f20902b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int d = (int) Encoding.d(fileInputStream, 1);
        byte[] c2 = Encoding.c(fileInputStream, (int) Encoding.d(fileInputStream, 4), (int) Encoding.d(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c2);
        try {
            DexProfileData[] i2 = i(byteArrayInputStream, str, d);
            byteArrayInputStream.close();
            return i2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static DexProfileData[] i(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int d = (int) Encoding.d(byteArrayInputStream, 2);
            int d2 = (int) Encoding.d(byteArrayInputStream, 2);
            dexProfileDataArr[i3] = new DexProfileData(str, new String(Encoding.b(byteArrayInputStream, d), StandardCharsets.UTF_8), Encoding.d(byteArrayInputStream, 4), d2, (int) Encoding.d(byteArrayInputStream, 4), (int) Encoding.d(byteArrayInputStream, 4), new int[d2], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            int available = byteArrayInputStream.available() - dexProfileData.f20882f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = dexProfileData.f20885i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) Encoding.d(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int d3 = (int) Encoding.d(byteArrayInputStream, 2); d3 > 0; d3--) {
                    Encoding.d(byteArrayInputStream, 2);
                    int d4 = (int) Encoding.d(byteArrayInputStream, 1);
                    if (d4 != 6 && d4 != 7) {
                        while (d4 > 0) {
                            Encoding.d(byteArrayInputStream, 1);
                            for (int d5 = (int) Encoding.d(byteArrayInputStream, 1); d5 > 0; d5--) {
                                Encoding.d(byteArrayInputStream, 2);
                            }
                            d4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            dexProfileData.f20884h = d(byteArrayInputStream, dexProfileData.e);
            int i6 = dexProfileData.f20883g;
            BitSet valueOf = BitSet.valueOf(Encoding.b(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = valueOf.get(c(2, i7, i6)) ? 2 : 0;
                if (valueOf.get(c(4, i7, i6))) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return dexProfileDataArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.f20901a;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.f20902b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] a2 = a(dexProfileDataArr, bArr3);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, a2.length, 4);
                byte[] a3 = Encoding.a(a2);
                Encoding.e(byteArrayOutputStream, a3.length, 4);
                byteArrayOutputStream.write(a3);
                return true;
            }
            byte[] bArr4 = ProfileVersion.d;
            if (Arrays.equals(bArr, bArr4)) {
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.f20885i.size() * 4;
                    String b2 = b(dexProfileData.f20879a, dexProfileData.f20880b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    Encoding.f(byteArrayOutputStream, b2.getBytes(charset).length);
                    Encoding.f(byteArrayOutputStream, dexProfileData.f20884h.length);
                    Encoding.e(byteArrayOutputStream, size, 4);
                    Encoding.e(byteArrayOutputStream, dexProfileData.f20881c, 4);
                    byteArrayOutputStream.write(b2.getBytes(charset));
                    Iterator it = dexProfileData.f20885i.keySet().iterator();
                    while (it.hasNext()) {
                        Encoding.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        Encoding.f(byteArrayOutputStream, 0);
                    }
                    for (int i3 : dexProfileData.f20884h) {
                        Encoding.f(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.f20903c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] a4 = a(dexProfileDataArr, bArr5);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, a4.length, 4);
                byte[] a5 = Encoding.a(a4);
                Encoding.e(byteArrayOutputStream, a5.length, 4);
                byteArrayOutputStream.write(a5);
                return true;
            }
            byte[] bArr6 = ProfileVersion.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            Encoding.f(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String b3 = b(dexProfileData2.f20879a, dexProfileData2.f20880b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                Encoding.f(byteArrayOutputStream, b3.getBytes(charset2).length);
                TreeMap treeMap = dexProfileData2.f20885i;
                Encoding.f(byteArrayOutputStream, treeMap.size());
                Encoding.f(byteArrayOutputStream, dexProfileData2.f20884h.length);
                Encoding.e(byteArrayOutputStream, dexProfileData2.f20881c, 4);
                byteArrayOutputStream.write(b3.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    Encoding.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : dexProfileData2.f20884h) {
                    Encoding.f(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            Encoding.f(byteArrayOutputStream2, dexProfileDataArr.length);
            int i5 = 2;
            int i6 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                Encoding.e(byteArrayOutputStream2, dexProfileData3.f20881c, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.d, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.f20883g, 4);
                String b4 = b(dexProfileData3.f20879a, dexProfileData3.f20880b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = b4.getBytes(charset3).length;
                Encoding.f(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(b4.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            for (int i8 = 0; i8 < dexProfileDataArr.length; i8++) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i8];
                    Encoding.f(byteArrayOutputStream3, i8);
                    Encoding.f(byteArrayOutputStream3, dexProfileData4.e);
                    i7 = i7 + 4 + (dexProfileData4.e * 2);
                    k(byteArrayOutputStream3, dexProfileData4);
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i9];
                    Iterator it3 = dexProfileData5.f20885i.entrySet().iterator();
                    int i11 = i2;
                    while (it3.hasNext()) {
                        i11 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m(byteArrayOutputStream4, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            n(byteArrayOutputStream4, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            Encoding.f(byteArrayOutputStream3, i9);
                            int length3 = byteArray3.length + i5 + byteArray4.length;
                            int i12 = i10 + 6;
                            ArrayList arrayList4 = arrayList3;
                            Encoding.e(byteArrayOutputStream3, length3, 4);
                            Encoding.f(byteArrayOutputStream3, i11);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i10 = i12 + length3;
                            i9++;
                            arrayList3 = arrayList4;
                            i2 = 0;
                            i5 = 2;
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
            if (i10 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + (arrayList2.size() * 16);
            Encoding.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i13);
                Encoding.e(byteArrayOutputStream, writableFileSection4.f20906a.f20889a, 4);
                Encoding.e(byteArrayOutputStream, size2, 4);
                boolean z2 = writableFileSection4.f20908c;
                byte[] bArr7 = writableFileSection4.f20907b;
                if (z2) {
                    long length4 = bArr7.length;
                    byte[] a6 = Encoding.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(a6);
                    Encoding.e(byteArrayOutputStream, a6.length, 4);
                    Encoding.e(byteArrayOutputStream, length4, 4);
                    length = a6.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    Encoding.e(byteArrayOutputStream, bArr7.length, 4);
                    Encoding.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i13++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i14));
            }
            return true;
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

    public static void k(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) {
        int i2 = 0;
        for (int i3 : dexProfileData.f20884h) {
            Integer valueOf = Integer.valueOf(i3);
            Encoding.f(byteArrayOutputStream, valueOf.intValue() - i2);
            i2 = valueOf.intValue();
        }
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) {
        Charset charset = StandardCharsets.UTF_8;
        Encoding.f(byteArrayOutputStream, str.getBytes(charset).length);
        Encoding.f(byteArrayOutputStream, dexProfileData.e);
        Encoding.e(byteArrayOutputStream, dexProfileData.f20882f, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.f20881c, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.f20883g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) {
        byte[] bArr = new byte[(((dexProfileData.f20883g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.f20885i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i2 = intValue2 & 2;
            int i3 = dexProfileData.f20883g;
            if (i2 != 0) {
                int c2 = c(2, intValue, i3);
                int i4 = c2 / 8;
                bArr[i4] = (byte) ((1 << (c2 % 8)) | bArr[i4]);
            }
            if ((intValue2 & 4) != 0) {
                int c3 = c(4, intValue, i3);
                int i5 = c3 / 8;
                bArr[i5] = (byte) ((1 << (c3 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) {
        int i2 = 0;
        for (Map.Entry entry : dexProfileData.f20885i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.f(byteArrayOutputStream, intValue - i2);
                Encoding.f(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }
}
