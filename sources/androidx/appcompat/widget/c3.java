package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c3 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public c3(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        this.a.s();
        return true;
    }
}
