package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.support.v4.media.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.cursoradapter.widget.CursorFilter;

/* loaded from: classes2.dex */
public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter.CursorFilterClient {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18920a;

    /* renamed from: b, reason: collision with root package name */
    public Cursor f18921b;

    /* renamed from: c, reason: collision with root package name */
    public int f18922c;
    public CursorFilter d;

    /* loaded from: classes2.dex */
    public class ChangeObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public class MyDataSetObserver extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public final void onChanged() {
            throw null;
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            throw null;
        }
    }

    public void a(Cursor cursor) {
        Cursor h2 = h(cursor);
        if (h2 != null) {
            h2.close();
        }
    }

    public String b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor c(CharSequence charSequence) {
        return this.f18921b;
    }

    @Override // androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final Cursor d() {
        return this.f18921b;
    }

    public abstract void e(View view, Cursor cursor);

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f18920a || (cursor = this.f18921b) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f18920a) {
            return null;
        }
        this.f18921b.moveToPosition(i2);
        if (view == null) {
            view = f(null, this.f18921b, viewGroup);
        }
        e(view, this.f18921b);
        return view;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, androidx.cursoradapter.widget.CursorFilter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.d == null) {
            ?? filter = new Filter();
            filter.f18923a = this;
            this.d = filter;
        }
        return this.d;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (!this.f18920a || (cursor = this.f18921b) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f18921b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (this.f18920a && (cursor = this.f18921b) != null && cursor.moveToPosition(i2)) {
            return this.f18921b.getLong(this.f18922c);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f18920a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f18921b.moveToPosition(i2)) {
            throw new IllegalStateException(d.i("couldn't move cursor to position ", i2));
        }
        if (view == null) {
            view = g(null, this.f18921b, viewGroup);
        }
        e(view, this.f18921b);
        return view;
    }

    public Cursor h(Cursor cursor) {
        Cursor cursor2 = this.f18921b;
        if (cursor == cursor2) {
            return null;
        }
        this.f18921b = cursor;
        if (cursor != null) {
            this.f18922c = cursor.getColumnIndexOrThrow("_id");
            this.f18920a = true;
            notifyDataSetChanged();
        } else {
            this.f18922c = -1;
            this.f18920a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
