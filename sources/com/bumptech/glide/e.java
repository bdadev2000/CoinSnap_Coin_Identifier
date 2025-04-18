package com.bumptech.glide;

import android.app.AppOpsManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.InputEvent;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.a0;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.n1;
import androidx.datastore.preferences.protobuf.o1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.a1;
import com.adjust.sdk.Util;
import com.facebook.internal.t;
import com.facebook.internal.v;
import com.facebook.u0;
import com.facebook.x;
import com.google.common.collect.b1;
import com.google.common.collect.f2;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n0.t1;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class e {
    public static Field a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f9635b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f9636c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9637d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f9638e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f9639f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f9640g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f9641h;

    /* renamed from: i, reason: collision with root package name */
    public static final n1 f9642i = new n1();

    /* renamed from: j, reason: collision with root package name */
    public static final o1 f9643j = new o1();

    /* renamed from: k, reason: collision with root package name */
    public static final b0.g f9644k = new b0.g(4);

    /* renamed from: l, reason: collision with root package name */
    public static boolean f9645l;

    /* renamed from: m, reason: collision with root package name */
    public static long f9646m;

    /* renamed from: n, reason: collision with root package name */
    public static UiModeManager f9647n;

    public static String B(int i10, int[] iArr, int[] iArr2, String[] strArr) {
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = strArr[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb2.append(iArr2[i11]);
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
        }
        return sb2.toString();
    }

    public static ArrayList C(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void D(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static boolean F(Context context) {
        boolean z10;
        ((p000if.f) ((lh.a) com.facebook.appevents.o.i(context, lh.a.class))).getClass();
        int i10 = b1.f11907d;
        f2 f2Var = f2.f11947l;
        if (f2Var.f11952j <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.facebook.internal.i.j(z10, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (f2Var.isEmpty()) {
            return true;
        }
        return ((Boolean) ((com.google.common.collect.a) f2Var.iterator()).next()).booleanValue();
    }

    public static final float[] G(float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return (float[]) matrix.clone();
    }

    public static ze.e H(int i10) {
        return new ze.e(new w3.l(i10, 6));
    }

    public static ze.e I(int i10) {
        return new ze.e(new w3.l(i10, 4));
    }

    public static ze.e J(int i10) {
        return new ze.e(new w3.l(i10, 7));
    }

    public static ze.e K(int i10) {
        return new ze.e(new w3.l(i10, 5));
    }

    public static float L(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.e.c(edgeEffect, f10, f11);
        }
        t0.d.a(edgeEffect, f10, f11);
        return f10;
    }

    public static final void Q(View view, a0 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static void R(Window window, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT >= 30) {
            t1.a(window, z10);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z10) {
            i10 = systemUiVisibility & (-1793);
        } else {
            i10 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i10);
    }

    public static final void S(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextColor(d0.h.getColor(textView.getContext(), R.color.white));
    }

    public static ze.d T() {
        return new ze.d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object U(java.lang.Exception r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof ni.w
            if (r0 == 0) goto L13
            r0 = r6
            ni.w r0 = (ni.w) r0
            int r1 = r0.f22893c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22893c = r1
            goto L18
        L13:
            ni.w r0 = new ni.w
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22892b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f22893c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.getClass()
            r0.f22893c = r3
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            he.c r3 = new he.c
            r4 = 13
            r3.<init>(r0, r5, r4)
            r6.mo1714dispatch(r2, r3)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L58
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L58:
            if (r5 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.U(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void V(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static int a(String str, int i10) {
        return (Util.hashString(str) + i10) * 37;
    }

    public static String b(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static ze.e e(ze.c... cVarArr) {
        return new ze.e(cVarArr, 0);
    }

    public static ze.e f(ze.a aVar) {
        return new ze.e(new qd.b(aVar.c(), 0.0f));
    }

    public static ze.d g() {
        return new ze.d(0);
    }

    public static boolean h(g0.k[] kVarArr, g0.k[] kVarArr2) {
        if (kVarArr == null || kVarArr2 == null || kVarArr.length != kVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            g0.k kVar = kVarArr[i10];
            char c10 = kVar.a;
            g0.k kVar2 = kVarArr2[i10];
            if (c10 != kVar2.a || kVar.f17915b.length != kVar2.f17915b.length) {
                return false;
            }
        }
        return true;
    }

    public static void i(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void j(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int k(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return m(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int m(Context context, String str, int i10, int i11, String str2) {
        boolean z10;
        int c10;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String d10 = androidx.core.app.m.d(str);
        if (d10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i11 && Objects.equals(packageName, str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c11 = androidx.core.app.n.c(context);
                c10 = androidx.core.app.n.a(c11, d10, Binder.getCallingUid(), str2);
                if (c10 == 0) {
                    c10 = androidx.core.app.n.a(c11, d10, i11, androidx.core.app.n.b(context));
                }
            } else {
                c10 = androidx.core.app.m.c((AppOpsManager) androidx.core.app.m.a(context, AppOpsManager.class), d10, str2);
            }
        } else {
            c10 = androidx.core.app.m.c((AppOpsManager) androidx.core.app.m.a(context, AppOpsManager.class), d10, str2);
        }
        if (c10 == 0) {
            return 0;
        }
        return -2;
    }

    public static int n(Context context, String str) {
        return m(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int o(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final void p(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new nf.a(0, action));
    }

    public static Rect q(ze.b bVar, ze.a aVar) {
        boolean z10;
        int round;
        int i10 = bVar.f28749b;
        float c10 = aVar.c();
        int i11 = bVar.f28749b;
        int i12 = bVar.f28750c;
        float abs = Math.abs(c10 - ze.a.a(i11, i12).c());
        int i13 = 0;
        if (abs <= 5.0E-4f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Rect(0, 0, i10, i12);
        }
        if (ze.a.a(i10, i12).c() > aVar.c()) {
            int round2 = Math.round(aVar.c() * i12);
            int round3 = Math.round((i10 - round2) / 2.0f);
            i10 = round2;
            round = 0;
            i13 = round3;
        } else {
            int round4 = Math.round(i10 / aVar.c());
            round = Math.round((i12 - round4) / 2.0f);
            i12 = round4;
        }
        return new Rect(i13, round, i10 + i13, i12 + round);
    }

    public static float[] r(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i11 = i10 - 0;
                int min = Math.min(i11, length - 0);
                float[] fArr2 = new float[i11];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[Catch: NumberFormatException -> 0x00c8, LOOP:3: B:25:0x006e->B:36:0x009f, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:22:0x0055, B:24:0x0069, B:25:0x006e, B:27:0x0074, B:32:0x0082, B:36:0x009f, B:51:0x008a, B:55:0x0093, B:39:0x00a2, B:41:0x00a6, B:42:0x00b3, B:47:0x00b8, B:61:0x00bd), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[Catch: NumberFormatException -> 0x00c8, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:22:0x0055, B:24:0x0069, B:25:0x006e, B:27:0x0074, B:32:0x0082, B:36:0x009f, B:51:0x008a, B:55:0x0093, B:39:0x00a2, B:41:0x00a6, B:42:0x00b3, B:47:0x00b8, B:61:0x00bd), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[Catch: NumberFormatException -> 0x00c8, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:22:0x0055, B:24:0x0069, B:25:0x006e, B:27:0x0074, B:32:0x0082, B:36:0x009f, B:51:0x008a, B:55:0x0093, B:39:0x00a2, B:41:0x00a6, B:42:0x00b3, B:47:0x00b8, B:61:0x00bd), top: B:21:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g0.k[] s(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.e.s(java.lang.String):g0.k[]");
    }

    public static Path t(String str) {
        Path path = new Path();
        try {
            g0.k.b(s(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static g0.k[] u(g0.k[] kVarArr) {
        g0.k[] kVarArr2 = new g0.k[kVarArr.length];
        for (int i10 = 0; i10 < kVarArr.length; i10++) {
            kVarArr2[i10] = new g0.k(kVarArr[i10]);
        }
        return kVarArr2;
    }

    public static final void w(Throwable th2) {
        HashMap hashMap;
        t feature;
        boolean startsWith$default;
        if (f9645l && th2 != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                v vVar = v.a;
                String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                Intrinsics.checkNotNullParameter(className, "className");
                synchronized (v.a) {
                    hashMap = v.f11103b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(t.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(t.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(t.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(t.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(t.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(t.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(t.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(t.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(t.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(t.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        hashMap.put(t.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        hashMap.put(t.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(t.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(t.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(t.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        feature = (t) entry.getKey();
                        String[] strArr = (String[]) entry.getValue();
                        int length = strArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            String str = strArr[i10];
                            i10++;
                            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(className, str, false, 2, null);
                            if (startsWith$default) {
                                break;
                            }
                        }
                    } else {
                        feature = t.Unknown;
                        break;
                    }
                }
                if (feature != t.Unknown) {
                    v vVar2 = v.a;
                    Intrinsics.checkNotNullParameter(feature, "feature");
                    SharedPreferences.Editor edit = x.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit();
                    feature.getClass();
                    edit.putString(Intrinsics.stringPlus("FBSDKFeature", feature), "16.1.3").apply();
                    hashSet.add(feature.toString());
                }
            }
            x xVar = x.a;
            if (u0.b() && (!hashSet.isEmpty())) {
                JSONArray features = new JSONArray((Collection) hashSet);
                Intrinsics.checkNotNullParameter(features, "features");
                new j6.c(features).c();
            }
        }
    }

    public static nh.f x(ComponentActivity componentActivity, a1 a1Var) {
        qa.a a10 = ((p000if.a) ((nh.a) com.facebook.internal.i.r(nh.a.class, componentActivity))).a();
        Set set = (Set) a10.f23736c;
        a1Var.getClass();
        return new nh.f(set, a1Var, (mh.a) a10.f23737d);
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static nh.f z(Fragment fragment, a1 a1Var) {
        qa.a a10 = ((p000if.d) ((nh.b) com.facebook.internal.i.r(nh.b.class, fragment))).a.a();
        Set set = (Set) a10.f23736c;
        a1Var.getClass();
        return new nh.f(set, a1Var, (mh.a) a10.f23737d);
    }

    public abstract Object A(Continuation continuation);

    public abstract Object M(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object N(Uri uri, Continuation continuation);

    public abstract Object O(s1.c cVar, Continuation continuation);

    public abstract Object P(s1.d dVar, Continuation continuation);

    public abstract Object v(s1.a aVar, Continuation continuation);
}
