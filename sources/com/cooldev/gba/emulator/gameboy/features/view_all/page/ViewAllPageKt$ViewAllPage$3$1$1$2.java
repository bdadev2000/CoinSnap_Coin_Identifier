package com.cooldev.gba.emulator.gameboy.features.view_all.page;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope$items$1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import com.cooldev.gba.emulator.gameboy.features.view_all.widgets.ItemCardGameGridViewKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class ViewAllPageKt$ViewAllPage$3$1$1$2 extends r implements q {
    final /* synthetic */ float $totalHeight;
    final /* synthetic */ ViewAllState $viewAllState;
    final /* synthetic */ ViewAllViewModel $viewAllViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ ViewAllState $viewAllState;
        final /* synthetic */ ViewAllViewModel $viewAllViewModel;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01211 extends r implements l {
            public static final C01211 INSTANCE = new C01211();

            public C01211() {
                super(1);
            }

            @NotNull
            public final Object invoke(int i2) {
                return Integer.valueOf(Integer.hashCode(i2));
            }

            @Override // q0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends r implements q0.r {
            final /* synthetic */ ViewAllState $viewAllState;
            final /* synthetic */ ViewAllViewModel $viewAllViewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ViewAllState viewAllState, ViewAllViewModel viewAllViewModel) {
                super(4);
                this.$viewAllState = viewAllState;
                this.$viewAllViewModel = viewAllViewModel;
            }

            @Override // q0.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return b0.f30125a;
            }

            @ComposableTarget
            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope, int i2, @Nullable Composer composer, int i3) {
                a.s(lazyGridItemScope, "$this$items");
                if ((i3 & 112) == 0) {
                    i3 |= composer.c(i2) ? 32 : 16;
                }
                if ((i3 & 721) == 144 && composer.i()) {
                    composer.A();
                } else {
                    ItemCardGameGridViewKt.ItemCardGameGridView(this.$viewAllState.getGames().get(i2), this.$viewAllViewModel, composer, 72);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewAllState viewAllState, ViewAllViewModel viewAllViewModel) {
            super(1);
            this.$viewAllState = viewAllState;
            this.$viewAllViewModel = viewAllViewModel;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LazyGridScope) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull LazyGridScope lazyGridScope) {
            a.s(lazyGridScope, "$this$LazyVerticalGrid");
            int size = this.$viewAllState.getGames().size();
            C01211 c01211 = C01211.INSTANCE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewAllState, this.$viewAllViewModel);
            Object obj = ComposableLambdaKt.f14482a;
            lazyGridScope.b(size, (r12 & 2) != 0 ? null : c01211, null, (r12 & 8) != 0 ? LazyGridScope$items$1.f4584a : null, new ComposableLambdaImpl(-565121934, anonymousClass2, true));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements q0.a {
        final /* synthetic */ ViewAllViewModel $viewAllViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ViewAllViewModel viewAllViewModel) {
            super(0);
            this.$viewAllViewModel = viewAllViewModel;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m373invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m373invoke() {
            this.$viewAllViewModel.hidePopupMenuGame();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends r implements l {
        final /* synthetic */ ViewAllViewModel $viewAllViewModel;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$3$WhenMappings */
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MenuCardGame.values().length];
                try {
                    iArr[MenuCardGame.Remove.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MenuCardGame.Resume.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MenuCardGame.Restart.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MenuCardGame.AddToFavorites.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MenuCardGame.RemoveFromFavorites.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ViewAllViewModel viewAllViewModel) {
            super(1);
            this.$viewAllViewModel = viewAllViewModel;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MenuCardGame) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull MenuCardGame menuCardGame) {
            a.s(menuCardGame, "menu");
            int i2 = WhenMappings.$EnumSwitchMapping$0[menuCardGame.ordinal()];
            if (i2 == 1) {
                this.$viewAllViewModel.showDialogRemoveGame();
                return;
            }
            if (i2 == 2) {
                this.$viewAllViewModel.resumeGame();
                return;
            }
            if (i2 == 3) {
                this.$viewAllViewModel.restartGame();
            } else if (i2 == 4) {
                this.$viewAllViewModel.addToFavorite();
            } else {
                if (i2 != 5) {
                    return;
                }
                this.$viewAllViewModel.removeFromFavorite();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllPageKt$ViewAllPage$3$1$1$2(float f2, ViewAllState viewAllState, ViewAllViewModel viewAllViewModel) {
        super(3);
        this.$totalHeight = f2;
        this.$viewAllState = viewAllState;
        this.$viewAllViewModel = viewAllViewModel;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r1.isFavorite() == true) goto L14;
     */
    @androidx.compose.runtime.ComposableTarget
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(@org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.BoxWithConstraintsScope r19, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "$this$BoxWithConstraints"
            r2 = r19
            p0.a.s(r2, r1)
            r1 = r21 & 81
            r2 = 16
            if (r1 != r2) goto L1b
            boolean r1 = r20.i()
            if (r1 != 0) goto L16
            goto L1b
        L16:
            r20.A()
            goto L92
        L1b:
            float r1 = (float) r2
            r2 = 0
            float r3 = (float) r2
            r4 = 24
            float r4 = (float) r4
            androidx.compose.foundation.layout.PaddingValuesImpl r10 = new androidx.compose.foundation.layout.PaddingValuesImpl
            r10.<init>(r1, r3, r1, r4)
            androidx.compose.foundation.lazy.grid.GridCells$Fixed r11 = new androidx.compose.foundation.lazy.grid.GridCells$Fixed
            r3 = 2
            r11.<init>(r3)
            androidx.compose.foundation.layout.Arrangement$SpacedAligned r8 = androidx.compose.foundation.layout.Arrangement.g(r1)
            androidx.compose.foundation.layout.Arrangement$SpacedAligned r9 = androidx.compose.foundation.layout.Arrangement.g(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion.f14687a
            float r3 = r0.$totalHeight
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.e(r1, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r14 = androidx.compose.foundation.layout.SizeKt.d(r1, r3)
            r12 = 0
            r16 = 0
            r7 = 0
            r17 = 1
            com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$1 r15 = new com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$1
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState r1 = r0.$viewAllState
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel r3 = r0.$viewAllViewModel
            r15.<init>(r1, r3)
            r5 = 102435840(0x61b0c00, float:2.9161076E-35)
            r6 = 148(0x94, float:2.07E-43)
            r13 = r20
            androidx.compose.foundation.lazy.grid.LazyGridDslKt.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState r1 = r0.$viewAllState
            boolean r3 = r1.getShowingPopup()
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState r1 = r0.$viewAllState
            boolean r4 = r1.getShowingPopup()
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState r1 = r0.$viewAllState
            long r5 = r1.m368getTouchPointF1C5BW0()
            com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$2 r7 = new com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$2
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel r1 = r0.$viewAllViewModel
            r7.<init>(r1)
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState r1 = r0.$viewAllState
            com.cooldev.gba.emulator.gameboy.features.home.models.Game r1 = r1.getCurrentGameForPopupMenu()
            if (r1 == 0) goto L84
            boolean r1 = r1.isFavorite()
            r8 = 1
            if (r1 != r8) goto L84
            goto L85
        L84:
            r8 = r2
        L85:
            com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$3 r9 = new com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2$3
            com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel r1 = r0.$viewAllViewModel
            r9.<init>(r1)
            r11 = 0
            r10 = r20
            com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view.PopupMenuCardGameKt.m344PopupMenuCardGameSu4bsnU(r3, r4, r5, r7, r8, r9, r10, r11)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.view_all.page.ViewAllPageKt$ViewAllPage$3$1$1$2.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
