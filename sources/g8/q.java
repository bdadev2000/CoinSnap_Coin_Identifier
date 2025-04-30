package g8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import u7.AbstractC2816g;
import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class q extends o {

    /* renamed from: j, reason: collision with root package name */
    public final f8.v f20522j;

    /* renamed from: k, reason: collision with root package name */
    public final List f20523k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f8.b bVar, f8.v vVar) {
        super(bVar, vVar, null, null);
        G7.j.e(bVar, "json");
        G7.j.e(vVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f20522j = vVar;
        List T2 = AbstractC2816g.T(vVar.b.keySet());
        this.f20523k = T2;
        this.l = T2.size() * 2;
        this.m = -1;
    }

    @Override // g8.o, g8.a
    public final f8.j G(String str) {
        G7.j.e(str, "tag");
        if (this.m % 2 == 0) {
            return C2.m.b(str);
        }
        return (f8.j) AbstractC2829t.W(this.f20522j, str);
    }

    @Override // g8.o, g8.a
    public final String Q(c8.g gVar, int i9) {
        G7.j.e(gVar, CampaignEx.JSON_KEY_DESC);
        return (String) this.f20523k.get(i9 / 2);
    }

    @Override // g8.o, g8.a
    public final f8.j T() {
        return this.f20522j;
    }

    @Override // g8.o
    /* renamed from: W */
    public final f8.v T() {
        return this.f20522j;
    }

    @Override // g8.o, g8.a, d8.a
    public final void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
    }

    @Override // g8.o, d8.a
    public final int h(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        int i9 = this.m;
        if (i9 < this.l - 1) {
            int i10 = i9 + 1;
            this.m = i10;
            return i10;
        }
        return -1;
    }
}
