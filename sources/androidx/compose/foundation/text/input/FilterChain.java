package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.PasswordInputTransformation;
import androidx.compose.ui.semantics.SemanticsConfiguration;

/* loaded from: classes.dex */
final class FilterChain implements InputTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final InputTransformation f6291a;

    /* renamed from: b, reason: collision with root package name */
    public final InputTransformation f6292b;

    public FilterChain(InputTransformation inputTransformation, PasswordInputTransformation passwordInputTransformation) {
        this.f6291a = inputTransformation;
        this.f6292b = passwordInputTransformation;
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        this.f6291a.B(semanticsConfiguration);
        this.f6292b.B(semanticsConfiguration);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void C(TextFieldBuffer textFieldBuffer) {
        this.f6291a.C(textFieldBuffer);
        this.f6292b.C(textFieldBuffer);
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final KeyboardOptions D() {
        KeyboardOptions D = this.f6292b.D();
        InputTransformation inputTransformation = this.f6291a;
        return D != null ? D.a(inputTransformation.D()) : inputTransformation.D();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FilterChain.class != obj.getClass()) {
            return false;
        }
        FilterChain filterChain = (FilterChain) obj;
        return p0.a.g(this.f6291a, filterChain.f6291a) && p0.a.g(this.f6292b, filterChain.f6292b) && p0.a.g(D(), filterChain.D());
    }

    public final int hashCode() {
        int hashCode = (this.f6292b.hashCode() + (this.f6291a.hashCode() * 31)) * 32;
        KeyboardOptions D = D();
        return hashCode + (D != null ? D.hashCode() : 0);
    }

    public final String toString() {
        return this.f6291a + ".then(" + this.f6292b + ')';
    }
}
