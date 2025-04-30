package R0;

import androidx.recyclerview.widget.L;

/* loaded from: classes.dex */
public final class c extends L {
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    @Override // androidx.recyclerview.widget.L
    public final void onChanged() {
        this.b.c(true);
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeChanged(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeInserted(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeMoved(int i9, int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeRemoved(int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.L
    public final void onItemRangeChanged(int i9, int i10, Object obj) {
        onChanged();
    }
}
