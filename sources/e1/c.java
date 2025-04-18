package e1;

import android.text.Editable;
import androidx.emoji2.text.a0;

/* loaded from: classes.dex */
public final class c extends Editable.Factory {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f17072b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f17073c;

    public c() {
        try {
            f17073c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f17073c;
        if (cls != null) {
            return new a0(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
