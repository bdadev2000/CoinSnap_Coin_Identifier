package com.cooldev.gba.emulator.gameboy.router;

import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class MultiNavigationAppState$navigateAndClearStack$1 extends r implements l {
    final /* synthetic */ MultiNavigationAppState this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppState$navigateAndClearStack$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PopUpToBuilder) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull PopUpToBuilder popUpToBuilder) {
            a.s(popUpToBuilder, "$this$popUpTo");
            popUpToBuilder.f20523a = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiNavigationAppState$navigateAndClearStack$1(MultiNavigationAppState multiNavigationAppState) {
        super(1);
        this.this$0 = multiNavigationAppState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavOptionsBuilder) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull NavOptionsBuilder navOptionsBuilder) {
        a.s(navOptionsBuilder, "$this$navigate");
        navOptionsBuilder.a(this.this$0.getGetNavController().g().f20436h, AnonymousClass1.INSTANCE);
        navOptionsBuilder.f20489b = true;
    }
}
