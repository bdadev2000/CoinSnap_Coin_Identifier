package k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.hardware.Camera;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.common.collect.c1;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.UUID;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20063d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20065g;

    public /* synthetic */ g(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f20061b = i10;
        this.f20065g = obj;
        this.f20062c = obj2;
        this.f20063d = obj3;
        this.f20064f = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u2.j k10;
        int i10 = this.f20061b;
        int i11 = 2;
        int i12 = 1;
        Object obj = this.f20065g;
        Object obj2 = this.f20064f;
        Object obj3 = this.f20063d;
        Object obj4 = this.f20062c;
        switch (i10) {
            case 0:
                h hVar = (h) obj4;
                if (hVar != null) {
                    v3.c cVar = (v3.c) obj;
                    ((i) cVar.f26021c).C = true;
                    hVar.f20066b.c(false);
                    ((i) cVar.f26021c).C = false;
                }
                MenuItem menuItem = (MenuItem) obj3;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj2).q(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                try {
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    androidx.work.p.e().b(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                    v2.g.a((Context) obj3, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    v2.g.a((Context) obj3, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    v2.g.a((Context) obj3, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    v2.g.a((Context) obj3, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) obj2).finish();
                }
            case 2:
                UUID uuid = (UUID) obj4;
                String uuid2 = uuid.toString();
                androidx.work.p e2 = androidx.work.p.e();
                String str = v2.o.f26007c;
                e2.b(str, String.format("Updating progress for %s (%s)", uuid, (androidx.work.h) obj3), new Throwable[0]);
                v2.o oVar = (v2.o) obj;
                WorkDatabase workDatabase = oVar.a;
                WorkDatabase workDatabase2 = oVar.a;
                workDatabase.beginTransaction();
                try {
                    k10 = ((v2.o) obj).a.h().k(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (k10 != null) {
                    if (k10.f25452b == androidx.work.y.RUNNING) {
                        ((v2.o) obj).a.g().r(new u2.g(uuid2, (androidx.work.h) obj3));
                    } else {
                        androidx.work.p.e().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2), new Throwable[0]);
                    }
                    ((w2.j) obj2).h(null);
                    ((v2.o) obj).a.setTransactionSuccessful();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            case 3:
                he.g gVar = (he.g) obj;
                if (gVar.f19087g.f17832o) {
                    ye.b bVar = gVar.f19086f;
                    me.a aVar = new me.a(gVar.C, new ze.b(bVar.f28178d, bVar.f28179e));
                    androidx.viewpager2.adapter.c e10 = ((androidx.viewpager2.adapter.c) obj4).e(aVar);
                    Camera.Parameters parameters = gVar.V.getParameters();
                    int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                    int maxNumMeteringAreas = parameters.getMaxNumMeteringAreas();
                    if (maxNumFocusAreas > 0) {
                        parameters.setFocusAreas(e10.d(maxNumFocusAreas, aVar));
                    }
                    if (maxNumMeteringAreas > 0) {
                        parameters.setMeteringAreas(e10.d(maxNumMeteringAreas, aVar));
                    }
                    parameters.setFocusMode(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                    gVar.V.setParameters(parameters);
                    ((c1) gVar.f19028c).j((se.a) obj3, (PointF) obj2);
                    pe.j jVar = gVar.f19029d;
                    jVar.c(0, "focus end");
                    androidx.activity.i iVar = new androidx.activity.i(this, 27);
                    jVar.getClass();
                    jVar.b(2500L, "focus end", new he.o(i12, jVar, iVar), true);
                    try {
                        ((he.g) obj).V.autoFocus(new he.b(this));
                        return;
                    } catch (RuntimeException e11) {
                        he.a0.f19026e.a(3, "startAutoFocus:", "Error calling autoFocus", e11);
                        return;
                    }
                }
                return;
            default:
                he.s sVar = (he.s) obj;
                if (sVar.f19087g.f17832o) {
                    ((c1) sVar.f19028c).j((se.a) obj4, (PointF) obj3);
                    int i13 = he.s.f19070j0;
                    le.g i02 = sVar.i0((androidx.viewpager2.adapter.c) obj2);
                    ie.i iVar2 = new ie.i(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS, i02);
                    iVar2.l(sVar);
                    iVar2.b(new he.r(i11, this, i02));
                    return;
                }
                return;
        }
    }
}
