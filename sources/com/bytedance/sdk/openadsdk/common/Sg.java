package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Wwa;

/* loaded from: classes.dex */
public class Sg extends eT {
    public Sg(@NonNull Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.common.eT
    public void YFl() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.Sg.1
            @Override // java.lang.Runnable
            public void run() {
                Sg sg2 = Sg.this;
                if (sg2.YFl != null) {
                    sg2.setVisibility(0);
                }
            }
        });
    }

    public void YFl(Wwa wwa, String str, int i10, String str2, long j3, boolean z10, int i11, long j10) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.AlY.tN.YFl(wwa, str, i10, str2, SystemClock.elapsedRealtime() - j3, z10, i11, j10);
            super.Sg();
        }
    }
}
