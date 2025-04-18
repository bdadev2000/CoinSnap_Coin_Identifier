package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements CodepointTransformation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6262b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f6261a = i2;
        this.f6262b = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int a(int i2, int i3) {
        int i4 = this.f6261a;
        Object obj = this.f6262b;
        switch (i4) {
            case 0:
                return ((Character) ((State) obj).getValue()).charValue();
            default:
                SecureTextFieldController secureTextFieldController = (SecureTextFieldController) obj;
                return i2 == secureTextFieldController.f6096b.f6086b.g() ? i3 : ((Character) secureTextFieldController.f6095a.getValue()).charValue();
        }
    }
}
