package com.cooldev.gba.emulator.gameboy.features.themenew.page;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope$items$1;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeState;
import com.cooldev.gba.emulator.gameboy.features.themenew.widgets.ItemThemeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ThemeNewPageKt$ThemeNewPage$2$1$1$1$1 extends r implements l {
    final /* synthetic */ ThemeState $themeState;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.themenew.page.ThemeNewPageKt$ThemeNewPage$2$1$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
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

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.themenew.page.ThemeNewPageKt$ThemeNewPage$2$1$1$1$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements q0.r {
        final /* synthetic */ ThemeState $themeState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ThemeState themeState) {
            super(4);
            this.$themeState = themeState;
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
                ItemThemeKt.ItemTheme((GamePadTheme) GamePadTheme.getEntries().get(i2), this.$themeState.getTheme() == GamePadTheme.getEntries().get(i2), composer, 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeNewPageKt$ThemeNewPage$2$1$1$1$1(ThemeState themeState) {
        super(1);
        this.$themeState = themeState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyGridScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyGridScope lazyGridScope) {
        a.s(lazyGridScope, "$this$LazyVerticalGrid");
        int size = GamePadTheme.getEntries().size();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$themeState);
        Object obj = ComposableLambdaKt.f14482a;
        lazyGridScope.b(size, (r12 & 2) != 0 ? null : anonymousClass1, null, (r12 & 8) != 0 ? LazyGridScope$items$1.f4584a : null, new ComposableLambdaImpl(796474041, anonymousClass2, true));
    }
}
