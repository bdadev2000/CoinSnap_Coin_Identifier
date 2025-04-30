package com.apm.insight.k;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f5913a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f5914c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f5915d;

    public l(int i9) {
        this.f5913a = i9;
    }

    public boolean a() {
        return this.f5913a != 207;
    }

    @Nullable
    public byte[] b() {
        return this.f5915d;
    }

    public l(int i9, String str) {
        this.f5913a = i9;
        this.b = str;
    }

    public l(int i9, Throwable th) {
        this.f5913a = i9;
        if (th != null) {
            this.b = th.getMessage();
        }
    }

    public l(int i9, JSONObject jSONObject) {
        this.f5913a = i9;
        this.f5914c = jSONObject;
    }

    public l(int i9, byte[] bArr) {
        this.f5913a = i9;
        this.f5915d = bArr;
    }
}
