package f0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {
    public final ColorStateList a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f17526b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17527c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.a = colorStateList;
        this.f17526b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f17527c = hashCode;
    }
}
