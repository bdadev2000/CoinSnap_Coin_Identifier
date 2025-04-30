package u4;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import q4.C2642a;
import s4.InterfaceC2699a;
import v4.C2852d;
import v4.C2853e;
import v4.InterfaceC2851c;
import w4.C2864C;
import w4.C2891m0;
import w4.C2893n0;
import w4.C2895o0;
import w4.C2897p0;
import w4.K;
import w4.L;
import w4.O0;
import w4.P0;
import x0.AbstractC2914a;
import x4.C2923a;
import z4.C2972a;

/* renamed from: u4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2769n {

    /* renamed from: r, reason: collision with root package name */
    public static final L2.e f23134r = new L2.e(6);

    /* renamed from: a, reason: collision with root package name */
    public final Context f23135a;
    public final J1.B b;

    /* renamed from: c, reason: collision with root package name */
    public final k8.c f23136c;

    /* renamed from: d, reason: collision with root package name */
    public final z4.c f23137d;

    /* renamed from: e, reason: collision with root package name */
    public final U4.y f23138e;

    /* renamed from: f, reason: collision with root package name */
    public final C2778w f23139f;

    /* renamed from: g, reason: collision with root package name */
    public final z4.c f23140g;

    /* renamed from: h, reason: collision with root package name */
    public final O5.d f23141h;

    /* renamed from: i, reason: collision with root package name */
    public final C2853e f23142i;

    /* renamed from: j, reason: collision with root package name */
    public final r4.a f23143j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2699a f23144k;
    public final C2764i l;
    public final U4.p m;

    /* renamed from: n, reason: collision with root package name */
    public C2774s f23145n;

    /* renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f23146o = new TaskCompletionSource();

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f23147p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f23148q = new TaskCompletionSource();

    public C2769n(Context context, U4.y yVar, C2778w c2778w, J1.B b, z4.c cVar, k8.c cVar2, O5.d dVar, z4.c cVar3, C2853e c2853e, U4.p pVar, r4.a aVar, C2642a c2642a, C2764i c2764i) {
        new AtomicBoolean(false);
        this.f23135a = context;
        this.f23138e = yVar;
        this.f23139f = c2778w;
        this.b = b;
        this.f23140g = cVar;
        this.f23136c = cVar2;
        this.f23141h = dVar;
        this.f23137d = cVar3;
        this.f23142i = c2853e;
        this.f23143j = aVar;
        this.f23144k = c2642a;
        this.l = c2764i;
        this.m = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, w4.J] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, w4.N] */
    /* JADX WARN: Type inference failed for: r1v10, types: [w4.j0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [w4.B, java.lang.Object] */
    public static void a(C2769n c2769n, String str, Boolean bool) {
        int i9;
        Integer num;
        Map unmodifiableMap;
        c2769n.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String d2 = AbstractC2914a.d("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d2, null);
        }
        Locale locale = Locale.US;
        C2778w c2778w = c2769n.f23139f;
        O5.d dVar = c2769n.f23141h;
        String str2 = c2778w.f23181c;
        String str3 = (String) dVar.b;
        String str4 = c2778w.c().f23111a;
        if (dVar.f2206f != null) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        C2893n0 c2893n0 = new C2893n0(str2, str3, (String) dVar.f2203c, str4, com.mbridge.msdk.foundation.entity.o.c(i9), (r4.c) dVar.f2208h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C2897p0 c2897p0 = new C2897p0(str5, str6, AbstractC2762g.h());
        Context context = c2769n.f23135a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC2761f enumC2761f = EnumC2761f.b;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        EnumC2761f enumC2761f2 = EnumC2761f.b;
        if (isEmpty) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            EnumC2761f enumC2761f3 = (EnumC2761f) EnumC2761f.f23116c.get(str7.toLowerCase(locale));
            if (enumC2761f3 != null) {
                enumC2761f2 = enumC2761f3;
            }
        }
        int ordinal = enumC2761f2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = AbstractC2762g.b(context);
        boolean g9 = AbstractC2762g.g();
        int d9 = AbstractC2762g.d();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        c2769n.f23143j.d(str, currentTimeMillis, new C2891m0(c2893n0, c2897p0, new C2895o0(ordinal, str8, availableProcessors, b, blockCount, g9, d9, str9, str10)));
        if (bool.booleanValue() && str != null) {
            z4.c cVar = c2769n.f23137d;
            synchronized (((String) cVar.f24545a)) {
                try {
                    cVar.f24545a = str;
                    C2852d c2852d = (C2852d) ((AtomicMarkableReference) ((H0.b) cVar.f24547d).f1345c).getReference();
                    synchronized (c2852d) {
                        unmodifiableMap = Collections.unmodifiableMap(new HashMap(c2852d.f23612a));
                    }
                    List e4 = ((B3.g) cVar.f24549f).e();
                    if (((String) ((AtomicMarkableReference) cVar.f24550g).getReference()) != null) {
                        ((v4.g) cVar.b).i(str, (String) ((AtomicMarkableReference) cVar.f24550g).getReference());
                    }
                    if (!unmodifiableMap.isEmpty()) {
                        ((v4.g) cVar.b).g(str, unmodifiableMap, false);
                    }
                    if (!e4.isEmpty()) {
                        ((v4.g) cVar.b).h(str, e4);
                    }
                } finally {
                }
            }
        }
        C2853e c2853e = c2769n.f23142i;
        ((InterfaceC2851c) c2853e.b).a();
        c2853e.b = C2853e.f23614c;
        if (str != null) {
            c2853e.b = new v4.l(((z4.c) c2853e.f23615a).b(str, "userlog"));
        }
        c2769n.l.a(str);
        U4.p pVar = c2769n.m;
        C2773r c2773r = (C2773r) pVar.f3317a;
        c2773r.getClass();
        Charset charset = P0.f23775a;
        ?? obj = new Object();
        obj.f23686a = "19.0.3";
        O5.d dVar2 = c2773r.f23167c;
        String str11 = dVar2.f2204d;
        if (str11 != null) {
            obj.b = str11;
            C2778w c2778w2 = c2773r.b;
            String str12 = c2778w2.c().f23111a;
            if (str12 != null) {
                obj.f23688d = str12;
                obj.f23689e = c2778w2.c().b;
                obj.f23690f = c2778w2.c().f23112c;
                String str13 = (String) dVar2.b;
                if (str13 != null) {
                    obj.f23692h = str13;
                    String str14 = (String) dVar2.f2203c;
                    if (str14 != null) {
                        obj.f23693i = str14;
                        obj.f23687c = 4;
                        obj.m = (byte) (obj.m | 1);
                        ?? obj2 = new Object();
                        obj2.f23731f = false;
                        byte b8 = (byte) (obj2.m | 2);
                        obj2.f23729d = currentTimeMillis;
                        obj2.m = (byte) (b8 | 1);
                        if (str != null) {
                            obj2.b = str;
                            String str15 = C2773r.f23165g;
                            if (str15 != null) {
                                obj2.f23727a = str15;
                                String str16 = c2778w2.f23181c;
                                if (str16 != null) {
                                    String str17 = c2778w2.c().f23111a;
                                    r4.c cVar2 = (r4.c) dVar2.f2208h;
                                    if (((k8.c) cVar2.f22841d) == null) {
                                        cVar2.f22841d = new k8.c(cVar2);
                                    }
                                    k8.c cVar3 = (k8.c) cVar2.f22841d;
                                    String str18 = (String) cVar3.b;
                                    if (cVar3 == null) {
                                        cVar2.f22841d = new k8.c(cVar2);
                                    }
                                    obj2.f23732g = new L(str16, str13, str14, str17, str18, (String) ((k8.c) cVar2.f22841d).f21500c);
                                    ?? obj3 = new Object();
                                    obj3.f23894a = 3;
                                    obj3.f23897e = (byte) (obj3.f23897e | 1);
                                    obj3.b = str5;
                                    obj3.f23895c = str6;
                                    obj3.f23896d = AbstractC2762g.h();
                                    obj3.f23897e = (byte) (obj3.f23897e | 2);
                                    obj2.f23734i = obj3.a();
                                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                    int i10 = 7;
                                    if (!TextUtils.isEmpty(str7) && (num = (Integer) C2773r.f23164f.get(str7.toLowerCase(locale))) != null) {
                                        i10 = num.intValue();
                                    }
                                    int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                    long b9 = AbstractC2762g.b(c2773r.f23166a);
                                    long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                    boolean g10 = AbstractC2762g.g();
                                    int d10 = AbstractC2762g.d();
                                    ?? obj4 = new Object();
                                    obj4.f23752a = i10;
                                    byte b10 = (byte) (obj4.f23760j | 1);
                                    obj4.b = str8;
                                    obj4.f23753c = availableProcessors2;
                                    obj4.f23754d = b9;
                                    obj4.f23755e = blockCount2;
                                    obj4.f23756f = g10;
                                    byte b11 = (byte) (((byte) (((byte) (((byte) (2 | b10)) | 4)) | 8)) | Ascii.DLE);
                                    obj4.f23757g = d10;
                                    obj4.f23760j = (byte) (b11 | 32);
                                    obj4.f23758h = str9;
                                    obj4.f23759i = str10;
                                    obj2.f23735j = obj4.a();
                                    obj2.l = 3;
                                    obj2.m = (byte) (obj2.m | 4);
                                    obj.f23694j = obj2.a();
                                    C2864C a6 = obj.a();
                                    z4.c cVar4 = ((C2972a) pVar.b).b;
                                    O0 o02 = a6.f23704k;
                                    if (o02 == null) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str19 = ((K) o02).b;
                                    try {
                                        C2972a.f24538g.getClass();
                                        C2972a.f(cVar4.b(str19, "report"), C2923a.f24234a.m(a6));
                                        File b12 = cVar4.b(str19, "start-time");
                                        long j7 = ((K) o02).f23739d;
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), C2972a.f24536e);
                                        try {
                                            outputStreamWriter.write("");
                                            b12.setLastModified(j7 * 1000);
                                            outputStreamWriter.close();
                                        } finally {
                                        }
                                    } catch (IOException e9) {
                                        String d11 = AbstractC2914a.d("Could not persist report for session ", str19);
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", d11, e9);
                                        }
                                    }
                                } else {
                                    throw new NullPointerException("Null identifier");
                                }
                            } else {
                                throw new NullPointerException("Null generator");
                            }
                        } else {
                            throw new NullPointerException("Null identifier");
                        }
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                } else {
                    throw new NullPointerException("Null buildVersion");
                }
            } else {
                throw new NullPointerException("Null installationUuid");
            }
        } else {
            throw new NullPointerException("Null gmpAppId");
        }
    }

    public static Task b(C2769n c2769n) {
        Task call;
        c2769n.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : z4.c.e(((File) c2769n.f23140g.f24546c).listFiles(f23134r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new CallableC2768m(c2769n, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e() {
        /*
            java.lang.Class<u4.n> r0 = u4.C2769n.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
        L10:
            r0 = r1
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r1
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C2769n.e():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0769 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04c4 A[LOOP:2: B:70:0x04c4->B:76:0x04e1, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04fb  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v57, types: [w4.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v61, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r2v16, types: [w4.D, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14, types: [w4.D, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r31, B4.c r32) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C2769n.c(boolean, B4.c):void");
    }

    public final boolean d(B4.c cVar) {
        boolean z8;
        if (Boolean.TRUE.equals(((ThreadLocal) this.f23138e.f3336d).get())) {
            C2774s c2774s = this.f23145n;
            if (c2774s != null && c2774s.f23173e.get()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, cVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e4) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e4);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void f() {
        try {
            String e4 = e();
            if (e4 != null) {
                try {
                    this.f23137d.f(e4);
                } catch (IllegalArgumentException e9) {
                    Context context = this.f23135a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e9;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task g(Task task) {
        Task task2;
        Task task3;
        z4.c cVar = ((C2972a) this.m.b).b;
        boolean isEmpty = z4.c.e(((File) cVar.f24548e).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f23146o;
        if (isEmpty && z4.c.e(((File) cVar.f24549f).listFiles()).isEmpty() && z4.c.e(((File) cVar.f24550g).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        r4.d dVar = r4.d.f22842a;
        dVar.f("Crash reports are available to be sent.");
        J1.B b = this.b;
        if (b.c()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            dVar.c("Automatic data collection is disabled.");
            dVar.f("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (b.f1488c) {
                task2 = ((TaskCompletionSource) b.f1489d).getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            dVar.c("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f23147p.getTask();
            ExecutorService executorService = AbstractC2755B.f23108a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C2754A c2754a = new C2754A(1, taskCompletionSource2);
            onSuccessTask.continueWith(c2754a);
            task4.continueWith(c2754a);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new r4.c(this, task));
    }
}
