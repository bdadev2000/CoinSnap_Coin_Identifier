package com.bytedance.adsdk.Sg;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class YoT<V> {
    private final Throwable Sg;
    private final V YFl;

    public YoT(V v10) {
        this.YFl = v10;
        this.Sg = null;
    }

    public Throwable Sg() {
        return this.Sg;
    }

    public V YFl() {
        return this.YFl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YoT)) {
            return false;
        }
        YoT yoT = (YoT) obj;
        if (YFl() != null && YFl().equals(yoT.YFl())) {
            return true;
        }
        if (Sg() == null || yoT.Sg() == null) {
            return false;
        }
        return Sg().toString().equals(Sg().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{YFl(), Sg()});
    }

    public YoT(Throwable th2) {
        this.Sg = th2;
        this.YFl = null;
    }
}
