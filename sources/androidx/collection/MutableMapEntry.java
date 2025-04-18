package androidx.collection;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import p0.a;
import r0.d;

/* loaded from: classes.dex */
final class MutableMapEntry<K, V> implements Map.Entry<K, V>, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1476a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1477b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1478c;

    public MutableMapEntry(int i2, Object[] objArr, Object[] objArr2) {
        a.s(objArr, UserMetadata.KEYDATA_FILENAME);
        a.s(objArr2, "values");
        this.f1476a = objArr;
        this.f1477b = objArr2;
        this.f1478c = i2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1476a[this.f1478c];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1477b[this.f1478c];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f1477b;
        int i2 = this.f1478c;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
