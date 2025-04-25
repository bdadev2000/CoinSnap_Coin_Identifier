package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlideImage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlideSubcompositionScopeImpl;", "Lcom/bumptech/glide/integration/compose/GlideSubcompositionScope;", "drawable", "Landroid/graphics/drawable/Drawable;", "state", "Lcom/bumptech/glide/integration/compose/RequestState;", "(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/integration/compose/RequestState;)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getState", "()Lcom/bumptech/glide/integration/compose/RequestState;", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class GlideSubcompositionScopeImpl implements GlideSubcompositionScope {
    private final Drawable drawable;
    private final RequestState state;

    public GlideSubcompositionScopeImpl(Drawable drawable, RequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.drawable = drawable;
        this.state = state;
    }

    @Override // com.bumptech.glide.integration.compose.GlideSubcompositionScope
    public RequestState getState() {
        return this.state;
    }

    @Override // com.bumptech.glide.integration.compose.GlideSubcompositionScope
    public Painter getPainter() {
        Painter painter;
        Drawable drawable = this.drawable;
        return (drawable == null || (painter = PainterKt.toPainter(drawable)) == null) ? new ColorPainter(Color.INSTANCE.m4550getTransparent0d7_KjU(), null) : painter;
    }
}
