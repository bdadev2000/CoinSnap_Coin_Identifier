package k;

import T.C0275i0;
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
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;
import java.util.List;
import p.MenuC2533l;

/* loaded from: classes.dex */
public final class s implements Window.Callback {
    public final Window.Callback b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21322d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f21324g;

    public s(w wVar, Window.Callback callback) {
        this.f21324g = wVar;
        if (callback != null) {
            this.b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f21321c = true;
            callback.onContentChanged();
        } finally {
            this.f21321c = false;
        }
    }

    public final boolean b(int i9, Menu menu) {
        return this.b.onMenuOpened(i9, menu);
    }

    public final void c(int i9, Menu menu) {
        this.b.onPanelClosed(i9, menu);
    }

    public final void d(List list, Menu menu, int i9) {
        o.m.a(this.b, list, menu, i9);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f21322d;
        Window.Callback callback = this.b;
        if (z8) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f21324g.u(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.b
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            k.w r2 = r6.f21324g
            r2.A()
            k.H r3 = r2.f21381q
            r4 = 0
            if (r3 == 0) goto L3d
            k.G r3 = r3.f21247k
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            p.l r3 = r3.f21233f
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            k.v r0 = r2.O
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L52
            k.v r7 = r2.O
            if (r7 == 0) goto L3b
            r7.l = r1
            goto L3b
        L52:
            k.v r0 = r2.O
            if (r0 != 0) goto L6a
            k.v r0 = r2.z(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f21338k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f21321c) {
            this.b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i9, Menu menu) {
        if (i9 == 0 && !(menu instanceof MenuC2533l)) {
            return false;
        }
        return this.b.onCreatePanelMenu(i9, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i9) {
        return this.b.onCreatePanelView(i9);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        return this.b.onMenuItemSelected(i9, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i9, Menu menu) {
        b(i9, menu);
        w wVar = this.f21324g;
        if (i9 == 108) {
            wVar.A();
            C2411H c2411h = wVar.f21381q;
            if (c2411h != null && true != c2411h.f21248n) {
                c2411h.f21248n = true;
                ArrayList arrayList = c2411h.f21249o;
                if (arrayList.size() > 0) {
                    com.mbridge.msdk.foundation.entity.o.v(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            wVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i9, Menu menu) {
        if (this.f21323f) {
            this.b.onPanelClosed(i9, menu);
            return;
        }
        c(i9, menu);
        w wVar = this.f21324g;
        if (i9 == 108) {
            wVar.A();
            C2411H c2411h = wVar.f21381q;
            if (c2411h != null && c2411h.f21248n) {
                c2411h.f21248n = false;
                ArrayList arrayList = c2411h.f21249o;
                if (arrayList.size() > 0) {
                    com.mbridge.msdk.foundation.entity.o.v(arrayList.get(0));
                    throw null;
                }
                return;
            }
            return;
        }
        if (i9 == 0) {
            v z8 = wVar.z(i9);
            if (z8.m) {
                wVar.s(z8, false);
                return;
            }
            return;
        }
        wVar.getClass();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z8) {
        o.n.a(this.b, z8);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i9, View view, Menu menu) {
        MenuC2533l menuC2533l;
        if (menu instanceof MenuC2533l) {
            menuC2533l = (MenuC2533l) menu;
        } else {
            menuC2533l = null;
        }
        if (i9 == 0 && menuC2533l == null) {
            return false;
        }
        if (menuC2533l != null) {
            menuC2533l.f22122z = true;
        }
        boolean onPreparePanel = this.b.onPreparePanel(i9, view, menu);
        if (menuC2533l != null) {
            menuC2533l.f22122z = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i9) {
        MenuC2533l menuC2533l = this.f21324g.z(0).f21335h;
        if (menuC2533l != null) {
            d(list, menuC2533l, i9);
        } else {
            d(list, menu, i9);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return o.l.a(this.b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z8) {
        this.b.onWindowFocusChanged(z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [b1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [o.b, o.e, java.lang.Object, p.j] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i9) {
        ViewGroup viewGroup;
        w wVar = this.f21324g;
        wVar.getClass();
        if (i9 != 0) {
            return o.l.b(this.b, callback, i9);
        }
        Context context = wVar.m;
        ?? obj = new Object();
        obj.f5270c = context;
        obj.b = callback;
        obj.f5271d = new ArrayList();
        obj.f5272f = new x.l();
        o.b bVar = wVar.f21387w;
        if (bVar != null) {
            bVar.a();
        }
        a7.b bVar2 = new a7.b(25, wVar, obj, false);
        wVar.A();
        C2411H c2411h = wVar.f21381q;
        if (c2411h != null) {
            C2410G c2410g = c2411h.f21247k;
            if (c2410g != null) {
                c2410g.a();
            }
            c2411h.f21241e.setHideOnContentScrollEnabled(false);
            c2411h.f21244h.e();
            C2410G c2410g2 = new C2410G(c2411h, c2411h.f21244h.getContext(), bVar2);
            MenuC2533l menuC2533l = c2410g2.f21233f;
            menuC2533l.w();
            try {
                if (c2410g2.f21234g.e(c2410g2, menuC2533l)) {
                    c2411h.f21247k = c2410g2;
                    c2410g2.i();
                    c2411h.f21244h.c(c2410g2);
                    c2411h.y(true);
                } else {
                    c2410g2 = null;
                }
                wVar.f21387w = c2410g2;
            } finally {
                menuC2533l.v();
            }
        }
        if (wVar.f21387w == null) {
            C0275i0 c0275i0 = wVar.f21345A;
            if (c0275i0 != null) {
                c0275i0.b();
            }
            o.b bVar3 = wVar.f21387w;
            if (bVar3 != null) {
                bVar3.a();
            }
            if (wVar.f21380p != null) {
                boolean z8 = wVar.f21362S;
            }
            if (wVar.f21388x == null) {
                boolean z9 = wVar.f21355K;
                Context context2 = wVar.m;
                if (z9) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        o.d dVar = new o.d(context2, 0);
                        dVar.getTheme().setTo(newTheme);
                        context2 = dVar;
                    }
                    wVar.f21388x = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    wVar.f21389y = popupWindow;
                    Z.l.d(popupWindow, 2);
                    wVar.f21389y.setContentView(wVar.f21388x);
                    wVar.f21389y.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    wVar.f21388x.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    wVar.f21389y.setHeight(-2);
                    wVar.f21390z = new RunnableC2423l(wVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) wVar.f21347C.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        wVar.A();
                        C2411H c2411h2 = wVar.f21381q;
                        Context z10 = c2411h2 != null ? c2411h2.z() : null;
                        if (z10 != null) {
                            context2 = z10;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        wVar.f21388x = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (wVar.f21388x != null) {
                C0275i0 c0275i02 = wVar.f21345A;
                if (c0275i02 != null) {
                    c0275i02.b();
                }
                wVar.f21388x.e();
                Context context3 = wVar.f21388x.getContext();
                ActionBarContextView actionBarContextView = wVar.f21388x;
                ?? obj2 = new Object();
                obj2.f21877d = context3;
                obj2.f21878f = actionBarContextView;
                obj2.f21879g = bVar2;
                MenuC2533l menuC2533l2 = new MenuC2533l(actionBarContextView.getContext());
                menuC2533l2.f22110n = 1;
                obj2.f21882j = menuC2533l2;
                menuC2533l2.f22105g = obj2;
                if (((o.a) bVar2.f4077c).e(obj2, menuC2533l2)) {
                    obj2.i();
                    wVar.f21388x.c(obj2);
                    wVar.f21387w = obj2;
                    if (wVar.f21346B && (viewGroup = wVar.f21347C) != null && viewGroup.isLaidOut()) {
                        wVar.f21388x.setAlpha(0.0f);
                        C0275i0 animate = ViewCompat.animate(wVar.f21388x);
                        animate.a(1.0f);
                        wVar.f21345A = animate;
                        animate.d(new C2425n(wVar, 1));
                    } else {
                        wVar.f21388x.setAlpha(1.0f);
                        wVar.f21388x.setVisibility(0);
                        if (wVar.f21388x.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) wVar.f21388x.getParent());
                        }
                    }
                    if (wVar.f21389y != null) {
                        wVar.f21378n.getDecorView().post(wVar.f21390z);
                    }
                } else {
                    wVar.f21387w = null;
                }
            }
            wVar.H();
            wVar.f21387w = wVar.f21387w;
        }
        wVar.H();
        o.b bVar4 = wVar.f21387w;
        if (bVar4 != null) {
            return obj.i(bVar4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
