package androidx.compose.material.ripple;

import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidRippleIndicationInstance f7383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.f7383a = androidRippleIndicationInstance;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f7383a.f7379k.setValue(Boolean.valueOf(!((Boolean) r0.f7379k.getValue()).booleanValue()));
        return b0.f30125a;
    }
}
