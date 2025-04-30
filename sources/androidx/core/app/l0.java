package androidx.core.app;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class l0 {
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.core.app.m0, java.lang.Object] */
    public static m0 a(Person person) {
        IconCompat iconCompat;
        CharSequence name = person.getName();
        if (person.getIcon() != null) {
            Icon icon = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f4454k;
            iconCompat = M.c.a(icon);
        } else {
            iconCompat = null;
        }
        String uri = person.getUri();
        String key = person.getKey();
        boolean isBot = person.isBot();
        boolean isImportant = person.isImportant();
        ?? obj = new Object();
        obj.f4411a = name;
        obj.b = iconCompat;
        obj.f4412c = uri;
        obj.f4413d = key;
        obj.f4414e = isBot;
        obj.f4415f = isImportant;
        return obj;
    }

    public static Person b(m0 m0Var) {
        Person.Builder name = new Person.Builder().setName(m0Var.f4411a);
        Icon icon = null;
        IconCompat iconCompat = m0Var.b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = M.c.g(iconCompat, null);
        }
        return name.setIcon(icon).setUri(m0Var.f4412c).setKey(m0Var.f4413d).setBot(m0Var.f4414e).setImportant(m0Var.f4415f).build();
    }
}
