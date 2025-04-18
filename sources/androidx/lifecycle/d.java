package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SavedStateHandle f20234b;

    public /* synthetic */ d(SavedStateHandle savedStateHandle, int i2) {
        this.f20233a = i2;
        this.f20234b = savedStateHandle;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        int i2 = this.f20233a;
        SavedStateHandle savedStateHandle = this.f20234b;
        switch (i2) {
            case 0:
                return SavedStateHandle.a(savedStateHandle);
            default:
                return SavedStateHandle.a(savedStateHandle);
        }
    }
}
