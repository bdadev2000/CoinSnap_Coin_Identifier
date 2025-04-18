package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class n8 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f6360e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f6361f;

    /* renamed from: g, reason: collision with root package name */
    private long f6362g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6363h;

    /* loaded from: classes.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h5 {
        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }

        public b(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public n8() {
        super(false);
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        Uri uri = j5Var.a;
        this.f6361f = uri;
        b(j5Var);
        RandomAccessFile a10 = a(uri);
        this.f6360e = a10;
        try {
            a10.seek(j5Var.f5443g);
            long j3 = j5Var.f5444h;
            if (j3 == -1) {
                j3 = this.f6360e.length() - j5Var.f5443g;
            }
            this.f6362g = j3;
            if (j3 >= 0) {
                this.f6363h = true;
                c(j5Var);
                return this.f6362g;
            }
            throw new b(null, null, 2008);
        } catch (IOException e2) {
            throw new b(e2, 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f6361f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f6361f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6360e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        } finally {
            this.f6360e = null;
            if (this.f6363h) {
                this.f6363h = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f6362g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) yp.a((Object) this.f6360e)).read(bArr, i10, (int) Math.min(this.f6362g, i11));
            if (read > 0) {
                this.f6362g -= read;
                d(read);
            }
            return read;
        } catch (IOException e2) {
            throw new b(e2, 2000);
        }
    }

    private static RandomAccessFile a(Uri uri) {
        try {
            return new RandomAccessFile((String) a1.a((Object) uri.getPath()), CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e2, (yp.a < 21 || !a.b(e2.getCause())) ? 2005 : 2006);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e10) {
            throw new b(e10, 2006);
        } catch (RuntimeException e11) {
            throw new b(e11, 2000);
        }
    }
}
