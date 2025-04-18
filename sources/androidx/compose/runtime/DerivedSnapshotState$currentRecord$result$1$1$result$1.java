package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.StateObject;
import com.google.android.gms.common.api.Api;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DerivedSnapshotState$currentRecord$result$1$1$result$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DerivedSnapshotState f13790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntRef f13791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f13792c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$1$result$1(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i2) {
        super(1);
        this.f13790a = derivedSnapshotState;
        this.f13791b = intRef;
        this.f13792c = mutableObjectIntMap;
        this.d = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (obj == this.f13790a) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (obj instanceof StateObject) {
            int i2 = this.f13791b.f14483a - this.d;
            MutableObjectIntMap mutableObjectIntMap = this.f13792c;
            int a2 = mutableObjectIntMap.a(obj);
            mutableObjectIntMap.g(obj, Math.min(i2, a2 >= 0 ? mutableObjectIntMap.f1547c[a2] : Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        return b0.f30125a;
    }
}
