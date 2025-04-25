package com.glority.android.namecard.base.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PopularCultivarName.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/namecard/base/entity/PopularCultivarName;", "", "preferredName", "", "latinName", "(Ljava/lang/String;Ljava/lang/String;)V", "getLatinName", "()Ljava/lang/String;", "getPreferredName", "isLatinName", "", "name", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class PopularCultivarName {
    private final String latinName;
    private final String preferredName;

    public PopularCultivarName(String str, String str2) {
        this.preferredName = str;
        this.latinName = str2;
    }

    public final String getLatinName() {
        return this.latinName;
    }

    public final String getPreferredName() {
        return this.preferredName;
    }

    public final boolean isLatinName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.areEqual(name, this.latinName);
    }
}
