package androidx.core.app;

import android.app.Notification;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class V {
    public static Notification.Builder a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, int i9) {
        return builder.setSemanticAction(i9);
    }
}
