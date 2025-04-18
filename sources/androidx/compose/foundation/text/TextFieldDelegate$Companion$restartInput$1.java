package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldDelegate$Companion$restartInput$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditProcessor f6127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f6128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f6129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(EditProcessor editProcessor, l lVar, f0 f0Var) {
        super(1);
        this.f6127a = editProcessor;
        this.f6128b = lVar;
        this.f6129c = f0Var;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextInputSession textInputSession = (TextInputSession) this.f6129c.f30930a;
        TextFieldValue a2 = this.f6127a.a((List) obj);
        if (textInputSession != null && p0.a.g((TextInputSession) textInputSession.f17390a.f17367b.get(), textInputSession)) {
            textInputSession.f17391b.d(null, a2);
        }
        this.f6128b.invoke(a2);
        return b0.f30125a;
    }
}
