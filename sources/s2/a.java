package s2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import androidx.work.p;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f24154i = p.g("BatteryChrgTracker");

    public a(Context context, x2.a aVar) {
        super(context, aVar);
    }

    @Override // s2.d
    public final Object a() {
        Intent registerReceiver = this.f24159b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            p.e().c(f24154i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // s2.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // s2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L7
            return
        L7:
            androidx.work.p r0 = androidx.work.p.e()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r7
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            java.lang.String r5 = s2.a.f24154i
            r0.b(r5, r2, r4)
            int r0 = r7.hashCode()
            r2 = -1
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r2
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L50
            goto L26
        L50:
            r1 = r3
        L51:
            switch(r1) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.b(r7)
            goto L6c
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.b(r7)
            goto L6c
        L61:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.b(r7)
            goto L6c
        L67:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.b(r7)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.a.f(android.content.Intent):void");
    }
}
