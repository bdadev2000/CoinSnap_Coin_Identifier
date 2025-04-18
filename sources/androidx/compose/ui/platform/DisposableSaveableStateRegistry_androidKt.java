package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class DisposableSaveableStateRegistry_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f16476a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.f() != SnapshotStateKt.h() && snapshotMutableState.f() != SnapshotStateKt.m() && snapshotMutableState.f() != SnapshotStateKt.j()) {
                return false;
            }
            Object value = snapshotMutableState.getValue();
            if (value == null) {
                return true;
            }
            return a(value);
        }
        if ((obj instanceof d0.c) && (obj instanceof Serializable)) {
            return false;
        }
        Class[] clsArr = f16476a;
        for (int i2 = 0; i2 < 7; i2++) {
            if (clsArr[i2].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
