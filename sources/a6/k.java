package a6;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.collect.i1;
import com.google.common.collect.o2;
import com.google.common.collect.x1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.logging.Logger;
import ki.a0;
import ki.d0;
import ki.e0;
import ki.i0;
import ki.j0;
import ki.k0;
import ki.m0;
import ki.y;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f296e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Method f297f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f298g = false;

    /* renamed from: h, reason: collision with root package name */
    public static Field f299h;
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b, reason: collision with root package name */
    public static final int[][] f293b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    public static final int[][] f294c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f295d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f300i = {1, 2, 3, 6};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f301j = {48000, 44100, 32000};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f302k = {24000, 22050, 16000};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f303l = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f304m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f305n = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static boolean A(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = x1.f12053b;
            }
        } else if (iterable instanceof o2) {
            obj = ((i1) ((o2) iterable)).f11974f;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static int B(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(android.content.Context r5) {
        /*
            android.content.SharedPreferences r0 = com.facebook.appevents.g.n(r5)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            return
        Le:
            l.a r0 = new l.a
            r1 = 19
            r0.<init>(r1)
            java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r2 = r5.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            if (r3 == 0) goto L3e
            java.lang.String r2 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            if (r2 == 0) goto L3e
            android.os.Bundle r3 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            if (r3 == 0) goto L3e
            boolean r3 = r3.containsKey(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            if (r3 == 0) goto L3e
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            boolean r1 = r2.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            goto L3f
        L3e:
            r1 = 1
        L3f:
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r2 != 0) goto L4a
            r5 = 0
            com.google.android.gms.tasks.Tasks.forResult(r5)
            goto L5a
        L4a:
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            com.applovin.impl.ys r3 = new com.applovin.impl.ys
            r3.<init>(r5, r1, r2)
            r0.execute(r3)
            r2.getTask()
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.k.C(android.content.Context):void");
    }

    public static final Object D(Class clazz, Object obj, Method method, Object... args) {
        if (m6.a.b(k.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            m6.a.a(k.class, th2);
            return null;
        }
    }

    public static final boolean E(AssertionError assertionError) {
        boolean z10;
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z10 = StringsKt.d(message, "getsockname failed");
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static boolean F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("com.plantcare.ai.identifier.plantid", "packageName");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().processName, "com.plantcare.ai.identifier.plantid")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean G(int i10) {
        return i10 == -1;
    }

    public static Util$ParameterizedTypeImpl H(Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util$ParameterizedTypeImpl(null, List.class, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + List.class);
    }

    public static final ki.c I(Socket socket) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        j0 j0Var = new j0(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        a0 sink = new a0(outputStream, j0Var);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new ki.c(j0Var, sink);
    }

    public static a0 J(File file) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new a0(fileOutputStream, new m0());
    }

    public static int K(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int L(Object obj) {
        return K(obj == null ? 0 : obj.hashCode());
    }

    public static final ki.d M(File file) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ki.d(new FileInputStream(file), m0.f21003d);
    }

    public static final ki.d N(InputStream inputStream) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new ki.d(inputStream, new m0());
    }

    public static final ki.d O(Socket socket) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        j0 j0Var = new j0(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        ki.d source = new ki.d(inputStream, j0Var);
        Intrinsics.checkNotNullParameter(source, "source");
        return new ki.d(j0Var, source);
    }

    public static byte[] P(ic.d dVar) {
        int i10;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i11);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < min2) {
                int read = dVar.read(bArr, i12, min2 - i12);
                if (read == -1) {
                    return m(arrayDeque, i11);
                }
                i12 += read;
                i11 += read;
            }
            long j3 = min;
            if (min < 4096) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            long j10 = j3 * i10;
            if (j10 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j10 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j10;
            }
        }
        if (dVar.read() == -1) {
            return m(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final String Q(String str) {
        boolean z10;
        InetAddress n10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (StringsKt.d(str, ":")) {
            if (StringsKt.z(str, "[") && StringsKt.h(str, "]")) {
                n10 = n(str, 1, str.length() - 1);
            } else {
                n10 = n(str, 0, str.length());
            }
            if (n10 == null) {
                return null;
            }
            byte[] address = n10.getAddress();
            if (address.length == 16) {
                Intrinsics.checkNotNullExpressionValue(address, "address");
                int i12 = 0;
                int i13 = 0;
                while (i12 < address.length) {
                    int i14 = i12;
                    while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                        i14 += 2;
                    }
                    int i15 = i14 - i12;
                    if (i15 > i13 && i15 >= 4) {
                        i11 = i12;
                        i13 = i15;
                    }
                    i12 = i14 + 2;
                }
                ki.i iVar = new ki.i();
                while (i10 < address.length) {
                    if (i10 == i11) {
                        iVar.w(58);
                        i10 += i13;
                        if (i10 == 16) {
                            iVar.w(58);
                        }
                    } else {
                        if (i10 > 0) {
                            iVar.w(58);
                        }
                        byte b3 = address[i10];
                        byte[] bArr = xh.b.a;
                        iVar.T(((b3 & UByte.MAX_VALUE) << 8) | (address[i10 + 1] & UByte.MAX_VALUE));
                        i10 += 2;
                    }
                }
                return iVar.readUtf8();
            }
            if (address.length == 4) {
                return n10.getHostAddress();
            }
            throw new AssertionError(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("Invalid IPv6 address: '", str, '\''));
        }
        try {
            String ascii = IDN.toASCII(str);
            Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            int length = lowerCase.length();
            int i16 = 0;
            while (i16 < length) {
                int i17 = i16 + 1;
                char charAt = lowerCase.charAt(i16);
                if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0 && StringsKt.j(" #%/:?@[\\]", charAt, 0, 6) == -1) {
                    i16 = i17;
                }
                i10 = 1;
                break;
            }
            if (i10 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void b(String str, Exception exc) {
        if (jd.a.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static final StackTraceElement c(String str, Exception exc) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final a0 d(File file) {
        Logger logger = y.a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        return new a0(fileOutputStream, new m0());
    }

    public static final d0 e(i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        return new d0(i0Var);
    }

    public static final e0 f(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        return new e0(k0Var);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x01e6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(cd.a r20, hd.a r21, hd.c r22, int r23, e1.b r24) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.k.g(cd.a, hd.a, hd.c, int, e1.b):void");
    }

    public static int h(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i11);
            int i12 = i10 << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i12) >= numberOfLeadingZeros) {
                i12 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i12)) - numberOfLeadingZeros);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static Type l(Type type) {
        if (Collection.class.isAssignableFrom(Collection.class)) {
            Type f10 = zg.b.f(type, Collection.class, zg.b.c(type, Collection.class, Collection.class), new LinkedHashSet());
            if (f10 instanceof WildcardType) {
                f10 = ((WildcardType) f10).getUpperBounds()[0];
            }
            if (f10 instanceof ParameterizedType) {
                return ((ParameterizedType) f10).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] m(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress n(java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.k.n(java.lang.String, int, int):java.net.InetAddress");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o(n0.l r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = a6.k.f296e
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            a6.k.f297f = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            a6.k.f296e = r3
        L4c:
            java.lang.reflect.Method r1 = a6.k.f297f
            if (r1 == 0) goto L61
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L61
            r4[r0] = r10     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L61
            if (r8 != 0) goto L5b
            goto L61
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L61
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L61
        L61:
            if (r0 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = a6.k.f298g
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            a6.k.f299h = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            a6.k.f298g = r3
        L9a:
            java.lang.reflect.Field r7 = a6.k.f299h
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = androidx.core.view.ViewCompat.dispatchUnhandledKeyEventBeforeCallback(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.k.o(n0.l, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static void p(int i10, int i11, e1.b bVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (G(bVar.b(i13, i11))) {
                bVar.c(i13, i11, 0);
            } else {
                throw new ad.f();
            }
        }
    }

    public static void q(int i10, int i11, e1.b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.c(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void r(int i10, int i11, e1.b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (G(bVar.b(i10, i13))) {
                bVar.c(i10, i13, 0);
            } else {
                throw new ad.f();
            }
        }
    }

    public static boolean s(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return s(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof Util$ParameterizedTypeImpl) {
                actualTypeArguments = ((Util$ParameterizedTypeImpl) parameterizedType).f16748d;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof Util$ParameterizedTypeImpl) {
                actualTypeArguments2 = ((Util$ParameterizedTypeImpl) parameterizedType2).f16748d;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            if (s(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2)) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return s(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return s(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static final FloatBuffer t(int i10) {
        ByteBuffer order = ByteBuffer.allocateDirect(i10 * 4 * 1).order(ByteOrder.nativeOrder());
        order.limit(order.capacity());
        Intrinsics.checkNotNullExpressionValue(order, "allocateDirect(size * Egloo.SIZE_OF_BYTE)\n        .order(ByteOrder.nativeOrder())\n        .also { it.limit(it.capacity()) }");
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "byteBuffer(size * Egloo.SIZE_OF_FLOAT).asFloatBuffer()");
        return asFloatBuffer;
    }

    public static int u(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = f301j[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + f305n[i12]) * 2;
            }
            int i14 = f304m[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static final Class v(String className) {
        if (m6.a.b(k.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            m6.a.a(k.class, th2);
            return null;
        }
    }

    public static final Method w(Class clazz, String methodName, Class... args) {
        if (m6.a.b(k.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            m6.a.a(k.class, th2);
            return null;
        }
    }

    public static final Method x(Class clazz, String methodName, Class... args) {
        if (m6.a.b(k.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            m6.a.a(k.class, th2);
            return null;
        }
    }

    public static int y(int i10) {
        switch (i10) {
            case 1:
            case 2:
            default:
                return 0;
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
        }
    }

    public static Class z(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) z(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return z(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }
}
