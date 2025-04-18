package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3 extends r implements l {
    final /* synthetic */ l $contentType;
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3(l lVar, List list) {
        super(1);
        this.$contentType = lVar;
        this.$items = list;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @Nullable
    public final Object invoke(int i2) {
        return this.$contentType.invoke(this.$items.get(i2));
    }
}
