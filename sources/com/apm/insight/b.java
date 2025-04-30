package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.l.l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f5628a;
    private ICrashCallback b;

    /* renamed from: c, reason: collision with root package name */
    private String f5629c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f5629c = str;
        this.b = iCrashCallback;
    }

    public void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        h a6;
        if (this.b == null || (a6 = h.a(this.f5629c)) == null || !a6.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f5629c = str;
        this.f5628a = iOOMCallback;
    }

    public void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            if (TextUtils.equals(l.b(jSONArray.optJSONObject(i9), "header", "aid"), this.f5629c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    @Override // com.apm.insight.IOOMCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j7) {
    }

    public void a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j7, JSONArray jSONArray) {
        if (this.f5628a == null || jSONArray == null) {
            return;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            if (TextUtils.equals(l.b(jSONArray.optJSONObject(i9), "header", "aid"), this.f5629c)) {
                this.f5628a.onCrash(crashType, th, thread, j7);
            }
        }
    }
}
