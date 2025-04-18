package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f5 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private j5 f4605e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f4606f;

    /* renamed from: g, reason: collision with root package name */
    private int f4607g;

    /* renamed from: h, reason: collision with root package name */
    private int f4608h;

    public f5() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        b(j5Var);
        this.f4605e = j5Var;
        Uri uri = j5Var.a;
        String scheme = uri.getScheme();
        a1.a(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] a = yp.a(uri.getSchemeSpecificPart(), ",");
        if (a.length == 2) {
            String str = a[1];
            if (a[0].contains(";base64")) {
                try {
                    this.f4606f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw ah.b("Error while parsing Base64 encoded string: " + str, e2);
                }
            } else {
                this.f4606f = yp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j3 = j5Var.f5443g;
            byte[] bArr = this.f4606f;
            if (j3 <= bArr.length) {
                int i10 = (int) j3;
                this.f4607g = i10;
                int length = bArr.length - i10;
                this.f4608h = length;
                long j10 = j5Var.f5444h;
                if (j10 != -1) {
                    this.f4608h = (int) Math.min(length, j10);
                }
                c(j5Var);
                long j11 = j5Var.f5444h;
                return j11 != -1 ? j11 : this.f4608h;
            }
            this.f4606f = null;
            throw new h5(2008);
        }
        throw ah.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        j5 j5Var = this.f4605e;
        if (j5Var != null) {
            return j5Var.a;
        }
        return null;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        if (this.f4606f != null) {
            this.f4606f = null;
            g();
        }
        this.f4605e = null;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f4608h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(yp.a((Object) this.f4606f), this.f4607g, bArr, i10, min);
        this.f4607g += min;
        this.f4608h -= min;
        d(min);
        return min;
    }
}
