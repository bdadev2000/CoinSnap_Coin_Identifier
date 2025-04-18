package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import b1.f0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$AnnotationRangeSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$AnnotationRangeSaver$1 f16975a = new r(2);

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

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        AnnotatedString.Range range = (AnnotatedString.Range) obj2;
        Object obj3 = range.f16890a;
        AnnotationType annotationType = obj3 instanceof ParagraphStyle ? AnnotationType.f16896a : obj3 instanceof SpanStyle ? AnnotationType.f16897b : obj3 instanceof VerbatimTtsAnnotation ? AnnotationType.f16898c : obj3 instanceof UrlAnnotation ? AnnotationType.d : obj3 instanceof LinkAnnotation.Url ? AnnotationType.f16899f : obj3 instanceof LinkAnnotation.Clickable ? AnnotationType.f16900g : AnnotationType.f16901h;
        int ordinal = annotationType.ordinal();
        Object obj4 = range.f16890a;
        switch (ordinal) {
            case 0:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                obj4 = SaversKt.a((ParagraphStyle) obj4, SaversKt.f16956h, saverScope);
                break;
            case 1:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                obj4 = SaversKt.a((SpanStyle) obj4, SaversKt.f16957i, saverScope);
                break;
            case 2:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                obj4 = SaversKt.a((VerbatimTtsAnnotation) obj4, SaversKt.d, saverScope);
                break;
            case 3:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                obj4 = SaversKt.a((UrlAnnotation) obj4, SaversKt.e, saverScope);
                break;
            case 4:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                obj4 = SaversKt.a((LinkAnnotation.Url) obj4, SaversKt.f16954f, saverScope);
                break;
            case 5:
                a.q(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                obj4 = SaversKt.a((LinkAnnotation.Clickable) obj4, SaversKt.f16955g, saverScope);
                break;
            case 6:
                SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
                break;
            default:
                throw new RuntimeException();
        }
        return f0.b(annotationType, obj4, Integer.valueOf(range.f16891b), Integer.valueOf(range.f16892c), range.d);
    }
}
