package com.bytedance.adsdk.ugeno.qsH;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class Sg {
    private DataSetObserver Sg;
    private final DataSetObservable YFl = new DataSetObservable();

    public Parcelable Sg() {
        return null;
    }

    public float YFl(int i10) {
        return 1.0f;
    }

    public abstract int YFl();

    public abstract boolean YFl(View view, Object obj);

    public void tN() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.Sg;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.YFl.notifyChanged();
    }

    public int YFl(Object obj) {
        return -1;
    }

    public Object YFl(ViewGroup viewGroup, int i10) {
        return YFl((View) viewGroup, i10);
    }

    public void YFl(ViewGroup viewGroup, int i10, Object obj) {
        YFl((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object YFl(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void YFl(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void YFl(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.Sg = dataSetObserver;
        }
    }
}
