package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class l3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f915b;

    public l3(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f915b = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f915b;
        if (searchAutoComplete.f770i) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f770i = false;
        }
    }
}
