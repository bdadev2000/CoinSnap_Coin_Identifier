package e1;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class a extends ka.e {

    /* renamed from: d, reason: collision with root package name */
    public final EditText f17067d;

    /* renamed from: f, reason: collision with root package name */
    public final k f17068f;

    public a(EditText editText) {
        this.f17067d = editText;
        k kVar = new k(editText);
        this.f17068f = kVar;
        editText.addTextChangedListener(kVar);
        if (c.f17072b == null) {
            synchronized (c.a) {
                if (c.f17072b == null) {
                    c.f17072b = new c();
                }
            }
        }
        editText.setEditableFactory(c.f17072b);
    }

    @Override // ka.e
    public final KeyListener j(KeyListener keyListener) {
        if (keyListener instanceof g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new g(keyListener);
    }

    @Override // ka.e
    public final InputConnection q(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection instanceof d) {
            return inputConnection;
        }
        return new d(this.f17067d, inputConnection, editorInfo);
    }

    @Override // ka.e
    public final void t(boolean z10) {
        k kVar = this.f17068f;
        if (kVar.f17085f != z10) {
            if (kVar.f17084d != null) {
                androidx.emoji2.text.l a = androidx.emoji2.text.l.a();
                j jVar = kVar.f17084d;
                a.getClass();
                com.bumptech.glide.e.l(jVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.f1505b.remove(jVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f17085f = z10;
            if (z10) {
                k.a(kVar.f17082b, androidx.emoji2.text.l.a().b());
            }
        }
    }
}
