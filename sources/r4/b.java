package r4;

import B3.g;
import G7.j;
import U4.CallableC0313i;
import U4.y;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import n1.C2475f;
import o5.AbstractC2510e;
import o5.C2508c;
import o5.C2509d;
import u7.AbstractC2818i;
import v4.C2850b;
import v4.m;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final z4.c f22839a;

    public b(z4.c cVar) {
        this.f22839a = cVar;
    }

    public final void a(C2509d c2509d) {
        String str;
        z4.c cVar = this.f22839a;
        Set set = c2509d.f21985a;
        j.d(set, "rolloutsState.rolloutAssignments");
        Set set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC2818i.E(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            C2508c c2508c = (C2508c) ((AbstractC2510e) it.next());
            String str2 = c2508c.b;
            String str3 = c2508c.f21982d;
            String str4 = c2508c.f21983e;
            String str5 = c2508c.f21981c;
            long j7 = c2508c.f21984f;
            C2475f c2475f = m.f23630a;
            if (str4.length() > 256) {
                str = str4.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                str = str4;
            }
            arrayList.add(new C2850b(str2, str3, str, str5, j7));
        }
        synchronized (((g) cVar.f24549f)) {
            try {
                if (((g) cVar.f24549f).h(arrayList)) {
                    ((y) cVar.f24546c).k(new CallableC0313i(7, cVar, ((g) cVar.f24549f).e()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
