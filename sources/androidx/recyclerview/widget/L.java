package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class L {
    public abstract void onChanged();

    public void onItemRangeChanged(int i9, int i10) {
    }

    public abstract void onItemRangeInserted(int i9, int i10);

    public abstract void onItemRangeMoved(int i9, int i10, int i11);

    public abstract void onItemRangeRemoved(int i9, int i10);

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeChanged(int i9, int i10, @Nullable Object obj) {
        onItemRangeChanged(i9, i10);
    }
}
