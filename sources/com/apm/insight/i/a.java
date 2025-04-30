package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.s;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f5832a = null;
    private static String b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (f5832a == null) {
            synchronized (a.class) {
                if (f5832a == null) {
                    String str = null;
                    String a6 = s.a().a((String) null);
                    if (a6 != null) {
                        f5832a = UUID.fromString(a6);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            f5832a = str != null ? UUID.nameUUIDFromBytes(str.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            s.a().c(f5832a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        String str;
        UUID a6;
        synchronized (a.class) {
            try {
                if (TextUtils.isEmpty(b) && (a6 = new a(context).a()) != null) {
                    b = a6.toString();
                }
                str = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public UUID a() {
        return f5832a;
    }
}
