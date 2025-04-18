package com.google.gson;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final j f12102d = new j("", "", false);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12103b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12104c;

    static {
        new j("\n", "  ", true);
    }

    public j(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.f12103b = str2;
                this.f12104c = z10;
                return;
            }
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
    }
}
