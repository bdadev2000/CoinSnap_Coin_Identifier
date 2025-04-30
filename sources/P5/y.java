package p5;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2816g;
import u7.AbstractC2818i;
import u7.C2824o;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final h0.f f22368a = new h0.f("session_id");

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        G7.j.e(context, "context");
        int i9 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = C2824o.b;
        }
        ArrayList J8 = AbstractC2816g.J(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = J8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i9) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            G7.j.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C2567s(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, G7.j.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }
}
