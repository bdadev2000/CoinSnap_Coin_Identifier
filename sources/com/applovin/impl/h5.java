package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class h5 extends a2 {
    private l5 e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f24225f;

    /* renamed from: g, reason: collision with root package name */
    private int f24226g;

    /* renamed from: h, reason: collision with root package name */
    private int f24227h;

    public h5() {
        super(false);
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        b(l5Var);
        this.e = l5Var;
        Uri uri = l5Var.f24983a;
        String scheme = uri.getScheme();
        b1.a("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] a2 = xp.a(uri.getSchemeSpecificPart(), ",");
        if (a2.length == 2) {
            String str = a2[1];
            if (a2[0].contains(";base64")) {
                try {
                    this.f24225f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw dh.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f24225f = xp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j2 = l5Var.f24987g;
            byte[] bArr = this.f24225f;
            if (j2 <= bArr.length) {
                int i2 = (int) j2;
                this.f24226g = i2;
                int length = bArr.length - i2;
                this.f24227h = length;
                long j3 = l5Var.f24988h;
                if (j3 != -1) {
                    this.f24227h = (int) Math.min(length, j3);
                }
                c(l5Var);
                long j4 = l5Var.f24988h;
                return j4 != -1 ? j4 : this.f24227h;
            }
            this.f24225f = null;
            throw new j5(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw dh.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        l5 l5Var = this.e;
        if (l5Var != null) {
            return l5Var.f24983a;
        }
        return null;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        if (this.f24225f != null) {
            this.f24225f = null;
            g();
        }
        this.e = null;
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f24227h;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        System.arraycopy(xp.a((Object) this.f24225f), this.f24226g, bArr, i2, min);
        this.f24226g += min;
        this.f24227h -= min;
        d(min);
        return min;
    }
}
