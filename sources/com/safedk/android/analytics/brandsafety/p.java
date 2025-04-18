package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int f29761a = 50;

    /* renamed from: b, reason: collision with root package name */
    public static final int f29762b = 10;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29763c = 30000;
    private static final String d = "MaxEventsManager";
    private static final Object e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static p f29764f;

    /* renamed from: g, reason: collision with root package name */
    private MaxEvents f29765g = new MaxEvents(50);

    /* renamed from: h, reason: collision with root package name */
    private MaxEvents f29766h = new MaxEvents(5);

    private p() {
    }

    public static p a() {
        p pVar;
        synchronized (e) {
            if (f29764f == null) {
                f29764f = new p();
            }
            pVar = f29764f;
        }
        return pVar;
    }

    public synchronized void a(MaxEvent maxEvent) {
        this.f29765g.add(maxEvent);
    }

    public void b(MaxEvent maxEvent) {
        Logger.d(d, "Adding MAX Will display event. #event is " + this.f29766h.size() + ",  maxEvent=" + maxEvent.toString());
        this.f29766h.add(maxEvent);
    }

    public MaxEvents b() {
        MaxEvents d2 = d();
        return d2.size() >= 10 ? d2 : a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long currentTimeMillis = System.currentTimeMillis();
        Logger.d(d, "");
        maxEvents = new MaxEvents(50);
        Iterator<MaxEvent> it = this.f29765g.iterator();
        while (it.hasNext()) {
            MaxEvent next = it.next();
            if (currentTimeMillis - (next.c() * 1000) < 30000) {
                Logger.d(d, "getEventFromLastInterval Adding max event ts = " + currentTimeMillis + ", " + next.toString());
                maxEvents.add(next);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i2) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i2);
        for (int size = this.f29765g.size() < 10 ? 0 : this.f29765g.size() - 10; size < this.f29765g.size(); size++) {
            Logger.d(d, "getLastXEvents adding max event index " + size + " " + this.f29765g.get(size).toString());
            maxEvents.add(new MaxEvent(this.f29765g.get(size).b(), this.f29765g.get(size).c(), this.f29765g.get(size).d(), this.f29765g.get(size).e(), this.f29765g.get(size).a(), this.f29765g.get(size).f()));
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.f29766h;
    }
}
