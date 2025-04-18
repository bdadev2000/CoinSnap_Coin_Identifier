package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class y2 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public y2(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        SearchView searchView = this.a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.M;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z10);
        }
    }
}
