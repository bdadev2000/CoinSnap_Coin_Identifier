package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class t0 extends Spinner {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1030k = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final r f1031b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1032c;

    /* renamed from: d, reason: collision with root package name */
    public final k f1033d;

    /* renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f1034f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1035g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f1036h;

    /* renamed from: i, reason: collision with root package name */
    public int f1037i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f1038j;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t0(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969819(0x7f0404db, float:1.754833E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f1038j = r1
            android.content.Context r1 = r11.getContext()
            androidx.appcompat.widget.p3.a(r1, r11)
            int[] r1 = g.a.f17898v
            androidx.appcompat.widget.i3 r2 = new androidx.appcompat.widget.i3
            r3 = 0
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r13, r1, r0, r3)
            r2.<init>(r12, r4)
            androidx.appcompat.widget.r r4 = new androidx.appcompat.widget.r
            r4.<init>(r11)
            r11.f1031b = r4
            r4 = 4
            int r4 = r2.i(r4, r3)
            if (r4 == 0) goto L36
            j.f r5 = new j.f
            r5.<init>(r12, r4)
            r11.f1032c = r5
            goto L38
        L36:
            r11.f1032c = r12
        L38:
            r4 = -1
            r5 = 0
            int[] r6 = androidx.appcompat.widget.t0.f1030k     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r7 = r6.hasValue(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            if (r7 == 0) goto L60
            int r4 = r6.getInt(r3, r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4f
            goto L60
        L4b:
            r12 = move-exception
            r5 = r6
            goto Ld9
        L4f:
            r7 = move-exception
            goto L57
        L51:
            r12 = move-exception
            goto Ld9
        L54:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L57:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L63
        L60:
            r6.recycle()
        L63:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L9d
            if (r4 == r7) goto L6a
            goto Laa
        L6a:
            androidx.appcompat.widget.q0 r4 = new androidx.appcompat.widget.q0
            android.content.Context r8 = r11.f1032c
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f1032c
            androidx.appcompat.widget.i3 r1 = androidx.appcompat.widget.i3.m(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f874b
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f1037i = r8
            android.graphics.drawable.Drawable r8 = r1.e(r7)
            r4.n(r8)
            java.lang.String r6 = r2.j(r6)
            r4.E = r6
            r1.o()
            r11.f1036h = r4
            androidx.appcompat.widget.k r1 = new androidx.appcompat.widget.k
            r1.<init>(r11, r11, r4, r7)
            r11.f1033d = r1
            goto Laa
        L9d:
            androidx.appcompat.widget.n0 r1 = new androidx.appcompat.widget.n0
            r1.<init>(r11)
            r11.f1036h = r1
            java.lang.String r4 = r2.j(r6)
            r1.f945d = r4
        Laa:
            java.lang.Object r1 = r2.f874b
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            java.lang.CharSequence[] r1 = r1.getTextArray(r3)
            if (r1 == 0) goto Lc5
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r12, r4, r1)
            r12 = 2131558722(0x7f0d0142, float:1.8742768E38)
            r3.setDropDownViewResource(r12)
            r11.setAdapter(r3)
        Lc5:
            r2.o()
            r11.f1035g = r7
            android.widget.SpinnerAdapter r12 = r11.f1034f
            if (r12 == 0) goto Ld3
            r11.setAdapter(r12)
            r11.f1034f = r5
        Ld3:
            androidx.appcompat.widget.r r12 = r11.f1031b
            r12.d(r13, r0)
            return
        Ld9:
            if (r5 == 0) goto Lde
            r5.recycle()
        Lde:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.t0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f1038j;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f1031b;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            return s0Var.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            return s0Var.k();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1036h != null) {
            return this.f1037i;
        }
        return super.getDropDownWidth();
    }

    public final s0 getInternalPopup() {
        return this.f1036h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            return s0Var.e();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1032c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        s0 s0Var = this.f1036h;
        return s0Var != null ? s0Var.d() : super.getPrompt();
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f1031b;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f1031b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s0 s0Var = this.f1036h;
        if (s0Var != null && s0Var.a()) {
            s0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1036h != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        r0 r0Var = (r0) parcelable;
        super.onRestoreInstanceState(r0Var.getSuperState());
        if (r0Var.f1009b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new k.e(this, 2));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        r0 r0Var = new r0(super.onSaveInstanceState());
        s0 s0Var = this.f1036h;
        if (s0Var != null && s0Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0Var.f1009b = z10;
        return r0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k kVar = this.f1033d;
        if (kVar != null && kVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            if (!s0Var.a()) {
                s0Var.j(l0.b(this), l0.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f1031b;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f1031b;
        if (rVar != null) {
            rVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            s0Var.i(i10);
            s0Var.c(i10);
        } else {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            s0Var.g(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1036h != null) {
            this.f1037i = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            s0Var.n(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(com.bumptech.glide.c.t(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            s0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        r rVar = this.f1031b;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        r rVar = this.f1031b;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1035g) {
            this.f1034f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        s0 s0Var = this.f1036h;
        if (s0Var != null) {
            Context context = this.f1032c;
            if (context == null) {
                context = getContext();
            }
            s0Var.l(new o0(spinnerAdapter, context.getTheme()));
        }
    }
}
