package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlideImage.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bumptech/glide/integration/compose/StateTrackingListener;", "Lcom/bumptech/glide/integration/compose/RequestListener;", "state", "Landroidx/compose/runtime/MutableState;", "Lcom/bumptech/glide/integration/compose/RequestState;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "getDrawable", "()Landroidx/compose/runtime/MutableState;", "getState", "onStateChanged", "", "model", "", "requestState", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
final class StateTrackingListener implements RequestListener {
    private final MutableState<Drawable> drawable;
    private final MutableState<RequestState> state;

    public StateTrackingListener(MutableState<RequestState> state, MutableState<Drawable> drawable) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.state = state;
        this.drawable = drawable;
    }

    public final MutableState<RequestState> getState() {
        return this.state;
    }

    public final MutableState<Drawable> getDrawable() {
        return this.drawable;
    }

    @Override // com.bumptech.glide.integration.compose.RequestListener
    public void onStateChanged(Object model, Drawable drawable, RequestState requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        this.state.setValue(requestState);
        this.drawable.setValue(drawable);
    }
}
