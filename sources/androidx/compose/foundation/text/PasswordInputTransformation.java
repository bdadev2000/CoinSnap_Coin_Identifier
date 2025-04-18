package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PasswordInputTransformation implements InputTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f6085a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f6086b = SnapshotIntStateKt.a(-1);

    public PasswordInputTransformation(q0.a aVar) {
        this.f6085a = aVar;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void C(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.a().f6369a.f14144c != 1 || TextRange.d(textFieldBuffer.a().d(0)) != 1 || TextRange.d(textFieldBuffer.a().c(0)) != 0 || (!TextRange.c(textFieldBuffer.f6296f))) {
            a(-1);
            return;
        }
        int f2 = TextRange.f(textFieldBuffer.a().d(0));
        if (this.f6086b.g() != f2) {
            this.f6085a.invoke();
            a(f2);
        }
    }

    public final void a(int i2) {
        this.f6086b.b(i2);
    }
}
