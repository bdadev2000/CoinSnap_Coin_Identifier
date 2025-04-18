package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.n;
import g.a;
import k.b;
import k.c;
import k.d0;
import k.o;
import k.q;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements d0, View.OnClickListener, n {

    /* renamed from: b, reason: collision with root package name */
    public q f633b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f634c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f635d;

    /* renamed from: f, reason: collision with root package name */
    public k.n f636f;

    /* renamed from: g, reason: collision with root package name */
    public b f637g;

    /* renamed from: h, reason: collision with root package name */
    public c f638h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f639i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f640j;

    /* renamed from: k, reason: collision with root package name */
    public final int f641k;

    /* renamed from: l, reason: collision with root package name */
    public int f642l;

    /* renamed from: m, reason: collision with root package name */
    public final int f643m;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.n
    public final boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.n
    public final boolean b() {
        return d() && this.f633b.getIcon() == null;
    }

    @Override // k.d0
    public final void c(q qVar) {
        int i10;
        this.f633b = qVar;
        setIcon(qVar.getIcon());
        setTitle(qVar.getTitleCondensed());
        setId(qVar.a);
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(qVar.isEnabled());
        if (qVar.hasSubMenu() && this.f637g == null) {
            this.f637g = new b(this);
        }
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f634c);
        if (this.f635d != null) {
            if ((this.f633b.f20172y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.f639i && !this.f640j)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence3 = null;
        if (z13) {
            charSequence = this.f634c;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f633b.f20165q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z13) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f633b.f20153e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f633b.f20166r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z13) {
                charSequence3 = this.f633b.f20153e;
            }
            com.bumptech.glide.c.T(this, charSequence3);
            return;
        }
        com.bumptech.glide.c.T(this, charSequence5);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // k.d0
    public q getItemData() {
        return this.f633b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k.n nVar = this.f636f;
        if (nVar != null) {
            nVar.a(this.f633b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f639i = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean d10 = d();
        if (d10 && (i13 = this.f642l) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.f641k;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!d10 && this.f635d != null) {
            super.setPadding((getMeasuredWidth() - this.f635d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f633b.hasSubMenu() && (bVar = this.f637g) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f640j != z10) {
            this.f640j = z10;
            q qVar = this.f633b;
            if (qVar != null) {
                o oVar = qVar.f20162n;
                oVar.f20134k = true;
                oVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f635d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f643m;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(k.n nVar) {
        this.f636f = nVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f642l = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(c cVar) {
        this.f638h = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f634c = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f639i = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17880c, 0, 0);
        this.f641k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f643m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f642l = -1;
        setSaveEnabled(false);
    }
}
