package n0;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class e0 extends ac.e {

    /* renamed from: d, reason: collision with root package name */
    public final View f22264d;

    public e0(View view) {
        this.f22264d = view;
    }

    @Override // ac.e
    public void o() {
        View view = this.f22264d;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // ac.e
    public void u() {
        View view;
        View view2 = this.f22264d;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new androidx.activity.d(view, 5));
        }
    }
}
