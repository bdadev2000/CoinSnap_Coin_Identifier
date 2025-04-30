package com.facebook;

/* renamed from: com.facebook.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1848k extends C1849l {
    public static final long serialVersionUID = 1;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13684c;

    public C1848k(String str, int i9, String str2) {
        super(str);
        this.b = i9;
        this.f13684c = str2;
    }

    @Override // com.facebook.C1849l, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.b + ", message: " + getMessage() + ", url: " + this.f13684c + "}";
        G7.j.d(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
