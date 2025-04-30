package g4;

import P.o;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o4.C2496b;
import o4.C2499e;
import x.l;

/* renamed from: g4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2296f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f20432k = new Object();
    public static final x.b l = new l();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20433a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20434c;

    /* renamed from: d, reason: collision with root package name */
    public final C2499e f20435d;

    /* renamed from: g, reason: collision with root package name */
    public final o4.l f20438g;

    /* renamed from: h, reason: collision with root package name */
    public final N4.b f20439h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20436e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20437f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f20440i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f20441j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, r6.b] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public C2296f(Context context, String str, i iVar) {
        ?? arrayList;
        int i9 = 2;
        this.f20433a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.f20434c = (i) Preconditions.checkNotNull(iVar);
        C2291a c2291a = FirebaseInitProvider.b;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new O4.b((String) it.next(), 1));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        p4.l lVar = p4.l.b;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new O4.b(new FirebaseCommonRegistrar(), i9));
        arrayList3.add(new O4.b(new ExecutorsRegistrar(), i9));
        arrayList4.add(C2496b.c(context, Context.class, new Class[0]));
        arrayList4.add(C2496b.c(this, C2296f.class, new Class[0]));
        arrayList4.add(C2496b.c(iVar, i.class, new Class[0]));
        ?? obj = new Object();
        if (o.a(context) && FirebaseInitProvider.f14372c.get()) {
            arrayList4.add(C2496b.c(c2291a, C2291a.class, new Class[0]));
        }
        C2499e c2499e = new C2499e(arrayList3, arrayList4, obj);
        this.f20435d = c2499e;
        Trace.endSection();
        this.f20438g = new o4.l(new L4.c(this, context));
        this.f20439h = c2499e.c(L4.e.class);
        C2293c c2293c = new C2293c(this);
        a();
        if (this.f20436e.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        this.f20440i.add(c2293c);
        Trace.endSection();
    }

    public static C2296f c() {
        C2296f c2296f;
        synchronized (f20432k) {
            try {
                c2296f = (C2296f) l.getOrDefault("[DEFAULT]", null);
                if (c2296f != null) {
                    ((L4.e) c2296f.f20439h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2296f;
    }

    public static C2296f f(Context context) {
        synchronized (f20432k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a6 = i.a(context);
                if (a6 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener, java.lang.Object] */
    public static C2296f g(Context context, i iVar) {
        C2296f c2296f;
        AtomicReference atomicReference = C2294d.f20430a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C2294d.f20430a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f20432k) {
            x.b bVar = l;
            Preconditions.checkState(!bVar.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c2296f = new C2296f(context, "[DEFAULT]", iVar);
            bVar.put("[DEFAULT]", c2296f);
        }
        c2296f.e();
        return c2296f;
    }

    public final void a() {
        Preconditions.checkState(!this.f20437f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.f20435d.b(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f20434c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!o.a(this.f20433a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f20433a;
            AtomicReference atomicReference = C2295e.b;
            if (atomicReference.get() == null) {
                C2295e c2295e = new C2295e(context);
                while (!atomicReference.compareAndSet(null, c2295e)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(c2295e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        C2499e c2499e = this.f20435d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = c2499e.f21955f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (c2499e) {
                    hashMap = new HashMap(c2499e.f21951a);
                }
                c2499e.h(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((L4.e) this.f20439h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2296f)) {
            return false;
        }
        C2296f c2296f = (C2296f) obj;
        c2296f.a();
        return this.b.equals(c2296f.b);
    }

    public final boolean h() {
        boolean z8;
        a();
        S4.a aVar = (S4.a) this.f20438g.get();
        synchronized (aVar) {
            z8 = aVar.b;
        }
        return z8;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.f20434c).toString();
    }
}
