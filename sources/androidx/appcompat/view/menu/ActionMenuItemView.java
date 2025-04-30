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
import com.facebook.appevents.i;
import j.AbstractC2379a;
import p.AbstractC2524c;
import p.C2523b;
import p.C2535n;
import p.InterfaceC2532k;
import p.MenuC2533l;
import p.y;
import q.InterfaceC2607k;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, InterfaceC2607k {
    public C2535n b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4119c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4120d;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2532k f4121f;

    /* renamed from: g, reason: collision with root package name */
    public C2523b f4122g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC2524c f4123h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4124i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4125j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4126k;
    public int l;
    public final int m;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4124i = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2379a.f20943c, 0, 0);
        this.f4126k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.l = -1;
        setSaveEnabled(false);
    }

    @Override // q.InterfaceC2607k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.y
    public final void b(C2535n c2535n) {
        int i9;
        this.b = c2535n;
        setIcon(c2535n.getIcon());
        setTitle(c2535n.getTitleCondensed());
        setId(c2535n.b);
        if (c2535n.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        setEnabled(c2535n.isEnabled());
        if (c2535n.hasSubMenu() && this.f4122g == null) {
            this.f4122g = new C2523b(this);
        }
    }

    @Override // q.InterfaceC2607k
    public final boolean c() {
        if ((!TextUtils.isEmpty(getText())) && this.b.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i9 < 480 && ((i9 < 640 || i10 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void e() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f4119c);
        if (this.f4120d != null && ((this.b.f22125A & 4) != 4 || (!this.f4124i && !this.f4125j))) {
            z8 = false;
        }
        boolean z10 = z9 & z8;
        CharSequence charSequence3 = null;
        if (z10) {
            charSequence = this.f4119c;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.b.f22143s;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z10) {
                charSequence2 = null;
            } else {
                charSequence2 = this.b.f22133g;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.b.f22144t;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z10) {
                charSequence3 = this.b.f22133g;
            }
            i.q(this, charSequence3);
            return;
        }
        i.q(this, charSequence5);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.y
    public C2535n getItemData() {
        return this.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2532k interfaceC2532k = this.f4121f;
        if (interfaceC2532k != null) {
            interfaceC2532k.a(this.b);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4124i = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean z8 = !TextUtils.isEmpty(getText());
        if (z8 && (i12 = this.l) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f4126k;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, i13);
        } else {
            i11 = i13;
        }
        if (mode != 1073741824 && i13 > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (!z8 && this.f4120d != null) {
            super.setPadding((getMeasuredWidth() - this.f4120d.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2523b c2523b;
        if (this.b.hasSubMenu() && (c2523b = this.f4122g) != null && c2523b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f4125j != z8) {
            this.f4125j = z8;
            C2535n c2535n = this.b;
            if (c2535n != null) {
                MenuC2533l menuC2533l = c2535n.f22140p;
                menuC2533l.m = true;
                menuC2533l.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4120d = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i9 = this.m;
            if (intrinsicWidth > i9) {
                intrinsicHeight = (int) (intrinsicHeight * (i9 / intrinsicWidth));
                intrinsicWidth = i9;
            }
            if (intrinsicHeight > i9) {
                intrinsicWidth = (int) (intrinsicWidth * (i9 / intrinsicHeight));
            } else {
                i9 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i9);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(InterfaceC2532k interfaceC2532k) {
        this.f4121f = interfaceC2532k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.l = i9;
        super.setPadding(i9, i10, i11, i12);
    }

    public void setPopupCallback(AbstractC2524c abstractC2524c) {
        this.f4123h = abstractC2524c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4119c = charSequence;
        e();
    }
}
