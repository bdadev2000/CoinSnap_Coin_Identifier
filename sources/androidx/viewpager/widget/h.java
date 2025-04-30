package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class h extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager f5163a;

    public h(ViewPager viewPager) {
        this.f5163a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f5163a.dataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f5163a.dataSetChanged();
    }
}
