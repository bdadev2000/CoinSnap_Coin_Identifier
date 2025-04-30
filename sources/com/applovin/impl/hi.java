package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class hi extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f8142e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8143f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f8144g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f8145h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f8146i;

    /* renamed from: j, reason: collision with root package name */
    private long f8147j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8148k;

    /* loaded from: classes.dex */
    public static class a extends h5 {
        public a(String str, Throwable th, int i9) {
            super(str, th, i9);
        }
    }

    public hi(Context context) {
        super(false);
        this.f8142e = context.getResources();
        this.f8143f = context.getPackageName();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        int parseInt;
        Uri uri = j5Var.f8395a;
        this.f8144g = uri;
        if (!TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) AbstractC0669a1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) AbstractC0669a1.a((Object) uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                parseInt = this.f8142e.getIdentifier(AbstractC2914a.h(new StringBuilder(), TextUtils.isEmpty(host) ? "" : com.mbridge.msdk.foundation.entity.o.j(host, ":"), str), "raw", this.f8143f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) AbstractC0669a1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        }
        b(j5Var);
        try {
            AssetFileDescriptor openRawResourceFd = this.f8142e.openRawResourceFd(parseInt);
            this.f8145h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f8146i = fileInputStream;
                if (length != -1) {
                    try {
                        if (j5Var.f8400g > length) {
                            throw new a(null, null, 2008);
                        }
                    } catch (a e4) {
                        throw e4;
                    } catch (IOException e9) {
                        throw new a(null, e9, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(j5Var.f8400g + startOffset) - startOffset;
                if (skip == j5Var.f8400g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f8147j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f8147j = size;
                            if (size < 0) {
                                throw new a(null, null, 2008);
                            }
                        }
                    } else {
                        long j7 = length - skip;
                        this.f8147j = j7;
                        if (j7 < 0) {
                            throw new h5(2008);
                        }
                    }
                    long j9 = j5Var.f8401h;
                    if (j9 != -1) {
                        long j10 = this.f8147j;
                        if (j10 != -1) {
                            j9 = Math.min(j10, j9);
                        }
                        this.f8147j = j9;
                    }
                    this.f8148k = true;
                    c(j5Var);
                    long j11 = j5Var.f8401h;
                    return j11 != -1 ? j11 : this.f8147j;
                }
                throw new a(null, null, 2008);
            }
            throw new a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e10) {
            throw new a(null, e10, 2005);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f8144g;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f8144g = null;
        try {
            try {
                InputStream inputStream = this.f8146i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f8146i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f8145h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new a(null, e4, 2000);
                    }
                } finally {
                    this.f8145h = null;
                    if (this.f8148k) {
                        this.f8148k = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f8146i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f8145h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f8145h = null;
                        if (this.f8148k) {
                            this.f8148k = false;
                            g();
                        }
                        throw th;
                    } finally {
                        this.f8145h = null;
                        if (this.f8148k) {
                            this.f8148k = false;
                            g();
                        }
                    }
                } catch (IOException e9) {
                    throw new a(null, e9, 2000);
                }
            }
        } catch (IOException e10) {
            throw new a(null, e10, 2000);
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.f8147j;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new a(null, e4, 2000);
            }
        }
        int read = ((InputStream) yp.a((Object) this.f8146i)).read(bArr, i9, i10);
        if (read == -1) {
            if (this.f8147j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j9 = this.f8147j;
        if (j9 != -1) {
            this.f8147j = j9 - read;
        }
        d(read);
        return read;
    }
}
