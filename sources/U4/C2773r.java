package u4;

import android.content.Context;
import com.applovin.impl.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import w4.U;
import w4.V;
import w4.W;

/* renamed from: u4.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2773r {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f23164f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f23165g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23166a;
    public final C2778w b;

    /* renamed from: c, reason: collision with root package name */
    public final O5.d f23167c;

    /* renamed from: d, reason: collision with root package name */
    public final C4.a f23168d;

    /* renamed from: e, reason: collision with root package name */
    public final B4.c f23169e;

    static {
        HashMap hashMap = new HashMap();
        f23164f = hashMap;
        L.q(5, hashMap, "armeabi", 6, "armeabi-v7a");
        L.q(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f23165g = "Crashlytics Android SDK/19.0.3";
    }

    public C2773r(Context context, C2778w c2778w, O5.d dVar, E1.d dVar2, B4.c cVar) {
        this.f23166a = context;
        this.b = c2778w;
        this.f23167c = dVar;
        this.f23168d = dVar2;
        this.f23169e = cVar;
    }

    public static V c(b1.h hVar, int i9) {
        String str = (String) hVar.f5270c;
        int i10 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) hVar.f5271d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        b1.h hVar2 = (b1.h) hVar.f5272f;
        if (i9 >= 8) {
            for (b1.h hVar3 = hVar2; hVar3 != null; hVar3 = (b1.h) hVar3.f5272f) {
                i10++;
            }
        }
        int i11 = i10;
        if (str != null) {
            List d2 = d(stackTraceElementArr, 4);
            if (d2 != null) {
                byte b = (byte) (0 | 1);
                V v6 = null;
                if (hVar2 != null && i11 == 0) {
                    v6 = c(hVar2, i9 + 1);
                }
                if (b == 1) {
                    return new V(str, (String) hVar.b, d2, v6, i11);
                }
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null type");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, w4.Y] */
    public static List d(StackTraceElement[] stackTraceElementArr, int i9) {
        long j7;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f23805e = i9;
            obj.f23806f = (byte) (obj.f23806f | 4);
            long j9 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j7 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j7 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j9 = stackTraceElement.getLineNumber();
            }
            obj.f23802a = j7;
            byte b = (byte) (obj.f23806f | 1);
            obj.f23806f = b;
            if (str != null) {
                obj.b = str;
                obj.f23803c = fileName;
                obj.f23804d = j9;
                obj.f23806f = (byte) (b | 2);
                arrayList.add(obj.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static W e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new W("0", "0", 0L);
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        O5.d dVar = this.f23167c;
        String str = (String) dVar.f2202a;
        if (str != null) {
            if (b == 3) {
                return Collections.singletonList(new U(str, dVar.f2205e, 0L, 0L));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, w4.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w4.C2873d0 b(int r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C2773r.b(int):w4.d0");
    }
}
