package db;

import androidx.fragment.app.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class k extends z {

    /* renamed from: b, reason: collision with root package name */
    public final List f16958b;

    public k(ArrayList arrayList) {
        super("Dependency cycle detected: " + Arrays.toString(arrayList.toArray()));
        this.f16958b = arrayList;
    }
}
