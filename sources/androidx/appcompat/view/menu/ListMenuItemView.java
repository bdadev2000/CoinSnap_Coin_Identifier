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
import androidx.appcompat.widget.i3;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;
import g.a;
import k.d0;
import k.q;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements d0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    public q f646b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f647c;

    /* renamed from: d, reason: collision with root package name */
    public RadioButton f648d;

    /* renamed from: f, reason: collision with root package name */
    public TextView f649f;

    /* renamed from: g, reason: collision with root package name */
    public CheckBox f650g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f651h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f652i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f653j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f654k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f655l;

    /* renamed from: m, reason: collision with root package name */
    public final int f656m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f657n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f658o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f659p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f660q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f661r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f662s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i3 m10 = i3.m(getContext(), attributeSet, a.f17895r, R.attr.listMenuViewStyle);
        this.f655l = m10.e(5);
        this.f656m = m10.i(1, -1);
        this.f658o = m10.a(7, false);
        this.f657n = context;
        this.f659p = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f660q = obtainStyledAttributes.hasValue(0);
        m10.o();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f661r == null) {
            this.f661r = LayoutInflater.from(getContext());
        }
        return this.f661r;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.f652i;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f653j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f653j.getLayoutParams();
            rect.top = this.f653j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    @Override // k.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k.q r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(k.q):void");
    }

    @Override // k.d0
    public q getItemData() {
        return this.f646b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.f655l);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f649f = textView;
        int i10 = this.f656m;
        if (i10 != -1) {
            textView.setTextAppearance(this.f657n, i10);
        }
        this.f651h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f652i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f659p);
        }
        this.f653j = (ImageView) findViewById(R.id.group_divider);
        this.f654k = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f647c != null && this.f658o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f647c.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f648d == null && this.f650g == null) {
            return;
        }
        if ((this.f646b.f20171x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f648d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f648d = radioButton;
                LinearLayout linearLayout = this.f654k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f648d;
            view = this.f650g;
        } else {
            if (this.f650g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f650g = checkBox;
                LinearLayout linearLayout2 = this.f654k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f650g;
            view = this.f648d;
        }
        if (z10) {
            compoundButton.setChecked(this.f646b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f650g;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f648d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f646b.f20171x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f648d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f648d = radioButton;
                LinearLayout linearLayout = this.f654k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f648d;
        } else {
            if (this.f650g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f650g = checkBox;
                LinearLayout linearLayout2 = this.f654k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f650g;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f662s = z10;
        this.f658o = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f653j;
        if (imageView != null) {
            if (!this.f660q && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f646b.f20162n.getClass();
        boolean z10 = this.f662s;
        if (!z10 && !this.f658o) {
            return;
        }
        ImageView imageView = this.f647c;
        if (imageView == null && drawable == null && !this.f658o) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f647c = imageView2;
            LinearLayout linearLayout = this.f654k;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f658o) {
            this.f647c.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f647c;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f647c.getVisibility() != 0) {
            this.f647c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f649f.setText(charSequence);
            if (this.f649f.getVisibility() != 0) {
                this.f649f.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f649f.getVisibility() != 8) {
            this.f649f.setVisibility(8);
        }
    }
}
