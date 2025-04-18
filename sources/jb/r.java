package jb;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import mb.b1;
import mb.t0;
import mb.v0;
import mb.w0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f19942f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f19943g;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final x f19944b;

    /* renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.d f19945c;

    /* renamed from: d, reason: collision with root package name */
    public final rb.a f19946d;

    /* renamed from: e, reason: collision with root package name */
    public final m2.l f19947e;

    static {
        HashMap hashMap = new HashMap();
        f19942f = hashMap;
        com.applovin.impl.mediation.ads.e.l(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        f19943g = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.2.1");
    }

    public r(Context context, x xVar, android.support.v4.media.d dVar, f0.c cVar, m2.l lVar) {
        this.a = context;
        this.f19944b = xVar;
        this.f19945c = dVar;
        this.f19946d = cVar;
        this.f19947e = lVar;
    }

    public static w0 c(ic.t tVar, int i10) {
        String str = (String) tVar.f19574b;
        String str2 = (String) tVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.f19575c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ic.t tVar2 = (ic.t) tVar.f19576d;
        if (i10 >= 8) {
            ic.t tVar3 = tVar2;
            while (tVar3 != null) {
                tVar3 = (ic.t) tVar3.f19576d;
                i11++;
            }
        }
        v0 v0Var = new v0();
        if (str != null) {
            v0Var.a = str;
            v0Var.f22114b = str2;
            List d10 = d(stackTraceElementArr, 4);
            if (d10 != null) {
                v0Var.f22115c = d10;
                v0Var.f22117e = i11;
                v0Var.f22118f = (byte) (v0Var.f22118f | 1);
                if (tVar2 != null && i11 == 0) {
                    v0Var.f22116d = c(tVar2, i10 + 1);
                }
                return v0Var.a();
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null type");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j3;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            b1 b1Var = new b1();
            b1Var.f21857e = i10;
            b1Var.f21858f = (byte) (b1Var.f21858f | 4);
            long j10 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j3 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j3 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            b1Var.a = j3;
            byte b3 = (byte) (b1Var.f21858f | 1);
            b1Var.f21858f = b3;
            if (str != null) {
                b1Var.f21854b = str;
                b1Var.f21855c = fileName;
                b1Var.f21856d = j10;
                b1Var.f21858f = (byte) (b3 | 2);
                arrayList.add(b1Var.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        t0 t0Var = new t0();
        t0Var.a = 0L;
        byte b3 = (byte) (t0Var.f22105e | 1);
        t0Var.f22102b = 0L;
        t0Var.f22105e = (byte) (b3 | 2);
        android.support.v4.media.d dVar = this.f19945c;
        String str = (String) dVar.f526f;
        if (str != null) {
            t0Var.f22103c = str;
            t0Var.f22104d = (String) dVar.f523c;
            return Collections.singletonList(t0Var.a());
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mb.g1 b(int r18) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.r.b(int):mb.g1");
    }
}
