package com.cooldev.gba.emulator.gameboy.effects;

import android.app.Activity;
import b1.d0;
import b1.o0;
import d0.b0;
import h0.g;
import h1.c;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1", f = "SetRequestedOrientationPortrait.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1 extends i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $lockPortrait;
    int label;

    @e(c = "com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1$1", f = "SetRequestedOrientationPortrait.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ int $orientation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, int i2, g gVar) {
            super(2, gVar);
            this.$activity = activity;
            this.$orientation = i2;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(this.$activity, this.$orientation, gVar);
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f30806a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            this.$activity.setRequestedOrientation(this.$orientation);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1(boolean z2, Activity activity, g gVar) {
        super(2, gVar);
        this.$lockPortrait = z2;
        this.$activity = activity;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1(this.$lockPortrait, this.$activity, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            int i3 = this.$lockPortrait ? 1 : -1;
            c cVar = o0.f22356b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, i3, null);
            this.label = 1;
            if (kotlin.jvm.internal.e.G(this, cVar, anonymousClass1) == aVar) {
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
