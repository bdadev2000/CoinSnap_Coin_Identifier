package com.cooldev.gba.emulator.gameboy.features.home.page;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class HomePageKt$HomePage$8$1$4 extends r implements a {
    final /* synthetic */ d0 $scope;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$8$1$4$1", f = "HomePage.kt", l = {Opcodes.MONITORENTER}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$8$1$4$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ UserGuideViewModel $userGuideViewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserGuideViewModel userGuideViewModel, g gVar) {
            super(2, gVar);
            this.$userGuideViewModel = userGuideViewModel;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(this.$userGuideViewModel, gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.label;
            if (i2 == 0) {
                q.m(obj);
                this.$userGuideViewModel.closeUserGuide();
                this.label = 1;
                if (p0.a.L(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            this.$userGuideViewModel.moveToNextGuide();
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageKt$HomePage$8$1$4(d0 d0Var, UserGuideViewModel userGuideViewModel) {
        super(0);
        this.$scope = d0Var;
        this.$userGuideViewModel = userGuideViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m224invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m224invoke() {
        kotlin.jvm.internal.e.v(this.$scope, null, 0, new AnonymousClass1(this.$userGuideViewModel, null), 3);
    }
}
