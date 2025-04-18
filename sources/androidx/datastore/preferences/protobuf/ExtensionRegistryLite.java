package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class ExtensionRegistryLite {

    /* renamed from: b, reason: collision with root package name */
    public static volatile ExtensionRegistryLite f19177b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExtensionRegistryLite f19178c;

    /* renamed from: a, reason: collision with root package name */
    public final Map f19179a = Collections.emptyMap();

    /* loaded from: classes3.dex */
    public static final class ObjectIntPair {

        /* renamed from: a, reason: collision with root package name */
        public final Object f19180a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19181b;

        public ObjectIntPair(Object obj, int i2) {
            this.f19180a = obj;
            this.f19181b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f19180a == objectIntPair.f19180a && this.f19181b == objectIntPair.f19181b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f19180a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f19181b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f19178c = new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLite = f19177b;
        if (extensionRegistryLite == null) {
            synchronized (ExtensionRegistryLite.class) {
                try {
                    extensionRegistryLite = f19177b;
                    if (extensionRegistryLite == null) {
                        Class cls = ExtensionRegistryFactory.f19176a;
                        if (cls != null) {
                            try {
                                extensionRegistryLite = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                            f19177b = extensionRegistryLite;
                        }
                        extensionRegistryLite = f19178c;
                        f19177b = extensionRegistryLite;
                    }
                } finally {
                }
            }
        }
        return extensionRegistryLite;
    }
}
