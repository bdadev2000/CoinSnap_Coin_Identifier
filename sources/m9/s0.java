package m9;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class s0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f21730e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21731f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f21732g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f21733h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f21734i;

    /* renamed from: j, reason: collision with root package name */
    public long f21735j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21736k;

    public s0(Context context) {
        super(false);
        this.f21730e = context.getResources();
        this.f21731f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r3.matches("\\d+") != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    @Override // m9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(m9.p r17) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.s0.a(m9.p):long");
    }

    @Override // m9.l
    public final void close() {
        this.f21732g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f21734i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f21734i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21733h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new r0(null, e2, 2000);
                    }
                } finally {
                    this.f21733h = null;
                    if (this.f21736k) {
                        this.f21736k = false;
                        e();
                    }
                }
            } catch (Throwable th2) {
                this.f21734i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f21733h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f21733h = null;
                        if (this.f21736k) {
                            this.f21736k = false;
                            e();
                        }
                        throw th2;
                    } finally {
                        this.f21733h = null;
                        if (this.f21736k) {
                            this.f21736k = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new r0(null, e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new r0(null, e11, 2000);
        }
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.f21732g;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f21735j;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new r0(null, e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f21734i;
        int i12 = n9.h0.a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f21735j == -1) {
                return -1;
            }
            throw new r0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j10 = this.f21735j;
        if (j10 != -1) {
            this.f21735j = j10 - read;
        }
        d(read);
        return read;
    }
}
