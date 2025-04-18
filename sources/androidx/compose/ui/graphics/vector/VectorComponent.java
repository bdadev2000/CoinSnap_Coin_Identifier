package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class VectorComponent extends VNode {

    /* renamed from: b, reason: collision with root package name */
    public final GroupComponent f15390b;

    /* renamed from: c, reason: collision with root package name */
    public String f15391c;
    public boolean d;
    public final DrawCache e;

    /* renamed from: f, reason: collision with root package name */
    public a f15392f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15393g;

    /* renamed from: h, reason: collision with root package name */
    public BlendModeColorFilter f15394h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f15395i;

    /* renamed from: j, reason: collision with root package name */
    public long f15396j;

    /* renamed from: k, reason: collision with root package name */
    public float f15397k;

    /* renamed from: l, reason: collision with root package name */
    public float f15398l;

    /* renamed from: m, reason: collision with root package name */
    public final l f15399m;

    /* renamed from: androidx.compose.ui.graphics.vector.VectorComponent$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            VectorComponent vectorComponent = VectorComponent.this;
            vectorComponent.d = true;
            vectorComponent.f15392f.invoke();
            return b0.f30125a;
        }
    }

    public VectorComponent(GroupComponent groupComponent) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f15390b = groupComponent;
        groupComponent.f15291i = new AnonymousClass1();
        this.f15391c = "";
        this.d = true;
        this.e = new DrawCache();
        this.f15392f = VectorComponent$invalidateCallback$1.f15402a;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f15393g = f2;
        f3 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
        this.f15395i = f3;
        this.f15396j = 9205357640488583168L;
        this.f15397k = 1.0f;
        this.f15398l = 1.0f;
        this.f15399m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void a(DrawScope drawScope) {
        e(drawScope, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.compose.ui.graphics.drawscope.DrawScope r29, float r30, androidx.compose.ui.graphics.ColorFilter r31) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComponent.e(androidx.compose.ui.graphics.drawscope.DrawScope, float, androidx.compose.ui.graphics.ColorFilter):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f15391c);
        sb.append("\n\tviewportWidth: ");
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f15395i;
        sb.append(Size.d(((Size) parcelableSnapshotMutableState.getValue()).f14923a));
        sb.append("\n\tviewportHeight: ");
        sb.append(Size.b(((Size) parcelableSnapshotMutableState.getValue()).f14923a));
        sb.append("\n");
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
