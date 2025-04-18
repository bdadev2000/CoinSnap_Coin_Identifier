package com.facebook;

import java.util.Random;

/* loaded from: classes.dex */
public class q extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11360b = 0;
    public static final long serialVersionUID = 1;

    public q() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public q(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !x.h() || random.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.v vVar = com.facebook.internal.v.a;
        com.facebook.internal.v.a(new androidx.core.app.h(str, 6), com.facebook.internal.t.ErrorReport);
    }

    public q(String str, Exception exc) {
        super(str, exc);
    }

    public q(Throwable th2) {
        super(th2);
    }
}
