package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class p8 extends a2 {
    private RandomAccessFile e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f25973f;

    /* renamed from: g, reason: collision with root package name */
    private long f25974g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25975h;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j5 {
        public b(String str, Throwable th, int i2) {
            super(str, th, i2);
        }

        public b(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public p8() {
        super(false);
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        Uri uri = l5Var.f24983a;
        this.f25973f = uri;
        b(l5Var);
        RandomAccessFile a2 = a(uri);
        this.e = a2;
        try {
            a2.seek(l5Var.f24987g);
            long j2 = l5Var.f24988h;
            if (j2 == -1) {
                j2 = this.e.length() - l5Var.f24987g;
            }
            this.f25974g = j2;
            if (j2 >= 0) {
                this.f25975h = true;
                c(l5Var);
                return this.f25974g;
            }
            throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e) {
            throw new b(e, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f25973f;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f25973f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new b(e, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.e = null;
            if (this.f25975h) {
                this.f25975h = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.f25974g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) xp.a((Object) this.e)).read(bArr, i2, (int) Math.min(this.f25974g, i3));
            if (read > 0) {
                this.f25974g -= read;
                d(read);
            }
            return read;
        } catch (IOException e) {
            throw new b(e, AdError.SERVER_ERROR_CODE);
        }
    }

    private static RandomAccessFile a(Uri uri) {
        int i2 = AdError.INTERNAL_ERROR_2006;
        try {
            return new RandomAccessFile((String) b1.a((Object) uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (xp.f27962a < 21 || !a.b(e.getCause())) {
                    i2 = 2005;
                }
                throw new b(e, i2);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e2) {
            throw new b(e2, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e3) {
            throw new b(e3, AdError.SERVER_ERROR_CODE);
        }
    }
}
