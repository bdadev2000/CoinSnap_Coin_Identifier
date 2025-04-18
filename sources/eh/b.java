package eh;

import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import jb.j;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, b> filePreferenceMap = new ConcurrentHashMap<>();

    public /* synthetic */ b(Executor executor, x xVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, xVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m131apply$lambda0(b this$0, Serializable serializable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(serializable, "$serializable");
        n.writeSerializable(this$0.file, serializable);
    }

    @JvmStatic
    public static final synchronized b get(Executor executor, x xVar, String str) {
        b bVar;
        synchronized (b.class) {
            bVar = Companion.get(executor, xVar, str);
        }
        return bVar;
    }

    public final void apply() {
        this.ioExecutor.execute(new j(14, this, new HashMap(this.values)));
    }

    public final boolean getBoolean(String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final int getInt(String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i10;
    }

    public final long getLong(String key, long j3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return j3;
    }

    public final String getString(String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        if (obj instanceof HashSet) {
            return i.getNewHashSet((HashSet) obj);
        }
        return defaultValue;
    }

    public final b put(String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    public final b remove(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private b(Executor executor, x xVar, String str) {
        this.ioExecutor = executor;
        File file = new File(xVar.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object readSerializable = n.readSerializable(file);
        if (readSerializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) readSerializable);
        }
    }

    public final b put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final b put(String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Integer.valueOf(i10));
        return this;
    }

    public final b put(String key, HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, i.getNewHashSet(hashSet));
        return this;
    }

    public final b put(String key, long j3) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.values.put(key, Long.valueOf(j3));
        return this;
    }

    public /* synthetic */ b(Executor executor, x xVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, xVar, (i10 & 4) != 0 ? FILENAME : str);
    }
}
