package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.view_all.enums.TypeViewAll;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class BodyGamesKt$BodyGames$2$1$2 extends r implements l {
    final /* synthetic */ HomeState $homeState;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements q {
        final /* synthetic */ HomeState $homeState;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01141 extends r implements a {
            public static final C01141 INSTANCE = new C01141();

            public C01141() {
                super(0);
            }

            @Override // q0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m233invoke();
                return b0.f30125a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m233invoke() {
                MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo("view-all?id=" + TypeViewAll.RECENT.getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeState homeState) {
            super(3);
            this.$homeState = homeState;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
            p0.a.s(lazyItemScope, "$this$item");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            SectionHeaderKt.SectionHeader(TypeViewAll.RECENT.getTitle(), C01141.INSTANCE, composer, 54);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            SpacerKt.a(SizeKt.e(companion, 6), composer);
            GamesListKt.GamesList(this.$homeState.getRecentGames(), this.$homeState.isViewListHorizontal(), composer, 8);
            SpacerKt.a(SizeKt.e(companion, 24), composer);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements q {
        final /* synthetic */ HomeState $homeState;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends r implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // q0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m234invoke();
                return b0.f30125a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m234invoke() {
                MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo("view-all?id=" + TypeViewAll.FAVORITE.getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HomeState homeState) {
            super(3);
            this.$homeState = homeState;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
            p0.a.s(lazyItemScope, "$this$item");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            SectionHeaderKt.SectionHeader(TypeViewAll.FAVORITE.getTitle(), AnonymousClass1.INSTANCE, composer, 54);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            SpacerKt.a(SizeKt.e(companion, 6), composer);
            GamesListKt.GamesList(this.$homeState.getFavoritesGames(), this.$homeState.isViewListHorizontal(), composer, 8);
            SpacerKt.a(SizeKt.e(companion, 24), composer);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends r implements q {
        final /* synthetic */ HomeState $homeState;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$2$1$2$3$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends r implements a {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // q0.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m235invoke();
                return b0.f30125a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m235invoke() {
                MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo("view-all?id=" + TypeViewAll.YOUR_GAME.getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HomeState homeState) {
            super(3);
            this.$homeState = homeState;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
            p0.a.s(lazyItemScope, "$this$item");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            SectionHeaderKt.SectionHeader(TypeViewAll.YOUR_GAME.getTitle(), AnonymousClass1.INSTANCE, composer, 54);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            SpacerKt.a(SizeKt.e(companion, 6), composer);
            GamesListKt.GamesList(this.$homeState.getYourGames(), this.$homeState.isViewListHorizontal(), composer, 8);
            SpacerKt.a(SizeKt.e(companion, 24), composer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyGamesKt$BodyGames$2$1$2(HomeState homeState) {
        super(1);
        this.$homeState = homeState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        p0.a.s(lazyListScope, "$this$LazyColumn");
        if (!this.$homeState.getRecentGames().isEmpty()) {
            String id = TypeViewAll.RECENT.getId();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$homeState);
            Object obj = ComposableLambdaKt.f14482a;
            LazyListScope.f(lazyListScope, id, new ComposableLambdaImpl(-1742892470, anonymousClass1, true), 2);
        }
        if (!this.$homeState.getFavoritesGames().isEmpty()) {
            String id2 = TypeViewAll.FAVORITE.getId();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$homeState);
            Object obj2 = ComposableLambdaKt.f14482a;
            LazyListScope.f(lazyListScope, id2, new ComposableLambdaImpl(1619083393, anonymousClass2, true), 2);
        }
        if (!this.$homeState.getYourGames().isEmpty()) {
            String id3 = TypeViewAll.YOUR_GAME.getId();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$homeState);
            Object obj3 = ComposableLambdaKt.f14482a;
            LazyListScope.f(lazyListScope, id3, new ComposableLambdaImpl(1220370626, anonymousClass3, true), 2);
        }
    }
}
