package androidx.core.app;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z1 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1276b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1277c;

    public z1(Context context) {
        this.f1277c = context;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1276b.iterator();
    }
}
