package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
class GhostViewHolder extends FrameLayout {

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        @DoNotInline
        public static float a(View view) {
            return view.getZ();
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            throw null;
        }
    }
}
