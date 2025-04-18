package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class EmojiEditTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final HelperInternal19 f19589a;

    /* loaded from: classes2.dex */
    public static class HelperInternal {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class HelperInternal19 extends HelperInternal {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f19590a;

        /* renamed from: b, reason: collision with root package name */
        public final EmojiTextWatcher f19591b;

        public HelperInternal19(EditText editText) {
            this.f19590a = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText);
            this.f19591b = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            if (EmojiEditableFactory.f19593b == null) {
                synchronized (EmojiEditableFactory.f19592a) {
                    try {
                        if (EmojiEditableFactory.f19593b == null) {
                            Editable.Factory factory = new Editable.Factory();
                            try {
                                EmojiEditableFactory.f19594c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, EmojiEditableFactory.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            EmojiEditableFactory.f19593b = factory;
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(EmojiEditableFactory.f19593b);
        }
    }

    public EmojiEditTextHelper(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f19589a = new HelperInternal19(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        this.f19589a.getClass();
        if (keyListener instanceof EmojiKeyListener) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
    }

    public final boolean b() {
        return this.f19589a.f19591b.d;
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        HelperInternal19 helperInternal19 = this.f19589a;
        helperInternal19.getClass();
        return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(helperInternal19.f19590a, inputConnection, editorInfo);
    }

    public final void d(boolean z2) {
        EmojiTextWatcher emojiTextWatcher = this.f19589a.f19591b;
        if (emojiTextWatcher.d != z2) {
            if (emojiTextWatcher.f19610c != null) {
                EmojiCompat a2 = EmojiCompat.a();
                EmojiCompat.InitCallback initCallback = emojiTextWatcher.f19610c;
                a2.getClass();
                Preconditions.d(initCallback, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f19505a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f19506b.remove(initCallback);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            emojiTextWatcher.d = z2;
            if (z2) {
                EmojiTextWatcher.a(emojiTextWatcher.f19608a, EmojiCompat.a().d());
            }
        }
    }
}
