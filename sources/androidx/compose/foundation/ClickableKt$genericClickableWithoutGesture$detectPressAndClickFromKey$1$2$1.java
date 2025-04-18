package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", l = {443}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f2640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PressInteraction.Press f2641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, g gVar) {
        super(2, gVar);
        this.f2640b = mutableInteractionSource;
        this.f2641c = press;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.f2640b, this.f2641c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2639a;
        if (i2 == 0) {
            q.m(obj);
            PressInteraction.Release release = new PressInteraction.Release(this.f2641c);
            this.f2639a = 1;
            if (this.f2640b.a(release, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
