package androidx.compose.ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;

@StabilityInferred
/* loaded from: classes.dex */
public final class WindowInfoImpl implements WindowInfo {

    /* renamed from: b, reason: collision with root package name */
    public static final ParcelableSnapshotMutableState f16645b;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16646a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(new PointerKeyboardModifiers(0), StructuralEqualityPolicy.f14078a);
        f16645b = f2;
    }

    public WindowInfoImpl() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f16646a = f2;
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    public final boolean a() {
        return ((Boolean) this.f16646a.getValue()).booleanValue();
    }
}
