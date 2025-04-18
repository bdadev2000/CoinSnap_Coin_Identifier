package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListScope$items$1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.widgets.SlotLoadGameKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class LoadGameOverlayKt$LoadGameOverlay$2$1$1 extends r implements l {
    final /* synthetic */ GameState $gameState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page.LoadGameOverlayKt$LoadGameOverlay$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements q0.r {
        final /* synthetic */ GameState $gameState;
        final /* synthetic */ GameViewModel $gameViewModel;
        final /* synthetic */ LoadGameViewModel $loadGameViewModel;
        final /* synthetic */ MenuGameViewModel $menuGameViewModel;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page.LoadGameOverlayKt$LoadGameOverlay$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01151 extends r implements a {
            final /* synthetic */ GameViewModel $gameViewModel;
            final /* synthetic */ int $index;
            final /* synthetic */ LoadGameViewModel $loadGameViewModel;
            final /* synthetic */ MenuGameViewModel $menuGameViewModel;

            /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page.LoadGameOverlayKt$LoadGameOverlay$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C01161 extends r implements a {
                final /* synthetic */ LoadGameViewModel $loadGameViewModel;
                final /* synthetic */ MenuGameViewModel $menuGameViewModel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01161(LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel) {
                    super(0);
                    this.$loadGameViewModel = loadGameViewModel;
                    this.$menuGameViewModel = menuGameViewModel;
                }

                @Override // q0.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m269invoke();
                    return b0.f30125a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m269invoke() {
                    this.$loadGameViewModel.hideLoadGameView();
                    this.$menuGameViewModel.hideMenu();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01151(GameViewModel gameViewModel, int i2, LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel) {
                super(0);
                this.$gameViewModel = gameViewModel;
                this.$index = i2;
                this.$loadGameViewModel = loadGameViewModel;
                this.$menuGameViewModel = menuGameViewModel;
            }

            @Override // q0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m268invoke();
                return b0.f30125a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m268invoke() {
                this.$gameViewModel.onLoadGame(this.$index, new C01161(this.$loadGameViewModel, this.$menuGameViewModel));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GameState gameState, GameViewModel gameViewModel, LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel) {
            super(4);
            this.$gameState = gameState;
            this.$gameViewModel = gameViewModel;
            this.$loadGameViewModel = loadGameViewModel;
            this.$menuGameViewModel = menuGameViewModel;
        }

        @Override // q0.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i2, @Nullable Composer composer, int i3) {
            p0.a.s(lazyItemScope, "$this$items");
            if ((i3 & 112) == 0) {
                i3 |= composer.c(i2) ? 32 : 16;
            }
            if ((i3 & 721) == 144 && composer.i()) {
                composer.A();
            } else {
                SlotLoadGameKt.SlotLoadGame(this.$gameState.getLoadSlot().get(i2), new C01151(this.$gameViewModel, i2, this.$loadGameViewModel, this.$menuGameViewModel), composer, 8);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadGameOverlayKt$LoadGameOverlay$2$1$1(GameState gameState, GameViewModel gameViewModel, LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel) {
        super(1);
        this.$gameState = gameState;
        this.$gameViewModel = gameViewModel;
        this.$loadGameViewModel = loadGameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        p0.a.s(lazyListScope, "$this$LazyColumn");
        int size = this.$gameState.getLoadSlot().size();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gameState, this.$gameViewModel, this.$loadGameViewModel, this.$menuGameViewModel);
        Object obj = ComposableLambdaKt.f14482a;
        lazyListScope.d(size, null, LazyListScope$items$1.f4387a, new ComposableLambdaImpl(-831057701, anonymousClass1, true));
    }
}
