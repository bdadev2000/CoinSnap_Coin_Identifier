package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422x {

    /* renamed from: a, reason: collision with root package name */
    public final String f4441a;
    public final CharSequence b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4442c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4443d;

    public C0422x(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel c9 = V1.a.c(it.next());
            if (this.f4441a.equals(AbstractC0420v.c(c9))) {
                arrayList.add(new C0419u(c9));
            }
        }
        return arrayList;
    }

    public C0422x(NotificationChannelGroup notificationChannelGroup, List list) {
        String d2 = AbstractC0420v.d(notificationChannelGroup);
        this.f4443d = Collections.emptyList();
        d2.getClass();
        this.f4441a = d2;
        this.b = AbstractC0420v.e(notificationChannelGroup);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            this.f4442c = AbstractC0421w.a(notificationChannelGroup);
        }
        if (i9 >= 28) {
            AbstractC0421w.b(notificationChannelGroup);
            a(AbstractC0420v.b(notificationChannelGroup));
        } else {
            a(list);
        }
    }
}
