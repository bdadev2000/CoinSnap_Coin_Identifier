package androidx.work;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import java.util.HashSet;

@RestrictTo
/* loaded from: classes4.dex */
public final class ContentUriTriggers {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f21862a = new HashSet();

    /* loaded from: classes4.dex */
    public static final class Trigger {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f21863a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f21864b;

        public Trigger(Uri uri, boolean z2) {
            this.f21863a = uri;
            this.f21864b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Trigger.class != obj.getClass()) {
                return false;
            }
            Trigger trigger = (Trigger) obj;
            return this.f21864b == trigger.f21864b && this.f21863a.equals(trigger.f21863a);
        }

        public final int hashCode() {
            return (this.f21863a.hashCode() * 31) + (this.f21864b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContentUriTriggers.class != obj.getClass()) {
            return false;
        }
        return this.f21862a.equals(((ContentUriTriggers) obj).f21862a);
    }

    public final int hashCode() {
        return this.f21862a.hashCode();
    }
}
