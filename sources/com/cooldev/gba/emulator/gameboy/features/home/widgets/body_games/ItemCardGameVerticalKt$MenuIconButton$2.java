package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.ItemCardGameVerticalKt$MenuIconButton$2", f = "ItemCardGameVertical.kt", l = {Opcodes.DNEG}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ItemCardGameVerticalKt$MenuIconButton$2 extends i implements p {
    final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
    final /* synthetic */ Game $data;
    final /* synthetic */ HomeViewModel $homeViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.ItemCardGameVerticalKt$MenuIconButton$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
        final /* synthetic */ Game $data;
        final /* synthetic */ HomeViewModel $homeViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeViewModel homeViewModel, Game game, MutableState<Offset> mutableState) {
            super(1);
            this.$homeViewModel = homeViewModel;
            this.$data = game;
            this.$cardPosition$delegate = mutableState;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m240invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m240invokek4lQ0M(long j2) {
            long MenuIconButton$lambda$6;
            long MenuIconButton$lambda$62;
            HomeViewModel homeViewModel = this.$homeViewModel;
            ItemCardGameVerticalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            float g2 = Offset.g(j2);
            MenuIconButton$lambda$6 = ItemCardGameVerticalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            float g3 = Offset.g(MenuIconButton$lambda$6) + g2;
            float h2 = Offset.h(j2);
            MenuIconButton$lambda$62 = ItemCardGameVerticalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            homeViewModel.m218applyTouchPointk4lQ0M(Offset.a(g3, Offset.h(MenuIconButton$lambda$62) + h2));
            this.$homeViewModel.showPopupMenuGame(this.$data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameVerticalKt$MenuIconButton$2(HomeViewModel homeViewModel, Game game, MutableState<Offset> mutableState, g gVar) {
        super(2, gVar);
        this.$homeViewModel = homeViewModel;
        this.$data = game;
        this.$cardPosition$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        ItemCardGameVerticalKt$MenuIconButton$2 itemCardGameVerticalKt$MenuIconButton$2 = new ItemCardGameVerticalKt$MenuIconButton$2(this.$homeViewModel, this.$data, this.$cardPosition$delegate, gVar);
        itemCardGameVerticalKt$MenuIconButton$2.L$0 = obj;
        return itemCardGameVerticalKt$MenuIconButton$2;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((ItemCardGameVerticalKt$MenuIconButton$2) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$homeViewModel, this.$data, this.$cardPosition$delegate);
            this.label = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass1, this, 7) == aVar) {
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
