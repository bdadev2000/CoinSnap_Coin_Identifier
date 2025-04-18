package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes.dex */
public final class TextFieldScrollerPosition$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldScrollerPosition$Companion$Saver$1 f6201a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
        Object[] objArr = new Object[2];
        objArr[0] = Float.valueOf(textFieldScrollerPosition.f6198a.c());
        objArr[1] = Boolean.valueOf(((Orientation) textFieldScrollerPosition.e.getValue()) == Orientation.f3394a);
        return f0.v(objArr);
    }
}
