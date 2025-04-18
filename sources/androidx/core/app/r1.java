package androidx.core.app;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class r1 {
    public static t1 a(Person person) {
        CharSequence name;
        Icon icon;
        IconCompat iconCompat;
        String uri;
        String key;
        boolean isBot;
        boolean isImportant;
        Icon icon2;
        s1 s1Var = new s1();
        name = person.getName();
        s1Var.a = name;
        icon = person.getIcon();
        if (icon != null) {
            icon2 = person.getIcon();
            PorterDuff.Mode mode = IconCompat.f1278k;
            iconCompat = h0.c.a(icon2);
        } else {
            iconCompat = null;
        }
        s1Var.f1244b = iconCompat;
        uri = person.getUri();
        s1Var.f1245c = uri;
        key = person.getKey();
        s1Var.f1246d = key;
        isBot = person.isBot();
        s1Var.f1247e = isBot;
        isImportant = person.isImportant();
        s1Var.f1248f = isImportant;
        return new t1(s1Var);
    }

    public static Person b(t1 t1Var) {
        Person.Builder name;
        Person.Builder icon;
        Person.Builder uri;
        Person.Builder key;
        Person.Builder bot;
        Person.Builder important;
        Person build;
        androidx.appcompat.widget.b1.r();
        name = androidx.appcompat.widget.b1.f().setName(t1Var.a);
        Icon icon2 = null;
        IconCompat iconCompat = t1Var.f1252b;
        if (iconCompat != null) {
            icon2 = h0.c.g(iconCompat, null);
        }
        icon = name.setIcon(icon2);
        uri = icon.setUri(t1Var.f1253c);
        key = uri.setKey(t1Var.f1254d);
        bot = key.setBot(t1Var.f1255e);
        important = bot.setImportant(t1Var.f1256f);
        build = important.build();
        return build;
    }
}
