package com.cooldev.gba.emulator.gameboy.features.app.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$2(Context context, int i2) {
        super(2);
        this.$context = context;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ManageAppOpenAdLifecycleKt.ManageAppOpenAdLifecycle(this.$context, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
