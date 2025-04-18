package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class CreationExtras {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f20235a = new LinkedHashMap();

    /* loaded from: classes3.dex */
    public static final class Empty extends CreationExtras {

        /* renamed from: b, reason: collision with root package name */
        public static final Empty f20236b = new CreationExtras();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public final Object a(Key key) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public interface Key<T> {
    }

    public abstract Object a(Key key);
}
