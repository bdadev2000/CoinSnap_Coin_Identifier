package v1;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class c0 {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f25846b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25847c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25848d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25849e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f25850f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f25851g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f25852h;

    /* renamed from: i, reason: collision with root package name */
    public z1.f f25853i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25854j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f25855k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25856l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25857m;

    /* renamed from: n, reason: collision with root package name */
    public final long f25858n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.work.g f25859o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f25860p;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f25861q;

    public c0(Context context, Class klass, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.a = context;
        this.f25846b = klass;
        this.f25847c = str;
        this.f25848d = new ArrayList();
        this.f25849e = new ArrayList();
        this.f25850f = new ArrayList();
        this.f25855k = e0.AUTOMATIC;
        this.f25856l = true;
        this.f25858n = -1L;
        this.f25859o = new androidx.work.g(0);
        this.f25860p = new LinkedHashSet();
    }

    public final void a(w1.a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f25861q == null) {
            this.f25861q = new HashSet();
        }
        for (w1.a aVar : migrations) {
            HashSet hashSet = this.f25861q;
            Intrinsics.checkNotNull(hashSet);
            hashSet.add(Integer.valueOf(aVar.a));
            HashSet hashSet2 = this.f25861q;
            Intrinsics.checkNotNull(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f26667b));
        }
        this.f25859o.a((w1.a[]) Arrays.copyOf(migrations, migrations.length));
    }

    public final f0 b() {
        boolean z10;
        String replace$default;
        boolean z11;
        String str;
        ActivityManager activityManager;
        Executor executor = this.f25851g;
        if (executor == null && this.f25852h == null) {
            l.a aVar = l.b.f21084k;
            this.f25852h = aVar;
            this.f25851g = aVar;
        } else if (executor != null && this.f25852h == null) {
            this.f25852h = executor;
        } else if (executor == null) {
            this.f25851g = this.f25852h;
        }
        HashSet hashSet = this.f25861q;
        LinkedHashSet linkedHashSet = this.f25860p;
        if (hashSet != null) {
            Intrinsics.checkNotNull(hashSet);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(eb.j.i("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        z1.f fVar = this.f25853i;
        if (fVar == null) {
            fVar = new a6.c();
        }
        z1.f fVar2 = fVar;
        if (this.f25858n > 0) {
            if (this.f25847c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        Context context = this.a;
        String str2 = this.f25847c;
        androidx.work.g gVar = this.f25859o;
        ArrayList arrayList = this.f25848d;
        boolean z12 = this.f25854j;
        e0 e0Var = this.f25855k;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (e0Var == e0.AUTOMATIC) {
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager != null) {
                Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                if (!activityManager.isLowRamDevice()) {
                    e0Var = e0.WRITE_AHEAD_LOGGING;
                }
            }
            e0Var = e0.TRUNCATE;
        }
        Executor executor2 = this.f25851g;
        if (executor2 != null) {
            Executor executor3 = this.f25852h;
            if (executor3 != null) {
                j jVar = new j(context, str2, fVar2, gVar, arrayList, z12, e0Var, executor2, executor3, this.f25856l, this.f25857m, linkedHashSet, this.f25849e, this.f25850f);
                Class klass = this.f25846b;
                Intrinsics.checkNotNullParameter(klass, "klass");
                Intrinsics.checkNotNullParameter("_Impl", "suffix");
                Package r52 = klass.getPackage();
                Intrinsics.checkNotNull(r52);
                String fullPackage = r52.getName();
                String canonicalName = klass.getCanonicalName();
                Intrinsics.checkNotNull(canonicalName);
                Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
                if (fullPackage.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    canonicalName = canonicalName.substring(fullPackage.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                StringBuilder sb2 = new StringBuilder();
                replace$default = StringsKt__StringsJVMKt.replace$default(canonicalName, '.', '_', false, 4, (Object) null);
                sb2.append(replace$default);
                sb2.append("_Impl");
                String sb3 = sb2.toString();
                try {
                    if (fullPackage.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        str = sb3;
                    } else {
                        str = fullPackage + '.' + sb3;
                    }
                    Class<?> cls = Class.forName(str, true, klass.getClassLoader());
                    Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                    f0 f0Var = (f0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    f0Var.init(jVar);
                    return f0Var;
                } catch (ClassNotFoundException unused) {
                    throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + sb3 + " does not exist");
                } catch (IllegalAccessException unused2) {
                    throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
                } catch (InstantiationException unused3) {
                    throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
