package n0;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public abstract class o0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f22335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22337d;

    public o0(int i10, Class cls, int i11, int i12) {
        this.a = i10;
        this.f22335b = cls;
        this.f22337d = i11;
        this.f22336c = i12;
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        boolean z10;
        boolean z11;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return true;
        }
        return false;
    }

    public final Object b(View view) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= this.f22336c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m0 m0Var = (m0) this;
            int i10 = m0Var.f22319e;
            switch (i10) {
                case 0:
                    return m0Var.d(view);
                case 1:
                    switch (i10) {
                        case 1:
                            return y0.b(view);
                        default:
                            return a1.b(view);
                    }
                case 2:
                    switch (i10) {
                        case 1:
                            return y0.b(view);
                        default:
                            return a1.b(view);
                    }
                default:
                    return m0Var.d(view);
            }
        }
        Object tag = view.getTag(this.a);
        if (this.f22335b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void c(View view, Object obj) {
        boolean z10;
        boolean a;
        if (Build.VERSION.SDK_INT >= this.f22336c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i10 = ((m0) this).f22319e;
            switch (i10) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            y0.j(view, bool.booleanValue());
                            return;
                        default:
                            y0.g(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            y0.h(view, charSequence);
                            return;
                        default:
                            a1.f(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i10) {
                        case 1:
                            y0.h(view, charSequence2);
                            return;
                        default:
                            a1.f(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i10) {
                        case 0:
                            y0.j(view, bool2.booleanValue());
                            return;
                        default:
                            y0.g(view, bool2.booleanValue());
                            return;
                    }
            }
        }
        Object b3 = b(view);
        int i11 = ((m0) this).f22319e;
        switch (i11) {
            case 0:
                Boolean bool3 = (Boolean) b3;
                Boolean bool4 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        a = a(bool3, bool4);
                        break;
                    default:
                        a = a(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) b3;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        a = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        a = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) b3;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i11) {
                    case 1:
                        a = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        a = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) b3;
                Boolean bool6 = (Boolean) obj;
                switch (i11) {
                    case 0:
                        a = a(bool5, bool6);
                        break;
                    default:
                        a = a(bool5, bool6);
                        break;
                }
        }
        if (!a) {
            ViewCompat.ensureAccessibilityDelegateCompat(view);
            view.setTag(this.a, obj);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, this.f22337d);
        }
    }
}
