package na;

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

/* loaded from: classes3.dex */
public final class r extends ArrayAdapter {

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f22687b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f22688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f22689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f22689d = sVar;
        a();
    }

    public final void a() {
        boolean z10;
        ColorStateList colorStateList;
        boolean z11;
        boolean z12;
        s sVar = this.f22689d;
        ColorStateList colorStateList2 = sVar.f22697n;
        if (colorStateList2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z10) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f22688c = colorStateList;
        if (sVar.f22696m != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (sVar.f22697n != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{g0.d.b(sVar.f22697n.getColorForState(iArr3, 0), sVar.f22696m), g0.d.b(sVar.f22697n.getColorForState(iArr2, 0), sVar.f22696m), sVar.f22696m});
            }
        }
        this.f22687b = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10;
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.f22689d;
            Drawable drawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText())) {
                if (sVar.f22696m != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ColorDrawable colorDrawable = new ColorDrawable(sVar.f22696m);
                    if (this.f22688c != null) {
                        h0.a.h(colorDrawable, this.f22687b);
                        drawable = new RippleDrawable(this.f22688c, colorDrawable, null);
                    } else {
                        drawable = colorDrawable;
                    }
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
