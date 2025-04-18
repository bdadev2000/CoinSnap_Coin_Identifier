package androidx.compose.ui.text;

import kotlin.jvm.internal.r;
import p0.a;
import q0.q;

/* loaded from: classes4.dex */
final class AnnotatedStringKt$decapitalize$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        if (intValue == 0) {
            a.r(str.substring(intValue, intValue2), "this as java.lang.String…ing(startIndex, endIndex)");
            throw null;
        }
        String substring = str.substring(intValue, intValue2);
        a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
