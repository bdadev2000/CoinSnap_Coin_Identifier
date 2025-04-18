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
import com.applovin.impl.a1;
import com.applovin.impl.cb;
import com.applovin.impl.la;
import com.applovin.impl.ui;
import com.applovin.impl.yp;
import com.applovin.impl.zn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
abstract class f {
    private static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f3522b;

        private b(String str, Map map) {
            this.a = str;
            this.f3522b = map;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e, reason: collision with root package name */
        private static final Comparator f3523e;

        /* renamed from: f, reason: collision with root package name */
        private static final Comparator f3524f;
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3525b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3526c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3527d;

        static {
            final int i10 = 0;
            f3523e = new Comparator() { // from class: com.applovin.exoplayer2.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b3;
                    int a;
                    switch (i10) {
                        case 0:
                            a = f.c.a((f.c) obj, (f.c) obj2);
                            return a;
                        default:
                            b3 = f.c.b((f.c) obj, (f.c) obj2);
                            return b3;
                    }
                }
            };
            final int i11 = 1;
            f3524f = new Comparator() { // from class: com.applovin.exoplayer2.ui.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int b3;
                    int a;
                    switch (i11) {
                        case 0:
                            a = f.c.a((f.c) obj, (f.c) obj2);
                            return a;
                        default:
                            b3 = f.c.b((f.c) obj, (f.c) obj2);
                            return b3;
                    }
                }
            };
        }

        private c(int i10, int i11, String str, String str2) {
            this.a = i10;
            this.f3525b = i11;
            this.f3526c = str;
            this.f3527d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.f3525b, cVar.f3525b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f3526c.compareTo(cVar2.f3526c);
            return compareTo != 0 ? compareTo : cVar.f3527d.compareTo(cVar2.f3527d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(c cVar, c cVar2) {
            int compare = Integer.compare(cVar2.a, cVar.a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f3526c.compareTo(cVar.f3526c);
            return compareTo != 0 ? compareTo : cVar2.f3527d.compareTo(cVar.f3527d);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private final List a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List f3528b = new ArrayList();
    }

    private static String a(int i10) {
        return i10 != 2 ? "over right" : "under left";
    }

    public static b a(CharSequence charSequence, float f10) {
        if (charSequence == null) {
            return new b("", cb.h());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(a(charSequence), cb.h());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            hashMap.put(com.applovin.exoplayer2.ui.c.a(eb.j.i("bg_", intValue)), yp.a("background-color:%s;", com.applovin.exoplayer2.ui.c.a(intValue)));
        }
        SparseArray a10 = a(spanned, f10);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i11 = 0;
        while (i10 < a10.size()) {
            int keyAt = a10.keyAt(i10);
            sb2.append(a(spanned.subSequence(i11, keyAt)));
            d dVar = (d) a10.get(keyAt);
            Collections.sort(dVar.f3528b, c.f3524f);
            Iterator it2 = dVar.f3528b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).f3527d);
            }
            Collections.sort(dVar.a, c.f3523e);
            Iterator it3 = dVar.a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).f3526c);
            }
            i10++;
            i11 = keyAt;
        }
        sb2.append(a(spanned.subSequence(i11, spanned.length())));
        return new b(sb2.toString(), hashMap);
    }

    private static SparseArray a(Spanned spanned, float f10) {
        SparseArray sparseArray = new SparseArray();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a10 = a(obj, f10);
            String a11 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a10 != null) {
                a1.a((Object) a11);
                c cVar = new c(spanStart, spanEnd, a10, a11);
                a(sparseArray, spanStart).a.add(cVar);
                a(sparseArray, spanEnd).f3528b.add(cVar);
            }
        }
        return sparseArray;
    }

    private static String a(Object obj, float f10) {
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
                size = absoluteSizeSpan.getSize() / f10;
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
            int i10 = ((ui) obj).f8401b;
            if (i10 == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i10 == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i10 != 2) {
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
        return yp.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(znVar.a, znVar.f9482b), a(znVar.f9483c));
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
                return vd.e.h(new StringBuilder("<rt>"), a((CharSequence) ((ui) obj).a), "</rt></ruby>");
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String a(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        if (i11 == 1) {
            sb2.append("filled ");
        } else if (i11 == 2) {
            sb2.append("open ");
        }
        if (i10 == 0) {
            sb2.append("none");
        } else if (i10 == 1) {
            sb2.append("circle");
        } else if (i10 == 2) {
            sb2.append("dot");
        } else if (i10 != 3) {
            sb2.append("unset");
        } else {
            sb2.append("sesame");
        }
        return sb2.toString();
    }

    private static d a(SparseArray sparseArray, int i10) {
        d dVar = (d) sparseArray.get(i10);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i10, dVar2);
        return dVar2;
    }

    private static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
