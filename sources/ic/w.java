package ic;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19583d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19584b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19585c;

    public w(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str));
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && f19583d.matcher(str3).matches()) {
            this.a = str3;
            this.f19584b = str;
            this.f19585c = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.a.equals(wVar.a) || !this.f19584b.equals(wVar.f19584b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19584b, this.a);
    }
}
