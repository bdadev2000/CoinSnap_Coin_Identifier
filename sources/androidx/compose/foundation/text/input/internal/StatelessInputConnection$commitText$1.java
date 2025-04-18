package androidx.compose.foundation.text.input.internal;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class StatelessInputConnection$commitText$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6488b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$commitText$1(int i2, CharSequence charSequence) {
        super(1);
        this.f6487a = charSequence;
        this.f6488b = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        EditCommandKt.a((EditingBuffer) obj, String.valueOf(this.f6487a), this.f6488b);
        return b0.f30125a;
    }
}
