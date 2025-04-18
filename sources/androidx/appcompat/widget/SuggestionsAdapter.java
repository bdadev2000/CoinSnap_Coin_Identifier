package androidx.appcompat.widget;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.cursoradapter.widget.ResourceCursorAdapter;

/* loaded from: classes4.dex */
class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public int f1207f;

    /* renamed from: g, reason: collision with root package name */
    public int f1208g;

    /* renamed from: h, reason: collision with root package name */
    public int f1209h;

    /* renamed from: i, reason: collision with root package name */
    public int f1210i;

    /* renamed from: j, reason: collision with root package name */
    public int f1211j;

    /* renamed from: k, reason: collision with root package name */
    public int f1212k;

    /* renamed from: l, reason: collision with root package name */
    public int f1213l;

    /* loaded from: classes4.dex */
    public static final class ChildViewCache {
    }

    public static String j(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1208g = cursor.getColumnIndex("suggest_text_1");
                this.f1209h = cursor.getColumnIndex("suggest_text_2");
                this.f1210i = cursor.getColumnIndex("suggest_text_2_url");
                this.f1211j = cursor.getColumnIndex("suggest_icon_1");
                this.f1212k = cursor.getColumnIndex("suggest_icon_2");
                this.f1213l = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String j2 = j(cursor, cursor.getColumnIndex("suggest_intent_query"));
        j2.getClass();
        return j2;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final Cursor c(CharSequence charSequence) {
        if (charSequence != null) {
            charSequence.toString();
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void e(View view, Cursor cursor) {
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i2 = this.f1213l;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        childViewCache.getClass();
        childViewCache.getClass();
        childViewCache.getClass();
        childViewCache.getClass();
        int i4 = this.f1207f;
        childViewCache.getClass();
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.cursoradapter.widget.ResourceCursorAdapter, androidx.cursoradapter.widget.CursorAdapter
    public final View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            throw null;
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable i(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L23
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L12
            goto L23
        L12:
            java.lang.Integer.parseInt(r3)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.lang.NumberFormatException -> L22
            throw r0
        L16:
            java.lang.String r1 = "Icon resource not found: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "SuggestionsAdapter"
            android.util.Log.w(r1, r3)
            return r0
        L22:
            throw r0
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SuggestionsAdapter.i(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f18921b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f18921b;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            throw null;
        }
    }
}
