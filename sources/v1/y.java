package v1;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final u f25959b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f25960c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f25961d;

    /* renamed from: e, reason: collision with root package name */
    public int f25962e;

    /* renamed from: f, reason: collision with root package name */
    public r f25963f;

    /* renamed from: g, reason: collision with root package name */
    public p f25964g;

    /* renamed from: h, reason: collision with root package name */
    public final w f25965h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f25966i;

    /* renamed from: j, reason: collision with root package name */
    public final v f25967j;

    /* renamed from: k, reason: collision with root package name */
    public final v f25968k;

    /* JADX WARN: Type inference failed for: r0v5, types: [v1.v] */
    /* JADX WARN: Type inference failed for: r0v6, types: [v1.v] */
    public y(Context context, String name, Intent serviceIntent, u invalidationTracker, Executor executor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        Intrinsics.checkNotNullParameter(invalidationTracker, "invalidationTracker");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.a = name;
        this.f25959b = invalidationTracker;
        this.f25960c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f25961d = applicationContext;
        this.f25965h = new w(this);
        final int i10 = 0;
        this.f25966i = new AtomicBoolean(false);
        x xVar = new x(this, i10);
        this.f25967j = new Runnable(this) { // from class: v1.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f25954c;

            {
                this.f25954c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r rVar = null;
                int i11 = i10;
                y this$0 = this.f25954c;
                switch (i11) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        try {
                            p pVar = this$0.f25964g;
                            if (pVar != null) {
                                this$0.f25962e = pVar.b(this$0.f25965h, this$0.a);
                                u uVar = this$0.f25959b;
                                r rVar2 = this$0.f25963f;
                                if (rVar2 != null) {
                                    rVar = rVar2;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("observer");
                                }
                                uVar.a(rVar);
                                return;
                            }
                            return;
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
                            return;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u uVar2 = this$0.f25959b;
                        r rVar3 = this$0.f25963f;
                        if (rVar3 != null) {
                            rVar = rVar3;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("observer");
                        }
                        uVar2.d(rVar);
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f25968k = new Runnable(this) { // from class: v1.v

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f25954c;

            {
                this.f25954c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                r rVar = null;
                int i112 = i11;
                y this$0 = this.f25954c;
                switch (i112) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        try {
                            p pVar = this$0.f25964g;
                            if (pVar != null) {
                                this$0.f25962e = pVar.b(this$0.f25965h, this$0.a);
                                u uVar = this$0.f25959b;
                                r rVar2 = this$0.f25963f;
                                if (rVar2 != null) {
                                    rVar = rVar2;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("observer");
                                }
                                uVar.a(rVar);
                                return;
                            }
                            return;
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
                            return;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        u uVar2 = this$0.f25959b;
                        r rVar3 = this$0.f25963f;
                        if (rVar3 != null) {
                            rVar = rVar3;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("observer");
                        }
                        uVar2.d(rVar);
                        return;
                }
            }
        };
        d dVar = new d(this, (String[]) invalidationTracker.f25942d.keySet().toArray(new String[0]));
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f25963f = dVar;
        applicationContext.bindService(serviceIntent, xVar, 1);
    }
}
