package v5;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f26033d = new CopyOnWriteArraySet();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26034b;

    /* renamed from: c, reason: collision with root package name */
    public final List f26035c;

    public c(String str, List list, String str2) {
        this.a = str;
        this.f26034b = str2;
        this.f26035c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (m6.a.b(c.class)) {
            return null;
        }
        try {
            return f26033d;
        } catch (Throwable th2) {
            m6.a.a(c.class, th2);
            return null;
        }
    }

    public final String b() {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
