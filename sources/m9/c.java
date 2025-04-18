package m9;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class c extends f {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f21647e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f21648f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f21649g;

    /* renamed from: h, reason: collision with root package name */
    public long f21650h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21651i;

    public c(Context context) {
        super(false);
        this.f21647e = context.getAssets();
    }

    @Override // m9.l
    public final long a(p pVar) {
        int i10;
        try {
            Uri uri = pVar.a;
            long j3 = pVar.f21710f;
            this.f21648f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            f();
            InputStream open = this.f21647e.open(path, 1);
            this.f21649g = open;
            if (open.skip(j3) >= j3) {
                long j10 = pVar.f21711g;
                if (j10 != -1) {
                    this.f21650h = j10;
                } else {
                    long available = this.f21649g.available();
                    this.f21650h = available;
                    if (available == 2147483647L) {
                        this.f21650h = -1L;
                    }
                }
                this.f21651i = true;
                g(pVar);
                return this.f21650h;
            }
            throw new b(null, 2008);
        } catch (b e2) {
            throw e2;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            } else {
                i10 = 2000;
            }
            throw new b(e10, i10);
        }
    }

    @Override // m9.l
    public final void close() {
        this.f21648f = null;
        try {
            try {
                InputStream inputStream = this.f21649g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        } finally {
            this.f21649g = null;
            if (this.f21651i) {
                this.f21651i = false;
                e();
            }
        }
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.f21648f;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f21650h;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        }
        InputStream inputStream = this.f21649g;
        int i12 = n9.h0.a;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f21650h;
        if (j10 != -1) {
            this.f21650h = j10 - read;
        }
        d(read);
        return read;
    }
}
