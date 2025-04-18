package androidx.appcompat.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class z2 implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1103c;

    public /* synthetic */ z2(Object obj, int i10) {
        this.f1102b = i10;
        this.f1103c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18;
        int i19;
        int i20 = this.f1102b;
        Object obj = this.f1103c;
        switch (i20) {
            case 0:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f767z;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f762t.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean a = f4.a(searchView);
                    if (searchView.O) {
                        i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    } else {
                        i18 = 0;
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f760r;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (a) {
                        i19 = -rect.left;
                    } else {
                        i19 = paddingLeft - (rect.left + i18);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i19);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
                    return;
                }
                return;
            default:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
        }
    }
}
