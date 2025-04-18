package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import b1.d0;
import h0.g;
import j0.e;
import j0.h;
import j0.i;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {1651}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f11449a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RangeSliderState f11451c;
    public final /* synthetic */ MutableInteractionSource d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f11452f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {1652}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f11453a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f11454b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f11455c;
        public final /* synthetic */ RangeSliderState d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ RangeSliderLogic f11456f;

        /* JADX INFO: Access modifiers changed from: package-private */
        @e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {1653, 1665, 1687}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C00441 extends h implements p {

            /* renamed from: a, reason: collision with root package name */
            public Object f11457a;

            /* renamed from: b, reason: collision with root package name */
            public DragInteraction.Start f11458b;

            /* renamed from: c, reason: collision with root package name */
            public c0 f11459c;
            public b0 d;

            /* renamed from: f, reason: collision with root package name */
            public int f11460f;

            /* renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f11461g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ RangeSliderState f11462h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ RangeSliderLogic f11463i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ d0 f11464j;

            /* JADX INFO: Access modifiers changed from: package-private */
            @e(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1705}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            /* loaded from: classes4.dex */
            public final class AnonymousClass2 extends i implements p {

                /* renamed from: a, reason: collision with root package name */
                public int f11465a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RangeSliderLogic f11466b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b0 f11467c;
                public final /* synthetic */ DragInteraction d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(RangeSliderLogic rangeSliderLogic, b0 b0Var, DragInteraction dragInteraction, g gVar) {
                    super(2, gVar);
                    this.f11466b = rangeSliderLogic;
                    this.f11467c = b0Var;
                    this.d = dragInteraction;
                }

                @Override // j0.a
                public final g create(Object obj, g gVar) {
                    return new AnonymousClass2(this.f11466b, this.f11467c, this.d, gVar);
                }

                @Override // q0.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((d0) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
                }

                @Override // j0.a
                public final Object invokeSuspend(Object obj) {
                    i0.a aVar = i0.a.f30806a;
                    int i2 = this.f11465a;
                    if (i2 == 0) {
                        q.m(obj);
                        boolean z2 = this.f11467c.f30919a;
                        RangeSliderLogic rangeSliderLogic = this.f11466b;
                        MutableInteractionSource mutableInteractionSource = z2 ? rangeSliderLogic.f10756b : rangeSliderLogic.f10757c;
                        this.f11465a = 1;
                        if (mutableInteractionSource.a(this.d, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.m(obj);
                    }
                    return d0.b0.f30125a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00441(RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, d0 d0Var, g gVar) {
                super(gVar);
                this.f11462h = rangeSliderState;
                this.f11463i = rangeSliderLogic;
                this.f11464j = d0Var;
            }

            @Override // j0.a
            public final g create(Object obj, g gVar) {
                C00441 c00441 = new C00441(this.f11462h, this.f11463i, this.f11464j, gVar);
                c00441.f11461g = obj;
                return c00441;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C00441) create((AwaitPointerEventScope) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x01a9 A[Catch: CancellationException -> 0x01b7, TryCatch #0 {CancellationException -> 0x01b7, blocks: (B:8:0x0020, B:10:0x01a1, B:12:0x01a9, B:16:0x01af), top: B:7:0x0020 }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x01af A[Catch: CancellationException -> 0x01b7, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x01b7, blocks: (B:8:0x0020, B:10:0x01a1, B:12:0x01a9, B:16:0x01af), top: B:7:0x0020 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x019e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
            /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.jvm.internal.c0] */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.foundation.interaction.DragInteraction$Start, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.jvm.internal.b0] */
            @Override // j0.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 471
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C00441.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, RangeSliderState rangeSliderState, RangeSliderLogic rangeSliderLogic, g gVar) {
            super(2, gVar);
            this.f11455c = pointerInputScope;
            this.d = rangeSliderState;
            this.f11456f = rangeSliderLogic;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11455c, this.d, this.f11456f, gVar);
            anonymousClass1.f11454b = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f11453a;
            if (i2 == 0) {
                q.m(obj);
                d0 d0Var = (d0) this.f11454b;
                C00441 c00441 = new C00441(this.d, this.f11456f, d0Var, null);
                this.f11453a = 1;
                if (ForEachGestureKt.b(this.f11455c, c00441, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            return d0.b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, g gVar) {
        super(2, gVar);
        this.f11451c = rangeSliderState;
        this.d = mutableInteractionSource;
        this.f11452f = mutableInteractionSource2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.f11451c, this.d, this.f11452f, gVar);
        sliderKt$rangeSliderPressDragModifier$1.f11450b = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create((PointerInputScope) obj, (g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f11449a;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.f11450b;
            MutableInteractionSource mutableInteractionSource = this.d;
            MutableInteractionSource mutableInteractionSource2 = this.f11452f;
            RangeSliderState rangeSliderState = this.f11451c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, rangeSliderState, new RangeSliderLogic(rangeSliderState, mutableInteractionSource, mutableInteractionSource2), null);
            this.f11449a = 1;
            if (p0.a.J(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return d0.b0.f30125a;
    }
}
