package U3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class u extends ArrayAdapter {
    public ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f3222c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f3223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context, int i9, String[] strArr) {
        super(context, i9, strArr);
        this.f3223d = vVar;
        a();
    }

    public final void a() {
        boolean z8;
        ColorStateList colorStateList;
        v vVar = this.f3223d;
        ColorStateList colorStateList2 = vVar.f3229n;
        if (colorStateList2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z8) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f3222c = colorStateList;
        if (vVar.m != 0 && vVar.f3229n != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{L.c.b(vVar.f3229n.getColorForState(iArr3, 0), vVar.m), L.c.b(vVar.f3229n.getColorForState(iArr2, 0), vVar.m), vVar.m});
        }
        this.b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i9, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            v vVar = this.f3223d;
            Drawable drawable = null;
            if (vVar.getText().toString().contentEquals(textView.getText()) && vVar.m != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(vVar.m);
                if (this.f3222c != null) {
                    M.a.h(colorDrawable, this.b);
                    drawable = new RippleDrawable(this.f3222c, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            ViewCompat.setBackground(textView, drawable);
        }
        return view2;
    }
}
