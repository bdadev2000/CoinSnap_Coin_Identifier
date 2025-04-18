package androidx.compose.ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class ViewFactoryHolder$registerSaveStateProvider$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f17589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder viewFactoryHolder) {
        super(0);
        this.f17589a = viewFactoryHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f17589a.f17587y.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
