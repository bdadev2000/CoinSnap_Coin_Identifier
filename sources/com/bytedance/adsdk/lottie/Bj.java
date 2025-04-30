package com.bytedance.adsdk.lottie;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Bj<V> {
    private final Throwable lMd;
    private final V zp;

    public Bj(V v6) {
        this.zp = v6;
        this.lMd = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bj)) {
            return false;
        }
        Bj bj = (Bj) obj;
        if (zp() != null && zp().equals(bj.zp())) {
            return true;
        }
        if (lMd() == null || bj.lMd() == null) {
            return false;
        }
        return lMd().toString().equals(lMd().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{zp(), lMd()});
    }

    public Throwable lMd() {
        return this.lMd;
    }

    public V zp() {
        return this.zp;
    }

    public Bj(Throwable th) {
        this.lMd = th;
        this.zp = null;
    }
}
