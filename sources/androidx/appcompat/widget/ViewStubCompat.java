package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f795b;

    /* renamed from: c, reason: collision with root package name */
    public int f796c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f797d;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflater f798f;

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f795b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.a.A, 0, 0);
        this.f796c = obtainStyledAttributes.getResourceId(2, -1);
        this.f795b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f795b != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f798f;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f795b, viewGroup, false);
                int i10 = this.f796c;
                if (i10 != -1) {
                    inflate.setId(i10);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f797d = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f796c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f798f;
    }

    public int getLayoutResource() {
        return this.f795b;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f796c = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f798f = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f795b = i10;
    }

    public void setOnInflateListener(e4 e4Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference weakReference = this.f797d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }
}
