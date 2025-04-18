package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1173c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1174d;

    public a0(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel j3 = s.j(it.next());
            if (this.a.equals(y.c(j3))) {
                arrayList.add(new x(j3));
            }
        }
        return arrayList;
    }

    public a0(NotificationChannelGroup notificationChannelGroup, List list) {
        String d10 = y.d(notificationChannelGroup);
        this.f1174d = Collections.emptyList();
        d10.getClass();
        this.a = d10;
        this.f1172b = y.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f1173c = z.a(notificationChannelGroup);
        }
        if (i10 >= 28) {
            z.b(notificationChannelGroup);
            this.f1174d = a(y.b(notificationChannelGroup));
        } else {
            this.f1174d = a(list);
        }
    }
}
