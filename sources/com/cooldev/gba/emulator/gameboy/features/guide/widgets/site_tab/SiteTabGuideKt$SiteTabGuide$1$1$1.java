package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class SiteTabGuideKt$SiteTabGuide$1$1$1 extends r implements l {
    final /* synthetic */ float $totalHeight;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab.SiteTabGuideKt$SiteTabGuide$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements q {
        final /* synthetic */ float $totalHeight;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab.SiteTabGuideKt$SiteTabGuide$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01121 extends r implements l {
            public static final C01121 INSTANCE = new C01121();

            /* renamed from: com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab.SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C01131 extends r implements l {
                public static final C01131 INSTANCE = new C01131();

                public C01131() {
                    super(1);
                }

                @Override // q0.l
                @NotNull
                public final Object invoke(@NotNull GameROMWebsite gameROMWebsite) {
                    a.s(gameROMWebsite, "it");
                    return Integer.valueOf(gameROMWebsite.hashCode());
                }
            }

            public C01121() {
                super(1);
            }

            @Override // q0.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyGridScope) obj);
                return b0.f30125a;
            }

            public final void invoke(@NotNull LazyGridScope lazyGridScope) {
                a.s(lazyGridScope, "$this$LazyVerticalGrid");
                k0.a entries = GameROMWebsite.getEntries();
                C01131 c01131 = C01131.INSTANCE;
                SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$1 siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$1 = SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$1.INSTANCE;
                int size = entries.size();
                SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2 siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2 = c01131 != null ? new SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2(c01131, entries) : null;
                SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$4 siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$4 = new SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$4(siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$1, entries);
                SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5 siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5 = new SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5(entries);
                Object obj = ComposableLambdaKt.f14482a;
                lazyGridScope.b(size, siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2, null, siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$4, new ComposableLambdaImpl(699646206, siteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$5, true));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f2) {
            super(3);
            this.$totalHeight = f2;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, @Nullable Composer composer, int i2) {
            a.s(lazyItemScope, "$this$item");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            float f2 = 0;
            float f3 = 16;
            LazyGridDslKt.a(907742208, Opcodes.LCMP, null, Arrangement.g(f3), Arrangement.g(f3), new PaddingValuesImpl(f2, f2, f2, f2), new GridCells.Fixed(2), null, composer, SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), this.$totalHeight), C01121.INSTANCE, false, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteTabGuideKt$SiteTabGuide$1$1$1(float f2) {
        super(1);
        this.$totalHeight = f2;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, null, ComposableSingletons$SiteTabGuideKt.INSTANCE.m207getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), 3);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$totalHeight);
        Object obj = ComposableLambdaKt.f14482a;
        LazyListScope.f(lazyListScope, null, new ComposableLambdaImpl(1558686126, anonymousClass1, true), 3);
    }
}
