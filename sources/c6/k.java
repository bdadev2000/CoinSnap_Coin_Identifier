package c6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import android.util.TypedValue;
import androidx.appcompat.widget.k1;
import androidx.core.app.NotificationCompat;
import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import n9.h0;
import org.xmlpull.v1.XmlPullParser;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2645e = false;

    /* renamed from: n, reason: collision with root package name */
    public static o5.a f2654n = null;

    /* renamed from: o, reason: collision with root package name */
    public static int f2655o = 10;

    /* renamed from: p, reason: collision with root package name */
    public static int f2656p = 10;

    /* renamed from: q, reason: collision with root package name */
    public static int f2657q = 10;

    /* renamed from: r, reason: collision with root package name */
    public static int f2658r = 10;
    public static final String[] a = {"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"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2642b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2643c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2644d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f2646f = {0, 0, 0, 1};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2647g = {"", "A", "B", "C"};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2648h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f2649i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f2650j = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2651k = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2652l = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2653m = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int A(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & UByte.MAX_VALUE;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & UShort.MAX_VALUE;
        }
        return ((int[]) obj)[i10];
    }

    public static void B(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static String C(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String D(String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static float E(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? (f12 / 2.0f) + f11 : f10;
    }

    public static float a(int i10, float f10, float f11) {
        return (Math.max(0, i10 - 1) * f11) + f10;
    }

    public static float b(int i10, float f10, float f11) {
        return i10 > 0 ? (f11 / 2.0f) + f10 : f10;
    }

    public static void c(String str) {
        if (h0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static int d(int i10, int i11, int[] iArr) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int e(long[] jArr, int i10, long j3) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = jArr[i13];
            if (j10 < j3) {
                i12 = i13 + 1;
            } else {
                if (j10 <= j3) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static String f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String g(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        char c10;
        Object[] objArr = new Object[5];
        objArr[0] = f2647g[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        if (z10) {
            c10 = 'H';
        } else {
            c10 = 'L';
        }
        objArr[3] = Character.valueOf(c10);
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(h0.k("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static final String h(String str) {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(1, md.digest()).toString(16)");
            CloseableKt.closeFinally(bufferedInputStream, null);
            return bigInteger;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = a;
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(strArr[i10], 0))));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Field field = Class.forName("android.content.pm.Checksum").getField("TYPE_WHOLE_MD5");
            Intrinsics.checkNotNullExpressionValue(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get(null);
            Class<?> cls = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Object newProxyInstance = Proxy.newProxyInstance(k.class.getClassLoader(), new Class[]{cls}, new j(obj, objectRef, reentrantLock, newCondition));
            Intrinsics.checkNotNullExpressionValue(newProxyInstance, "var resultChecksum: String? = null\n    val lock = ReentrantLock()\n    val checksumReady = lock.newCondition()\n    lock.lock()\n\n    try {\n      val checksumClass = Class.forName(\"android.content.pm.Checksum\")\n      val typeWholeMd5Field: Field = checksumClass.getField(\"TYPE_WHOLE_MD5\")\n      val TYPE_WHOLE_MD5 = typeWholeMd5Field.get(null)\n      val checksumReadyListenerClass =\n          Class.forName(\"android.content.pm.PackageManager\\$OnChecksumsReadyListener\")\n      val listener: Any =\n          Proxy.newProxyInstance(\n              HashUtils::class.java.classLoader,\n              arrayOf(checksumReadyListenerClass),\n              object : InvocationHandler {\n                override operator fun invoke(o: Any?, method: Method, objects: Array<Any>): Any? {\n                  try {\n                    if (method.name == \"onChecksumsReady\" &&\n                        objects.size == 1 &&\n                        objects[0] is List<*>) {\n                      val list = objects[0] as List<*>\n                      for (c in list) {\n                        if (c != null) {\n                          val getSplitNameMethod: Method = c.javaClass.getMethod(\"getSplitName\")\n                          val getTypeMethod: Method = c.javaClass.getMethod(\"getType\")\n                          if (getSplitNameMethod.invoke(c) == null &&\n                              getTypeMethod.invoke(c) == TYPE_WHOLE_MD5) {\n                            val getValueMethod: Method = c.javaClass.getMethod(\"getValue\")\n                            val checksumValue = getValueMethod.invoke(c) as ByteArray\n                            resultChecksum = BigInteger(1, checksumValue).toString(16)\n                            lock.lock()\n                            try {\n                              checksumReady.signalAll()\n                            } finally {\n                              lock.unlock()\n                            }\n                            return null\n                          }\n                        }\n                      }\n                    }\n                  } catch (t: Throwable) {\n                    Log.d(TAG, \"Can't fetch checksum.\", t)\n                  }\n                  return null\n                }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls);
            Intrinsics.checkNotNullExpressionValue(method, "PackageManager::class\n              .java\n              .getMethod(\n                  \"requestChecksums\",\n                  String::class.java,\n                  Boolean::class.javaPrimitiveType,\n                  Int::class.javaPrimitiveType,\n                  MutableList::class.java,\n                  checksumReadyListenerClass)");
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, CollectionsKt.toMutableList((Collection) mutableList), newProxyInstance);
            newCondition.await();
            String str = (String) objectRef.element;
            reentrantLock.unlock();
            return str;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    public static Object j(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(a4.j.c(52, "must be power of 2 between 2^1 and 2^30: ", i10));
    }

    public static void k() {
        if (h0.a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean l(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != str2.charAt(i10) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ColorStateList n(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && k1.z(drawable)) {
            return ba.a.d(k1.l(drawable));
        }
        return null;
    }

    public static Object o(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object p(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static float q(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (java.lang.Integer.parseInt(r9) == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.c r(java.lang.String r20) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = v8.u0.N(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld6
            com.google.common.collect.n0 r2 = com.google.common.collect.r0.f12026c
            com.google.common.collect.z1 r2 = com.google.common.collect.z1.f12062g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = v8.u0.N(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = c6.k.f2642b
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L4d
            r9 = r2[r7]
            java.lang.String r9 = v8.u0.w(r0, r9)
            if (r9 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r7 = r6
        L4e:
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = c6.k.f2643c
            r7 = r6
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = v8.u0.w(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = c6.k.f2644d
        L6f:
            r9 = 2
            if (r6 >= r9) goto L9c
            r9 = r2[r6]
            java.lang.String r9 = v8.u0.w(r0, r9)
            if (r9 == 0) goto L99
            long r12 = java.lang.Long.parseLong(r9)
            d8.b r2 = new d8.b
            java.lang.String r15 = "image/jpeg"
            r16 = 0
            r18 = 0
            r14 = r2
            r14.<init>(r15, r16, r18)
            d8.b r6 = new d8.b
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10 = r6
            r10.<init>(r11, r12, r14)
            com.google.common.collect.z1 r2 = com.google.common.collect.r0.p(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L6f
        L9c:
            com.google.common.collect.n0 r2 = com.google.common.collect.r0.f12026c
            com.google.common.collect.z1 r2 = com.google.common.collect.z1.f12062g
        La0:
            r6 = r7
            goto Lc3
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = v8.u0.N(r0, r8)
            if (r8 == 0) goto Lb3
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.google.common.collect.z1 r2 = s(r0, r2, r8)
            goto Lc3
        Lb3:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = v8.u0.N(r0, r8)
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.google.common.collect.z1 r2 = s(r0, r2, r8)
        Lc3:
            boolean r8 = v8.u0.J(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld0
            return r3
        Ld0:
            androidx.recyclerview.widget.c r0 = new androidx.recyclerview.widget.c
            r0.<init>(r6, r2)
            return r0
        Ld6:
            java.lang.String r0 = "Couldn't find xmp metadata"
            s7.x1 r0 = s7.x1.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.k.r(java.lang.String):androidx.recyclerview.widget.c");
    }

    public static z1 s(XmlPullParser xmlPullParser, String str, String str2) {
        long j3;
        long j10;
        n0 n0Var = r0.f12026c;
        m0 m0Var = new m0();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (u0.N(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String w10 = u0.w(xmlPullParser, concat3);
                String w11 = u0.w(xmlPullParser, concat4);
                String w12 = u0.w(xmlPullParser, concat5);
                String w13 = u0.w(xmlPullParser, concat6);
                if (w10 != null && w11 != null) {
                    if (w12 != null) {
                        j3 = Long.parseLong(w12);
                    } else {
                        j3 = 0;
                    }
                    if (w13 != null) {
                        j10 = Long.parseLong(w13);
                    } else {
                        j10 = 0;
                    }
                    m0Var.u(new d8.b(w10, j3, j10));
                } else {
                    return z1.f12062g;
                }
            }
        } while (!u0.J(xmlPullParser, concat2));
        return m0Var.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList t(n9.x r29) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.k.t(n9.x):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        B(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int u(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = a6.k.L(r9)
            r1 = r0 & r11
            int r2 = A(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3a
            r7 = r14[r2]
            boolean r7 = v8.u0.t(r9, r7)
            if (r7 == 0) goto L3a
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = v8.u0.t(r10, r7)
            if (r7 == 0) goto L3a
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            B(r1, r9, r12)
            goto L39
        L32:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L39:
            return r2
        L3a:
            r5 = r6 & r11
            if (r5 != 0) goto L3f
            return r3
        L3f:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.k.u(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static TypedValue v(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean w(Context context, int i10, boolean z10) {
        TypedValue v10 = v(context, i10);
        if (v10 != null && v10.type == 18) {
            if (v10.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static h9.f x(h9.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (h9.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                h9.f fVar2 = new h9.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((h9.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((h9.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((h9.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    public static TypedValue y(Context context, int i10, String str) {
        TypedValue v10 = v(context, i10);
        if (v10 != null) {
            return v10;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i10)));
    }

    public static void z(List list, ra.j jVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (jVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }
}
