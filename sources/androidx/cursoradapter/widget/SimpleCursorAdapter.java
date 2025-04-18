package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.view.View;

/* loaded from: classes.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {

    /* loaded from: classes.dex */
    public interface CursorToStringConverter {
    }

    /* loaded from: classes.dex */
    public interface ViewBinder {
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public final String b(Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final void e(View view, Cursor cursor) {
        throw null;
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public final Cursor h(Cursor cursor) {
        if (cursor == null) {
            return super.h(cursor);
        }
        throw null;
    }
}
