package c7;

import a.AbstractC0325a;
import android.util.Base64;
import e8.C2228c;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public final class I {
    public static final G Companion = new G(null);
    private final C0665z ad;
    private final String adunit;
    private final List<String> impression;
    private final f8.b json;
    private final Integer version;

    public I() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ I copy$default(I i9, Integer num, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = i9.version;
        }
        if ((i10 & 2) != 0) {
            str = i9.adunit;
        }
        if ((i10 & 4) != 0) {
            list = i9.impression;
        }
        return i9.copy(num, str, list);
    }

    private final String gzipDecode(byte[] bArr) throws Throwable {
        StringBuilder sb = new StringBuilder();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 32);
            try {
                byte[] bArr2 = new byte[32];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read != -1) {
                        sb.append(new String(bArr2, 0, read, O7.a.f2244a));
                    } else {
                        android.support.v4.media.session.a.f(gZIPInputStream, null);
                        android.support.v4.media.session.a.f(byteArrayInputStream, null);
                        String sb2 = sb.toString();
                        G7.j.d(sb2, "result.toString()");
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    android.support.v4.media.session.a.f(gZIPInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                android.support.v4.media.session.a.f(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final void write$Self(I i9, d8.b bVar, c8.g gVar) {
        String decodedAdsResponse;
        G7.j.e(i9, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || i9.version != null) {
            bVar.u(gVar, 0, e8.K.f20127a, i9.version);
        }
        if (bVar.o(gVar) || i9.adunit != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, i9.adunit);
        }
        if (bVar.o(gVar) || i9.impression != null) {
            bVar.u(gVar, 2, new C2228c(e8.k0.f20172a, 0), i9.impression);
        }
        if (!bVar.o(gVar)) {
            C0665z c0665z = i9.ad;
            C0665z c0665z2 = null;
            if (i9.adunit != null && (decodedAdsResponse = i9.getDecodedAdsResponse()) != null) {
                f8.b bVar2 = i9.json;
                c0665z2 = (C0665z) bVar2.a(AbstractC0325a.q(bVar2.b, G7.s.b(C0665z.class)), decodedAdsResponse);
            }
            if (G7.j.a(c0665z, c0665z2)) {
                return;
            }
        }
        bVar.u(gVar, 3, C0622d.INSTANCE, i9.ad);
    }

    public final Integer component1() {
        return this.version;
    }

    public final String component2() {
        return this.adunit;
    }

    public final List<String> component3() {
        return this.impression;
    }

    public final I copy(Integer num, String str, List<String> list) {
        return new I(num, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i9 = (I) obj;
        if (G7.j.a(this.version, i9.version) && G7.j.a(this.adunit, i9.adunit) && G7.j.a(this.impression, i9.impression)) {
            return true;
        }
        return false;
    }

    public final C0665z getAdPayload() {
        return this.ad;
    }

    public final String getAdunit() {
        return this.adunit;
    }

    public final String getDecodedAdsResponse() throws Throwable {
        byte[] decode = Base64.decode(this.adunit, 0);
        if (decode != null) {
            return gzipDecode(decode);
        }
        return null;
    }

    public final String getEventId() {
        C0665z c0665z = this.ad;
        if (c0665z != null) {
            return c0665z.eventId();
        }
        return null;
    }

    public final List<String> getImpression() {
        return this.impression;
    }

    public final String getPlacementId() {
        C0665z c0665z = this.ad;
        if (c0665z != null) {
            return c0665z.placementId();
        }
        return null;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.version;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.adunit;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        List<String> list = this.impression;
        if (list != null) {
            i9 = list.hashCode();
        }
        return i11 + i9;
    }

    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    public I(int i9, Integer num, String str, List list, C0665z c0665z, e8.g0 g0Var) {
        String decodedAdsResponse;
        C0665z c0665z2 = null;
        if ((i9 & 1) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i9 & 2) == 0) {
            this.adunit = null;
        } else {
            this.adunit = str;
        }
        if ((i9 & 4) == 0) {
            this.impression = null;
        } else {
            this.impression = list;
        }
        f8.p a6 = R2.b.a(F.INSTANCE);
        this.json = a6;
        if ((i9 & 8) != 0) {
            this.ad = c0665z;
            return;
        }
        if (this.adunit != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c0665z2 = (C0665z) a6.a(AbstractC0325a.q(a6.b, G7.s.b(C0665z.class)), decodedAdsResponse);
        }
        this.ad = c0665z2;
    }

    public I(Integer num, String str, List<String> list) {
        String decodedAdsResponse;
        this.version = num;
        this.adunit = str;
        this.impression = list;
        f8.p a6 = R2.b.a(H.INSTANCE);
        this.json = a6;
        C0665z c0665z = null;
        if (str != null && (decodedAdsResponse = getDecodedAdsResponse()) != null) {
            c0665z = (C0665z) a6.a(AbstractC0325a.q(a6.b, G7.s.b(C0665z.class)), decodedAdsResponse);
        }
        this.ad = c0665z;
    }

    public /* synthetic */ I(Integer num, String str, List list, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : num, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : list);
    }

    private static /* synthetic */ void getJson$annotations() {
    }
}
