package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import d0.m;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import p0.a;

/* loaded from: classes4.dex */
public final class BundleExtKt {
    @KoinInternalApi
    @Nullable
    public static final CreationExtras toExtras(@NotNull Bundle bundle, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Object obj;
        a.s(bundle, "<this>");
        a.s(viewModelStoreOwner, "viewModelStoreOwner");
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
            LinkedHashMap linkedHashMap = mutableCreationExtras.f20235a;
            linkedHashMap.put(SavedStateHandleSupport.f20100c, bundle);
            linkedHashMap.put(SavedStateHandleSupport.f20099b, viewModelStoreOwner);
            linkedHashMap.put(SavedStateHandleSupport.f20098a, (SavedStateRegistryOwner) viewModelStoreOwner);
            obj = mutableCreationExtras;
        } catch (Throwable th) {
            obj = q.d(th);
        }
        return (CreationExtras) (obj instanceof m ? null : obj);
    }
}
