package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.s;
import java.util.UUID;

/* loaded from: classes.dex */
public class a {
    private static volatile UUID a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f3148b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    String str = null;
                    String a10 = s.a().a((String) null);
                    if (a10 != null) {
                        a = UUID.fromString(a10);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                        }
                        try {
                            a = str != null ? UUID.nameUUIDFromBytes(str.getBytes("utf8")) : UUID.randomUUID();
                        } catch (Throwable unused2) {
                        }
                        try {
                            s.a().c(a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        String str;
        UUID a10;
        synchronized (a.class) {
            if (TextUtils.isEmpty(f3148b) && (a10 = new a(context).a()) != null) {
                f3148b = a10.toString();
            }
            str = f3148b;
        }
        return str;
    }

    public UUID a() {
        return a;
    }
}
