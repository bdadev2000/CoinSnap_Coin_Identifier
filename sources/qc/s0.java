package qc;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.SetsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class s0 implements uc.n, ad.e, ed.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23872b;

    public /* synthetic */ s0(int i10) {
        this.f23872b = i10;
    }

    public static final wh.p a(s0 s0Var, String str) {
        wh.p pVar = new wh.p(str);
        wh.p.f27158d.put(str, pVar);
        return pVar;
    }

    public static void e(String str) {
        boolean z10;
        boolean z11;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = str.charAt(i10);
                if ('!' <= charAt && charAt < 127) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i10 = i11;
                } else {
                    throw new IllegalArgumentException(xh.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:2:0x0006->B:13:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L5d
            int r3 = r2 + 1
            char r4 = r7.charAt(r2)
            r5 = 9
            r6 = 1
            if (r4 == r5) goto L23
            r5 = 32
            if (r5 > r4) goto L1d
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L1d
            r5 = r6
            goto L1e
        L1d:
            r5 = r1
        L1e:
            if (r5 == 0) goto L21
            goto L23
        L21:
            r5 = r1
            goto L24
        L23:
            r5 = r6
        L24:
            if (r5 != 0) goto L5b
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r6] = r1
            r1 = 2
            r0[r1] = r8
            java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
            java.lang.String r0 = xh.b.h(r1, r0)
            boolean r8 = xh.b.p(r8)
            if (r8 == 0) goto L47
            java.lang.String r7 = ""
            goto L4d
        L47:
            java.lang.String r8 = ": "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r7)
        L4d:
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L5b:
            r2 = r3
            goto L6
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.f(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
    
        if (r1 != ':') goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
        L0:
            if (r6 >= r7) goto L49
            int r0 = r6 + 1
            char r1 = r5.charAt(r6)
            r2 = 32
            r3 = 1
            if (r1 >= r2) goto L11
            r2 = 9
            if (r1 != r2) goto L41
        L11:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 >= r2) goto L41
            r2 = 57
            r4 = 0
            if (r1 > r2) goto L20
            r2 = 48
            if (r2 > r1) goto L20
            r2 = r3
            goto L21
        L20:
            r2 = r4
        L21:
            if (r2 != 0) goto L41
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 > r2) goto L2d
            r2 = 97
            if (r2 > r1) goto L2d
            r2 = r3
            goto L2e
        L2d:
            r2 = r4
        L2e:
            if (r2 != 0) goto L41
            r2 = 90
            if (r1 > r2) goto L3a
            r2 = 65
            if (r2 > r1) goto L3a
            r2 = r3
            goto L3b
        L3a:
            r2 = r4
        L3b:
            if (r2 != 0) goto L41
            r2 = 58
            if (r1 != r2) goto L42
        L41:
            r4 = r3
        L42:
            r1 = r8 ^ 1
            if (r4 != r1) goto L47
            return r6
        L47:
            r6 = r0
            goto L0
        L49:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.g(java.lang.String, int, int, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x0681, code lost:
    
        if (r0 != false) goto L373;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x036a A[LOOP:3: B:108:0x0368->B:109:0x036a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161 A[LOOP:1: B:71:0x0134->B:79:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static cd.b h(java.lang.String r24, ad.a r25, int r26, int r27, java.util.Map r28) {
        /*
            Method dump skipped, instructions count: 2170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.h(java.lang.String, ad.a, int, int, java.util.Map):cd.b");
    }

    public static String i(StringBuilder sb2) {
        char c10;
        char c11;
        char c12 = 0;
        int length = sb2.length() - 0;
        if (length != 0) {
            char charAt = sb2.charAt(0);
            if (length >= 2) {
                c10 = sb2.charAt(1);
            } else {
                c10 = 0;
            }
            if (length >= 3) {
                c11 = sb2.charAt(2);
            } else {
                c11 = 0;
            }
            if (length >= 4) {
                c12 = sb2.charAt(3);
            }
            int i10 = (charAt << 18) + (c10 << '\f') + (c11 << 6) + c12;
            char c13 = (char) ((i10 >> 16) & 255);
            char c14 = (char) ((i10 >> 8) & 255);
            char c15 = (char) (i10 & 255);
            StringBuilder sb3 = new StringBuilder(3);
            sb3.append(c13);
            if (length >= 2) {
                sb3.append(c14);
            }
            if (length >= 3) {
                sb3.append(c15);
            }
            return sb3.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static int l(int i10, String str, String str2) {
        boolean contains$default;
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            contains$default = StringsKt__StringsKt.contains$default(str2, str.charAt(i10), false, 2, (Object) null);
            if (contains$default) {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static String m(wh.d0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ki.l lVar = ki.l.f20996f;
        return wh.a0.p(url.f27040i).c(SameMD5.TAG).e();
    }

    public static wh.z n(String... namesAndValues) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        int i10 = 0;
        if (namesAndValues.length % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                String str = strArr[i11];
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    strArr[i11] = StringsKt.trim((CharSequence) str).toString();
                    i11 = i12;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    int i13 = i10 + 2;
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    e(str2);
                    f(str3, str2);
                    if (i10 == progressionLastElement) {
                        break;
                    }
                    i10 = i13;
                }
            }
            return new wh.z(strArr);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wh.i o(wh.z r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.o(wh.z):wh.i");
    }

    public static long p(String str, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int indexOf$default;
        int g10 = g(str, 0, i10, false);
        Matcher matcher = wh.s.f27191m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (g10 < i10) {
            int g11 = g(str, g10 + 1, i10, true);
            matcher.region(g10, g11);
            if (i12 == -1 && matcher.usePattern(wh.s.f27191m).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                i12 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                i15 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                i16 = Integer.parseInt(group3);
            } else if (i13 == -1 && matcher.usePattern(wh.s.f27190l).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                i13 = Integer.parseInt(group4);
            } else {
                if (i14 == -1) {
                    Pattern pattern = wh.s.f27189k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) pattern2, lowerCase, 0, false, 6, (Object) null);
                        i14 = indexOf$default / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(wh.s.f27188j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i11 = Integer.parseInt(group6);
                }
            }
            g10 = g(str, g11 + 1, i10, false);
        }
        if (70 <= i11 && i11 < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 += 2000;
        }
        if (i11 >= 1601) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (i14 != -1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                if (1 <= i13 && i13 < 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    if (i12 >= 0 && i12 < 24) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        if (i15 >= 0 && i15 < 60) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            if (i16 >= 0 && i16 < 60) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (z17) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(xh.b.f27680e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i11);
                                gregorianCalendar.set(2, i14 - 1);
                                gregorianCalendar.set(5, i13);
                                gregorianCalendar.set(11, i12);
                                gregorianCalendar.set(12, i15);
                                gregorianCalendar.set(13, i16);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int q(ki.e0 source) {
        boolean z10;
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            long readDecimalLong = source.readDecimalLong();
            String readUtf8LineStrict = source.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L) {
                if (readUtf8LineStrict.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return (int) readDecimalLong;
                }
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + '\"');
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public static Set r(wh.z zVar) {
        boolean equals;
        List split$default;
        int length = zVar.f27243b.length / 2;
        TreeSet treeSet = null;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            equals = StringsKt__StringsJVMKt.equals("Vary", zVar.b(i10), true);
            if (equals) {
                String d10 = zVar.d(i10);
                if (treeSet == null) {
                    treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                }
                split$default = StringsKt__StringsKt.split$default(d10, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
                Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.trim((CharSequence) it.next()).toString());
                }
            }
            i10 = i11;
        }
        if (treeSet == null) {
            return SetsKt.emptySet();
        }
        return treeSet;
    }

    @Override // uc.n
    public final Object b() {
        switch (this.f23872b) {
            case 4:
                return new TreeSet();
            case 5:
                return new ArrayDeque();
            case 6:
                return new ConcurrentSkipListMap();
            case 7:
                return new TreeMap();
            default:
                return new uc.m(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0342 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x048d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0321  */
    @Override // ad.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cd.b c(java.lang.String r22, ad.a r23, int r24, int r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.c(java.lang.String, ad.a, int, int, java.util.Map):cd.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f7, code lost:
    
        com.facebook.appevents.g.r(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00fa, code lost:
    
        throw null;
     */
    @Override // ed.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(ed.c r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.s0.d(ed.c):void");
    }

    public final synchronized wh.p j(String javaName) {
        wh.p pVar;
        boolean startsWith$default;
        boolean startsWith$default2;
        String str;
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        LinkedHashMap linkedHashMap = wh.p.f27158d;
        pVar = (wh.p) linkedHashMap.get(javaName);
        if (pVar == null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(javaName, "TLS_", false, 2, null);
            if (startsWith$default) {
                String substring = javaName.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                str = Intrinsics.stringPlus("SSL_", substring);
            } else {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(javaName, "SSL_", false, 2, null);
                if (startsWith$default2) {
                    String substring2 = javaName.substring(4);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    str = Intrinsics.stringPlus("TLS_", substring2);
                } else {
                    str = javaName;
                }
            }
            pVar = (wh.p) linkedHashMap.get(str);
            if (pVar == null) {
                pVar = new wh.p(javaName);
            }
            linkedHashMap.put(javaName, pVar);
        }
        return pVar;
    }

    public final int k() {
        switch (this.f23872b) {
            case 11:
                return 5;
            default:
                return 4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i10, int i11) {
        this(0);
        this.f23872b = i10;
        int i12 = 1;
        if (i10 == 1) {
            this(i12);
            return;
        }
        int i13 = 2;
        if (i10 == 2) {
            this(i13);
            return;
        }
        int i14 = 3;
        if (i10 != 3) {
            switch (i10) {
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
                    this(26);
                    return;
                case 27:
                    this(27);
                    return;
                case 28:
                    this(28);
                    return;
                case NOTIFICATION_REDIRECT_VALUE:
                    this(29);
                    return;
                default:
                    return;
            }
        }
        this(i14);
    }
}
