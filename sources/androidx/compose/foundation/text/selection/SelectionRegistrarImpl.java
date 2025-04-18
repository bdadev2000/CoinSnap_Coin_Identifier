package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import e0.s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import q0.l;
import q0.p;
import q0.r;
import q0.t;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {

    /* renamed from: m, reason: collision with root package name */
    public static final SaverKt$Saver$1 f7274m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7275a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7276b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final MutableLongObjectMap f7277c;
    public final AtomicLong d;
    public l e;

    /* renamed from: f, reason: collision with root package name */
    public r f7278f;

    /* renamed from: g, reason: collision with root package name */
    public p f7279g;

    /* renamed from: h, reason: collision with root package name */
    public t f7280h;

    /* renamed from: i, reason: collision with root package name */
    public q0.a f7281i;

    /* renamed from: j, reason: collision with root package name */
    public l f7282j;

    /* renamed from: k, reason: collision with root package name */
    public l f7283k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7284l;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    static {
        SelectionRegistrarImpl$Companion$Saver$1 selectionRegistrarImpl$Companion$Saver$1 = SelectionRegistrarImpl$Companion$Saver$1.f7285a;
        SelectionRegistrarImpl$Companion$Saver$2 selectionRegistrarImpl$Companion$Saver$2 = SelectionRegistrarImpl$Companion$Saver$2.f7286a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        f7274m = new SaverKt$Saver$1(selectionRegistrarImpl$Companion$Saver$2, selectionRegistrarImpl$Companion$Saver$1);
    }

    public SelectionRegistrarImpl(long j2) {
        ParcelableSnapshotMutableState f2;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
        this.f7277c = new MutableLongObjectMap();
        this.d = new AtomicLong(j2);
        MutableLongObjectMap mutableLongObjectMap2 = LongObjectMapKt.f1461a;
        p0.a.q(mutableLongObjectMap2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        f2 = SnapshotStateKt.f(mutableLongObjectMap2, StructuralEqualityPolicy.f14078a);
        this.f7284l = f2;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final long a() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final LongObjectMap b() {
        return (LongObjectMap) this.f7284l.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void c(long j2) {
        this.f7275a = false;
        l lVar = this.e;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        r15 = -1;
     */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.compose.foundation.text.selection.Selectable r21) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.d(androidx.compose.foundation.text.selection.Selectable):void");
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final boolean e(long j2, long j3, SelectionAdjustment selectionAdjustment, LayoutCoordinates layoutCoordinates, boolean z2) {
        t tVar = this.f7280h;
        if (tVar != null) {
            return ((Boolean) tVar.f(Boolean.valueOf(z2), layoutCoordinates, new Offset(j2), new Offset(j3), Boolean.FALSE, selectionAdjustment)).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void f(long j2) {
        l lVar = this.f7282j;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(j2));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void g(long j2, a aVar, LayoutCoordinates layoutCoordinates, boolean z2) {
        r rVar = this.f7278f;
        if (rVar != null) {
            rVar.invoke(Boolean.valueOf(z2), layoutCoordinates, new Offset(j2), aVar);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void h() {
        q0.a aVar = this.f7281i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final Selectable i(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate) {
        long j2 = multiWidgetSelectionDelegate.f7076a;
        if (j2 == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + j2).toString());
        }
        MutableLongObjectMap mutableLongObjectMap = this.f7277c;
        if (!mutableLongObjectMap.b(j2)) {
            mutableLongObjectMap.g(j2, multiWidgetSelectionDelegate);
            this.f7276b.add(multiWidgetSelectionDelegate);
            this.f7275a = false;
            return multiWidgetSelectionDelegate;
        }
        throw new IllegalArgumentException(("Another selectable with the id: " + multiWidgetSelectionDelegate + ".selectableId has already subscribed.").toString());
    }

    public final ArrayList j(LayoutCoordinates layoutCoordinates) {
        boolean z2 = this.f7275a;
        ArrayList arrayList = this.f7276b;
        if (!z2) {
            s.s0(arrayList, new b(new SelectionRegistrarImpl$sort$1(layoutCoordinates), 0));
            this.f7275a = true;
        }
        return arrayList;
    }
}
