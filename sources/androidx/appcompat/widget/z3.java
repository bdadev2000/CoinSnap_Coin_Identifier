package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class z3 implements r1 {
    public final Toolbar a;

    /* renamed from: b, reason: collision with root package name */
    public int f1104b;

    /* renamed from: c, reason: collision with root package name */
    public View f1105c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f1106d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1107e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f1108f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1109g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f1110h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1111i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1112j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f1113k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1114l;

    /* renamed from: m, reason: collision with root package name */
    public m f1115m;

    /* renamed from: n, reason: collision with root package name */
    public int f1116n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f1117o;

    public z3(Toolbar toolbar) {
        boolean z10;
        Drawable drawable;
        this.f1116n = 0;
        this.a = toolbar;
        this.f1110h = toolbar.getTitle();
        this.f1111i = toolbar.getSubtitle();
        if (this.f1110h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1109g = z10;
        this.f1108f = toolbar.getNavigationIcon();
        i3 m10 = i3.m(toolbar.getContext(), null, g.a.a, R.attr.actionBarStyle);
        this.f1117o = m10.e(15);
        CharSequence k10 = m10.k(27);
        if (!TextUtils.isEmpty(k10)) {
            this.f1109g = true;
            this.f1110h = k10;
            if ((this.f1104b & 8) != 0) {
                toolbar.setTitle(k10);
                if (this.f1109g) {
                    ViewCompat.setAccessibilityPaneTitle(toolbar.getRootView(), k10);
                }
            }
        }
        CharSequence k11 = m10.k(25);
        if (!TextUtils.isEmpty(k11)) {
            this.f1111i = k11;
            if ((this.f1104b & 8) != 0) {
                toolbar.setSubtitle(k11);
            }
        }
        Drawable e2 = m10.e(20);
        if (e2 != null) {
            this.f1107e = e2;
            b();
        }
        Drawable e10 = m10.e(17);
        if (e10 != null) {
            this.f1106d = e10;
            b();
        }
        if (this.f1108f == null && (drawable = this.f1117o) != null) {
            this.f1108f = drawable;
            if ((this.f1104b & 4) != 0) {
                toolbar.setNavigationIcon(drawable);
            } else {
                toolbar.setNavigationIcon((Drawable) null);
            }
        }
        a(m10.h(10, 0));
        int i10 = m10.i(9, 0);
        if (i10 != 0) {
            View inflate = LayoutInflater.from(toolbar.getContext()).inflate(i10, (ViewGroup) toolbar, false);
            View view = this.f1105c;
            if (view != null && (this.f1104b & 16) != 0) {
                toolbar.removeView(view);
            }
            this.f1105c = inflate;
            if (inflate != null && (this.f1104b & 16) != 0) {
                toolbar.addView(inflate);
            }
            a(this.f1104b | 16);
        }
        int layoutDimension = ((TypedArray) m10.f874b).getLayoutDimension(13, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            layoutParams.height = layoutDimension;
            toolbar.setLayoutParams(layoutParams);
        }
        int c10 = m10.c(7, -1);
        int c11 = m10.c(3, -1);
        if (c10 >= 0 || c11 >= 0) {
            int max = Math.max(c10, 0);
            int max2 = Math.max(c11, 0);
            if (toolbar.f790v == null) {
                toolbar.f790v = new u2();
            }
            toolbar.f790v.a(max, max2);
        }
        int i11 = m10.i(28, 0);
        if (i11 != 0) {
            Context context = toolbar.getContext();
            toolbar.f783n = i11;
            AppCompatTextView appCompatTextView = toolbar.f773c;
            if (appCompatTextView != null) {
                appCompatTextView.setTextAppearance(context, i11);
            }
        }
        int i12 = m10.i(26, 0);
        if (i12 != 0) {
            Context context2 = toolbar.getContext();
            toolbar.f784o = i12;
            AppCompatTextView appCompatTextView2 = toolbar.f774d;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(context2, i12);
            }
        }
        int i13 = m10.i(22, 0);
        if (i13 != 0) {
            toolbar.setPopupTheme(i13);
        }
        m10.o();
        if (R.string.abc_action_bar_up_description != this.f1116n) {
            this.f1116n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i14 = this.f1116n;
                String string = i14 != 0 ? toolbar.getContext().getString(i14) : null;
                this.f1112j = string;
                if ((this.f1104b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f1116n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1112j);
                    }
                }
            }
        }
        this.f1112j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f1104b ^ i10;
        this.f1104b = i10;
        if (i11 != 0) {
            int i12 = i11 & 4;
            Toolbar toolbar = this.a;
            if (i12 != 0) {
                if ((i10 & 4) != 0 && (i10 & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1112j)) {
                        toolbar.setNavigationContentDescription(this.f1116n);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1112j);
                    }
                }
                if ((this.f1104b & 4) != 0) {
                    Drawable drawable = this.f1108f;
                    if (drawable == null) {
                        drawable = this.f1117o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                b();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f1110h);
                    toolbar.setSubtitle(this.f1111i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1105c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        Drawable drawable;
        int i10 = this.f1104b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f1107e;
                if (drawable == null) {
                    drawable = this.f1106d;
                }
            } else {
                drawable = this.f1106d;
            }
        } else {
            drawable = null;
        }
        this.a.setLogo(drawable);
    }
}
