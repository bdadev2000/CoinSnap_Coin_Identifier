package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class WindowInsetsNestedScrollConnection$fling$3 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsNestedScrollConnection f4203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4204c;
    public final /* synthetic */ int d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f4205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsAnimationController f4206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4207h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", l = {374}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f4208a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4209b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4210c;
        public final /* synthetic */ float d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f4211f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f4212g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsNestedScrollConnection f4213h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C00181 extends r implements l {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsNestedScrollConnection f4214a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00181(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
                super(1);
                this.f4214a = windowInsetsNestedScrollConnection;
            }

            @Override // q0.l
            public final Object invoke(Object obj) {
                Insets currentInsets;
                float floatValue = ((Number) ((Animatable) obj).d()).floatValue();
                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4214a;
                WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection.f4164f;
                if (windowInsetsAnimationController != null) {
                    currentInsets = windowInsetsAnimationController.getCurrentInsets();
                    windowInsetsAnimationController.setInsetsAndAlpha(windowInsetsNestedScrollConnection.f4163c.c(currentInsets, Math.round(floatValue)), 1.0f, 0.0f);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f2, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, g gVar, boolean z2) {
            super(2, gVar);
            this.f4209b = i2;
            this.f4210c = i3;
            this.d = f2;
            this.f4211f = windowInsetsAnimationController;
            this.f4212g = z2;
            this.f4213h = windowInsetsNestedScrollConnection;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            int i2 = this.f4209b;
            int i3 = this.f4210c;
            return new AnonymousClass1(this.d, i2, i3, this.f4211f, this.f4213h, gVar, this.f4212g);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f4208a;
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4213h;
            if (i2 == 0) {
                q.m(obj);
                Animatable a2 = AnimatableKt.a(this.f4209b);
                Float f2 = new Float(this.f4210c);
                Float f3 = new Float(this.d);
                C00181 c00181 = new C00181(windowInsetsNestedScrollConnection);
                this.f4208a = 1;
                if (Animatable.c(a2, f2, null, f3, c00181, this, 2) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            this.f4211f.finish(this.f4212g);
            windowInsetsNestedScrollConnection.f4164f = null;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$3(float f2, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, g gVar, boolean z2) {
        super(2, gVar);
        this.f4203b = windowInsetsNestedScrollConnection;
        this.f4204c = i2;
        this.d = i3;
        this.f4205f = f2;
        this.f4206g = windowInsetsAnimationController;
        this.f4207h = z2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4203b;
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.f4205f, this.f4204c, this.d, this.f4206g, windowInsetsNestedScrollConnection, gVar, this.f4207h);
        windowInsetsNestedScrollConnection$fling$3.f4202a = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = (WindowInsetsNestedScrollConnection$fling$3) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        windowInsetsNestedScrollConnection$fling$3.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f4202a;
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.f4203b;
        windowInsetsNestedScrollConnection.f4168j = kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(this.f4205f, this.f4204c, this.d, this.f4206g, windowInsetsNestedScrollConnection, null, this.f4207h), 3);
        return b0.f30125a;
    }
}
