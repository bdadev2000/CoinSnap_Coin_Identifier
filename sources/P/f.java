package P;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class f {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(@NonNull Configuration configuration, @NonNull l lVar) {
        configuration.setLocales(lVar.f2264a.f2265a);
    }
}
