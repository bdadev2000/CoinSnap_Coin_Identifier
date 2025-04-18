package com.bytedance.sdk.component.wN.tN.YFl.Sg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.wN.Wwa;

/* loaded from: classes.dex */
public class Sg implements Wwa {
    private int Sg;
    private int YFl;
    private com.bytedance.sdk.component.wN.tN.YFl.tN<String, Bitmap> tN;

    public Sg(int i10, int i11) {
        this.Sg = i10;
        this.YFl = i11;
        this.tN = new com.bytedance.sdk.component.wN.tN.YFl.tN<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.wN.tN.YFl.Sg.Sg.1
            @Override // com.bytedance.sdk.component.wN.tN.YFl.tN
            /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
            public int Sg(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return Sg.YFl(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean Sg(String str) {
        return this.tN.YFl((com.bytedance.sdk.component.wN.tN.YFl.tN<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public boolean YFl(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.tN.YFl(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.wN.YFl
    public Bitmap YFl(String str) {
        return this.tN.YFl((com.bytedance.sdk.component.wN.tN.YFl.tN<String, Bitmap>) str);
    }

    public static int YFl(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
