package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class l0 {
    public abstract void onChanged();

    public void onItemRangeChanged(int i10, int i11) {
    }

    public abstract void onItemRangeInserted(int i10, int i11);

    public abstract void onItemRangeMoved(int i10, int i11, int i12);

    public abstract void onItemRangeRemoved(int i10, int i11);

    public void onStateRestorationPolicyChanged() {
    }

    public void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
        onItemRangeChanged(i10, i11);
    }
}
