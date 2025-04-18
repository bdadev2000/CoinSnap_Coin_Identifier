package com.cooldev.gba.emulator.gameboy.extensions;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import b1.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DebounceExtensionsKt {
    @Composable
    @NotNull
    public static final a debounced(@NotNull a aVar, long j2, @Nullable Composer composer, int i2, int i3) {
        p0.a.s(aVar, "onClick");
        composer.J(1598786116);
        if ((i3 & 2) != 0) {
            j2 = 500;
        }
        composer.J(757210042);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = SnapshotLongStateKt.a(0L);
            composer.o(u2);
        }
        composer.D();
        DebounceExtensionsKt$debounced$onClickLambda$1 debounceExtensionsKt$debounced$onClickLambda$1 = new DebounceExtensionsKt$debounced$onClickLambda$1(j2, aVar, (MutableLongState) u2);
        composer.D();
        return debounceExtensionsKt$debounced$onClickLambda$1;
    }

    @NotNull
    public static final Modifier debouncedClickable(@NotNull Modifier modifier, boolean z2, long j2, @NotNull a aVar) {
        p0.a.s(modifier, "<this>");
        p0.a.s(aVar, "onClick");
        return ComposedModifierKt.a(modifier, new DebounceExtensionsKt$debouncedClickable$1(j2, z2, aVar));
    }

    public static /* synthetic */ Modifier debouncedClickable$default(Modifier modifier, boolean z2, long j2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            j2 = 500;
        }
        return debouncedClickable(modifier, z2, j2, aVar);
    }

    @Composable
    @NotNull
    public static final <T> l debouncedWithParam(@NotNull l lVar, long j2, @Nullable Composer composer, int i2, int i3) {
        p0.a.s(lVar, "onClick");
        composer.J(1744130801);
        if ((i3 & 2) != 0) {
            j2 = 500;
        }
        composer.J(-1474629357);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = SnapshotLongStateKt.a(0L);
            composer.o(u2);
        }
        composer.D();
        DebounceExtensionsKt$debouncedWithParam$onClickLambda$1 debounceExtensionsKt$debouncedWithParam$onClickLambda$1 = new DebounceExtensionsKt$debouncedWithParam$onClickLambda$1(j2, lVar, (MutableLongState) u2);
        composer.D();
        return debounceExtensionsKt$debouncedWithParam$onClickLambda$1;
    }

    @Composable
    public static final <T> T useDebounce(T t2, long j2, @Nullable d0 d0Var, @NotNull l lVar, @Nullable Composer composer, int i2, int i3) {
        p0.a.s(lVar, "onChange");
        composer.J(163674266);
        if ((i3 & 1) != 0) {
            j2 = 300;
        }
        long j3 = j2;
        if ((i3 & 2) != 0) {
            Object u2 = composer.u();
            if (u2 == Composer.Companion.f13690a) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.g(composer));
                composer.o(compositionScopedCoroutineScopeCanceller);
                u2 = compositionScopedCoroutineScopeCanceller;
            }
            d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
        }
        MutableState k2 = SnapshotStateKt.k(t2, composer);
        EffectsKt.c(useDebounce$lambda$0(k2), new DebounceExtensionsKt$useDebounce$1(d0Var, j3, lVar, k2), composer);
        T t3 = (T) useDebounce$lambda$0(k2);
        composer.D();
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T useDebounce$lambda$0(State<? extends T> state) {
        return (T) state.getValue();
    }
}
