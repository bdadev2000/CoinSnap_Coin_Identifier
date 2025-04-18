package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import b1.f0;
import d0.h;
import d0.i;
import e0.w;
import java.util.ArrayList;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f16923a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16924b;

    /* renamed from: c, reason: collision with root package name */
    public final h f16925c;
    public final h d;
    public final ArrayList e;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver) {
        ParagraphStyle paragraphStyle;
        String str;
        AnnotatedString.Range range;
        int i2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i4;
        int i5;
        AnnotatedString annotatedString2 = annotatedString;
        this.f16923a = annotatedString2;
        this.f16924b = list;
        i iVar = i.f30133c;
        this.f16925c = f0.s(iVar, new MultiParagraphIntrinsics$minIntrinsicWidth$2(this));
        this.d = f0.s(iVar, new MultiParagraphIntrinsics$maxIntrinsicWidth$2(this));
        AnnotatedString annotatedString3 = AnnotatedStringKt.f16893a;
        int length = annotatedString2.f16880a.length();
        List list2 = annotatedString2.f16882c;
        list2 = list2 == null ? w.f30218a : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            paragraphStyle = textStyle.f17060b;
            if (i6 >= size) {
                break;
            }
            AnnotatedString.Range range2 = (AnnotatedString.Range) list2.get(i6);
            ParagraphStyle paragraphStyle2 = (ParagraphStyle) range2.f16890a;
            int i8 = range2.f16891b;
            if (i8 != i7) {
                arrayList3.add(new AnnotatedString.Range(i7, i8, paragraphStyle));
            }
            ParagraphStyle a2 = paragraphStyle.a(paragraphStyle2);
            int i9 = range2.f16892c;
            arrayList3.add(new AnnotatedString.Range(i8, i9, a2));
            i6++;
            i7 = i9;
        }
        if (i7 != length) {
            arrayList3.add(new AnnotatedString.Range(i7, length, paragraphStyle));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new AnnotatedString.Range(0, 0, paragraphStyle));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList3.get(i10);
            int i11 = range3.f16891b;
            int i12 = range3.f16892c;
            if (i11 != i12) {
                str = annotatedString2.f16880a.substring(i11, i12);
                a.r(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            AnnotatedString annotatedString4 = new AnnotatedString(str, AnnotatedStringKt.b(annotatedString2, i11, i12), null, null);
            ParagraphStyle paragraphStyle3 = (ParagraphStyle) range3.f16890a;
            if (TextDirection.a(paragraphStyle3.f16937b, Integer.MIN_VALUE)) {
                range = range3;
                i2 = size2;
                arrayList = arrayList3;
                i3 = i10;
                arrayList2 = arrayList4;
                paragraphStyle3 = new ParagraphStyle(paragraphStyle3.f16936a, paragraphStyle.f16937b, paragraphStyle3.f16938c, paragraphStyle3.d, paragraphStyle3.e, paragraphStyle3.f16939f, paragraphStyle3.f16940g, paragraphStyle3.f16941h, paragraphStyle3.f16942i);
            } else {
                arrayList2 = arrayList4;
                i2 = size2;
                arrayList = arrayList3;
                i3 = i10;
                range = range3;
            }
            TextStyle textStyle2 = new TextStyle(textStyle.f17059a, paragraphStyle.a(paragraphStyle3));
            List b2 = annotatedString4.b();
            List list3 = this.f16924b;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            AnnotatedString.Range range4 = range;
            int i13 = 0;
            while (true) {
                i4 = range4.f16891b;
                if (i13 >= size3) {
                    break;
                }
                Object obj = list3.get(i13);
                AnnotatedString.Range range5 = (AnnotatedString.Range) obj;
                if (AnnotatedStringKt.c(i4, i12, range5.f16891b, range5.f16892c)) {
                    arrayList5.add(obj);
                }
                i13++;
            }
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i14 = 0; i14 < size4; i14++) {
                AnnotatedString.Range range6 = (AnnotatedString.Range) arrayList5.get(i14);
                int i15 = range6.f16891b;
                if (i4 > i15 || (i5 = range6.f16892c) > i12) {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList6.add(new AnnotatedString.Range(i15 - i4, i5 - i4, range6.f16890a));
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = new ParagraphIntrinsicInfo(new AndroidParagraphIntrinsics(textStyle2, resolver, density, str, b2, arrayList6), i4, i12);
            arrayList4 = arrayList2;
            arrayList4.add(paragraphIntrinsicInfo);
            i10 = i3 + 1;
            annotatedString2 = annotatedString;
            size2 = i2;
            arrayList3 = arrayList;
        }
        this.e = arrayList4;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ParagraphIntrinsicInfo) arrayList.get(i2)).f16933a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float c() {
        return ((Number) this.f16925c.getValue()).floatValue();
    }
}
