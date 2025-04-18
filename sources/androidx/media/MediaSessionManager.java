package androidx.media;

import android.util.Log;

/* loaded from: classes2.dex */
public final class MediaSessionManager {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20306a = 0;

    /* loaded from: classes2.dex */
    public interface MediaSessionManagerImpl {
    }

    /* loaded from: classes2.dex */
    public static final class RemoteUserInfo {

        /* renamed from: a, reason: collision with root package name */
        public RemoteUserInfoImpl f20307a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfo)) {
                return false;
            }
            return this.f20307a.equals(((RemoteUserInfo) obj).f20307a);
        }

        public final int hashCode() {
            return this.f20307a.hashCode();
        }
    }

    /* loaded from: classes2.dex */
    public interface RemoteUserInfoImpl {
    }

    static {
        Log.isLoggable("MediaSessionManager", 3);
    }
}
