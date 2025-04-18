package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$2 f16976a = new r(1);

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        a.p(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        a.p(num);
        int intValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        a.p(num2);
        int intValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        a.p(str);
        switch (annotationType.ordinal()) {
            case 0:
                Object obj6 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16956h;
                if ((!a.g(obj6, Boolean.FALSE) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj6 != null) {
                    r1 = (ParagraphStyle) saverKt$Saver$1.f14535b.invoke(obj6);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 1:
                Object obj7 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.f16957i;
                if ((!a.g(obj7, Boolean.FALSE) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj7 != null) {
                    r1 = (SpanStyle) saverKt$Saver$12.f14535b.invoke(obj7);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 2:
                Object obj8 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$13 = SaversKt.d;
                if ((!a.g(obj8, Boolean.FALSE) || (saverKt$Saver$13 instanceof NonNullValueClassSaver)) && obj8 != null) {
                    r1 = (VerbatimTtsAnnotation) saverKt$Saver$13.f14535b.invoke(obj8);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 3:
                Object obj9 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$14 = SaversKt.e;
                if ((!a.g(obj9, Boolean.FALSE) || (saverKt$Saver$14 instanceof NonNullValueClassSaver)) && obj9 != null) {
                    r1 = (UrlAnnotation) saverKt$Saver$14.f14535b.invoke(obj9);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 4:
                Object obj10 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$15 = SaversKt.f16954f;
                if ((!a.g(obj10, Boolean.FALSE) || (saverKt$Saver$15 instanceof NonNullValueClassSaver)) && obj10 != null) {
                    r1 = (LinkAnnotation.Url) saverKt$Saver$15.f14535b.invoke(obj10);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 5:
                Object obj11 = list.get(1);
                SaverKt$Saver$1 saverKt$Saver$16 = SaversKt.f16955g;
                if ((!a.g(obj11, Boolean.FALSE) || (saverKt$Saver$16 instanceof NonNullValueClassSaver)) && obj11 != null) {
                    r1 = (LinkAnnotation.Clickable) saverKt$Saver$16.f14535b.invoke(obj11);
                }
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            case 6:
                Object obj12 = list.get(1);
                r1 = obj12 != null ? (String) obj12 : null;
                a.p(r1);
                return new AnnotatedString.Range(r1, str, intValue, intValue2);
            default:
                throw new RuntimeException();
        }
    }
}
