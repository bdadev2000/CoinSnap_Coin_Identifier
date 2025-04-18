package org.koin.androidx.viewmodel.parameter;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;
import q0.a;
import x0.c;

/* loaded from: classes2.dex */
public final class AndroidParametersHolder extends ParametersHolder {

    @NotNull
    private final CreationExtras extras;

    public /* synthetic */ AndroidParametersHolder(a aVar, CreationExtras creationExtras, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : aVar, creationExtras);
    }

    private final <T> T createSavedStateHandleOrElse(c cVar, a aVar) {
        return p0.a.g(cVar, g0.a(SavedStateHandle.class)) ? (T) SavedStateHandleSupport.a(this.extras) : (T) aVar.invoke();
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T elementAt(int i2, @NotNull c cVar) {
        p0.a.s(cVar, "clazz");
        return (T) createSavedStateHandleOrElse(cVar, new AndroidParametersHolder$elementAt$1(this, i2, cVar));
    }

    @NotNull
    public final CreationExtras getExtras() {
        return this.extras;
    }

    @Override // org.koin.core.parameter.ParametersHolder
    @Nullable
    public <T> T getOrNull(@NotNull c cVar) {
        p0.a.s(cVar, "clazz");
        return (T) createSavedStateHandleOrElse(cVar, new AndroidParametersHolder$getOrNull$1(this, cVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidParametersHolder(@org.jetbrains.annotations.Nullable q0.a r3, @org.jetbrains.annotations.NotNull androidx.lifecycle.viewmodel.CreationExtras r4) {
        /*
            r2 = this;
            java.lang.String r0 = "extras"
            p0.a.s(r4, r0)
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r3.invoke()
            org.koin.core.parameter.ParametersHolder r3 = (org.koin.core.parameter.ParametersHolder) r3
            if (r3 == 0) goto L1c
            java.util.List r3 = r3.getValues()
            if (r3 == 0) goto L1c
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.ArrayList r3 = e0.u.b1(r3)
            goto L21
        L1c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L21:
            r0 = 2
            r1 = 0
            r2.<init>(r3, r1, r0, r1)
            r2.extras = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.androidx.viewmodel.parameter.AndroidParametersHolder.<init>(q0.a, androidx.lifecycle.viewmodel.CreationExtras):void");
    }
}
