package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class SaversKt$TextIndentSaver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final SaversKt$TextIndentSaver$1 f17005a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        TextIndent textIndent = (TextIndent) obj2;
        TextUnit textUnit = new TextUnit(textIndent.f17475a);
        SaversKt$NonNullValueClassSaver$1 saversKt$NonNullValueClassSaver$1 = SaversKt.f16967s;
        return f0.b(SaversKt.a(textUnit, saversKt$NonNullValueClassSaver$1, saverScope), SaversKt.a(new TextUnit(textIndent.f17476b), saversKt$NonNullValueClassSaver$1, saverScope));
    }
}
