package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class T implements A0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4943a;
    public final Object b;

    public /* synthetic */ T(Object obj, int i9) {
        this.f4943a = i9;
        this.b = obj;
    }

    @Override // androidx.recyclerview.widget.A0
    public int a(View view) {
        switch (this.f4943a) {
            case 0:
                return ((W) this.b).getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).leftMargin;
            default:
                return ((W) this.b).getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).topMargin;
        }
    }

    @Override // androidx.recyclerview.widget.A0
    public int b() {
        switch (this.f4943a) {
            case 0:
                return ((W) this.b).getPaddingLeft();
            default:
                return ((W) this.b).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.A0
    public int c() {
        switch (this.f4943a) {
            case 0:
                W w2 = (W) this.b;
                return w2.getWidth() - w2.getPaddingRight();
            default:
                W w9 = (W) this.b;
                return w9.getHeight() - w9.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.A0
    public View d(int i9) {
        switch (this.f4943a) {
            case 0:
                return ((W) this.b).getChildAt(i9);
            default:
                return ((W) this.b).getChildAt(i9);
        }
    }

    @Override // androidx.recyclerview.widget.A0
    public int e(View view) {
        switch (this.f4943a) {
            case 0:
                return ((W) this.b).getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).rightMargin;
            default:
                return ((W) this.b).getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((X) view.getLayoutParams())).bottomMargin;
        }
    }
}
