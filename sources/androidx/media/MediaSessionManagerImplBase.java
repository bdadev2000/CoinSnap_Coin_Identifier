package androidx.media;

import android.text.TextUtils;
import androidx.media.MediaSessionManager;
import java.util.Objects;

/* loaded from: classes3.dex */
class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {

    /* loaded from: classes3.dex */
    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {

        /* renamed from: a, reason: collision with root package name */
        public String f20309a;

        /* renamed from: b, reason: collision with root package name */
        public int f20310b;

        /* renamed from: c, reason: collision with root package name */
        public int f20311c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            return TextUtils.equals(this.f20309a, remoteUserInfoImplBase.f20309a) && this.f20310b == remoteUserInfoImplBase.f20310b && this.f20311c == remoteUserInfoImplBase.f20311c;
        }

        public final int hashCode() {
            return Objects.hash(this.f20309a, Integer.valueOf(this.f20310b), Integer.valueOf(this.f20311c));
        }
    }

    static {
        int i2 = MediaSessionManager.f20306a;
    }
}
