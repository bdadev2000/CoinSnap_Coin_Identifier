package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;

@Entity
@RestrictTo
/* loaded from: classes4.dex */
public class Dependency {

    /* renamed from: a, reason: collision with root package name */
    public final String f22123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22124b;

    public Dependency(String str, String str2) {
        this.f22123a = str;
        this.f22124b = str2;
    }
}
