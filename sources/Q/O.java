package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.Nullable;
import p.ViewTreeObserverOnGlobalLayoutListenerC2525d;

/* loaded from: classes.dex */
public final class O extends Spinner {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f22573k = {R.attr.spinnerMode};
    public final C2617p b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22574c;

    /* renamed from: d, reason: collision with root package name */
    public final C2584G f22575d;

    /* renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f22576f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22577g;

    /* renamed from: h, reason: collision with root package name */
    public final N f22578h;

    /* renamed from: i, reason: collision with root package name */
    public int f22579i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f22580j;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public O(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969704(0x7f040468, float:1.7548097E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f22580j = r1
            android.content.Context r1 = r12.getContext()
            q.O0.a(r12, r1)
            int[] r1 = j.AbstractC2379a.f20959u
            r2 = 0
            l5.k r3 = l5.k.i(r13, r14, r1, r0, r2)
            q.p r4 = new q.p
            r4.<init>(r12)
            r12.b = r4
            java.lang.Object r4 = r3.b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r5 = 4
            int r5 = r4.getResourceId(r5, r2)
            if (r5 == 0) goto L35
            o.d r6 = new o.d
            r6.<init>(r13, r5)
            r12.f22574c = r6
            goto L37
        L35:
            r12.f22574c = r13
        L37:
            r5 = -1
            r6 = 0
            int[] r7 = q.O.f22573k     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r2)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r5 = r7.getInt(r2, r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r13 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r13 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L9d
            if (r5 == r8) goto L6a
            goto Laa
        L6a:
            q.L r5 = new q.L
            android.content.Context r9 = r12.f22574c
            r5.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f22574c
            l5.k r1 = l5.k.i(r9, r14, r1, r0, r2)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.b
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f22579i = r9
            android.graphics.drawable.Drawable r9 = r1.e(r8)
            r5.i(r9)
            java.lang.String r7 = r4.getString(r7)
            r5.f22561E = r7
            r1.j()
            r12.f22578h = r5
            q.G r1 = new q.G
            r1.<init>(r12, r12, r5)
            r12.f22575d = r1
            goto Laa
        L9d:
            q.I r1 = new q.I
            r1.<init>(r12)
            r12.f22578h = r1
            java.lang.String r5 = r4.getString(r7)
            r1.f22550d = r5
        Laa:
            java.lang.CharSequence[] r1 = r4.getTextArray(r2)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r13, r4, r1)
            r13 = 2131558693(0x7f0d0125, float:1.874271E38)
            r2.setDropDownViewResource(r13)
            r12.setAdapter(r2)
        Lc1:
            r3.j()
            r12.f22577g = r8
            android.widget.SpinnerAdapter r13 = r12.f22576f
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f22576f = r6
        Lcf:
            q.p r13 = r12.b
            r13.d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q.O.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f22580j;
            drawable.getPadding(rect);
            return i10 + rect.left + rect.right;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        N n2 = this.f22578h;
        if (n2 != null) {
            return n2.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        N n2 = this.f22578h;
        if (n2 != null) {
            return n2.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f22578h != null) {
            return this.f22579i;
        }
        return super.getDropDownWidth();
    }

    public final N getInternalPopup() {
        return this.f22578h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        N n2 = this.f22578h;
        if (n2 != null) {
            return n2.f();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f22574c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        N n2 = this.f22578h;
        if (n2 != null) {
            return n2.e();
        }
        return super.getPrompt();
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            return c2617p.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N n2 = this.f22578h;
        if (n2 != null && n2.a()) {
            n2.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f22578h != null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        M m = (M) parcelable;
        super.onRestoreInstanceState(m.getSuperState());
        if (m.b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2525d(this, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, q.M, android.os.Parcelable] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        N n2 = this.f22578h;
        if (n2 != null && n2.a()) {
            z8 = true;
        } else {
            z8 = false;
        }
        baseSavedState.b = z8;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2584G c2584g = this.f22575d;
        if (c2584g != null && c2584g.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        N n2 = this.f22578h;
        if (n2 != null) {
            if (!n2.a()) {
                this.f22578h.l(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.f(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i9) {
        N n2 = this.f22578h;
        if (n2 != null) {
            n2.k(i9);
            n2.d(i9);
        } else {
            super.setDropDownHorizontalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i9) {
        N n2 = this.f22578h;
        if (n2 != null) {
            n2.j(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i9) {
        if (this.f22578h != null) {
            this.f22579i = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        N n2 = this.f22578h;
        if (n2 != null) {
            n2.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(com.facebook.appevents.n.g(getPopupContext(), i9));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        N n2 = this.f22578h;
        if (n2 != null) {
            n2.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C2617p c2617p = this.b;
        if (c2617p != null) {
            c2617p.i(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, q.J] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f22577g) {
            this.f22576f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        N n2 = this.f22578h;
        if (n2 != 0) {
            Context context = this.f22574c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f22552c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC2585H.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n2.o(obj);
        }
    }
}
