package X3;

import J1.r;
import Y3.i;
import Y3.j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e extends Y3.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3668c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3669d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, TaskCompletionSource taskCompletionSource, Object obj2, int i9) {
        super(taskCompletionSource);
        this.f3668c = i9;
        this.f3670f = obj;
        this.f3669d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, Y3.e] */
    @Override // Y3.f
    public final void a() {
        Y3.e cVar;
        Object obj = this.f3669d;
        Object obj2 = this.f3670f;
        switch (this.f3668c) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                g gVar = (g) obj2;
                try {
                    gVar.f3674a.m.a(gVar.b, h.a(), new f(gVar, taskCompletionSource));
                    return;
                } catch (RemoteException e4) {
                    r rVar = g.f3673c;
                    Object[] objArr = {gVar.b};
                    rVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", r.b(rVar.f1539a, "error requesting in-app review for %s", objArr), e4);
                    }
                    taskCompletionSource.trySetException(new RuntimeException(e4));
                    return;
                }
            case 1:
                j jVar = (j) obj2;
                IInterface iInterface = jVar.m;
                ArrayList arrayList = jVar.f3779d;
                Y3.f fVar = (Y3.f) obj;
                r rVar2 = jVar.b;
                if (iInterface == null && !jVar.f3782g) {
                    rVar2.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(fVar);
                    i iVar = new i(jVar, 0);
                    jVar.l = iVar;
                    jVar.f3782g = true;
                    if (!jVar.f3777a.bindService(jVar.f3783h, iVar, 1)) {
                        rVar2.a("Failed to bind to the service.", new Object[0]);
                        jVar.f3782g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Y3.f fVar2 = (Y3.f) it.next();
                            RuntimeException runtimeException = new RuntimeException("Failed to bind to the service.");
                            TaskCompletionSource taskCompletionSource2 = fVar2.b;
                            if (taskCompletionSource2 != null) {
                                taskCompletionSource2.trySetException(runtimeException);
                            }
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
                if (jVar.f3782g) {
                    rVar2.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(fVar);
                    return;
                } else {
                    fVar.run();
                    return;
                }
            default:
                i iVar2 = (i) obj2;
                j jVar2 = (j) iVar2.f3775c;
                int i9 = Y3.d.b;
                IBinder iBinder = (IBinder) obj;
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    if (queryLocalInterface instanceof Y3.e) {
                        cVar = (Y3.e) queryLocalInterface;
                    } else {
                        cVar = new Y3.c(iBinder);
                    }
                }
                jVar2.m = cVar;
                j jVar3 = (j) iVar2.f3775c;
                jVar3.b.a("linkToDeath", new Object[0]);
                try {
                    jVar3.m.asBinder().linkToDeath(jVar3.f3785j, 0);
                } catch (RemoteException e9) {
                    Object[] objArr2 = new Object[0];
                    r rVar3 = jVar3.b;
                    rVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", r.b(rVar3.f1539a, "linkToDeath failed", objArr2), e9);
                    }
                }
                jVar3.f3782g = false;
                Iterator it2 = jVar3.f3779d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                jVar3.f3779d.clear();
                return;
        }
    }

    public e(i iVar, IBinder iBinder) {
        this.f3668c = 2;
        this.f3670f = iVar;
        this.f3669d = iBinder;
    }
}
