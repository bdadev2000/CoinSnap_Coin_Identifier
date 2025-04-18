package com.safedk.android.a;

import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f29074c = "POST";
    public static final String d = "PUT";

    /* renamed from: b, reason: collision with root package name */
    protected String f29075b = "ServerUploadImage";
    protected int e;

    /* renamed from: f, reason: collision with root package name */
    protected String f29076f;

    /* renamed from: g, reason: collision with root package name */
    protected String f29077g;

    public abstract a a();

    public g(String str, String str2, int i2) {
        this.e = i2;
        this.f29076f = str;
        this.f29077g = str2;
        Logger.d(this.f29075b, "object created, Image path=" + str + ", hash=" + str2);
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f29078a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29079b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29080c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, int i2, String str2) {
            Logger.d("ServerResponseData", "object created, URL=" + str + ", response=" + i2 + ", screenshot hash=" + str2);
            this.f29078a = str;
            this.f29079b = i2;
            this.f29080c = str2;
        }

        public String a() {
            return this.f29078a;
        }

        public int b() {
            return this.f29079b;
        }

        public String c() {
            return this.f29080c;
        }
    }
}
