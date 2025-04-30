package r8;

import M0.G;
import T.C0269f0;
import U4.C0308d;
import a0.C0326a;
import android.graphics.Point;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import u7.AbstractC2817h;
import w4.v0;
import w8.A;
import w8.C2911a;
import w8.C2912b;
import w8.p;
import w8.s;
import w8.t;
import w8.x;
import w8.y;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a */
    public static boolean f22947a = true;
    public static boolean b = false;

    public static void A(ViewGroup viewGroup, boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            G.b(viewGroup, z8);
        } else if (f22947a) {
            try {
                G.b(viewGroup, z8);
            } catch (NoSuchMethodError unused) {
                f22947a = false;
            }
        }
    }

    public static byte[] B(C0308d c0308d) {
        int i9;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(FragmentTransaction.TRANSIT_EXIT_MASK, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = c0308d.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return h(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j7 = min;
            if (min < 4096) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            long j9 = j7 * i9;
            if (j9 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j9 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j9;
            }
        }
        if (c0308d.read() == -1) {
            return h(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final long C(int i9, P7.c cVar) {
        G7.j.e(cVar, "unit");
        if (cVar.compareTo(P7.c.SECONDS) <= 0) {
            return k(v0.g(i9, cVar, P7.c.NANOSECONDS));
        }
        return D(i9, cVar);
    }

    public static final long D(long j7, P7.c cVar) {
        G7.j.e(cVar, "unit");
        P7.c cVar2 = P7.c.NANOSECONDS;
        long g9 = v0.g(4611686018426999999L, cVar2, cVar);
        if ((-g9) <= j7 && j7 <= g9) {
            return k(v0.g(j7, cVar, cVar2));
        }
        P7.c cVar3 = P7.c.MILLISECONDS;
        G7.j.e(cVar3, "targetUnit");
        return i(e1.f.e(cVar3.b.convert(j7, cVar.b)));
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

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final long c(String str) {
        int i9;
        boolean z8;
        P7.c cVar;
        long j7;
        char charAt;
        int length = str.length();
        if (length != 0) {
            int i10 = P7.a.f2440f;
            char charAt2 = str.charAt(0);
            if (charAt2 == '+' || charAt2 == '-') {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (i9 > 0 && str.length() > 0 && com.facebook.appevents.g.g(str.charAt(0), '-', false)) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (length > i9) {
                if (str.charAt(i9) == 'P') {
                    int i11 = i9 + 1;
                    if (i11 != length) {
                        P7.c cVar2 = null;
                        long j9 = 0;
                        boolean z9 = false;
                        while (i11 < length) {
                            if (str.charAt(i11) == 'T') {
                                if (!z9 && (i11 = i11 + 1) != length) {
                                    z9 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i12 = i11;
                                while (i12 < str.length() && (('0' <= (charAt = str.charAt(i12)) && charAt < ':') || O7.g.D("+-.", charAt))) {
                                    i12++;
                                }
                                String substring = str.substring(i11, i12);
                                G7.j.d(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = substring.length() + i11;
                                    if (length2 >= 0 && length2 < str.length()) {
                                        char charAt3 = str.charAt(length2);
                                        int i13 = length2 + 1;
                                        if (!z9) {
                                            if (charAt3 == 'D') {
                                                cVar = P7.c.DAYS;
                                            } else {
                                                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                                            }
                                        } else if (charAt3 == 'H') {
                                            cVar = P7.c.HOURS;
                                        } else if (charAt3 == 'M') {
                                            cVar = P7.c.MINUTES;
                                        } else if (charAt3 == 'S') {
                                            cVar = P7.c.SECONDS;
                                        } else {
                                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                                        }
                                        if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int I5 = O7.g.I(substring, '.', 0, false, 6);
                                        if (cVar == P7.c.SECONDS && I5 > 0) {
                                            String substring2 = substring.substring(0, I5);
                                            G7.j.d(substring2, "substring(...)");
                                            long e4 = P7.a.e(j9, D(v(substring2), cVar));
                                            String substring3 = substring.substring(I5);
                                            G7.j.d(substring3, "substring(...)");
                                            double parseDouble = Double.parseDouble(substring3);
                                            double f9 = v0.f(parseDouble, cVar, P7.c.NANOSECONDS);
                                            if (!Double.isNaN(f9)) {
                                                if (!Double.isNaN(f9)) {
                                                    long round = Math.round(f9);
                                                    if (-4611686018426999999L <= round && round < 4611686018427000000L) {
                                                        j7 = k(round);
                                                    } else {
                                                        double f10 = v0.f(parseDouble, cVar, P7.c.MILLISECONDS);
                                                        if (!Double.isNaN(f10)) {
                                                            j7 = j(Math.round(f10));
                                                        } else {
                                                            throw new IllegalArgumentException("Cannot round NaN value.");
                                                        }
                                                    }
                                                    j9 = P7.a.e(e4, j7);
                                                } else {
                                                    throw new IllegalArgumentException("Cannot round NaN value.");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
                                            }
                                        } else {
                                            j9 = P7.a.e(j9, D(v(substring), cVar));
                                        }
                                        cVar2 = cVar;
                                        i11 = i13;
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                        if (z8) {
                            long j10 = ((-(j9 >> 1)) << 1) + (((int) j9) & 1);
                            int i14 = P7.b.f2441a;
                            return j10;
                        }
                        return j9;
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    public static final C2911a d(File file) {
        Logger logger = p.f24030a;
        G7.j.e(file, "<this>");
        return new C2911a(1, new FileOutputStream(file, true), new Object());
    }

    public static final s e(x xVar) {
        G7.j.e(xVar, "<this>");
        return new s(xVar);
    }

    public static final t f(y yVar) {
        G7.j.e(yVar, "<this>");
        return new t(yVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N7.g, java.lang.Object, w7.f] */
    public static final void g(View view) {
        G7.j.e(view, "<this>");
        C0269f0 c0269f0 = new C0269f0(view, null);
        ?? obj = new Object();
        obj.f2132f = F2.h.i(c0269f0, obj, obj);
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            C0326a c0326a = (C0326a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0326a == null) {
                c0326a = new C0326a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c0326a);
            }
            ArrayList arrayList = c0326a.f3910a;
            int A8 = AbstractC2817h.A(arrayList);
            if (-1 < A8) {
                o.v(arrayList.get(A8));
                throw null;
            }
        }
    }

    public static byte[] h(ArrayDeque arrayDeque, int i9) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i9) {
            return bArr;
        }
        int length = i9 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i9);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i9 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static final long i(long j7) {
        long j9 = (j7 << 1) + 1;
        int i9 = P7.a.f2440f;
        int i10 = P7.b.f2441a;
        return j9;
    }

    public static final long j(long j7) {
        if (-4611686018426L <= j7 && j7 < 4611686018427L) {
            return k(j7 * 1000000);
        }
        return i(e1.f.e(j7));
    }

    public static final long k(long j7) {
        long j9 = j7 << 1;
        int i9 = P7.a.f2440f;
        int i10 = P7.b.f2441a;
        return j9;
    }

    public static int l(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < 6; i10++) {
            int ceil = (int) Math.ceil(fArr[i10]);
            iArr[i10] = ceil;
            if (i9 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i9 = ceil;
            }
            if (i9 == ceil) {
                bArr[i10] = (byte) (bArr[i10] + 1);
            }
        }
        return i9;
    }

    public static i8.x m(String str) {
        G7.j.e(str, "<this>");
        Matcher matcher = i8.x.f20893c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            G7.j.d(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            G7.j.d(locale, "US");
            G7.j.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            G7.j.d(group2, "typeSubtype.group(2)");
            G7.j.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = i8.x.f20894d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (O7.o.C(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            G7.j.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    G7.j.d(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(L.k(sb, str, '\"').toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new i8.x(str, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    public static final /* synthetic */ Point n(View view) {
        G7.j.e(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static void o(char c9) {
        String hexString = Integer.toHexString(c9);
        throw new IllegalArgumentException("Illegal character: " + c9 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static final boolean p(AssertionError assertionError) {
        boolean E8;
        Logger logger = p.f24030a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message == null) {
            E8 = false;
        } else {
            E8 = O7.g.E("getsockname failed", message);
        }
        if (!E8) {
            return false;
        }
        return true;
    }

    public static boolean q(char c9) {
        if (c9 >= '0' && c9 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean r(char c9) {
        if (c9 >= 128 && c9 <= 255) {
            return true;
        }
        return false;
    }

    public static boolean s(char c9) {
        if (c9 != '\r' && c9 != '*' && c9 != '>' && c9 != ' ') {
            if (c9 < '0' || c9 > '9') {
                if (c9 < 'A' || c9 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e1, code lost:
    
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int t(java.lang.CharSequence r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.k.t(java.lang.CharSequence, int, int):int");
    }

    public static i8.x u(String str) {
        G7.j.e(str, "<this>");
        try {
            return m(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final long v(String str) {
        int i9;
        int length = str.length();
        if (length > 0 && O7.g.D("+-", str.charAt(0))) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (length - i9 > 16) {
            Iterable aVar = new L7.a(i9, O7.g.G(str), 1);
            if (!(aVar instanceof Collection) || !((Collection) aVar).isEmpty()) {
                Iterator it = aVar.iterator();
                while (((L7.b) it).f1833d) {
                    char charAt = str.charAt(((L7.b) it).a());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (O7.o.C(str, "+", false)) {
            str = O7.g.F(1, str);
        }
        return Long.parseLong(str);
    }

    public static final C2911a w(Socket socket) {
        Logger logger = p.f24030a;
        m8.h hVar = new m8.h(socket, 2);
        OutputStream outputStream = socket.getOutputStream();
        G7.j.d(outputStream, "getOutputStream()");
        return new C2911a(0, hVar, new C2911a(1, outputStream, hVar));
    }

    public static C2911a x(File file) {
        Logger logger = p.f24030a;
        G7.j.e(file, "<this>");
        return new C2911a(1, new FileOutputStream(file, false), new Object());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [w8.A, java.lang.Object] */
    public static final C2912b y(InputStream inputStream) {
        Logger logger = p.f24030a;
        G7.j.e(inputStream, "<this>");
        return new C2912b(inputStream, (A) new Object());
    }

    public static final C2912b z(Socket socket) {
        Logger logger = p.f24030a;
        m8.h hVar = new m8.h(socket, 2);
        InputStream inputStream = socket.getInputStream();
        G7.j.d(inputStream, "getInputStream()");
        return new C2912b(hVar, new C2912b(inputStream, hVar));
    }
}
