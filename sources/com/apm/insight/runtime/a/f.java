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

    @SuppressLint({"StaticFieldLeak"})
    private static volatile f a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3310b;

    /* renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f3311c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private b f3312d;

    /* renamed from: e, reason: collision with root package name */
    private d f3313e;

    /* renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CrashType.values().length];
            a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(@NonNull Context context) {
        this.f3310b = context;
        try {
            this.f3312d = b.d();
            this.f3313e = new d(this.f3310b);
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, null, false);
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar, @Nullable c.a aVar2, boolean z10) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, aVar2, z10);
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
        Header a10 = Header.a(this.f3310b);
        Header.a(a10);
        a10.c();
        a10.d();
        a10.e();
        Header.b(a10);
        aVar.a(a10);
        return aVar;
    }

    @Nullable
    private c a(CrashType crashType) {
        c cVar = this.f3311c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.a[crashType.ordinal()]) {
            case 1:
                cVar = new j(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 2:
                cVar = new k(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 3:
                cVar = new l(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 4:
                cVar = new a(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 5:
                cVar = new h(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 6:
                cVar = new g(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 7:
                cVar = new e(this.f3310b, this.f3312d, this.f3313e);
                break;
            case 8:
                cVar = new i(this.f3310b, this.f3312d, this.f3313e);
                break;
        }
        if (cVar != null) {
            this.f3311c.put(crashType, cVar);
        }
        return cVar;
    }

    public static f a() {
        if (a == null) {
            Context g10 = com.apm.insight.i.g();
            if (g10 == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            a = new f(g10);
        }
        return a;
    }
}
