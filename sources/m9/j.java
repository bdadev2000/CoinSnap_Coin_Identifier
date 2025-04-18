package m9;

import android.net.Uri;
import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.net.URLDecoder;
import s7.x1;

/* loaded from: classes3.dex */
public final class j extends f {

    /* renamed from: e, reason: collision with root package name */
    public p f21670e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f21671f;

    /* renamed from: g, reason: collision with root package name */
    public int f21672g;

    /* renamed from: h, reason: collision with root package name */
    public int f21673h;

    public j() {
        super(false);
    }

    @Override // m9.l
    public final long a(p pVar) {
        f();
        this.f21670e = pVar;
        Uri normalizeScheme = pVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        v8.u0.e(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = n9.h0.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f21671f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw new x1(vd.e.e("Error while parsing Base64 encoded string: ", str), e2, true, 0);
                }
            } else {
                this.f21671f = n9.h0.z(URLDecoder.decode(str, ra.f.a.name()));
            }
            byte[] bArr = this.f21671f;
            long length = bArr.length;
            long j3 = pVar.f21710f;
            if (j3 <= length) {
                int i11 = (int) j3;
                this.f21672g = i11;
                int length2 = bArr.length - i11;
                this.f21673h = length2;
                long j10 = pVar.f21711g;
                if (j10 != -1) {
                    this.f21673h = (int) Math.min(length2, j10);
                }
                g(pVar);
                if (j10 == -1) {
                    return this.f21673h;
                }
                return j10;
            }
            this.f21671f = null;
            throw new m(2008);
        }
        throw new x1("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // m9.l
    public final void close() {
        if (this.f21671f != null) {
            this.f21671f = null;
            e();
        }
        this.f21670e = null;
    }

    @Override // m9.l
    public final Uri getUri() {
        p pVar = this.f21670e;
        if (pVar != null) {
            return pVar.a;
        }
        return null;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f21673h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f21671f;
        int i13 = n9.h0.a;
        System.arraycopy(bArr2, this.f21672g, bArr, i10, min);
        this.f21672g += min;
        this.f21673h -= min;
        d(min);
        return min;
    }
}
