package x2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2918c {

    /* renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f24219d = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with root package name */
    public final String f24220a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final List f24221c;

    public C2918c(String str, List list, String str2) {
        this.f24220a = str;
        this.b = str2;
        this.f24221c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (O2.a.b(C2918c.class)) {
            return null;
        }
        try {
            return f24219d;
        } catch (Throwable th) {
            O2.a.a(C2918c.class, th);
            return null;
        }
    }

    public final ArrayList b() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f24221c);
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final String c() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            return this.f24220a;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
