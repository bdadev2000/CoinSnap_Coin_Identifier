package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.jvm.internal.o;
import q0.p;
import z0.m;

/* loaded from: classes4.dex */
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends o implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldSelectionState$observeTextChanges$3 f6834a = new o(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(m.O0(((TextFieldCharSequence) obj).f6297a, (CharSequence) obj2));
    }
}
