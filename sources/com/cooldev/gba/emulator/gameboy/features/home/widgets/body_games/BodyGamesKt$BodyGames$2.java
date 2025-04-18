package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceBetween$1;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.widgets.body_empty.BodyEmptyGameKt;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view.PopupMenuCardGameKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class BodyGamesKt$BodyGames$2 extends r implements q {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ HomeState $homeState;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements a {
        final /* synthetic */ HomeViewModel $homeViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HomeViewModel homeViewModel) {
            super(0);
            this.$homeViewModel = homeViewModel;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m236invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m236invoke() {
            this.$homeViewModel.hidePopupMenuGame();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends r implements l {
        final /* synthetic */ HomeViewModel $homeViewModel;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$3$WhenMappings */
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
        public AnonymousClass3(HomeViewModel homeViewModel) {
            super(1);
            this.$homeViewModel = homeViewModel;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MenuCardGame) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull MenuCardGame menuCardGame) {
            p0.a.s(menuCardGame, "menu");
            int i2 = WhenMappings.$EnumSwitchMapping$0[menuCardGame.ordinal()];
            if (i2 == 1) {
                this.$homeViewModel.showDialogRemoveGame();
                return;
            }
            if (i2 == 2) {
                this.$homeViewModel.resumeGame();
                return;
            }
            if (i2 == 3) {
                this.$homeViewModel.restartGame();
            } else if (i2 == 4) {
                this.$homeViewModel.addToFavorite();
            } else {
                if (i2 != 5) {
                    return;
                }
                this.$homeViewModel.removeFromFavorite();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyGamesKt$BodyGames$2(HomeState homeState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, HomeViewModel homeViewModel) {
        super(3);
        this.$homeState = homeState;
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
        this.$homeViewModel = homeViewModel;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope boxWithConstraintsScope, @Nullable Composer composer, int i2) {
        boolean z2;
        Modifier c2;
        p0.a.s(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        HomeState homeState = this.$homeState;
        FocusManager focusManager = this.$focusManager;
        SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c3 = ComposedModifierKt.c(composer, companion);
        ComposeUiNode.h8.getClass();
        a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c3, pVar4);
            Arrangement$SpaceBetween$1 arrangement$SpaceBetween$1 = Arrangement.f3776g;
            BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
            Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), 16, 0.0f, 2);
            RowMeasurePolicy a3 = RowKt.a(arrangement$SpaceBetween$1, vertical, composer, 54);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c4 = ComposedModifierKt.c(composer, h2);
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, a3, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c4, pVar4);
                SearchGamesKt.SearchGames(RowScopeInstance.f4094a.a(companion, 1.0f, true), focusManager, softwareKeyboardController, composer, 64);
                SpacerKt.a(SizeKt.r(companion, 8), composer);
                ViewTypeIconButtonKt.ViewTypeIconButton(composer, 0);
                composer.p();
                float f2 = 24;
                SpacerKt.a(SizeKt.e(companion, f2), composer);
                if (homeState.getEmptySearch()) {
                    composer.J(-704021703);
                    c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
                    z2 = false;
                    BodyEmptyGameKt.BodyEmptyGames(c2, composer, 0);
                    composer.D();
                } else {
                    z2 = false;
                    composer.J(-703876220);
                    LazyDslKt.a(null, null, PaddingKt.b(0.0f, 0.0f, 0.0f, f2, 7), false, null, null, null, false, new BodyGamesKt$BodyGames$2$1$2(homeState), composer, 384, 251);
                    composer.D();
                }
                composer.p();
                boolean showingPopup = this.$homeState.getShowingPopup();
                boolean showingPopup2 = this.$homeState.getShowingPopup();
                long m217getTouchPointF1C5BW0 = this.$homeState.m217getTouchPointF1C5BW0();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$homeViewModel);
                Game currentGameForPopupMenu = this.$homeState.getCurrentGameForPopupMenu();
                PopupMenuCardGameKt.m344PopupMenuCardGameSu4bsnU(showingPopup, showingPopup2, m217getTouchPointF1C5BW0, anonymousClass2, (currentGameForPopupMenu == null || !currentGameForPopupMenu.isFavorite()) ? z2 : true, new AnonymousClass3(this.$homeViewModel), composer, 0);
                return;
            }
            ComposablesKt.a();
            throw null;
        }
        ComposablesKt.a();
        throw null;
    }
}
