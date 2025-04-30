package q4;

import G7.j;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import i8.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2818i;
import v4.InterfaceC2851c;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2643b implements Continuation, InterfaceC2851c {
    public final /* synthetic */ int b;

    public /* synthetic */ C2643b(int i9) {
        this.b = i9;
    }

    public static ArrayList d(List list) {
        j.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((A) obj) != A.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2818i.E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((A) it.next()).b);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w8.f] */
    public static byte[] e(List list) {
        j.e(list, "protocols");
        ?? obj = new Object();
        Iterator it = d(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.n(str.length());
            obj.u(str);
        }
        return obj.readByteArray(obj.f24014c);
    }

    public static boolean f() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // v4.InterfaceC2851c
    public String b() {
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.b) {
            case 0:
                if (!task.isSuccessful()) {
                    Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // v4.InterfaceC2851c
    public void a() {
    }

    @Override // v4.InterfaceC2851c
    public void c(long j7, String str) {
    }
}
