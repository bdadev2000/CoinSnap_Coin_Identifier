package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class InputMethodManagerImpl$imm$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputMethodManagerImpl f6420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(InputMethodManagerImpl inputMethodManagerImpl) {
        super(0);
        this.f6420a = inputMethodManagerImpl;
    }

    @Override // q0.a
    public final Object invoke() {
        Object systemService = this.f6420a.f6418a.getContext().getSystemService("input_method");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (android.view.inputmethod.InputMethodManager) systemService;
    }
}
