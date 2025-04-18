package androidx.appcompat.widget;

import android.app.Person;
import android.graphics.drawable.AnimatedImageDrawable;
import android.text.PrecomputedText;
import android.text.Spannable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b1 {
    public static /* synthetic */ Person.Builder f() {
        return new Person.Builder();
    }

    public static /* bridge */ /* synthetic */ Person l(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ void r() {
    }

    public static /* bridge */ /* synthetic */ boolean x(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
