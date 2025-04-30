package q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.tools.arruler.photomeasure.camera.ruler.R;
import p.ViewTreeObserverOnGlobalLayoutListenerC2525d;

/* loaded from: classes.dex */
public final class L extends C0 implements N {

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f22561E;

    /* renamed from: F, reason: collision with root package name */
    public ListAdapter f22562F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f22563G;

    /* renamed from: H, reason: collision with root package name */
    public int f22564H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ O f22565I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o3, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f22565I = o3;
        this.f22563G = new Rect();
        this.f22527q = o3;
        this.f22514A = true;
        this.f22515B.setFocusable(true);
        this.f22528r = new U3.t(this, 1);
    }

    @Override // q.N
    public final CharSequence e() {
        return this.f22561E;
    }

    @Override // q.N
    public final void h(CharSequence charSequence) {
        this.f22561E = charSequence;
    }

    @Override // q.N
    public final void k(int i9) {
        this.f22564H = i9;
    }

    @Override // q.N
    public final void l(int i9, int i10) {
        ViewTreeObserver viewTreeObserver;
        C2636z c2636z = this.f22515B;
        boolean isShowing = c2636z.isShowing();
        r();
        this.f22515B.setInputMethodMode(2);
        show();
        C2621r0 c2621r0 = this.f22517d;
        c2621r0.setChoiceMode(1);
        c2621r0.setTextDirection(i9);
        c2621r0.setTextAlignment(i10);
        O o3 = this.f22565I;
        int selectedItemPosition = o3.getSelectedItemPosition();
        C2621r0 c2621r02 = this.f22517d;
        if (c2636z.isShowing() && c2621r02 != null) {
            c2621r02.setListSelectionHidden(false);
            c2621r02.setSelection(selectedItemPosition);
            if (c2621r02.getChoiceMode() != 0) {
                c2621r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = o3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC2525d viewTreeObserverOnGlobalLayoutListenerC2525d = new ViewTreeObserverOnGlobalLayoutListenerC2525d(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2525d);
            this.f22515B.setOnDismissListener(new K(this, viewTreeObserverOnGlobalLayoutListenerC2525d));
        }
    }

    @Override // q.C0, q.N
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f22562F = listAdapter;
    }

    public final void r() {
        int i9;
        int i10;
        C2636z c2636z = this.f22515B;
        Drawable background = c2636z.getBackground();
        O o3 = this.f22565I;
        if (background != null) {
            background.getPadding(o3.f22580j);
            boolean z8 = g1.f22657a;
            int layoutDirection = o3.getLayoutDirection();
            Rect rect = o3.f22580j;
            if (layoutDirection == 1) {
                i9 = rect.right;
            } else {
                i9 = -rect.left;
            }
        } else {
            Rect rect2 = o3.f22580j;
            rect2.right = 0;
            rect2.left = 0;
            i9 = 0;
        }
        int paddingLeft = o3.getPaddingLeft();
        int paddingRight = o3.getPaddingRight();
        int width = o3.getWidth();
        int i11 = o3.f22579i;
        if (i11 == -2) {
            int a6 = o3.a((SpinnerAdapter) this.f22562F, c2636z.getBackground());
            int i12 = o3.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = o3.f22580j;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (a6 > i13) {
                a6 = i13;
            }
            q(Math.max(a6, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i11);
        }
        boolean z9 = g1.f22657a;
        if (o3.getLayoutDirection() == 1) {
            i10 = (((width - paddingRight) - this.f22519g) - this.f22564H) + i9;
        } else {
            i10 = paddingLeft + this.f22564H + i9;
        }
        this.f22520h = i10;
    }
}
