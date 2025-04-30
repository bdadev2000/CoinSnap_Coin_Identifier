package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile f f6016a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f6017c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private b f6018d;

    /* renamed from: e, reason: collision with root package name */
    private d f6019e;

    /* renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6020a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6020a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6020a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6020a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6020a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6020a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6020a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6020a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6020a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(@NonNull Context context) {
        this.b = context;
        try {
            this.f6018d = b.d();
            this.f6019e = new d(this.b);
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c a6;
        return (crashType == null || (a6 = a(crashType)) == null) ? aVar : a6.a(aVar, null, false);
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar, @Nullable c.a aVar2, boolean z8) {
        c a6;
        return (crashType == null || (a6 = a(crashType)) == null) ? aVar : a6.a(aVar, aVar2, z8);
    }

    public com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().h());
        }
        aVar.a(DataSchemeDataSource.SCHEME_DATA, (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header a6 = Header.a(this.b);
        Header.a(a6);
        a6.c();
        a6.d();
        a6.e();
        Header.b(a6);
        aVar.a(a6);
        return aVar;
    }

    @Nullable
    private c a(CrashType crashType) {
        c cVar = this.f6017c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.f6020a[crashType.ordinal()]) {
            case 1:
                cVar = new j(this.b, this.f6018d, this.f6019e);
                break;
            case 2:
                cVar = new k(this.b, this.f6018d, this.f6019e);
                break;
            case 3:
                cVar = new l(this.b, this.f6018d, this.f6019e);
                break;
            case 4:
                cVar = new a(this.b, this.f6018d, this.f6019e);
                break;
            case 5:
                cVar = new h(this.b, this.f6018d, this.f6019e);
                break;
            case 6:
                cVar = new g(this.b, this.f6018d, this.f6019e);
                break;
            case 7:
                cVar = new e(this.b, this.f6018d, this.f6019e);
                break;
            case 8:
                cVar = new i(this.b, this.f6018d, this.f6019e);
                break;
        }
        if (cVar != null) {
            this.f6017c.put(crashType, cVar);
        }
        return cVar;
    }

    public static f a() {
        if (f6016a == null) {
            Context g9 = com.apm.insight.i.g();
            if (g9 == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f6016a = new f(g9);
        }
        return f6016a;
    }
}
