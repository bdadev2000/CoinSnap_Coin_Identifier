package com.google.accompanist.flowlayout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class FlowKt$Flow$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p $content;
    final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ float $crossAxisSpacing;
    final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    final /* synthetic */ SizeMode $mainAxisSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LayoutOrientation $orientation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$2(Modifier modifier, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f2, FlowCrossAxisAlignment flowCrossAxisAlignment, float f3, MainAxisAlignment mainAxisAlignment2, p pVar, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$orientation = layoutOrientation;
        this.$mainAxisSize = sizeMode;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$mainAxisSpacing = f2;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSpacing = f3;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        FlowKt.m588FlowF4y8cZ0(this.$modifier, this.$orientation, this.$mainAxisSize, this.$mainAxisAlignment, this.$mainAxisSpacing, this.$crossAxisAlignment, this.$crossAxisSpacing, this.$lastLineMainAxisAlignment, this.$content, composer, this.$$changed | 1);
    }
}
