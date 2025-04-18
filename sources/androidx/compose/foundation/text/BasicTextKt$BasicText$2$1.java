package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.runtime.MutableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BasicTextKt$BasicText$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MutableState f5650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$2$1(MutableState mutableState) {
        super(1);
        this.f5650a = mutableState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = (TextAnnotatedStringNode.TextSubstitutionValue) obj;
        this.f5650a.setValue(textSubstitutionValue.f6981c ? textSubstitutionValue.f6980b : textSubstitutionValue.f6979a);
        return b0.f30125a;
    }
}
