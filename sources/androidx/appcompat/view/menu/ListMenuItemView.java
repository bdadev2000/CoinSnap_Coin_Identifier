package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo
/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public MenuItemImpl f718a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f719b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f720c;
    public TextView d;

    /* renamed from: f, reason: collision with root package name */
    public CheckBox f721f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f722g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f723h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f724i;

    /* renamed from: j, reason: collision with root package name */
    public LinearLayout f725j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f726k;

    /* renamed from: l, reason: collision with root package name */
    public final int f727l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f728m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f729n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f730o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f731p;

    /* renamed from: q, reason: collision with root package name */
    public LayoutInflater f732q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f733r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray e = TintTypedArray.e(getContext(), attributeSet, R.styleable.f327s, com.cooldev.gba.emulator.gameboy.R.attr.listMenuViewStyle);
        this.f726k = e.b(5);
        TypedArray typedArray = e.f1237b;
        this.f727l = typedArray.getResourceId(1, -1);
        this.f729n = typedArray.getBoolean(7, false);
        this.f728m = context;
        this.f730o = e.b(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, com.cooldev.gba.emulator.gameboy.R.attr.dropDownListViewStyle, 0);
        this.f731p = obtainStyledAttributes.hasValue(0);
        e.f();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f732q == null) {
            this.f732q = LayoutInflater.from(getContext());
        }
        return this.f732q;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f723h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f724i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f724i.getLayoutParams();
        rect.top = this.f724i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f718a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r11.f762n.isQwertyMode() ? r11.f758j : r11.f756h) != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void initialize(androidx.appcompat.view.menu.MenuItemImpl r10, int r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.initialize(androidx.appcompat.view.menu.MenuItemImpl, int):void");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f726k);
        TextView textView = (TextView) findViewById(com.cooldev.gba.emulator.gameboy.R.id.title);
        this.d = textView;
        int i2 = this.f727l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f728m, i2);
        }
        this.f722g = (TextView) findViewById(com.cooldev.gba.emulator.gameboy.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.cooldev.gba.emulator.gameboy.R.id.submenuarrow);
        this.f723h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f730o);
        }
        this.f724i = (ImageView) findViewById(com.cooldev.gba.emulator.gameboy.R.id.group_divider);
        this.f725j = (LinearLayout) findViewById(com.cooldev.gba.emulator.gameboy.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f719b != null && this.f729n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f719b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f720c == null && this.f721f == null) {
            return;
        }
        if ((this.f718a.x & 4) != 0) {
            if (this.f720c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f720c = radioButton;
                LinearLayout linearLayout = this.f725j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f720c;
            view = this.f721f;
        } else {
            if (this.f721f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f721f = checkBox;
                LinearLayout linearLayout2 = this.f725j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f721f;
            view = this.f720c;
        }
        if (z2) {
            compoundButton.setChecked(this.f718a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f721f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f720c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f718a.x & 4) != 0) {
            if (this.f720c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f720c = radioButton;
                LinearLayout linearLayout = this.f725j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f720c;
        } else {
            if (this.f721f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f721f = checkBox;
                LinearLayout linearLayout2 = this.f725j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f721f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f733r = z2;
        this.f729n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f724i;
        if (imageView != null) {
            imageView.setVisibility((this.f731p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f718a.f762n.getOptionalIconsVisible() || this.f733r;
        if (z2 || this.f729n) {
            ImageView imageView = this.f719b;
            if (imageView == null && drawable == null && !this.f729n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.cooldev.gba.emulator.gameboy.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f719b = imageView2;
                LinearLayout linearLayout = this.f725j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f729n) {
                this.f719b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f719b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f719b.getVisibility() != 0) {
                this.f719b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.d.getVisibility() != 8) {
                this.d.setVisibility(8);
            }
        } else {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }
}
