package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import db.a;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;

@Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/remoteconfig/ktx/FirebaseRemoteConfigKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Ldb/a;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-config"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return CollectionsKt.emptyList();
    }
}
