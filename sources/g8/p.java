package g8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class p extends a {

    /* renamed from: e, reason: collision with root package name */
    public final f8.c f20519e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20520f;

    /* renamed from: g, reason: collision with root package name */
    public int f20521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f8.b bVar, f8.c cVar) {
        super(bVar);
        G7.j.e(bVar, "json");
        G7.j.e(cVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f20519e = cVar;
        this.f20520f = cVar.b.size();
        this.f20521g = -1;
    }

    @Override // g8.a
    public final f8.j G(String str) {
        G7.j.e(str, "tag");
        return (f8.j) this.f20519e.b.get(Integer.parseInt(str));
    }

    @Override // g8.a
    public final String Q(c8.g gVar, int i9) {
        G7.j.e(gVar, CampaignEx.JSON_KEY_DESC);
        return String.valueOf(i9);
    }

    @Override // g8.a
    public final f8.j T() {
        return this.f20519e;
    }

    @Override // d8.a
    public final int h(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        int i9 = this.f20521g;
        if (i9 < this.f20520f - 1) {
            int i10 = i9 + 1;
            this.f20521g = i10;
            return i10;
        }
        return -1;
    }
}
