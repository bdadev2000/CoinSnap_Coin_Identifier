package androidx.compose.foundation.text;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class CoreTextFieldKt$CoreTextField$pointerModifier$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5897a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5897a = legacyTextFieldState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f5897a.f6035q.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return b0.f30125a;
    }
}
