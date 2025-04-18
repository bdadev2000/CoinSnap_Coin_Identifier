package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public class LazyFieldLite {

    /* renamed from: a, reason: collision with root package name */
    public volatile MessageLite f19269a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ByteString f19270b;

    static {
        ExtensionRegistryLite.a();
    }

    public final MessageLite a(MessageLite messageLite) {
        if (this.f19269a == null) {
            synchronized (this) {
                if (this.f19269a == null) {
                    try {
                        this.f19269a = messageLite;
                        this.f19270b = ByteString.f19122b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f19269a = messageLite;
                        this.f19270b = ByteString.f19122b;
                    }
                }
            }
        }
        return this.f19269a;
    }

    public final ByteString b() {
        if (this.f19270b != null) {
            return this.f19270b;
        }
        synchronized (this) {
            try {
                if (this.f19270b != null) {
                    return this.f19270b;
                }
                if (this.f19269a == null) {
                    this.f19270b = ByteString.f19122b;
                } else {
                    this.f19270b = this.f19269a.b();
                }
                return this.f19270b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f19269a;
        MessageLite messageLite2 = lazyFieldLite.f19269a;
        return (messageLite == null && messageLite2 == null) ? b().equals(lazyFieldLite.b()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.f())) : a(messageLite2.f()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
