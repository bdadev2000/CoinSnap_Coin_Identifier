package va;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import db.n;
import j0.o;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f26386k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final r.b f26387l = new r.b();
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26388b;

    /* renamed from: c, reason: collision with root package name */
    public final i f26389c;

    /* renamed from: d, reason: collision with root package name */
    public final db.g f26390d;

    /* renamed from: g, reason: collision with root package name */
    public final n f26393g;

    /* renamed from: h, reason: collision with root package name */
    public final cc.c f26394h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26391e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f26392f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f26395i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f26396j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8 A[LOOP:0: B:10:0x00d2->B:12:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r9, va.i r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: va.g.<init>(android.content.Context, va.i, java.lang.String):void");
    }

    public static g c() {
        g gVar;
        synchronized (f26386k) {
            gVar = (g) f26387l.getOrDefault("[DEFAULT]", null);
            if (gVar != null) {
                ((ac.d) gVar.f26394h.get()).b();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f26386k) {
            if (f26387l.containsKey("[DEFAULT]")) {
                return c();
            }
            i a = i.a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return g(context, a);
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        boolean z10;
        AtomicReference atomicReference = e.a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(eVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f26386k) {
            r.b bVar = f26387l;
            Preconditions.checkState(true ^ bVar.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(context, iVar, "[DEFAULT]");
            bVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f26392f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.f26390d.b(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f26388b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f26389c.f26406b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        HashMap hashMap;
        boolean z10 = true;
        if (!o.a(this.a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f26388b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.a;
            AtomicReference atomicReference = f.f26385b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (true) {
                    if (atomicReference.compareAndSet(null, fVar)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f26388b);
        Log.i("FirebaseApp", sb3.toString());
        db.g gVar = this.f26390d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f26388b);
        AtomicReference atomicReference2 = gVar.f16951f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                break;
            } else if (atomicReference2.get() != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            synchronized (gVar) {
                hashMap = new HashMap(gVar.a);
            }
            gVar.h(hashMap, equals);
        }
        ((ac.d) this.f26394h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f26388b.equals(gVar.f26388b);
    }

    public final boolean h() {
        boolean z10;
        a();
        gc.a aVar = (gc.a) this.f26393g.get();
        synchronized (aVar) {
            z10 = aVar.f18381b;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f26388b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f26388b).add("options", this.f26389c).toString();
    }
}
