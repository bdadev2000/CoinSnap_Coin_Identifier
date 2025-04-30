package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.applovin.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674b1 extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f6793e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f6794f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f6795g;

    /* renamed from: h, reason: collision with root package name */
    private long f6796h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6797i;

    /* renamed from: com.applovin.impl.b1$a */
    /* loaded from: classes.dex */
    public static final class a extends h5 {
        public a(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public C0674b1(Context context) {
        super(false);
        this.f6793e = context.getAssets();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        try {
            Uri uri = j5Var.f8395a;
            this.f6794f = uri;
            String str = (String) AbstractC0669a1.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            b(j5Var);
            InputStream open = this.f6793e.open(str, 1);
            this.f6795g = open;
            if (open.skip(j5Var.f8400g) >= j5Var.f8400g) {
                long j7 = j5Var.f8401h;
                if (j7 != -1) {
                    this.f6796h = j7;
                } else {
                    long available = this.f6795g.available();
                    this.f6796h = available;
                    if (available == 2147483647L) {
                        this.f6796h = -1L;
                    }
                }
                this.f6797i = true;
                c(j5Var);
                return this.f6796h;
            }
            throw new a(null, 2008);
        } catch (a e4) {
            throw e4;
        } catch (IOException e9) {
            throw new a(e9, e9 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f6794f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f6794f = null;
        try {
            try {
                InputStream inputStream = this.f6795g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        } finally {
            this.f6795g = null;
            if (this.f6797i) {
                this.f6797i = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.f6796h;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new a(e4, 2000);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f6795g)).read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        long j9 = this.f6796h;
        if (j9 != -1) {
            this.f6796h = j9 - read;
        }
        d(read);
        return read;
    }
}
