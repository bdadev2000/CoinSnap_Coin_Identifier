package p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import k.DialogInterfaceC2416e;

/* renamed from: p.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC2534m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public MenuC2533l b;

    /* renamed from: c, reason: collision with root package name */
    public DialogInterfaceC2416e f22123c;

    /* renamed from: d, reason: collision with root package name */
    public C2529h f22124d;

    @Override // p.w
    public final void b(MenuC2533l menuC2533l, boolean z8) {
        DialogInterfaceC2416e dialogInterfaceC2416e;
        if ((z8 || menuC2533l == this.b) && (dialogInterfaceC2416e = this.f22123c) != null) {
            dialogInterfaceC2416e.dismiss();
        }
    }

    @Override // p.w
    public final boolean g(MenuC2533l menuC2533l) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        C2529h c2529h = this.f22124d;
        if (c2529h.f22095h == null) {
            c2529h.f22095h = new C2528g(c2529h);
        }
        this.b.q(c2529h.f22095h.getItem(i9), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f22124d.b(this.b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC2533l menuC2533l = this.b;
        if (i9 == 82 || i9 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f22123c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f22123c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC2533l.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC2533l.performShortcut(i9, keyEvent, 0);
    }
}
