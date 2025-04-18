package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class hi extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f5164e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5165f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f5166g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f5167h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f5168i;

    /* renamed from: j, reason: collision with root package name */
    private long f5169j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5170k;

    /* loaded from: classes.dex */
    public static class a extends h5 {
        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public hi(Context context) {
        super(false);
        this.f5164e = context.getResources();
        this.f5165f = context.getPackageName();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        int parseInt;
        Uri uri = j5Var.a;
        this.f5166g = uri;
        if (!TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) a1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) a1.a((Object) uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                parseInt = this.f5164e.getIdentifier(vd.e.h(new StringBuilder(), TextUtils.isEmpty(host) ? "" : eb.j.k(host, ":"), str), "raw", this.f5165f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) a1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, 1004);
            }
        }
        b(j5Var);
        try {
            AssetFileDescriptor openRawResourceFd = this.f5164e.openRawResourceFd(parseInt);
            this.f5167h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f5168i = fileInputStream;
                if (length != -1) {
                    try {
                        if (j5Var.f5443g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e2) {
                        throw e2;
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(j5Var.f5443g + startOffset) - startOffset;
                if (skip == j5Var.f5443g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f5169j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f5169j = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j3 = length - skip;
                        this.f5169j = j3;
                        if (j3 < 0) {
                            throw new h5(2008);
                        }
                    }
                    long j10 = j5Var.f5444h;
                    if (j10 != -1) {
                        long j11 = this.f5169j;
                        if (j11 != -1) {
                            j10 = Math.min(j11, j10);
                        }
                        this.f5169j = j10;
                    }
                    this.f5170k = true;
                    c(j5Var);
                    long j12 = j5Var.f5444h;
                    return j12 != -1 ? j12 : this.f5169j;
                }
                throw new a(null, null, 2008);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f5166g;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f5166g = null;
        try {
            try {
                InputStream inputStream = this.f5168i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f5168i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5167h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new a(null, e2, 2000);
                    }
                } finally {
                    this.f5167h = null;
                    if (this.f5170k) {
                        this.f5170k = false;
                        g();
                    }
                }
            } catch (Throwable th2) {
                this.f5168i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f5167h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f5167h = null;
                        if (this.f5170k) {
                            this.f5170k = false;
                            g();
                        }
                        throw th2;
                    } finally {
                        this.f5167h = null;
                        if (this.f5170k) {
                            this.f5170k = false;
                            g();
                        }
                    }
                } catch (IOException e10) {
                    throw new a(null, e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new a(null, e11, 2000);
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f5169j;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new a(null, e2, 2000);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f5168i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f5169j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j10 = this.f5169j;
        if (j10 != -1) {
            this.f5169j = j10 - read;
        }
        d(read);
        return read;
    }
}
