package com.safedk.android.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.t;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class StatsCollector implements com.safedk.android.internal.a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f29103a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final String f29104c = "StatsCollector";
    private static final String d = "SafeDKEvents.";
    private static StatsCollector e;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f29105n;

    /* renamed from: p, reason: collision with root package name */
    private static boolean f29106p = false;

    /* renamed from: q, reason: collision with root package name */
    private static boolean f29107q = false;

    /* renamed from: r, reason: collision with root package name */
    private static final Object f29108r = new Object();

    /* renamed from: i, reason: collision with root package name */
    private SharedPreferences f29113i;

    /* renamed from: j, reason: collision with root package name */
    private volatile AtomicBoolean f29114j;

    /* renamed from: l, reason: collision with root package name */
    private StatsReporter f29116l;

    /* renamed from: o, reason: collision with root package name */
    private String f29118o;

    /* renamed from: f, reason: collision with root package name */
    private PersistentConcurrentHashMap<String, StatsEvent> f29110f = new PersistentConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashSetWithItemLimit<String> f29111g = new LinkedHashSetWithItemLimit<>(10);

    /* renamed from: h, reason: collision with root package name */
    private Map<String, t> f29112h = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public AtomicLong f29109b = new AtomicLong(0);

    /* renamed from: k, reason: collision with root package name */
    private AtomicBoolean f29115k = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f29117m = Executors.newSingleThreadExecutor();

    /* loaded from: classes.dex */
    public enum EventType {
        Network,
        Launch,
        Thread,
        Location,
        CaughtException,
        UserDataAccess,
        ActiveUser,
        BrandSafety,
        AdIntelligenceFill,
        ANR,
        UserSession,
        crash,
        redirect
    }

    public static boolean a() {
        return f29106p;
    }

    public static void a(boolean z2) {
        f29106p = z2;
    }

    public static boolean b() {
        return f29107q;
    }

    public static void b(boolean z2) {
        synchronized (f29108r) {
            Logger.d(f29104c, "setActiveMode to " + z2);
            f29105n = z2;
            e = null;
        }
    }

    public static StatsCollector c() {
        StatsCollector statsCollector = null;
        if (!f29106p && !SafeDK.b()) {
            Logger.d(f29104c, "Reporter thread has not been initialized yet");
        } else {
            synchronized (f29108r) {
                if (e == null) {
                    e = new StatsCollector(300, com.safedk.android.internal.b.getInstance().isInBackground(), 5000, null, k.a(SafeDK.getInstance().l()));
                }
                statsCollector = e;
            }
        }
        return statsCollector;
    }

    private StatsCollector(int interval, boolean isBackground, int maximumEventsSize, StatsReporter statsReporter, String processName) {
        this.f29118o = null;
        if (f29105n) {
            Logger.d(f29104c, "Initializing Stats collector");
            a(interval, isBackground, statsReporter);
            this.f29118o = d + processName;
            com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        }
    }

    public void d() {
        this.f29117m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.1
            @Override // java.lang.Runnable
            public void run() {
                PersistentConcurrentHashMap persistentConcurrentHashMap;
                try {
                    Logger.d(StatsCollector.f29104c, "Attempting to load Stats events from storage.");
                    try {
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap(StatsCollector.this.f29118o);
                    } catch (Throwable th) {
                        Logger.d(StatsCollector.f29104c, "Error loading events from storage file " + StatsCollector.this.f29118o + " : " + th.getMessage(), th);
                        persistentConcurrentHashMap = new PersistentConcurrentHashMap();
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    if (StatsCollector.this.f29110f != null && StatsCollector.this.f29110f.size() > 0) {
                        concurrentHashMap.putAll(StatsCollector.this.f29110f);
                        Logger.d(StatsCollector.f29104c, "Stats repository contains " + concurrentHashMap.size() + " items. they will be added to the stored ones.");
                    } else {
                        Logger.d(StatsCollector.f29104c, "Stats repository does not contain previously accumulated events.");
                    }
                    synchronized (StatsCollector.f29108r) {
                        StatsCollector.this.f29110f = persistentConcurrentHashMap;
                    }
                    Logger.d(StatsCollector.f29104c, StatsCollector.this.f29110f.size() + " events loaded from storage");
                    for (V v2 : StatsCollector.this.f29110f.values()) {
                        String str = null;
                        if (v2.c() != null) {
                            str = v2.c();
                        }
                        Logger.d(StatsCollector.f29104c, "Setting event maturity, next_session, first_session (" + SafeDK.getInstance().e() + ") for stored event. key " + str);
                        v2.b(true);
                        v2.c(true);
                        v2.a(SafeDK.getInstance().e());
                        if (!TextUtils.isEmpty(StatsCollector.this.f29110f.a())) {
                            Logger.d(StatsCollector.f29104c, "sdk_null_check sc added value" + StatsCollector.this.f29110f.a());
                        }
                    }
                    if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                        StatsCollector.this.f29110f.a(false);
                        for (StatsEvent statsEvent : concurrentHashMap.values()) {
                            Logger.d(StatsCollector.f29104c, "adding previously accumulated event to the stats repository : " + statsEvent.toString());
                            StatsCollector.this.b(statsEvent);
                        }
                        StatsCollector.this.f29110f.a(true);
                    }
                    Logger.d(StatsCollector.f29104c, "Completed Loading events from storage. " + StatsCollector.this.f29110f.size() + " items loaded");
                    boolean unused = StatsCollector.f29107q = true;
                    if (StatsCollector.this.f29110f.size() > 0) {
                        Logger.d(StatsCollector.f29104c, StatsCollector.this.f29110f.size() + " event(s) will be reported");
                        StatsCollector.this.d(true);
                    }
                    SafeDK.getInstance().j();
                } catch (Throwable th2) {
                    Logger.d(StatsCollector.f29104c, "Error loading events from storage : " + th2.getMessage(), th2);
                }
            }
        });
    }

    public PersistentConcurrentHashMap<String, StatsEvent> e() {
        return this.f29110f;
    }

    public ConcurrentHashMap<String, StatsEvent> a(EventType eventType) {
        ConcurrentHashMap<String, StatsEvent> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f29110f.keySet()) {
            StatsEvent statsEvent = this.f29110f.get(str);
            if (statsEvent != null && statsEvent.b().equals(eventType)) {
                Logger.d(f29104c, "Get events by type adding event with key " + str);
                concurrentHashMap.put(statsEvent.c(), statsEvent);
            }
        }
        return concurrentHashMap;
    }

    public Map<String, t> f() {
        return this.f29112h;
    }

    public boolean a(String str, String str2) {
        return this.f29112h != null && this.f29112h.containsKey(str) && this.f29112h.get(str).c().equals(str2);
    }

    private void a(Context context, String str) {
        this.f29113i = context.getSharedPreferences(str, 0);
        this.f29113i.edit().clear().commit();
        Logger.d(f29104c, "Old StatsRepository data cleared");
    }

    public void a(int i2, boolean z2, int i3, StatsReporter statsReporter) {
        a(i2, z2, statsReporter);
        this.f29115k.set(true);
    }

    private void a(int i2, boolean z2, StatsReporter statsReporter) {
        f29103a = i2;
        this.f29109b.set(k.b(System.currentTimeMillis()));
        this.f29114j = new AtomicBoolean(z2);
        this.f29116l = statsReporter;
    }

    public void a(StatsEvent statsEvent) {
        b(Collections.singletonList(statsEvent));
    }

    public void a(List<StatsEvent> list) {
        b(list);
    }

    private void b(final List<StatsEvent> list) {
        if (f29105n) {
            this.f29117m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        k.b(StatsCollector.f29104c, "received stats safety event " + list + ", isOnUiThread = " + k.c());
                        if (!StatsCollector.this.f29114j.get()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                StatsCollector.this.b((StatsEvent) it.next());
                            }
                            StatsCollector.this.d(false);
                            return;
                        }
                        for (StatsEvent statsEvent : list) {
                            if (statsEvent.a_() && !statsEvent.i().equals(SafeDK.f29035a)) {
                                StatsCollector.this.b(statsEvent);
                                StatsCollector.this.d(true);
                            } else {
                                Logger.d(StatsCollector.f29104c, "Saving bundle to disk : " + statsEvent.toString());
                                StatsCollector.this.b(statsEvent);
                            }
                        }
                    } catch (Throwable th) {
                        Logger.e(StatsCollector.f29104c, th.getMessage(), th);
                        new CrashReporter().caughtException(th);
                    }
                }
            });
        }
    }

    synchronized void b(StatsEvent statsEvent) {
        String c2 = statsEvent.c();
        k();
        if (c2 != null) {
            if (this.f29110f.containsKey(c2)) {
                StatsEvent statsEvent2 = this.f29110f.get(c2);
                statsEvent2.b(statsEvent);
                this.f29110f.put(c2, statsEvent2);
                Logger.d(f29104c, "Event " + c2 + " found. Aggregating. event = " + statsEvent2.e().toString() + ", isOnUiThread = " + k.c());
            } else if (!this.f29111g.contains(c2)) {
                this.f29110f.put(c2, statsEvent);
                Logger.d(f29104c, "Event " + c2 + " found. Adding. event = " + statsEvent.e().toString() + ", isOnUiThread = " + k.c());
            } else {
                Logger.d(f29104c, "Event " + c2 + " found. Already reported. event = " + statsEvent.e().toString() + ", isOnUiThread = " + k.c());
            }
        } else {
            Logger.d(f29104c, "Event key is null, cannot add to events repository.");
        }
    }

    public synchronized void a(String str) {
        k();
        if (str != null) {
            if (this.f29110f.remove(str) != null) {
                Logger.d(f29104c, "Event successfully removed from events repository, key=" + str);
            } else {
                Logger.d(f29104c, "Event to remove wasn't found in events repository, key=" + str);
            }
        } else {
            Logger.d(f29104c, "Event key is null, cannot remove from events repository.");
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void g() {
        if (f29105n) {
            Logger.d(f29104c, "onBackground started");
            this.f29114j.set(true);
            this.f29117m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.3
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    @Override // com.safedk.android.internal.a
    public synchronized void h() {
        if (f29105n) {
            Logger.d(f29104c, "onForeground started");
            this.f29114j.set(false);
            this.f29117m.execute(new Runnable() { // from class: com.safedk.android.analytics.StatsCollector.4
                @Override // java.lang.Runnable
                public void run() {
                    StatsCollector.this.d(true);
                }
            });
        }
    }

    public boolean i() {
        return com.safedk.android.internal.b.getInstance().getForegroundActivity() == null || this.f29114j.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(boolean z2) {
        try {
            Logger.d(f29104c, "sendEvents started, persistImmatureEvents=" + z2 + ", isOnUiThread = " + k.c());
            synchronized (f29108r) {
                if (this.f29110f == null || this.f29110f.size() == 0) {
                    Logger.d(f29104c, "sendEvents no events to report, skipping");
                } else {
                    HashSet<StatsEvent> hashSet = new HashSet(this.f29110f.values());
                    HashSet hashSet2 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        StatsEvent statsEvent = (StatsEvent) it.next();
                        k.b(f29104c, "sendEvents, key=" + statsEvent.c() + ", mature=" + statsEvent.a_() + ", event details " + statsEvent.toString());
                        if (!statsEvent.a_()) {
                            hashSet2.add(statsEvent);
                            it.remove();
                        }
                    }
                    Logger.d(f29104c, "sendEvents " + (hashSet != null ? hashSet.toString() : ""));
                    k();
                    boolean isInBackground = com.safedk.android.internal.b.getInstance().isInBackground();
                    boolean i2 = i();
                    Logger.d(f29104c, "foregroundActivity is null? " + isInBackground + ", is background? " + this.f29114j.get());
                    ArrayList<Bundle> a2 = this.f29116l.a(hashSet);
                    if (a2.size() > 0 && !i2) {
                        Logger.d(f29104c, "sendEvents sending the following events (" + a2.size() + ") : " + a2.toString());
                        this.f29116l.a(a2);
                        Iterator<Bundle> it2 = a2.iterator();
                        while (it2.hasNext()) {
                            Bundle next = it2.next();
                            if (SafeDK.getInstance().z() != null && SafeDK.getInstance().z().e() != null) {
                                Logger.d(f29104c, "eventIds removed " + next.getString("event_id") + " found = " + SafeDK.getInstance().z().e().remove(next.getString("event_id")));
                            }
                            if (next.containsKey(StatsEvent.f29841z) && next.getString(StatsEvent.f29841z).equals("impression")) {
                                Logger.d(f29104c, "sendEvents removing brand safety event  " + next.getString("impression_id"));
                                this.f29110f.remove(next.getString("impression_id"));
                            } else if (next.containsKey(StatsEvent.f29841z) && next.getString(StatsEvent.f29841z).equals(RedirectEvent.f29824b)) {
                                Logger.d(f29104c, "sendEvents removing redirect event for key  " + RedirectEvent.a(next) + ", exists ? " + this.f29110f.containsKey(RedirectEvent.a(next)));
                                this.f29110f.remove(RedirectEvent.a(next));
                            } else {
                                Logger.d(f29104c, "sendEvents Cannot remove event from stats repository " + next.toString());
                            }
                        }
                        if (SafeDK.getInstance().z() != null) {
                            Logger.d(f29104c, "eventIds remaining : " + SafeDK.getInstance().z().e());
                        }
                        CreativeInfoManager.h();
                    } else if (i2) {
                        Logger.d(f29104c, "sendEvents will not report because the app is in the background");
                    }
                    if (z2) {
                        Logger.d(f29104c, "sendEvents persisting immature events");
                        if (hashSet2.size() > 0) {
                            Logger.d(f29104c, hashSet2.size() + " sendEvents events to save");
                            Iterator it3 = hashSet2.iterator();
                            while (it3.hasNext()) {
                                b((StatsEvent) it3.next());
                            }
                        }
                    } else if (this.f29110f != null && hashSet != null && this.f29110f.size() > 0 && hashSet.size() > 0) {
                        Logger.d(f29104c, "Before removing stats. repository size = " + this.f29110f.size() + " repository keys = " + this.f29110f.keySet().toString() + ", events (" + hashSet.size() + ") :" + hashSet.toString());
                        for (StatsEvent statsEvent2 : hashSet) {
                            Logger.d(f29104c, "event key is " + statsEvent2.c());
                            this.f29110f.remove(statsEvent2.c(), statsEvent2);
                            this.f29111g.add(statsEvent2.c());
                        }
                        Logger.d(f29104c, "After removing stats events (" + this.f29110f.size() + ") :" + this.f29110f);
                    } else {
                        Logger.d(f29104c, "No events to remove from events repository");
                    }
                }
            }
        } catch (Exception e2) {
            Logger.d(f29104c, e2.getMessage(), e2);
            new CrashReporter().caughtException(e2);
        }
    }

    private void k() {
        if (this.f29116l == null) {
            Logger.d(f29104c, "statsReporter is null, initializing");
            StatsReporter.a();
            this.f29116l = StatsReporter.b();
        }
    }
}
