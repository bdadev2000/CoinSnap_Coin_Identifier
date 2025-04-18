package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.SuspendAnimationKt;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", l = {364}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WindowInsetsNestedScrollConnection$fling$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4178a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsNestedScrollConnection f4180c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f4181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SplineBasedFloatDecayAnimationSpec f4182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4184i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f4185j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsAnimationController f4186k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f4187l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", l = {348}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f4188a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4189b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f4190c;
        public final /* synthetic */ SplineBasedFloatDecayAnimationSpec d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4191f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f4192g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsNestedScrollConnection f4193h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ c0 f4194i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f4195j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f4196k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00171 extends r implements p {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f4197a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f4198b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsNestedScrollConnection f4199c;
            public final /* synthetic */ c0 d;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationController f4200f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ boolean f4201g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(int i2, int i3, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, c0 c0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z2) {
                super(2);
                this.f4197a = i2;
                this.f4198b = i3;
                this.f4199c = windowInsetsNestedScrollConnection;
                this.d = c0Var;
                this.f4200f = windowInsetsAnimationController;
                this.f4201g = z2;
            }

            @Override // q0.p
            public final Object invoke(Object obj, Object obj2) {
                Insets currentInsets;
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                float f2 = this.f4197a;
                float f3 = this.f4198b;
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4199c;
                if (floatValue > f3 || f2 > floatValue) {
                    this.d.f30922a = floatValue2;
                    this.f4200f.finish(this.f4201g);
                    windowInsetsNestedScrollConnection.f4164f = null;
                    h1 h1Var = windowInsetsNestedScrollConnection.f4168j;
                    if (h1Var != null) {
                        h1Var.a(new WindowInsetsAnimationCancelledException());
                    }
                } else {
                    WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection.f4164f;
                    if (windowInsetsAnimationController != null) {
                        currentInsets = windowInsetsAnimationController.getCurrentInsets();
                        windowInsetsAnimationController.setInsetsAndAlpha(windowInsetsNestedScrollConnection.f4163c.c(currentInsets, Math.round(floatValue)), 1.0f, 0.0f);
                    }
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f2, int i2, int i3, int i4, WindowInsetsAnimationController windowInsetsAnimationController, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, g gVar, c0 c0Var, boolean z2) {
            super(2, gVar);
            this.f4189b = i2;
            this.f4190c = f2;
            this.d = splineBasedFloatDecayAnimationSpec;
            this.f4191f = i3;
            this.f4192g = i4;
            this.f4193h = windowInsetsNestedScrollConnection;
            this.f4194i = c0Var;
            this.f4195j = windowInsetsAnimationController;
            this.f4196k = z2;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            int i2 = this.f4189b;
            float f2 = this.f4190c;
            SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.d;
            return new AnonymousClass1(f2, i2, this.f4191f, this.f4192g, this.f4195j, splineBasedFloatDecayAnimationSpec, this.f4193h, gVar, this.f4194i, this.f4196k);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f4188a;
            if (i2 == 0) {
                q.m(obj);
                float f2 = this.f4189b;
                C00171 c00171 = new C00171(this.f4191f, this.f4192g, this.f4193h, this.f4194i, this.f4195j, this.f4196k);
                this.f4188a = 1;
                if (SuspendAnimationKt.d(f2, this.f4190c, this.d, c00171, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$2(float f2, int i2, int i3, int i4, WindowInsetsAnimationController windowInsetsAnimationController, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, g gVar, c0 c0Var, boolean z2) {
        super(2, gVar);
        this.f4180c = windowInsetsNestedScrollConnection;
        this.d = i2;
        this.f4181f = f2;
        this.f4182g = splineBasedFloatDecayAnimationSpec;
        this.f4183h = i3;
        this.f4184i = i4;
        this.f4185j = c0Var;
        this.f4186k = windowInsetsAnimationController;
        this.f4187l = z2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4180c;
        int i2 = this.d;
        float f2 = this.f4181f;
        SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.f4182g;
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(f2, i2, this.f4183h, this.f4184i, this.f4186k, splineBasedFloatDecayAnimationSpec, windowInsetsNestedScrollConnection, gVar, this.f4185j, this.f4187l);
        windowInsetsNestedScrollConnection$fling$2.f4179b = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f4178a;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4180c;
        if (i2 == 0) {
            q.m(obj);
            d0 d0Var = (d0) this.f4179b;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = this.f4180c;
            int i3 = this.d;
            float f2 = this.f4181f;
            SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.f4182g;
            windowInsetsNestedScrollConnection2.f4168j = kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(f2, i3, this.f4183h, this.f4184i, this.f4186k, splineBasedFloatDecayAnimationSpec, windowInsetsNestedScrollConnection2, null, this.f4185j, this.f4187l), 3);
            h1 h1Var = windowInsetsNestedScrollConnection.f4168j;
            if (h1Var != null) {
                this.f4178a = 1;
                if (h1Var.v(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        windowInsetsNestedScrollConnection.f4168j = null;
        return b0.f30125a;
    }
}
