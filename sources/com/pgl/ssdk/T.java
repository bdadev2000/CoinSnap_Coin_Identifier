package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* loaded from: classes4.dex */
public class T implements Runnable {
    private final U a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16531b;

    public T(Context context, U u) {
        this.a = u;
        this.f16531b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        byte[] bArr;
        int i10 = F.a;
        if (i10 != 0) {
            if (i10 != 1) {
                str = "";
            } else {
                str = "https://ssdk-va.pangle.io/ssdk/sd/token";
            }
        } else {
            str = "https://ssdk-sg.pangle.io/ssdk/sd/token";
        }
        try {
            bArr = (byte[]) com.pgl.ssdk.ces.a.meta(301, this.f16531b, null);
        } catch (Throwable unused) {
            S.a = PglCryptUtils.LOAD_SO_FAILED;
        }
        if (bArr != null && bArr.length > 0) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new V(this.f16531b, null).a(1, 2, bArr);
            U u = this.a;
            if (u != null) {
                u.a(S.a());
                return;
            }
            return;
        }
        S.a = PglCryptUtils.LOAD_SO_FAILED;
    }
}
