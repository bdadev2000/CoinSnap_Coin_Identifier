package com.cooldev.gba.emulator.gameboy.features.theme.page;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.ThemeEvents;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class ThemePageKt$ThemePage$4 extends r implements a {
    final /* synthetic */ AppPrefUtils $appPrefUtils;
    final /* synthetic */ Context $context;
    final /* synthetic */ d0 $coroutineScope;
    final /* synthetic */ MutableState<Boolean> $showingDialogGoodLuck$delegate;
    final /* synthetic */ MutableState<Boolean> $showingDialogSurvey$delegate;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$4$1", f = "ThemePage.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$4$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ AppPrefUtils $appPrefUtils;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $showingDialogGoodLuck$delegate;
        final /* synthetic */ MutableState<Boolean> $showingDialogSurvey$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppPrefUtils appPrefUtils, Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, g gVar) {
            super(2, gVar);
            this.$appPrefUtils = appPrefUtils;
            this.$context = context;
            this.$showingDialogSurvey$delegate = mutableState;
            this.$showingDialogGoodLuck$delegate = mutableState2;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            return new AnonymousClass1(this.$appPrefUtils, this.$context, this.$showingDialogSurvey$delegate, this.$showingDialogGoodLuck$delegate, gVar);
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
                ThemeEvents.INSTANCE.logClickLike();
                ThemePageKt.ThemePage$lambda$2(this.$showingDialogSurvey$delegate, false);
                this.$appPrefUtils.setSurveyDialogShown(this.$context, true);
                this.label = 1;
                if (p0.a.L(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            ThemePageKt.ThemePage$lambda$5(this.$showingDialogGoodLuck$delegate, true);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemePageKt$ThemePage$4(d0 d0Var, AppPrefUtils appPrefUtils, Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$coroutineScope = d0Var;
        this.$appPrefUtils = appPrefUtils;
        this.$context = context;
        this.$showingDialogSurvey$delegate = mutableState;
        this.$showingDialogGoodLuck$delegate = mutableState2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m360invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m360invoke() {
        kotlin.jvm.internal.e.v(this.$coroutineScope, null, 0, new AnonymousClass1(this.$appPrefUtils, this.$context, this.$showingDialogSurvey$delegate, this.$showingDialogGoodLuck$delegate, null), 3);
    }
}
