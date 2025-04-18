package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f9355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1(boolean z2, FocusRequester focusRequester) {
        super(0);
        this.f9354a = z2;
        this.f9355b = focusRequester;
    }

    @Override // q0.a
    public final Object invoke() {
        if (this.f9354a) {
            this.f9355b.b();
        }
        return b0.f30125a;
    }
}
