package androidx.compose.ui.text.platform;

import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p0.a;

/* loaded from: classes3.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [e0.w] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static final SpannableString a(AnnotatedString annotatedString, Density density, URLSpanCache uRLSpanCache) {
        ArrayList arrayList;
        String str = annotatedString.f16880a;
        SpannableString spannableString = new SpannableString(str);
        List list = annotatedString.f16881b;
        if (list != null) {
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
                SpanStyle spanStyle = (SpanStyle) range.f16890a;
                int i3 = range.f16891b;
                int i4 = range.f16892c;
                long b2 = spanStyle.f17017a.b();
                long j2 = spanStyle.f17018b;
                TextForegroundStyle textForegroundStyle = spanStyle.f17017a;
                List list2 = list;
                int i5 = size;
                if (!Color.c(b2, textForegroundStyle.b())) {
                    textForegroundStyle = TextForegroundStyle.Companion.b(b2);
                }
                SpannableExtensions_androidKt.b(spannableString, textForegroundStyle.b(), i3, i4);
                SpannableExtensions_androidKt.c(spannableString, j2, density, i3, i4);
                FontWeight fontWeight = spanStyle.f17019c;
                FontStyle fontStyle = spanStyle.d;
                if (fontWeight != null || fontStyle != null) {
                    if (fontWeight == null) {
                        fontWeight = FontWeight.f17269i;
                    }
                    spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.a(fontWeight, fontStyle != null ? fontStyle.f17260a : 0)), i3, i4, 33);
                }
                TextDecoration textDecoration = spanStyle.f17027m;
                if (textDecoration != null) {
                    if (textDecoration.a(TextDecoration.f17465c)) {
                        spannableString.setSpan(new UnderlineSpan(), i3, i4, 33);
                    }
                    if (textDecoration.a(TextDecoration.d)) {
                        spannableString.setSpan(new StrikethroughSpan(), i3, i4, 33);
                    }
                }
                TextGeometricTransform textGeometricTransform = spanStyle.f17024j;
                if (textGeometricTransform != null) {
                    spannableString.setSpan(new ScaleXSpan(textGeometricTransform.f17472a), i3, i4, 33);
                }
                LocaleList localeList = spanStyle.f17025k;
                if (localeList != null) {
                    spannableString.setSpan(LocaleListHelperMethods.f17439a.a(localeList), i3, i4, 33);
                }
                long j3 = spanStyle.f17026l;
                if (j3 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(ColorKt.j(j3)), i3, i4, 33);
                }
                i2++;
                list = list2;
                size = i5;
            }
        }
        int length = str.length();
        ?? r3 = w.f30218a;
        List list3 = annotatedString.d;
        if (list3 != null) {
            arrayList = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj = list3.get(i6);
                AnnotatedString.Range range2 = (AnnotatedString.Range) obj;
                if ((range2.f16890a instanceof TtsAnnotation) && AnnotatedStringKt.c(0, length, range2.f16891b, range2.f16892c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = r3;
        }
        int size3 = arrayList.size();
        for (int i7 = 0; i7 < size3; i7++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i7);
            TtsAnnotation ttsAnnotation = (TtsAnnotation) range3.f16890a;
            if (!(ttsAnnotation instanceof VerbatimTtsAnnotation)) {
                throw new RuntimeException();
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(((VerbatimTtsAnnotation) ttsAnnotation).f17063a).build(), range3.f16891b, range3.f16892c, 33);
        }
        int length2 = str.length();
        if (list3 != null) {
            r3 = new ArrayList(list3.size());
            int size4 = list3.size();
            for (int i8 = 0; i8 < size4; i8++) {
                Object obj2 = list3.get(i8);
                AnnotatedString.Range range4 = (AnnotatedString.Range) obj2;
                if ((range4.f16890a instanceof UrlAnnotation) && AnnotatedStringKt.c(0, length2, range4.f16891b, range4.f16892c)) {
                    r3.add(obj2);
                }
            }
        }
        int size5 = r3.size();
        for (int i9 = 0; i9 < size5; i9++) {
            AnnotatedString.Range range5 = (AnnotatedString.Range) r3.get(i9);
            UrlAnnotation urlAnnotation = (UrlAnnotation) range5.f16890a;
            WeakHashMap weakHashMap = uRLSpanCache.f17436a;
            Object obj3 = weakHashMap.get(urlAnnotation);
            if (obj3 == null) {
                obj3 = new URLSpan(urlAnnotation.f17062a);
                weakHashMap.put(urlAnnotation, obj3);
            }
            spannableString.setSpan((URLSpan) obj3, range5.f16891b, range5.f16892c, 33);
        }
        List a2 = annotatedString.a(str.length());
        int size6 = a2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            AnnotatedString.Range range6 = (AnnotatedString.Range) a2.get(i10);
            Object obj4 = range6.f16890a;
            LinkAnnotation linkAnnotation = (LinkAnnotation) obj4;
            boolean z2 = linkAnnotation instanceof LinkAnnotation.Url;
            int i11 = range6.f16892c;
            int i12 = range6.f16891b;
            if (z2 && linkAnnotation.a() == null) {
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                LinkAnnotation.Url url = (LinkAnnotation.Url) obj4;
                AnnotatedString.Range range7 = new AnnotatedString.Range(i12, i11, url);
                WeakHashMap weakHashMap2 = uRLSpanCache.f17437b;
                Object obj5 = weakHashMap2.get(range7);
                if (obj5 == null) {
                    obj5 = new URLSpan(url.f16908a);
                    weakHashMap2.put(range7, obj5);
                }
                spannableString.setSpan((URLSpan) obj5, i12, i11, 33);
            } else {
                WeakHashMap weakHashMap3 = uRLSpanCache.f17438c;
                Object obj6 = weakHashMap3.get(range6);
                if (obj6 == null) {
                    obj6 = new ComposeClickableSpan((LinkAnnotation) obj4);
                    weakHashMap3.put(range6, obj6);
                }
                spannableString.setSpan((ClickableSpan) obj6, i12, i11, 33);
            }
        }
        return spannableString;
    }
}
