package wh;

import android.os.Build;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinMediationProvider;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class c0 {
    public final int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    public static final boolean a(ki.b0 b0Var) {
        boolean endsWith;
        ki.b0 b0Var2 = li.f.f21387c;
        endsWith = StringsKt__StringsJVMKt.endsWith(b0Var.b(), ".class", true);
        return !endsWith;
    }

    public static void b(StringBuilder sb2, String key) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        sb2.append('\"');
        int length = key.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = key.charAt(i10);
            if (charAt == '\n') {
                sb2.append("%0A");
            } else if (charAt == '\r') {
                sb2.append("%0D");
            } else if (charAt == '\"') {
                sb2.append("%22");
            } else {
                sb2.append(charAt);
            }
            i10 = i11;
        }
        sb2.append('\"');
    }

    public static ki.e c() {
        ki.e eVar = ki.e.f20972l;
        Intrinsics.checkNotNull(eVar);
        ki.e eVar2 = eVar.f20974f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            ki.e.f20969i.await(ki.e.f20970j, TimeUnit.MILLISECONDS);
            ki.e eVar3 = ki.e.f20972l;
            Intrinsics.checkNotNull(eVar3);
            if (eVar3.f20974f != null || System.nanoTime() - nanoTime < ki.e.f20971k) {
                return null;
            }
            return ki.e.f20972l;
        }
        long nanoTime2 = eVar2.f20975g - System.nanoTime();
        if (nanoTime2 > 0) {
            ki.e.f20969i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        ki.e eVar4 = ki.e.f20972l;
        Intrinsics.checkNotNull(eVar4);
        eVar4.f20974f = eVar2.f20974f;
        eVar2.f20974f = null;
        return eVar2;
    }

    public static String e(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, int i12) {
        boolean contains$default;
        boolean contains$default2;
        char[] cArr = d0.f27032k;
        int i13 = (i12 & 1) != 0 ? 0 : i10;
        int length = (i12 & 2) != 0 ? str.length() : i11;
        boolean z14 = (i12 & 8) != 0 ? false : z10;
        boolean z15 = (i12 & 16) != 0 ? false : z11;
        boolean z16 = (i12 & 32) != 0 ? false : z12;
        boolean z17 = (i12 & 64) == 0 ? z13 : false;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i14 = i13;
        while (i14 < length) {
            int codePointAt = str.codePointAt(i14);
            int i15 = 43;
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z17)) {
                contains$default2 = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt, false, 2, (Object) null);
                if (!contains$default2 && ((codePointAt != 37 || (z14 && (!z15 || l(i14, length, str)))) && (codePointAt != 43 || !z16))) {
                    i14 += Character.charCount(codePointAt);
                }
            }
            ki.i iVar = new ki.i();
            iVar.X(i13, i14, str);
            ki.i iVar2 = null;
            while (i14 < length) {
                int codePointAt2 = str.codePointAt(i14);
                if (!z14 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == i15 && z16) {
                        iVar.Y(z14 ? "+" : "%2B");
                    } else {
                        if (codePointAt2 >= 32 && codePointAt2 != 127 && (codePointAt2 < 128 || z17)) {
                            contains$default = StringsKt__StringsKt.contains$default(encodeSet, (char) codePointAt2, false, 2, (Object) null);
                            if (!contains$default && (codePointAt2 != 37 || (z14 && (!z15 || l(i14, length, str))))) {
                                iVar.Z(codePointAt2);
                            }
                        }
                        if (iVar2 == null) {
                            iVar2 = new ki.i();
                        }
                        iVar2.Z(codePointAt2);
                        while (!iVar2.exhausted()) {
                            int readByte = iVar2.readByte() & UByte.MAX_VALUE;
                            iVar.w(37);
                            char[] cArr2 = d0.f27032k;
                            iVar.w(cArr2[(readByte >> 4) & 15]);
                            iVar.w(cArr2[readByte & 15]);
                        }
                    }
                }
                i14 += Character.charCount(codePointAt2);
                i15 = 43;
            }
            return iVar.readUtf8();
        }
        String substring = str.substring(i13, length);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static int f(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.areEqual(scheme, "http")) {
            return 80;
        }
        if (Intrinsics.areEqual(scheme, Constants.SCHEME)) {
            return 443;
        }
        return -1;
    }

    public static a1 g(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return a1.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return a1.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return a1.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return a1.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return a1.SSL_3_0;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected TLS version: ", javaName));
    }

    public static ki.b0 h(String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ki.l lVar = li.c.a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ki.i iVar = new ki.i();
        iVar.Y(str);
        return li.c.d(iVar, z10);
    }

    public static d0 i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        b0 b0Var = new b0();
        b0Var.c(null, str);
        return b0Var.a();
    }

    public static ki.b0 j(File file) {
        String str = ki.b0.f20952c;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString()");
        return h(file2, false);
    }

    public static boolean k(o0 request, u0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(request, "request");
        int i10 = response.f27216f;
        if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
            if (i10 != 307) {
                if (i10 != 308 && i10 != 404 && i10 != 405) {
                    switch (i10) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (u0.g(response, "Expires") == null && response.d().f27068c == -1 && !response.d().f27071f && !response.d().f27070e) {
                return false;
            }
        }
        if (response.d().f27067b) {
            return false;
        }
        i iVar = request.f27155f;
        if (iVar == null) {
            int i11 = i.f27066n;
            iVar = qc.s0.o(request.f27152c);
            request.f27155f = iVar;
        }
        if (iVar.f27067b) {
            return false;
        }
        return true;
    }

    public static boolean l(int i10, int i11, String str) {
        int i12 = i10 + 2;
        if (i12 < i11 && str.charAt(i10) == '%' && xh.b.q(str.charAt(i10 + 1)) != -1 && xh.b.q(str.charAt(i12)) != -1) {
            return true;
        }
        return false;
    }

    public static String n(String str, int i10, int i11, boolean z10, int i12) {
        int i13;
        char[] cArr = d0.f27032k;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i14 = i10;
        while (i14 < i11) {
            int i15 = i14 + 1;
            char charAt = str.charAt(i14);
            if (charAt != '%' && (charAt != '+' || !z10)) {
                i14 = i15;
            } else {
                ki.i iVar = new ki.i();
                iVar.X(i10, i14, str);
                while (i14 < i11) {
                    int codePointAt = str.codePointAt(i14);
                    if (codePointAt == 37 && (i13 = i14 + 2) < i11) {
                        int q10 = xh.b.q(str.charAt(i14 + 1));
                        int q11 = xh.b.q(str.charAt(i13));
                        if (q10 != -1 && q11 != -1) {
                            iVar.w((q10 << 4) + q11);
                            i14 = Character.charCount(codePointAt) + i13;
                        }
                        iVar.Z(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z10) {
                            iVar.w(32);
                            i14++;
                        }
                        iVar.Z(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    }
                }
                return iVar.readUtf8();
            }
        }
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList o(String str) {
        int indexOf$default;
        int indexOf$default2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            indexOf$default = StringsKt__StringsKt.indexOf$default(str, Typography.amp, i10, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i10, false, 4, (Object) null);
            if (indexOf$default2 != -1 && indexOf$default2 <= indexOf$default) {
                String substring = str.substring(i10, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                String substring2 = str.substring(indexOf$default2 + 1, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i10, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i10 = indexOf$default + 1;
        }
        return arrayList;
    }

    public static void p(List list, StringBuilder out) {
        IntProgression step;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        step = RangesKt___RangesKt.step(RangesKt.until(0, list.size()), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i10 = first + step2;
            String str = (String) list.get(first);
            String str2 = (String) list.get(first + 1);
            if (first > 0) {
                out.append(Typography.amp);
            }
            out.append(str);
            if (str2 != null) {
                out.append('=');
                out.append(str2);
            }
            if (first != last) {
                first = i10;
            } else {
                return;
            }
        }
    }

    public gi.l d() {
        switch (this.a) {
            case 14:
                if (!m()) {
                    return null;
                }
                return new gi.c();
            default:
                String jvmVersion = System.getProperty("java.specification.version", AppLovinMediationProvider.UNKNOWN);
                try {
                    Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                    Class<?> clientProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                    Class<?> serverProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                    Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                    Method getMethod = cls.getMethod("get", SSLSocket.class);
                    Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                    Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                    Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                    Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                    Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                    Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                    return new gi.i(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    public boolean m() {
        switch (this.a) {
            case 14:
                return gi.c.f18490f;
            case 15:
            default:
                gi.l lVar = gi.l.a;
                if (a0.x() && Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 16:
                return gi.k.f18508e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, int i11) {
        this(26);
        this.a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                return;
            default:
                this(0);
                return;
        }
    }

    public c0(int i10, long j3, int i11) {
        this.a = i10;
    }
}
