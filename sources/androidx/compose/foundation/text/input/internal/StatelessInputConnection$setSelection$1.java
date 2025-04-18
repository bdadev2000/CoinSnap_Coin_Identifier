package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class StatelessInputConnection$setSelection$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$setSelection$1(int i2, int i3) {
        super(1);
        this.f6500a = i2;
        this.f6501b = i3;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((EditingBuffer) obj).h(this.f6500a, this.f6501b);
        return b0.f30125a;
    }
}
