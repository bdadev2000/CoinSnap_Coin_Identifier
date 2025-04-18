package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b implements ICrashCallback, IOOMCallback {
    private IOOMCallback a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f2956b;

    /* renamed from: c, reason: collision with root package name */
    private String f2957c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f2957c = str;
        this.f2956b = iCrashCallback;
    }

    public void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        h a;
        if (this.f2956b == null || (a = h.a(this.f2957c)) == null || !a.a(str3, str2)) {
            return;
        }
        this.f2956b.onCrash(crashType, str, null);
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f2957c = str;
        this.a = iOOMCallback;
    }

    public void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.f2956b == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(com.apm.insight.l.k.b(jSONArray.optJSONObject(i10), "header", "aid"), this.f2957c)) {
                this.f2956b.onCrash(crashType, str, thread);
            }
        }
    }

    @Override // com.apm.insight.IOOMCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j3) {
    }

    public void a(@NonNull CrashType crashType, @Nullable Throwable th2, @Nullable Thread thread, long j3, JSONArray jSONArray) {
        if (this.a == null || jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (TextUtils.equals(com.apm.insight.l.k.b(jSONArray.optJSONObject(i10), "header", "aid"), this.f2957c)) {
                this.a.onCrash(crashType, th2, thread, j3);
            }
        }
    }
}
