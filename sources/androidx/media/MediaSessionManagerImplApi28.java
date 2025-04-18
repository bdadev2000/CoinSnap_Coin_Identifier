package androidx.media;

import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.media.MediaSessionManager;
import java.util.Objects;

@RequiresApi
/* loaded from: classes4.dex */
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {

    /* loaded from: classes4.dex */
    public static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSessionManager.RemoteUserInfo f20308a;

        public RemoteUserInfoImplApi28(String str, int i2) {
            this.f20308a = a.f(str, i2);
        }

        public final boolean equals(Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplApi28)) {
                return false;
            }
            equals = this.f20308a.equals(((RemoteUserInfoImplApi28) obj).f20308a);
            return equals;
        }

        public final int hashCode() {
            return Objects.hash(this.f20308a);
        }
    }
}
