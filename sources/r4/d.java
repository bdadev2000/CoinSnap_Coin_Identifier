package r4;

import G7.j;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2816g;
import u7.AbstractC2818i;
import u7.C2824o;
import w4.C2869b0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f22842a = new Object();
    public static final d b = new Object();

    /* JADX WARN: Type inference failed for: r1v2, types: [w4.a0, java.lang.Object] */
    public static C2869b0 a(d dVar, String str, int i9, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        dVar.getClass();
        j.e(str, "processName");
        ?? obj = new Object();
        obj.f23814a = str;
        obj.b = i9;
        byte b8 = (byte) (obj.f23817e | 1);
        obj.f23815c = i10;
        obj.f23816d = false;
        obj.f23817e = (byte) (((byte) (b8 | 2)) | 4);
        return obj.a();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [w4.a0, java.lang.Object] */
    public static ArrayList d(Context context) {
        ActivityManager activityManager;
        j.e(context, "context");
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
            ?? obj = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj.f23814a = str2;
                obj.b = runningAppProcessInfo.pid;
                byte b8 = (byte) (obj.f23817e | 1);
                obj.f23815c = runningAppProcessInfo.importance;
                obj.f23817e = (byte) (b8 | 2);
                obj.f23816d = j.a(str2, str);
                obj.f23817e = (byte) (obj.f23817e | 4);
                arrayList2.add(obj.a());
            } else {
                throw new NullPointerException("Null processName");
            }
        }
        return arrayList2;
    }

    public boolean b(int i9) {
        if (4 > i9 && !Log.isLoggable("FirebaseCrashlytics", i9)) {
            return false;
        }
        return true;
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r4 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w4.E0 e(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            G7.j.e(r4, r0)
            int r0 = android.os.Process.myPid()
            java.util.ArrayList r4 = d(r4)
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.next()
            r2 = r1
            w4.E0 r2 = (w4.E0) r2
            w4.b0 r2 = (w4.C2869b0) r2
            int r2 = r2.b
            if (r2 != r0) goto L11
            goto L26
        L25:
            r1 = 0
        L26:
            w4.E0 r1 = (w4.E0) r1
            if (r1 != 0) goto L4e
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L3a
            java.lang.String r4 = M3.c.k()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            G7.j.d(r4, r1)
            goto L47
        L3a:
            r1 = 28
            java.lang.String r2 = ""
            if (r4 < r1) goto L46
            java.lang.String r4 = com.google.android.gms.ads.internal.util.a.f()
            if (r4 != 0) goto L47
        L46:
            r4 = r2
        L47:
            r1 = 12
            r2 = 0
            w4.b0 r1 = a(r3, r4, r0, r2, r1)
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.d.e(android.content.Context):w4.E0");
    }

    public void f(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
