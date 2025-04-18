package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes3.dex */
class CursorFilter extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public CursorFilterClient f18923a;

    /* loaded from: classes3.dex */
    public interface CursorFilterClient {
        void a(Cursor cursor);

        String b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.f18923a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c2 = this.f18923a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c2 != null) {
            filterResults.count = c2.getCount();
            filterResults.values = c2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        CursorFilterClient cursorFilterClient = this.f18923a;
        Cursor d = cursorFilterClient.d();
        Object obj = filterResults.values;
        if (obj == null || obj == d) {
            return;
        }
        cursorFilterClient.a((Cursor) obj);
    }
}
