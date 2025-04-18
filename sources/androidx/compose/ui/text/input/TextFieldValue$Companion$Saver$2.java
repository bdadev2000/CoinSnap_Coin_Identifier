package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.NonNullValueClassSaver;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
public final class TextFieldValue$Companion$Saver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$2 f17365a = new r(1);

    public static TextFieldValue b(Object obj) {
        p0.a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
        Boolean bool = Boolean.FALSE;
        AnnotatedString annotatedString = ((!p0.a.g(obj2, bool) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj2 != null) ? (AnnotatedString) saverKt$Saver$1.f14535b.invoke(obj2) : null;
        p0.a.p(annotatedString);
        Object obj3 = list.get(1);
        int i2 = TextRange.f17057c;
        SaverKt$Saver$1 saverKt$Saver$12 = SaversKt.f16964p;
        TextRange textRange = ((!p0.a.g(obj3, bool) || (saverKt$Saver$12 instanceof NonNullValueClassSaver)) && obj3 != null) ? (TextRange) saverKt$Saver$12.f14535b.invoke(obj3) : null;
        p0.a.p(textRange);
        return new TextFieldValue(annotatedString, textRange.f17058a, (TextRange) null);
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(obj);
    }
}
