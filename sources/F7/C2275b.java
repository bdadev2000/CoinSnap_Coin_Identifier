package f7;

import G7.f;
import G7.j;
import com.facebook.appevents.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.x;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: f7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275b {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "failedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final C2274a Companion = new C2274a(null);
    private static final ConcurrentHashMap<String, C2275b> filePreferenceMap = new ConcurrentHashMap<>();

    public /* synthetic */ C2275b(Executor executor, x xVar, String str, f fVar) {
        this(executor, xVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m122apply$lambda0(C2275b c2275b, Serializable serializable) {
        j.e(c2275b, "this$0");
        j.e(serializable, "$serializable");
        n.writeSerializable(c2275b.file, serializable);
    }

    public static final synchronized C2275b get(Executor executor, x xVar, String str) {
        C2275b c2275b;
        synchronized (C2275b.class) {
            c2275b = Companion.get(executor, xVar, str);
        }
        return c2275b;
    }

    public final void apply() {
        this.ioExecutor.execute(new k(11, this, new HashMap(this.values)));
    }

    public final boolean getBoolean(String str, boolean z8) {
        j.e(str, "key");
        Object obj = this.values.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z8;
    }

    public final int getInt(String str, int i9) {
        j.e(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i9;
    }

    public final long getLong(String str, long j7) {
        j.e(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return j7;
    }

    public final String getString(String str, String str2) {
        j.e(str, "key");
        j.e(str2, "defaultValue");
        Object obj = this.values.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public final HashSet<String> getStringSet(String str, HashSet<String> hashSet) {
        j.e(str, "key");
        j.e(hashSet, "defaultValue");
        Object obj = this.values.get(str);
        if (obj instanceof HashSet) {
            return i.getNewHashSet((HashSet) obj);
        }
        return hashSet;
    }

    public final C2275b put(String str, boolean z8) {
        j.e(str, "key");
        this.values.put(str, Boolean.valueOf(z8));
        return this;
    }

    public final C2275b remove(String str) {
        j.e(str, "key");
        if (this.values.containsKey(str)) {
            this.values.remove(str);
        }
        return this;
    }

    private C2275b(Executor executor, x xVar, String str) {
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

    public final C2275b put(String str, String str2) {
        j.e(str, "key");
        j.e(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.values.put(str, str2);
        return this;
    }

    public final Boolean getBoolean(String str) {
        j.e(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String str) {
        j.e(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final C2275b put(String str, int i9) {
        j.e(str, "key");
        this.values.put(str, Integer.valueOf(i9));
        return this;
    }

    public final C2275b put(String str, HashSet<String> hashSet) {
        j.e(str, "key");
        this.values.put(str, i.getNewHashSet(hashSet));
        return this;
    }

    public final C2275b put(String str, long j7) {
        j.e(str, "key");
        this.values.put(str, Long.valueOf(j7));
        return this;
    }

    public /* synthetic */ C2275b(Executor executor, x xVar, String str, int i9, f fVar) {
        this(executor, xVar, (i9 & 4) != 0 ? FILENAME : str);
    }
}
