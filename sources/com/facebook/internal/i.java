package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.e1;
import androidx.lifecycle.y0;
import com.plantcare.ai.identifier.plantid.R;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static Thread f11038b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f11039c = true;
    public static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: d, reason: collision with root package name */
    public static final boolean[] f11040d = new boolean[3];

    public static final boolean A(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetworkInfo() != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            Intrinsics.checkNotNull(activeNetworkInfo);
            if (activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public static Drawable B(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            j.f fVar = new j.f(context, theme);
            fVar.a(theme.getResources().getConfiguration());
            context = fVar;
        }
        return com.bumptech.glide.c.t(context, i10);
    }

    public static h4.c C(x3.c cVar, m3.j jVar) {
        return new h4.c(w3.q.a(cVar, jVar, 1.0f, b6.b.f2298j, false), 0);
    }

    public static s3.a D(x3.b bVar, m3.j jVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = y3.h.c();
        } else {
            f10 = 1.0f;
        }
        return new s3.a(w3.q.a(bVar, jVar, f10, c6.m.f2668g, false));
    }

    public static h4.c E(x3.c cVar, m3.j jVar) {
        return new h4.c(w3.q.a(cVar, jVar, 1.0f, d6.h.f16899f, false), 2);
    }

    public static h4.c F(x3.c cVar, m3.j jVar) {
        return new h4.c(w3.q.a(cVar, jVar, y3.h.c(), e6.g.f17134g, true), 3);
    }

    public static final Cursor G(v1.f0 db2, v1.j0 sqLiteQuery) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        return db2.query(sqLiteQuery, null);
    }

    public static final void H(View view, androidx.lifecycle.v vVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, vVar);
    }

    public static int I(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, Exception exc) {
        if (ud.a.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void d(kd.i iVar) {
        if (iVar.f20673f) {
            h(iVar);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    public static final void e(ai.a aVar, ai.c cVar, String str) {
        ai.f.f499h.getClass();
        Logger logger = ai.f.f501j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.f493b);
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(aVar.a);
        logger.fine(sb2.toString());
    }

    public static final e1 f(Lazy lazy) {
        return (e1) lazy.getValue();
    }

    public static s.l g(Deferred this_asListenableFuture) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "<this>");
        s.j completer = new s.j();
        s.l lVar = new s.l(completer);
        completer.f24146b = lVar;
        completer.a = androidx.fragment.app.e.class;
        try {
            Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
            Intrinsics.checkNotNullParameter(completer, "completer");
            this_asListenableFuture.invokeOnCompletion(new p1.a(0, completer, this_asListenableFuture));
            completer.a = "Deferred.asListenableFuture";
        } catch (Exception e2) {
            lVar.f24151c.i(e2);
        }
        Intrinsics.checkNotNullExpressionValue(lVar, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return lVar;
    }

    public static void h(kd.i iVar) {
        if (!iVar.f20674g) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void i(w.f fVar, t.d dVar, w.e eVar) {
        eVar.f26607o = -1;
        eVar.f26609p = -1;
        int i10 = fVar.f26610p0[0];
        int[] iArr = eVar.f26610p0;
        if (i10 != 2 && iArr[0] == 4) {
            w.d dVar2 = eVar.I;
            int i11 = dVar2.f26577g;
            int r6 = fVar.r();
            w.d dVar3 = eVar.K;
            int i12 = r6 - dVar3.f26577g;
            dVar2.f26579i = dVar.k(dVar2);
            dVar3.f26579i = dVar.k(dVar3);
            dVar.d(dVar2.f26579i, i11);
            dVar.d(dVar3.f26579i, i12);
            eVar.f26607o = 2;
            eVar.Y = i11;
            int i13 = i12 - i11;
            eVar.U = i13;
            int i14 = eVar.f26582b0;
            if (i13 < i14) {
                eVar.U = i14;
            }
        }
        if (fVar.f26610p0[1] != 2 && iArr[1] == 4) {
            w.d dVar4 = eVar.J;
            int i15 = dVar4.f26577g;
            int l10 = fVar.l();
            w.d dVar5 = eVar.L;
            int i16 = l10 - dVar5.f26577g;
            dVar4.f26579i = dVar.k(dVar4);
            dVar5.f26579i = dVar.k(dVar5);
            dVar.d(dVar4.f26579i, i15);
            dVar.d(dVar5.f26579i, i16);
            if (eVar.f26580a0 > 0 || eVar.f26592g0 == 8) {
                w.d dVar6 = eVar.M;
                t.i k10 = dVar.k(dVar6);
                dVar6.f26579i = k10;
                dVar.d(k10, eVar.f26580a0 + i15);
            }
            eVar.f26609p = 2;
            eVar.Z = i15;
            int i17 = i16 - i15;
            eVar.V = i17;
            int i18 = eVar.f26584c0;
            if (i17 < i18) {
                eVar.V = i18;
            }
        }
    }

    public static void j(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final y0 l(Fragment fragment, KClass viewModelClass, of.c storeProducer, of.d extrasProducer, of.e eVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new y0(viewModelClass, storeProducer, eVar, extrasProducer);
    }

    public static boolean m(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (m(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static final void n(z1.a db2) {
        boolean startsWith$default;
        Intrinsics.checkNotNullParameter(db2, "db");
        List createListBuilder = CollectionsKt.createListBuilder();
        Cursor O = db2.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = O;
            while (cursor.moveToNext()) {
                createListBuilder.add(cursor.getString(0));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(O, null);
            for (String triggerName : CollectionsKt.build(createListBuilder)) {
                Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(triggerName, "room_fts_content_sync_", false, 2, null);
                if (startsWith$default) {
                    db2.C("DROP TRIGGER IF EXISTS " + triggerName);
                }
            }
        } finally {
        }
    }

    public static void o(kd.i iVar) {
        if (iVar.f20669b.g()) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static final boolean p(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final String q(long j3) {
        String str;
        if (j3 <= -999500000) {
            str = ((j3 - 500000000) / 1000000000) + " s ";
        } else if (j3 <= -999500) {
            str = ((j3 - 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else if (j3 <= 0) {
            str = ((j3 - 500) / 1000) + " µs";
        } else if (j3 < 999500) {
            str = ((j3 + 500) / 1000) + " µs";
        } else if (j3 < 999500000) {
            str = ((j3 + 500000) / DurationKt.NANOS_IN_MILLIS) + " ms";
        } else {
            str = ((j3 + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return com.applovin.impl.mediation.ads.e.h(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }

    public static Object r(Class cls, Object obj) {
        if (obj instanceof ph.a) {
            return cls.cast(obj);
        }
        if (obj instanceof ph.b) {
            return r(cls, ((ph.b) obj).d());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), ph.a.class, ph.b.class));
    }

    public static final String s() {
        if (m6.a.b(i.class)) {
            return null;
        }
        try {
            Context a10 = com.facebook.x.a();
            List<ResolveInfo> queryIntentServices = a10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet hashSet = ArraysKt.toHashSet(a);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(i.class, th2);
            return null;
        }
    }

    public static final String t() {
        if (m6.a.b(i.class)) {
            return null;
        }
        try {
            return Intrinsics.stringPlus("fbconnect://cct.", com.facebook.x.a().getPackageName());
        } catch (Throwable th2) {
            m6.a.a(i.class, th2);
            return null;
        }
    }

    public static Drawable u(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f11039c) {
                return B(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return d0.h.getDrawable(context2, i10);
            }
            throw e2;
        } catch (NoClassDefFoundError unused2) {
            f11039c = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = f0.q.a;
        return f0.i.a(resources, i10, theme);
    }

    public static final LifecycleCoroutineScopeImpl v(androidx.lifecycle.v vVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.a.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            boolean z10 = true;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
            AtomicReference atomicReference = lifecycle.a;
            while (true) {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    break;
                }
                if (atomicReference.get() != null) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScopeImpl, Dispatchers.getMain().getImmediate(), null, new androidx.lifecycle.q(lifecycleCoroutineScopeImpl, null), 2, null);
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final CoroutineDispatcher w(v1.f0 f0Var) {
        Map<String, Object> backingFieldMap = f0Var.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = ExecutorsKt.from(f0Var.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }

    public static final CoroutineDispatcher x(v1.f0 f0Var) {
        Map<String, Object> backingFieldMap = f0Var.getBackingFieldMap();
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            obj = ExecutorsKt.from(f0Var.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (CoroutineDispatcher) obj;
    }

    public static final String y(String developerDefinedRedirectURI) {
        if (m6.a.b(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            int i10 = x5.i.a;
            if (x5.i.g(com.facebook.x.a(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            if (x5.i.g(com.facebook.x.a(), t())) {
                return t();
            }
            return "";
        } catch (Throwable th2) {
            m6.a.a(i.class, th2);
            return null;
        }
    }

    public static String z(String str, String str2) {
        Pattern pattern = jd.c.a;
        String str3 = "<script type=\"text/javascript\">" + str + "</script>";
        c(str2, "HTML is null or empty");
        ArrayList arrayList = new ArrayList();
        int length = str2.length();
        int i10 = 0;
        while (i10 < length) {
            int indexOf = str2.indexOf("<!--", i10);
            if (indexOf >= 0) {
                int indexOf2 = str2.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i10 = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i10 = length;
        }
        int[][] iArr2 = (int[][]) arrayList.toArray((int[][]) Array.newInstance((Class<?>) Integer.TYPE, 0, 2));
        StringBuilder sb2 = new StringBuilder(str3.length() + str2.length() + 16);
        if (jd.c.b(str2, sb2, jd.c.f20013b, str3, iArr2) || jd.c.a(str2, sb2, jd.c.a, str3, iArr2) || jd.c.b(str2, sb2, jd.c.f20015d, str3, iArr2) || jd.c.a(str2, sb2, jd.c.f20014c, str3, iArr2) || jd.c.b(str2, sb2, jd.c.f20017f, str3, iArr2) || jd.c.a(str2, sb2, jd.c.f20016e, str3, iArr2) || jd.c.a(str2, sb2, jd.c.f20018g, str3, iArr2)) {
            return sb2.toString();
        }
        return str3.concat(str2);
    }

    public abstract List k(List list, String str);
}
