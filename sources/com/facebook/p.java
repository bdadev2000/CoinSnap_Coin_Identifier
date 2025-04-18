package com.facebook;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends q {
    public static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final int f11354c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11355d;

    public p(String str, int i10, String str2) {
        super(str);
        this.f11354c = i10;
        this.f11355d = str2;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f11354c + ", message: " + getMessage() + ", url: " + this.f11355d + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
