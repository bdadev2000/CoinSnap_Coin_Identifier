package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
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
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.ItemCardGameHorizontalKt$MenuIconButton$1$2", f = "ItemCardGameHorizontal.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ItemCardGameHorizontalKt$MenuIconButton$1$2 extends i implements p {
    final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
    final /* synthetic */ Game $data;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.ItemCardGameHorizontalKt$MenuIconButton$1$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
        final /* synthetic */ Game $data;
        final /* synthetic */ HomeViewModel $homeViewModel;
        final /* synthetic */ UserGuideViewModel $userGuideViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserGuideViewModel userGuideViewModel, HomeViewModel homeViewModel, Game game, MutableState<Offset> mutableState) {
            super(1);
            this.$userGuideViewModel = userGuideViewModel;
            this.$homeViewModel = homeViewModel;
            this.$data = game;
            this.$cardPosition$delegate = mutableState;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m238invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m238invokek4lQ0M(long j2) {
            long MenuIconButton$lambda$6;
            long MenuIconButton$lambda$62;
            if (this.$userGuideViewModel.getDataRemote()) {
                return;
            }
            HomeViewModel homeViewModel = this.$homeViewModel;
            ItemCardGameHorizontalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            float g2 = Offset.g(j2);
            MenuIconButton$lambda$6 = ItemCardGameHorizontalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            float g3 = Offset.g(MenuIconButton$lambda$6) + g2;
            float h2 = Offset.h(j2);
            MenuIconButton$lambda$62 = ItemCardGameHorizontalKt.MenuIconButton$lambda$6(this.$cardPosition$delegate);
            homeViewModel.m218applyTouchPointk4lQ0M(Offset.a(g3, Offset.h(MenuIconButton$lambda$62) + h2));
            this.$homeViewModel.showPopupMenuGame(this.$data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameHorizontalKt$MenuIconButton$1$2(UserGuideViewModel userGuideViewModel, HomeViewModel homeViewModel, Game game, MutableState<Offset> mutableState, g gVar) {
        super(2, gVar);
        this.$userGuideViewModel = userGuideViewModel;
        this.$homeViewModel = homeViewModel;
        this.$data = game;
        this.$cardPosition$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        ItemCardGameHorizontalKt$MenuIconButton$1$2 itemCardGameHorizontalKt$MenuIconButton$1$2 = new ItemCardGameHorizontalKt$MenuIconButton$1$2(this.$userGuideViewModel, this.$homeViewModel, this.$data, this.$cardPosition$delegate, gVar);
        itemCardGameHorizontalKt$MenuIconButton$1$2.L$0 = obj;
        return itemCardGameHorizontalKt$MenuIconButton$1$2;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((ItemCardGameHorizontalKt$MenuIconButton$1$2) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userGuideViewModel, this.$homeViewModel, this.$data, this.$cardPosition$delegate);
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
