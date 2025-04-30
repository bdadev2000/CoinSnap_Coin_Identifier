package l0;

import android.text.Editable;
import j0.t;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2435a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f21540a = new Object();
    public static volatile C2435a b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f21541c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f21541c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
