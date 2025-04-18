package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TransformedTextFieldState$collectImeNotifications$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextFieldState.NotifyImeListener f6665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$2$1(TransformedTextFieldState transformedTextFieldState, b bVar) {
        super(1);
        this.f6664a = transformedTextFieldState;
        this.f6665b = bVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f6664a.f6651a.f6309f.n(this.f6665b);
        return b0.f30125a;
    }
}
