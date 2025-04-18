package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$TextLinkStylesSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextLinkStylesSaver$1 f17007a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj2;
        SpanStyle spanStyle = textLinkStyles.f17050a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16957i;
        return f0.b(SaversKt.a(spanStyle, saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.f17051b, saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.f17052c, saverKt$Saver$1, saverScope), SaversKt.a(textLinkStyles.d, saverKt$Saver$1, saverScope));
    }
}
