package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$ParagraphStyleSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$ParagraphStyleSaver$1 f16995a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        ParagraphStyle paragraphStyle = (ParagraphStyle) obj2;
        TextAlign textAlign = new TextAlign(paragraphStyle.f16936a);
        SaverKt$Saver$1 saverKt$Saver$1 = SaversKt.f16951a;
        TextDirection textDirection = new TextDirection(paragraphStyle.f16937b);
        Object a2 = SaversKt.a(new TextUnit(paragraphStyle.f16938c), SaversKt.f16967s, saverScope);
        TextIndent textIndent = TextIndent.f17474c;
        return f0.b(textAlign, textDirection, a2, SaversKt.a(paragraphStyle.d, SaversKt.f16961m, saverScope));
    }
}
