package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import b1.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Recomposer$runFrameLoop$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f13930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f13931c;
    public final /* synthetic */ ProduceFrameSignal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.f13929a = recomposer;
        this.f13930b = list;
        this.f13931c = list2;
        this.d = produceFrameSignal;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean D;
        int i2;
        k C;
        long longValue = ((Number) obj).longValue();
        Recomposer recomposer = this.f13929a;
        synchronized (recomposer.f13878b) {
            D = recomposer.D();
        }
        if (D) {
            Recomposer recomposer2 = this.f13929a;
            android.os.Trace.beginSection("Recomposer:animation");
            try {
                recomposer2.f13877a.b(longValue);
                Snapshot.Companion.g();
            } finally {
            }
        }
        Recomposer recomposer3 = this.f13929a;
        List list = this.f13930b;
        List list2 = this.f13931c;
        ProduceFrameSignal produceFrameSignal = this.d;
        android.os.Trace.beginSection("Recomposer:recompose");
        try {
            Recomposer.y(recomposer3);
            synchronized (recomposer3.f13878b) {
                try {
                    ArrayList arrayList = recomposer3.f13883i;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        list2.add((ControlledComposition) arrayList.get(i3));
                    }
                    recomposer3.f13883i.clear();
                    MutableVector mutableVector = recomposer3.f13882h;
                    int i4 = mutableVector.f14144c;
                    if (i4 > 0) {
                        Object[] objArr = mutableVector.f14142a;
                        int i5 = 0;
                        do {
                            list.add((ControlledComposition) objArr[i5]);
                            i5++;
                        } while (i5 < i4);
                    }
                    recomposer3.f13882h.g();
                    if (!(produceFrameSignal.f13856a == RecomposerKt.f13963b)) {
                        PreconditionsKt.b("frame not pending");
                        throw null;
                    }
                    produceFrameSignal.f13856a = null;
                } finally {
                }
            }
            MutableScatterSet mutableScatterSet = new MutableScatterSet();
            try {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ControlledComposition x = Recomposer.x(recomposer3, (ControlledComposition) list.get(i6), mutableScatterSet);
                    if (x != null) {
                        list2.add(x);
                    }
                }
                list.clear();
                list2.isEmpty();
                try {
                    int size3 = list2.size();
                    for (i2 = 0; i2 < size3; i2++) {
                        ((ControlledComposition) list2.get(i2)).n();
                    }
                    list2.clear();
                    synchronized (recomposer3.f13878b) {
                        C = recomposer3.C();
                    }
                    return C;
                } catch (Throwable th) {
                    list2.clear();
                    throw th;
                }
            } catch (Throwable th2) {
                list.clear();
                throw th2;
            }
        } finally {
        }
    }
}
