package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f5934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f5935c;
    public final /* synthetic */ LegacyPlatformTextInputServiceAdapter d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, ImeOptions imeOptions, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter) {
        super(0);
        this.f5933a = legacyTextFieldState;
        this.f5934b = focusRequester;
        this.f5935c = imeOptions;
        this.d = legacyPlatformTextInputServiceAdapter;
    }

    @Override // q0.a
    public final Object invoke() {
        if (!this.f5933a.b()) {
            this.f5934b.b();
        }
        ImeOptions imeOptions = this.f5935c;
        if (!KeyboardType.a(imeOptions.d, 7) && !KeyboardType.a(imeOptions.d, 8)) {
            this.d.i();
        }
        return Boolean.TRUE;
    }
}
