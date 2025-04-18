package u0;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.h2;
import androidx.appcompat.widget.o3;
import eb.j;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable, c {

    /* renamed from: f, reason: collision with root package name */
    public Context f25412f;

    /* renamed from: j, reason: collision with root package name */
    public d f25416j;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25410c = true;

    /* renamed from: d, reason: collision with root package name */
    public Cursor f25411d = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25409b = false;

    /* renamed from: g, reason: collision with root package name */
    public int f25413g = -1;

    /* renamed from: h, reason: collision with root package name */
    public a f25414h = new a(this);

    /* renamed from: i, reason: collision with root package name */
    public h2 f25415i = new h2(this, 1);

    public b(Context context) {
        this.f25412f = context;
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f25411d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f25414h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                h2 h2Var = this.f25415i;
                if (h2Var != null) {
                    cursor2.unregisterDataSetObserver(h2Var);
                }
            }
            this.f25411d = cursor;
            if (cursor != null) {
                a aVar2 = this.f25414h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                h2 h2Var2 = this.f25415i;
                if (h2Var2 != null) {
                    cursor.registerDataSetObserver(h2Var2);
                }
                this.f25413g = cursor.getColumnIndexOrThrow("_id");
                this.f25409b = true;
                notifyDataSetChanged();
            } else {
                this.f25413g = -1;
                this.f25409b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f25409b && (cursor = this.f25411d) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f25409b) {
            this.f25411d.moveToPosition(i10);
            if (view == null) {
                o3 o3Var = (o3) this;
                view = o3Var.f975m.inflate(o3Var.f974l, viewGroup, false);
            }
            a(view, this.f25411d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f25416j == null) {
            this.f25416j = new d(this);
        }
        return this.f25416j;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f25409b && (cursor = this.f25411d) != null) {
            cursor.moveToPosition(i10);
            return this.f25411d;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f25409b || (cursor = this.f25411d) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f25411d.getLong(this.f25413g);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f25409b) {
            if (this.f25411d.moveToPosition(i10)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f25411d);
                return view;
            }
            throw new IllegalStateException(j.i("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
