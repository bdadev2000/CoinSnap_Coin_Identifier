package com.glority.android.picturexx.definition;

import kotlin.Metadata;

/* compiled from: MainTabSelector.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/definition/HomeTab;", "Lcom/glority/android/picturexx/definition/MainTabSelector;", "<init>", "()V", "index", "", "getIndex", "()I", "equals", "", "other", "", "hashCode", "toString", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final /* data */ class HomeTab implements MainTabSelector {
    public static final int $stable = 0;
    public static final HomeTab INSTANCE = new HomeTab();

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTab)) {
            return false;
        }
        return true;
    }

    @Override // com.glority.android.picturexx.definition.MainTabSelector
    public int getIndex() {
        return 0;
    }

    public int hashCode() {
        return -1113712353;
    }

    public String toString() {
        return "HomeTab";
    }

    private HomeTab() {
    }
}
