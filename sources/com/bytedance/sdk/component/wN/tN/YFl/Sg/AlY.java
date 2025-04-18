package com.bytedance.sdk.component.wN.tN.YFl.Sg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.wN.Wwa;

/* loaded from: classes.dex */
public class AlY implements Wwa {
    private final com.bytedance.sdk.component.wN.tN.YFl.Sg Sg;
    private final Wwa YFl;

    public AlY(Wwa wwa) {
        this(wwa, null);
    }

    public AlY(Wwa wwa, com.bytedance.sdk.component.wN.tN.YFl.Sg sg2) {
        this.YFl = wwa;
        this.Sg = sg2;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean Sg(String str) {
        return this.YFl.Sg(str);
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean YFl(String str, Bitmap bitmap) {
        return this.YFl.YFl(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public Bitmap YFl(String str) {
        return this.YFl.YFl(str);
    }
}
