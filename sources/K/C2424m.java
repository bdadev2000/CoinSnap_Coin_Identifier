package k;

import T.G0;
import T.InterfaceC0292x;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransaction;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.lang.reflect.Method;
import p.MenuC2533l;
import q.f1;
import q.g1;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2424m implements InterfaceC0292x, p.w {
    public final /* synthetic */ w b;

    public /* synthetic */ C2424m(w wVar) {
        this.b = wVar;
    }

    @Override // p.w
    public void b(MenuC2533l menuC2533l, boolean z8) {
        boolean z9;
        int i9;
        v vVar;
        MenuC2533l k6 = menuC2533l.k();
        int i10 = 0;
        if (k6 != menuC2533l) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            menuC2533l = k6;
        }
        w wVar = this.b;
        v[] vVarArr = wVar.f21358N;
        if (vVarArr != null) {
            i9 = vVarArr.length;
        } else {
            i9 = 0;
        }
        while (true) {
            if (i10 < i9) {
                vVar = vVarArr[i10];
                if (vVar != null && vVar.f21335h == menuC2533l) {
                    break;
                } else {
                    i10++;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar != null) {
            if (z9) {
                wVar.q(vVar.f21329a, vVar, k6);
                wVar.s(vVar, true);
            } else {
                wVar.s(vVar, z8);
            }
        }
    }

    @Override // p.w
    public boolean g(MenuC2533l menuC2533l) {
        Window.Callback callback;
        if (menuC2533l == menuC2533l.k()) {
            w wVar = this.b;
            if (wVar.f21352H && (callback = wVar.f21378n.getCallback()) != null && !wVar.f21362S) {
                callback.onMenuOpened(108, menuC2533l);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // T.InterfaceC0292x
    public G0 j(View view, G0 g02) {
        boolean z8;
        View view2;
        G0 g03;
        int b;
        int c9;
        boolean z9;
        int color;
        int d2 = g02.d();
        w wVar = this.b;
        wVar.getClass();
        int d9 = g02.d();
        ActionBarContextView actionBarContextView = wVar.f21388x;
        int i9 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wVar.f21388x.getLayoutParams();
            boolean z10 = true;
            if (wVar.f21388x.isShown()) {
                if (wVar.f21374e0 == null) {
                    wVar.f21374e0 = new Rect();
                    wVar.f0 = new Rect();
                }
                Rect rect = wVar.f21374e0;
                Rect rect2 = wVar.f0;
                rect.set(g02.b(), g02.d(), g02.c(), g02.a());
                ViewGroup viewGroup = wVar.f21347C;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z11 = g1.f22657a;
                    f1.a(viewGroup, rect, rect2);
                } else {
                    if (!g1.f22657a) {
                        g1.f22657a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g1.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g1.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g1.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e4) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                G0 rootWindowInsets = ViewCompat.getRootWindowInsets(wVar.f21347C);
                if (rootWindowInsets == null) {
                    b = 0;
                } else {
                    b = rootWindowInsets.b();
                }
                if (rootWindowInsets == null) {
                    c9 = 0;
                } else {
                    c9 = rootWindowInsets.c();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z9 = true;
                }
                Context context = wVar.m;
                if (i10 > 0 && wVar.f21349E == null) {
                    View view3 = new View(context);
                    wVar.f21349E = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c9;
                    wVar.f21347C.addView(wVar.f21349E, -1, layoutParams);
                } else {
                    View view4 = wVar.f21349E;
                    if (view4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c9) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c9;
                            wVar.f21349E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view5 = wVar.f21349E;
                if (view5 == null) {
                    z10 = false;
                }
                if (z10 && view5.getVisibility() != 0) {
                    View view6 = wVar.f21349E;
                    if ((ViewCompat.getWindowSystemUiVisibility(view6) & FragmentTransaction.TRANSIT_EXIT_MASK) != 0) {
                        color = I.h.getColor(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = I.h.getColor(context, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(color);
                }
                if (!wVar.f21354J && z10) {
                    d9 = 0;
                }
                z8 = z10;
                z10 = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                z10 = false;
            }
            if (z10) {
                wVar.f21388x.setLayoutParams(marginLayoutParams);
            }
        } else {
            z8 = false;
        }
        View view7 = wVar.f21349E;
        if (view7 != null) {
            if (!z8) {
                i9 = 8;
            }
            view7.setVisibility(i9);
        }
        if (d2 != d9) {
            g03 = g02.f(g02.b(), d9, g02.c(), g02.a());
            view2 = view;
        } else {
            view2 = view;
            g03 = g02;
        }
        return ViewCompat.onApplyWindowInsets(view2, g03);
    }
}
