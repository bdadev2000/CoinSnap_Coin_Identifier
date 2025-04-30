package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.z4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class yr {

    /* renamed from: a */
    public static final Pattern f12468a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map f12469c;

    /* renamed from: d */
    private static final Map f12470d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator f12471c = new X(4);

        /* renamed from: a */
        private final c f12472a;
        private final int b;

        private b(c cVar, int i9) {
            this.f12472a = cVar;
            this.b = i9;
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return Integer.compare(bVar.f12472a.b, bVar2.f12472a.b);
        }

        public /* synthetic */ b(c cVar, int i9, a aVar) {
            this(cVar, i9);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final int f12476a;
        public final wr b;

        public d(int i9, wr wrVar) {
            this.f12476a = i9;
            this.b = wrVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f12476a, dVar.f12476a);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f12478c;

        /* renamed from: a */
        public long f12477a = 0;
        public long b = 0;

        /* renamed from: d */
        public int f12479d = 2;

        /* renamed from: e */
        public float f12480e = -3.4028235E38f;

        /* renamed from: f */
        public int f12481f = 1;

        /* renamed from: g */
        public int f12482g = 0;

        /* renamed from: h */
        public float f12483h = -3.4028235E38f;

        /* renamed from: i */
        public int f12484i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f12485j = 1.0f;

        /* renamed from: k */
        public int f12486k = Integer.MIN_VALUE;

        private static float a(float f9, int i9) {
            if (f9 == -3.4028235E38f || i9 != 0 || (f9 >= 0.0f && f9 <= 1.0f)) {
                return f9 != -3.4028235E38f ? f9 : i9 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float b(int i9) {
            if (i9 != 4) {
                return i9 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i9) {
            if (i9 == 1) {
                return 0;
            }
            if (i9 == 3) {
                return 2;
            }
            if (i9 != 4) {
                return i9 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment a(int i9) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                L.p(i9, "Unknown textAlignment: ", "WebvttCueParser");
                                return null;
                            }
                        }
                    }
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public z4.b b() {
            float f9 = this.f12483h;
            if (f9 == -3.4028235E38f) {
                f9 = b(this.f12479d);
            }
            int i9 = this.f12484i;
            if (i9 == Integer.MIN_VALUE) {
                i9 = c(this.f12479d);
            }
            z4.b c9 = new z4.b().b(a(this.f12479d)).a(a(this.f12480e, this.f12481f), this.f12481f).a(this.f12482g).b(f9).b(i9).d(Math.min(this.f12485j, a(i9, f9))).c(this.f12486k);
            CharSequence charSequence = this.f12478c;
            if (charSequence != null) {
                c9.a(charSequence);
            }
            return c9;
        }

        private static float a(int i9, float f9) {
            if (i9 == 0) {
                return 1.0f - f9;
            }
            if (i9 == 1) {
                return f9 <= 0.5f ? f9 * 2.0f : (1.0f - f9) * 2.0f;
            }
            if (i9 == 2) {
                return f9;
            }
            throw new IllegalStateException(String.valueOf(i9));
        }

        public xr a() {
            return new xr(b().a(), this.f12477a, this.b);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        L.n(255, 255, 255, hashMap, "white");
        L.n(0, 255, 0, hashMap, "lime");
        L.n(0, 255, 255, hashMap, "cyan");
        L.n(255, 0, 0, hashMap, "red");
        L.n(255, 255, 0, hashMap, "yellow");
        L.n(255, 0, 255, hashMap, "magenta");
        L.n(0, 0, 255, hashMap, "blue");
        L.n(0, 0, 0, hashMap, "black");
        f12469c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        L.n(255, 255, 255, hashMap2, "bg_white");
        L.n(0, 255, 0, hashMap2, "bg_lime");
        L.n(0, 255, 255, hashMap2, "bg_cyan");
        L.n(255, 0, 0, hashMap2, "bg_red");
        L.n(255, 255, 0, hashMap2, "bg_yellow");
        L.n(255, 0, 255, hashMap2, "bg_magenta");
        L.n(0, 0, 255, hashMap2, "bg_blue");
        L.n(0, 0, 0, hashMap2, "bg_black");
        f12470d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i9, int i10) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f12469c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i9, i10, 33);
            } else {
                Map map2 = f12470d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i9, i10, 33);
                }
            }
        }
    }

    private static int b(List list, String str, c cVar) {
        List a6 = a(list, str, cVar);
        for (int i9 = 0; i9 < a6.size(); i9++) {
            wr wrVar = ((d) a6.get(i9)).b;
            if (wrVar.g() != -1) {
                return wrVar.g();
            }
        }
        return -1;
    }

    public static z4.b c(String str) {
        e eVar = new e();
        a(str, eVar);
        return eVar.b();
    }

    private static int d(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c9 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c9 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                kc.d("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int e(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c9 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c9 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c9 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c9 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                kc.d("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int f(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c9 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c9 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c9 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c9 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c9 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c9 = 5;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                kc.d("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    private static int g(String str) {
        str.getClass();
        if (!str.equals("lr")) {
            if (!str.equals("rl")) {
                kc.d("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
                return Integer.MIN_VALUE;
            }
            return 1;
        }
        return 2;
    }

    private static void c(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12484i = e(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f12483h = as.a(str);
    }

    private static boolean b(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    c9 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(com.mbridge.msdk.foundation.controller.a.f15376a)) {
                    c9 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(com.mbridge.msdk.foundation.same.report.i.f15948a)) {
                    c9 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c9 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c9 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c9 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c9 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c9 = 7;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    private static void b(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f12482g = d(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f12480e = as.a(str);
            eVar.f12481f = 0;
        } else {
            eVar.f12480e = Integer.parseInt(str);
            eVar.f12481f = 1;
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c9 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c9 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c9 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                kc.d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final String f12473a;
        public final int b;

        /* renamed from: c */
        public final String f12474c;

        /* renamed from: d */
        public final Set f12475d;

        private c(String str, int i9, String str2, Set set) {
            this.b = i9;
            this.f12473a = str;
            this.f12474c = str2;
            this.f12475d = set;
        }

        public static c a(String str, int i9) {
            String str2;
            String trim = str.trim();
            AbstractC0669a1.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a6 = yp.a(trim, "\\.");
            String str3 = a6[0];
            HashSet hashSet = new HashSet();
            for (int i10 = 1; i10 < a6.length; i10++) {
                hashSet.add(a6[i10]);
            }
            return new c(str3, i9, str2, hashSet);
        }

        public static c a() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int b8 = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f12471c);
        int i9 = cVar.b;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if ("rt".equals(((b) arrayList.get(i11)).f12472a.f12473a)) {
                b bVar = (b) arrayList.get(i11);
                int a6 = a(b(list2, str, bVar.f12472a), b8, 1);
                int i12 = bVar.f12472a.b - i10;
                int i13 = bVar.b - i10;
                CharSequence subSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new ui(subSequence.toString(), a6), i9, i12, 33);
                i10 = subSequence.length() + i10;
                i9 = i12;
            }
        }
    }

    private static void a(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i9 = cVar.b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f12473a;
        str2.getClass();
        char c9 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c9 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    c9 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(com.mbridge.msdk.foundation.controller.a.f15376a)) {
                    c9 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(com.mbridge.msdk.foundation.same.report.i.f15948a)) {
                    c9 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c9 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c9 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c9 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c9 = 7;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                L.o(1, spannableStringBuilder, i9, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f12475d, i9, length);
                break;
            case 3:
                L.o(2, spannableStringBuilder, i9, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
                break;
            case 7:
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List a6 = a(list2, str, cVar);
        for (int i10 = 0; i10 < a6.size(); i10++) {
            a(spannableStringBuilder, ((d) a6.get(i10)).b, i9, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, wr wrVar, int i9, int i10) {
        if (wrVar == null) {
            return;
        }
        if (wrVar.h() != -1) {
            mk.a(spannableStringBuilder, new StyleSpan(wrVar.h()), i9, i10, 33);
        }
        if (wrVar.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i9, i10, 33);
        }
        if (wrVar.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, 33);
        }
        if (wrVar.j()) {
            mk.a(spannableStringBuilder, new ForegroundColorSpan(wrVar.c()), i9, i10, 33);
        }
        if (wrVar.i()) {
            mk.a(spannableStringBuilder, new BackgroundColorSpan(wrVar.a()), i9, i10, 33);
        }
        if (wrVar.d() != null) {
            mk.a(spannableStringBuilder, new TypefaceSpan(wrVar.d()), i9, i10, 33);
        }
        int f9 = wrVar.f();
        if (f9 == 1) {
            mk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) wrVar.e(), true), i9, i10, 33);
        } else if (f9 == 2) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e()), i9, i10, 33);
        } else if (f9 == 3) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e() / 100.0f), i9, i10, 33);
        }
        if (wrVar.b()) {
            spannableStringBuilder.setSpan(new la(), i9, i10, 33);
        }
    }

    private static int a(String str, int i9) {
        int indexOf = str.indexOf(62, i9);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int a(int i9, int i10, int i11) {
        if (i9 != -1) {
            return i9;
        }
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        throw new IllegalArgumentException();
    }

    private static String a(String str) {
        String trim = str.trim();
        AbstractC0669a1.a(!trim.isEmpty());
        return yp.b(trim, "[ \\.]")[0];
    }

    public static xr a(yg ygVar, List list) {
        String l = ygVar.l();
        if (l == null) {
            return null;
        }
        Pattern pattern = f12468a;
        Matcher matcher = pattern.matcher(l);
        if (matcher.matches()) {
            return a((String) null, matcher, ygVar, list);
        }
        String l2 = ygVar.l();
        if (l2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(l2);
        if (matcher2.matches()) {
            return a(l.trim(), matcher2, ygVar, list);
        }
        return null;
    }

    private static xr a(String str, Matcher matcher, yg ygVar, List list) {
        e eVar = new e();
        try {
            eVar.f12477a = as.b((String) AbstractC0669a1.a((Object) matcher.group(1)));
            eVar.b = as.b((String) AbstractC0669a1.a((Object) matcher.group(2)));
            a((String) AbstractC0669a1.a((Object) matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String l = ygVar.l();
            while (!TextUtils.isEmpty(l)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(l.trim());
                l = ygVar.l();
            }
            eVar.f12478c = a(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            kc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static z4 a(CharSequence charSequence) {
        e eVar = new e();
        eVar.f12478c = charSequence;
        return eVar.b().a();
    }

    public static SpannedString a(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < str2.length()) {
            char charAt = str2.charAt(i9);
            if (charAt == '&') {
                i9++;
                int indexOf = str2.indexOf(59, i9);
                int indexOf2 = str2.indexOf(32, i9);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i9, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i9 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i9++;
            } else {
                int i10 = i9 + 1;
                if (i10 < str2.length()) {
                    boolean z8 = str2.charAt(i10) == '/';
                    i10 = a(str2, i10);
                    int i11 = i10 - 2;
                    boolean z9 = str2.charAt(i11) == '/';
                    int i12 = i9 + (z8 ? 2 : 1);
                    if (!z9) {
                        i11 = i10 - 1;
                    }
                    String substring = str2.substring(i12, i11);
                    if (!substring.trim().isEmpty()) {
                        String a6 = a(substring);
                        if (b(a6)) {
                            if (!z8) {
                                if (!z9) {
                                    arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                                }
                            }
                            while (!arrayDeque.isEmpty()) {
                                c cVar = (c) arrayDeque.pop();
                                a(str, cVar, arrayList, spannableStringBuilder, list);
                                if (!arrayDeque.isEmpty()) {
                                    arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                } else {
                                    arrayList.clear();
                                }
                                if (cVar.f12473a.equals(a6)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i9 = i10;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(String str, e eVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) AbstractC0669a1.a((Object) matcher.group(1));
            String str3 = (String) AbstractC0669a1.a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f12479d = f(str3);
                } else if ("position".equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f12485j = as.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f12486k = g(str3);
                } else {
                    kc.d("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                kc.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static List a(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            wr wrVar = (wr) list.get(i9);
            int a6 = wrVar.a(str, cVar.f12473a, cVar.f12475d, cVar.f12474c);
            if (a6 > 0) {
                arrayList.add(new d(a6, wrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
