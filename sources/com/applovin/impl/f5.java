package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f5 extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private j5 f7558e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f7559f;

    /* renamed from: g, reason: collision with root package name */
    private int f7560g;

    /* renamed from: h, reason: collision with root package name */
    private int f7561h;

    public f5() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        b(j5Var);
        this.f7558e = j5Var;
        Uri uri = j5Var.f8395a;
        String scheme = uri.getScheme();
        AbstractC0669a1.a(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String[] a6 = yp.a(uri.getSchemeSpecificPart(), ",");
        if (a6.length == 2) {
            String str = a6[1];
            if (a6[0].contains(";base64")) {
                try {
                    this.f7559f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e4) {
                    throw ah.b("Error while parsing Base64 encoded string: " + str, e4);
                }
            } else {
                this.f7559f = yp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j7 = j5Var.f8400g;
            byte[] bArr = this.f7559f;
            if (j7 <= bArr.length) {
                int i9 = (int) j7;
                this.f7560g = i9;
                int length = bArr.length - i9;
                this.f7561h = length;
                long j9 = j5Var.f8401h;
                if (j9 != -1) {
                    this.f7561h = (int) Math.min(length, j9);
                }
                c(j5Var);
                long j10 = j5Var.f8401h;
                return j10 != -1 ? j10 : this.f7561h;
            }
            this.f7559f = null;
            throw new h5(2008);
        }
        throw ah.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        j5 j5Var = this.f7558e;
        if (j5Var != null) {
            return j5Var.f8395a;
        }
        return null;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        if (this.f7559f != null) {
            this.f7559f = null;
            g();
        }
        this.f7558e = null;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f7561h;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        System.arraycopy(yp.a((Object) this.f7559f), this.f7560g, bArr, i9, min);
        this.f7560g += min;
        this.f7561h -= min;
        d(min);
        return min;
    }
}
