package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1", f = "Slider.kt", l = {1627}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$sliderTapModifier$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11478a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SliderState f11480c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements q {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ long f11481a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SliderState f11482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SliderState sliderState, g gVar) {
            super(3, gVar);
            this.f11482b = sliderState;
        }

        @Override // q0.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            long j2 = ((Offset) obj2).f14913a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11482b, (g) obj3);
            anonymousClass1.f11481a = j2;
            b0 b0Var = b0.f30125a;
            anonymousClass1.invokeSuspend(b0Var);
            return b0Var;
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            kotlin.jvm.internal.q.m(obj);
            long j2 = this.f11481a;
            SliderState sliderState = this.f11482b;
            sliderState.f11498n.n((sliderState.f11492h ? sliderState.f11491g.g() - Offset.g(j2) : Offset.g(j2)) - sliderState.f11497m.c());
            return b0.f30125a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SliderState f11483a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SliderState sliderState) {
            super(1);
            this.f11483a = sliderState;
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long j2 = ((Offset) obj).f14913a;
            SliderState sliderState = this.f11483a;
            sliderState.b(0.0f);
            ((SliderState$gestureEndAction$1) sliderState.f11496l).invoke();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$sliderTapModifier$1(SliderState sliderState, g gVar) {
        super(2, gVar);
        this.f11480c = sliderState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SliderKt$sliderTapModifier$1 sliderKt$sliderTapModifier$1 = new SliderKt$sliderTapModifier$1(this.f11480c, gVar);
        sliderKt$sliderTapModifier$1.f11479b = obj;
        return sliderKt$sliderTapModifier$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$sliderTapModifier$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11478a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f11479b;
            SliderState sliderState = this.f11480c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(sliderState, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(sliderState);
            this.f11478a = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, anonymousClass1, anonymousClass2, this, 3) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
