package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final T f19553a;
    private final Context b;

    public S(Context context, T t9) {
        this.f19553a = t9;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        byte[] bArr;
        int i9 = E.f19525a;
        if (i9 != 0) {
            if (i9 != 1) {
                str = "";
            } else {
                str = "https://ssdk-va.pangle.io/ssdk/sd/token";
            }
        } else {
            str = "https://ssdk-sg.pangle.io/ssdk/sd/token";
        }
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.b, null);
        } catch (Throwable unused) {
            Q.f19550a = 501;
        }
        if (bArr != null && bArr.length > 0) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new U(this.b, null).a(1, 2, bArr);
            T t9 = this.f19553a;
            if (t9 != null) {
                t9.a(Q.a());
                return;
            }
            return;
        }
        Q.f19550a = 501;
    }
}
