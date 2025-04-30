package com.google.firebase.perf.metrics;

import E3.b;
import R3.e;
import X4.c;
import X4.d;
import Y4.a;
import a5.C0397a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c5.AbstractC0612e;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.mbridge.msdk.foundation.entity.o;
import e5.C2221a;
import e5.InterfaceC2222b;
import g5.C2303f;
import h5.i;
import j5.C2400c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public class Trace extends d implements Parcelable, InterfaceC2222b {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: o, reason: collision with root package name */
    public static final C0397a f14362o = C0397a.d();
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public final Trace f14363c;

    /* renamed from: d, reason: collision with root package name */
    public final GaugeManager f14364d;

    /* renamed from: f, reason: collision with root package name */
    public final String f14365f;

    /* renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f14366g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f14367h;

    /* renamed from: i, reason: collision with root package name */
    public final List f14368i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f14369j;

    /* renamed from: k, reason: collision with root package name */
    public final C2303f f14370k;
    public final e l;
    public i m;

    /* renamed from: n, reason: collision with root package name */
    public i f14371n;

    static {
        new ConcurrentHashMap();
        CREATOR = new b(24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, C2303f c2303f, e eVar, c cVar) {
        super(cVar);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.b = new WeakReference(this);
        this.f14363c = null;
        this.f14365f = str.trim();
        this.f14369j = new ArrayList();
        this.f14366g = new ConcurrentHashMap();
        this.f14367h = new ConcurrentHashMap();
        this.l = eVar;
        this.f14370k = c2303f;
        this.f14368i = Collections.synchronizedList(new ArrayList());
        this.f14364d = gaugeManager;
    }

    @Override // e5.InterfaceC2222b
    public final void a(C2221a c2221a) {
        if (c2221a == null) {
            f14362o.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (this.m != null && !c()) {
            this.f14368i.add(c2221a);
        }
    }

    public final void b(String str, String str2) {
        if (!c()) {
            ConcurrentHashMap concurrentHashMap = this.f14367h;
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                Locale locale = Locale.ENGLISH;
                throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
            }
            AbstractC0612e.b(str, str2);
            return;
        }
        Locale locale2 = Locale.ENGLISH;
        throw new IllegalArgumentException(AbstractC2914a.h(new StringBuilder("Trace '"), this.f14365f, "' has been stopped"));
    }

    public final boolean c() {
        if (this.f14371n != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() {
        try {
            if (this.m != null && !c()) {
                f14362o.g("Trace '%s' is started but not stopped when it is destructed!", this.f14365f);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f14367h.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f14367h);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        b5.c cVar;
        if (str != null) {
            cVar = (b5.c) this.f14366g.get(str.trim());
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return 0L;
        }
        return cVar.f5321c.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j7) {
        boolean z8;
        String c9 = AbstractC0612e.c(str);
        C0397a c0397a = f14362o;
        if (c9 != null) {
            c0397a.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c9);
            return;
        }
        if (this.m != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.f14365f;
        if (!z8) {
            c0397a.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            c0397a.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f14366g;
        b5.c cVar = (b5.c) concurrentHashMap.get(trim);
        if (cVar == null) {
            cVar = new b5.c(trim);
            concurrentHashMap.put(trim, cVar);
        }
        AtomicLong atomicLong = cVar.f5321c;
        atomicLong.addAndGet(j7);
        c0397a.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z8;
        C0397a c0397a = f14362o;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            c0397a.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f14365f);
            z8 = true;
        } catch (Exception e4) {
            c0397a.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e4.getMessage());
            z8 = false;
        }
        if (z8) {
            this.f14367h.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j7) {
        boolean z8;
        String c9 = AbstractC0612e.c(str);
        C0397a c0397a = f14362o;
        if (c9 != null) {
            c0397a.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c9);
            return;
        }
        if (this.m != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.f14365f;
        if (!z8) {
            c0397a.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            c0397a.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f14366g;
        b5.c cVar = (b5.c) concurrentHashMap.get(trim);
        if (cVar == null) {
            cVar = new b5.c(trim);
            concurrentHashMap.put(trim, cVar);
        }
        cVar.f5321c.set(j7);
        c0397a.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j7), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (c()) {
            C0397a c0397a = f14362o;
            if (c0397a.b) {
                c0397a.f4074a.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.f14367h.remove(str);
    }

    @Keep
    public void start() {
        String str;
        String str2;
        boolean o3 = a.e().o();
        C0397a c0397a = f14362o;
        if (!o3) {
            c0397a.a("Trace feature is disabled.");
            return;
        }
        String str3 = this.f14365f;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else {
            if (str3.startsWith("_")) {
                int[] e4 = AbstractC2965e.e(6);
                int length = e4.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        switch (e4[i9]) {
                            case 1:
                                str2 = "_as";
                                break;
                            case 2:
                                str2 = "_astui";
                                break;
                            case 3:
                                str2 = "_astfd";
                                break;
                            case 4:
                                str2 = "_asti";
                                break;
                            case 5:
                                str2 = "_fs";
                                break;
                            case 6:
                                str2 = "_bs";
                                break;
                            default:
                                throw null;
                        }
                        if (!str2.equals(str3)) {
                            i9++;
                        }
                    } else if (!str3.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            c0397a.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.m != null) {
            c0397a.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.l.getClass();
        this.m = new i();
        registerForAppState();
        C2221a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.b);
        a(perfSession);
        if (perfSession.f20111d) {
            this.f14364d.collectGaugeMetricOnce(perfSession.f20110c);
        }
    }

    @Keep
    public void stop() {
        boolean z8;
        if (this.m != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str = this.f14365f;
        C0397a c0397a = f14362o;
        if (!z8) {
            c0397a.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            c0397a.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.b);
        unregisterForAppState();
        this.l.getClass();
        i iVar = new i();
        this.f14371n = iVar;
        if (this.f14363c == null) {
            ArrayList arrayList = this.f14369j;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) o.g(arrayList, 1);
                if (trace.f14371n == null) {
                    trace.f14371n = iVar;
                }
            }
            if (!str.isEmpty()) {
                this.f14370k.c(new C2400c(this, 26).m(), getAppState());
                if (SessionManager.getInstance().perfSession().f20111d) {
                    this.f14364d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f20110c);
                    return;
                }
                return;
            }
            if (c0397a.b) {
                c0397a.f4074a.getClass();
                Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        parcel.writeParcelable(this.f14363c, 0);
        parcel.writeString(this.f14365f);
        parcel.writeList(this.f14369j);
        parcel.writeMap(this.f14366g);
        parcel.writeParcelable(this.m, 0);
        parcel.writeParcelable(this.f14371n, 0);
        synchronized (this.f14368i) {
            parcel.writeList(this.f14368i);
        }
    }

    public Trace(Parcel parcel, boolean z8) {
        super(z8 ? null : c.a());
        this.b = new WeakReference(this);
        this.f14363c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f14365f = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f14369j = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f14366g = concurrentHashMap;
        this.f14367h = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, b5.c.class.getClassLoader());
        this.m = (i) parcel.readParcelable(i.class.getClassLoader());
        this.f14371n = (i) parcel.readParcelable(i.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f14368i = synchronizedList;
        parcel.readList(synchronizedList, C2221a.class.getClassLoader());
        if (z8) {
            this.f14370k = null;
            this.l = null;
            this.f14364d = null;
        } else {
            this.f14370k = C2303f.f20472u;
            this.l = new e(24);
            this.f14364d = GaugeManager.getInstance();
        }
    }
}
