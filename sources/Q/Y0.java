package q;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class Y0 implements InterfaceC2604i0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f22611a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public View f22612c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f22613d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f22614e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f22615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22616g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f22617h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f22618i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f22619j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f22620k;
    public boolean l;
    public C2605j m;

    /* renamed from: n, reason: collision with root package name */
    public int f22621n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f22622o;

    public final void a(int i9) {
        View view;
        int i10 = this.b ^ i9;
        this.b = i9;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i9 & 4) != 0) {
                    b();
                }
                int i11 = this.b & 4;
                Toolbar toolbar = this.f22611a;
                if (i11 != 0) {
                    Drawable drawable = this.f22615f;
                    if (drawable == null) {
                        drawable = this.f22622o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f22611a;
            if (i12 != 0) {
                if ((i9 & 8) != 0) {
                    toolbar2.setTitle(this.f22617h);
                    toolbar2.setSubtitle(this.f22618i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f22612c) != null) {
                if ((i9 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f22619j);
            Toolbar toolbar = this.f22611a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f22621n);
            } else {
                toolbar.setNavigationContentDescription(this.f22619j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i9 = this.b;
        if ((i9 & 2) != 0) {
            if ((i9 & 1) != 0) {
                drawable = this.f22614e;
                if (drawable == null) {
                    drawable = this.f22613d;
                }
            } else {
                drawable = this.f22613d;
            }
        } else {
            drawable = null;
        }
        this.f22611a.setLogo(drawable);
    }
}
