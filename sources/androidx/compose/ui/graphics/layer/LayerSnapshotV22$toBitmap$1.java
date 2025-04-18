package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", l = {231}, m = "toBitmap")
/* loaded from: classes2.dex */
public final class LayerSnapshotV22$toBitmap$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public ImageReader f15243a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15244b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f15245c;
    public final /* synthetic */ LayerSnapshotV22 d;

    /* renamed from: f, reason: collision with root package name */
    public int f15246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, g gVar) {
        super(gVar);
        this.d = layerSnapshotV22;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f15245c = obj;
        this.f15246f |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
