package com.swordfish.libretrodroid;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import b1.d0;
import com.swordfish.libretrodroid.GLRetroView;
import d0.b0;
import e1.l0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class GLRetroView$Renderer$onSurfaceCreated$1 extends r implements q0.a {
    final /* synthetic */ GLRetroView this$0;

    @e(c = "com.swordfish.libretrodroid.GLRetroView$Renderer$onSurfaceCreated$1$1", f = "GLRetroView.kt", l = {296}, m = "invokeSuspend")
    /* renamed from: com.swordfish.libretrodroid.GLRetroView$Renderer$onSurfaceCreated$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        int label;
        final /* synthetic */ GLRetroView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GLRetroView gLRetroView, g gVar) {
            super(2, gVar);
            this.this$0 = gLRetroView;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(this.this$0, gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            l0 l0Var;
            i0.a aVar = i0.a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                l0Var = this.this$0.retroGLEventsSubject;
                GLRetroView.GLRetroEvents.SurfaceCreated surfaceCreated = GLRetroView.GLRetroEvents.SurfaceCreated.INSTANCE;
                this.label = 1;
                if (l0Var.emit(surfaceCreated, this) == aVar) {
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
    public GLRetroView$Renderer$onSurfaceCreated$1(GLRetroView gLRetroView) {
        super(0);
        this.this$0 = gLRetroView;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m619invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m619invoke() {
        Lifecycle lifecycle;
        Thread.currentThread().setPriority(10);
        this.this$0.initializeCore();
        lifecycle = this.this$0.lifecycle;
        if (lifecycle != null) {
            kotlin.jvm.internal.e.v(LifecycleKt.a(lifecycle), null, 0, new AnonymousClass1(this.this$0, null), 3);
        }
    }
}
