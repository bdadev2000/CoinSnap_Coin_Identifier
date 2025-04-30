package com.vungle.ads.internal.util;

import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class u {
    public /* synthetic */ u(G7.f fVar) {
        this();
    }

    public final int d(String str, String str2) {
        boolean z8;
        G7.j.e(str, "tag");
        G7.j.e(str2, "message");
        z8 = v.enabled;
        if (!z8) {
            return -1;
        }
        return Log.d(str, eraseSensitiveData(str2));
    }

    public final int e(String str, String str2) {
        boolean z8;
        G7.j.e(str, "tag");
        G7.j.e(str2, "message");
        z8 = v.enabled;
        if (z8) {
            return Log.e(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    public final void enable(boolean z8) {
        v.enabled = z8;
    }

    public final String eraseSensitiveData(String str) {
        G7.j.e(str, "<this>");
        Pattern compile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
        G7.j.d(compile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
        String replaceAll = compile.matcher(str).replaceAll("xxx.xxx.xxx.xxx");
        G7.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final int w(String str, String str2) {
        boolean z8;
        G7.j.e(str, "tag");
        G7.j.e(str2, "message");
        z8 = v.enabled;
        if (z8) {
            return Log.w(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    private u() {
    }

    public final int e(String str, String str2, Throwable th) {
        boolean z8;
        G7.j.e(str, "tag");
        G7.j.e(str2, "message");
        G7.j.e(th, "throwable");
        z8 = v.enabled;
        if (!z8) {
            return -1;
        }
        return Log.e(str, eraseSensitiveData(str2) + "; error: " + th.getLocalizedMessage());
    }

    public final int w(String str, String str2, Throwable th) {
        boolean z8;
        G7.j.e(str, "tag");
        G7.j.e(str2, "message");
        G7.j.e(th, "throwable");
        z8 = v.enabled;
        if (!z8) {
            return -1;
        }
        return Log.e(str, eraseSensitiveData(str2) + "; error: " + th.getLocalizedMessage());
    }
}
