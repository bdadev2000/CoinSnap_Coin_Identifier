package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f2952d;
    private volatile String a;

    /* renamed from: b, reason: collision with root package name */
    private volatile b f2953b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f2954c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f2955e = false;

    private a() {
    }

    public static a a() {
        if (f2952d == null) {
            synchronized (a.class) {
                if (f2952d == null) {
                    f2952d = new a();
                }
            }
        }
        return f2952d;
    }

    public void b() {
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public void a(CrashType crashType, long j3, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, b bVar, c cVar) {
        this.a = str;
        this.f2953b = bVar;
        this.f2954c = cVar;
        if (this.f2955e) {
            return;
        }
        this.f2955e = true;
        p.b().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
