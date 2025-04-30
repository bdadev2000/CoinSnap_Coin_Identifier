package l0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import q4.C2645d;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f21545a;
    public final C2645d b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q4.d] */
    public e(KeyListener keyListener) {
        ?? obj = new Object();
        this.f21545a = keyListener;
        this.b = obj;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i9) {
        this.f21545a.clearMetaKeyState(view, editable, i9);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f21545a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i9, KeyEvent keyEvent) {
        boolean n2;
        boolean z8;
        this.b.getClass();
        if (i9 != 67) {
            if (i9 != 112) {
                n2 = false;
            } else {
                n2 = C.c.n(editable, keyEvent, true);
            }
        } else {
            n2 = C.c.n(editable, keyEvent, false);
        }
        if (n2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 && !this.f21545a.onKeyDown(view, editable, i9, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f21545a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.f21545a.onKeyUp(view, editable, i9, keyEvent);
    }
}
