package com.bytedance.sdk.component.wN.Sg;

import com.bytedance.sdk.component.wN.DSW;
import com.bytedance.sdk.component.wN.vc;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY<T> implements vc {
    private String AlY;
    private int Sg;
    Map<String, String> YFl;
    private T tN;
    private DSW wN;

    public AlY(int i10, T t5, String str) {
        this.Sg = i10;
        this.tN = t5;
        this.AlY = str;
    }

    @Override // com.bytedance.sdk.component.wN.vc
    public String AlY() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.wN.vc
    public int Sg() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.wN.vc
    public DSW YFl() {
        return this.wN;
    }

    @Override // com.bytedance.sdk.component.wN.vc
    public T tN() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.wN.vc
    public Map<String, String> wN() {
        return this.YFl;
    }

    public void YFl(DSW dsw) {
        this.wN = dsw;
    }

    public AlY(int i10, T t5, String str, Map<String, String> map) {
        this(i10, t5, str);
        this.YFl = map;
    }
}
