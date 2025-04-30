package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class n8 extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f9282e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f9283f;

    /* renamed from: g, reason: collision with root package name */
    private long f9284g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9285h;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h5 {
        public b(String str, Throwable th, int i9) {
            super(str, th, i9);
        }

        public b(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public n8() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        Uri uri = j5Var.f8395a;
        this.f9283f = uri;
        b(j5Var);
        RandomAccessFile a6 = a(uri);
        this.f9282e = a6;
        try {
            a6.seek(j5Var.f8400g);
            long j7 = j5Var.f8401h;
            if (j7 == -1) {
                j7 = this.f9282e.length() - j5Var.f8400g;
            }
            this.f9284g = j7;
            if (j7 >= 0) {
                this.f9285h = true;
                c(j5Var);
                return this.f9284g;
            }
            throw new b(null, null, 2008);
        } catch (IOException e4) {
            throw new b(e4, 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f9283f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f9283f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9282e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e4) {
                throw new b(e4, 2000);
            }
        } finally {
            this.f9282e = null;
            if (this.f9285h) {
                this.f9285h = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f9284g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) yp.a((Object) this.f9282e)).read(bArr, i9, (int) Math.min(this.f9284g, i10));
            if (read > 0) {
                this.f9284g -= read;
                d(read);
            }
            return read;
        } catch (IOException e4) {
            throw new b(e4, 2000);
        }
    }

    private static RandomAccessFile a(Uri uri) {
        try {
            return new RandomAccessFile((String) AbstractC0669a1.a((Object) uri.getPath()), CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e4, (yp.f12451a < 21 || !a.b(e4.getCause())) ? 2005 : 2006);
            }
            String path = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path, ",query=", query, ",fragment=");
            o3.append(fragment);
            throw new b(o3.toString(), e4, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e9) {
            throw new b(e9, 2006);
        } catch (RuntimeException e10) {
            throw new b(e10, 2000);
        }
    }
}
