package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.ui.f;
import com.applovin.impl.b1;
import com.applovin.impl.gb;
import com.applovin.impl.pa;
import com.applovin.impl.xp;
import com.applovin.impl.yn;
import com.applovin.impl.zi;
import com.facebook.appevents.integrity.IntegrityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f22614a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f22615a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f22616b;

        private b(String str, Map map) {
            this.f22615a = str;
            this.f22616b = map;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        private static final Comparator e;

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator f22617f;

        /* renamed from: a, reason: collision with root package name */
        public final int f22618a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22619b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22620c;
        public final String d;

        static {
            final int i2 = 0;
            e = new Comparator() { // from class: com.applovin.exoplayer2.ui.m
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a2;
                    int b2;
                    f.c cVar = (f.c) obj;
                    f.c cVar2 = (f.c) obj2;
                    switch (i2) {
                        case 0:
                            a2 = f.c.a(cVar, cVar2);
                            return a2;
                        default:
                            b2 = f.c.b(cVar, cVar2);
                            return b2;
                    }
                }
            };
            final int i3 = 1;
            f22617f = new Comparator() { // from class: com.applovin.exoplayer2.ui.m
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a2;
                    int b2;
                    f.c cVar = (f.c) obj;
                    f.c cVar2 = (f.c) obj2;
                    switch (i3) {
                        case 0:
                            a2 = f.c.a(cVar, cVar2);
                            return a2;
                        default:
                            b2 = f.c.b(cVar, cVar2);
                            return b2;
                    }
                }
            };
        }

        private c(int i2, int i3, String str, String str2) {
            this.f22618a = i2;
            this.f22619b = i3;
            this.f22620c = str;
            this.d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f22619b, cVar.f22619b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f22620c.compareTo(cVar2.f22620c);
            return compareTo != 0 ? compareTo : cVar.d.compareTo(cVar2.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f22618a, cVar.f22618a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f22620c.compareTo(cVar.f22620c);
            return compareTo != 0 ? compareTo : cVar2.d.compareTo(cVar.d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f22621a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f22622b = new ArrayList();
    }

    private static String a(int i2) {
        return i2 != 2 ? "over right" : "under left";
    }

    public static b a(CharSequence charSequence, float f2) {
        if (charSequence == null) {
            return new b("", gb.h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(a(charSequence), gb.h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(com.applovin.exoplayer2.ui.c.a(android.support.v4.media.d.i("bg_", intValue)), xp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(intValue)));
        }
        SparseArray a2 = a(spanned, f2);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i3 = 0;
        while (i2 < a2.size()) {
            int keyAt = a2.keyAt(i2);
            sb.append(a(spanned.subSequence(i3, keyAt)));
            d dVar = (d) a2.get(keyAt);
            Collections.sort(dVar.f22622b, c.f22617f);
            Iterator it2 = dVar.f22622b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).d);
            }
            Collections.sort(dVar.f22621a, c.e);
            Iterator it3 = dVar.f22621a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f22620c);
            }
            i2++;
            i3 = keyAt;
        }
        sb.append(a(spanned.subSequence(i3, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    private static SparseArray a(Spanned spanned, float f2) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a2 = a(obj, f2);
            String a3 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a2 != null) {
                b1.a((Object) a3);
                c cVar = new c(spanStart, spanEnd, a2, a3);
                a(sparseArray, spanStart).f22621a.add(cVar);
                a(sparseArray, spanEnd).f22622b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f2) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return xp.a("<span style='color:%s;'>", com.applovin.exoplayer2.ui.c.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return xp.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof pa) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f2;
            }
            return xp.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return xp.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return xp.a("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof zi) {
            int i2 = ((zi) obj).f28350b;
            if (i2 == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i2 == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i2 != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof yn)) {
            return null;
        }
        yn ynVar = (yn) obj;
        return xp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(ynVar.f28223a, ynVar.f28224b), a(ynVar.f28225c));
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof pa) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof yn)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof zi) {
                return android.support.v4.media.d.r(new StringBuilder("<rt>"), a((CharSequence) ((zi) obj).f28349a), "</rt></ruby>");
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (i3 == 1) {
            sb.append("filled ");
        } else if (i3 == 2) {
            sb.append("open ");
        }
        if (i2 == 0) {
            sb.append(IntegrityManager.INTEGRITY_TYPE_NONE);
        } else if (i2 == 1) {
            sb.append("circle");
        } else if (i2 == 2) {
            sb.append("dot");
        } else if (i2 != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }

    private static d a(SparseArray sparseArray, int i2) {
        d dVar = (d) sparseArray.get(i2);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i2, dVar2);
        return dVar2;
    }

    private static String a(CharSequence charSequence) {
        return f22614a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
