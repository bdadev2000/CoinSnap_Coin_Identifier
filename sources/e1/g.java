package e1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.t;

/* loaded from: classes.dex */
public final class g implements KeyListener {
    public final KeyListener a;

    /* renamed from: b, reason: collision with root package name */
    public final ka.e f17077b;

    public g(KeyListener keyListener) {
        ka.e eVar = new ka.e();
        this.a = keyListener;
        this.f17077b = eVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean c10;
        boolean z10;
        this.f17077b.getClass();
        Object obj = androidx.emoji2.text.l.f1503i;
        if (i10 != 67) {
            if (i10 != 112) {
                c10 = false;
            } else {
                c10 = t.c(editable, keyEvent, true);
            }
        } else {
            c10 = t.c(editable, keyEvent, false);
        }
        if (c10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && !this.a.onKeyDown(view, editable, i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i10, keyEvent);
    }
}
