package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

@Entity
@RestrictTo
/* loaded from: classes3.dex */
public class Preference {

    /* renamed from: a, reason: collision with root package name */
    public final String f22127a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f22128b;

    public Preference(String str, long j2) {
        this.f22127a = str;
        this.f22128b = Long.valueOf(j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.f22127a.equals(preference.f22127a)) {
            return false;
        }
        Long l2 = preference.f22128b;
        Long l3 = this.f22128b;
        return l3 != null ? l3.equals(l2) : l2 == null;
    }

    public final int hashCode() {
        int hashCode = this.f22127a.hashCode() * 31;
        Long l2 = this.f22128b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
