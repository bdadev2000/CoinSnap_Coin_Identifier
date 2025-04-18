package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
final class EmojiKeyListener implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f19601a;

    /* renamed from: b, reason: collision with root package name */
    public final EmojiCompatHandleKeyDownHelper f19602b;

    /* loaded from: classes.dex */
    public static class EmojiCompatHandleKeyDownHelper {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.emoji2.viewsintegration.EmojiKeyListener$EmojiCompatHandleKeyDownHelper, java.lang.Object] */
    public EmojiKeyListener(KeyListener keyListener) {
        ?? obj = new Object();
        this.f19601a = keyListener;
        this.f19602b = obj;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f19601a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f19601a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        this.f19602b.getClass();
        return EmojiCompat.f(editable, i2, keyEvent) || this.f19601a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f19601a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f19601a.onKeyUp(view, editable, i2, keyEvent);
    }
}
