package com.apm.insight.k;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private String f3223b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f3224c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f3225d;

    public l(int i10) {
        this.a = i10;
    }

    public boolean a() {
        return this.a != 207;
    }

    @Nullable
    public byte[] b() {
        return this.f3225d;
    }

    public l(int i10, String str) {
        this.a = i10;
        this.f3223b = str;
    }

    public l(int i10, Throwable th2) {
        this.a = i10;
        if (th2 != null) {
            this.f3223b = th2.getMessage();
        }
    }

    public l(int i10, JSONObject jSONObject) {
        this.a = i10;
        this.f3224c = jSONObject;
    }

    public l(int i10, byte[] bArr) {
        this.a = i10;
        this.f3225d = bArr;
    }
}
