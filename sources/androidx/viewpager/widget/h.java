package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class h extends DataSetObserver {
    public final /* synthetic */ ViewPager a;

    public h(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dataSetChanged();
    }
}
