package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class Wwa implements zG<Integer> {
    public static final Wwa YFl = new Wwa();

    private Wwa() {
    }

    @Override // com.bytedance.adsdk.Sg.wN.zG
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public Integer Sg(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(qO.Sg(jsonReader) * f10));
    }
}
