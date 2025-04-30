package com.bytedance.sdk.component.zp;

/* loaded from: classes.dex */
class vwr extends Exception {
    int zp;

    public vwr(int i9) {
        this.zp = i9;
    }

    public vwr(int i9, String str) {
        super(str);
        this.zp = i9;
    }
}
