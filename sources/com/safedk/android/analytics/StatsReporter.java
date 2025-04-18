package com.safedk.android.analytics;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class StatsReporter implements AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private static final String f29136a = "StatsReporter";

    /* renamed from: b, reason: collision with root package name */
    private static StatsReporter f29137b;

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f29138c = Executors.newSingleThreadExecutor();

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f29081a;
    }

    public static synchronized void a() {
        synchronized (StatsReporter.class) {
            f29137b = new StatsReporter();
        }
    }

    public static synchronized StatsReporter b() {
        StatsReporter statsReporter;
        synchronized (StatsReporter.class) {
            statsReporter = f29137b;
        }
        return statsReporter;
    }

    public void a(final ArrayList<Bundle> arrayList) {
        try {
            f29138c.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (arrayList.size() > 0) {
                            Logger.d(StatsReporter.f29136a, "Starting report stats events!, isOnUiThread = " + k.c());
                            AppLovinBridge.a((ArrayList<Bundle>) arrayList, StatsReporter.this);
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsReporter.f29136a, "Caught exception while creating json data", th);
                    }
                }
            });
        } catch (Throwable th) {
            Logger.e(f29136a, "failed during report events: " + arrayList, th);
            new CrashReporter().caughtException(th);
        }
    }

    public ArrayList<Bundle> a(Set<StatsEvent> set) {
        Logger.d(f29136a, "filters reports and bundle started, events to send : " + (set == null ? "null" : Integer.valueOf(set.size())) + ", isOnUiThread = " + k.c());
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            for (StatsEvent statsEvent : set) {
                boolean z2 = false;
                if (SafeDK.b() && (statsEvent.b().equals(StatsCollector.EventType.BrandSafety) || statsEvent.b().equals(StatsCollector.EventType.redirect))) {
                    z2 = true;
                }
                Logger.d(f29136a, "filters reports and bundle Event type = " + statsEvent.b() + "; should report = " + z2);
                Bundle e = statsEvent.e();
                k.b(f29136a, "filters reports and bundle " + statsEvent.b() + " event:" + k.a(e));
                if (z2) {
                    Set<String> f2 = statsEvent.f();
                    if (f2 != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : f2) {
                            if (!e.containsKey(str)) {
                                hashSet.add(str);
                            }
                        }
                        if (hashSet.size() > 0) {
                            Logger.d(f29136a, "filters reports and bundle *** missing fields: " + hashSet);
                        }
                    }
                    arrayList.add(e);
                    k.b(f29136a, "filters reports and bundle event to be reported : " + e.toString());
                }
            }
        } catch (Exception e2) {
            Logger.e(f29136a, "Exception filtering events for report", e2);
        }
        return arrayList;
    }

    public synchronized boolean a(CreativeInfo creativeInfo, c cVar) {
        boolean z2;
        Bundle bundle = cVar.A;
        Logger.d(f29136a, "notify Max started , CI = " + creativeInfo + ", applovin data = " + bundle + ", isOnUiThread = " + k.c());
        if (creativeInfo != null && creativeInfo.aa() != null && bundle != null) {
            String z3 = com.safedk.android.analytics.brandsafety.b.a(cVar, creativeInfo) ? cVar.z() : creativeInfo.aa();
            Logger.d(f29136a, "Will notify Max about match, creative id = " + z3);
            AppLovinBridge.reportMaxCreativeId(bundle, z3, b());
            z2 = true;
        } else {
            Logger.d(f29136a, "Cannot notify Max about match");
            z2 = false;
        }
        return z2;
    }
}
