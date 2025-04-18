package h;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.List;
import n0.r1;

/* loaded from: classes.dex */
public final class a0 implements Window.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f18511b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18512c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18513d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f18515g;

    public a0(g0 g0Var, Window.Callback callback) {
        this.f18515g = g0Var;
        if (callback != null) {
            this.f18511b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f18512c = true;
            callback.onContentChanged();
        } finally {
            this.f18512c = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18511b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.f18511b.dispatchKeyEvent(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        return this.f18511b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f18513d) {
            return this.f18511b.dispatchKeyEvent(keyEvent);
        }
        if (!this.f18515g.v(keyEvent) && !c(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.d(r7)
            r1 = 1
            if (r0 != 0) goto L6e
            int r0 = r7.getKeyCode()
            h.g0 r2 = r6.f18515g
            r2.C()
            h.w0 r3 = r2.f18585q
            r4 = 0
            if (r3 == 0) goto L3b
            h.v0 r3 = r3.f18686o
            if (r3 != 0) goto L1a
            goto L37
        L1a:
            k.o r3 = r3.f18671f
            if (r3 == 0) goto L37
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L2e
            r5 = r1
            goto L2f
        L2e:
            r5 = r4
        L2f:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
            goto L38
        L37:
            r0 = r4
        L38:
            if (r0 == 0) goto L3b
            goto L67
        L3b:
            h.f0 r0 = r2.O
            if (r0 == 0) goto L50
            int r3 = r7.getKeyCode()
            boolean r0 = r2.G(r0, r3, r7)
            if (r0 == 0) goto L50
            h.f0 r7 = r2.O
            if (r7 == 0) goto L67
            r7.f18562l = r1
            goto L67
        L50:
            h.f0 r0 = r2.O
            if (r0 != 0) goto L69
            h.f0 r0 = r2.A(r4)
            r2.H(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.G(r0, r3, r7)
            r0.f18561k = r4
            if (r7 == 0) goto L69
        L67:
            r7 = r1
            goto L6a
        L69:
            r7 = r4
        L6a:
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18511b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18511b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18511b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18511b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18511b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f18511b.onAttachedToWindow();
    }

    public final boolean k(int i10, Menu menu) {
        return this.f18511b.onCreatePanelMenu(i10, menu);
    }

    public final View l(int i10) {
        return this.f18511b.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f18511b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f18511b.onMenuItemSelected(i10, menuItem);
    }

    public final boolean o(int i10, Menu menu) {
        return this.f18511b.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f18512c) {
            this.f18511b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof k.o)) {
            return false;
        }
        return k(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return l(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        o(i10, menu);
        g0 g0Var = this.f18515g;
        if (i10 == 108) {
            g0Var.C();
            w0 w0Var = g0Var.f18585q;
            if (w0Var != null && true != w0Var.f18689r) {
                w0Var.f18689r = true;
                ArrayList arrayList = w0Var.f18690s;
                if (arrayList.size() > 0) {
                    a4.j.t(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            g0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f18514f) {
            this.f18511b.onPanelClosed(i10, menu);
            return;
        }
        p(i10, menu);
        g0 g0Var = this.f18515g;
        if (i10 == 108) {
            g0Var.C();
            w0 w0Var = g0Var.f18585q;
            if (w0Var != null && w0Var.f18689r) {
                w0Var.f18689r = false;
                ArrayList arrayList = w0Var.f18690s;
                if (arrayList.size() > 0) {
                    a4.j.t(arrayList.get(0));
                    throw null;
                }
                return;
            }
            return;
        }
        if (i10 == 0) {
            f0 A = g0Var.A(i10);
            if (A.f18563m) {
                g0Var.t(A, false);
                return;
            }
            return;
        }
        g0Var.getClass();
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        k.o oVar;
        if (menu instanceof k.o) {
            oVar = (k.o) menu;
        } else {
            oVar = null;
        }
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f20146x = true;
        }
        boolean r6 = r(i10, view, menu);
        if (oVar != null) {
            oVar.f20146x = false;
        }
        return r6;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        k.o oVar = this.f18515g.A(0).f18558h;
        if (oVar != null) {
            s(list, oVar, i10);
        } else {
            s(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final void p(int i10, Menu menu) {
        this.f18511b.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z10) {
        j.p.a(this.f18511b, z10);
    }

    public final boolean r(int i10, View view, Menu menu) {
        return this.f18511b.onPreparePanel(i10, view, menu);
    }

    public final void s(List list, Menu menu, int i10) {
        j.o.a(this.f18511b, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested() {
        return this.f18511b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return j.n.a(this.f18511b, searchEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18511b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z10) {
        this.f18511b.onWindowFocusChanged(z10);
    }

    public final ActionMode x(ActionMode.Callback callback, int i10) {
        return j.n.b(this.f18511b, callback, i10);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        ViewGroup viewGroup;
        g0 g0Var = this.f18515g;
        g0Var.getClass();
        if (i10 != 0) {
            return x(callback, i10);
        }
        s2.h hVar = new s2.h(g0Var.f18581m, callback);
        j.c cVar = g0Var.f18590w;
        if (cVar != null) {
            cVar.a();
        }
        w wVar = new w(g0Var, hVar);
        g0Var.C();
        w0 w0Var = g0Var.f18585q;
        n nVar = g0Var.f18584p;
        if (w0Var != null) {
            v0 v0Var = w0Var.f18686o;
            if (v0Var != null) {
                v0Var.a();
            }
            w0Var.f18680i.setHideOnContentScrollEnabled(false);
            w0Var.f18683l.e();
            v0 v0Var2 = new v0(w0Var, w0Var.f18683l.getContext(), wVar);
            k.o oVar = v0Var2.f18671f;
            oVar.w();
            try {
                if (v0Var2.f18672g.d(v0Var2, oVar)) {
                    w0Var.f18686o = v0Var2;
                    v0Var2.h();
                    w0Var.f18683l.c(v0Var2);
                    w0Var.E(true);
                } else {
                    v0Var2 = null;
                }
                g0Var.f18590w = v0Var2;
                if (v0Var2 != null && nVar != null) {
                    nVar.c();
                }
            } finally {
                oVar.v();
            }
        }
        if (g0Var.f18590w == null) {
            r1 r1Var = g0Var.A;
            if (r1Var != null) {
                r1Var.b();
            }
            j.c cVar2 = g0Var.f18590w;
            if (cVar2 != null) {
                cVar2.a();
            }
            if (nVar != null && !g0Var.S) {
                try {
                    nVar.a();
                } catch (AbstractMethodError unused) {
                }
            }
            if (g0Var.f18591x == null) {
                boolean z10 = g0Var.K;
                Context context = g0Var.f18581m;
                if (z10) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        j.f fVar = new j.f(context, 0);
                        fVar.getTheme().setTo(newTheme);
                        context = fVar;
                    }
                    g0Var.f18591x = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    g0Var.f18592y = popupWindow;
                    t0.l.d(popupWindow, 2);
                    g0Var.f18592y.setContentView(g0Var.f18591x);
                    g0Var.f18592y.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    g0Var.f18591x.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    g0Var.f18592y.setHeight(-2);
                    g0Var.f18593z = new t(g0Var, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) g0Var.C.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        g0Var.C();
                        w0 w0Var2 = g0Var.f18585q;
                        Context F = w0Var2 != null ? w0Var2.F() : null;
                        if (F != null) {
                            context = F;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        g0Var.f18591x = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (g0Var.f18591x != null) {
                r1 r1Var2 = g0Var.A;
                if (r1Var2 != null) {
                    r1Var2.b();
                }
                g0Var.f18591x.e();
                j.g gVar = new j.g(g0Var.f18591x.getContext(), g0Var.f18591x, wVar);
                if (wVar.d(gVar, gVar.f19667j)) {
                    gVar.h();
                    g0Var.f18591x.c(gVar);
                    g0Var.f18590w = gVar;
                    if (g0Var.B && (viewGroup = g0Var.C) != null && ViewCompat.isLaidOut(viewGroup)) {
                        g0Var.f18591x.setAlpha(0.0f);
                        r1 animate = ViewCompat.animate(g0Var.f18591x);
                        animate.a(1.0f);
                        g0Var.A = animate;
                        animate.d(new v(g0Var, 1));
                    } else {
                        g0Var.f18591x.setAlpha(1.0f);
                        g0Var.f18591x.setVisibility(0);
                        if (g0Var.f18591x.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) g0Var.f18591x.getParent());
                        }
                    }
                    if (g0Var.f18592y != null) {
                        g0Var.f18582n.getDecorView().post(g0Var.f18593z);
                    }
                } else {
                    g0Var.f18590w = null;
                }
            }
            if (g0Var.f18590w != null && nVar != null) {
                nVar.c();
            }
            g0Var.J();
            g0Var.f18590w = g0Var.f18590w;
        }
        g0Var.J();
        j.c cVar3 = g0Var.f18590w;
        if (cVar3 != null) {
            return hVar.n(cVar3);
        }
        return null;
    }
}
