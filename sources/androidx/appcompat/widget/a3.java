package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f806b;

    public a3(SearchView searchView) {
        this.f806b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String flattenToShortString;
        SearchView searchView = this.f806b;
        ImageView imageView = searchView.f763v;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f760r;
        if (view == imageView) {
            searchView.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.N;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f765x) {
            searchView.o();
            return;
        }
        if (view == searchView.f764w) {
            searchView.s();
            return;
        }
        if (view == searchView.f766y) {
            SearchableInfo searchableInfo = searchView.f755d0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.J);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            flattenToShortString = null;
                        } else {
                            flattenToShortString = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", flattenToShortString);
                        searchView.getContext().startActivity(intent);
                        return;
                    }
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.m(searchView.K, searchableInfo));
                        return;
                    }
                    return;
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                    return;
                }
            }
            return;
        }
        if (view == searchAutoComplete) {
            searchView.n();
        }
    }
}
