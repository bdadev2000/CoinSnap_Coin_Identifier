package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

@Entity
@RestrictTo
/* loaded from: classes.dex */
public class SystemIdInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f22131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22132b;

    public SystemIdInfo(String str, int i2) {
        this.f22131a = str;
        this.f22132b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (this.f22132b != systemIdInfo.f22132b) {
            return false;
        }
        return this.f22131a.equals(systemIdInfo.f22131a);
    }

    public final int hashCode() {
        return (this.f22131a.hashCode() * 31) + this.f22132b;
    }
}
