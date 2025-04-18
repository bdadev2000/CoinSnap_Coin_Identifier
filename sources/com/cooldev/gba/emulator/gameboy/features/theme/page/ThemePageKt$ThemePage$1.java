package com.cooldev.gba.emulator.gameboy.features.theme.page;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class ThemePageKt$ThemePage$1 extends r implements l {
    final /* synthetic */ AppPrefUtils $appPrefUtils;
    final /* synthetic */ Context $context;
    final /* synthetic */ d0 $coroutineScope;
    final /* synthetic */ MutableState<Boolean> $showingDialogGoodLuck$delegate;
    final /* synthetic */ MutableState<Boolean> $showingDialogSurvey$delegate;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$1$1", f = "ThemePage.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ AppPrefUtils $appPrefUtils;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $showingDialogSurvey$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppPrefUtils appPrefUtils, Context context, MutableState<Boolean> mutableState, g gVar) {
            super(2, gVar);
            this.$appPrefUtils = appPrefUtils;
            this.$context = context;
            this.$showingDialogSurvey$delegate = mutableState;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(this.$appPrefUtils, this.$context, this.$showingDialogSurvey$delegate, gVar);
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
            boolean isSurveyDialogShown = this.$appPrefUtils.isSurveyDialogShown(this.$context);
            b0 b0Var = b0.f30125a;
            if (isSurveyDialogShown) {
                return b0Var;
            }
            ThemePageKt.ThemePage$lambda$2(this.$showingDialogSurvey$delegate, true);
            return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemePageKt$ThemePage$1(d0 d0Var, AppPrefUtils appPrefUtils, Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$coroutineScope = d0Var;
        this.$appPrefUtils = appPrefUtils;
        this.$context = context;
        this.$showingDialogSurvey$delegate = mutableState;
        this.$showingDialogGoodLuck$delegate = mutableState2;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        p0.a.s(disposableEffectScope, "$this$DisposableEffect");
        kotlin.jvm.internal.e.v(this.$coroutineScope, null, 0, new AnonymousClass1(this.$appPrefUtils, this.$context, this.$showingDialogSurvey$delegate, null), 3);
        final MutableState<Boolean> mutableState = this.$showingDialogSurvey$delegate;
        final MutableState<Boolean> mutableState2 = this.$showingDialogGoodLuck$delegate;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ThemePageKt.ThemePage$lambda$2(MutableState.this, false);
                ThemePageKt.ThemePage$lambda$5(mutableState2, false);
            }
        };
    }
}
