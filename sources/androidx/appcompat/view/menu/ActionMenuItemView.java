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
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import com.google.common.primitives.Ints;

@RestrictTo
/* loaded from: classes2.dex */
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    /* renamed from: a, reason: collision with root package name */
    public MenuItemImpl f664a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f665b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f666c;
    public MenuBuilder.ItemInvoker d;

    /* renamed from: f, reason: collision with root package name */
    public ForwardingListener f667f;

    /* renamed from: g, reason: collision with root package name */
    public PopupCallback f668g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f669h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f670i;

    /* renamed from: j, reason: collision with root package name */
    public final int f671j;

    /* renamed from: k, reason: collision with root package name */
    public int f672k;

    /* renamed from: l, reason: collision with root package name */
    public final int f673l;

    /* loaded from: classes2.dex */
    public class ActionMenuItemForwardingListener extends ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu b() {
            PopupCallback popupCallback = ActionMenuItemView.this.f668g;
            if (popupCallback != null) {
                return popupCallback.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean c() {
            ShowableListMenu b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.d;
            return itemInvoker != null && itemInvoker.b(actionMenuItemView.f664a) && (b2 = b()) != null && b2.a();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class PopupCallback {
        public abstract ShowableListMenu a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f669h = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f313c, 0, 0);
        this.f671j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f673l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f672k = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public final boolean b() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.f664a.getIcon() == null;
    }

    public final boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void e() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f665b);
        if (this.f666c != null && ((this.f664a.f771y & 4) != 4 || (!this.f669h && !this.f670i))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f665b : null);
        CharSequence charSequence = this.f664a.f765q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f664a.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f664a.f766r;
        if (TextUtils.isEmpty(charSequence2)) {
            TooltipCompat.a(this, z4 ? null : this.f664a.e);
        } else {
            TooltipCompat.a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f664a;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(MenuItemImpl menuItemImpl, int i2) {
        this.f664a = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleCondensed());
        setId(menuItemImpl.f751a);
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f667f == null) {
            this.f667f = new ActionMenuItemForwardingListener();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuBuilder.ItemInvoker itemInvoker = this.d;
        if (itemInvoker != null) {
            itemInvoker.b(this.f664a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f669h = d();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2 = !TextUtils.isEmpty(getText());
        if (z2 && (i4 = this.f672k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f671j;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i5) : i5;
        if (mode != 1073741824 && i5 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, Ints.MAX_POWER_OF_TWO), i3);
        }
        if (z2 || this.f666c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f666c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f664a.hasSubMenu() && (forwardingListener = this.f667f) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f670i != z2) {
            this.f670i = z2;
            MenuItemImpl menuItemImpl = this.f664a;
            if (menuItemImpl != null) {
                menuItemImpl.f762n.onItemActionRequestChanged(menuItemImpl);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f666c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f673l;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        e();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.d = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        this.f672k = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.f668g = popupCallback;
    }

    public void setTitle(CharSequence charSequence) {
        this.f665b = charSequence;
        e();
    }
}
