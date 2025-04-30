package B0;

import G7.j;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f253a = MobileAds.ERROR_DOMAIN;
    public final boolean b;

    public a(boolean z8) {
        this.b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f253a, aVar.f253a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f253a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f253a + ", shouldRecordObservation=" + this.b;
    }
}
