package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GamesListKt$GamesList$2 extends r implements l {
    final /* synthetic */ List<Game> $games;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.GamesListKt$GamesList$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final Object invoke(@NotNull Game game) {
            a.s(game, "it");
            return game.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesListKt$GamesList$2(List<Game> list) {
        super(1);
        this.$games = list;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyRow");
        List<Game> list = this.$games;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        GamesListKt$GamesList$2$invoke$$inlined$items$default$1 gamesListKt$GamesList$2$invoke$$inlined$items$default$1 = GamesListKt$GamesList$2$invoke$$inlined$items$default$1.INSTANCE;
        int size = list.size();
        GamesListKt$GamesList$2$invoke$$inlined$items$default$2 gamesListKt$GamesList$2$invoke$$inlined$items$default$2 = anonymousClass1 != null ? new GamesListKt$GamesList$2$invoke$$inlined$items$default$2(anonymousClass1, list) : null;
        GamesListKt$GamesList$2$invoke$$inlined$items$default$3 gamesListKt$GamesList$2$invoke$$inlined$items$default$3 = new GamesListKt$GamesList$2$invoke$$inlined$items$default$3(gamesListKt$GamesList$2$invoke$$inlined$items$default$1, list);
        GamesListKt$GamesList$2$invoke$$inlined$items$default$4 gamesListKt$GamesList$2$invoke$$inlined$items$default$4 = new GamesListKt$GamesList$2$invoke$$inlined$items$default$4(list);
        Object obj = ComposableLambdaKt.f14482a;
        lazyListScope.d(size, gamesListKt$GamesList$2$invoke$$inlined$items$default$2, gamesListKt$GamesList$2$invoke$$inlined$items$default$3, new ComposableLambdaImpl(-632812321, gamesListKt$GamesList$2$invoke$$inlined$items$default$4, true));
    }
}
