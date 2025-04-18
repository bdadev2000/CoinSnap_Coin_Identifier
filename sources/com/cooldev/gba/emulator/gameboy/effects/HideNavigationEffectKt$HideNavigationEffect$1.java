package com.cooldev.gba.emulator.gameboy.effects;

import android.app.Activity;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt$HideNavigationEffect$1", f = "HideNavigationEffect.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HideNavigationEffectKt$HideNavigationEffect$1 extends i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ State<Lifecycle.State> $lifecycleState$delegate;
    int label;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HideNavigationEffectKt$HideNavigationEffect$1(Activity activity, State<? extends Lifecycle.State> state, g gVar) {
        super(2, gVar);
        this.$activity = activity;
        this.$lifecycleState$delegate = state;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new HideNavigationEffectKt$HideNavigationEffect$1(this.$activity, this.$lifecycleState$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((HideNavigationEffectKt$HideNavigationEffect$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Lifecycle.State HideNavigationEffect$lambda$0;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        HideNavigationEffect$lambda$0 = HideNavigationEffectKt.HideNavigationEffect$lambda$0(this.$lifecycleState$delegate);
        if (WhenMappings.$EnumSwitchMapping$0[HideNavigationEffect$lambda$0.ordinal()] == 1) {
            HideNavigationScreen.INSTANCE.hideNavigation(this.$activity);
        }
        return b0.f30125a;
    }
}
