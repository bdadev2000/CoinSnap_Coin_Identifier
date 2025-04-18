package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import b1.f0;
import e0.w;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$AnnotatedStringSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$AnnotatedStringSaver$1 f16971a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        AnnotatedString annotatedString = (AnnotatedString) obj2;
        String str = annotatedString.f16880a;
        List b2 = annotatedString.b();
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16952b;
        Object a2 = SaversKt.a(b2, saverKt$Saver$1, saverScope);
        Object obj3 = annotatedString.f16882c;
        if (obj3 == null) {
            obj3 = w.f30218a;
        }
        return f0.b(str, a2, SaversKt.a(obj3, saverKt$Saver$1, saverScope), SaversKt.a(annotatedString.d, saverKt$Saver$1, saverScope));
    }
}
