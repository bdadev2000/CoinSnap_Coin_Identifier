package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.D;
import com.pgl.ssdk.E;

/* loaded from: classes3.dex */
public class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f19567a;
    private String b;

    public d(Context context, String str) {
        this.f19567a = context;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            byte[] bArr = (byte[]) a.meta(222, this.f19567a, this.b);
            if (bArr != null && bArr.length > 0) {
                int i9 = E.f19525a;
                if (i9 != 0) {
                    if (i9 != 1) {
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
                new D(this.f19567a, null).a(1, 2, bArr);
            }
        } catch (Throwable unused) {
        }
    }
}
