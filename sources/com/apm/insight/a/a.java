package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.p;

/* loaded from: classes.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f5623d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f5624a;
    private volatile b b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f5625c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5626e = false;

    private a() {
    }

    public static a a() {
        if (f5623d == null) {
            synchronized (a.class) {
                try {
                    if (f5623d == null) {
                        f5623d = new a();
                    }
                } finally {
                }
            }
        }
        return f5623d;
    }

    public void b() {
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public void a(CrashType crashType, long j7, String str) {
    }

    public void a(String str) {
    }

    public void a(String str, b bVar, c cVar) {
        this.f5624a = str;
        this.b = bVar;
        this.f5625c = cVar;
        if (this.f5626e) {
            return;
        }
        this.f5626e = true;
        p.b().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }
}
