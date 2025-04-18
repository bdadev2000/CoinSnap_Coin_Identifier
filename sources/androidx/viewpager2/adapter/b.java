package androidx.viewpager2.adapter;

import androidx.recyclerview.widget.l0;

/* loaded from: classes.dex */
public abstract class b extends l0 {
    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeChanged(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeInserted(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeMoved(int i10, int i11, int i12) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeRemoved(int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.l0
    public final void onItemRangeChanged(int i10, int i11, Object obj) {
        onChanged();
    }
}
