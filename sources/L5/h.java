package l5;

import Q7.n0;
import U4.RunnableC0311g;
import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f21608e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f21609f;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f21610a = new HashSet();
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final C2451c f21611c;

    /* renamed from: d, reason: collision with root package name */
    public final C2451c f21612d;

    static {
        Charset.forName("UTF-8");
        f21608e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f21609f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, C2451c c2451c, C2451c c2451c2) {
        this.b = executor;
        this.f21611c = c2451c;
        this.f21612d = c2451c2;
    }

    public static HashSet b(C2451c c2451c) {
        HashSet hashSet = new HashSet();
        d c9 = c2451c.c();
        if (c9 == null) {
            return hashSet;
        }
        Iterator<String> keys = c9.b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public static String c(C2451c c2451c, String str) {
        d c9 = c2451c.c();
        if (c9 == null) {
            return null;
        }
        try {
            return c9.b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void d(String str, String str2) {
        Log.w("FirebaseRemoteConfig", n0.j("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, d dVar) {
        if (dVar == null) {
            return;
        }
        synchronized (this.f21610a) {
            try {
                Iterator it = this.f21610a.iterator();
                while (it.hasNext()) {
                    this.b.execute(new RunnableC0311g((BiConsumer) it.next(), str, dVar, 22));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
