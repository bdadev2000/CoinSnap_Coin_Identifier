package W6;

import G7.j;
import android.content.SharedPreferences;
import androidx.lifecycle.b0;

/* loaded from: classes3.dex */
public final class f extends b0 {
    public final SharedPreferences b;

    public f(SharedPreferences sharedPreferences) {
        j.e(sharedPreferences, "preferences");
        this.b = sharedPreferences;
    }
}
