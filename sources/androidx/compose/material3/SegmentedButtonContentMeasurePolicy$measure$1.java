package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SegmentedButtonContentMeasurePolicy$measure$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animatable f11076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonContentMeasurePolicy$measure$1(Animatable animatable, int i2, g gVar) {
        super(2, gVar);
        this.f11076b = animatable;
        this.f11077c = i2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SegmentedButtonContentMeasurePolicy$measure$1(this.f11076b, this.f11077c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SegmentedButtonContentMeasurePolicy$measure$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11075a;
        if (i2 == 0) {
            q.m(obj);
            Animatable animatable = this.f11076b;
            Integer num = new Integer(this.f11077c);
            TweenSpec d = AnimationSpecKt.d(350, 0, null, 6);
            this.f11075a = 1;
            if (Animatable.c(animatable, num, d, null, null, this, 12) == aVar) {
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
