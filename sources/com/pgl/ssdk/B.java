package com.pgl.ssdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class B {

    /* renamed from: c, reason: collision with root package name */
    private static B f19517c;

    /* renamed from: a, reason: collision with root package name */
    private Context f19518a;
    private List<Integer> b = new ArrayList();

    private B(Context context) {
        this.f19518a = null;
        this.f19518a = context;
    }

    public static B a(Context context) {
        if (f19517c == null) {
            synchronized (B.class) {
                try {
                    if (f19517c == null) {
                        f19517c = new B(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19517c;
    }

    public synchronized String b() {
        if (this.b.size() <= 0) {
            return "-1";
        }
        return String.valueOf(this.b.get(r0.size() - 1).intValue() % 10000);
    }

    public synchronized String c() {
        return new JSONArray((Collection) this.b).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        r1 = (r1 * 10000) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r7 = this;
            r0 = 0
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L57
            android.content.Context r1 = r7.f19518a     // Catch: java.lang.Throwable -> L4c
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
            r3 = 0
            android.content.Intent r1 = r1.registerReceiver(r3, r2)     // Catch: java.lang.Throwable -> L4c
            if (r1 != 0) goto L14
            r1 = r0
            goto L1a
        L14:
            java.lang.String r2 = "plugged"
            int r1 = r1.getIntExtra(r2, r0)     // Catch: java.lang.Throwable -> L4c
        L1a:
            android.content.Context r2 = r7.f19518a     // Catch: java.lang.Throwable -> L4a
            android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            android.content.Intent r2 = r2.registerReceiver(r3, r4)     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L2a
            goto L45
        L2a:
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r4 = "scale"
            int r0 = r2.getIntExtra(r4, r0)     // Catch: java.lang.Throwable -> L4a
            float r2 = (float) r3     // Catch: java.lang.Throwable -> L4a
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4a
            float r2 = r2 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L4a
            int r0 = r0 / 10
        L45:
            monitor-exit(r7)
            int r1 = r1 * 10000
            int r1 = r1 + r0
            goto L59
        L4a:
            r0 = move-exception
            goto L50
        L4c:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L50:
            monitor-exit(r7)
            throw r0     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
        L52:
            r0 = move-exception
            goto L56
        L54:
            r0 = r1
            goto L57
        L56:
            throw r0
        L57:
            int r1 = r0 * 10000
        L59:
            r0 = -1
            if (r1 != r0) goto L5d
            return
        L5d:
            java.util.List<java.lang.Integer> r0 = r7.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            java.util.List<java.lang.Integer> r0 = r7.b     // Catch: java.lang.Throwable -> L84
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L84
            r1 = 20
            if (r0 <= r1) goto L84
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            java.util.List<java.lang.Integer> r2 = r7.b     // Catch: java.lang.Throwable -> L84
            int r3 = r0 + (-10)
            java.util.List r0 = r2.subList(r3, r0)     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            java.util.List<java.lang.Integer> r0 = r7.b     // Catch: java.lang.Throwable -> L84
            r0.clear()     // Catch: java.lang.Throwable -> L84
            r7.b = r1     // Catch: java.lang.Throwable -> L84
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.B.a():void");
    }
}
