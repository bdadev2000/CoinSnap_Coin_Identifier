package K;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1627a;
    public final Configuration b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1628c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f1627a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f1628c = hashCode;
    }
}
