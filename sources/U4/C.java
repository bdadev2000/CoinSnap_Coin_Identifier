package U4;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3248d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f3249a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3250c;

    public C(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f3248d.matcher(str3).matches()) {
            this.f3249a = str3;
            this.b = str;
            this.f3250c = com.mbridge.msdk.foundation.entity.o.k(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        if (!this.f3249a.equals(c9.f3249a) || !this.b.equals(c9.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.f3249a);
    }
}
