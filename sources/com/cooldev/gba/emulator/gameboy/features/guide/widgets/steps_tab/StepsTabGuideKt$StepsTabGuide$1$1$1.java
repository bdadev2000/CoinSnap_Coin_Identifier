package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameDownloadStep;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class StepsTabGuideKt$StepsTabGuide$1$1$1 extends r implements l {
    final /* synthetic */ String $title;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab.StepsTabGuideKt$StepsTabGuide$1$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements q {
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$title = str;
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
            String str = this.$title;
            long b2 = TextUnitKt.b(14);
            long b3 = TextUnitKt.b(20);
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 0, b3, 16646104), composer, 6, 0, 65534);
            SpacerKt.a(SizeKt.e(Modifier.Companion.f14687a, 8), composer);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepsTabGuideKt$StepsTabGuide$1$1$1(String str) {
        super(1);
        this.$title = str;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyColumn");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title);
        Object obj = ComposableLambdaKt.f14482a;
        LazyListScope.f(lazyListScope, null, new ComposableLambdaImpl(1834954555, anonymousClass1, true), 3);
        k0.a entries = GameDownloadStep.getEntries();
        lazyListScope.d(entries.size(), null, new StepsTabGuideKt$StepsTabGuide$1$1$1$invoke$$inlined$items$default$3(StepsTabGuideKt$StepsTabGuide$1$1$1$invoke$$inlined$items$default$1.INSTANCE, entries), new ComposableLambdaImpl(-632812321, new StepsTabGuideKt$StepsTabGuide$1$1$1$invoke$$inlined$items$default$4(entries), true));
    }
}
