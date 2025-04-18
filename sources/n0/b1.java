package n0;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b1 {
    @Nullable
    public static String[] a(@NonNull View view) {
        return com.google.android.gms.internal.ads.b.A(view);
    }

    @Nullable
    public static g b(@NonNull View view, @NonNull g gVar) {
        ContentInfo m10 = gVar.a.m();
        Objects.requireNonNull(m10);
        ContentInfo m11 = com.google.android.gms.internal.ads.b.m(m10);
        ContentInfo l10 = com.google.android.gms.internal.ads.b.l(view, m11);
        if (l10 == null) {
            return null;
        }
        if (l10 == m11) {
            return gVar;
        }
        return new g(new v3.c(l10));
    }

    public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable a0 a0Var) {
        if (a0Var == null) {
            com.google.android.gms.internal.ads.b.w(view, strArr);
        } else {
            com.google.android.gms.internal.ads.b.x(view, strArr, new c1(a0Var));
        }
    }
}
