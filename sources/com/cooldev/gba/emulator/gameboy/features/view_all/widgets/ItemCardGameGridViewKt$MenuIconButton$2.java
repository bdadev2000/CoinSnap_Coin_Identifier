package com.cooldev.gba.emulator.gameboy.features.view_all.widgets;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
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

@e(c = "com.cooldev.gba.emulator.gameboy.features.view_all.widgets.ItemCardGameGridViewKt$MenuIconButton$2", f = "ItemCardGameGridView.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ItemCardGameGridViewKt$MenuIconButton$2 extends i implements p {
    final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
    final /* synthetic */ Game $data;
    final /* synthetic */ ViewAllViewModel $viewAllViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.widgets.ItemCardGameGridViewKt$MenuIconButton$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ MutableState<Offset> $cardPosition$delegate;
        final /* synthetic */ Game $data;
        final /* synthetic */ ViewAllViewModel $viewAllViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewAllViewModel viewAllViewModel, Game game, MutableState<Offset> mutableState) {
            super(1);
            this.$viewAllViewModel = viewAllViewModel;
            this.$data = game;
            this.$cardPosition$delegate = mutableState;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m376invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m376invokek4lQ0M(long j2) {
            long MenuIconButton$lambda$7;
            long MenuIconButton$lambda$72;
            ViewAllViewModel viewAllViewModel = this.$viewAllViewModel;
            ItemCardGameGridViewKt.MenuIconButton$lambda$7(this.$cardPosition$delegate);
            float g2 = Offset.g(j2);
            MenuIconButton$lambda$7 = ItemCardGameGridViewKt.MenuIconButton$lambda$7(this.$cardPosition$delegate);
            float g3 = Offset.g(MenuIconButton$lambda$7) + g2;
            float h2 = Offset.h(j2);
            MenuIconButton$lambda$72 = ItemCardGameGridViewKt.MenuIconButton$lambda$7(this.$cardPosition$delegate);
            viewAllViewModel.m369applyTouchPointk4lQ0M(Offset.a(g3, Offset.h(MenuIconButton$lambda$72) + h2));
            this.$viewAllViewModel.showPopupMenuGame(this.$data);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameGridViewKt$MenuIconButton$2(ViewAllViewModel viewAllViewModel, Game game, MutableState<Offset> mutableState, g gVar) {
        super(2, gVar);
        this.$viewAllViewModel = viewAllViewModel;
        this.$data = game;
        this.$cardPosition$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        ItemCardGameGridViewKt$MenuIconButton$2 itemCardGameGridViewKt$MenuIconButton$2 = new ItemCardGameGridViewKt$MenuIconButton$2(this.$viewAllViewModel, this.$data, this.$cardPosition$delegate, gVar);
        itemCardGameGridViewKt$MenuIconButton$2.L$0 = obj;
        return itemCardGameGridViewKt$MenuIconButton$2;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((ItemCardGameGridViewKt$MenuIconButton$2) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewAllViewModel, this.$data, this.$cardPosition$delegate);
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
