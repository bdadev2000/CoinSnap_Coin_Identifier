package com.applovin.impl;

import android.graphics.Color;
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
import kotlin.text.Typography;

/* loaded from: classes.dex */
public abstract class yr {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f9272b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map f9273c;

    /* renamed from: d */
    private static final Map f9274d;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        private static final Comparator f9275c = new et(4);
        private final c a;

        /* renamed from: b */
        private final int f9276b;

        private b(c cVar, int i10) {
            this.a = cVar;
            this.f9276b = i10;
        }

        public static /* synthetic */ int b(b bVar, b bVar2) {
            return a(bVar, bVar2);
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return Integer.compare(bVar.a.f9277b, bVar2.a.f9277b);
        }

        public /* synthetic */ b(c cVar, int i10, a aVar) {
            this(cVar, i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Comparable {
        public final int a;

        /* renamed from: b */
        public final wr f9280b;

        public d(int i10, wr wrVar) {
            this.a = i10;
            this.f9280b = wrVar;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            return Integer.compare(this.a, dVar.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c */
        public CharSequence f9282c;
        public long a = 0;

        /* renamed from: b */
        public long f9281b = 0;

        /* renamed from: d */
        public int f9283d = 2;

        /* renamed from: e */
        public float f9284e = -3.4028235E38f;

        /* renamed from: f */
        public int f9285f = 1;

        /* renamed from: g */
        public int f9286g = 0;

        /* renamed from: h */
        public float f9287h = -3.4028235E38f;

        /* renamed from: i */
        public int f9288i = Integer.MIN_VALUE;

        /* renamed from: j */
        public float f9289j = 1.0f;

        /* renamed from: k */
        public int f9290k = Integer.MIN_VALUE;

        private static float a(float f10, int i10) {
            if (f10 == -3.4028235E38f || i10 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                return f10 != -3.4028235E38f ? f10 : i10 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float b(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment a(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                a4.j.u("Unknown textAlignment: ", i10, "WebvttCueParser");
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
            float f10 = this.f9287h;
            if (f10 == -3.4028235E38f) {
                f10 = b(this.f9283d);
            }
            int i10 = this.f9288i;
            if (i10 == Integer.MIN_VALUE) {
                i10 = c(this.f9283d);
            }
            z4.b c10 = new z4.b().b(a(this.f9283d)).a(a(this.f9284e, this.f9285f), this.f9285f).a(this.f9286g).b(f10).b(i10).d(Math.min(this.f9289j, a(i10, f10))).c(this.f9290k);
            CharSequence charSequence = this.f9282c;
            if (charSequence != null) {
                c10.a(charSequence);
            }
            return c10;
        }

        private static float a(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public xr a() {
            return new xr(b().a(), this.a, this.f9281b);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f9273c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f9274d = Collections.unmodifiableMap(hashMap2);
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i10, int i11) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = f9273c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i10, i11, 33);
            } else {
                Map map2 = f9274d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i10, i11, 33);
                }
            }
        }
    }

    private static int b(List list, String str, c cVar) {
        List a10 = a(list, str, cVar);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            wr wrVar = ((d) a10.get(i10)).f9280b;
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
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c10 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
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
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
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
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c10 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c10 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c10 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
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
            eVar.f9288i = e(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f9287h = as.a(str);
    }

    private static boolean b(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    c10 = 0;
                    break;
                }
                break;
            case 99:
                if (str.equals(com.mbridge.msdk.foundation.controller.a.a)) {
                    c10 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals(com.mbridge.msdk.foundation.same.report.i.a)) {
                    c10 = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c10 = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c10 = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
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
            eVar.f9286g = d(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f9284e = as.a(str);
            eVar.f9285f = 0;
        } else {
            eVar.f9284e = Integer.parseInt(str);
            eVar.f9285f = 1;
        }
    }

    private static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c10 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                spannableStringBuilder.append(Typography.greater);
                return;
            case 1:
                spannableStringBuilder.append(Typography.less);
                return;
            case 2:
                spannableStringBuilder.append(Typography.amp);
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
        public final String a;

        /* renamed from: b */
        public final int f9277b;

        /* renamed from: c */
        public final String f9278c;

        /* renamed from: d */
        public final Set f9279d;

        private c(String str, int i10, String str2, Set set) {
            this.f9277b = i10;
            this.a = str;
            this.f9278c = str2;
            this.f9279d = set;
        }

        public static c a(String str, int i10) {
            String str2;
            String trim = str.trim();
            a1.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a = yp.a(trim, "\\.");
            String str3 = a[0];
            HashSet hashSet = new HashSet();
            for (int i11 = 1; i11 < a.length; i11++) {
                hashSet.add(a[i11]);
            }
            return new c(str3, i10, str2, hashSet);
        }

        public static c a() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int b3 = b(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.f9275c);
        int i10 = cVar.f9277b;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if ("rt".equals(((b) arrayList.get(i12)).a.a)) {
                b bVar = (b) arrayList.get(i12);
                int a10 = a(b(list2, str, bVar.a), b3, 1);
                int i13 = bVar.a.f9277b - i11;
                int i14 = bVar.f9276b - i11;
                CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                spannableStringBuilder.delete(i13, i14);
                spannableStringBuilder.setSpan(new ui(subSequence.toString(), a10), i10, i13, 33);
                i11 = subSequence.length() + i11;
                i10 = i13;
            }
        }
    }

    private static void a(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = cVar.f9277b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.a;
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                break;
            case 98:
                if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                    c10 = 1;
                    break;
                }
                break;
            case 99:
                if (str2.equals(com.mbridge.msdk.foundation.controller.a.a)) {
                    c10 = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals(com.mbridge.msdk.foundation.same.report.i.a)) {
                    c10 = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                com.applovin.impl.mediation.ads.e.k(1, spannableStringBuilder, i10, length, 33);
                break;
            case 2:
                a(spannableStringBuilder, cVar.f9279d, i10, length);
                break;
            case 3:
                com.applovin.impl.mediation.ads.e.k(2, spannableStringBuilder, i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                a(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List a10 = a(list2, str, cVar);
        for (int i11 = 0; i11 < a10.size(); i11++) {
            a(spannableStringBuilder, ((d) a10.get(i11)).f9280b, i10, length);
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, wr wrVar, int i10, int i11) {
        if (wrVar == null) {
            return;
        }
        if (wrVar.h() != -1) {
            mk.a(spannableStringBuilder, new StyleSpan(wrVar.h()), i10, i11, 33);
        }
        if (wrVar.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (wrVar.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (wrVar.j()) {
            mk.a(spannableStringBuilder, new ForegroundColorSpan(wrVar.c()), i10, i11, 33);
        }
        if (wrVar.i()) {
            mk.a(spannableStringBuilder, new BackgroundColorSpan(wrVar.a()), i10, i11, 33);
        }
        if (wrVar.d() != null) {
            mk.a(spannableStringBuilder, new TypefaceSpan(wrVar.d()), i10, i11, 33);
        }
        int f10 = wrVar.f();
        if (f10 == 1) {
            mk.a(spannableStringBuilder, new AbsoluteSizeSpan((int) wrVar.e(), true), i10, i11, 33);
        } else if (f10 == 2) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e()), i10, i11, 33);
        } else if (f10 == 3) {
            mk.a(spannableStringBuilder, new RelativeSizeSpan(wrVar.e() / 100.0f), i10, i11, 33);
        }
        if (wrVar.b()) {
            spannableStringBuilder.setSpan(new la(), i10, i11, 33);
        }
    }

    private static int a(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    private static String a(String str) {
        String trim = str.trim();
        a1.a(!trim.isEmpty());
        return yp.b(trim, "[ \\.]")[0];
    }

    public static xr a(yg ygVar, List list) {
        String l10 = ygVar.l();
        if (l10 == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(l10);
        if (matcher.matches()) {
            return a((String) null, matcher, ygVar, list);
        }
        String l11 = ygVar.l();
        if (l11 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(l11);
        if (matcher2.matches()) {
            return a(l10.trim(), matcher2, ygVar, list);
        }
        return null;
    }

    private static xr a(String str, Matcher matcher, yg ygVar, List list) {
        e eVar = new e();
        try {
            eVar.a = as.b((String) a1.a((Object) matcher.group(1)));
            eVar.f9281b = as.b((String) a1.a((Object) matcher.group(2)));
            a((String) a1.a((Object) matcher.group(3)), eVar);
            StringBuilder sb2 = new StringBuilder();
            String l10 = ygVar.l();
            while (!TextUtils.isEmpty(l10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(l10.trim());
                l10 = ygVar.l();
            }
            eVar.f9282c = a(str, sb2.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            kc.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static z4 a(CharSequence charSequence) {
        e eVar = new e();
        eVar.f9282c = charSequence;
        return eVar.b().a();
    }

    public static SpannedString a(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i10, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    i11 = a(str2, i11);
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring = str2.substring(i13, i12);
                    if (!substring.trim().isEmpty()) {
                        String a10 = a(substring);
                        if (b(a10)) {
                            if (!z10) {
                                if (!z11) {
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
                                if (cVar.a.equals(a10)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                i10 = i11;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.a(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static void a(String str, e eVar) {
        Matcher matcher = f9272b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) a1.a((Object) matcher.group(1));
            String str3 = (String) a1.a((Object) matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f9283d = f(str3);
                } else if ("position".equals(str2)) {
                    c(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f9289j = as.a(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f9290k = g(str3);
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
        for (int i10 = 0; i10 < list.size(); i10++) {
            wr wrVar = (wr) list.get(i10);
            int a10 = wrVar.a(str, cVar.a, cVar.f9279d, cVar.f9278c);
            if (a10 > 0) {
                arrayList.add(new d(a10, wrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
