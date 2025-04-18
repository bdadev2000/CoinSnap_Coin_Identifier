package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.p;

/* loaded from: classes.dex */
public final class SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$3 extends r implements p {
    final /* synthetic */ List $items;
    final /* synthetic */ p $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$3(p pVar, List list) {
        super(2);
        this.$span = pVar;
        this.$items = list;
    }

    @Override // q0.p
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GridItemSpan(m209invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m209invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, this.$items.get(i2))).f4447a;
    }
}
