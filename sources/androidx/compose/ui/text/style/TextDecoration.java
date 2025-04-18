package androidx.compose.ui.text.style;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;

@Immutable
/* loaded from: classes2.dex */
public final class TextDecoration {

    /* renamed from: b, reason: collision with root package name */
    public static final TextDecoration f17464b = new TextDecoration(0);

    /* renamed from: c, reason: collision with root package name */
    public static final TextDecoration f17465c = new TextDecoration(1);
    public static final TextDecoration d = new TextDecoration(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f17466a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public TextDecoration(int i2) {
        this.f17466a = i2;
    }

    public final boolean a(TextDecoration textDecoration) {
        int i2 = this.f17466a;
        return (textDecoration.f17466a | i2) == i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextDecoration) {
            return this.f17466a == ((TextDecoration) obj).f17466a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17466a;
    }

    public final String toString() {
        int i2 = this.f17466a;
        if (i2 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return d.q(new StringBuilder("TextDecoration["), ListUtilsKt.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
