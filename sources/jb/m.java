package jb;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.internal.k0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.c1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import mb.b0;
import mb.i0;
import mb.j0;
import mb.m0;
import mb.m1;
import mb.p1;
import mb.q1;
import mb.r1;
import mb.r2;
import mb.s1;
import mb.s2;
import mb.y1;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: r, reason: collision with root package name */
    public static final k0 f19904r = new k0(6);
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final t f19905b;

    /* renamed from: c, reason: collision with root package name */
    public final qa.a f19906c;

    /* renamed from: d, reason: collision with root package name */
    public final ob.c f19907d;

    /* renamed from: e, reason: collision with root package name */
    public final kb.d f19908e;

    /* renamed from: f, reason: collision with root package name */
    public final x f19909f;

    /* renamed from: g, reason: collision with root package name */
    public final ob.c f19910g;

    /* renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.d f19911h;

    /* renamed from: i, reason: collision with root package name */
    public final lb.e f19912i;

    /* renamed from: j, reason: collision with root package name */
    public final gb.a f19913j;

    /* renamed from: k, reason: collision with root package name */
    public final hb.a f19914k;

    /* renamed from: l, reason: collision with root package name */
    public final i f19915l;

    /* renamed from: m, reason: collision with root package name */
    public final ob.c f19916m;

    /* renamed from: n, reason: collision with root package name */
    public s f19917n;

    /* renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f19918o = new TaskCompletionSource();

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f19919p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f19920q = new TaskCompletionSource();

    public m(Context context, x xVar, t tVar, ob.c cVar, qa.a aVar, android.support.v4.media.d dVar, ob.c cVar2, lb.e eVar, ob.c cVar3, gb.a aVar2, hb.a aVar3, i iVar, kb.d dVar2) {
        new AtomicBoolean(false);
        this.a = context;
        this.f19909f = xVar;
        this.f19905b = tVar;
        this.f19910g = cVar;
        this.f19906c = aVar;
        this.f19911h = dVar;
        this.f19907d = cVar2;
        this.f19912i = eVar;
        this.f19913j = aVar2;
        this.f19914k = aVar3;
        this.f19915l = iVar;
        this.f19916m = cVar3;
        this.f19908e = dVar2;
    }

    public static Task a(m mVar) {
        boolean z10;
        Task call;
        mVar.getClass();
        b6.a aVar = b6.a.f2288f;
        ArrayList arrayList = new ArrayList();
        for (File file : ob.c.s(((File) mVar.f19910g.f23293c).listFiles(f19904r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    aVar.i("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } else {
                    aVar.d("Logging app exception event to Firebase Analytics", null);
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new l(mVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                aVar.i("Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e() {
        /*
            java.lang.Class<jb.m> r0 = jb.m.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            b6.a r1 = b6.a.f2288f
            r2 = 0
            if (r0 != 0) goto L11
            java.lang.String r0 = "Couldn't get Class Loader"
            r1.i(r0, r2)
            goto L1e
        L11:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "No version control information found"
            r1.f(r0)
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L22
            return r2
        L22:
            java.lang.String r3 = "Read version control info"
            r1.d(r3, r2)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L30:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L3c
            r1.write(r2, r5, r3)
            goto L30
        L3c:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.m.e():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x072a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04c8 A[LOOP:2: B:54:0x04c8->B:56:0x04ce, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0500  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r22v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r22, m2.l r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.m.b(boolean, m2.l, boolean):void");
    }

    public final void c(Boolean bool, String str) {
        int i10;
        Locale locale;
        int i11;
        Integer num;
        Map unmodifiableMap;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        b6.a aVar = b6.a.f2288f;
        aVar.d("Opening a new session with ID " + str, null);
        Locale locale2 = Locale.US;
        String format = String.format(locale2, "Crashlytics Android SDK/%s", "19.2.1");
        x xVar = this.f19909f;
        android.support.v4.media.d dVar = this.f19911h;
        String str2 = xVar.f19969c;
        String str3 = (String) dVar.f527g;
        String str4 = (String) dVar.f528h;
        String str5 = xVar.c().a;
        if (((String) dVar.f525e) != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        q1 q1Var = new q1(str2, str3, str4, str5, eb.j.b(i10), (qa.a) dVar.f529i);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(str6, str7, g.n());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.UNKNOWN;
        String str8 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str8);
        f fVar2 = f.UNKNOWN;
        if (isEmpty) {
            aVar.h("Architecture#getValue()::Build.CPU_ABI returned null or empty");
            locale = locale2;
        } else {
            locale = locale2;
            f fVar3 = (f) f.f19882c.get(str8.toLowerCase(locale));
            if (fVar3 != null) {
                fVar2 = fVar3;
            }
        }
        int ordinal = fVar2.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a = g.a(context);
        boolean m10 = g.m();
        int f10 = g.f();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        ((gb.b) this.f19913j).d(str, format, currentTimeMillis, new p1(q1Var, s1Var, new r1(ordinal, str9, availableProcessors, a, blockCount, m10, f10, str10, str11)));
        if (bool.booleanValue() && str != null) {
            ob.c cVar = this.f19907d;
            synchronized (((String) cVar.a)) {
                cVar.a = str;
                lb.d dVar2 = (lb.d) ((AtomicMarkableReference) ((h3.a) cVar.f23294d).f18723d).getReference();
                synchronized (dVar2) {
                    unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar2.a));
                }
                ((kb.d) cVar.f23293c).f20634b.a(new c3.b(10, cVar, str, unmodifiableMap, ((lb.o) cVar.f23296f).a()));
            }
        }
        this.f19912i.a(str);
        h hVar = this.f19915l.f19894b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f19892b, str)) {
                ob.c cVar2 = hVar.a;
                String str12 = hVar.f19893c;
                if (str != null && str12 != null) {
                    try {
                        cVar2.o(str, "aqs.".concat(str12)).createNewFile();
                    } catch (IOException e2) {
                        b6.a.f2288f.i("Failed to persist App Quality Sessions session id.", e2);
                    }
                }
                hVar.f19892b = str;
            }
        }
        ob.c cVar3 = this.f19916m;
        r rVar = (r) cVar3.a;
        rVar.getClass();
        Charset charset = s2.a;
        mb.a0 a0Var = new mb.a0();
        a0Var.a = "19.2.1";
        android.support.v4.media.d dVar3 = rVar.f19945c;
        String str13 = (String) dVar3.f522b;
        if (str13 != null) {
            a0Var.f21819b = str13;
            x xVar2 = rVar.f19944b;
            String str14 = xVar2.c().a;
            if (str14 != null) {
                a0Var.f21821d = str14;
                a0Var.f21822e = xVar2.c().f19875b;
                a0Var.f21823f = xVar2.c().f19876c;
                Object obj = dVar3.f527g;
                String str15 = (String) obj;
                if (str15 != null) {
                    a0Var.f21825h = str15;
                    Object obj2 = dVar3.f528h;
                    String str16 = (String) obj2;
                    if (str16 != null) {
                        a0Var.f21826i = str16;
                        a0Var.f21820c = 4;
                        a0Var.f21830m = (byte) (a0Var.f21830m | 1);
                        i0 i0Var = new i0();
                        i0Var.f21941f = false;
                        byte b3 = (byte) (i0Var.f21948m | 2);
                        i0Var.f21939d = currentTimeMillis;
                        i0Var.f21948m = (byte) (b3 | 1);
                        if (str != null) {
                            i0Var.f21937b = str;
                            String str17 = r.f19943g;
                            if (str17 != null) {
                                i0Var.a = str17;
                                ob.c cVar4 = new ob.c();
                                String str18 = xVar2.f19969c;
                                if (str18 != null) {
                                    cVar4.a = str18;
                                    String str19 = (String) obj;
                                    if (str19 != null) {
                                        cVar4.f23292b = str19;
                                        cVar4.f23293c = (String) obj2;
                                        cVar4.f23295e = xVar2.c().a;
                                        qa.a aVar2 = (qa.a) dVar3.f529i;
                                        if (((c1) aVar2.f23737d) == null) {
                                            aVar2.f23737d = new c1(aVar2);
                                        }
                                        cVar4.f23296f = (String) ((c1) aVar2.f23737d).f11923b;
                                        qa.a aVar3 = (qa.a) dVar3.f529i;
                                        if (((c1) aVar3.f23737d) == null) {
                                            aVar3.f23737d = new c1(aVar3);
                                        }
                                        cVar4.f23297g = (String) ((c1) aVar3.f23737d).f11924c;
                                        i0Var.f21942g = cVar4.k();
                                        m1 m1Var = new m1();
                                        m1Var.a = 3;
                                        m1Var.f22013e = (byte) (m1Var.f22013e | 1);
                                        m1Var.f22010b = str6;
                                        m1Var.f22011c = str7;
                                        m1Var.f22012d = g.n();
                                        m1Var.f22013e = (byte) (m1Var.f22013e | 2);
                                        i0Var.f21944i = m1Var.a();
                                        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                        if (TextUtils.isEmpty(str8) || (num = (Integer) r.f19942f.get(str8.toLowerCase(locale))) == null) {
                                            i11 = 7;
                                        } else {
                                            i11 = num.intValue();
                                        }
                                        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                        long a10 = g.a(rVar.a);
                                        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                        boolean m11 = g.m();
                                        int f11 = g.f();
                                        m0 m0Var = new m0();
                                        m0Var.a = i11;
                                        byte b10 = (byte) (m0Var.f22009j | 1);
                                        m0Var.f22001b = str9;
                                        m0Var.f22002c = availableProcessors2;
                                        m0Var.f22003d = a10;
                                        m0Var.f22004e = blockCount2;
                                        m0Var.f22005f = m11;
                                        byte b11 = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | Ascii.DLE);
                                        m0Var.f22006g = f11;
                                        m0Var.f22009j = (byte) (b11 | 32);
                                        m0Var.f22007h = str10;
                                        m0Var.f22008i = str11;
                                        i0Var.f21945j = m0Var.a();
                                        i0Var.f21947l = 3;
                                        i0Var.f21948m = (byte) (i0Var.f21948m | 4);
                                        a0Var.f21827j = i0Var.a();
                                        b0 a11 = a0Var.a();
                                        ob.c cVar5 = ((ob.a) cVar3.f23292b).f23289b;
                                        r2 r2Var = a11.f21851k;
                                        if (r2Var == null) {
                                            aVar.d("Could not get session for report", null);
                                            return;
                                        }
                                        String str20 = ((j0) r2Var).f21965b;
                                        try {
                                            ob.a.f23286g.getClass();
                                            ob.a.e(cVar5.o(str20, "report"), nb.c.a.c(a11));
                                            File o10 = cVar5.o(str20, "start-time");
                                            long j3 = ((j0) r2Var).f21967d;
                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(o10), ob.a.f23284e);
                                            try {
                                                outputStreamWriter.write("");
                                                o10.setLastModified(j3 * 1000);
                                                outputStreamWriter.close();
                                            } finally {
                                            }
                                        } catch (IOException e10) {
                                            aVar.d("Could not persist report for session " + str20, e10);
                                        }
                                    } else {
                                        throw new NullPointerException("Null version");
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

    public final boolean d(m2.l lVar) {
        boolean z10;
        kb.d.a();
        s sVar = this.f19917n;
        if (sVar != null && sVar.f19951e.get()) {
            z10 = true;
        } else {
            z10 = false;
        }
        b6.a aVar = b6.a.f2288f;
        if (z10) {
            aVar.i("Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        aVar.h("Finalizing previously open sessions.");
        try {
            b(true, lVar, true);
            aVar.h("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            aVar.e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    public final void f() {
        boolean z10;
        b6.a aVar = b6.a.f2288f;
        try {
            String e2 = e();
            if (e2 != null) {
                try {
                    this.f19907d.u(e2);
                } catch (IllegalArgumentException e10) {
                    Context context = this.a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            throw e10;
                        }
                    }
                    aVar.e("Attempting to set custom attribute with null key, ignoring.", null);
                }
                aVar.f("Saved version control info");
            }
        } catch (IOException e11) {
            aVar.i("Unable to save version control info", e11);
        }
    }

    public final void g(Task task) {
        boolean z10;
        Task task2;
        Task h10;
        ob.c cVar = ((ob.a) this.f19916m.f23292b).f23289b;
        if (ob.c.s(((File) cVar.f23295e).listFiles()).isEmpty() && ob.c.s(((File) cVar.f23296f).listFiles()).isEmpty() && ob.c.s(((File) cVar.f23297g).listFiles()).isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        TaskCompletionSource taskCompletionSource = this.f19918o;
        b6.a aVar = b6.a.f2288f;
        if (!z10) {
            aVar.h("No crash reports are available to be sent.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        aVar.h("Crash reports are available to be sent.");
        t tVar = this.f19905b;
        if (tVar.a()) {
            aVar.d("Automatic data collection is enabled. Allowing upload.", null);
            taskCompletionSource.trySetResult(Boolean.FALSE);
            h10 = Tasks.forResult(Boolean.TRUE);
        } else {
            aVar.d("Automatic data collection is disabled.", null);
            aVar.h("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.f19956f) {
                task2 = ((TaskCompletionSource) tVar.f19957g).getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new y7.u(this));
            aVar.d("Waiting for send/deleteUnsentReports to be called.", null);
            h10 = y1.h(onSuccessTask, this.f19919p.getTask());
        }
        h10.onSuccessTask(this.f19908e.a, new qa.a(5, this, task));
    }
}
