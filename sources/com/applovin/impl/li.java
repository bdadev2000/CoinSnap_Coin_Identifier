package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class li extends a2 {
    private final Resources e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25091f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f25092g;

    /* renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f25093h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f25094i;

    /* renamed from: j, reason: collision with root package name */
    private long f25095j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25096k;

    /* loaded from: classes.dex */
    public static class a extends j5 {
        public a(String str, Throwable th, int i2) {
            super(str, th, i2);
        }
    }

    public li(Context context) {
        super(false);
        this.e = context.getResources();
        this.f25091f = context.getPackageName();
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        int parseInt;
        Uri uri = l5Var.f24983a;
        this.f25092g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) b1.a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) b1.a((Object) uri.getPath());
                if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                parseInt = this.e.getIdentifier(android.support.v4.media.d.r(new StringBuilder(), TextUtils.isEmpty(host) ? "" : androidx.compose.foundation.text.input.a.j(host, CertificateUtil.DELIMITER), str), "raw", this.f25091f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) b1.a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        }
        b(l5Var);
        try {
            AssetFileDescriptor openRawResourceFd = this.e.openRawResourceFd(parseInt);
            this.f25093h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f25094i = fileInputStream;
                if (length != -1) {
                    try {
                        if (l5Var.f24987g > length) {
                            throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new a(null, e2, AdError.SERVER_ERROR_CODE);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(l5Var.f24987g + startOffset) - startOffset;
                if (skip == l5Var.f24987g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f25095j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f25095j = size;
                            if (size < 0) {
                                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f25095j = j2;
                        if (j2 < 0) {
                            throw new j5(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j3 = l5Var.f24988h;
                    if (j3 != -1) {
                        long j4 = this.f25095j;
                        if (j4 != -1) {
                            j3 = Math.min(j4, j3);
                        }
                        this.f25095j = j3;
                    }
                    this.f25096k = true;
                    c(l5Var);
                    long j5 = l5Var.f24988h;
                    return j5 != -1 ? j5 : this.f25095j;
                }
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new a("Resource is compressed: " + uri, null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e3) {
            throw new a(null, e3, 2005);
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f25092g;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f25092g = null;
        try {
            try {
                InputStream inputStream = this.f25094i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f25094i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25093h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f25093h = null;
                    if (this.f25096k) {
                        this.f25096k = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f25094i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f25093h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f25093h = null;
                        if (this.f25096k) {
                            this.f25096k = false;
                            g();
                        }
                        throw th;
                    } finally {
                        this.f25093h = null;
                        if (this.f25096k) {
                            this.f25096k = false;
                            g();
                        }
                    }
                } catch (IOException e2) {
                    throw new a(null, e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new a(null, e3, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f25095j;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e) {
                throw new a(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((InputStream) xp.a((Object) this.f25094i)).read(bArr, i2, i3);
        if (read == -1) {
            if (this.f25095j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j3 = this.f25095j;
        if (j3 != -1) {
            this.f25095j = j3 - read;
        }
        d(read);
        return read;
    }
}
