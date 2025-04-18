package p6;

import a1.e;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Base64;
import c1.c;
import c1.d;
import com.adjust.sdk.Constants;
import com.applovin.impl.mediation.h;
import com.facebook.b;
import com.facebook.x;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import d6.g;
import eb.j;
import j.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ka.w;
import ki.o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import n0.s1;
import u1.k;
import y0.u0;

/* loaded from: classes3.dex */
public abstract class a implements s1 {
    public static final int[] a = {R.attr.theme, com.plantcare.ai.identifier.plantid.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f23478b = {com.plantcare.ai.identifier.plantid.R.attr.materialThemeOverlay};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23479c = {112, 114, 111, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f23480d = {112, 114, 109, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final b f23481e = new b(27);

    public static void A(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        int i10 = 0;
        for (int i11 : bVar.f25430h) {
            Integer valueOf = Integer.valueOf(i11);
            g.O(byteArrayOutputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static void B(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar, String str) {
        g.O(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        g.O(byteArrayOutputStream, bVar.f25427e);
        g.N(byteArrayOutputStream, bVar.f25428f, 4);
        g.N(byteArrayOutputStream, bVar.f25425c, 4);
        g.N(byteArrayOutputStream, bVar.f25429g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void C(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        byte[] bArr = new byte[((((bVar.f25429g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry entry : bVar.f25431i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i10 = intValue2 & 2;
            int i11 = bVar.f25429g;
            if (i10 != 0) {
                int l10 = l(2, intValue, i11);
                int i12 = l10 / 8;
                bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
            }
            if ((intValue2 & 4) != 0) {
                int l11 = l(4, intValue, i11);
                int i13 = l11 / 8;
                bArr[i13] = (byte) ((1 << (l11 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void D(ByteArrayOutputStream byteArrayOutputStream, u1.b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.f25431i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                g.O(byteArrayOutputStream, intValue - i10);
                g.O(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static c d(z0.a aVar, List migrations, CoroutineScope scope, b1.a produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        e storage = new e(o.a, new d(produceFile, 0));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        y0.c cVar = aVar;
        if (aVar == null) {
            cVar = new b6.a();
        }
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new c(new c(new u0(storage, CollectionsKt.listOf(new y0.e(migrations, null)), cVar, scope)));
    }

    public static byte[] e(u1.b[] bVarArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (u1.b bVar : bVarArr) {
            i11 += (((((bVar.f25429g * 2) + 8) - 1) & (-8)) / 8) + (bVar.f25427e * 2) + h(bVar.a, bArr, bVar.f25424b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f25428f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, v8.u0.f26311q)) {
            int length = bVarArr.length;
            while (i10 < length) {
                u1.b bVar2 = bVarArr[i10];
                B(byteArrayOutputStream, bVar2, h(bVar2.a, bArr, bVar2.f25424b));
                D(byteArrayOutputStream, bVar2);
                A(byteArrayOutputStream, bVar2);
                C(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (u1.b bVar3 : bVarArr) {
                B(byteArrayOutputStream, bVar3, h(bVar3.a, bArr, bVar3.f25424b));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                u1.b bVar4 = bVarArr[i10];
                D(byteArrayOutputStream, bVar4);
                A(byteArrayOutputStream, bVar4);
                C(byteArrayOutputStream, bVar4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static String h(String str, byte[] bArr, String str2) {
        Object obj;
        byte[] bArr2 = v8.u0.f26313s;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = v8.u0.f26312r;
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
                str2 = str2.replace("!", ":");
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
            StringBuilder m10 = j.m(str);
            if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                str3 = ":";
            }
            return vd.e.h(m10, str3, str2);
        }
        if ("!".equals(obj)) {
            return str2.replace(":", "!");
        }
        if (":".equals(obj)) {
            str2 = str2.replace("!", ":");
        }
        return str2;
    }

    public static final PublicKey j(String key) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        Intrinsics.checkNotNullParameter(key, "key");
        replace$default = StringsKt__StringsJVMKt.replace$default(key, "\n", "", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null);
        replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "-----END PUBLIC KEY-----", "", false, 4, (Object) null);
        byte[] decode = Base64.decode(replace$default3, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String k(String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        x xVar = x.a;
        URL url = new URL(Constants.SCHEME, Intrinsics.stringPlus("www.", x.f11437q), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        x.c().execute(new h(url, objectRef, kid, reentrantLock, newCondition, 2));
        reentrantLock.lock();
        try {
            newCondition.await(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) objectRef.element;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw new IllegalStateException(j.i("Unexpected flag: ", i10));
            }
            return i11;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    public static int[] q(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += g.D(byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static u1.b[] r(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, u1.b[] bVarArr) {
        byte[] bArr3 = v8.u0.f26314t;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(v8.u0.f26309o, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int C = (int) g.C(fileInputStream, 1);
                    byte[] B = g.B(fileInputStream, (int) g.C(fileInputStream, 4), (int) g.C(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(B);
                        try {
                            u1.b[] s5 = s(byteArrayInputStream, C, bVarArr);
                            byteArrayInputStream.close();
                            return s5;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, v8.u0.u)) {
            int D = g.D(fileInputStream);
            byte[] B2 = g.B(fileInputStream, (int) g.C(fileInputStream, 4), (int) g.C(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(B2);
                try {
                    u1.b[] t5 = t(byteArrayInputStream2, bArr2, D, bVarArr);
                    byteArrayInputStream2.close();
                    return t5;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static u1.b[] s(ByteArrayInputStream byteArrayInputStream, int i10, u1.b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int D = g.D(byteArrayInputStream);
                iArr[i11] = g.D(byteArrayInputStream);
                strArr[i11] = new String(g.A(byteArrayInputStream, D), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                u1.b bVar = bVarArr[i12];
                if (bVar.f25424b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f25427e = i13;
                    bVar.f25430h = q(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static u1.b[] t(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, u1.b[] bVarArr) {
        u1.b bVar;
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                g.D(byteArrayInputStream);
                String str2 = new String(g.A(byteArrayInputStream, g.D(byteArrayInputStream)), StandardCharsets.UTF_8);
                long C = g.C(byteArrayInputStream, 4);
                int D = g.D(byteArrayInputStream);
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i12 = 0; i12 < bVarArr.length; i12++) {
                        if (bVarArr[i12].f25424b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    bVar.f25426d = C;
                    int[] q10 = q(byteArrayInputStream, D);
                    if (Arrays.equals(bArr, v8.u0.f26313s)) {
                        bVar.f25427e = D;
                        bVar.f25430h = q10;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static u1.b[] u(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, v8.u0.f26310p)) {
            int C = (int) g.C(fileInputStream, 1);
            byte[] B = g.B(fileInputStream, (int) g.C(fileInputStream, 4), (int) g.C(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(B);
                try {
                    u1.b[] v10 = v(byteArrayInputStream, str, C);
                    byteArrayInputStream.close();
                    return v10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static u1.b[] v(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new u1.b[0];
        }
        u1.b[] bVarArr = new u1.b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int D = g.D(byteArrayInputStream);
            int D2 = g.D(byteArrayInputStream);
            bVarArr[i11] = new u1.b(str, new String(g.A(byteArrayInputStream, D), StandardCharsets.UTF_8), g.C(byteArrayInputStream, 4), D2, (int) g.C(byteArrayInputStream, 4), (int) g.C(byteArrayInputStream, 4), new int[D2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            u1.b bVar = bVarArr[i12];
            int available = byteArrayInputStream.available() - bVar.f25428f;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f25431i;
                if (available2 <= available) {
                    break;
                }
                i13 += g.D(byteArrayInputStream);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int D3 = g.D(byteArrayInputStream); D3 > 0; D3--) {
                    g.D(byteArrayInputStream);
                    int C = (int) g.C(byteArrayInputStream, 1);
                    if (C != 6 && C != 7) {
                        while (C > 0) {
                            g.C(byteArrayInputStream, 1);
                            for (int C2 = (int) g.C(byteArrayInputStream, 1); C2 > 0; C2--) {
                                g.D(byteArrayInputStream);
                            }
                            C--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f25430h = q(byteArrayInputStream, bVar.f25427e);
                int i14 = bVar.f25429g;
                BitSet valueOf = BitSet.valueOf(g.A(byteArrayInputStream, ((((i14 * 2) + 8) - 1) & (-8)) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 2;
                    if (!valueOf.get(l(2, i15, i14))) {
                        i16 = 0;
                    }
                    if (valueOf.get(l(4, i15, i14))) {
                        i16 |= 4;
                    }
                    if (i16 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static h.c w(int i10, x4.a aVar) {
        return new h.c(new m0.d(i10), aVar, f23481e);
    }

    public static boolean x(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, u1.b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = v8.u0.f26309o;
        int i10 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                g.O(byteArrayOutputStream2, bVarArr.length);
                int i11 = 2;
                int i12 = 2;
                for (u1.b bVar : bVarArr) {
                    g.N(byteArrayOutputStream2, bVar.f25425c, 4);
                    g.N(byteArrayOutputStream2, bVar.f25426d, 4);
                    g.N(byteArrayOutputStream2, bVar.f25429g, 4);
                    String h10 = h(bVar.a, bArr2, bVar.f25424b);
                    int length2 = h10.getBytes(StandardCharsets.UTF_8).length;
                    g.O(byteArrayOutputStream2, length2);
                    i12 = i12 + 4 + 4 + 4 + 2 + (length2 * 1);
                    byteArrayOutputStream2.write(h10.getBytes(StandardCharsets.UTF_8));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i12 == byteArray.length) {
                    k kVar = new k(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(kVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i13 = 0;
                    for (int i14 = 0; i14 < bVarArr.length; i14++) {
                        try {
                            u1.b bVar2 = bVarArr[i14];
                            g.O(byteArrayOutputStream3, i14);
                            g.O(byteArrayOutputStream3, bVar2.f25427e);
                            i13 = i13 + 2 + 2 + (bVar2.f25427e * 2);
                            A(byteArrayOutputStream3, bVar2);
                        } finally {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        k kVar2 = new k(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(kVar2);
                        byteArrayOutputStream2 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < bVarArr.length) {
                            try {
                                u1.b bVar3 = bVarArr[i15];
                                Iterator it = bVar3.f25431i.entrySet().iterator();
                                int i17 = i10;
                                while (it.hasNext()) {
                                    i17 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    C(byteArrayOutputStream4, bVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        D(byteArrayOutputStream4, bVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        g.O(byteArrayOutputStream2, i15);
                                        int length3 = byteArray3.length + i11 + byteArray4.length;
                                        int i18 = i16 + 2 + 4;
                                        ArrayList arrayList4 = arrayList3;
                                        g.N(byteArrayOutputStream2, length3, 4);
                                        g.O(byteArrayOutputStream2, i17);
                                        byteArrayOutputStream2.write(byteArray3);
                                        byteArrayOutputStream2.write(byteArray4);
                                        i16 = i18 + length3;
                                        i15++;
                                        arrayList3 = arrayList4;
                                        i10 = 0;
                                        i11 = 2;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream2.toByteArray();
                        if (i16 == byteArray5.length) {
                            k kVar3 = new k(4, byteArray5, true);
                            byteArrayOutputStream2.close();
                            arrayList2.add(kVar3);
                            long j3 = 4;
                            long size = j3 + j3 + 4 + (arrayList2.size() * 16);
                            g.N(byteArrayOutputStream, arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                k kVar4 = (k) arrayList2.get(i19);
                                g.N(byteArrayOutputStream, kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.b(kVar4.a), 4);
                                g.N(byteArrayOutputStream, size, 4);
                                boolean z10 = kVar4.f25442c;
                                byte[] bArr3 = kVar4.f25441b;
                                if (z10) {
                                    long length4 = bArr3.length;
                                    byte[] f10 = g.f(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(f10);
                                    g.N(byteArrayOutputStream, f10.length, 4);
                                    g.N(byteArrayOutputStream, length4, 4);
                                    length = f10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    g.N(byteArrayOutputStream, bArr3.length, 4);
                                    g.N(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray.length);
            } finally {
                try {
                    byteArrayOutputStream2.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        byte[] bArr4 = v8.u0.f26310p;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] e2 = e(bVarArr, bArr4);
            g.N(byteArrayOutputStream, bVarArr.length, 1);
            g.N(byteArrayOutputStream, e2.length, 4);
            byte[] f11 = g.f(e2);
            g.N(byteArrayOutputStream, f11.length, 4);
            byteArrayOutputStream.write(f11);
            return true;
        }
        byte[] bArr5 = v8.u0.f26312r;
        if (Arrays.equals(bArr, bArr5)) {
            g.N(byteArrayOutputStream, bVarArr.length, 1);
            for (u1.b bVar4 : bVarArr) {
                int size2 = bVar4.f25431i.size() * 4;
                String h11 = h(bVar4.a, bArr5, bVar4.f25424b);
                g.O(byteArrayOutputStream, h11.getBytes(StandardCharsets.UTF_8).length);
                g.O(byteArrayOutputStream, bVar4.f25430h.length);
                g.N(byteArrayOutputStream, size2, 4);
                g.N(byteArrayOutputStream, bVar4.f25425c, 4);
                byteArrayOutputStream.write(h11.getBytes(StandardCharsets.UTF_8));
                Iterator it2 = bVar4.f25431i.keySet().iterator();
                while (it2.hasNext()) {
                    g.O(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    g.O(byteArrayOutputStream, 0);
                }
                for (int i21 : bVar4.f25430h) {
                    g.O(byteArrayOutputStream, i21);
                }
            }
            return true;
        }
        byte[] bArr6 = v8.u0.f26311q;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] e10 = e(bVarArr, bArr6);
            g.N(byteArrayOutputStream, bVarArr.length, 1);
            g.N(byteArrayOutputStream, e10.length, 4);
            byte[] f12 = g.f(e10);
            g.N(byteArrayOutputStream, f12.length, 4);
            byteArrayOutputStream.write(f12);
            return true;
        }
        byte[] bArr7 = v8.u0.f26313s;
        if (Arrays.equals(bArr, bArr7)) {
            g.O(byteArrayOutputStream, bVarArr.length);
            for (u1.b bVar5 : bVarArr) {
                String h12 = h(bVar5.a, bArr7, bVar5.f25424b);
                g.O(byteArrayOutputStream, h12.getBytes(StandardCharsets.UTF_8).length);
                TreeMap treeMap = bVar5.f25431i;
                g.O(byteArrayOutputStream, treeMap.size());
                g.O(byteArrayOutputStream, bVar5.f25430h.length);
                g.N(byteArrayOutputStream, bVar5.f25425c, 4);
                byteArrayOutputStream.write(h12.getBytes(StandardCharsets.UTF_8));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    g.O(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i22 : bVar5.f25430h) {
                    g.O(byteArrayOutputStream, i22);
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean y(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Context z(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f23478b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof f) && ((f) context).a == resourceId) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (resourceId != 0 && !z10) {
            f fVar = new f(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                fVar.getTheme().applyStyle(resourceId2, true);
            }
            return fVar;
        }
        return context;
    }

    @Override // n0.s1
    public void a() {
    }

    @Override // n0.s1
    public void b() {
    }

    public l8.b f(l8.d dVar) {
        boolean z10;
        ByteBuffer byteBuffer = dVar.f26890f;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.d(z10);
        if (dVar.d()) {
            return null;
        }
        return g(dVar, byteBuffer);
    }

    public abstract l8.b g(l8.d dVar, ByteBuffer byteBuffer);

    public abstract void i(w wVar, float f10, float f11, float f12);

    public abstract Object m();

    public abstract void n(int i10);

    public abstract void o(Typeface typeface, boolean z10);

    public abstract void p(a4.a aVar, a4.w wVar);
}
