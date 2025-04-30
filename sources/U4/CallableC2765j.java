package u4;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import v4.C2853e;
import w4.C2869b0;
import w4.E0;
import w4.Q;
import w4.S;
import w4.T;
import w4.V;
import w4.W;
import w4.X;
import z4.C2972a;

/* renamed from: u4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC2765j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f23124a;
    public final /* synthetic */ Throwable b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f23125c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B4.c f23126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23127e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2769n f23128f;

    public CallableC2765j(C2769n c2769n, long j7, Throwable th, Thread thread, B4.c cVar) {
        this.f23128f = c2769n;
        this.f23124a = j7;
        this.b = th;
        this.f23125c = thread;
        this.f23126d = cVar;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [b1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [w4.P, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        C4.a aVar;
        Boolean bool;
        C4.a aVar2;
        boolean z8;
        long j7 = this.f23124a;
        long j9 = j7 / 1000;
        C2769n c2769n = this.f23128f;
        NavigableSet c9 = ((C2972a) c2769n.m.b).c();
        if (!c9.isEmpty()) {
            str = (String) c9.first();
        } else {
            str = null;
        }
        String str2 = "FirebaseCrashlytics";
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        c2769n.f23136c.a();
        U4.p pVar = c2769n.m;
        pVar.getClass();
        String concat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        C2773r c2773r = (C2773r) pVar.f3317a;
        Context context = c2773r.f23166a;
        int i9 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th = this.b; th != null; th = th.getCause()) {
            stack.push(th);
        }
        b1.h hVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            aVar = c2773r.f23168d;
            if (isEmpty) {
                break;
            }
            Throwable th2 = (Throwable) stack.pop();
            Stack stack2 = stack;
            String str3 = str2;
            String localizedMessage = th2.getLocalizedMessage();
            long j10 = j7;
            String name = th2.getClass().getName();
            StackTraceElement[] c10 = aVar.c(th2.getStackTrace());
            ?? obj = new Object();
            obj.b = localizedMessage;
            obj.f5270c = name;
            obj.f5271d = c10;
            obj.f5272f = hVar;
            hVar = obj;
            stack = stack2;
            str2 = str3;
            j7 = j10;
        }
        long j11 = j7;
        String str4 = str2;
        ?? obj2 = new Object();
        obj2.b = AppMeasurement.CRASH_ORIGIN;
        obj2.f23769a = j9;
        obj2.f23774g = (byte) (obj2.f23774g | 1);
        E0 e4 = r4.d.b.e(context);
        int i10 = ((C2869b0) e4).f23828c;
        if (i10 > 0) {
            if (i10 != 100) {
                z8 = true;
            } else {
                z8 = false;
            }
            bool = Boolean.valueOf(z8);
        } else {
            bool = null;
        }
        ArrayList d2 = r4.d.d(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f5271d;
        Thread thread = this.f23125c;
        String name2 = thread.getName();
        if (name2 != null) {
            byte b8 = (byte) 1;
            List d9 = C2773r.d(stackTraceElementArr, 4);
            if (d9 != null) {
                String str5 = str;
                if (b8 == 1) {
                    arrayList.add(new X(name2, 4, d9));
                    for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                        Thread key = entry.getKey();
                        if (!key.equals(thread)) {
                            StackTraceElement[] c11 = aVar.c(entry.getValue());
                            String name3 = key.getName();
                            if (name3 != null) {
                                List d10 = C2773r.d(c11, 0);
                                if (d10 != null) {
                                    if (b8 == 1) {
                                        aVar2 = aVar;
                                        arrayList.add(new X(name3, 0, d10));
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        if (b8 == 0) {
                                            sb.append(" importance");
                                        }
                                        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
                                    }
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        } else {
                            aVar2 = aVar;
                        }
                        aVar = aVar2;
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    V c12 = C2773r.c(hVar, 0);
                    W e9 = C2773r.e();
                    List a6 = c2773r.a();
                    if (a6 != null) {
                        T t9 = new T(unmodifiableList, c12, null, e9, a6);
                        if (b == 1) {
                            obj2.f23770c = new S(t9, null, null, bool, e4, d2, i9);
                            obj2.f23771d = c2773r.b(i9);
                            Q a9 = obj2.a();
                            C2853e c2853e = (C2853e) pVar.f3319d;
                            z4.c cVar = (z4.c) pVar.f3320e;
                            ((C2972a) pVar.b).d(U4.p.i(U4.p.h(a9, c2853e, cVar), cVar), str5, true);
                            try {
                                z4.c cVar2 = c2769n.f23140g;
                                String str6 = ".ae" + j11;
                                cVar2.getClass();
                                if (!new File((File) cVar2.f24546c, str6).createNewFile()) {
                                    throw new IOException("Create new file failed.");
                                }
                            } catch (IOException e10) {
                                Log.w(str4, "Could not create app exception marker file.", e10);
                            }
                            B4.c cVar3 = this.f23126d;
                            c2769n.c(false, cVar3);
                            new C2760e(c2769n.f23139f);
                            C2769n.a(c2769n, C2760e.b, Boolean.valueOf(this.f23127e));
                            if (!c2769n.b.c()) {
                                return Tasks.forResult(null);
                            }
                            Executor executor = (Executor) c2769n.f23138e.f3334a;
                            return ((TaskCompletionSource) ((AtomicReference) cVar3.f323i).get()).getTask().onSuccessTask(executor, new C2763h(this, executor, str5));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (b == 0) {
                            sb2.append(" uiOrientation");
                        }
                        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb2, "Missing required properties:"));
                    }
                    throw new NullPointerException("Null binaries");
                }
                StringBuilder sb3 = new StringBuilder();
                if (b8 == 0) {
                    sb3.append(" importance");
                }
                throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb3, "Missing required properties:"));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }
}
