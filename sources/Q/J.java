package q;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public final class J implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f22552c;

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f22552c;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i9, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i9, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i9) {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i9);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i9) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        return getDropDownView(i9, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        if (getCount() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i9) {
        ListAdapter listAdapter = this.f22552c;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i9);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.b;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
