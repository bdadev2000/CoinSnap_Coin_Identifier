package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2 extends r implements l {
    final /* synthetic */ List $items;
    final /* synthetic */ l $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteTabGuideKt$SiteTabGuide$1$1$1$1$1$invoke$$inlined$items$default$2(l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final Object invoke(int i2) {
        return this.$key.invoke(this.$items.get(i2));
    }
}
