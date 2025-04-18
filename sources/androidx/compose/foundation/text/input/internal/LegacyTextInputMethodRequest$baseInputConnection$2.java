package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
final class LegacyTextInputMethodRequest$baseInputConnection$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextInputMethodRequest f6460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextInputMethodRequest$baseInputConnection$2(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        super(0);
        this.f6460a = legacyTextInputMethodRequest;
    }

    @Override // q0.a
    public final Object invoke() {
        return new BaseInputConnection(this.f6460a.f6449a, false);
    }
}
