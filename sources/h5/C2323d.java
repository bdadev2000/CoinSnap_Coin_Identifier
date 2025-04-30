package h5;

import java.util.NoSuchElementException;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2323d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20602a;

    public C2323d() {
        this.f20602a = null;
    }

    public final Object a() {
        Object obj = this.f20602a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        if (this.f20602a != null) {
            return true;
        }
        return false;
    }

    public C2323d(Object obj) {
        if (obj != null) {
            this.f20602a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
