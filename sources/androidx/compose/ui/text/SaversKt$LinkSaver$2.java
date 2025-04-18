package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaversKt$LinkSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$LinkSaver$2 f16986a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        a.q(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        TextLinkStyles textLinkStyles = null;
        String str = obj2 != null ? (String) obj2 : null;
        a.p(str);
        Object obj3 = list.get(1);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16958j;
        if ((!a.g(obj3, Boolean.FALSE) || (saverKt$Saver$1 instanceof NonNullValueClassSaver)) && obj3 != null) {
            textLinkStyles = (TextLinkStyles) saverKt$Saver$1.f14535b.invoke(obj3);
        }
        return new LinkAnnotation.Url(str, textLinkStyles);
    }
}
