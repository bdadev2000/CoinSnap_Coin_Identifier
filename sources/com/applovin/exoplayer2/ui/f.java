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
import com.applovin.impl.AbstractC0669a1;
import com.applovin.impl.cb;
import com.applovin.impl.la;
import com.applovin.impl.ui;
import com.applovin.impl.yp;
import com.applovin.impl.zn;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6305a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f6306a;
        public final Map b;

        private b(String str, Map map) {
            this.f6306a = str;
            this.b = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator f6307e;

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator f6308f;

        /* renamed from: a, reason: collision with root package name */
        public final int f6309a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f6310c;

        /* renamed from: d, reason: collision with root package name */
        public final String f6311d;

        static {
            final int i9 = 0;
            f6307e = new Comparator() { // from class: com.applovin.exoplayer2.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a6;
                    int b;
                    f.c cVar = (f.c) obj;
                    f.c cVar2 = (f.c) obj2;
                    switch (i9) {
                        case 0:
                            a6 = f.c.a(cVar, cVar2);
                            return a6;
                        default:
                            b = f.c.b(cVar, cVar2);
                            return b;
                    }
                }
            };
            final int i10 = 1;
            f6308f = new Comparator() { // from class: com.applovin.exoplayer2.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a6;
                    int b;
                    f.c cVar = (f.c) obj;
                    f.c cVar2 = (f.c) obj2;
                    switch (i10) {
                        case 0:
                            a6 = f.c.a(cVar, cVar2);
                            return a6;
                        default:
                            b = f.c.b(cVar, cVar2);
                            return b;
                    }
                }
            };
        }

        private c(int i9, int i10, String str, String str2) {
            this.f6309a = i9;
            this.b = i10;
            this.f6310c = str;
            this.f6311d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.b, cVar.b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f6310c.compareTo(cVar2.f6310c);
            return compareTo != 0 ? compareTo : cVar.f6311d.compareTo(cVar2.f6311d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f6309a, cVar.f6309a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f6310c.compareTo(cVar.f6310c);
            return compareTo != 0 ? compareTo : cVar2.f6311d.compareTo(cVar.f6311d);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f6312a = new ArrayList();
        private final List b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f9) {
        if (charSequence == null) {
            return new b("", cb.h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(a(charSequence), cb.h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i9 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(com.applovin.exoplayer2.ui.c.a(o.h(intValue, "bg_")), yp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(intValue)));
        }
        SparseArray a6 = a(spanned, f9);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i10 = 0;
        while (i9 < a6.size()) {
            int keyAt = a6.keyAt(i9);
            sb.append(a(spanned.subSequence(i10, keyAt)));
            d dVar = (d) a6.get(keyAt);
            Collections.sort(dVar.b, c.f6308f);
            Iterator it2 = dVar.b.iterator();
            while (it2.hasNext()) {
                sb.append(((c) it2.next()).f6311d);
            }
            Collections.sort(dVar.f6312a, c.f6307e);
            Iterator it3 = dVar.f6312a.iterator();
            while (it3.hasNext()) {
                sb.append(((c) it3.next()).f6310c);
            }
            i9++;
            i10 = keyAt;
        }
        sb.append(a(spanned.subSequence(i10, spanned.length())));
        return new b(sb.toString(), hashMap);
    }

    private static SparseArray a(Spanned spanned, float f9) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a6 = a(obj, f9);
            String a9 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a6 != null) {
                AbstractC0669a1.a((Object) a9);
                c cVar = new c(spanStart, spanEnd, a6, a9);
                a(sparseArray, spanStart).f6312a.add(cVar);
                a(sparseArray, spanEnd).b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f9) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return yp.a("<span style='color:%s;'>", com.applovin.exoplayer2.ui.c.a(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return yp.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof la) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f9;
            }
            return yp.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return yp.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return yp.a("<span style='font-family:\"%s\";'>", family);
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
        if (obj instanceof ui) {
            int i9 = ((ui) obj).b;
            if (i9 == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i9 == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i9 != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof zn)) {
            return null;
        }
        zn znVar = (zn) obj;
        return yp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(znVar.f12673a, znVar.b), a(znVar.f12674c));
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof la) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof zn)) {
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
            if (obj instanceof ui) {
                return AbstractC2914a.h(new StringBuilder("<rt>"), a((CharSequence) ((ui) obj).f11615a), "</rt></ruby>");
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i9, int i10) {
        StringBuilder sb = new StringBuilder();
        if (i10 == 1) {
            sb.append("filled ");
        } else if (i10 == 2) {
            sb.append("open ");
        }
        if (i9 == 0) {
            sb.append("none");
        } else if (i9 == 1) {
            sb.append("circle");
        } else if (i9 == 2) {
            sb.append("dot");
        } else if (i9 != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }

    private static String a(int i9) {
        if (i9 != 2) {
            return "over right";
        }
        return "under left";
    }

    private static d a(SparseArray sparseArray, int i9) {
        d dVar = (d) sparseArray.get(i9);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i9, dVar2);
        return dVar2;
    }

    private static String a(CharSequence charSequence) {
        return f6305a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
