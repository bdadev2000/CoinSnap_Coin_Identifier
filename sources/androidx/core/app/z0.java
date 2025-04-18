package androidx.core.app;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class z0 {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        Notification.Builder addPerson;
        addPerson = builder.addPerson(person);
        return addPerson;
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
        Notification.Action.Builder semanticAction;
        semanticAction = builder.setSemanticAction(i10);
        return semanticAction;
    }
}
