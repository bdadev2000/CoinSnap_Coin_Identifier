package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class c1 extends a2 {
    private final AssetManager e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f23194f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f23195g;

    /* renamed from: h, reason: collision with root package name */
    private long f23196h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23197i;

    /* loaded from: classes3.dex */
    public static final class a extends j5 {
        public a(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public c1(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        try {
            Uri uri = l5Var.f24983a;
            this.f23194f = uri;
            String str = (String) b1.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            b(l5Var);
            InputStream open = this.e.open(str, 1);
            this.f23195g = open;
            if (open.skip(l5Var.f24987g) >= l5Var.f24987g) {
                long j2 = l5Var.f24988h;
                if (j2 != -1) {
                    this.f23196h = j2;
                } else {
                    long available = this.f23195g.available();
                    this.f23196h = available;
                    if (available == 2147483647L) {
                        this.f23196h = -1L;
                    }
                }
                this.f23197i = true;
                c(l5Var);
                return this.f23196h;
            }
            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f23194f;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f23194f = null;
        try {
            try {
                InputStream inputStream = this.f23195g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f23195g = null;
            if (this.f23197i) {
                this.f23197i = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f23196h;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e) {
                throw new a(e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) xp.a((Object) this.f23195g)).read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f23196h;
        if (j3 != -1) {
            this.f23196h = j3 - read;
        }
        d(read);
        return read;
    }
}
