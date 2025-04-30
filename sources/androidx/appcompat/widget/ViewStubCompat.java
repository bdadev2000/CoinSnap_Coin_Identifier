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
import j.AbstractC2379a;
import java.lang.ref.WeakReference;
import q.e1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f4316c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f4317d;

    /* renamed from: f, reason: collision with root package name */
    public LayoutInflater f4318f;

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20941A, 0, 0);
        this.f4316c = obtainStyledAttributes.getResourceId(2, -1);
        this.b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.b != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f4318f;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.b, viewGroup, false);
                int i9 = this.f4316c;
                if (i9 != -1) {
                    inflate.setId(i9);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f4317d = new WeakReference(inflate);
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
        return this.f4316c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4318f;
    }

    public int getLayoutResource() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i9) {
        this.f4316c = i9;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4318f = layoutInflater;
    }

    public void setLayoutResource(int i9) {
        this.b = i9;
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        WeakReference weakReference = this.f4317d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i9);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i9);
        if (i9 == 0 || i9 == 4) {
            a();
        }
    }

    public void setOnInflateListener(e1 e1Var) {
    }
}
