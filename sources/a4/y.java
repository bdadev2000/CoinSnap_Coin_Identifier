package a4;

import mb.k1;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public String f170b;

    /* renamed from: c, reason: collision with root package name */
    public String f171c;

    public final z a() {
        if (!"first_party".equals(this.f171c)) {
            if (this.f170b != null) {
                if (this.f171c != null) {
                    return new z(this);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    public final mb.f0 b() {
        String str;
        String str2 = this.f170b;
        if (str2 != null && (str = this.f171c) != null) {
            return new mb.f0(str2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f170b == null) {
            sb2.append(" key");
        }
        if (this.f171c == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public final k1 c() {
        String str;
        String str2 = this.f170b;
        if (str2 != null && (str = this.f171c) != null) {
            return new k1(str2, str);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f170b == null) {
            sb2.append(" rolloutId");
        }
        if (this.f171c == null) {
            sb2.append(" variantId");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return this.f170b + ", " + this.f171c;
            default:
                return super.toString();
        }
    }

    public y(int i10) {
        this.a = i10;
    }

    public /* synthetic */ y(String str, String str2, int i10) {
        this.a = i10;
        this.f170b = str;
        this.f171c = str2;
    }

    public y(JSONObject jSONObject) {
        this.a = 1;
        this.f170b = jSONObject.getString("rentalPeriod");
        String optString = jSONObject.optString("rentalExpirationPeriod");
        this.f171c = true == optString.isEmpty() ? null : optString;
    }
}
