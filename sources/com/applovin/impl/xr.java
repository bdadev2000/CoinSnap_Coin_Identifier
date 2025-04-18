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
import com.applovin.impl.b5;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.security.CertificateUtil;
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
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class xr {

    /* renamed from: a */
    public static final Pattern f27980a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f27981b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map f27982c;
    private static final Map d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator f27983c = new ns(3);

        /* renamed from: a */
        private final c f27984a;

        /* renamed from: b */
        private final int f27985b;

        private b(c cVar, int i2) {
            this.f27984a = cVar;
            this.f27985b = i2;
        }

        public /* synthetic */ b(c cVar, int i2, a aVar) {
            this(cVar, i2);
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return Integer.compare(bVar.f27984a.f27987b, bVar2.f27984a.f27987b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Comparable {

        /* renamed from: a */
        public final int f27989a;

        /* renamed from: b */
        public final vr f27990b;

        public d(int i2, vr vrVar) {
            this.f27989a = i2;
            this.f27990b = vrVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.f27989a, dVar.f27989a);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f27993c;

        /* renamed from: a */
        public long f27991a = 0;

        /* renamed from: b */
        public long f27992b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;

        /* renamed from: f */
        public int f27994f = 1;

        /* renamed from: g */
        public int f27995g = 0;

        /* renamed from: h */
        public float f27996h = -3.4028235E38f;

        /* renamed from: i */
        public int f27997i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f27998j = 1.0f;

        /* renamed from: k */
        public int f27999k = Integer.MIN_VALUE;

        private static float a(float f2, int i2) {
            if (f2 == -3.4028235E38f || i2 != 0 || (f2 >= 0.0f && f2 <= 1.0f)) {
                return f2 != -3.4028235E38f ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float b(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment a(int i2) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                com.applovin.impl.adview.t.u("Unknown textAlignment: ", i2, "WebvttCueParser");
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

        public b5.b b() {
            float f2 = this.f27996h;
            if (f2 == -3.4028235E38f) {
                f2 = b(this.d);
            }
            int i2 = this.f27997i;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c(this.d);
            }
            b5.b c2 = new b5.b().b(a(this.d)).a(a(this.e, this.f27994f), this.f27994f).a(this.f27995g).b(f2).b(i2).d(Math.min(this.f27998j, a(i2, f2))).c(this.f27999k);
            CharSequence charSequence = this.f27993c;
            if (charSequence != null) {
                c2.a(charSequence);
            }
            return c2;
        }

        private static float a(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 == 1) {
                return f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
            }
            if (i2 == 2) {
                return f2;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        public wr a() {
            return new wr(b().a(), this.f27991a, this.f27992b);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        com.applovin.impl.adview.t.r(255, 255, 255, hashMap, "white");
        com.applovin.impl.adview.t.r(0, 255, 0, hashMap, "lime");
        com.applovin.impl.adview.t.r(0, 255, 255, hashMap, "cyan");
        com.applovin.impl.adview.t.r(255, 0, 0, hashMap, "red");
        com.applovin.impl.adview.t.r(255, 255, 0, hashMap, "yellow");
        com.applovin.impl.adview.t.r(255, 0, 255, hashMap, "magenta");
        com.applovin.impl.adview.t.r(0, 0, 255, hashMap, "blue");
        com.applovin.impl.adview.t.r(0, 0, 0, hashMap, "black");
        f27982c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        com.applovin.impl.adview.t.r(255, 255, 255, hashMap2, "bg_white");
        com.applovin.impl.adview.t.r(0, 255, 0, hashMap2, "bg_lime");
        com.applovin.impl.adview.t.r(0, 255, 255, hashMap2, "bg_cyan");
        com.applovin.impl.adview.t.r(255, 0, 0, hashMap2, "bg_red");
        com.applovin.impl.adview.t.r(255, 255, 0, hashMap2, "bg_yellow");
        com.applovin.impl.adview.t.r(255, 0, 255, hashMap2, "bg_magenta");
        com.applovin.impl.adview.t.r(0, 0, 255, hashMap2, "bg_blue");
        com.applovin.impl.adview.t.r(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i2, int i3) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f27982c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i2, i3, 33);
            } else {
                Map map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i2, i3, 33);
                }
            }
        }
    }

    private static int b(List list, String str, c cVar) {
        List a2 = a(list, str, cVar);
        for (int i2 = 0; i2 < a2.size(); i2++) {
            vr vrVar = ((d) a2.get(i2)).f27990b;
            if (vrVar.g() != -1) {
                return vrVar.g();
            }
        }
        return -1;
    }

    public static b5.b c(String str) {
        e eVar = new e();
        a(str, eVar);
        return eVar.b();
    }

    private static int d(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                pc.d("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int e(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
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
                pc.d("WebvttCueParser", "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static int f(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(ViewHierarchyConstants.DIMENSION_LEFT_KEY)) {
                    c2 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
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
                pc.d("WebvttCueParser", "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    private static int g(String str) {
        str.getClass();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        pc.d("WebvttCueParser", "Invalid 'vertical' value: ".concat(str));
        return Integer.MIN_VALUE;
    }

    private static void c(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f27997i = e(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f27996h = zr.a(str);
    }

    private static boolean b(String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case Opcodes.FADD /* 98 */:
                if (str.equals("b")) {
                    c2 = 0;
                    break;
                }
                break;
            case Opcodes.DADD /* 99 */:
                if (str.equals("c")) {
                    c2 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c2 = 2;
                    break;
                }
                break;
            case Opcodes.LNEG /* 117 */:
                if (str.equals("u")) {
                    c2 = 3;
                    break;
                }
                break;
            case Opcodes.FNEG /* 118 */:
                if (str.equals("v")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
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
            eVar.f27995g = d(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = zr.a(str);
            eVar.f27994f = 0;
        } else {
            eVar.e = Integer.parseInt(str);
            eVar.f27994f = 1;
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
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
                pc.d("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final String f27986a;

        /* renamed from: b */
        public final int f27987b;

        /* renamed from: c */
        public final String f27988c;
        public final Set d;

        private c(String str, int i2, String str2, Set set) {
            this.f27987b = i2;
            this.f27986a = str;
            this.f27988c = str2;
            this.d = set;
        }

        public static c a(String str, int i2) {
            String str2;
            String trim = str.trim();
            b1.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a2 = xp.a(trim, "\\.");
            String str3 = a2[0];
            HashSet hashSet = new HashSet();
            for (int i3 = 1; i3 < a2.length; i3++) {
                hashSet.add(a2[i3]);
            }
            return new c(str3, i2, str2, hashSet);
        }

        public static c a() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int b2 = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f27983c);
        int i2 = cVar.f27987b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((b) arrayList.get(i4)).f27984a.f27986a)) {
                b bVar = (b) arrayList.get(i4);
                int a2 = a(b(list2, str, bVar.f27984a), b2, 1);
                int i5 = bVar.f27984a.f27987b - i3;
                int i6 = bVar.f27985b - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, i6);
                spannableStringBuilder.delete(i5, i6);
                spannableStringBuilder.setSpan(new zi(subSequence.toString(), a2), i2, i5, 33);
                i3 = subSequence.length() + i3;
                i2 = i5;
            }
        }
    }

    private static void a(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i2 = cVar.f27987b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f27986a;
        str2.getClass();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                break;
            case Opcodes.FADD /* 98 */:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                break;
            case Opcodes.DADD /* 99 */:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                break;
            case Opcodes.LNEG /* 117 */:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                break;
            case Opcodes.FNEG /* 118 */:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c2 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.d, i2, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List a2 = a(list2, str, cVar);
        for (int i3 = 0; i3 < a2.size(); i3++) {
            a(spannableStringBuilder, ((d) a2.get(i3)).f27990b, i2, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, vr vrVar, int i2, int i3) {
        if (vrVar == null) {
            return;
        }
        if (vrVar.h() != -1) {
            pk.a(spannableStringBuilder, new StyleSpan(vrVar.h()), i2, i3, 33);
        }
        if (vrVar.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (vrVar.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (vrVar.j()) {
            pk.a(spannableStringBuilder, new ForegroundColorSpan(vrVar.c()), i2, i3, 33);
        }
        if (vrVar.i()) {
            pk.a(spannableStringBuilder, new BackgroundColorSpan(vrVar.a()), i2, i3, 33);
        }
        if (vrVar.d() != null) {
            pk.a(spannableStringBuilder, new TypefaceSpan(vrVar.d()), i2, i3, 33);
        }
        int f2 = vrVar.f();
        if (f2 == 1) {
            pk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) vrVar.e(), true), i2, i3, 33);
        } else if (f2 == 2) {
            pk.a(spannableStringBuilder, new RelativeSizeSpan(vrVar.e()), i2, i3, 33);
        } else if (f2 == 3) {
            pk.a(spannableStringBuilder, new RelativeSizeSpan(vrVar.e() / 100.0f), i2, i3, 33);
        }
        if (vrVar.b()) {
            spannableStringBuilder.setSpan(new pa(), i2, i3, 33);
        }
    }

    private static int a(String str, int i2) {
        int indexOf = str.indexOf(62, i2);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int a(int i2, int i3, int i4) {
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        if (i4 != -1) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    private static String a(String str) {
        String trim = str.trim();
        b1.a(!trim.isEmpty());
        return xp.b(trim, "[ \\.]")[0];
    }

    public static wr a(bh bhVar, List list) {
        String l2 = bhVar.l();
        if (l2 == null) {
            return null;
        }
        Pattern pattern = f27980a;
        Matcher matcher = pattern.matcher(l2);
        if (matcher.matches()) {
            return a((String) null, matcher, bhVar, list);
        }
        String l3 = bhVar.l();
        if (l3 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(l3);
        if (matcher2.matches()) {
            return a(l2.trim(), matcher2, bhVar, list);
        }
        return null;
    }

    private static wr a(String str, Matcher matcher, bh bhVar, List list) {
        e eVar = new e();
        try {
            eVar.f27991a = zr.b((String) b1.a((Object) matcher.group(1)));
            eVar.f27992b = zr.b((String) b1.a((Object) matcher.group(2)));
            a((String) b1.a((Object) matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String l2 = bhVar.l();
            while (!TextUtils.isEmpty(l2)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(l2.trim());
                l2 = bhVar.l();
            }
            eVar.f27993c = a(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            pc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static b5 a(CharSequence charSequence) {
        e eVar = new e();
        eVar.f27993c = charSequence;
        return eVar.b().a();
    }

    public static SpannedString a(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < str2.length()) {
            char charAt = str2.charAt(i2);
            if (charAt == '&') {
                i2++;
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i2, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i2 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i2++;
            } else {
                int i3 = i2 + 1;
                if (i3 < str2.length()) {
                    boolean z2 = str2.charAt(i3) == '/';
                    i3 = a(str2, i3);
                    int i4 = i3 - 2;
                    boolean z3 = str2.charAt(i4) == '/';
                    int i5 = i2 + (z2 ? 2 : 1);
                    if (!z3) {
                        i4 = i3 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String a2 = a(substring);
                        if (b(a2)) {
                            if (!z2) {
                                if (!z3) {
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
                                if (cVar.f27986a.equals(a2)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(String str, e eVar) {
        Matcher matcher = f27981b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) b1.a((Object) matcher.group(1));
            String str3 = (String) b1.a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = f(str3);
                } else if ("position".equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f27998j = zr.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f27999k = g(str3);
                } else {
                    pc.d("WebvttCueParser", "Unknown cue setting " + str2 + CertificateUtil.DELIMITER + str3);
                }
            } catch (NumberFormatException unused) {
                pc.d("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    private static List a(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            vr vrVar = (vr) list.get(i2);
            int a2 = vrVar.a(str, cVar.f27986a, cVar.d, cVar.f27988c);
            if (a2 > 0) {
                arrayList.add(new d(a2, vrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
