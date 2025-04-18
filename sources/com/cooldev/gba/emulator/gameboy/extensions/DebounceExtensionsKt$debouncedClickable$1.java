package com.cooldev.gba.emulator.gameboy.extensions;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.q;

/* loaded from: classes.dex */
public final class DebounceExtensionsKt$debouncedClickable$1 extends r implements q {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebounceExtensionsKt$debouncedClickable$1(long j2, boolean z2, a aVar) {
        super(3);
        this.$debounceTime = j2;
        this.$enabled = z2;
        this.$onClick = aVar;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        p0.a.s(modifier, "$this$composed");
        composer.J(-1556104246);
        a aVar = this.$onClick;
        long j2 = this.$debounceTime;
        composer.J(1598786116);
        composer.J(757210042);
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (u2 == obj) {
            u2 = SnapshotLongStateKt.a(0L);
            composer.o(u2);
        }
        composer.D();
        DebounceExtensionsKt$debouncedClickable$1$invoke$$inlined$debounced$1 debounceExtensionsKt$debouncedClickable$1$invoke$$inlined$debounced$1 = new DebounceExtensionsKt$debouncedClickable$1$invoke$$inlined$debounced$1(j2, (MutableLongState) u2, aVar);
        composer.D();
        boolean z2 = this.$enabled;
        composer.J(-1101884647);
        boolean I = composer.I(debounceExtensionsKt$debouncedClickable$1$invoke$$inlined$debounced$1);
        Object u3 = composer.u();
        if (I || u3 == obj) {
            u3 = new DebounceExtensionsKt$debouncedClickable$1$1$1(debounceExtensionsKt$debouncedClickable$1$invoke$$inlined$debounced$1);
            composer.o(u3);
        }
        composer.D();
        Modifier c2 = ClickableKt.c(modifier, z2, null, (a) u3, 6);
        composer.D();
        return c2;
    }
}
