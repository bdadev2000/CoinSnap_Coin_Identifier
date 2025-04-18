package com.bytedance.sdk.openadsdk.lG.YFl;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.AlY;
import com.bytedance.sdk.component.utils.YoT;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg {
    private Bitmap AlY;
    private byte[] Sg;
    int YFl;
    private Bitmap tN;

    /* renamed from: vc, reason: collision with root package name */
    private Map<String, String> f10774vc;
    private List<Object> wN;

    public Sg(byte[] bArr, int i10) {
        this.tN = null;
        this.AlY = null;
        this.wN = null;
        this.f10774vc = null;
        this.Sg = bArr;
        this.YFl = i10;
    }

    public boolean AlY() {
        if (this.tN != null) {
            return true;
        }
        byte[] bArr = this.Sg;
        if (bArr != null && bArr.length > 0) {
            return true;
        }
        return false;
    }

    public Bitmap Sg() {
        return this.AlY;
    }

    public Bitmap YFl() {
        return this.tN;
    }

    public byte[] tN() {
        try {
            if (this.Sg == null) {
                this.Sg = AlY.YFl(this.tN);
            }
        } catch (OutOfMemoryError e2) {
            YoT.YFl("GifRequestResult", e2.getMessage());
        }
        return this.Sg;
    }

    public Sg(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.Sg = null;
        this.wN = null;
        this.f10774vc = null;
        this.AlY = bitmap2;
        this.tN = bitmap;
        this.YFl = i10;
    }
}
