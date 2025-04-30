package com.facebook;

import java.util.Random;

/* renamed from: com.facebook.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1849l extends RuntimeException {
    public static final long serialVersionUID = 1;

    public C1849l(String str) {
        super(str);
        Random random = new Random();
        if (str != null && r.f13812o.get() && random.nextInt(100) > 50) {
            com.facebook.internal.r rVar = com.facebook.internal.r.f13653a;
            com.facebook.internal.r.a(new F2.d(str, 11), com.facebook.internal.p.ErrorReport);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }
}
