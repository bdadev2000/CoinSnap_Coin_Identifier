package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b1 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f3809e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f3810f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f3811g;

    /* renamed from: h, reason: collision with root package name */
    private long f3812h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3813i;

    /* loaded from: classes.dex */
    public static final class a extends h5 {
        public a(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public b1(Context context) {
        super(false);
        this.f3809e = context.getAssets();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        try {
            Uri uri = j5Var.a;
            this.f3810f = uri;
            String str = (String) a1.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            b(j5Var);
            InputStream open = this.f3809e.open(str, 1);
            this.f3811g = open;
            if (open.skip(j5Var.f5443g) >= j5Var.f5443g) {
                long j3 = j5Var.f5444h;
                if (j3 != -1) {
                    this.f3812h = j3;
                } else {
                    long available = this.f3811g.available();
                    this.f3812h = available;
                    if (available == 2147483647L) {
                        this.f3812h = -1L;
                    }
                }
                this.f3813i = true;
                c(j5Var);
                return this.f3812h;
            }
            throw new a(null, 2008);
        } catch (a e2) {
            throw e2;
        } catch (IOException e10) {
            throw new a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f3810f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f3810f = null;
        try {
            try {
                InputStream inputStream = this.f3811g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        } finally {
            this.f3811g = null;
            if (this.f3813i) {
                this.f3813i = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f3812h;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new a(e2, 2000);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f3811g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f3812h;
        if (j10 != -1) {
            this.f3812h = j10 - read;
        }
        d(read);
        return read;
    }
}
