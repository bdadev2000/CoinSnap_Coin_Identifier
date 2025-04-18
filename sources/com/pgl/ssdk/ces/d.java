package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.E;
import com.pgl.ssdk.F;

/* loaded from: classes4.dex */
public class d implements Runnable {
    private Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f16545b;

    public d(Context context, String str) {
        this.a = context;
        this.f16545b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            byte[] bArr = (byte[]) a.meta(222, this.a, this.f16545b);
            if (bArr != null && bArr.length > 0) {
                int i10 = F.a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        str = "";
                    } else {
                        str = "https://ssdk-va.pangle.io/ssdk/v2/r";
                    }
                } else {
                    str = "https://ssdk-sg.pangle.io/ssdk/v2/r";
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                new E(this.a, null).a(1, 2, bArr);
            }
        } catch (Throwable unused) {
        }
    }
}
