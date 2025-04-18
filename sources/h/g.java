package h;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* loaded from: classes.dex */
public final class g extends ArrayAdapter {
    public g(Context context, int i10) {
        super(context, i10, R.id.text1, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
