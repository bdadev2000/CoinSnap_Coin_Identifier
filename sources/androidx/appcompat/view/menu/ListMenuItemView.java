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
import com.tools.arruler.photomeasure.camera.ruler.R;
import j.AbstractC2379a;
import l5.k;
import p.C2535n;
import p.y;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
    public C2535n b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f4128c;

    /* renamed from: d, reason: collision with root package name */
    public RadioButton f4129d;

    /* renamed from: f, reason: collision with root package name */
    public TextView f4130f;

    /* renamed from: g, reason: collision with root package name */
    public CheckBox f4131g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f4132h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f4133i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f4134j;

    /* renamed from: k, reason: collision with root package name */
    public LinearLayout f4135k;
    public final Drawable l;
    public final int m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f4136n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4137o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f4138p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4139q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutInflater f4140r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4141s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k i9 = k.i(getContext(), attributeSet, AbstractC2379a.f20956r, R.attr.listMenuViewStyle, 0);
        this.l = i9.e(5);
        TypedArray typedArray = (TypedArray) i9.b;
        this.m = typedArray.getResourceId(1, -1);
        this.f4137o = typedArray.getBoolean(7, false);
        this.f4136n = context;
        this.f4138p = i9.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f4139q = obtainStyledAttributes.hasValue(0);
        i9.j();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f4140r == null) {
            this.f4140r = LayoutInflater.from(getContext());
        }
        return this.f4140r;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        int i9;
        ImageView imageView = this.f4133i;
        if (imageView != null) {
            if (z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4134j;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4134j.getLayoutParams();
            rect.top = this.f4134j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // p.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(p.C2535n r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(p.n):void");
    }

    @Override // p.y
    public C2535n getItemData() {
        return this.b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.l);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f4130f = textView;
        int i9 = this.m;
        if (i9 != -1) {
            textView.setTextAppearance(this.f4136n, i9);
        }
        this.f4132h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f4133i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4138p);
        }
        this.f4134j = (ImageView) findViewById(R.id.group_divider);
        this.f4135k = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.f4128c != null && this.f4137o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4128c.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (!z8 && this.f4129d == null && this.f4131g == null) {
            return;
        }
        if ((this.b.f22150z & 4) != 0) {
            if (this.f4129d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4129d = radioButton;
                LinearLayout linearLayout = this.f4135k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4129d;
            view = this.f4131g;
        } else {
            if (this.f4131g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4131g = checkBox;
                LinearLayout linearLayout2 = this.f4135k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4131g;
            view = this.f4129d;
        }
        if (z8) {
            compoundButton.setChecked(this.b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f4131g;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f4129d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if ((this.b.f22150z & 4) != 0) {
            if (this.f4129d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f4129d = radioButton;
                LinearLayout linearLayout = this.f4135k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f4129d;
        } else {
            if (this.f4131g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f4131g = checkBox;
                LinearLayout linearLayout2 = this.f4135k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f4131g;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f4141s = z8;
        this.f4137o = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        int i9;
        ImageView imageView = this.f4134j;
        if (imageView != null) {
            if (!this.f4139q && z8) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    public void setIcon(Drawable drawable) {
        this.b.f22140p.getClass();
        boolean z8 = this.f4141s;
        if (!z8 && !this.f4137o) {
            return;
        }
        ImageView imageView = this.f4128c;
        if (imageView == null && drawable == null && !this.f4137o) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f4128c = imageView2;
            LinearLayout linearLayout = this.f4135k;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f4137o) {
            this.f4128c.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f4128c;
        if (!z8) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f4128c.getVisibility() != 0) {
            this.f4128c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f4130f.setText(charSequence);
            if (this.f4130f.getVisibility() != 0) {
                this.f4130f.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f4130f.getVisibility() != 8) {
            this.f4130f.setVisibility(8);
        }
    }
}
